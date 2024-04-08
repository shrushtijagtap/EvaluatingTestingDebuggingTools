import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', '#', '4', 'a', '4', '4', 'a', ' ', ' ', '#', '#', '#', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 0, (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-00" + "'", str3, "0000-01-00");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("\000\000\000\000\000\000\000\000\000\000\00013:08:55");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: ???????????13:08:55");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId18);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId18);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId18, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId18);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId18);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId36);
        java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId36);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId36);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 14:00:00" + "'", str11, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50400000L) + "'", long21 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 135235494809000L + "'", long29 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 14:00:00" + "'", str31, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50400000L) + "'", long39 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 00:00:00" + "'", str42, "1970-01-01 00:00:00");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 3407907);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2293857);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.format(date28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date28);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId36);
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId36);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date28, zoneId36);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId36);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId36);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101", zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime45 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 6357044, zoneId36);
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 00:00:00" + "'", str30, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 00:00:00" + "'", str31, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-28800000L) + "'", long39 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 14:00:00" + "'", str42, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Dec 31 10:00:00 CST 1969");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.time.ZoneId zoneId1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 1, 2097249);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('4', '#', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        byte[] byteArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 28800, 29143);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "19700101");
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray7, (int) (byte) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray7, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray7, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray7, (int) '4');
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray7, 2097204);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray7, (int) (byte) -1);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date27);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.format(date27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.toString(date27);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId34);
        java.util.Date date36 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27, zoneId34);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId34);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-60928207130L), zoneId34);
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 3407969, (int) (short) 0, zoneId34);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId34);
        java.util.Date date42 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006-03-02", zoneId34);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 00:00:00" + "'", str30, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 14:00:00" + "'", str37, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-50401000L) + "'", long38 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1968-01-27" + "'", str39, "1968-01-27");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-100772000L) + "'", long41 == (-100772000L));
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Mar 01 10:00:00 CST 2006");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 09:45:57.024+08:00", 29143);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 14:00:00" + "'", str2, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4 ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1969-12-31 00:00:00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 14:00:00" + "'", str3, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-02 04:00:00" + "'", str7, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 00:00:00" + "'", str10, "1969-12-31 00:00:00");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2293812);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("19680126", 2293857);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407907, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 10, zoneId36);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19700101" + "'", str42, "19700101");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 2293795);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray3, 6357089, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357020");
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
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407907");
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, (int) (byte) 100, 0);
        java.nio.charset.Charset charset20 = null;
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (short) 1, (int) (short) 0, charset20);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("31.12.1969");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray10, 100);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17, zoneId20);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId20);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray10, 2097249, 1, zoneId20);
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis("19700101", zoneId20);
        long long27 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969/12/31T19:45:57", zoneId20);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969/12/31T19:45:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 14:00:00" + "'", str23, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertNull(zonedDateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-28800000L) + "'", long26 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-115200000L) + "'", long27 == (-115200000L));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '4', '#', '4', ' ', ' ', '#', 'a', '4', ' ', '#', ' ', 'a', '4', '4', 'a', '4', ' ', '4', '#', '4', '4', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern8 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(1141240135347L, dateTimeFormatPattern8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format((long) 'a', dateTimeFormatPattern8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format((long) 3407907, dateTimeFormatPattern8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format((-48303000L), dateTimeFormatPattern8);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern8 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern8.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0001/01/01" + "'", str9, "0001/01/01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969/12/31T18:00:00" + "'", str10, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2006/03/01T13:08:55" + "'", str11, "2006/03/01T13:08:55");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969/12/31T18:00:00" + "'", str12, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969/12/31T18:56:47" + "'", str13, "1969/12/31T18:56:47");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969/12/31T04:34:57" + "'", str14, "1969/12/31T04:34:57");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("19700101", 2293812);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', 2293812, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293812");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 03:59:59", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969-12-31 03:59:59");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("19691231");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31" + "'", str2, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 3407904, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (short) 100);
        java.util.Date date22 = null;
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date24, "");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString(date24);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date24, zoneId31);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId31);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, (int) (short) -1, (int) '4', 3407907, (int) (byte) 10, 3407969, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) 1, (int) (byte) 100, zoneId31);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19700101" + "'", str33, "19700101");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 14:00:00" + "'", str34, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 232583419750000L + "'", long43 == 232583419750000L);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 1, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
            java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-170538823816847L), zoneId11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray1, (int) (byte) 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray1, (int) (short) -1);
        java.nio.charset.Charset charset16 = null;
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray1, (int) ' ', (int) (short) 0, charset16, zoneId20);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59.999", zoneId20);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId20, 0, 2293812, 2293792, 2293792, 0, 0, 2097187);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str22, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 6196850075008002L + "'", long32 == 6196850075008002L);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-26 10:00:00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 26 10:00:00 CST 1968");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 400000000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 400000000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "+08:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 04:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 13:28:11.231");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-30 13:59:59");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+08:00" + "'", str3, "+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 04:00:00" + "'", str6, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 13:28:11.231" + "'", str8, "1970-01-01 13:28:11.231");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-30 13:59:59" + "'", str10, "1969-12-30 13:59:59");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) '#', 3407904, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 3407907);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 3407907);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 6357024, (int) (short) 0);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 3407924, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.time.ZoneId zoneId1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 0, zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 2097187);
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
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097184);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 2293857);
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
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 2293792);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 04:34:57");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-48303000L) + "'", long1 == (-48303000L));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) 'a');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2097249, 400000000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 3407969);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 6357044);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId4);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString(6357024L, false, zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 09:45:57+08:00", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 09:45:57+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66118358169080000L + "'", long12 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 09:45:57.024" + "'", str14, "1970-01-01 09:45:57.024");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', 'a', 'a', 'a', ' ', '#', 'a', '4', 'a', '4', 'a', '4', '#', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1970-01-01 08:00:00+08:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1969-12-31 17:59:59.999");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1673-07-20 23:18:15");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str4, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 17:59:59.999" + "'", str6, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1673-07-20 23:18:15" + "'", str9, "1673-07-20 23:18:15");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097249, 6357024);
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '#', 2293792, charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '#', 'a', '4', '#', ' ', '#', 'a', ' ', 'a', '4', '4', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) (-1), dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) (byte) 10, dateTimeFormatPattern4);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969/12/31" + "'", str6, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969/12/31" + "'", str7, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969/12/31" + "'", str8, "1969/12/31");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407907);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097204);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 2097249);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 6357027);
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
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1973-10-28");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2293857);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('4', '#', ' ', ' ', ' ', '#', ' ', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19680217", 3407907, 0);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0000-00-01");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407924);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', ' ', 'a', '4', 'a', '4', '4', 'a', '#', ' ', '4', '#', ' ', ' ', '4', ' ', ' ', ' ', ' ', ' ', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2097249, 10, (int) (short) -1, (-1), (int) (short) 1, 400000000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20972");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 3407969);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 1);
        byte[] byteArray20 = new byte[] {};
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray20, (int) (byte) -1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray20, (int) (byte) 10);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray20, (int) ' ');
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray20, (int) (byte) 100);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray20, 10);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray20, (int) (short) -1);
        java.nio.charset.Charset charset35 = null;
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId39);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId39);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray20, (int) ' ', (int) (short) 0, charset35, zoneId39);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 09:45:57.024+08:00", zoneId39);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357044, 3407924, zoneId39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
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
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str41, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 6357024L + "'", long43 == 6357024L);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("+3693372-0 16:12:17");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +3693372-0 16:12:17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern10 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(10L, dateTimeFormatPattern10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(10L, dateTimeFormatPattern10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 10, (int) (byte) 1, (int) (byte) 1, dateTimeFormatPattern10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format((-1), (int) 'a', 10, dateTimeFormatPattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern10 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern10.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 18:00:00" + "'", str11, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 18:00:00" + "'", str12, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31 18:00:00" + "'", str13, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 18:00:00" + "'", str14, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0010/01/01" + "'", str15, "0010/01/01");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 08:00:00.032+08:00");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-02-17");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str7, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str9, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1968-02-17" + "'", str11, "1968-02-17");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("\000\000\000\000\000\000\000\000\000\000\00008:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("23.02.2160 04:31:53", "-3425-03-0");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '23.02.2160 04:31:53' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(28800, 2293812, (int) (byte) 1, (int) (byte) 0, 2097184, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 288");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId5);
        java.time.ZonedDateTime zonedDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId5);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01", zoneId5);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10, "0001-01-01");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-01-01" + "'", str12, "0001-01-01");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.lang.Class<?> wildcardClass16 = charArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(3407969, (int) (byte) 0, (int) (byte) 100, 3407904, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097184);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localTime14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 6357044);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 0);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long2 = com.alibaba.fastjson2.util.DateUtils.parseMillis("5375-12-04", zoneId1);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107480534400000L + "'", long2 == 107480534400000L);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId18);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId18);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId18);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId18);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date22);
        char[] charArray29 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray29, (int) ' ');
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray29, (int) (short) 1);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray29, (int) (byte) 100, 0, zoneId36);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00", zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (byte) 100, (int) (byte) 100, charset13, zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28800000L) + "'", long21 == (-28800000L));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31" + "'", str23, "1969-12-31");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 50400000L + "'", long38 == 50400000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31 04:00:00" + "'", str39, "1969-12-31 04:00:00");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969/12/31");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31" + "'", str3, "1969-12-31");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray0, 6357027);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (byte) 100);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString(116489408803937000L, false, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(119416895664L, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2097204, (int) '#', zoneId25);
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 14:00:00" + "'", str23, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-02 04:00:00" + "'", str27, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+3693372-0 16:12:17" + "'", str28, "+3693372-0 16:12:17");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "19731014" + "'", str29, "19731014");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) 'a');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) 'a', (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097184, (int) (short) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097184);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 605032704);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 0, (int) (short) 10, charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
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
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "0100-01-00");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0100-01-00" + "'", str12, "0100-01-00");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) 'a');
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 29143, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 400000000, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(5482584995699000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 00:00:00");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 00:00:00" + "'", str6, "1969-12-31 00:00:00");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.ZoneId zoneId9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357044, 28800, zoneId9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) ' ', (int) (byte) -1, (int) '#', (int) (short) 0, (int) (short) 0, 6357027);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61153265373L) + "'", long6 == (-61153265373L));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1970-01-01 09:45:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19700101");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.Class<?> wildcardClass3 = localDateTime1.getClass();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21600000L + "'", long2 == 21600000L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 100);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 0);
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
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0, 6357027, 2293857, (int) '4', (int) (byte) 0, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, (int) (short) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray5, (int) (byte) 1, (int) ' ');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray5, 2097187, 100);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 6357089);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (short) 100, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 3407924);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, (int) (byte) 100);
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) 'a', 6357024, charset25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(zonedDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        char[] charArray1 = new char[] { '#' };
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray1, (int) (byte) 1);
        java.time.LocalTime localTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray1, (int) '#');
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localTime5);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 1, 3407904);
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
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) 100, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(10, (int) '4', (int) (byte) 100, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, (int) 'a');
        java.nio.charset.Charset charset24 = null;
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId31);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 400000000, 28800, charset24, zoneId31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 400000000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str33, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 00:00:00" + "'", str34, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2097184);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 10);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 3407969);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 400000000);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-30");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Dec 30 00:00:00 CST 1969");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray1, (int) (short) 1);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, (int) (short) 1, (int) (byte) 10, zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31 18:00:28", zoneId12);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31 18:00:28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNull(zonedDateTime13);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097249);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (byte) 0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(1L, zoneId27);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime25, zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 10, zoneId27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "19700101" + "'", str28, "19700101");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100772000L) + "'", long29 == (-100772000L));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969/12/31T04:34:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969/12/31T04:34:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("2006/03/01T13:08:55");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (short) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 28800);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = null;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357024, 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 400000000, 2293812);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 6357044, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "+175583-07 23:55:28.003");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100772000L) + "'", long7 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50372000L) + "'", long8 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+175583-07 23:55:28.003" + "'", str10, "+175583-07 23:55:28.003");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000101" + "'", str2, "00000101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000-01-01" + "'", str4, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00000101" + "'", str5, "00000101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000-01-01" + "'", str6, "0000-01-01");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
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
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) 'a');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', 'a', 'a', ' ', ' ', 'a', '4', ' ', '#', ' ', ' ', 'a', '4', 'a', '4', 'a', '4', '4', '#', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 100);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 6357044);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 2097204);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        char[] charArray1 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            long long4 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray1, (int) (short) 100, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, (int) (short) 100, 3407907);
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
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("19680102");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19680102");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2293795);
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
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1970-01-02 18:00:00");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407924);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (byte) 0);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        java.util.Date date42 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-15 20:30:27.455", zoneId36);
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
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Mon Jan 15 06:30:27 CST 1968");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) '#');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4 ");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, 1);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString(date21);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId28);
        java.util.Date date30 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId28);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407907, zoneId28);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis("4071-01-09", zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, (int) ' ', zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 14:00:00" + "'", str31, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 66301862400000L + "'", long33 == 66301862400000L);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, 3407904);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray35 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray35, (int) ' ');
        java.time.LocalTime localTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray35, (int) (short) 1);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray35, (int) (byte) 100, 0, zoneId42);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime30, zoneId42);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId49);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId49);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date46, zoneId49);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date46);
        java.time.ZoneId zoneId59 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId59);
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId59);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId59);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date46, zoneId59);
        long long64 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime30, zoneId59);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.toString((-63081138742L), true, zoneId59);
        // The following exception was thrown during execution in test generation
        try {
            long long66 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) 100, 1, zoneId59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localTime39);
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-50372000L) + "'", long44 == (-50372000L));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "19700101" + "'", str51, "19700101");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01 14:00:00" + "'", str52, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01" + "'", str53, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1969-12-31" + "'", str60, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1969-12-31 18:00:00.01" + "'", str61, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1969-12-31 17:59:59.999" + "'", str62, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01 00:00:00" + "'", str63, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-50372000L) + "'", long64 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1968-01-01 15:27:41.258-06:00" + "'", str65, "1968-01-01 15:27:41.258-06:00");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 19:45:57", 0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00019:45:57" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00019:45:57");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 3407904);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray6, (int) (short) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray6, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '4');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 62");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray6, 2293812);
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
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', 28800, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097184);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDateTime16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray4, 3407924);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 10, 10]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 100);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 2097184, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, 3407907, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407924);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 6357024);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 2293857, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5701761");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.time.LocalDate localDate0 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "21600223");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        byte[] byteArray0 = null;
        long long3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 400000000, 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 1, 0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.01+08:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        byte[] byteArray3 = new byte[] {};
        java.time.LocalTime localTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) ' ');
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) -1);
        java.nio.charset.Charset charset18 = null;
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId22);
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) ' ', (int) (short) 0, charset18, zoneId22);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59.999", zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("5375-12-04 00:00:00", "26.01.1968", zoneId22);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '5375-12-04 00:00:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNull(localTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str24, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 17:59:59 CST 1969");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (-1), (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray6, 2293795);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 10);
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId22);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 1, zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, (int) (short) -1, zoneId22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str24, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 2097184);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date10);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:28" + "'", str11, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19691231" + "'", str12, "19691231");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31" + "'", str13, "1969-12-31");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(0, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-00-10" + "'", str3, "0000-00-10");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("19680118");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str3, "1970-01-01 08:00:00.001+08:00");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray7, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray7, (int) (short) 10, 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray7, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray7, 6357024);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray7, (int) (short) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray7, (int) '#');
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray7, (int) (byte) 100, (int) (short) 0);
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
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId40);
        java.util.Date date47 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", zoneId40);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray7, 2097249, 0, zoneId40);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-12 21:27:25", zoneId40);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(100L, zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00.01", zoneId40);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969-12-31 18:00:00.01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 14:00:00" + "'", str46, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-62159555000L) + "'", long49 == (-62159555000L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19700101" + "'", str50, "19700101");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(3407969, 2097204, 3407924, 6357089, 2097204, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 10);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("18.08.4267 10:56:13");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 2097187);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(29143, 2097204, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 6357024, (int) (short) 0);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2293857);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2293857);
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern8 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(6357027, 3407969, (int) 'a', dateTimeFormatPattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern8 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern8.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0001/01/01" + "'", str9, "0001/01/01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969/12/31T18:00:00" + "'", str10, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969/12/31T18:00:00" + "'", str11, "1969/12/31T18:00:00");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-62167198164000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29143 + "'", int1 == 29143);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "19691231");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "57860131");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691231" + "'", str7, "19691231");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "57860131" + "'", str11, "57860131");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0035-10-00", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0035-10-00");
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
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('a', '4', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2293857);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357044);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1973-11-19 23:18:05.04");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 122620685040L + "'", long1 == 122620685040L);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        java.time.ZoneId zoneId48 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId48);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId48);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId48);
        java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId48);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId48);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId54 = com.alibaba.fastjson2.util.DateUtils.getZoneId("\000\000\000\000\000\000\000\000\000\000\00000:00:00", zoneId48);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: ???????????00:00:00");
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
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-100772000L) + "'", long41 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-50372000L) + "'", long42 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01" + "'", str49, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19700101" + "'", str50, "19700101");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str51, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-100772000L) + "'", long53 == (-100772000L));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 100, 0, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId14);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId21);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date18);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId31);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId31);
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId31);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.util.Date date39 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId42);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId42);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date39, zoneId42);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId42, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId42, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId42);
        long long63 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 14:00:00" + "'", str24, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31" + "'", str32, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31 18:00:00.01" + "'", str33, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 17:59:59.999" + "'", str34, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 00:00:00" + "'", str35, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-50372000L) + "'", long36 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str37, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 120424011872003L + "'", long53 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 116486622349140000L + "'", long61 == 116486622349140000L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-100772000L) + "'", long62 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-50372000L) + "'", long63 == (-50372000L));
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-01 00:00:00" + "'", str3, "0001-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0001-01-01" + "'", str4, "0001-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0001-01-01" + "'", str5, "0001-01-01");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1973-11-19 23:18:05.04");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (short) 100, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 3407924);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 29143, 2293857);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(zonedDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 6357044);
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
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31 19:45:57");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1968-01-26 13:29:52");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 19:45:57" + "'", str8, "1969-12-31 19:45:57");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-26 13:29:52" + "'", str10, "1968-01-26 13:29:52");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.time.LocalDateTime localDateTime0 = null;
        java.util.Date date1 = null;
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date3, "");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date3);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId10);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId10, (int) (short) -1, (int) '4', 3407907, (int) (byte) 10, 3407969, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime0, zoneId10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 14:00:00" + "'", str13, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 232583419750000L + "'", long22 == 232583419750000L);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 6357024);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray5, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407964");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(1, 3407907, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0000-35-00", 2097249, 28800);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 0000-35-00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (short) 100, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293957");
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray3, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407921");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 0);
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
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407922");
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
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 10, 1, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("", (int) (byte) 0);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        java.time.LocalTime localTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 1);
        java.time.LocalDateTime localDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (short) 10, 100);
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
        org.junit.Assert.assertNull(localDateTime46);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -8");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:00" + "'", str3, "1969-12-31 18:00:00");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 1);
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
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("4071-01-09", 29143);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 29143);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        char[] charArray17 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray17, (int) ' ');
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray17, (int) (short) 1);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray17, 0);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray17, (int) '#');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray17, 10);
        java.time.LocalTime localTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray17, 0);
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray17, (int) (byte) 0);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray17, (int) (short) 10, (int) (short) 0);
        java.time.LocalDate localDate36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray17, (int) (short) 0);
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId40);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray17, 2097204, (int) (byte) 0, zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime43 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 1, 2293857, zoneId40);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localTime29);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1969-12-31" + "'", str41, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime42);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray6, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray6, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray6, 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, (int) 'a');
        char[] charArray24 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray24, (int) ' ');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray24, (int) (short) 1);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray24, (int) (byte) 0, (int) (byte) 0, zoneId31);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (byte) 0, 0, zoneId31);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31", zoneId31);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis("2006-03-02", zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 18:00:00.1", zoneId31);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969-12-31 18:00:00.1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(zonedDateTime33);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Mon Jan 30 10:00:00 CST 5786");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1141228800000L + "'", long35 == 1141228800000L);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId7);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        char[] charArray16 = new char[] { '4', ' ' };
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray16, (int) (byte) 1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray16, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray16, (int) (byte) 1);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray16, 100);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray16, 100, 0);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray16, 100);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray16, 10);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray16, (int) (short) 100, (int) (short) 0, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId35);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId46 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId46);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId46);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date43, zoneId46);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date43);
        java.time.ZoneId zoneId56 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId56);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId56);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId56);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date43, zoneId56);
        java.util.Date date61 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId56);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId56);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId63 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1973-11-19 23:18:05.04", zoneId56);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1973-11-19 23:18:05.04");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31" + "'", str8, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31 18:00:00.01" + "'", str9, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 17:59:59.999" + "'", str10, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 14:00:00" + "'", str12, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-02 04:00:00" + "'", str38, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "19700101" + "'", str48, "19700101");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01 14:00:00" + "'", str49, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1969-12-31" + "'", str57, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1969-12-31 18:00:00.01" + "'", str58, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31 17:59:59.999" + "'", str59, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01 00:00:00" + "'", str60, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01 14:00:00" + "'", str62, "1970-01-01 14:00:00");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 6357024, 100);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) (short) 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 0, (int) (byte) 10);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) 'a');
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month(' ', '#', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 100);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime21);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId24);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId24);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray33, 100);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId43 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId43);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId43);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId43);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId43);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray33, 2097249, 1, zoneId43);
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId43);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId43);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId43);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) 1, (int) (byte) 1, zoneId43);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input  ");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str22, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-31" + "'", str25, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-50372000L) + "'", long26 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01" + "'", str44, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "19700101" + "'", str45, "19700101");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 14:00:00" + "'", str46, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "19700101" + "'", str47, "19700101");
        org.junit.Assert.assertNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-100772000L) + "'", long49 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "40710109" + "'", str50, "40710109");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-02 18:00:00", "4071-01-09");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-02 18:00:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 2097204);
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
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) 0, dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((-60976800000L), dateTimeFormatPattern5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(100, 2097249, 1, dateTimeFormatPattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969" + "'", str6, "31.12.1969");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26.01.1968" + "'", str7, "26.01.1968");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        char[] charArray3 = new char[] { '4', ' ' };
        java.time.LocalDate localDate5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) (byte) 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray3, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray3, (int) '#');
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 100, false, zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((-58754933900L), true, zoneId21);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray3, 2293857, 0, zoneId21);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId21);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date26);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4,  ]");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31" + "'", str22, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31 18:00:00.1" + "'", str23, "1969-12-31 18:00:00.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1968-02-20 17:11:06.1-06:00" + "'", str24, "1968-02-20 17:11:06.1-06:00");
        org.junit.Assert.assertNull(zonedDateTime25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 31 18:34:57 CST 1969");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19691231" + "'", str27, "19691231");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31" + "'", str28, "1969-12-31");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 6357044, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray6, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 11");
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (byte) 0, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((-164183312498460L), dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-13 11:27:25", (int) (byte) 10);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-02-16 14:10:09");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 16 14:10:09 CST 1968");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1968-02-16 14:10:09" + "'", str2, "1968-02-16 14:10:09");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.time.ZoneId zoneId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.toString((-170462938800456L), true, zoneId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 0);
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
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 400000000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 400000000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (-1));
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (short) 10);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2293857);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 3407969);
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
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray1, (int) (byte) 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray1, (int) (short) -1);
        java.nio.charset.Charset charset16 = null;
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray1, (int) ' ', (int) (short) 0, charset16, zoneId20);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 09:45:57.024+08:00", zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId20, 6357089, 2293812, 6357027, (int) '#', (int) (byte) 10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 2293812");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str22, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 6357024L + "'", long24 == 6357024L);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('#', 'a', 'a', '4', '#', '4', ' ', 'a');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray26 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray26, (int) ' ');
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray26, (int) (short) 1);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray26, (int) (byte) 100, 0, zoneId33);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId33);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId40);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date37, zoneId40);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date37);
        java.time.ZoneId zoneId50 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId50);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId50);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId50);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date37, zoneId50);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId50);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime21);
        java.time.LocalDateTime localDateTime59 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime59);
        java.time.ZoneId zoneId62 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId62);
        long long64 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime59, zoneId62);
        long long65 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId62);
        long long66 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId62);
        java.time.ZonedDateTime zonedDateTime67 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407969, 10, zoneId62);
        java.lang.Class<?> wildcardClass68 = byteArray0.getClass();
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
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50372000L) + "'", long35 == (-50372000L));
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19700101" + "'", str42, "19700101");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01 14:00:00" + "'", str43, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01" + "'", str44, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1969-12-31" + "'", str51, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1969-12-31 18:00:00.01" + "'", str52, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1969-12-31 17:59:59.999" + "'", str53, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01 00:00:00" + "'", str54, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-50372000L) + "'", long55 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str56, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str60, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1969-12-31" + "'", str63, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-50372000L) + "'", long64 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 21600000L + "'", long65 == 21600000L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-50372000L) + "'", long66 == (-50372000L));
        org.junit.Assert.assertNull(zonedDateTime67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 1, 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-01" + "'", str3, "0001-01-01");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 6357024, (int) (short) 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407903");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 17:59:59");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "62550611");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59" + "'", str3, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "62550611" + "'", str5, "62550611");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 18:00:00" + "'", str6, "1969-12-31 18:00:00");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097184, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 3407924, zoneId6);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-170539039330016L), zoneId6);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50400000L) + "'", long9 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-3435-10-3" + "'", str12, "-3435-10-3");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 08:00:00.01+08:00");
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 08:00:00.01+08:00" + "'", str34, "1970-01-01 08:00:00.01+08:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50372000L) + "'", long35 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str36, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 29143);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 10, 2097249);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097184);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097204);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2293857);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 2097249);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) '#', 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 2293857);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (byte) 0, 29143, 2097249, 6357027, 2097187, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 197575991140L + "'", long6 == 197575991140L);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime16);
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId19);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime16, zoneId19);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId19);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) 'a', (int) (short) 0, zoneId19);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 400000000);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str17, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31" + "'", str20, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 21600000L + "'", long22 == 21600000L);
        org.junit.Assert.assertNull(zonedDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "");
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-50372000L) + "'", long44 == (-50372000L));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        java.time.LocalTime localTime47 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 0);
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
        org.junit.Assert.assertNull(localTime47);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, 0);
        java.util.Date date16 = null;
        byte[] byteArray18 = new byte[] {};
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray18, (int) (byte) -1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray18, (int) (byte) 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray18, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray18, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray18, (int) (short) 1, (int) (byte) 10, zoneId29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date16, zoneId29);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00", zoneId29);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (short) 100, (-1), zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId29, 6357044, 6357024, 2293795, (int) '4', 2293812, (int) (byte) 10, 28800);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 6357024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertNull(zonedDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31" + "'", str31, "1969-12-31");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertNull(zonedDateTime34);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1970-01-01 08:00:00.001+08:00");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1, "0001/10/00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str11, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0001/10/00" + "'", str14, "0001/10/00");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 100, 0, zoneId17);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId17);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date21);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId34);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId34);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId34);
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId34);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString((-63081138742L), false, zoneId34);
        java.util.Date date41 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 00:00:00", zoneId34);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId34, 3407924, 2293812, 6357089, (int) (short) -1, 2293812, 6357024, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 2293812");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 14:00:00" + "'", str27, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31" + "'", str35, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969-12-31 18:00:00.01" + "'", str36, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31 17:59:59.999" + "'", str37, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 00:00:00" + "'", str38, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50372000L) + "'", long39 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1968-01-01 15:27:41.258" + "'", str40, "1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CST 1970");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (byte) 0, 2293795);
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
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1968-01-26");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 400000000, 2097184);
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
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) '4');
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(date22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId30);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId30);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId30);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId30);
        java.util.Date date36 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31T18:00:00", zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray3, 2097187, zoneId30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28800000L) + "'", long33 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 14:00:00" + "'", str35, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray6, (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("-0001-12-3 10:03:41", 6357027, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: -0001-12-3 10:03:41");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097249);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
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
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (byte) 10, (int) (short) 0);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, (int) (byte) 1);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 2097204);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407904");
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
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 6357024);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 0);
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId26);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId26);
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId26);
        java.util.Date date30 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) 1, 100, zoneId26);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-28800000L) + "'", long29 == (-28800000L));
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) '#');
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1996-10-20 11:50:46.348", "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1996-10-20 11:50:46.348' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(8946039919920000L, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2854");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0001/01/01" + "'", str5, "0001/01/01");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) 'a');
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        java.nio.charset.Charset charset23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 29143, 3407907, charset23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 2097184);
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357089, 2097187, charset19);
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2293792);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "19691231");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691231" + "'", str7, "19691231");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 0);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 6357024);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 53");
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 3407907, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407942");
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31 19:45:57");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1970-01-01 08:56:47.907");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "6255-06-11 10:13:29");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 19:45:57" + "'", str8, "1969-12-31 19:45:57");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 08:56:47.907" + "'", str10, "1970-01-01 08:56:47.907");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "6255-06-11 10:13:29" + "'", str12, "6255-06-11 10:13:29");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString(date5);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId12);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId12);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5, zoneId12);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId12);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.getZoneId("+175583-07 23:55:28.003", zoneId12);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: +175583-07 23:55:28.003");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 14:00:00" + "'", str15, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-50401000L) + "'", long16 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str17, "1970-01-01 08:00:00.001+08:00");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407924);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407969);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("\000\000\000\000\000\000\000\000\000\000\00000:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId3);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input  ");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 10);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (byte) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, 3407907);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407907);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 28800);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 100);
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(72506159773199L, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 0, 3407969, 605032704, dateTimeFormatPattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969 18:00:00" + "'", str8, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18.08.4267 10:56:13" + "'", str9, "18.08.4267 10:56:13");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 3407924, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3408024");
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
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-00-01");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (short) 0, 6357044);
        java.nio.charset.Charset charset14 = null;
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId20);
        java.time.ZonedDateTime zonedDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId20);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-62135625943000L), zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) 'a', 28800, charset14, zoneId20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-50400000L) + "'", long23 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0001-01-01" + "'", str25, "0001-01-01");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) ' ');
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 6357027, 3407907);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 100);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) '#');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime3);
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId6);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray15, 100);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId25);
        java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray15, 2097249, 1, zoneId25);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId25);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime3);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray39, 100);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId49);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId49);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date46, zoneId49);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId49);
        java.time.ZonedDateTime zonedDateTime54 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray39, 2097249, 1, zoneId49);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId49);
        java.time.ZoneId zoneId58 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId58);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId58);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId58);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.toString((long) 3407969, false, zoneId58);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str4, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31" + "'", str7, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50372000L) + "'", long8 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "19700101" + "'", str29, "19700101");
        org.junit.Assert.assertNull(zonedDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-100772000L) + "'", long31 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str32, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "19700101" + "'", str51, "19700101");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01 14:00:00" + "'", str52, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "19700101" + "'", str53, "19700101");
        org.junit.Assert.assertNull(zonedDateTime54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-100772000L) + "'", long55 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31" + "'", str59, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1969-12-31" + "'", str60, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-50372000L) + "'", long61 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1969-12-31 18:56:47.969" + "'", str62, "1969-12-31 18:56:47.969");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("2006/03/01T13:08:55");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long3 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969-12-31 18:38:13");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1141240135000L + "'", long2 == 1141240135000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1141240135000L + "'", long3 == 1141240135000L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 18:38:13" + "'", str5, "1969-12-31 18:38:13");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:28" + "'", str11, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 04:00:28" + "'", str12, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19691231" + "'", str13, "19691231");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19691231" + "'", str14, "19691231");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31 04:00:28" + "'", str15, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19691231" + "'", str16, "19691231");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 3407907, 2293795);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 3407907, 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 605032704);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("4065-03-26");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4065-03-26");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '4', '4', '#', '#', '#', '4', '4', '4', ' ', '4', '#', 'a', 'a', '4', '#', '4', '4', '4', '#', ' ', 'a', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1968-01-01 15:27:41");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-01 15:27:41" + "'", str10, "1968-01-01 15:27:41");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1969-12-31 17:59:59.999-06:00");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000101" + "'", str2, "00000101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000-01-01" + "'", str4, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00000101" + "'", str5, "00000101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31 17:59:59.999-06:00" + "'", str7, "1969-12-31 17:59:59.999-06:00");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = null;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357024, 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 2097249);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 2293795);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId15);
        java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId15);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId15);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId15);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7, zoneId15);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId15);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId15);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId15);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-02-20 17:11:06.1-06:00", zoneId15);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("1973-11-19 23:18:05.04+08:00", zoneId15);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date25, "19691230");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-28800000L) + "'", long18 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Tue Feb 20 17:11:06 CST 1968");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Nov 19 09:18:05 CST 1973");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19691230" + "'", str27, "19691230");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) (-1), dateTimeFormatPattern3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(120423945600000L, dateTimeFormatPattern3);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969/12/31" + "'", str4, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5786/01/30" + "'", str6, "5786/01/30");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 100, 0, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId14);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId21);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date18);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId31);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId31);
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId31);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "5375-12-04 00:00:00");
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 14:00:00" + "'", str24, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31" + "'", str32, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31 18:00:00.01" + "'", str33, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 17:59:59.999" + "'", str34, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 00:00:00" + "'", str35, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-50372000L) + "'", long36 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "5375-12-04 00:00:00" + "'", str38, "5375-12-04 00:00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50372000L) + "'", long39 == (-50372000L));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray0, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407924);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 6357044);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407969);
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
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 3407924);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 6357027);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407967");
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407903");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2097184);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("57860131");
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long23 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId15, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-14 22:30:16", zoneId15);
        long long25 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId15);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 28800, zoneId15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
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
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 66118358169080000L + "'", long23 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Jan 14 08:30:16 CST 1968");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 120423945600000L + "'", long25 == 120423945600000L);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 0);
        byte[] byteArray19 = new byte[] {};
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray19, 3407907);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray19, (int) (byte) -1);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.format(date29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date29);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId37);
        java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId37);
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId37);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId37);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date29, zoneId37);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId37);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId37);
        java.time.ZonedDateTime zonedDateTime45 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray19, (int) (short) 100, (int) (short) -1, zoneId37);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId37);
        java.util.Date date47 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-27", zoneId37);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) '#', 28800, zoneId37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 00:00:00" + "'", str31, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 00:00:00" + "'", str32, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-28800000L) + "'", long40 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 14:00:00" + "'", str42, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "19700101" + "'", str43, "19700101");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2160-02-23" + "'", str44, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime45);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Fri Jan 26 10:00:00 CST 1968");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 28800);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 605032704);
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
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407924);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 6357089);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray30, (int) (byte) 1);
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray30, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray30, (int) (byte) -1);
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray30, 0);
        java.time.LocalDate localDate41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray30, (int) 'a');
        char[] charArray48 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate50 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray48, (int) ' ');
        java.time.LocalTime localTime52 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray48, (int) (short) 1);
        java.time.ZoneId zoneId55 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long56 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray48, (int) (byte) 0, (int) (byte) 0, zoneId55);
        java.time.ZonedDateTime zonedDateTime57 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray30, (int) (byte) 0, 0, zoneId55);
        long long58 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 18:00:00", zoneId55);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) (byte) 0, zoneId55);
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDate37);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate50);
        org.junit.Assert.assertNull(localTime52);
        org.junit.Assert.assertNotNull(zoneId55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNull(zonedDateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-50400000L) + "'", long58 == (-50400000L));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 29143);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 6357044, 3407904);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) 'a', 0);
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
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', 'a', '#', 'a', ' ', 'a', '4', '#', '#', ' ', ' ', '#', ' ', '4', '4', ' ', 'a', 'a', 'a', 'a', '4', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097249);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407904);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407924);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId30);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId30);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01", zoneId30);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407907, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (short) 10, zoneId30);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-28800000L) + "'", long33 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-28800000L) + "'", long34 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "19700101" + "'", str35, "19700101");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = null;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357024, 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 1);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', ' ', ' ' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) -1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 3407907, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, 2097204, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray6, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407901");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  , a,  ,  ]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((-50372000L), dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(6357044, 6357027, 6357044, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 04:00:28" + "'", str5, "1969-12-31 04:00:28");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) 100);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = zonedDateTime21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-02 18:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-02 18:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("2006/03/01T13:08:55");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long3 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1141240135000L + "'", long2 == 1141240135000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1141240135000L + "'", long3 == 1141240135000L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00013:08:55" + "'", str4, "\000\000\000\000\000\000\000\000\000\000\00013:08:55");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2293812, 29143, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(400000000, (-1), 0, 3407969, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5822082567311L + "'", long6 == 5822082567311L);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(6179591992592L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId7);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId7);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-01 15:27:41.258-06:00", zoneId7);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString(0L, false, zoneId7);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 2097184, 3407924, 28800, (int) (byte) 100, 2293795, 0, 10);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50400000L) + "'", long10 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 135235494809000L + "'", long18 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 08:00:00" + "'", str21, "1970-01-01 08:00:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 75126289427700000L + "'", long29 == 75126289427700000L);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 10);
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
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) 10, (int) (short) 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 10);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) ' ', 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097281");
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
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
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId10);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId10);
        long long14 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "08.11.5743 19:43:32");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100772000L) + "'", long14 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str15, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "08.11.5743 19:43:32" + "'", str17, "08.11.5743 19:43:32");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 2097249);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', 'a', ' ', '4', ' ', '#', ' ', '4', ' ', 'a', '4', ' ', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 2293857);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1968-01-15 20:30:27.455");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', ' ', ' ', ' ', 'a', ' ', 'a', 'a', '4', 'a', ' ', '#', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2293857);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 2097184);
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2293792, (int) (short) 1, charset17, zoneId18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293792");
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
        org.junit.Assert.assertNotNull(zoneId18);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("", zoneId2);
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:28", zoneId2);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Tue Dec 30 14:00:28 CST 1969");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (short) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 6357027);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357044);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 3407904);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1969-12-31 03:59:59");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 14:00:00" + "'", str2, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 03:59:59" + "'", str4, "1969-12-31 03:59:59");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray4, (int) (byte) 1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray4, 10);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray4, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray4, (int) ' ');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray4, (int) (byte) 1, 1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray4, 1);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId30);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId30);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1141189735000L, zoneId30);
        java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray4, 2097184, (int) (short) -1, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2160-02-23", zoneId30);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2160-02-23");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31" + "'", str31, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31 18:00:00.01" + "'", str32, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31 17:59:59.999" + "'", str33, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2006-02-28" + "'", str35, "2006-02-28");
        org.junit.Assert.assertNull(zonedDateTime36);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 14:00:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 08:00:00" + "'", str6, "1970-01-01 08:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 100);
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097249);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (byte) 0, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2293857, 0);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 3407969);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33);
        java.time.ZoneId zoneId41 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId41);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId41);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId41);
        java.util.Date date45 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId41);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId41);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.toString(4L, true, zoneId41);
        // The following exception was thrown during execution in test generation
        try {
            long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 100, (int) (byte) 100, zoneId41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(zonedDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0001-01-01 00:00:00" + "'", str34, "0001-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1969-12-31" + "'", str42, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1969-12-31 18:00:00.01" + "'", str43, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1969-12-31 17:59:59.999" + "'", str44, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0001-01-01 00:00:00" + "'", str46, "0001-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1969-12-31 18:00:00.004-06:00" + "'", str47, "1969-12-31 18:00:00.004-06:00");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 3407924);
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 29143, (int) 'a', charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 10);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 0);
        java.time.ZoneId zoneId22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) '#', zoneId22);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 6357044);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((long) 2097204);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 18:34:57" + "'", str1, "1969-12-31 18:34:57");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-31 18:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) 0, dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((-60976800000L), dateTimeFormatPattern5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', (int) '4', 1, dateTimeFormatPattern5);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969" + "'", str6, "31.12.1969");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26.01.1968" + "'", str7, "26.01.1968");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01.52.0032" + "'", str8, "01.52.0032");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 09:45:57.024+08:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "19691230");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str4, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691230" + "'", str7, "19691230");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407904");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-12 21:27:25");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1969-12-31 17:59:59");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31" + "'", str2, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1968-01-12 21:27:25" + "'", str4, "1968-01-12 21:27:25");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 17:59:59" + "'", str6, "1969-12-31 17:59:59");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId7);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        char[] charArray16 = new char[] { '4', ' ' };
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray16, (int) (byte) 1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray16, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray16, (int) (byte) 1);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray16, 100);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray16, 100, 0);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray16, 100);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray16, 10);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray16, (int) (short) 100, (int) (short) 0, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId35);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId46 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId46);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId46);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date43, zoneId46);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date43);
        java.time.ZoneId zoneId56 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId56);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId56);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId56);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date43, zoneId56);
        java.util.Date date61 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId56);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId56);
        java.util.Date date63 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00", zoneId56);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date63);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31" + "'", str8, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31 18:00:00.01" + "'", str9, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 17:59:59.999" + "'", str10, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 14:00:00" + "'", str12, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-02 04:00:00" + "'", str38, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "19700101" + "'", str48, "19700101");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01 14:00:00" + "'", str49, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1969-12-31" + "'", str57, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1969-12-31 18:00:00.01" + "'", str58, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31 17:59:59.999" + "'", str59, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01 00:00:00" + "'", str60, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01 14:00:00" + "'", str62, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 08:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "19700101" + "'", str64, "19700101");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (-1));
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 6357044);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "+08:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 04:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 13:28:11.231");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-30 13:59:59");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+08:00" + "'", str3, "+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 04:00:00" + "'", str6, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 13:28:11.231" + "'", str8, "1970-01-01 13:28:11.231");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-30 13:59:59" + "'", str10, "1969-12-30 13:59:59");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0001-01-01 00:00:00" + "'", str19, "0001-01-01 00:00:00");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 100, 0, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId14, (int) (byte) 0, (int) (byte) 100, 2097204, (-1), 2097184, (int) (byte) 100, 6357024);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        char[] charArray0 = new char[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray0, (int) '#');
        java.time.ZonedDateTime zonedDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray0, (int) '#', 0);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray0, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(zonedDateTime5);
        org.junit.Assert.assertNull(localTime7);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407907);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (-1));
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId8);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("-0001-00-0", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-00-0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28800000L) + "'", long11 == (-28800000L));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str14, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId4);
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 0, 100, 6357027, (int) (byte) 10, (int) (short) 1, 605032704, (int) (short) 100);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str7, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 487946399964000L + "'", long15 == 487946399964000L);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 400000000);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) 'a');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 1, 29143);
        java.util.Date date24 = null;
        byte[] byteArray26 = new byte[] {};
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray26, (int) (byte) -1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray26, (int) (byte) 10);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray26, (int) ' ');
        java.time.LocalTime localTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray26, (int) (short) 1);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, (int) (short) 1, (int) (byte) 10, zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date24, zoneId37);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 2293792, zoneId37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293792");
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
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localTime34);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNull(zonedDateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31" + "'", str39, "1969-12-31");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 1);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 2097184);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 6357027);
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str33, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str34, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 6357024);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2293812, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293812");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 605032704, 6357089);
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
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2293857);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        java.time.ZoneId zoneId41 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId41, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long57 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId41, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId41);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 0, zoneId41);
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
        org.junit.Assert.assertNotNull(zoneId41);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 66118358169080000L + "'", long49 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 5482764781252003L + "'", long57 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str58, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407904);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        char[] charArray0 = new char[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray0, (int) '#');
        java.time.ZonedDateTime zonedDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray0, (int) '#', 0);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray0, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray0, 0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(zonedDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) 100);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 100, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) ' ');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 1);
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
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDate29);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2097249, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 0);
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
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) (short) 10);
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
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId5);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1968-01-26 10:00:00", zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1968-01-14 08:03:22", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1968-01-14 08:03:22");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-60991200000L) + "'", long9 == (-60991200000L));
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("19731119");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-07-19 07:57:13.3+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', '4', ' ', ' ', 'a', '4', '#', ' ', 'a', '4', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) ' ');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 1);
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 2293857);
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
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDate29);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) 10, (int) (short) 0);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 0);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId27);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 2097204, (int) (byte) 0, zoneId27);
        java.time.LocalDateTime localDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357044);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31" + "'", str28, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertNull(localDateTime31);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8, zoneId11);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId11);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0001-01-01 00:00:00", zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-00-01", "1970-01-01 08:34:57+08:00", zoneId11);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0001-00-01' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 14:00:00" + "'", str14, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 14:00:00" + "'", str15, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-62135625943000L) + "'", long16 == (-62135625943000L));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 605032704);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -605032704");
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
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 0);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 29143);
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
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localTime28);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 18:00:00");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407924);
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 29143, (int) (short) 1, charset25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 6357027);
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
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) -1, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) '#', 6357027);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357085");
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
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
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) 'a');
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 3407904);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 3407969);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) '4', 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray6, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ####44");
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
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, (int) (short) 0);
        java.nio.charset.Charset charset12 = null;
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 3407907, 0, charset12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (int) '4', 10);
        java.nio.charset.Charset charset14 = null;
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray25 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray25, (int) ' ');
        java.time.LocalTime localTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray25, (int) (short) 1);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray25, (int) (byte) 100, 0, zoneId32);
        long long34 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId32);
        java.util.Date date36 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId39);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId39);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date36, zoneId39);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date36);
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId49);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId49);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId49);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date36, zoneId49);
        long long54 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId49);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.toString((-63081138742L), false, zoneId49);
        java.util.Date date56 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 00:00:00", zoneId49);
        long long57 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 6357027, 0, charset14, zoneId49);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime11);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localTime29);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-50372000L) + "'", long34 == (-50372000L));
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "19700101" + "'", str41, "19700101");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 14:00:00" + "'", str42, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31" + "'", str50, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1969-12-31 18:00:00.01" + "'", str51, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1969-12-31 17:59:59.999" + "'", str52, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01 00:00:00" + "'", str53, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-50372000L) + "'", long54 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1968-01-01 15:27:41.258" + "'", str55, "1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) ' ', 0, 0, 2293812, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61492265793L) + "'", long6 == (-61492265793L));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:00:00.1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407924);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
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
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0035-00-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0035-00-01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray3, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407901");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31");
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "5786-01-31");
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "0000-00-10");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31" + "'", str13, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5786-01-31" + "'", str15, "5786-01-31");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0000-00-10" + "'", str17, "0000-00-10");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 2293857);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) '#');
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
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(3407907, (int) (short) 10, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-30 14:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Dec 30 14:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-30" + "'", str2, "1969-12-30");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 2293857);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.time.ZoneId zoneId1 = null;
        long long2 = com.alibaba.fastjson2.util.DateUtils.parseMillis("08.11.5743 19:43:32", zoneId1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119091347012000L + "'", long2 == 119091347012000L);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (-1), (int) (short) 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '#');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2097187);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(zonedDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2293857);
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
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097249");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.util.Date date4 = null;
        byte[] byteArray6 = new byte[] {};
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray6, (int) (byte) 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray6, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (short) 1, (int) (byte) 10, zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId17);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00", zoneId17);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId17);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00000:00:00" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00000:00:00");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNull(zonedDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31" + "'", str19, "1969-12-31");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 21600000L + "'", long22 == 21600000L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00000:00:00" + "'", str23, "\000\000\000\000\000\000\000\000\000\000\00000:00:00");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 6357024);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, 6357044);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, (int) (short) 100);
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
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) '#');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 100);
        long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2097249, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        java.time.LocalDate localDate39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 100, (int) (byte) 0);
        java.time.LocalTime localTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2097204);
        java.time.LocalTime localTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357089);
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
        org.junit.Assert.assertNull(localDate39);
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertNull(localTime44);
        org.junit.Assert.assertNull(localTime46);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) (short) 0, 6357027, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, 3407924);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        char[] charArray12 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray12, (int) ' ');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray12, (int) (short) 1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray12, (int) (short) 10, 1);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray12, (int) (byte) -1);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray12, 6357024);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray12, (int) (short) 10);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray12, (int) '#');
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray12, (int) (byte) 100, (int) (short) 0);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.format(date37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date37);
        java.time.ZoneId zoneId45 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId45);
        java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId45);
        long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId45);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId45);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date37, zoneId45);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId45);
        java.util.Date date52 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", zoneId45);
        java.time.ZonedDateTime zonedDateTime53 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray12, 2097249, 0, zoneId45);
        // The following exception was thrown during execution in test generation
        try {
            long long54 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 6357027, zoneId45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 00:00:00" + "'", str39, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 00:00:00" + "'", str40, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01" + "'", str46, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-28800000L) + "'", long48 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01" + "'", str49, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01 14:00:00" + "'", str50, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01 14:00:00" + "'", str51, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime53);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 6357027, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8650884");
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 6357044);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        java.time.LocalTime localTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 2293857);
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
        org.junit.Assert.assertNull(localTime37);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        char[] charArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray0, 2293792, (int) (byte) 0);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 1, 1, 6357089, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2097187, (int) (short) 10, 100, 3407907, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        long long4 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime3, "00010101");
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId14);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString(5478713135728003L, false, zoneId14);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-50401000L), zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-02-17", zoneId14);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-02-17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-50372000L) + "'", long4 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00010101" + "'", str6, "00010101");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str16, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 00:00:00" + "'", str17, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+175583-07 23:55:28.003" + "'", str18, "+175583-07 23:55:28.003");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100772000L) + "'", long19 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19691231" + "'", str20, "19691231");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 3407924);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, 3407904, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 10, (int) (byte) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097187);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 2293792);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1996-10-20", 3407907, 605032704);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1996-10-20");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1973-11-19 00:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1973-11-19 00:00:00" + "'", str7, "1973-11-19 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId10);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId10);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1968-01-13 10:01:58");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1968-01-13 10:01:58" + "'", str18, "1968-01-13 10:01:58");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 3407924);
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
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.time.ZoneId zoneId1 = null;
        java.time.ZonedDateTime zonedDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-07-19 07:57:13.3+08:00", zoneId1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime2);
        org.junit.Assert.assertNotNull(zonedDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-07-19 07:57:13" + "'", str3, "1970-07-19 07:57:13");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969-12-31T18:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969-12-31T18:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 16:56:17");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-61779823000L) + "'", long1 == (-61779823000L));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("20.07.1673 23:18:15", 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 20.07.1673 23:18:15");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) -1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 6357089);
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
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(3407904, 2293812, 2097187, 2097249, (int) 'a', 400000000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 113722618769228L + "'", long6 == 113722618769228L);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 2097204);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime4);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId7);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId7);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969/12/31T19:45:57", zoneId7);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId7);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31" + "'", str8, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50372000L) + "'", long9 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21600000L + "'", long10 == 21600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6357000L + "'", long11 == 6357000L);
        org.junit.Assert.assertNull(zonedDateTime12);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 29143);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, 400000000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("26.01.1968");
        byte[] byteArray3 = new byte[] {};
        java.time.LocalTime localTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) ' ');
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) 'a');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 28800);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (-1), 2097249);
        char[] charArray29 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray29, (int) ' ');
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray29, (int) (short) 1);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray29, (int) (byte) 0, (int) (byte) 0, zoneId36);
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (short) 1, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 1, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId36);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-15 20:30:27.455");
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 26 00:00:00 CST 1968");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNull(localTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(zonedDateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1968-01-26 14:00:00" + "'", str40, "1968-01-26 14:00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1968-01-15 20:30:27.455" + "'", str42, "1968-01-15 20:30:27.455");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1968-01-26" + "'", str43, "1968-01-26");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("19691230");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 100, (int) (short) 10);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293808");
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
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097202");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(28800, (int) (byte) 0, 2097249, dateTimeFormatPattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 288");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2293857);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 3407924, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray1, (int) (short) -1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray1, 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray1, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray1, (int) (short) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray1, (int) (byte) -1);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString(date21);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId28);
        java.util.Date date30 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId28);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date21);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date21);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId37);
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId37);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId37);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, (int) (short) 0, (int) (byte) 1, zoneId37);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.1", zoneId37);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date43);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNull(date30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 14:00:00" + "'", str31, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19700101" + "'", str33, "19700101");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-50400000L) + "'", long40 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19691231" + "'", str44, "19691231");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray2, (int) (byte) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray2, (int) (short) -1);
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId21);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray2, (int) ' ', (int) (short) 0, charset17, zoneId21);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId21);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId30);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId30);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId30);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date25, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("+3693372-0 16:12:17", zoneId30);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +3693372-0 16:12:17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str23, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50400000L) + "'", long33 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31 18:00:28" + "'", str35, "1969-12-31 18:00:28");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) 'a', (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097184, (int) (short) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 28800);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) 'a');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 100);
        byte[] byteArray18 = new byte[] {};
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray18, (int) (byte) -1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray18, (int) (byte) 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray18, (int) ' ');
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray18, (int) 'a');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray18, 100);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray18, 28800);
        java.time.LocalTime localTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray18, 3407924);
        java.nio.charset.Charset charset35 = null;
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId40);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId40);
        java.time.ZonedDateTime zonedDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId40);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray18, (int) (byte) 1, (int) (byte) 0, charset35, zoneId40);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, false, zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 10, zoneId40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localTime32);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19700101" + "'", str42, "19700101");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-50400000L) + "'", long43 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 08:00:00.001" + "'", str46, "1970-01-01 08:00:00.001");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (byte) 100, (int) (short) 0, 10, (int) (byte) 1, 6357024, 400000000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-58231848560L) + "'", long6 == (-58231848560L));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) -1);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 1, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407908");
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 17:59:59", zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-30 14:00:28", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-30 14:00:28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50401000L) + "'", long7 == (-50401000L));
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 605032704, 605032704);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, 2097204);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 08:00:00.001+08:00");
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str19, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-50372000L) + "'", long20 == (-50372000L));
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 400000000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 400000035");
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
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001-01-01 13:56:19");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-62135525585000L) + "'", long1 == (-62135525585000L));
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19691230");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691230" + "'", str3, "19691230");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00000:00:00" + "'", str4, "\000\000\000\000\000\000\000\000\000\000\00000:00:00");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId14);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId14);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19700101" + "'", str16, "19700101");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1673-07-20 23:18:15");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1673-07-20 23:18:15");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) 0, 6357027, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 6357024);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097187);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1970-01-01 08:00:00.001+08:00", (int) (short) -1, 6357089);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1970-01-01 08:00:00.001+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', '#', 'a', '4', 'a', ' ', '#', ' ');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 6357024);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 3407969, 6357044);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 1);
        char[] charArray25 = new char[] { '4', ' ' };
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray25, (int) (byte) 1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray25, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray25, (int) (byte) 1);
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray25, 100);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray25, 100, 0);
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray25, 100);
        java.time.LocalDateTime localDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray25, 10);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray25, (int) (short) 100, (int) (short) 0, zoneId44);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId44);
        long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId44);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.toString((-50401000L), false, zoneId44);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray3, 0, zoneId44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01" + "'", str46, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31 17:59:59" + "'", str48, "1969-12-31 17:59:59");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (-1));
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (-1), (int) (short) 10);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17, zoneId20);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId20, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId20, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 2097204, zoneId20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 14:00:00" + "'", str23, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 120424011872003L + "'", long31 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 116486622349140000L + "'", long39 == 116486622349140000L);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(6357024, (int) (short) 0, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 0);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) '#');
        java.nio.charset.Charset charset11 = null;
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime15, "1970-01-01 08:00:00.001+08:00");
        char[] charArray22 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray22, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray22, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 0, (int) (byte) 0, zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId29);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 10, 2293792, charset11, zoneId29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str17, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-100772000L) + "'", long31 == (-100772000L));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Sun Jan 02 09:54:17 CST 1");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId13);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId13);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId13);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5, zoneId13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId13);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("00010101", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 00010101");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-28800000L) + "'", long16 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407907);
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
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 14:00:00", 0);
        long long3 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 72000000L + "'", long3 == 72000000L);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) '4');
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) 'a', 0);
        java.time.LocalDateTime localDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) ' ', 0);
        java.nio.charset.Charset charset34 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 10, 100, charset34);
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
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertNull(localDateTime31);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) ' ');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 6357027);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1973-10-28");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1973-10-28" + "'", str8, "1973-10-28");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 18:00:00.01");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "18.08.4267 10:56:13");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19691231" + "'", str4, "19691231");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "18.08.4267 10:56:13" + "'", str7, "18.08.4267 10:56:13");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '4', '#', 'a', 'a', '4', ' ', ' ', '#', 'a', 'a', '4', '#', 'a', 'a', 'a', 'a', ' ', 'a', ' ', '4', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) (short) 0);
        byte[] byteArray17 = new byte[] {};
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray17, (int) (byte) -1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray17, (int) (short) 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray17, 28800);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray17, (-1));
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray17, 2097204);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray17, 6357024);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray17, 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray17, (int) '#');
        java.time.LocalDate localDate36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray17, (int) (short) 10);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray17, (int) (byte) 1);
        java.nio.charset.Charset charset41 = null;
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime44);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId47);
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime44, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId47);
        long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray17, 2293812, (int) (short) 0, charset41, zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            long long52 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 2097249, zoneId47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
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
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str45, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-50372000L) + "'", long49 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31" + "'", str50, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("01.52.0032");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long10 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId2, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId2);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId2);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId2, 2097184, (int) '4', 3407969, (int) '4', 28800, (int) (byte) 1, 605032704);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 66118358169080000L + "'", long10 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31" + "'", str12, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 66413152612801605L + "'", long20 == 66413152612801605L);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 14:00:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (-1));
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 0);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357027);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) (byte) -1);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(date22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.toString(date22);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId29);
        java.util.Date date31 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId29);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId29);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-60928207130L), zoneId29);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407969, (int) (short) 0, zoneId29);
        byte[] byteArray37 = new byte[] {};
        java.time.LocalTime localTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray37, (int) (byte) -1);
        java.time.LocalDateTime localDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray37, (int) (byte) 10);
        java.time.LocalDate localDate43 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray37, (int) (byte) 10);
        long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray37, (int) (short) 0, 0);
        java.time.LocalDate localDate48 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray37, (int) (byte) 100);
        java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray37, (-1), (int) (short) 10);
        java.util.Date date59 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date59);
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.format(date59);
        java.util.Date date63 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId66 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId66);
        java.lang.String str68 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId66);
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date63, zoneId66);
        java.lang.String str70 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date59, zoneId66);
        long long71 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0001-01-01 00:00:00", zoneId66);
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.toString(122570285040L, false, zoneId66);
        java.lang.String str73 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId66);
        java.time.ZonedDateTime zonedDateTime74 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray37, (int) (byte) 0, (int) (byte) 10, zoneId66);
        // The following exception was thrown during execution in test generation
        try {
            long long75 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, (-1), zoneId66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 14:00:00" + "'", str32, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50401000L) + "'", long33 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1968-01-27" + "'", str34, "1968-01-27");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNull(localTime39);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNull(zonedDateTime51);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01" + "'", str60, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01 00:00:00" + "'", str61, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01" + "'", str67, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "19700101" + "'", str68, "19700101");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-01-01 14:00:00" + "'", str69, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1970-01-01 14:00:00" + "'", str70, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-62135625943000L) + "'", long71 == (-62135625943000L));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1973-11-19 23:18:05.04" + "'", str72, "1973-11-19 23:18:05.04");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-01" + "'", str73, "1970-01-01");
        org.junit.Assert.assertNull(zonedDateTime74);
    }
}

