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
        java.util.Date date1 = null;
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId6);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("57860131", zoneId6);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(date12);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date12);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString(date12);
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId19);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId19);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId19);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10, zoneId19);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId19);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("00.01.0100", zoneId19);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 00.01.0100");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50400000L) + "'", long9 == (-50400000L));
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 00:00:00" + "'", str15, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNull(date21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 14:00:00" + "'", str22, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-02 00:04:20" + "'", str23, "1970-01-02 00:04:20");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1969-12-31 18:00:29");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-50400000L) + "'", long2 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 29143);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 29143);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2097187, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
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
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293792");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        byte[] byteArray5 = new byte[] {};
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray5, (int) (byte) -1);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, (int) (byte) 10);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray5, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 6357024, (int) '4');
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId28);
        java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId28);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId28);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, false, zoneId32);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 1, 0, zoneId32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407907, zoneId32);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.toString((-62135625943000L), false, zoneId32);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis("00000101", zoneId32);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.getZoneId("62550611", zoneId32);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 62550611");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str31, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 08:00:00.1" + "'", str33, "1970-01-01 08:00:00.1");
        org.junit.Assert.assertNull(zonedDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "19700101" + "'", str35, "19700101");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0001-01-01 00:00:00" + "'", str36, "0001-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 101L + "'", long37 == 101L);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-01 14:00:00", "1970-01-01 07:59:59.999");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1968-01-01 14:00:00' could not be parsed at index 2");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray1, (int) (short) -1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray1, 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray1, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray1, 28800);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 00:00:00");
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(date19);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date19, "1969-12-31 17:59:59.999");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date19);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date19);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId29);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("57860131", zoneId29);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId29);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, 3407904, 0, zoneId29);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2006-03-01 13:08:55", zoneId29);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31 00:00:00" + "'", str20, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31 17:59:59.999" + "'", str22, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31 00:00:00" + "'", str23, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19691231" + "'", str24, "19691231");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50400000L) + "'", long32 == (-50400000L));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 14:00:00" + "'", str34, "1969-12-31 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1141189735000L + "'", long36 == 1141189735000L);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        char[] charArray4 = new char[] { '4', ' ' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (byte) 1);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId10);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 3407907, 0, zoneId10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-62134782393L), zoneId10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("", zoneId10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  ]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19680113" + "'", str13, "19680113");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) ' ');
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 6357027);
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 6357089, (-1), charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', '#', '4', 'a', '4', '4', 'a', ' ', ' ', '#', '#', '#', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 2097204);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) (short) -1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 3407969);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) -1);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2293795);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 0);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 3407924);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 1, 2097204, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968-01-27");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 6357027);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(3407000L, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357089, (int) '4', zoneId25);
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
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1969-12-31" + "'", str26, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1969-12-31 18:00:00.01" + "'", str27, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31 17:59:59.999" + "'", str28, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31" + "'", str29, "1969-12-31");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 29143);
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
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1969-12-31 18:00:00");
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray7, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray7, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray7, 100);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 100, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray7, 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray7, 10);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date27);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.format(date27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.toString(date27);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId34);
        java.util.Date date36 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27, zoneId34);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (short) 100, (int) (short) 0, zoneId34);
        long long46 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId34, (int) (byte) 0, 1, 2293795, (int) '#', (int) (byte) -1, 2097204, (int) 'a');
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId34);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:00:00" + "'", str4, "1969-12-31 18:00:00");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 00:00:00" + "'", str30, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 14:00:00" + "'", str37, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 136018776744000L + "'", long46 == 136018776744000L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0001-01-01 13:56:19" + "'", str47, "0001-01-01 13:56:19");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0001-01-01" + "'", str48, "0001-01-01");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0001-01-01 00:00:00" + "'", str49, "0001-01-01 00:00:00");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 10, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 1);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19680127");
        char[] charArray23 = new char[] { '4', ' ' };
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray23, (int) (byte) 1);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray23, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray23, (int) (byte) 1);
        java.time.LocalDate localDate32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray23, 100);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, 100, 0);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray23, 100);
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray23, 10);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.format(date43);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.format(date43);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.toString(date43);
        java.time.ZoneId zoneId50 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId50);
        java.util.Date date52 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId50);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date43, zoneId50);
        long long54 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, (int) (short) 100, (int) (short) 0, zoneId50);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-58754933900L), zoneId50);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(122570285040L, zoneId50);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId50);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime58 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 2097204, zoneId50);
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
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:28:00 CST 1969");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 00:00:00" + "'", str44, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 00:00:00" + "'", str45, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 00:00:00" + "'", str46, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertNull(date52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01 14:00:00" + "'", str53, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1968-02-21" + "'", str55, "1968-02-21");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1973-11-19" + "'", str56, "1973-11-19");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01 13:28:00" + "'", str57, "1970-01-01 13:28:00");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.time.ZoneId zoneId1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) '4');
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
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('4', '#', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        byte[] byteArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2293812, (int) (byte) 100);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId3);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 19:45:57.024-06:00", zoneId3);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-12T14:20:17", zoneId3);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5482764781252003L + "'", long19 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 19:45:57 CST 1969");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Fri Jan 12 00:20:17 CST 1968");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("5844-10-01T01:51:24", 2293812);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-31 11:47:22");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date1, "53751204");
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-31 11:47:22" + "'", str10, "1968-01-31 11:47:22");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "53751204" + "'", str12, "53751204");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 00:00:00" + "'", str15, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 00:00:00" + "'", str16, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407920");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 6357027);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-31 11:47:22");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date1, "53751204");
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(date1, "0032-35-00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-31 11:47:22" + "'", str10, "1968-01-31 11:47:22");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "53751204" + "'", str12, "53751204");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "19700101" + "'", str15, "19700101");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 00:00:00" + "'", str16, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0032-35-00" + "'", str18, "0032-35-00");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969/12/31");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1969-12-31 04:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "00000101");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 04:00:28" + "'", str3, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19691231" + "'", str4, "19691231");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000101" + "'", str6, "00000101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691231" + "'", str7, "19691231");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, (int) (byte) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 08:00:00.032+08:00", 6357024);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 3407904);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6");
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        byte[] byteArray2 = null;
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) -1, (int) (short) 100, zoneId16);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 23:28:00.113", zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("40710108", zoneId16);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 40710108");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Dec 31 09:28:00 CST 1969");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293790");
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
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId7);
        java.time.ZonedDateTime zonedDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId7);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0000-01-01 00:00:00", zoneId7);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 04:00:28", zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("19700101", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19700101");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str10, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-62167248343000L) + "'", long11 == (-62167248343000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100772000L) + "'", long12 == (-100772000L));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 09:28:00");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) -1, (int) '#');
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
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 10, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '4', '#', '4', ' ', ' ', '#', 'a', '4', ' ', '#', ' ', 'a', '4', '4', 'a', '4', ' ', '4', '#', '4', '4', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 6357024, (int) '4');
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId23);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId23);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId23);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, false, zoneId27);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 1, 0, zoneId27);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str26, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 08:00:00.1" + "'", str28, "1970-01-01 08:00:00.1");
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(localTime33);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((-60928207130L), dateTimeFormatPattern6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 10, (int) ' ', (int) ' ', dateTimeFormatPattern6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(58197968982218L, dateTimeFormatPattern6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(21600000L, dateTimeFormatPattern6);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26.01.1968" + "'", str7, "26.01.1968");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32.32.0010" + "'", str8, "32.32.0010");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22.03.3814" + "'", str9, "22.03.3814");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01.01.1970" + "'", str10, "01.01.1970");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00+08:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str5, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-25 23:29:52", 28800);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357024);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407907);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2293857);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) '4', 2293792, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293792");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 23:28:11", (int) (short) -1, 2293857);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969-12-31 23:28:11");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 0);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 3407969);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 0);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(date23);
        char[] charArray27 = null;
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long47 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date48 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId31);
        java.time.ZonedDateTime zonedDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray27, 6357044, (int) (byte) 1, zoneId31);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(10L, zoneId31);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 1, (int) (short) 10, zoneId31);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input  ");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 14:00:00" + "'", str25, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 66118358169080000L + "'", long39 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5482764781252003L + "'", long47 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19700101" + "'", str50, "19700101");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-02 04:00:00" + "'", str51, "1970-01-02 04:00:00");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2097187, 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        char[] charArray3 = new char[] { '4', ' ' };
        java.time.LocalDate localDate5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) (byte) 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray3, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray3, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray3, (int) '#');
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray3, 3407924);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 09:45:57.024", 0);
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId22, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long38 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId22, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-60928207130L), zoneId22);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId22);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray3, 2097204, (int) (byte) 0, zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66318802675201003L, zoneId22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21035");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 66118358169080000L + "'", long30 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 5482764781252003L + "'", long38 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19680127" + "'", str39, "19680127");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 6357000L + "'", long40 == 6357000L);
        org.junit.Assert.assertNull(zonedDateTime41);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId14, 0, 6357027, 2293857, 28800, 0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 6357027");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-31 11:47:22.621");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-31 11:47:22.621");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 6357024, 3407907);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 2097249);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (byte) 100);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2097184);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2293812, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293812");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1968-02-18");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(3407907, 29143, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097204, 28800);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097184);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 0);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 2097184);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357089);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) ' ', zoneId7);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.01", zoneId7);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime13, "19731119");
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime13, "1977-05-02 11:00:00");
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime13);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 18:00:00" + "'", str14, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19731119" + "'", str16, "19731119");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 18:00:00" + "'", str17, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1977-05-02 11:00:00" + "'", str19, "1977-05-02 11:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31 18:00:00" + "'", str20, "1969-12-31 18:00:00");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.time.ZoneId zoneId1 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(21600000L, zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId5);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("57860131", zoneId5);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(date11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString(date11);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId18);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date9, zoneId18);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date9);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString(date9);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString(date26);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId33);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId33);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId33);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date9, zoneId33);
        java.util.Date date38 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId33);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-02 00:04:20" + "'", str22, "1970-01-02 00:04:20");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 10:04:20.131" + "'", str23, "1970-01-01 10:04:20.131");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 10:04:20.131" + "'", str24, "1970-01-01 10:04:20.131");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-02 00:04:20" + "'", str37, "1970-01-02 00:04:20");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Jan 02 09:54:17 CST 1");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) 'a', (int) (byte) 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 3407969);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 3407924);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId20);
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId20);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId20);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("00000101", zoneId20);
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 100, (int) (byte) 0, zoneId20);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 2097184);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-28800000L) + "'", long23 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(localTime28);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("2006/03/01T13:08:55", zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1968-02-21", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-02-21");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1141189735000L + "'", long5 == 1141189735000L);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("4271-02-15 22:25:45");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 72616537545000L + "'", long1 == 72616537545000L);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date15);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(date15, "1970-01-01 08:00:00.1");
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId31);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId31);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId31);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId31);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, 2097184, (int) (byte) 10, 2097204, 2097184, 0, (int) (short) -1, (int) ' ');
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 04:00:00", zoneId31);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 1, (int) (byte) 100, zoneId31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 08:00:00.1" + "'", str25, "1970-01-01 08:00:00.1");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-28800000L) + "'", long34 == (-28800000L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 66298749505407000L + "'", long43 == 66298749505407000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-100800000L) + "'", long44 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) -1, 6357044);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00.001+08:00");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31T18:00:28");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str8, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (short) -1);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2097249);
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
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        char[] charArray11 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray11, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray11, (int) (short) 1);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray11, (int) (byte) 0, (int) (byte) 0, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId18);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006/03/01T13:08:55", zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-50400000L), zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 07:59:59.999+08:00", zoneId18);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 07:59:59.999+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Feb 28 23:08:55 CST 2006");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19691231" + "'", str22, "19691231");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', 'a', 'a', 'a', ' ', '#', 'a', '4', 'a', '4', 'a', '4', '#', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 28800);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 6357044);
        java.nio.charset.Charset charset21 = null;
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2097204, (int) (byte) 0, charset21);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 100);
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
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 2097249);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '#', 'a', '4', '#', ' ', '#', 'a', ' ', 'a', '4', '4', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(116485939209599L, dateTimeFormatPattern3);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:00:00" + "'", str4, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 18:00:00" + "'", str5, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5661-04-16 16:20:09" + "'", str6, "5661-04-16 16:20:09");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 2097249);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 3407969);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0000-10-00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 28800);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) ' ');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 29143);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('4', '#', ' ', ' ', ' ', '#', ' ', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("-3428-02-1 00:58:29.324+08:05", 2097187, 0);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 3407924);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 3407969);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407965");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) (short) -1, 3407907);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) (short) 10, 2293795);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 1, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 6357044);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) '#');
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 3407907);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', ' ', 'a', '4', 'a', '4', '4', 'a', '#', ' ', '4', '#', ' ', ' ', '4', ' ', ' ', ' ', ' ', ' ', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 28800);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2097204);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 0, (int) (byte) 1);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(6357024, 2097184, 3407924, 1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        char[] charArray28 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray28, (int) ' ');
        java.time.LocalTime localTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray28, (int) (short) 1);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray28, (int) (byte) 0, (int) (byte) 0, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId35);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.001", zoneId35);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 10, zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2097204, (int) '#', zoneId35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localTime32);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 08:00:00.001" + "'", str37, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-02 04:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-02 04:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2293792, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293792");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', (int) (byte) 0, 2097184, dateTimeFormatPattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId6);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId16);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId16);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId16);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 09:45:57");
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62135625943000L) + "'", long8 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100772000L) + "'", long9 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 17:59:59.999" + "'", str19, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31 04:00:28" + "'", str22, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 09:45:57" + "'", str24, "1970-01-01 09:45:57");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-31 04:00:28" + "'", str25, "1969-12-31 04:00:28");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId6);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId16);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId16);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId16);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-02-21 00:00:00");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62135625943000L) + "'", long8 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100772000L) + "'", long9 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 17:59:59.999" + "'", str19, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1968-02-21 00:00:00" + "'", str23, "1968-02-21 00:00:00");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("4261/10/21T15:23:14", "6280/04/06T04:32:24");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2293792, 3407904, 2097187, (int) 'a', 2293812, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22937");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 0, (int) (byte) 0, zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId14);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("6280/04/06T04:32:24", zoneId14);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date17, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 08:00:00.001" + "'", str16, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Apr 05 15:32:24 CDT 6280");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
        java.nio.charset.Charset charset15 = null;
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime17);
        char[] charArray22 = new char[] { '4', ' ' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray22, (int) (byte) 1);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId28);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, 3407907, 0, zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(10L, zoneId28);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId28);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) ' ', (int) (short) 0, charset15, zoneId28);
        java.lang.Class<?> wildcardClass34 = zoneId28.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 04:00:28" + "'", str18, "1969-12-31 04:00:28");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(28800, 2293792, 3407904, (int) (short) 100, 0, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 288");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, (int) (short) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = localDateTime13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (short) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, 2293792);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 2097204, zoneId14);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(122392861440L, zoneId14);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis("5717-06-15", zoneId14);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1973-11-17" + "'", str21, "1973-11-17");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 118258156800000L + "'", long22 == 118258156800000L);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) -1);
        java.nio.charset.Charset charset16 = null;
        char[] charArray23 = new char[] { '4', ' ' };
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray23, (int) (byte) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, 3407907, 0, zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 17:59:59", zoneId29);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01 00:00:00", zoneId29);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122570285040L, zoneId29);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 19:45:57", zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 29143, 3407969, charset16, zoneId29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4,  ]");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50401000L) + "'", long32 == (-50401000L));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19731119" + "'", str34, "19731119");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 05:45:57 CST 1969");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097204);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 6357027);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2293795, 28800);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59+08:00", zoneId30);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 0, zoneId30);
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime33);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, 6357044);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) (byte) -1, (int) ' ', charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 3407907, (int) (short) 100);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 2097184, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((long) 6357027);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) ' ', zoneId7);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.01", zoneId7);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime13, "19731119");
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime13, "6255/06/11");
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 18:00:00" + "'", str14, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19731119" + "'", str16, "19731119");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 18:00:00" + "'", str17, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6255/06/11" + "'", str19, "6255/06/11");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.ZoneId zoneId19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, 2293792, 6357024, zoneId19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293792");
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(1141240135000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(3407907, 2097187, (int) (short) 100, 3407904, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 113021986540211L + "'", long6 == 113021986540211L);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("31.12.1969 18:56:47");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2097249);
        java.lang.Class<?> wildcardClass20 = charArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 2097204);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) (short) -1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 3407969);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 3407969);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2293795);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 6357027);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) ' ');
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) '#');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 6357089);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
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
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) '4');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (byte) -1);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, 28800);
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
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, 0);
        java.nio.charset.Charset charset15 = null;
        byte[] byteArray16 = new byte[] {};
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray16, (int) (byte) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray16, (int) (byte) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray16, (int) ' ');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray16, (int) (short) -1);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray16, 1);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray16, (int) (byte) 10);
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray16, 28800);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 00:00:00");
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.toString(date34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.format(date34, "1969-12-31 17:59:59.999");
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString(date34);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date34);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId44);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId44);
        long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId44);
        java.util.Date date48 = com.alibaba.fastjson2.util.DateUtils.parseDate("57860131", zoneId44);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId44);
        java.time.ZonedDateTime zonedDateTime50 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray16, 3407904, 0, zoneId44);
        long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray6, 2097187, (int) (short) 0, charset15, zoneId44);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31 00:00:00" + "'", str35, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31 17:59:59.999" + "'", str37, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 00:00:00" + "'", str38, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19691231" + "'", str39, "19691231");
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01" + "'", str45, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19700101" + "'", str46, "19700101");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-50400000L) + "'", long47 == (-50400000L));
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31 14:00:00" + "'", str49, "1969-12-31 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (short) 10);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (-1));
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 28800, 6357027);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) 'a', (int) (byte) 100);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = localDateTime23.getClass();
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, 3407907);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 2097249);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) '#');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-02-20");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Feb 20 00:00:00 CST 1968");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId6);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId6);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 04:00:29", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31 18:00:28", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31 18:00:28");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28800000L) + "'", long9 == (-28800000L));
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-100771000L) + "'", long11 == (-100771000L));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 29143);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId21);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString(5479651014900000L, true, zoneId21);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("19770503", zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 1, zoneId21);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+175613-03 01:55:00+08:00" + "'", str24, "+175613-03 01:55:00+08:00");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon May 02 11:00:00 CDT 1977");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-62135625943000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000-12-31 10:03:41" + "'", str1, "0000-12-31 10:03:41");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) '4');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1968-02-01 01:47:22");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-02-01 01:47:22");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097249);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (byte) 0, (int) (byte) -1);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 0);
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) (short) 100);
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
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDate27);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, (int) '#');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, (int) (short) 100, 3407969);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId6);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId16);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId16);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId16);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime23, "19700101");
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId28);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime23, zoneId28);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId28);
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId38);
        java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId38);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId38);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId38);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "5844-10-01T01:51:24");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62135625943000L) + "'", long8 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100772000L) + "'", long9 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 17:59:59.999" + "'", str19, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-62135625943000L) + "'", long30 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-100772000L) + "'", long31 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str41, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-100772000L) + "'", long43 == (-100772000L));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 28800);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2097204);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 100);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) '4');
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097249, 3407907);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 6357044);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357089);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-100772000L) + "'", long7 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 04:00:28" + "'", str8, "1969-12-31 04:00:28");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50372000L) + "'", long9 == (-50372000L));
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', 'a', 'a', ' ', ' ', 'a', '4', ' ', '#', ' ', ' ', 'a', '4', 'a', '4', 'a', '4', '4', '#', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (-1));
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) -1, 6357024);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407904);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 6357027);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 29143);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 6357089, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097204);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 100);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 100);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId27);
        java.util.Date date45 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-25 23:29:52", zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (byte) 10, 6357027, zoneId27);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 66118358169080000L + "'", long35 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5482764781252003L + "'", long43 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 25 09:29:52 CST 1968");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29140");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 29143);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, (int) '#', 3407907);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097184);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (byte) 10, (int) (short) 0);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 0, (int) (short) 1);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 3407924, 0);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 10);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4L + "'", long21 == 4L);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-50371000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 2097204, 6357044);
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((-60928207130L), dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 10, (int) ' ', (int) ' ', dateTimeFormatPattern5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(8944082709969L, dateTimeFormatPattern5);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "26.01.1968" + "'", str6, "26.01.1968");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32.32.0010" + "'", str7, "32.32.0010");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "05.06.2253" + "'", str8, "05.06.2253");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-27");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-27");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2293795);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2293792);
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
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969/12/31T17:59:59");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) 0);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 3407924, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -28");
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
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407907);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2293857);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId27);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 28800, zoneId27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str32, "1970-01-01 08:00:00.001+08:00");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, (int) (short) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 6357044);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId27);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId27);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122570285040L, zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 6357027, 2293857, zoneId27);
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 66118358169080000L + "'", long35 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5482764781252003L + "'", long43 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-100800000L) + "'", long45 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19731119" + "'", str46, "19731119");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray5, (int) 'a', 3407924);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 100);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long17 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId1);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date18, "1970-01-01 08:00:00.001");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString(date18);
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5482764781252003L + "'", long17 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 08:00:00.001" + "'", str20, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-31 18:00:00" + "'", str21, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31 18:00:00.001" + "'", str22, "1969-12-31 18:00:00.001");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        char[] charArray5 = new char[] { '4', ' ' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray5, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray5, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray5, 100);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 100, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 100);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 10);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(date25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString(date25);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId32);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date25, zoneId32);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, (int) (short) 100, (int) (short) 0, zoneId32);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString(2097000L, true, zoneId32);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 22:55:51.204+08:00", zoneId32);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 22:55:51.204+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertNull(date34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 14:00:00" + "'", str35, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 08:34:57+08:00" + "'", str37, "1970-01-01 08:34:57+08:00");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097249, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (byte) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 10, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293822");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 10);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 2097204);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) 'a');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(2097184, 0, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (-1));
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 28800, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDateTime14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, (int) (short) 1);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray5, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097182");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, (-1), 0);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.time.LocalDate localDate0 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 13:28:11.231+08:00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        byte[] byteArray0 = null;
        long long3 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31");
        long long4 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3);
        char[] charArray9 = new char[] { '4', ' ' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray9, (int) (byte) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId15);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, 3407907, 0, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-62134782393L), zoneId15);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId15);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime22, "19700101");
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId27);
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId27);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime22, zoneId27);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId37);
        java.util.Date date41 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId37);
        long long42 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime22, zoneId37);
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime44, "19700101");
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId49);
        long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId49);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime44, zoneId49);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime22, zoneId49);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId49, 2097184, 0, 2097184, 0, 2097249, (int) (byte) -1, 3407924);
        long long62 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:56:47", zoneId49);
        long long63 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId49);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime3);
        java.time.ZoneId zoneId67 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long75 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId67, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long83 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId67, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date84 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId67);
        java.util.Date date85 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 19:45:57.024-06:00", zoneId67);
        long long86 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId67);
        long long87 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 13:28:11", zoneId67);
        long long95 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId67, (int) '4', 3407969, 28800, 6357024, (int) (byte) 0, (int) (short) 10, 3407969);
        java.lang.String str96 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-63136800000L), zoneId67);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-64800000L) + "'", long4 == (-64800000L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-64800000L) + "'", long5 == (-64800000L));
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19680113" + "'", str18, "19680113");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200000L) + "'", long19 == (-115200000L));
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-62135625943000L) + "'", long29 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100772000L) + "'", long30 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31" + "'", str38, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31 18:00:00.01" + "'", str39, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1969-12-31 17:59:59.999" + "'", str40, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-50372000L) + "'", long42 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19700101" + "'", str46, "19700101");
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-62135625943000L) + "'", long51 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-100772000L) + "'", long52 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-100772000L) + "'", long53 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 66299887418939003L + "'", long61 == 66299887418939003L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-46993000L) + "'", long62 == (-46993000L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-115200000L) + "'", long63 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1969-12-31 00:00:00" + "'", str64, "1969-12-31 00:00:00");
        org.junit.Assert.assertNotNull(zoneId67);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 66118358169080000L + "'", long75 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 5482764781252003L + "'", long83 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Wed Dec 31 19:45:57 CST 1969");
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-115200000L) + "'", long86 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 19691000L + "'", long87 == 19691000L);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 8948586958730003L + "'", long95 == 8948586958730003L);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "19680101" + "'", str96, "19680101");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(3407904, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 0);
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        char[] charArray5 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray14, 100);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId24);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray14, 2097249, 1, zoneId24);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 100, 28800, zoneId24);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 6357024, zoneId24);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (byte) 0, zoneId24);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-62135625943000L), zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("1973-10-13 22:21:35", "1970-01-01 07:59:59", zoneId24);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1973-10-13 22:21:35' could not be parsed at index 3");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0001-01-01" + "'", str33, "0001-01-01");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 09:45:57.024");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 2293857);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) '4');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (byte) -1);
        char[] charArray23 = null;
        byte[] byteArray26 = new byte[] {};
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray26, (int) (byte) -1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray26, (int) (byte) 10);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray26, (int) ' ');
        java.time.LocalTime localTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray26, (int) (short) 1);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray26, (int) (short) 1, (int) (byte) 10, zoneId37);
        java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray23, (int) (short) 0, (int) 'a', zoneId37);
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31", zoneId37);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, 29143, zoneId37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localTime34);
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertNull(zonedDateTime38);
        org.junit.Assert.assertNull(zonedDateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-64800000L) + "'", long40 == (-64800000L));
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 10, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(0, 6357027, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 14:00:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "4261/10/21T15:23:14");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("21600212");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId8);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId8);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("2253-06-30 00:34:04.717-05:00", zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 08:00:00.001", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.001");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str11, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jun 30 00:34:04 CDT 2253");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) -1, 2293795, (int) (byte) 0, (int) '#', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("0035/32/00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0035/32/00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, (int) (short) 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-00-10" + "'", str3, "0000-00-10");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 6357027);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 3407924);
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
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) 3407907, dateTimeFormatPattern5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(2097204, (int) 'a', 6357044, dateTimeFormatPattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20972");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:56:47" + "'", str7, "31.12.1969 18:56:47");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1969-12-31 03:59:59");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "+08:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1970-01-01 13:28:11");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 03:59:59" + "'", str3, "1969-12-31 03:59:59");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+08:00" + "'", str5, "+08:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000-01-01 00:00:00" + "'", str6, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 13:28:11" + "'", str8, "1970-01-01 13:28:11");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 19:45:57");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 00:00:00");
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        char[] charArray9 = new char[] { '4', ' ' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray9, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray9, (int) (short) 100, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray9, (int) (short) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray9, (int) (byte) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray9, (int) (byte) 10);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray9, (int) ' ');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray9, 0);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray33, 100);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId43 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId43);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId43);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId43);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId43);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray33, 2097249, 1, zoneId43);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 10, 0, zoneId43);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId43);
        long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2006-03-02 03:08:55", zoneId43);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6357000L + "'", long5 == 6357000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 19:45:57" + "'", str6, "1969-12-31 19:45:57");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-44043000L) + "'", long50 == (-44043000L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1141240135000L + "'", long51 == 1141240135000L);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('a', '4', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
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
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 2097184);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) ' ');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 29143);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (short) 0, 6357044);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 07:59:59.999");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50399999L + "'", long1 == 50399999L);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long23 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId7);
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId7);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, true, zoneId7);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1141240135347L, zoneId7);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31 14:00:00", zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1973-11-17T08:01:01", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1973-11-17T08:01:01");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 66118358169080000L + "'", long15 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5482764781252003L + "'", long23 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-100800000L) + "'", long25 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 08:00:00.1+08:00" + "'", str26, "1970-01-01 08:00:00.1+08:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2006-03-02" + "'", str27, "2006-03-02");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Tue Jan 31 00:00:00 CST 5786");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 13:28:11.231");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 13:28:11 CST 1970");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357023");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 29143);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 28800);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407924);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = localDateTime18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.time.LocalDateTime localDateTime0 = null;
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId8);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("00000101", zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString((-50372000L), true, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime0, zoneId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28800000L) + "'", long11 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 18:00:28+08:00" + "'", str14, "1969-12-31 18:00:28+08:00");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097204);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 100);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 10);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 1, (int) '4');
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (short) 100);
        java.time.LocalDate localDate33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) '#');
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localDate33);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097204, (int) 'a');
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId24);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006/03/01T13:08:55", zoneId24);
        java.time.ZonedDateTime zonedDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 28800, (int) (byte) 1, zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 2293857);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Tue Feb 28 23:08:55 CST 2006");
        org.junit.Assert.assertNull(zonedDateTime27);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(6357089, 2097187, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 3407907);
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
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("6255-06-11 10:13:29", (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 6255-06-11 10:13:29");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        char[] charArray4 = new char[] { 'a', '4', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 2293792, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5701716");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, a,  ]");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray3, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097181");
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
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 0);
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
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 0);
        char[] charArray16 = new char[] { '4', ' ' };
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray16, (int) (byte) 1);
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId22);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray16, 3407907, 0, zoneId22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-62134782393L), zoneId22);
        java.time.ZonedDateTime zonedDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) 1, 0, zoneId22);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 3407924);
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
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ]");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19680113" + "'", str25, "19680113");
        org.junit.Assert.assertNull(zonedDateTime26);
        org.junit.Assert.assertNull(localTime28);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "26.01.1968");
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime5, "19700101");
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId10);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId10);
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId10);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId20);
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId20);
        long long25 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId20);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime5);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime29, "19700101");
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId34);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId34);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime29, zoneId34);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId44);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId44);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId44);
        java.util.Date date48 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId44);
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime29, zoneId44);
        java.time.LocalDateTime localDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime51, "19700101");
        java.time.ZoneId zoneId56 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId56);
        long long58 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId56);
        long long59 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime51, zoneId56);
        long long60 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime29, zoneId56);
        java.util.Date date61 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31T18:00:00", zoneId56);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId56);
        long long63 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId56);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-01-16 11:13:50.429");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "26.01.1968" + "'", str3, "26.01.1968");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-62135625943000L) + "'", long12 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100772000L) + "'", long13 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-31" + "'", str21, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31 18:00:00.01" + "'", str22, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31 17:59:59.999" + "'", str23, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-50372000L) + "'", long25 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1969-12-31 04:00:28" + "'", str26, "1969-12-31 04:00:28");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-62135625943000L) + "'", long36 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-100772000L) + "'", long37 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1969-12-31" + "'", str45, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1969-12-31 18:00:00.01" + "'", str46, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1969-12-31 17:59:59.999" + "'", str47, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-50372000L) + "'", long49 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "19700101" + "'", str53, "19700101");
        org.junit.Assert.assertNotNull(zoneId56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-62135625943000L) + "'", long58 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-100772000L) + "'", long59 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-100772000L) + "'", long60 == (-100772000L));
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-100772000L) + "'", long62 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-100772000L) + "'", long63 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1968-01-16 11:13:50.429" + "'", str65, "1968-01-16 11:13:50.429");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(6357089, 2293795, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 28800);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 2293795, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2293795, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293795");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, 3407907);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 2097249);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray5, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 10, (int) 'a');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 28800);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 3407969, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -48");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 19:45:57");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 00:00:00");
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        char[] charArray9 = new char[] { '4', ' ' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray9, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray9, (int) (short) 100, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray9, (int) (short) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray9, (int) (byte) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray9, (int) (byte) 10);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray9, (int) ' ');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray9, 0);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray33, 100);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId43 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId43);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId43);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId43);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId43);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray33, 2097249, 1, zoneId43);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 10, 0, zoneId43);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId43);
        java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1977-05-04 07:35:17.618+08:00", zoneId43);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime51);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6357000L + "'", long5 == 6357000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 19:45:57" + "'", str6, "1969-12-31 19:45:57");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-44043000L) + "'", long50 == (-44043000L));
        org.junit.Assert.assertNotNull(zonedDateTime51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1977-05-04 07:35:17" + "'", str52, "1977-05-04 07:35:17");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 0);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 6357024);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 29143);
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
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-02-18 00:00:00", (int) '#');
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) -1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 29143);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 29143);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 100, (int) ' ', zoneId24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969-12-31" + "'", str25, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1969-12-31 18:00:00.01" + "'", str26, "1969-12-31 18:00:00.01");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 0, (int) (byte) 0, zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId17);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006/03/01T13:08:55", zoneId17);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-31 17:59:59");
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId23);
        char[] charArray29 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray29, (int) ' ');
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray29, (int) (short) 1);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray29, (int) (byte) 0, (int) (byte) 0, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId36);
        byte[] byteArray41 = new byte[] {};
        java.time.LocalTime localTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray41, (int) (byte) -1);
        java.time.LocalDateTime localDateTime45 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray41, (int) (byte) 10);
        java.time.LocalDateTime localDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray41, (int) ' ');
        java.time.LocalDate localDate49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray41, (int) 'a');
        java.time.LocalTime localTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray41, 100);
        java.time.LocalDateTime localDateTime54 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray41, 6357024, (int) '4');
        java.time.ZoneId zoneId64 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId64);
        java.time.ZonedDateTime zonedDateTime66 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId64);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId64);
        java.time.ZoneId zoneId68 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId64);
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, false, zoneId68);
        java.time.ZonedDateTime zonedDateTime70 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray41, 1, 0, zoneId68);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(72619610453040L, zoneId68);
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId68);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId73 = com.alibaba.fastjson2.util.DateUtils.getZoneId("0001-00-01", zoneId68);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0001-00-01");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Feb 28 23:08:55 CST 2006");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 07:59:59" + "'", str24, "1970-01-01 07:59:59");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 07:59:59" + "'", str38, "1970-01-01 07:59:59");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2006-03-01 13:08:55" + "'", str39, "2006-03-01 13:08:55");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNull(localTime43);
        org.junit.Assert.assertNull(localDateTime45);
        org.junit.Assert.assertNull(localDateTime47);
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localTime51);
        org.junit.Assert.assertNull(localDateTime54);
        org.junit.Assert.assertNotNull(zoneId64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str67, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-01-01 08:00:00.1" + "'", str69, "1970-01-01 08:00:00.1");
        org.junit.Assert.assertNull(zonedDateTime70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "4271-03-24" + "'", str71, "4271-03-24");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2006-03-01 13:08:55" + "'", str72, "2006-03-01 13:08:55");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407969);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 6357024);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '#');
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
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29140");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407969);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) '#');
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) '4');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 10);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 6357024);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 10);
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
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month(' ', '#', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293795, (int) (byte) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097249);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime21, "19700101");
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId26);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId26);
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId26);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId36);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId36);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) -1, 10, zoneId36);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-62135625943000L) + "'", long28 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100772000L) + "'", long29 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31" + "'", str37, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 18:00:00.01" + "'", str38, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31 17:59:59.999" + "'", str39, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-50372000L) + "'", long41 == (-50372000L));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31T17:59:59", "1969-12-31 18:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1969/12/31T17:59:59' could not be parsed at index 4");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097245");
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
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 2097204);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407924);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (-1));
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) 2293857, dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(136018776744000L, dateTimeFormatPattern5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(3407924, (int) (byte) 0, 6357089, dateTimeFormatPattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969/12/31T18:38:13" + "'", str6, "1969/12/31T18:38:13");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6280/04/06T04:32:24" + "'", str7, "6280/04/06T04:32:24");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 07:59:59");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 07:59:59 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (byte) -1, 3407924);
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
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-02-17 19:44:08", 2097187);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.time.ZoneId zoneId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.toString((-170538775175493L), true, zoneId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, 2293795);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) '#', 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
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
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId8);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) ' ', zoneId8);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId8);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString((long) 2293857, false, zoneId8);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-28800000L) + "'", long11 == (-28800000L));
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 08:38:13.857" + "'", str15, "1970-01-01 08:38:13.857");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        char[] charArray0 = null;
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray0, (int) (short) 100, 28800, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId6, (int) (byte) 0, (int) 'a', (int) '#', 2293795, (int) 'a', 2097184, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 97");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31" + "'", str7, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 19:45:57.024-06:00" + "'", str8, "1969-12-31 19:45:57.024-06:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('#', 'a', 'a', '4', '#', '4', ' ', 'a');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.Class<?> wildcardClass8 = localDate0.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 6357089);
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
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1969-12-31 18:34:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 100);
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293795, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 10, (-1));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 28800);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 2097249);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2097204, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
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
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357024);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 28800);
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) (byte) 100, dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(107480576433327L, dateTimeFormatPattern4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(9239865553631L, dateTimeFormatPattern4);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969/12/31" + "'", str5, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969/12/31" + "'", str6, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5375/12/03" + "'", str7, "5375/12/03");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262/10/19" + "'", str8, "2262/10/19");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("57860131");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5786-01-31" + "'", str2, "5786-01-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "57860131" + "'", str3, "57860131");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5786-01-31" + "'", str4, "5786-01-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "57860131" + "'", str5, "57860131");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId9);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId9);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId9);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId9);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("00000101", zoneId9);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString((-50372000L), true, zoneId9);
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("6255-06-11 10:13:29", zoneId9);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId9);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-28800000L) + "'", long12 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31 18:00:28+08:00" + "'", str15, "1969-12-31 18:00:28+08:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 135235448009000L + "'", long16 == 135235448009000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(2097204, (int) (short) 100, 3407907, 0, 6357089, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66414284782140L + "'", long6 == 66414284782140L);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, 6357044);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray5, 2293795);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, (int) '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 6357024, 3407907);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) '4');
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 0);
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId7);
        java.time.ZonedDateTime zonedDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId7);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 100, false, zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId11, (int) (byte) -1, 6357024, (int) (byte) 10, (int) (byte) -1, 28800, 0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 6357024");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str10, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 08:00:00.1" + "'", str12, "1970-01-01 08:00:00.1");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2293795);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 1);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 0);
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(date10, "1970-01-01 13:28:11.231");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:28" + "'", str11, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 13:28:11.231" + "'", str13, "1970-01-01 13:28:11.231");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId6);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 00:00:00", zoneId6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId6, (int) (byte) 0, (int) (byte) 0, 1, 6357027, 0, 2097204, 28800);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 14:00:00" + "'", str9, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115200000L) + "'", long10 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (short) -1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 29143);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1970-01-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2293795, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray6, 3407924);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray6, (int) (short) 1);
        char[] charArray21 = new char[] { '4', ' ' };
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray21, (int) (byte) 1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray21, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray21, (int) (byte) 1);
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray21, 100);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, 100, 0);
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray21, 100);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray21, 10);
        java.util.Date date41 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.format(date41);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.format(date41);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.toString(date41);
        java.time.ZoneId zoneId48 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId48);
        java.util.Date date50 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId48);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date41, zoneId48);
        long long52 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, (int) (short) 100, (int) (short) 0, zoneId48);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-58754933900L), zoneId48);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(122570285040L, zoneId48);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray6, 3407924, zoneId48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4,  ]");
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 00:00:00" + "'", str42, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01 00:00:00" + "'", str43, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 00:00:00" + "'", str44, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01" + "'", str49, "1970-01-01");
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01 14:00:00" + "'", str51, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1968-02-21" + "'", str53, "1968-02-21");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1973-11-19" + "'", str54, "1973-11-19");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2293812);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1970-01-01 08:00:00.1", 1, 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1970-01-01 08:00:00.1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (short) 10);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) 'a');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray3, 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ??");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, (int) (byte) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) '4');
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ?????");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 2097204);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date38 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId21);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId21);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122570285040L, zoneId21);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(9239052568452L, false, zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2097249, 2097204, zoneId21);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 66118358169080000L + "'", long29 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5482764781252003L + "'", long37 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-100800000L) + "'", long39 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19731119" + "'", str40, "19731119");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2262-10-10 19:29:28.452" + "'", str41, "2262-10-10 19:29:28.452");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-02-02 07:10:42", "0052-10-32");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1968-02-02 07:10:42' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(6357000L, dateTimeFormatPattern3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((-100801000L), dateTimeFormatPattern3);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31.12.1969" + "'", str4, "31.12.1969");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969" + "'", str5, "31.12.1969");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "30.12.1969" + "'", str6, "30.12.1969");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) '#');
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) 100);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) '#');
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
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 28800);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) ' ');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (short) -1);
        java.nio.charset.Charset charset21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 10, 6357089, charset21);
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 28800);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407969);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) 10);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 2097184, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5505108");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId28);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId28);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (short) 1, zoneId28);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((-60502358000L), false, zoneId28);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(119416895000L, zoneId28);
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
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertNull(zonedDateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1968-02-01 01:47:22" + "'", str33, "1968-02-01 01:47:22");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19731014" + "'", str34, "19731014");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 6357024, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8454273");
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
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray6, 2097249, 29143);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, (int) (byte) 100);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId32);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId32);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) 'a', (int) (short) 0, zoneId32);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray6, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31" + "'", str33, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 18:00:00.01" + "'", str34, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNull(zonedDateTime35);
        org.junit.Assert.assertNull(localDateTime37);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(107480576433327L, zoneId8);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.001", zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(72619610453040L, zoneId8);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 00:00:00", zoneId8);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime15, "0052-10-32");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str11, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "53751204" + "'", str12, "53751204");
        org.junit.Assert.assertNotNull(zonedDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4271-03-24" + "'", str14, "4271-03-24");
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0052-10-32" + "'", str17, "0052-10-32");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId5);
        java.time.ZonedDateTime zonedDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId5);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 3407924, 1, 6357024, 3407907, 2097184, (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969/12/31T17:59:59", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969/12/31T17:59:59");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str8, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 108030282971962000L + "'", long16 == 108030282971962000L);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) -1, 2097249);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357027);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (short) -1);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (short) 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1969/12/31T18:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (byte) 0);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 6357024, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (short) 1, (int) (short) 0);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 6357024);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (short) 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 6357089);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 10, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097204);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 100, (int) (byte) 1, 0, dateTimeFormatPattern7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(3407904, (int) (byte) 0, 6357024, dateTimeFormatPattern7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern7 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT + "'", dateTimeFormatPattern7.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DOT));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969" + "'", str8, "31.12.1969");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00.01.0100" + "'", str9, "00.01.0100");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 2097249, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097301");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:56:47");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:56:47 CST 1969");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097204);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 100);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 10);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 2293857);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.nio.charset.Charset charset33 = null;
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId38);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId38);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId38);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.032+08:00", zoneId38);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407904, (int) '4', charset33, zoneId38);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertNotNull(zonedDateTime42);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2293795, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293793");
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
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) 'a', (int) (byte) 100);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2293795);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-60928207130L), zoneId4);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2293795, zoneId4);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(491645759861003L, false, zoneId4);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66118358169080000L + "'", long12 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5482764781252003L + "'", long20 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19680127" + "'", str21, "19680127");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+17549-08- 18:37:41.003" + "'", str23, "+17549-08- 18:37:41.003");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 17:59:59");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        char[] charArray5 = null;
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray14, 100);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId24);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId24);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray14, 2097249, 1, zoneId24);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 100, 28800, zoneId24);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 6357024, zoneId24);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (byte) 0, zoneId24);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId24);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 08:00:00");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1000L) + "'", long2 == (-1000L));
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50401000L) + "'", long33 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 08:00:00" + "'", str35, "1970-01-01 08:00:00");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407924");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("62550611");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 62550611");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '4', '4', '#', '#', '#', '4', '4', '4', ' ', '4', '#', 'a', 'a', '4', '#', '4', '4', '4', '#', ' ', 'a', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 03:59:59");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1968-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 03:59:59" + "'", str2, "1969-12-31 03:59:59");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 03:59:59" + "'", str5, "1969-12-31 03:59:59");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1968-01-01" + "'", str7, "1968-01-01");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "0001/00/10");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "2262-10-10 19:29:28.452");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000101" + "'", str2, "00000101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0001/00/10" + "'", str4, "0001/00/10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000-01-01 00:00:00" + "'", str5, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000101" + "'", str6, "00000101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2262-10-10 19:29:28.452" + "'", str8, "2262-10-10 19:29:28.452");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097184);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 29143);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) 0);
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
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-02-17 19:44:08");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1968-02-17 19:44:08" + "'", str4, "1968-02-17 19:44:08");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357024);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 28800);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 3407907);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407904);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969/12/31");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long3 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64800000L) + "'", long2 == (-64800000L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-64800000L) + "'", long3 == (-64800000L));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (-1));
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 6357089);
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
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 29143);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2293857);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 1);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293795, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357044);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407900");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407965");
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
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2293795);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 3407969, (int) (byte) 0);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId29, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long45 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId29, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId29);
        long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId29);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, true, zoneId29);
        java.util.Date date49 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 10:04:20.131", zoneId29);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.toString(231550517618L, true, zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 6357089, zoneId29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
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
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 66118358169080000L + "'", long37 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 5482764781252003L + "'", long45 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-100800000L) + "'", long47 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01 08:00:00.1+08:00" + "'", str48, "1970-01-01 08:00:00.1+08:00");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 20:04:20 CST 1969");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1977-05-04 07:35:17.618+08:00" + "'", str50, "1977-05-04 07:35:17.618+08:00");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId5);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId5);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, true, zoneId5);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1973-10-13 22:21:35", zoneId5);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime25);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66118358169080000L + "'", long13 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5482764781252003L + "'", long21 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100800000L) + "'", long23 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 08:00:00.1+08:00" + "'", str24, "1970-01-01 08:00:00.1+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1973-10-13 22:21:35" + "'", str26, "1973-10-13 22:21:35");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("31.12.1969 18:00:00", zoneId23);
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001-01-01 00:00:00", zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, 6357089, zoneId23);
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-62135575764000L) + "'", long25 == (-62135575764000L));
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date19);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date19);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date19, "1970-01-01 13:28:11.231");
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId26);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59+08:00", zoneId26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId26);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 28800, (int) (byte) 0, zoneId26);
        java.time.LocalDate localDate32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (-1));
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
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 13:28:11.231" + "'", str23, "1970-01-01 13:28:11.231");
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 14:00:00" + "'", str29, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(localDate32);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(107481770809235000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (-1));
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 6357044);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.format(date28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.format(date28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.toString(date28);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId35);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date28, zoneId35);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId35);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId35);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 2097204, zoneId35);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097249, zoneId35);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(120424011872003L, zoneId35);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-30 14:38:13", zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 6357027, zoneId35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
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
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01 00:00:00" + "'", str30, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 00:00:00" + "'", str31, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 14:00:00" + "'", str38, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50401000L) + "'", long39 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str40, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "19700101" + "'", str41, "19700101");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "5786-01-31" + "'", str43, "5786-01-31");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Tue Dec 30 00:38:13 CST 1969");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 100);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 0, 3407924);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, 3407924);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 29143);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, 2097249);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', 'a', '#', 'a', ' ', 'a', '4', '#', '#', ' ', ' ', '#', ' ', '4', '4', ' ', 'a', 'a', 'a', 'a', '4', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2293795);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime24, "19700101");
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24, zoneId29);
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId39);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId39);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId39);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId39);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24, zoneId39);
        java.time.LocalDateTime localDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime46, "19700101");
        java.time.ZoneId zoneId51 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId51);
        long long53 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId51);
        long long54 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime46, zoneId51);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24, zoneId51);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.toString((long) 3407907, false, zoneId51);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.toString((-170340217633676L), true, zoneId51);
        // The following exception was thrown during execution in test generation
        try {
            long long58 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 2097249, zoneId51);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-62135625943000L) + "'", long31 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1969-12-31" + "'", str40, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1969-12-31 18:00:00.01" + "'", str41, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1969-12-31 17:59:59.999" + "'", str42, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-50372000L) + "'", long44 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "19700101" + "'", str48, "19700101");
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-62135625943000L) + "'", long53 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-100772000L) + "'", long54 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-100772000L) + "'", long55 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01 08:56:47.907" + "'", str56, "1970-01-01 08:56:47.907");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-3428-02-1 00:58:29.324+08:05" + "'", str57, "-3428-02-1 00:58:29.324+08:05");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407907);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 6357024);
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
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 28800);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6");
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (byte) -1, 10, dateTimeFormatPattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDateTime11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("6255-06-11 10:13:29");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 6255-06-11 10:13:29");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        long long3 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 3407907, 0, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-62134782393L), zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId13);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime20, "19700101");
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId25);
        long long28 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId25);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId35);
        java.util.Date date39 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId35);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId35);
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime42, "19700101");
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId47);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId47);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId47);
        long long51 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime20, zoneId47);
        long long59 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId47, 2097184, 0, 2097184, 0, 2097249, (int) (byte) -1, 3407924);
        long long60 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:56:47", zoneId47);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId47);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId65 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long73 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId65, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long81 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId65, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date82 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId65);
        java.util.Date date83 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 19:45:57.024-06:00", zoneId65);
        long long84 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId65);
        java.lang.String str85 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str86 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64800000L) + "'", long2 == (-64800000L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-64800000L) + "'", long3 == (-64800000L));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19680113" + "'", str16, "19680113");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115200000L) + "'", long17 == (-115200000L));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-62135625943000L) + "'", long27 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100772000L) + "'", long28 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969-12-31" + "'", str36, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31 18:00:00.01" + "'", str37, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 17:59:59.999" + "'", str38, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-50372000L) + "'", long40 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-62135625943000L) + "'", long49 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-100772000L) + "'", long50 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-100772000L) + "'", long51 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 66299887418939003L + "'", long59 == 66299887418939003L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-46993000L) + "'", long60 == (-46993000L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-115200000L) + "'", long61 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1969-12-31 00:00:00" + "'", str62, "1969-12-31 00:00:00");
        org.junit.Assert.assertNotNull(zoneId65);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 66118358169080000L + "'", long73 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 5482764781252003L + "'", long81 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Wed Dec 31 19:45:57 CST 1969");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-115200000L) + "'", long84 == (-115200000L));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "1969-12-31 00:00:00" + "'", str85, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1969-12-31 00:00:00" + "'", str86, "1969-12-31 00:00:00");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6357027, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(3407969, 2097184, 0, 2097204, 28800, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 113023504825408L + "'", long6 == 113023504825408L);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 6357089);
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 04:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "0000-01-01 00:00:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1968-01-31");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01 00:00:00" + "'", str3, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 04:00:00" + "'", str4, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1968-01-31" + "'", str6, "1968-01-31");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId7);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId7);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-02 00:04:20", zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(10L, zoneId7);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 17:59:59", zoneId7);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis("", zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 0, 6357089, (int) (short) -1, 28800, (-1), 3407924, 3407924);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 6357089");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 03:59:59 CST 1969");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray6, 100);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray6, (int) (byte) 100, (int) (byte) 1);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, (int) (short) -1);
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
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localTime30);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 08:00:00", (int) (byte) 0);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969/12/31T18:00:00", 0);
        java.time.ZoneId zoneId6 = null;
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId6);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId8);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50400000L) + "'", long9 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 6357027);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407924);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 2097204);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2293812);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 28800);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 29143);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (short) 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 2097187);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (short) 0, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097204");
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 0);
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
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId6);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId16);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId16);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId16);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime23, "19700101");
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId28);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime23, zoneId28);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId28);
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId38);
        java.time.ZonedDateTime zonedDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId38);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString((-1000L), true, zoneId38);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.getZoneId("Asia/Shanghai", zoneId38);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId42);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "0001-01-01");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19700101" + "'", str3, "19700101");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-62135625943000L) + "'", long8 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100772000L) + "'", long9 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 17:59:59.999" + "'", str19, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50372000L) + "'", long21 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-62135625943000L) + "'", long30 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-100772000L) + "'", long31 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 07:59:59+08:00" + "'", str41, "1970-01-01 07:59:59+08:00");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-100772000L) + "'", long43 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1969-12-31 04:00:28" + "'", str44, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0001-01-01" + "'", str46, "0001-01-01");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 0);
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
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 2097249);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 3407907);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 28800);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 3407907);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("0001/01/32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', 'a', ' ', '4', ' ', '#', ' ', '4', ' ', 'a', '4', ' ', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray6, (int) (short) 10);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray6, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (-1));
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray5, 3407924);
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray5, (int) (short) 0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097249");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(zonedDateTime16);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 3407969);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097184);
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
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId5);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId15);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId15);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId15);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId15);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00", zoneId15);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date21);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 14:00:00" + "'", str8, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19700101" + "'", str17, "19700101");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19700101" + "'", str19, "19700101");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31 04:00:00" + "'", str22, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31 04:00:00" + "'", str23, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19691231" + "'", str24, "19691231");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 29143);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("2006-03-02 03:08:55");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', ' ', ' ', ' ', 'a', ' ', 'a', 'a', '4', 'a', ' ', '#', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) ' ');
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 03:59:59");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 04:00:28");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 03:59:59" + "'", str2, "1969-12-31 03:59:59");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 04:00:28" + "'", str4, "1969-12-31 04:00:28");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 03:59:59" + "'", str5, "1969-12-31 03:59:59");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097204);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 100);
        java.nio.charset.Charset charset25 = null;
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId33);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId33);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId33);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId33);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId33);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, 3407969, charset25, zoneId33);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31" + "'", str34, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31 18:00:00.01" + "'", str35, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969-12-31 17:59:59.999" + "'", str36, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 21600000L + "'", long38 == 21600000L);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407907);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 29143);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 29143);
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
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) 'a');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 0, 10);
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 6357024, 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) '#');
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
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 2293795);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) '#');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) ' ');
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
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407969);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 29143);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 28800);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long21 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId5);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId5);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) 100, true, zoneId5);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 10:04:20.131", zoneId5);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date25, "-3428-02-1 00:58:29.324+08:05");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66118358169080000L + "'", long13 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5482764781252003L + "'", long21 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100800000L) + "'", long23 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 08:00:00.1+08:00" + "'", str24, "1970-01-01 08:00:00.1+08:00");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Dec 31 20:04:20 CST 1969");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19691231" + "'", str26, "19691231");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-3428-02-1 00:58:29.324+08:05" + "'", str28, "-3428-02-1 00:58:29.324+08:05");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId5);
        java.time.ZonedDateTime zonedDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId5);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId5);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2006-03-02 03:08:55", zoneId5);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28800000L) + "'", long8 == (-28800000L));
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1141240135000L + "'", long10 == 1141240135000L);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("57860131");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1968-02-18");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5786-01-31" + "'", str2, "5786-01-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "57860131" + "'", str3, "57860131");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "57860131" + "'", str4, "57860131");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1968-02-18" + "'", str6, "1968-02-18");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5786-01-31 00:00:00" + "'", str7, "5786-01-31 00:00:00");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, (int) (short) -1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) 'a');
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(zonedDateTime22);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-31 11:47:22");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date1, "53751204");
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-31 11:47:22" + "'", str10, "1968-01-31 11:47:22");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "53751204" + "'", str12, "53751204");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "19700101" + "'", str15, "19700101");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2097249);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 29143);
        java.util.Date date23 = null;
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId28);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId28);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("57860131", zoneId28);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.format(date34);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.format(date34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString(date34);
        java.time.ZoneId zoneId41 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId41);
        java.util.Date date43 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId41);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId41);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date32, zoneId41);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId41);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) -1, (int) (byte) 1, zoneId41);
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50400000L) + "'", long31 == (-50400000L));
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 10:04:20 CST 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 00:00:00" + "'", str35, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 00:00:00" + "'", str36, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 00:00:00" + "'", str37, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
        org.junit.Assert.assertNull(date43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 14:00:00" + "'", str44, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-02 00:04:20" + "'", str45, "1970-01-02 00:04:20");
        org.junit.Assert.assertNull(str46);
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
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 28800);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 6357044);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097249);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, 2097249);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 2293857, 2293812, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
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
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 6357024);
        java.time.ZoneId zoneId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 2097184, zoneId18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 23:28:00.113");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId9);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId9);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId9, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long28 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId9, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString((-50401000L), false, zoneId9);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) -1, zoneId9);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId9);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 14:00:00" + "'", str12, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 120424011872003L + "'", long20 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 135235494809000L + "'", long28 == 135235494809000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31 17:59:59" + "'", str29, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-30719887L) + "'", long31 == (-30719887L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31 23:28:00" + "'", str32, "1969-12-31 23:28:00");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 3407924);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 29143);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 0);
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
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(19691231L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 23:28:11" + "'", str1, "1969-12-31 23:28:11");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (short) 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) 'a', (int) (byte) 100);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 10, 3407907);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 14:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern7 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 100, 0, (int) (byte) 1, dateTimeFormatPattern7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(136154695047000L, dateTimeFormatPattern7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format((int) '4', (int) (short) 0, (int) (byte) 1, dateTimeFormatPattern7);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern7 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH + "'", dateTimeFormatPattern7.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0100-00-01" + "'", str8, "0100-00-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6284-07-27" + "'", str9, "6284-07-27");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0052-00-01" + "'", str10, "0052-00-01");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01 00:00:00" + "'", str2, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000-01-01" + "'", str4, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00000101" + "'", str5, "00000101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00000101" + "'", str6, "00000101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000-01-01 00:00:00" + "'", str7, "0000-01-01 00:00:00");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.001");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date1, "2006-03-02 03:08:55");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date1, "0100/00/10");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31" + "'", str3, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2006-03-02 03:08:55" + "'", str5, "2006-03-02 03:08:55");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 18:00:00.001" + "'", str6, "1969-12-31 18:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31" + "'", str7, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0100/00/10" + "'", str9, "0100/00/10");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '4');
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 28800);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId6);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId6);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId6, 2097184, (int) (byte) 10, 2097204, 2097184, 0, (int) (short) -1, (int) ' ');
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 04:00:00", zoneId6);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1405701377018002L, zoneId6);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28800000L) + "'", long9 == (-28800000L));
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 66298749505407000L + "'", long18 == 66298749505407000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100800000L) + "'", long19 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+46514-11-" + "'", str20, "+46514-11-");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray6, 3407907);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray6, (int) (byte) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray6, 100);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray6, 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00.001");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00+08:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-02 00:04:20");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 08:00:00.001" + "'", str5, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str7, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-02 00:04:20" + "'", str10, "1970-01-02 00:04:20");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 17:59:59", "");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59" + "'", str3, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 17:59:59" + "'", str4, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 17:59:59" + "'", str6, "1969-12-31 17:59:59");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293857, 6357027);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, 6357089);
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
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        byte[] byteArray1 = null;
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 0, (int) (byte) 0, zoneId15);
        java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, (int) (short) -1, (int) (short) 100, zoneId15);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 23:28:00.113", zoneId15);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date18, "1968-01-27");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 09:28:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1968-01-27" + "'", str20, "1968-01-27");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (-1));
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 1);
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId7);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId17);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId17);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId17);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime24, "19700101");
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24, zoneId29);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId29);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("+46514-11-", zoneId29);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +46514-11-");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62135625943000L) + "'", long9 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100772000L) + "'", long10 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31" + "'", str18, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 18:00:00.01" + "'", str19, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31 17:59:59.999" + "'", str20, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-50372000L) + "'", long22 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-62135625943000L) + "'", long31 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100772000L) + "'", long32 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-100772000L) + "'", long33 == (-100772000L));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 2293857);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 0, (int) '4', (int) (short) 10, (int) '4', (int) '#', 3407907, 2293857);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 52");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 19:45:57.024-06:00" + "'", str5, "1969-12-31 19:45:57.024-06:00");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 3407969);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 2097204);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 29143);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '4');
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (short) 100);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, 1);
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
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 2097204, zoneId25);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097249, zoneId25);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(120424011872003L, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray5, (int) (short) 100, zoneId25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 0]");
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "5786-01-31" + "'", str33, "5786-01-31");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 19:45:57");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 19:45:57" + "'", str2, "1969-12-31 19:45:57");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray1, (int) (short) 1);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray1, (int) (short) 1, (int) (byte) 10, zoneId12);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 13:28:11", zoneId12);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime14);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(localTime3);
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 13:28:11" + "'", str15, "1970-01-01 13:28:11");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2097204, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) (byte) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 28800);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (byte) 1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 2293857);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date41 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId24);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId24);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122570285040L, zoneId24);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 0, zoneId24);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:00:00", zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 0, zoneId24);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 66118358169080000L + "'", long32 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5482764781252003L + "'", long40 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-100800000L) + "'", long42 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "19731119" + "'", str43, "19731119");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-50400000L) + "'", long45 == (-50400000L));
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097249, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (byte) 10, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 100);
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
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 0, (int) (byte) 0, zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId17);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006/03/01T13:08:55", zoneId17);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 6357024, zoneId17);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 14:00:00" + "'", str19, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Feb 28 23:08:55 CST 2006");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 29143);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 100, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097249);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 2097249);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357044, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(zonedDateTime19);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 3407907);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
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
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2293792, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 10, (int) 'a');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 2293795);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2097249);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 3407904);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 6357024);
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
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293795, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) 'a', 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293892");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4 ");
        } catch (java.time.format.DateTimeParseException e) {
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
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407969);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17, zoneId20);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId20);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407904, 0, zoneId20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 3407907);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 14:00:00" + "'", str23, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertNull(zonedDateTime25);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31T18:00:00", 0);
        long long4 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3);
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long14 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId6, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId6, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId6);
        long long24 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1970-01-01", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1970-01-01");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 66118358169080000L + "'", long14 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5482764781252003L + "'", long22 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-50400000L) + "'", long24 == (-50400000L));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097249, (int) (short) 1);
        java.nio.charset.Charset charset10 = null;
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId19);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId19);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId19);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId19);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) ' ', zoneId19);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId19, (int) (byte) 1, 2097204, (int) (byte) -1, (int) '4', 2293795, (int) (short) 0, (int) (byte) 0);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 04:00:00", zoneId19);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 04:00:00", zoneId19);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId19);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '4', 2097249, charset10, zoneId19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-28800000L) + "'", long22 == (-28800000L));
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 5479651014900000L + "'", long32 == 5479651014900000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-100800000L) + "'", long33 == (-100800000L));
        org.junit.Assert.assertNotNull(zonedDateTime34);
        org.junit.Assert.assertNull(zonedDateTime35);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2293792);
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
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.time.ZoneId zoneId1 = null;
        java.time.ZonedDateTime zonedDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("2006-02-28 23:08:55", zoneId1);
        org.junit.Assert.assertNotNull(zonedDateTime2);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969/12/31T18:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969/12/31T18:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', '4', ' ', ' ', 'a', '4', '#', ' ', 'a', '4', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969/12/31T18:00:00", 0);
        java.time.ZoneId zoneId6 = null;
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId6);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime5, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((-61959062253L), true, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("+2102893-0 03:03:27", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +2102893-0 03:03:27");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50400000L) + "'", long9 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-15 05:08:57.747+08:00" + "'", str10, "1968-01-15 05:08:57.747+08:00");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 3407904);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        byte[] byteArray2 = null;
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) -1, (int) (short) 100, zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("2006-02-27", "5786-01-31 18:24:32.003+08:00", zoneId16);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '2006-02-27' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(zonedDateTime18);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2097249, (-1));
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
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
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375/12/03");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (byte) 0, 6357027);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 3407904, 2097249, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) '4', 6357024);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 3407969);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2293857, (int) (short) 10);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 2097184);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 10);
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
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 6357089);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293790");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 28800, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2125984");
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
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 29143);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 0, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 2293812);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ####");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 29143, 29143);
        java.nio.charset.Charset charset18 = null;
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 100, 0, charset18);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (short) 0);
        java.nio.charset.Charset charset15 = null;
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime17);
        char[] charArray19 = null;
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.001+08:00", zoneId23);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray19, 6357044, (int) (byte) 1, zoneId23);
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, (int) (short) 1, (int) (byte) -1, 2293795, (int) '4', 0, (int) (byte) 10, 100);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 3407969, 2097187, charset15, zoneId23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 04:00:28" + "'", str18, "1969-12-31 04:00:28");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 66118358169080000L + "'", long31 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5482764781252003L + "'", long39 == 5482764781252003L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 136043179210000L + "'", long49 == 136043179210000L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-100772000L) + "'", long50 == (-100772000L));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(1, 0, 0, 0, 2293812, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62000646481L) + "'", long6 == (-62000646481L));
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 11:13:50.429");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-61800369571L) + "'", long1 == (-61800369571L));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2293857);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 0, (-1));
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
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("+46514-11-");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +46514-11-");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray3, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357021");
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
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 6357024, 3407907);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097187);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(2097187, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 3407907);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (short) 10);
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.time.ZoneId zoneId1 = null;
        long long2 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-01 14:00:00", zoneId1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63086400000L) + "'", long2 == (-63086400000L));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 6357027, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6357124");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969-12-31 17:59:59.999");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59.999" + "'", str3, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 00:00:00" + "'", str4, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 00:00:00" + "'", str5, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 00:00:00" + "'", str6, "1969-12-31 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31 00:00:00" + "'", str7, "1969-12-31 00:00:00");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 28800);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 2097249);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 29143);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 6357089, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, (int) (short) 100);
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 10, 6357024, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 0, 2293795);
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407969);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31");
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(date17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date17);
        char[] charArray24 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray24, (int) ' ');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray24, (int) (short) 1);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray24, (int) (byte) 0, (int) (byte) 0, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 100, zoneId31);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 31 00:00:00 CST 5786");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 00:00:00" + "'", str18, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 14:00:00" + "'", str33, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "5786-01-31 14:00:00" + "'", str34, "5786-01-31 14:00:00");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 6357024, 3407907);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 3407969);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 29143);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 3407924, (int) (byte) 100);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 2097184);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (byte) 1, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293793");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("26.01.1968");
        org.junit.Assert.assertNotNull(localDate1);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 3407969);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId25);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407907, (int) (short) 1, zoneId25);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime28);
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertNull(localTime31);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        char[] charArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray0, 3407907, (int) 'a');
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((-1000L), dateTimeFormatPattern5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 10, 6357024, (int) (byte) 100, dateTimeFormatPattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 18:00:00" + "'", str6, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31 17:59:59" + "'", str7, "1969-12-31 17:59:59");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) 'a', 28800, (int) ' ', 6357024, 0, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, (int) (short) 0, 1);
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
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (byte) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19680113", (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 19680113");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1970-01-01 13:28:00");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1970-01-01 08:00:00");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 13:28:00" + "'", str8, "1970-01-01 13:28:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 08:00:00" + "'", str10, "1970-01-01 08:00:00");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("3814-03-22");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 3407907);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407924);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (-1));
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 13:28:11.231", zoneId12);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime18);
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
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 13:28:11" + "'", str19, "1970-01-01 13:28:11");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 13:28:11" + "'", str20, "1970-01-01 13:28:11");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("5375/12/03");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 107480498400000L + "'", long1 == 107480498400000L);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("+2102893-0 03:03:27", 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +2102893-0 03:03:27");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407900");
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (short) 100, 100, (int) '#', 2097249, 2293857, 2293795);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-59646988177L) + "'", long6 == (-59646988177L));
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        char[] charArray11 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray11, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray11, (int) (short) 1);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray11, (int) (byte) 0, (int) (byte) 0, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId18);
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId18);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Jan 31 00:00:00 CST 5786");
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5786-01-31 14:00:00" + "'", str21, "5786-01-31 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime22);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2293857, (int) 'a');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 3407904, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 29143);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 6357044);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00.001");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00.001" + "'", str4, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-12-31 10:03:41");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0000-12-31 10:03:41");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 6357027);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 100, 6357044);
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
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (short) 100);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2293857, (int) (short) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 29143);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2293857, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(zonedDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 6357024);
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
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 6357024);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 6357024);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }
}

