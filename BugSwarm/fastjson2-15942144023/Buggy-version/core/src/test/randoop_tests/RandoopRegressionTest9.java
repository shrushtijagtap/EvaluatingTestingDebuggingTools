import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19700101" + "'", str2, "19700101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str5, "1970-01-01 08:00:00.001+08:00");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (short) 0, (int) (byte) 0, 0, (int) (byte) 10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62169858480L) + "'", long6 == (-62169858480L));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, (int) (short) 10);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '4');
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
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407924);
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
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 6357024, (int) '#');
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357027");
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', 'a', 'a', '4', ' ', ' ', '4', '4', ' ', 'a', 'a', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 3407904);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 2293857);
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
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2097184);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097249);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31T18:00:00");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId8);
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 14:00:00" + "'", str6, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-02 04:00:00" + "'", str10, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-50400000L) + "'", long11 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
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
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("57860131");
        char[] charArray6 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, (int) (short) 10, 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 6357024);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, (int) (short) 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, (int) (byte) 100, (int) (short) 0);
        java.util.Date date31 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.format(date31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date31);
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId39);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId39);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId39);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId39);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date31, zoneId39);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId39);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", zoneId39);
        java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, 2097249, 0, zoneId39);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId39);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 00:00:00" + "'", str33, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 00:00:00" + "'", str34, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-28800000L) + "'", long42 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 14:00:00" + "'", str44, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 120423945600000L + "'", long48 == 120423945600000L);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, 6357027);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 3407904);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray6, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097243");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
            java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 100);
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097249);
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
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097249);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 0);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 0);
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
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-46993000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1968/02/20");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 6357027);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (-1));
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (short) 1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, (int) (byte) -1, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:56:47.969");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:56:47 CST 1969");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) '4');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) ' ');
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long29 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 10, 400000000, zoneId21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 66118358169080000L + "'", long29 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5482764781252003L + "'", long37 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str38, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 28800);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407907, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId10);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId10);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format(date2);
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
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', ' ', '4', '#', '4', '4', '#', 'a', ' ', '4', '#', '#', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 2097184);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId16);
        java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 2097249, 1, zoneId16);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray6, (int) 'a', 2097249);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray6, 2097187, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8454231");
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
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097184);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 28800);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) ' ');
        java.nio.charset.Charset charset30 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 29143, 605032704, charset30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) 0);
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('4', ' ', '#', '#', 'a', 'a', '#', 'a');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 3407904);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2097187, 0);
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
        org.junit.Assert.assertNull(zonedDateTime23);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 100, 29143);
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
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2097187, 2293795, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray0, 2293857, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097204);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) 'a', 3407904);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (byte) 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969-12-31 18:34:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969-12-31 18:34:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(date3);
        char[] charArray10 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray10, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray10, (int) (short) 1);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray10, (int) (byte) 0, (int) (byte) 0, zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-1L), zoneId17);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1973-10-02", zoneId17);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1973-10-02");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '#', 'a', 'a', 'a', '#', '4', '#', ' ', ' ', '#', 'a', ' ', '4');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-15 15:00:14", (int) (short) 0);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId8);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31", zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-44043000L), zoneId8);
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId8);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1968-01-14 08:03:22.384+08:00");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31" + "'", str9, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 18:00:00.01" + "'", str10, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31" + "'", str12, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61873186000L) + "'", long13 == (-61873186000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1968-01-14 08:03:22.384+08:00" + "'", str15, "1968-01-14 08:03:22.384+08:00");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407904);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097187);
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
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969/12/31T04:34:57", 2097204, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969/12/31T04:34:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray2, 3407907);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray2, (int) (byte) -1);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date12);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date12);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId20);
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId20);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId20);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId20);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId20);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId20);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) 100, (int) (short) -1, zoneId20);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId20);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.toString(date29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.format(date29, "1969-12-31 18:34:57");
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime34);
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId37);
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34, zoneId37);
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray46, 100);
        java.util.Date date53 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId56 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId56);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId56);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date53, zoneId56);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId56);
        java.time.ZonedDateTime zonedDateTime61 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray46, 2097249, 1, zoneId56);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34, zoneId56);
        java.util.Date date65 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId68 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId68);
        java.lang.String str70 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId68);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date65, zoneId68);
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId68);
        long long73 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34, zoneId68);
        long long74 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34);
        java.time.ZoneId zoneId80 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str81 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId80);
        java.lang.String str82 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId80);
        java.lang.String str83 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId80);
        java.time.ZonedDateTime zonedDateTime84 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId80);
        long long85 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34, zoneId80);
        java.lang.String str87 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime34, "");
        java.time.ZoneId zoneId91 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str92 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId91);
        java.time.ZonedDateTime zonedDateTime93 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId91);
        long long94 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId91);
        long long95 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime34, zoneId91);
        java.lang.String str96 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date29, zoneId91);
        // The following exception was thrown during execution in test generation
        try {
            long long97 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("", zoneId91);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 00:00:00" + "'", str15, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-28800000L) + "'", long23 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 14:00:00" + "'", str25, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2160-02-23" + "'", str27, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0000-12-31 10:03:41" + "'", str30, "0000-12-31 10:03:41");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31 18:34:57" + "'", str32, "1969-12-31 18:34:57");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str35, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31" + "'", str38, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50372000L) + "'", long39 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime48);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "19700101" + "'", str58, "19700101");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01 14:00:00" + "'", str59, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "19700101" + "'", str60, "19700101");
        org.junit.Assert.assertNull(zonedDateTime61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-100772000L) + "'", long62 == (-100772000L));
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-01-01" + "'", str69, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "19700101" + "'", str70, "19700101");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1970-01-01 14:00:00" + "'", str71, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "19700101" + "'", str72, "19700101");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-100772000L) + "'", long73 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-50372000L) + "'", long74 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1970-01-01" + "'", str81, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "19700101" + "'", str82, "19700101");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str83, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-100772000L) + "'", long85 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(zoneId91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1970-01-01" + "'", str92, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime93);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-28800000L) + "'", long94 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-100772000L) + "'", long95 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "0001-01-01 00:00:00" + "'", str96, "0001-01-01 00:00:00");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId22);
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId22);
        java.time.ZonedDateTime zonedDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId22);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 1, (int) (byte) 0, charset17, zoneId22);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 29143);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-50400000L) + "'", long25 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1996-10-20");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2097184);
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray3, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357021");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1970-01-01 08:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 1);
        java.nio.charset.Charset charset11 = null;
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId17);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId17);
        long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId17);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01", zoneId17);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31T18:00:00", zoneId17);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2097187, 400000000, charset11, zoneId17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-28800000L) + "'", long20 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28800000L) + "'", long21 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-50400000L) + "'", long22 == (-50400000L));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) '4');
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407904, (int) (byte) 1, charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
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
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, (int) (short) 0);
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
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 19:45:57", 0);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4);
        byte[] byteArray6 = new byte[] {};
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray6, (int) (byte) 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray6, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (short) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray6, 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray6, (int) (byte) 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray6, (int) (byte) -1);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString(date26);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId33);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId33);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId33);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date26);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date26);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId42);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId42);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId42);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId42);
        java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (short) 0, (int) (byte) 1, zoneId42);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId42);
        java.util.Date date49 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 17:59:59.999", zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0000-12-31", zoneId42);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0000-12-31");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6357000L + "'", long5 == 6357000L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-50400000L) + "'", long45 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 14:00:00" + "'", str46, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-44043000L) + "'", long48 == (-44043000L));
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 03:59:59 CST 1969");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00");
        char[] charArray2 = null;
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString(date10);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId17);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10, zoneId17);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId17);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId17);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId17);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 28800, zoneId17);
        long long25 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId17);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-50401000L) + "'", long21 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str22, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-100800000L) + "'", long25 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:00" + "'", str26, "\000\000\000\000\000\000\000\000\000\000\00004:00:00");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime21, "19700101");
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        long long27 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId25);
        long long28 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.format(date35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.format(date35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString(date35);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId42);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId42);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date35, zoneId42);
        long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId42);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId42);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-100772000L), zoneId42);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0001-01-01 00:00:00", zoneId42);
        long long50 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 0, zoneId42);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-100772000L) + "'", long27 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-50372000L) + "'", long28 == (-50372000L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 00:00:00" + "'", str36, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 00:00:00" + "'", str37, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 00:00:00" + "'", str38, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-50401000L) + "'", long46 == (-50401000L));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str47, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-62135625943000L) + "'", long49 == (-62135625943000L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-100772000L) + "'", long50 == (-100772000L));
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (-1));
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
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 2293857);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 29143);
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
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (byte) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray5, 6357027);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 3407969);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 1, (int) (short) 0);
        java.nio.charset.Charset charset24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357089, 1, charset24);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("19731028");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 120632400000L + "'", long1 == 120632400000L);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) 100);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 100);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) 0);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId35);
        java.util.Date date39 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId35);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString(date39);
        char[] charArray44 = new char[] { '4', ' ' };
        java.time.LocalDate localDate46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray44, (int) (byte) 1);
        java.time.LocalDateTime localDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray44, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray44, (int) (byte) 1);
        java.time.LocalDate localDate53 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray44, 100);
        long long56 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray44, 100, 0);
        java.time.LocalDateTime localDateTime58 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray44, 100);
        java.time.LocalDateTime localDateTime60 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray44, 10);
        java.time.ZoneId zoneId63 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long64 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray44, (int) (short) 100, (int) (short) 0, zoneId63);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId63);
        java.lang.String str66 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date39, zoneId63);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.format(date39);
        java.lang.String str68 = com.alibaba.fastjson2.util.DateUtils.toString(date39);
        java.util.Date date71 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId74 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str75 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId74);
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId74);
        java.lang.String str77 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date71, zoneId74);
        java.lang.String str78 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date71);
        java.time.ZoneId zoneId84 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str85 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId84);
        java.lang.String str86 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId84);
        java.lang.String str87 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId84);
        java.lang.String str88 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date71, zoneId84);
        java.util.Date date89 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId84);
        java.lang.String str90 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date39, zoneId84);
        java.util.Date date91 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00", zoneId84);
        // The following exception was thrown during execution in test generation
        try {
            long long92 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 0, zoneId84);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969-12-31" + "'", str36, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31 18:00:00.01" + "'", str37, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 17:59:59.999" + "'", str38, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4,  ]");
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localDateTime49);
        org.junit.Assert.assertNull(localDateTime51);
        org.junit.Assert.assertNull(localDate53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNull(localDateTime58);
        org.junit.Assert.assertNull(localDateTime60);
        org.junit.Assert.assertNotNull(zoneId63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1970-01-02 04:00:00" + "'", str66, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01 14:00:00" + "'", str67, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1970-01-01 14:00:00" + "'", str68, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "1970-01-01" + "'", str75, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "19700101" + "'", str76, "19700101");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-01-01 14:00:00" + "'", str77, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "1970-01-01" + "'", str78, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "1969-12-31" + "'", str85, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1969-12-31 18:00:00.01" + "'", str86, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1969-12-31 17:59:59.999" + "'", str87, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1970-01-01 00:00:00" + "'", str88, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "1970-01-01 14:00:00" + "'", str90, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Jan 01 08:00:00 CST 1970");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2097249);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) '4');
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) '4');
        byte[] byteArray25 = null;
        java.nio.charset.Charset charset28 = null;
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.format(date35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.format(date35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString(date35);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId42);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId42);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date35, zoneId42);
        long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId42);
        long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 14:00:00", zoneId42);
        long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:00:00", zoneId42);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString(72000000L, true, zoneId42);
        long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray25, 28800, (int) (short) 0, charset28, zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357044, (int) (byte) 100, zoneId42);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 00:00:00" + "'", str36, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 00:00:00" + "'", str37, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 00:00:00" + "'", str38, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 14:00:00" + "'", str45, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-50401000L) + "'", long46 == (-50401000L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 21600000L + "'", long47 == 21600000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-50400000L) + "'", long48 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-02 04:00:00+08:00" + "'", str49, "1970-01-02 04:00:00+08:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray9, 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray9, 0);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId17);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray9, 28800, 0, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId17);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-61873185443L), zoneId17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.004-06:00", "1973-10-28T01:06:07", zoneId17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31" + "'", str18, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19731114" + "'", str20, "19731114");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1968-01-16" + "'", str21, "1968-01-16");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (-1), 605032704);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (byte) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2293795");
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
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357024);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 100);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 3407969);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 2097187);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (byte) 100, (int) '4');
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 10);
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
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) '#');
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 100);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 3407907);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 0, 2097204);
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
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 3407924);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 3407924, 2293857);
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-59111391000L), zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1970-01-02 18:00:00", zoneId31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1970-01-02 18:00:00");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1968-02-17" + "'", str35, "1968-02-17");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', '4', '4', ' ', 'a', '#', '#', 'a', '4', '4', '4', '#', ' ', '4', ' ', '4', 'a', '#', '#', '#', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0001-01-01");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-62135575764000L) + "'", long2 == (-62135575764000L));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0001-01-01 00:00:00" + "'", str2, "0001-01-01 00:00:00");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) -1, 28800);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(4L, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(6357027, (int) (byte) 0, (int) (short) 0, dateTimeFormatPattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31.12.1969 18:00:00" + "'", str8, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31.12.1969 18:00:00" + "'", str9, "31.12.1969 18:00:00");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1970/01/01T14:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date1, "0000-01-01");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0000-01-01" + "'", str20, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId3);
        java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01 00:00:00", "", zoneId3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5);
        char[] charArray13 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray13, (int) ' ');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray13, (int) (short) 1);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray13, (int) (byte) 0, (int) (byte) 0, zoneId20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date5, zoneId20);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-0001-12-3 10:03:41" + "'", str6, "-0001-12-3 10:03:41");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str22, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0000-01-01 00:00:00" + "'", str23, "0000-01-01 00:00:00");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (short) 100);
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
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("2006-02-28");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2006-02-28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2293795);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId10);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId10);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId10);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31T18:00:00", zoneId10);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date16);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-28800000L) + "'", long13 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 14:00:00" + "'", str15, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19691231" + "'", str17, "19691231");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 04:00:00" + "'", str18, "1969-12-31 04:00:00");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 14:00:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 08:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0032/10/00");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 08:00:00" + "'", str6, "1970-01-01 08:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0032/10/00" + "'", str8, "0032/10/00");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 2293857, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293957");
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
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) '4');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (-1));
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) 10);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407904);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) '#');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357044);
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
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("19731014");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1973-10-14 00:00:00" + "'", str2, "1973-10-14 00:00:00");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-07-19 07:57:13.3+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-07-19 07:57:13.3+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357086");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-15 15:00:14", (int) (short) 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "4071-01-09 00:00:00");
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4071-01-09 00:00:00" + "'", str4, "4071-01-09 00:00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-61873186000L) + "'", long5 == (-61873186000L));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 0, (int) (byte) 0, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId15);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId18, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId18);
        java.lang.Class<?> wildcardClass28 = zoneId18.getClass();
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
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 66118358169080000L + "'", long26 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 14:00:00" + "'", str27, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:56:47");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(2097204, 10, (int) (byte) 10, 400000000, 28800, 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 66120410880650L + "'", long6 == 66120410880650L);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(date3, "1970-01-01 08:00:00.001");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray21, 100);
        java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date28, zoneId31);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId31);
        java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray21, 2097249, 1, zoneId31);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId31);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId31);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:38:13", zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.getZoneId("0001/01/01", zoneId31);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0001/01/01");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 14:00:00" + "'", str9, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 08:00:00.001" + "'", str13, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19700101" + "'", str33, "19700101");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 14:00:00" + "'", str34, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "19700101" + "'", str35, "19700101");
        org.junit.Assert.assertNull(zonedDateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-62167248343000L) + "'", long37 == (-62167248343000L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 14:00:00" + "'", str38, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-48107000L) + "'", long39 == (-48107000L));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(2293795, 400000000, 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22937");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1968-01-15 15:00:14");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1968-01-15 15:00:14" + "'", str14, "1968-01-15 15:00:14");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) 'a');
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 10);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 0);
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
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 2097184);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, 3407969);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, (int) (short) -1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localTime31);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0001-01-01 00:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1968-01-01 15:27:41");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0001-01-01 00:00:00" + "'", str6, "0001-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1968-01-01 15:27:41" + "'", str8, "1968-01-01 15:27:41");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407907, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2097184, (int) ' ', 3407969, (int) (short) 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20971");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "2006-03-01");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2006-03-01" + "'", str33, "2006-03-01");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date4, "1970-01-01 08:00:00.001");
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray22, 100);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId32);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date29, zoneId32);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId32);
        java.time.ZonedDateTime zonedDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray22, 2097249, 1, zoneId32);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId32);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId32);
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:38:13", zoneId32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00+08:00", "00010101", zoneId32);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 08:00:00+08:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 08:00:00.001" + "'", str14, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19700101" + "'", str34, "19700101");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 14:00:00" + "'", str35, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "19700101" + "'", str36, "19700101");
        org.junit.Assert.assertNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-62167248343000L) + "'", long38 == (-62167248343000L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-48107000L) + "'", long40 == (-48107000L));
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) ' ');
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 2097204);
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
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("", (int) '#', (int) (byte) 100);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId3);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString(6357024L, false, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, (int) (byte) 1, (int) (short) 1, (int) (short) 10, 6357027, (int) (byte) 1, 6357044, 3407904);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for HourOfDay (valid values 0 - 23): 6357027");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 09:45:57.024" + "'", str13, "1970-01-01 09:45:57.024");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969/12/31");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969/12/31");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 10);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray5, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357022");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "19691231");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-30");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691231" + "'", str7, "19691231");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-30" + "'", str9, "1969-12-30");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, (int) (short) -1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-15 15:00:14", (int) (short) 0);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime18, "4071-01-09 00:00:00");
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("00000101");
        byte[] byteArray24 = new byte[] {};
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray24, (int) (byte) -1);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray24, (int) (byte) 10);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray24, (int) ' ');
        java.time.LocalDate localDate32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray24, (int) 'a');
        java.time.LocalTime localTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray24, 100);
        java.time.LocalTime localTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray24, 28800);
        java.time.LocalTime localTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray24, 0);
        java.time.LocalTime localTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray24, (int) (short) 10);
        java.time.LocalDateTime localDateTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray24, 0, 2097204);
        java.time.ZoneId zoneId48 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long56 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId48, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long64 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId48, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId48);
        java.time.ZonedDateTime zonedDateTime66 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray24, 3407904, (int) (short) 1, zoneId48);
        java.time.ZonedDateTime zonedDateTime67 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId48);
        long long68 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime22, zoneId48);
        long long69 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId48);
        // The following exception was thrown during execution in test generation
        try {
            long long70 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) -1, 400000000, zoneId48);
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4071-01-09 00:00:00" + "'", str20, "4071-01-09 00:00:00");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localTime34);
        org.junit.Assert.assertNull(localTime36);
        org.junit.Assert.assertNull(localTime38);
        org.junit.Assert.assertNull(localTime40);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 66118358169080000L + "'", long56 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 5482764781252003L + "'", long64 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str65, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(zonedDateTime66);
        org.junit.Assert.assertNotNull(zonedDateTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-62167248343000L) + "'", long68 == (-62167248343000L));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-61923586000L) + "'", long69 == (-61923586000L));
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', '4', '#', 'a', ' ', '4', '#', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "+08:00");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1968-01-26 14:00:00");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+08:00" + "'", str3, "+08:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1968-01-26 14:00:00" + "'", str7, "1968-01-26 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        byte[] byteArray1 = new byte[] {};
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, (int) (byte) -1);
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray1, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray1, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray1, (int) (byte) 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray1, 10);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray1, (int) 'a');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray1, (int) (byte) 100);
        java.nio.charset.Charset charset18 = null;
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-15 20:30:27", 0);
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId26);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31", zoneId26);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime21, zoneId26);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray1, (int) '#', (int) (byte) 0, charset18, zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 09:45:57.024", zoneId26);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 09:45:57.024");
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1969-12-31" + "'", str27, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31 18:00:00.01" + "'", str28, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-61853373000L) + "'", long30 == (-61853373000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) 'a', (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097184, (int) (short) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097184);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (-1), (int) (short) 0);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDateTime28);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407904);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("6255-06-11 10:13:29");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357024, 6357027);
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968-01-14 08:03:22", (int) (byte) 10, 3407907);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1968-01-14 08:03:22");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern10 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(1141240135347L, dateTimeFormatPattern10);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format((long) 'a', dateTimeFormatPattern10);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format((long) 3407907, dateTimeFormatPattern10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) -1, 28800, 6357089, dateTimeFormatPattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern10 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern10.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0001/01/01" + "'", str11, "0001/01/01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969/12/31T18:00:00" + "'", str12, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2006/03/01T13:08:55" + "'", str13, "2006/03/01T13:08:55");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969/12/31T18:00:00" + "'", str14, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969/12/31T18:56:47" + "'", str15, "1969/12/31T18:56:47");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        java.time.LocalTime localTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 0);
        java.time.LocalTime localTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097184);
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
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertNull(localTime48);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 0);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 18:00:00.01");
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId28);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime26, zoneId28);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2293812, 0, zoneId28);
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "19691231" + "'", str29, "19691231");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray6, 2293812);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (-1));
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime26);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime26, zoneId29);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId35);
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId35);
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime26, zoneId35);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(107663884222960L, zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 0, zoneId35);
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
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str27, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1969-12-31" + "'", str30, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50372000L) + "'", long31 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "19700101" + "'", str37, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-100772000L) + "'", long39 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "53810925" + "'", str40, "53810925");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 28800);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId23);
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId23);
        long long34 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId23);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, 3407969, 3407907, (int) (byte) 10, 6357024, (int) ' ', (int) 'a', (int) (short) -1);
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 05:00:14.557+08:00", zoneId23);
        java.util.Date date45 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId23);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date45);
        java.time.ZoneId zoneId53 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId53);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId53);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId53);
        java.util.Date date57 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId53);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date57);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date57);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date57);
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate69 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray67, 0);
        java.time.LocalDateTime localDateTime71 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray67, 0);
        java.time.ZoneId zoneId75 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId75);
        java.time.ZonedDateTime zonedDateTime77 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray67, 28800, 0, zoneId75);
        java.lang.String str78 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId75);
        java.lang.String str79 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date57, zoneId75);
        java.lang.String str80 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date45, zoneId75);
        java.time.ZonedDateTime zonedDateTime81 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-26 13:29:52", zoneId75);
        // The following exception was thrown during execution in test generation
        try {
            long long82 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 3407907, zoneId75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-50400000L) + "'", long26 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 135235494809000L + "'", long34 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 116489408803937000L + "'", long43 == 116489408803937000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-61873185443L) + "'", long44 == (-61873185443L));
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "19691231" + "'", str46, "19691231");
        org.junit.Assert.assertNotNull(zoneId53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1969-12-31" + "'", str54, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1969-12-31 18:00:00.01" + "'", str55, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1969-12-31 17:59:59.999" + "'", str56, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "19700101" + "'", str58, "19700101");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01 14:00:00" + "'", str59, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01" + "'", str60, "1970-01-01");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate69);
        org.junit.Assert.assertNull(localDateTime71);
        org.junit.Assert.assertNotNull(zoneId75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1969-12-31" + "'", str76, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "19731114" + "'", str78, "19731114");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1970-01-02 04:00:00" + "'", str79, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1969-12-31 18:00:00" + "'", str80, "1969-12-31 18:00:00");
        org.junit.Assert.assertNotNull(zonedDateTime81);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId8);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId8);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01", zoneId8);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(date13, "1969-12-31 18:00:00");
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime18, "1970-01-01 08:00:00.001+08:00");
        char[] charArray25 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray25, (int) ' ');
        java.time.LocalTime localTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray25, (int) (short) 1);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray25, (int) (byte) 0, (int) (byte) 0, zoneId32);
        long long34 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId32);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime18);
        java.util.Date date38 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date38);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.format(date38);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date38);
        java.time.ZoneId zoneId46 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId46);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId46);
        long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId46);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId46);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date38, zoneId46);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId46);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId46);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.toString(122570285040L, true, zoneId46);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId46);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-50400000L) + "'", long11 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31 18:00:00" + "'", str15, "1969-12-31 18:00:00");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str20, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localTime29);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-100772000L) + "'", long34 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-50372000L) + "'", long35 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str36, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 00:00:00" + "'", str40, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 00:00:00" + "'", str41, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-28800000L) + "'", long49 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01 14:00:00" + "'", str51, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-100772000L) + "'", long52 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0000-01-01 00:00:00" + "'", str53, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1973-11-19 23:18:05.04+08:00" + "'", str54, "1973-11-19 23:18:05.04+08:00");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01" + "'", str55, "1970-01-01");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 3407924);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 3407969);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray0, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407904);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 2293857);
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
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (byte) 1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray6, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 09:45:57.024+08:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str4, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.time.ZoneId zoneId1 = null;
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-02 18:00:00", zoneId1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Jan 02 18:00:00 CST 1970");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) '4', 3407924, (int) '#', 3407907, (int) (short) 0, 3407904);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8943959326416L + "'", long6 == 8943959326416L);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(28800, 6357027, 400000000, 10, 400000000, 29143);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21278944158967L + "'", long6 == 21278944158967L);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097184);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 28800);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) (byte) 0);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray3, 3407924, 1);
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
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '4');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 3407907);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 2293857);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '#');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (-1));
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 100);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 100);
        char[] charArray28 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray28, (int) (short) 0);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray28, (int) (short) 1);
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray28, (int) '#');
        java.time.LocalDateTime localDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray28, (int) (short) 100);
        byte[] byteArray40 = new byte[] {};
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray40, 3407907);
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray40, (int) (byte) -1);
        java.util.Date date50 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date50);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.format(date50);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date50);
        java.time.ZoneId zoneId58 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId58);
        java.time.ZonedDateTime zonedDateTime60 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId58);
        long long61 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId58);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId58);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date50, zoneId58);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId58);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId58);
        java.time.ZonedDateTime zonedDateTime66 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray40, (int) (short) 100, (int) (short) -1, zoneId58);
        java.util.Date date67 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId58);
        long long68 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray28, 3407904, 0, zoneId58);
        // The following exception was thrown during execution in test generation
        try {
            long long69 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (byte) 10, zoneId58);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01 00:00:00" + "'", str52, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01 00:00:00" + "'", str53, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-28800000L) + "'", long61 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01" + "'", str62, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01 14:00:00" + "'", str63, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "19700101" + "'", str64, "19700101");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "2160-02-23" + "'", str65, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime66);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', 'a', '4', 'a', '#', ' ', '#', ' ', ' ', 'a', 'a', ' ', '4', 'a', ' ', ' ', '4', '4', 'a', ' ', '#', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("5786/01/30");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 5786/01/30");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 6357089);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 10);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 3407904);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2097204);
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
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 28800);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 100, 2293792);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId4);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId4);
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId4);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(date8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-28800000L) + "'", long7 == (-28800000L));
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31" + "'", str9, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31" + "'", str10, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 04:00:00" + "'", str11, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 04:00:00" + "'", str12, "1969-12-31 04:00:00");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(10, 2097187, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date13);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(date13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId21);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId21);
        long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId21);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId21);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date13, zoneId21);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId21);
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId21, 1, (int) 'a', 6357044, 3407904, 3407924, (int) (byte) -1, 10);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId21);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 14:00:00" + "'", str7, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 00:00:00" + "'", str15, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 00:00:00" + "'", str16, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-28800000L) + "'", long24 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 14:00:00" + "'", str26, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 486954415151000L + "'", long35 == 486954415151000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01 00:00:00" + "'", str2, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 6357027);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray6, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray6, 2293857, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5701761");
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
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 0, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray5, 0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2097249");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0001-01-01 00:00:00" + "'", str2, "0001-01-01 00:00:00");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '4', ' ', '4', '#', ' ', '#', '4', '#', '#', ' ', '#', 'a', '4', '#', '#', '4', ' ', 'a', '4', '4', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.format(date1);
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
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        java.util.Date date8 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date8, zoneId11);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId11);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) ' ', zoneId11);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-28800000L), zoneId11);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-15 15:00:14", zoneId11);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00", zoneId11);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(108030282971962000L, true, zoneId11);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 14:00:00" + "'", str14, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "19700101" + "'", str15, "19700101");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01" + "'", str17, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+3425313-0 16:39:22+08:00" + "'", str20, "+3425313-0 16:39:22+08:00");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, 28800, (-1));
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("5786-01-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("+3693372-0 16:12:17", (int) 'a', 2293792);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +3693372-0 16:12:17");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, 1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, 100);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId30);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 1, zoneId30);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis("2160-02-23", zoneId30);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(8945371728157L, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, 2097204, zoneId30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str32, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 00:00:00" + "'", str33, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19700101" + "'", str34, "19700101");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 6000364800000L + "'", long35 == 6000364800000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "22530620" + "'", str36, "22530620");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-31 18:34:57");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:34:57 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:34:57" + "'", str2, "1969-12-31 18:34:57");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:34:57" + "'", str4, "1969-12-31 18:34:57");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (short) -1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 3407907, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 1);
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
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 08:00:00.001+08:00");
        java.time.ZoneId zoneId9 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 100, false, zoneId9);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.032+08:00", zoneId9);
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId9);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime15);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId18);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId18);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray27, 100);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId37);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId37);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray27, 2097249, 1, zoneId37);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId37);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId49);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId49);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date46, zoneId49);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId49);
        long long54 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId49);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime15, "+08:00");
        java.time.ZoneId zoneId64 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId64);
        java.lang.String str66 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId64);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId64);
        java.util.Date date68 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId64);
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date68);
        java.lang.String str70 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date68);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date68);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate80 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray78, 0);
        java.time.LocalDateTime localDateTime82 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray78, 0);
        java.time.ZoneId zoneId86 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str87 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId86);
        java.time.ZonedDateTime zonedDateTime88 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray78, 28800, 0, zoneId86);
        java.lang.String str89 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId86);
        java.lang.String str90 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date68, zoneId86);
        long long91 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime15, zoneId86);
        long long92 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId86);
        java.lang.String str94 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1968-01-16 10:30:27+08:00");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str4, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31" + "'", str10, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 18:00:00.1" + "'", str11, "1969-12-31 18:00:00.1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-50372000L) + "'", long13 == (-50372000L));
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str16, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31" + "'", str19, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-50372000L) + "'", long20 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "19700101" + "'", str41, "19700101");
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-100772000L) + "'", long43 == (-100772000L));
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "19700101" + "'", str51, "19700101");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01 14:00:00" + "'", str52, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "19700101" + "'", str53, "19700101");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-100772000L) + "'", long54 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-50372000L) + "'", long55 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+08:00" + "'", str57, "+08:00");
        org.junit.Assert.assertNotNull(zoneId64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1969-12-31" + "'", str65, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1969-12-31 18:00:00.01" + "'", str66, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1969-12-31 17:59:59.999" + "'", str67, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "19700101" + "'", str69, "19700101");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1970-01-01 14:00:00" + "'", str70, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1970-01-01" + "'", str71, "1970-01-01");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate80);
        org.junit.Assert.assertNull(localDateTime82);
        org.junit.Assert.assertNotNull(zoneId86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1969-12-31" + "'", str87, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "19731114" + "'", str89, "19731114");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "1970-01-02 04:00:00" + "'", str90, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-100772000L) + "'", long91 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + (-100772000L) + "'", long92 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "1968-01-16 10:30:27+08:00" + "'", str94, "1968-01-16 10:30:27+08:00");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) 'a');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 10, (int) (byte) 0);
        char[] charArray23 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray23, (int) ' ');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray23, 0);
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray23, (int) (short) 100);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray23, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray23, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray23, 3407924);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray23, (int) 'a');
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime42);
        java.time.ZoneId zoneId45 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId45);
        long long47 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId45);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime56 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray54, 100);
        java.util.Date date61 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId64 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId64);
        java.lang.String str66 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId64);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date61, zoneId64);
        java.lang.String str68 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId64);
        java.time.ZonedDateTime zonedDateTime69 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray54, 2097249, 1, zoneId64);
        long long70 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId64);
        java.util.Date date73 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId76 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str77 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId76);
        java.lang.String str78 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId76);
        java.lang.String str79 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date73, zoneId76);
        java.lang.String str80 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId76);
        long long81 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId76);
        long long82 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42);
        java.time.ZoneId zoneId88 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str89 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId88);
        java.lang.String str90 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId88);
        java.lang.String str91 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId88);
        java.time.ZonedDateTime zonedDateTime92 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0001-01-01 00:00:00", zoneId88);
        long long93 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId88);
        long long94 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, (int) '4', 0, zoneId88);
        // The following exception was thrown during execution in test generation
        try {
            long long95 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 2293812, zoneId88);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(zonedDateTime34);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str43, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1969-12-31" + "'", str46, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-50372000L) + "'", long47 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime56);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "19700101" + "'", str66, "19700101");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01 14:00:00" + "'", str67, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "19700101" + "'", str68, "19700101");
        org.junit.Assert.assertNull(zonedDateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-100772000L) + "'", long70 == (-100772000L));
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "1970-01-01" + "'", str77, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "19700101" + "'", str78, "19700101");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1970-01-01 14:00:00" + "'", str79, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "19700101" + "'", str80, "19700101");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + (-100772000L) + "'", long81 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-50372000L) + "'", long82 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "1970-01-01" + "'", str89, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "19700101" + "'", str90, "19700101");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str91, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime92);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-100772000L) + "'", long93 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("12.01.1968 21:27:25", 605032704);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(122570285040L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1973-11-19 09:18:05" + "'", str1, "1973-11-19 09:18:05");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097184);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 3407969);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097249);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 6357044);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, (int) (byte) 1);
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
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) -1, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        java.time.LocalDateTime localDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime40);
        java.time.ZoneId zoneId43 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId43);
        long long45 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime40, zoneId43);
        long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId43);
        long long47 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId43);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        char[] charArray55 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate57 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray55, (int) ' ');
        java.time.LocalTime localTime59 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray55, (int) (short) 1);
        java.time.LocalDateTime localDateTime61 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray55, 2097184);
        java.time.LocalTime localTime63 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray55, (-1));
        java.time.LocalDate localDate65 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray55, 0);
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime77 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray75, 100);
        java.util.Date date82 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId85 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str86 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId85);
        java.lang.String str87 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId85);
        java.lang.String str88 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date82, zoneId85);
        java.lang.String str89 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId85);
        java.time.ZonedDateTime zonedDateTime90 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray75, 2097249, 1, zoneId85);
        long long91 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId85);
        long long92 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray55, 29143, 0, zoneId85);
        java.lang.String str93 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357044, false, zoneId85);
        long long94 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId85);
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
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str41, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1969-12-31" + "'", str44, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-50372000L) + "'", long45 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 21600000L + "'", long46 == 21600000L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-50372000L) + "'", long47 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-50372000L) + "'", long48 == (-50372000L));
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertNull(localTime59);
        org.junit.Assert.assertNull(localDateTime61);
        org.junit.Assert.assertNull(localTime63);
        org.junit.Assert.assertNull(localDate65);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime77);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1970-01-01" + "'", str86, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "19700101" + "'", str87, "19700101");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "1970-01-01 14:00:00" + "'", str88, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "19700101" + "'", str89, "19700101");
        org.junit.Assert.assertNull(zonedDateTime90);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-62167248343000L) + "'", long91 == (-62167248343000L));
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "1970-01-01 09:45:57.044" + "'", str93, "1970-01-01 09:45:57.044");
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-100772000L) + "'", long94 == (-100772000L));
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407907);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) '#');
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 400000000);
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
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 2097184);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (-1));
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime27);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId30);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime27, zoneId30);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray39, 100);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId49 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId49);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId49);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date46, zoneId49);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId49);
        java.time.ZonedDateTime zonedDateTime54 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray39, 2097249, 1, zoneId49);
        long long55 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime27, zoneId49);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId49);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray5, (int) (short) 100, zoneId49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str28, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31" + "'", str31, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50372000L) + "'", long32 == (-50372000L));
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "40710109" + "'", str56, "40710109");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', '4', ' ', ' ', '#', 'a', 'a', ' ');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) 100);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2293792);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357027);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 2293792);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 3407924);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("2160/02/23");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sat Feb 23 00:00:00 CST 2160");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (-1));
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 10);
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
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097249);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -28798");
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
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 6357027);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) 'a', (int) '4');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097184);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(5999533572541L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407904, 6357089);
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
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', '#', 'a', '4', 'a', '#', '#', '4', '4', 'a', ' ', ' ', '4', ' ', '#', ' ', '4', '#', 'a', '#', ' ', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968-01-14 22:30:16");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1968-01-14 22:30:16" + "'", str2, "1968-01-14 22:30:16");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 2293857);
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        char[] charArray27 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray27, (int) ' ');
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray27, (int) (short) 1);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray27, (int) (byte) 0, (int) (byte) 0, zoneId34);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId34);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-1L), zoneId34);
        long long45 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId34, 2097249, (int) (short) -1, 0, (int) 'a', 100, (int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray3, 0, zoneId34);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 66120613958497000L + "'", long45 == 66120613958497000L);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("", 3407907, (int) ' ');
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00");
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId23);
        long long27 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId23);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime17, "1970-01-01 00:00:00");
        java.util.Date date31 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.format(date31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date31);
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId39);
        java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId39);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId39);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId39);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date31, zoneId39);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.toString(date31);
        java.util.Date date48 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId51 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId51);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId51);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date48, zoneId51);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date48);
        java.time.ZoneId zoneId61 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId61);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId61);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId61);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date48, zoneId61);
        java.util.Date date66 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId61);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date31, zoneId61);
        long long68 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId61);
        // The following exception was thrown during execution in test generation
        try {
            long long69 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, 29143, zoneId61);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50400000L) + "'", long18 == (-50400000L));
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str26, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-100800000L) + "'", long27 == (-100800000L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 00:00:00" + "'", str33, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 00:00:00" + "'", str34, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-28800000L) + "'", long42 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 14:00:00" + "'", str44, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 00:00:00" + "'", str45, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "19700101" + "'", str53, "19700101");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970-01-01 14:00:00" + "'", str54, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01" + "'", str55, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1969-12-31" + "'", str62, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1969-12-31 18:00:00.01" + "'", str63, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1969-12-31 17:59:59.999" + "'", str64, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01 00:00:00" + "'", str65, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01 00:00:00" + "'", str67, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-50400000L) + "'", long68 == (-50400000L));
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
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
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId24);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407904, (int) (short) 1, zoneId24);
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime50 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 66118358169080000L + "'", long32 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5482764781252003L + "'", long40 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str41, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertNull(localTime48);
        org.junit.Assert.assertNull(localTime50);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (byte) 1, 2097249);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) -1);
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
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('4', '#', 'a', ' ', 'a', '4', 'a', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) -1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 28800);
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
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-14 08:03:22");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 14 08:03:22 CST 1968");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, 6357024);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 1);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, (int) (byte) 1, zoneId21);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31" + "'", str22, "1969-12-31");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1, "-3417-03-3 21:42:43.043");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 08:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-3417-03-3 21:42:43.043" + "'", str3, "-3417-03-3 21:42:43.043");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', 'a', ' ', '#', ' ', '4', ' ', 'a', ' ', '4', '#', ' ', '#', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19691231");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId3);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-64800000L) + "'", long5 == (-64800000L));
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("2262-09-22 20:03:41.22");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9237546221220L + "'", long1 == 9237546221220L);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) 100, 2097187, 605032704);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.time.ZoneId zoneId1 = null;
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19680114", zoneId1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Wed Dec 31 23:28:00 CST 1969");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097184);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) -1);
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
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 2097204);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -93");
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
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input a4a");
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1968-02-17");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1968-02-17" + "'", str2, "1968-02-17");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "+08:00");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1968-01-01 15:27:41.258-06:00");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+08:00" + "'", str3, "+08:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1968-01-01 15:27:41.258-06:00" + "'", str5, "1968-01-01 15:27:41.258-06:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) 0, 6357089, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407905");
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
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) '4', 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407956");
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
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) 'a', (int) '4', 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray0, 6357044);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray0, 2097184, (int) ' ');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', 'a', '4', '#', '#', '4', ' ', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        byte[] byteArray2 = null;
        java.nio.charset.Charset charset5 = null;
        java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString(date7);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7, zoneId14);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray2, (int) (short) 10, 100, charset5, zoneId14);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis("4071-01-08 10:00:00", zoneId14);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("\000\000\000\000\000\000\000\000\000\000\00008:00:00", zoneId14);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????08:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 66301812000000L + "'", long19 == 66301812000000L);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01", zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date28 = com.alibaba.fastjson2.util.DateUtils.parseDate("-0001-10-3", zoneId22);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-10-3");
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
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 10:00:00 CST 1969");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2293857);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 29143);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) '4', 29143);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, (int) (byte) -1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, (int) ' ');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 2097249, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 3407907);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 10);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 10);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 0);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 3407969);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("2006/03/01T13:08:55");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969-12-31 18:00:00.01");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "0000-35-35");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19680114");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19691231" + "'", str4, "19691231");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1141240135000L + "'", long5 == 1141240135000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31 18:00:00.01" + "'", str7, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00013:08:55" + "'", str8, "\000\000\000\000\000\000\000\000\000\000\00013:08:55");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0000-35-35" + "'", str10, "0000-35-35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19680114" + "'", str12, "19680114");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, (int) (byte) 0, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2293857");
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
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 2097187, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 1, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 2293795);
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
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId14);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId14);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId14);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId14);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01", zoneId14);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId25);
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, 3407924, 3407924, 0, (int) (byte) 1, (int) (short) -1, (int) (short) 0, 10);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(66301905206252L, zoneId25);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId25);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.toString(9237499421220L, false, zoneId25);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId25);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01" + "'", str15, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19700101" + "'", str16, "19700101");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50400000L) + "'", long17 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 120424011872003L + "'", long36 == 120424011872003L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 116486622349140000L + "'", long44 == 116486622349140000L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4071-01-09" + "'", str45, "4071-01-09");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0000-01-01 00:00:00" + "'", str46, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2262-09-22 20:03:41.22" + "'", str47, "2262-09-22 20:03:41.22");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01 14:00:00" + "'", str48, "1970-01-01 14:00:00");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 107");
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
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) '4');
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969-12-31 17:59:59.999-06:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1969-12-31 17:59:59.999-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("+3425313-0 16:39:22", 2097204);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId7);
        java.time.ZonedDateTime zonedDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId7);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date11);
        char[] charArray18 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray18, (int) ' ');
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray18, (int) (short) 1);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray18, (int) (byte) 100, 0, zoneId25);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00", zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date11, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString(75126289427700000L, false, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("4071-01-09", zoneId25);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4071-01-09");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28800000L) + "'", long10 == (-28800000L));
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31" + "'", str12, "1969-12-31");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 50400000L + "'", long27 == 50400000L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31 04:00:00" + "'", str28, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+2382627-0 12:55:00" + "'", str29, "+2382627-0 12:55:00");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407924);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 3407969);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        long long25 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime24, "00010101");
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId35);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.toString(5478713135728003L, false, zoneId35);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime24, zoneId35);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-50401000L), zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) 10, 2293857, zoneId35);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-50372000L) + "'", long25 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "00010101" + "'", str27, "00010101");
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01" + "'", str36, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str37, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 00:00:00" + "'", str38, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+175583-07 23:55:28.003" + "'", str39, "+175583-07 23:55:28.003");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-100772000L) + "'", long40 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "19691231" + "'", str41, "19691231");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 3407904);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, (int) '4');
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, (int) 'a', (int) (short) 100);
        java.time.LocalDate localDate32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray6, (int) ' ');
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, 2293857);
        java.time.LocalTime localTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) 'a');
        java.lang.Class<?> wildcardClass39 = charArray6.getClass();
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
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDate32);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localTime36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097184, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 100, 3407924);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("21600223", 2293792, 605032704);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 21600223");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
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
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097249);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) 'a');
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
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localTime25);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(66120613958497000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20972");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097184);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 6357044);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) 10, 0);
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
        org.junit.Assert.assertNull(zonedDateTime18);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
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
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.nio.charset.Charset charset11 = null;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '4', (int) (byte) 0, charset11);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 28800, (int) (short) -1);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 1);
        byte[] byteArray21 = new byte[] {};
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray21, (int) (byte) 10);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray21, (int) ' ');
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray21, (int) 'a');
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, 100);
        java.time.LocalTime localTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray21, 28800);
        java.time.LocalTime localTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, 0);
        java.time.LocalTime localTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray21, (int) (short) 10);
        java.time.LocalDateTime localDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray21, (-1), 2097249);
        char[] charArray47 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray47, (int) ' ');
        java.time.LocalTime localTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray47, (int) (short) 1);
        java.time.ZoneId zoneId54 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long55 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray47, (int) (byte) 0, (int) (byte) 0, zoneId54);
        java.time.ZonedDateTime zonedDateTime56 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray21, 3407907, (int) (short) 1, zoneId54);
        java.util.Date date57 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-30 14:00:28", zoneId54);
        java.time.ZonedDateTime zonedDateTime58 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 100, (int) (short) 0, zoneId54);
        java.time.LocalDateTime localDateTime60 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 6357027);
        java.time.LocalTime localTime62 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(localTime33);
        org.junit.Assert.assertNull(localTime35);
        org.junit.Assert.assertNull(localTime37);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localTime51);
        org.junit.Assert.assertNotNull(zoneId54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNull(zonedDateTime56);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Tue Dec 30 00:00:28 CST 1969");
        org.junit.Assert.assertNull(zonedDateTime58);
        org.junit.Assert.assertNull(localDateTime60);
        org.junit.Assert.assertNull(localTime62);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId3);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId11);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId11);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-01 15:27:41", zoneId11);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId11);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Dec 30 14:00:00 CST 1969");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-62135625943000L) + "'", long13 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Dec 30 14:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-63131539000L) + "'", long15 == (-63131539000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1969-12-31 04:00:00" + "'", str16, "1969-12-31 04:00:00");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(72000000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 6357024);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 29143);
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
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 04:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "00000101");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000101" + "'", str3, "00000101");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 04:00:00" + "'", str4, "1969-12-31 04:00:00");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 10);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "+08:00");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+08:00" + "'", str3, "+08:00");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 6357044);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(2097187, 2293857, (int) '#', (-1), 400000000, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 72178180368624L + "'", long6 == 72178180368624L);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (byte) 1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, (int) (byte) 1);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, (-1));
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 2097249);
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
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDateTime34);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (-1), (int) (short) 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '#');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (short) -1, (int) '#');
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
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(zonedDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 2097184, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
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
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(100, 28800, 2293792, 605032704, 3407969, 2293795);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 216046439263L + "'", long6 == 216046439263L);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 2097184);
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) (byte) 1, 28800);
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
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:34:57", 2097187, 2293795);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969-12-31 04:34:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6357089, 100, 2293792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 2097204);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 605032704);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId36);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId36);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(date40);
        char[] charArray45 = new char[] { '4', ' ' };
        java.time.LocalDate localDate47 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray45, (int) (byte) 1);
        java.time.LocalDateTime localDateTime50 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray45, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray45, (int) (byte) 1);
        java.time.LocalDate localDate54 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray45, 100);
        long long57 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray45, 100, 0);
        java.time.LocalDateTime localDateTime59 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray45, 100);
        java.time.LocalDateTime localDateTime61 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray45, 10);
        java.time.ZoneId zoneId64 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long65 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray45, (int) (short) 100, (int) (short) 0, zoneId64);
        java.lang.String str66 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId64);
        java.lang.String str67 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId64);
        java.time.LocalDateTime localDateTime69 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("2006/03/01T13:08:55");
        long long70 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime69);
        java.time.ZoneId zoneId74 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long82 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId74, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str83 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId74);
        java.lang.String str84 = com.alibaba.fastjson2.util.DateUtils.toString(10L, true, zoneId74);
        long long85 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime69, zoneId74);
        java.lang.String str86 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId74);
        java.lang.String str87 = com.alibaba.fastjson2.util.DateUtils.toString((-62034997616L), true, zoneId74);
        java.util.Date date88 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31T18:00:00", zoneId74);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime89 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 2097249, (int) (byte) 1, zoneId74);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31" + "'", str37, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 18:00:00.01" + "'", str38, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31 17:59:59.999" + "'", str39, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4,  ]");
        org.junit.Assert.assertNull(localDate47);
        org.junit.Assert.assertNull(localDateTime50);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNull(localDateTime59);
        org.junit.Assert.assertNull(localDateTime61);
        org.junit.Assert.assertNotNull(zoneId64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "1970-01-01" + "'", str66, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-02 04:00:00" + "'", str67, "1970-01-02 04:00:00");
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1141240135000L + "'", long70 == 1141240135000L);
        org.junit.Assert.assertNotNull(zoneId74);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 66118358169080000L + "'", long82 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "19700101" + "'", str83, "19700101");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "1970-01-01 08:00:00.01+08:00" + "'", str84, "1970-01-01 08:00:00.01+08:00");
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1141189735000L + "'", long85 == 1141189735000L);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "1970-01-02 04:00:00" + "'", str86, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "1968-01-14 08:03:22.384+08:00" + "'", str87, "1968-01-14 08:03:22.384+08:00");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1, (-1), 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2293857, 2293812, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 6357044);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId15);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(845783446348L, zoneId15);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) ' ', 0, zoneId15);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1996-10-20" + "'", str17, "1996-10-20");
        org.junit.Assert.assertNull(zonedDateTime18);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407907);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 28800, 0);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 29143);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2293795);
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) 'a');
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357024);
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
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) '4');
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 29143);
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
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968-01-16 16:56:17");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61779823000L) + "'", long2 == (-61779823000L));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1968/02/20", 2097187, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1968/02/20");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-17 06:56:17.34+08:00", "4071-01-09");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1968-01-17 06:56:17.34+08:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 6357024);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime13);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId16);
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId22);
        java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId22);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId22);
        char[] charArray33 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray33, (int) ' ');
        java.time.LocalTime localTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray33, (int) (short) 1);
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray33, (int) (byte) 0, (int) (byte) 0, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId40);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId40);
        java.time.ZoneId zoneId46 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId46);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId46);
        long long49 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId46);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 400000000, zoneId46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 400000000");
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
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str14, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50372000L) + "'", long18 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100772000L) + "'", long26 == (-100772000L));
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(localTime37);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 08:00:00.001" + "'", str42, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-100772000L) + "'", long43 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01" + "'", str47, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-100772000L) + "'", long49 == (-100772000L));
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) 100);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2293857);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("21600223", 0);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        byte[] byteArray12 = new byte[] {};
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray12, (int) (byte) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray12, (int) (byte) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray12, (int) ' ');
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray12, (int) (byte) 100);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray12, 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray12, (int) (short) -1);
        java.nio.charset.Charset charset27 = null;
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId31);
        long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray12, (int) ' ', (int) (short) 0, charset27, zoneId31);
        long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 09:45:57.024+08:00", zoneId31);
        java.time.ZonedDateTime zonedDateTime36 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (int) '#', (-1), zoneId31);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input d??");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str33, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 6357024L + "'", long35 == 6357024L);
        org.junit.Assert.assertNull(zonedDateTime36);
        org.junit.Assert.assertNull(localDateTime38);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 3407907, 0, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) -1, false, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("4071-01-09 00:00:00", zoneId13);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId13);
        long long26 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId13, 100, 2097184, 0, 100, (int) '#', (-1), 29143);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.getZoneId("5573-09-23 08:19:29.228+08:00", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 5573-09-23 08:19:29.228+08:00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  ]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 07:59:59.999" + "'", str16, "1970-01-01 07:59:59.999");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 66301862400000L + "'", long17 == 66301862400000L);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5482584995699000L + "'", long26 == 5482584995699000L);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, (int) (short) 100);
        byte[] byteArray18 = new byte[] {};
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray18, 3407907);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray18, (int) (byte) -1);
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
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId36);
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId36);
        java.time.ZonedDateTime zonedDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray18, (int) (short) 100, (int) (short) -1, zoneId36);
        java.util.Date date45 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-01-01", zoneId36);
        long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 3407904, 0, zoneId36);
        java.time.LocalDateTime localDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, (int) (short) 100);
        java.time.LocalDateTime localDateTime50 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, 605032704);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19700101" + "'", str42, "19700101");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2160-02-23" + "'", str43, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime44);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Jan 02 09:54:17 CST 1");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNull(localDateTime48);
        org.junit.Assert.assertNull(localDateTime50);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 28800);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 10);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 10);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 3407924);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((long) 2097187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 3407907);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 2293857);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-61908904448L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29143 + "'", int1 == 29143);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 6357027);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) 'a', (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 2097249);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("-0001-12-3 10:03:41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 2097204);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray6, 3407904);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) -1);
        byte[] byteArray18 = new byte[] {};
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray18, (int) (byte) -1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray18, (int) (byte) 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray18, (int) ' ');
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray18, (int) 'a');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray18, (int) (short) 1);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray18, 1);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray18, 6357044);
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray18, (int) (byte) 0);
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray44 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray44, (int) ' ');
        java.time.LocalTime localTime48 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray44, (int) (short) 1);
        java.time.ZoneId zoneId51 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long52 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray44, (int) (byte) 100, 0, zoneId51);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId51);
        java.util.Date date55 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId58 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId58);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId58);
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date55, zoneId58);
        java.lang.String str62 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date55);
        java.time.ZoneId zoneId68 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId68);
        java.lang.String str70 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId68);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId68);
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date55, zoneId68);
        long long73 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId68);
        java.lang.String str74 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime39);
        java.time.LocalDateTime localDateTime77 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str78 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime77);
        java.time.ZoneId zoneId80 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str81 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId80);
        long long82 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime77, zoneId80);
        long long83 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId80);
        long long84 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId80);
        java.time.ZonedDateTime zonedDateTime85 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray18, 3407969, 10, zoneId80);
        // The following exception was thrown during execution in test generation
        try {
            long long86 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, (int) (short) 1, zoneId80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate46);
        org.junit.Assert.assertNull(localTime48);
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-50372000L) + "'", long53 == (-50372000L));
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "19700101" + "'", str60, "19700101");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01 14:00:00" + "'", str61, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970-01-01" + "'", str62, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1969-12-31" + "'", str69, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1969-12-31 18:00:00.01" + "'", str70, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "1969-12-31 17:59:59.999" + "'", str71, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-01 00:00:00" + "'", str72, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-50372000L) + "'", long73 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str74, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str78, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1969-12-31" + "'", str81, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + (-50372000L) + "'", long82 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 21600000L + "'", long83 == 21600000L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-50372000L) + "'", long84 == (-50372000L));
        org.junit.Assert.assertNull(zonedDateTime85);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 2097184);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 6357027, 28800);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, (int) (byte) 10);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, 3407907, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407924);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("19680114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 6357024);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) -1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId2);
        java.time.ZonedDateTime zonedDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId2);
        java.lang.Class<?> wildcardClass5 = zonedDateTime4.getClass();
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-31 17:59:59");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("Asia/Shanghai", "1970-01-02 04:00:00+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Asia/Shanghai' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-30 14:00:28");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Tue Dec 30 14:00:28 CST 1969");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 100);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097187);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 6357044);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (-1));
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
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
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "1969-12-31T19:45:57");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "19691230");
        long long4 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691230" + "'", str3, "19691230");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 107480584800000L + "'", long4 == 107480584800000L);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407907);
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
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.01+08:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        java.lang.Class<?> wildcardClass4 = date1.getClass();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:00" + "'", str3, "1969-12-31 18:00:00");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("", 2293857, 3407907);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 6357044, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) '#');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 2293812);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, 100);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 1, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) (byte) -1, (int) ' ');
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 0, (int) (byte) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 29143);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '#', '#', '#', 'a', ' ', ' ', '#', '#', 'a', ' ', 'a', 'a', '4', 'a', '#', '4', ' ', ' ', 'a', ' ', ' ', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId3);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date6);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Dec 30 14:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19691230" + "'", str7, "19691230");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-30 14:00:00" + "'", str8, "1969-12-30 14:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-30" + "'", str9, "1969-12-30");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-30" + "'", str10, "1969-12-30");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray5, (int) (byte) 0, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 2293792, 6357044);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray5, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1968/01/13T18:03:22");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1968/01/13T18:03:22");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097180");
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
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId8);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString(date12);
        char[] charArray17 = new char[] { '4', ' ' };
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray17, (int) (byte) 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray17, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray17, (int) (byte) 1);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray17, 100);
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray17, 100, 0);
        java.time.LocalDateTime localDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray17, 100);
        java.time.LocalDateTime localDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray17, 10);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray17, (int) (short) 100, (int) (short) 0, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.format(date12);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(date12);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date44, zoneId47);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date44);
        java.time.ZoneId zoneId57 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId57);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId57);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId57);
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date44, zoneId57);
        java.util.Date date62 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId57);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date12, zoneId57);
        java.util.Date date64 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969", zoneId57);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(233824486684L, zoneId57);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31" + "'", str9, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 18:00:00.01" + "'", str10, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 17:59:59.999" + "'", str11, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 14:00:00" + "'", str13, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ]");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(localDateTime31);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-02 04:00:00" + "'", str39, "1970-01-02 04:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "19700101" + "'", str49, "19700101");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01 14:00:00" + "'", str50, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01" + "'", str51, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1969-12-31" + "'", str58, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31 18:00:00.01" + "'", str59, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1969-12-31 17:59:59.999" + "'", str60, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970-01-01 00:00:00" + "'", str61, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01 14:00:00" + "'", str63, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "19770530" + "'", str65, "19770530");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(100, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-00-97" + "'", str3, "0100-00-97");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId5);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1970-01-01 08:00:00.001");
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray20, 100);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27, zoneId30);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId30);
        java.time.ZonedDateTime zonedDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray20, 2097249, 1, zoneId30);
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId30);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.getZoneId("0000-52-00", zoneId30);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 0000-52-00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 14:00:00" + "'", str8, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 08:00:00.001" + "'", str12, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 14:00:00" + "'", str33, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19700101" + "'", str34, "19700101");
        org.junit.Assert.assertNull(zonedDateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-62167248343000L) + "'", long36 == (-62167248343000L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01 14:00:00" + "'", str37, "1970-01-01 14:00:00");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 19:45:57", 0);
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4);
        byte[] byteArray6 = new byte[] {};
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray6, (int) (byte) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray6, (int) (byte) 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray6, (int) ' ');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray6, (int) (short) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray6, 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray6, (int) (byte) 10);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray6, (int) (short) 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray6, (int) (byte) -1);
        java.util.Date date26 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.format(date26);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.toString(date26);
        java.time.ZoneId zoneId33 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId33);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId33);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId33);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date26);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date26);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId42);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId42);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId42);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date26, zoneId42);
        java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, (int) (short) 0, (int) (byte) 1, zoneId42);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId42);
        java.util.Date date49 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 17:59:59.999", zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("5754-02-28", zoneId42);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 5754-02-28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6357000L + "'", long5 == 6357000L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 00:00:00" + "'", str28, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01 00:00:00" + "'", str29, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970-01-01" + "'", str43, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "19700101" + "'", str44, "19700101");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-50400000L) + "'", long45 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01 14:00:00" + "'", str46, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-44043000L) + "'", long48 == (-44043000L));
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Wed Dec 31 03:59:59 CST 1969");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '#', '#', '#', 'a', 'a', 'a', ' ', ' ', ' ', '4', '#', '4', 'a', '#', 'a', 'a', 'a', '#', 'a', '#', 'a', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("20.07.1673 23:18:15");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 0);
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
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray2, (int) (short) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray2, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray2, (int) (byte) 10);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray2, (int) (short) 1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray2, (int) (byte) -1);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.format(date22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(date22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.toString(date22);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId29);
        java.util.Date date31 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId29);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date22);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date22);
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId38);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId38);
        long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId38);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date22, zoneId38);
        java.time.ZonedDateTime zonedDateTime43 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) 0, (int) (byte) 1, zoneId38);
        java.util.Date date44 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.1", zoneId38);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId38, 2097184, (int) ' ', (int) (short) 0, 2293857, 0, 605032704, 605032704);
        long long53 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1973-10-28T01:06:07", zoneId38);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 00:00:00" + "'", str23, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 14:00:00" + "'", str32, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01" + "'", str33, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "19700101" + "'", str34, "19700101");
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-50400000L) + "'", long41 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 14:00:00" + "'", str42, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 66118922282512605L + "'", long52 == 66118922282512605L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 120589567000L + "'", long53 == 120589567000L);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097184);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 400000000);
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
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 3407969);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (int) '4');
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2097184, 6357024, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 400000000);
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
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1973-11-19 23:18:05.04+08:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        java.time.LocalDate localDate44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 10);
        java.time.LocalTime localTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 1);
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
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertNull(localTime46);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("18.08.4267 10:56:13");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Sun Aug 18 10:56:13 CDT 4267");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('a', '#', 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 100);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 2097184);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, 3407969);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray6, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097181");
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
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        java.time.ZoneId zoneId1 = null;
        long long2 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("6255-06-11 10:13:29", zoneId1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 135235494809000L + "'", long2 == 135235494809000L);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6, "2006-02-28");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Dec 30 14:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2006-02-28" + "'", str8, "2006-02-28");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-30 14:00:00" + "'", str9, "1969-12-30 14:00:00");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 400000000);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 2097249);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 0);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 6357089, 2097184);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407924);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 400000000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 400000010");
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
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = com.alibaba.fastjson2.util.DateUtils.parseMillis("-0001-00-0", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-00-0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (-1));
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 3407924, 0);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
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
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 0, (int) '#');
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
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969/12/31T18:00:00");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime4);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId7);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId7);
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId7);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(date16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(date16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(date16);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId23);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date16, zoneId23);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId23);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1970-01-01 14:00:00", zoneId23);
        long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 03:59:59", zoneId23);
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId23);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-01-14 08:03:22.384+08:00");
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "0000-12-31 10:03:41");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str5, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31" + "'", str8, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50372000L) + "'", long9 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 21600000L + "'", long10 == 21600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 00:00:00" + "'", str17, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 00:00:00" + "'", str18, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertNull(date25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 14:00:00" + "'", str26, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-50401000L) + "'", long27 == (-50401000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 21600000L + "'", long28 == 21600000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100801000L) + "'", long29 == (-100801000L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50400000L) + "'", long30 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1968-01-14 08:03:22.384+08:00" + "'", str33, "1968-01-14 08:03:22.384+08:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00018:00:00" + "'", str34, "\000\000\000\000\000\000\000\000\000\000\00018:00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0000-12-31 10:03:41" + "'", str36, "0000-12-31 10:03:41");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', '#', ' ', ' ', '4', '4', ' ', '4', 'a', '4', '4', 'a', ' ', '#', '4', '#', ' ', ' ', ' ', '#', 'a', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407907);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId25);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId25);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date17, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 29143, 100, zoneId25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
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
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0001-01-01 00:00:00" + "'", str18, "0001-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1969-12-31" + "'", str26, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1969-12-31 18:00:00.01" + "'", str27, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31 17:59:59.999" + "'", str28, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0001-01-01 00:00:00" + "'", str30, "0001-01-01 00:00:00");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (short) 1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("2262-09-22", (-1));
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31T19:45:57");
        org.junit.Assert.assertNotNull(zonedDateTime1);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.getZoneId("5786/01/30", zoneId21);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 5786/01/30");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str16, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100772000L) + "'", long23 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-100772000L) + "'", long24 == (-100772000L));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, 2097184);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, 0);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (-1));
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 6357027);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, 6357044);
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
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 2293795);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray5, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
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
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 1, (int) (short) 100, 2097187, (int) 'a', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 0);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, (int) (byte) -1, 2097187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
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
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray7, 2097184);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray7, (-1));
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, 0);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray27, 100);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId37);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId37);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray27, 2097249, 1, zoneId37);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0000-01-01 00:00:00", zoneId37);
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 29143, 0, zoneId37);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357044, false, zoneId37);
        java.util.Date date46 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId37);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "19700101" + "'", str41, "19700101");
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-62167248343000L) + "'", long43 == (-62167248343000L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1970-01-01 09:45:57.044" + "'", str45, "1970-01-01 09:45:57.044");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 CST 1970");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 6357089);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((-1), (int) (byte) 100, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (byte) 10, (int) (short) 0);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 10, 1);
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
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.1");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 08:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 08:00:00" + "'", str2, "1970-01-01 08:00:00");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        long long5 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId3);
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6, "1673-07-20 23:18:15");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-62135625943000L) + "'", long5 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Dec 30 14:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1673-07-20 23:18:15" + "'", str8, "1673-07-20 23:18:15");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "2006-03-02");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2006-03-02" + "'", str7, "2006-03-02");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
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
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date1);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) '#');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, 3407969, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 2097204);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 1);
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
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("19680120");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19680120");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 3407904);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) (short) 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 3407907);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, 3407907);
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
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localTime31);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(72506159773199L, dateTimeFormatPattern4);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(8942726307815L, dateTimeFormatPattern4);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:00:00" + "'", str5, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "18.08.4267 10:56:13" + "'", str7, "18.08.4267 10:56:13");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "20.05.2253 13:38:27" + "'", str8, "20.05.2253 13:38:27");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray4, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray4, 0);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray4, (int) 'a');
        char[] charArray22 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray22, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray22, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 0, (int) (byte) 0, zoneId29);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray4, (int) (byte) 0, 0, zoneId29);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("5786-01-31", zoneId29);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date32);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(zonedDateTime31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Mon Jan 30 10:00:00 CST 5786");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "5786-01-30 10:00:00" + "'", str33, "5786-01-30 10:00:00");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) '4');
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, 3407904);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097249");
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
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-62135575764000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0001-01-01 00:00:00" + "'", str1, "0001-01-01 00:00:00");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 6357024);
        char[] charArray20 = null;
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
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId35);
        long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray20, 100, 28800, zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) (byte) 0, zoneId35);
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (-1));
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, 3407924);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '4');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray6, 10);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("+3425313-0 16:39:22+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +3425313-0 16:39:22+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407904);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2293795);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 2097249);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 2293792);
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
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "+08:00");
        java.time.ZoneId zoneId50 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId50);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId50);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId50);
        java.util.Date date54 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId50);
        java.lang.String str55 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date54);
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date54);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date54);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate66 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray64, 0);
        java.time.LocalDateTime localDateTime68 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray64, 0);
        java.time.ZoneId zoneId72 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str73 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId72);
        java.time.ZonedDateTime zonedDateTime74 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray64, 28800, 0, zoneId72);
        java.lang.String str75 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId72);
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date54, zoneId72);
        long long77 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId72);
        java.lang.String str79 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1970-01-01 07:59:59.999");
        long long80 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.Class<?> wildcardClass81 = localDateTime1.getClass();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+08:00" + "'", str43, "+08:00");
        org.junit.Assert.assertNotNull(zoneId50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1969-12-31" + "'", str51, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1969-12-31 18:00:00.01" + "'", str52, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1969-12-31 17:59:59.999" + "'", str53, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "19700101" + "'", str55, "19700101");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01 14:00:00" + "'", str56, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01" + "'", str57, "1970-01-01");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate66);
        org.junit.Assert.assertNull(localDateTime68);
        org.junit.Assert.assertNotNull(zoneId72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1969-12-31" + "'", str73, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "19731114" + "'", str75, "19731114");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1970-01-02 04:00:00" + "'", str76, "1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-100772000L) + "'", long77 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "1970-01-01 07:59:59.999" + "'", str79, "1970-01-01 07:59:59.999");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-50372000L) + "'", long80 == (-50372000L));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1970-01-01 08:56:47");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-01 15:27:41.258-06:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-01 15:27:41.258-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
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
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date2, "1968-01-14 08:03:22.384+08:00");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString(date2);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1968-01-14 08:03:22.384+08:00" + "'", str20, "1968-01-14 08:03:22.384+08:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0001-01-01 00:00:00" + "'", str21, "0001-01-01 00:00:00");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', ' ', ' ' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) -1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 3407907, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, 2097204, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, (int) 'a');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray6, 2293795);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  , a,  ,  ]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        char[] charArray6 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) ' ');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray6, (int) (short) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (byte) 0, (int) (byte) 0, zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("19731119", "1969-12-31 18:34:57", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '19731119' could not be parsed at index 2");
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
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId8);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId8);
        java.util.Date date12 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(0L, zoneId8);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.getZoneId("+175583-07 23:55:28.003", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for ZoneOffset, invalid format: +175583-07 23:55:28.003");
        } catch (java.time.DateTimeException e) {
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
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) -1);
        byte[] byteArray22 = new byte[] {};
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray22, (int) (byte) -1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray22, (int) (byte) 10);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray22, (int) ' ');
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray22, (int) (byte) 100);
        java.time.LocalTime localTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray22, 10);
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray22, (int) 'a');
        java.time.LocalTime localTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray22, (int) (byte) 100);
        java.nio.charset.Charset charset39 = null;
        java.time.LocalDateTime localDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-15 20:30:27", 0);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId47);
        java.util.Date date50 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31", zoneId47);
        long long51 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime42, zoneId47);
        long long52 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray22, (int) '#', (int) (byte) 0, charset39, zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            long long53 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 6357044, zoneId47);
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localTime32);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localTime36);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31 18:00:00.01" + "'", str49, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-61853373000L) + "'", long51 == (-61853373000L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1, zoneId8);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date1);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 00:00:00" + "'", str14, "1970-01-01 00:00:00");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 2293857);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407907);
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
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) -1, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 01 15:27:41 CST 1968");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 2097249);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 2293857, 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        byte[] byteArray14 = new byte[] {};
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray14, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray14, (int) (byte) 10);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray14, (int) ' ');
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray14, (int) 'a');
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray14, 100);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray14, 28800);
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray14, 0);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray14, (int) (short) 10);
        java.time.LocalDateTime localDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray14, (-1), 2097249);
        char[] charArray40 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate42 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray40, (int) ' ');
        java.time.LocalTime localTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray40, (int) (short) 1);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long48 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray40, (int) (byte) 0, (int) (byte) 0, zoneId47);
        java.time.ZonedDateTime zonedDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray14, 3407907, (int) (short) 1, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 1, zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) 1, 3407907, zoneId47);
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
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate42);
        org.junit.Assert.assertNull(localTime44);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(zonedDateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01" + "'", str50, "1970-01-01");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 6357024);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 2293857);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 2293812);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 28800);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 1);
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 2097187, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097187");
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
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
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
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-100772000L), zoneId15);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("1968-01-27", zoneId15);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId15, 3407924, (int) (short) 0, (int) '4', (int) (byte) 1, 6357089, (int) (byte) 10, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("+08:00", zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31" + "'", str22, "1969-12-31");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 26 10:00:00 CST 1968");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 107481910033750000L + "'", long31 == 107481910033750000L);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString(date6);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId13);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00", zoneId13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(0L, false, zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.getZoneId("\000\000\000\000\000\000\000\000\000\000\00013:08:55", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: ???????????13:08:55");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01" + "'", str14, "1970-01-01");
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01 14:00:00" + "'", str16, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50401000L) + "'", long17 == (-50401000L));
        org.junit.Assert.assertNotNull(zonedDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 08:00:00" + "'", str19, "1970-01-01 08:00:00");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray2, (int) 'a');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray2, 28800);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray2, (int) (short) 10);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray2, (-1), 2097249);
        char[] charArray28 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray28, (int) ' ');
        java.time.LocalTime localTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray28, (int) (short) 1);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray28, (int) (byte) 0, (int) (byte) 0, zoneId35);
        java.time.ZonedDateTime zonedDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, 3407907, (int) (short) 1, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-59111391000L), zoneId35);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31T18:00:00", zoneId35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(localTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNull(localTime32);
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(zonedDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19680217" + "'", str38, "19680217");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-50400000L) + "'", long39 == (-50400000L));
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (byte) 0, (int) (short) 1);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2293795);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long39 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId31, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId31);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(6357024L, false, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 0, zoneId31);
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(zonedDateTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 66118358169080000L + "'", long39 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 09:45:57.024" + "'", str41, "1970-01-01 09:45:57.024");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(6357089, 2293857, (int) 'a', 6357089, 2097187, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-164474159321560L) + "'", long6 == (-164474159321560L));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ?????");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(zonedDateTime12);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01 00:00:00");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000-01-01 00:00:00" + "'", str6, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        java.time.ZoneId zoneId1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId1, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10, "");
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(date10, "26.01.1968");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 66118358169080000L + "'", long9 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "26.01.1968" + "'", str14, "26.01.1968");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        char[] charArray25 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray25, (int) ' ');
        java.time.LocalTime localTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray25, (int) (short) 1);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray25, (int) (byte) 0, (int) (byte) 0, zoneId32);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-1L), zoneId32);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 2097249, zoneId32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localTime29);
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01 14:00:00" + "'", str34, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 3407907);
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
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, 10);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (short) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 3407924);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 1, -1]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
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
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime35);
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId38);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime35, zoneId38);
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray47, 100);
        java.util.Date date54 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId57 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId57);
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId57);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date54, zoneId57);
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId57);
        java.time.ZonedDateTime zonedDateTime62 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray47, 2097249, 1, zoneId57);
        long long63 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime35, zoneId57);
        java.lang.String str64 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(66301905206252L, zoneId57);
        java.lang.String str65 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId57);
        long long66 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId57);
        java.util.Date date68 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str69 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date68);
        java.lang.String str71 = com.alibaba.fastjson2.util.DateUtils.format(date68, "");
        java.lang.String str72 = com.alibaba.fastjson2.util.DateUtils.toString(date68);
        java.time.ZoneId zoneId75 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str76 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId75);
        java.lang.String str77 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId75);
        java.lang.String str78 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date68, zoneId75);
        long long79 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId75);
        // The following exception was thrown during execution in test generation
        try {
            long long87 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId75, 6357044, 2293857, (int) (short) 10, (int) 'a', 2293812, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 2293857");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str36, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1969-12-31" + "'", str39, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-50372000L) + "'", long40 == (-50372000L));
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime49);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01" + "'", str58, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "19700101" + "'", str59, "19700101");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1970-01-01 14:00:00" + "'", str60, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "19700101" + "'", str61, "19700101");
        org.junit.Assert.assertNull(zonedDateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-100772000L) + "'", long63 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "40710109" + "'", str64, "40710109");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "1970-01-01" + "'", str65, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-100772000L) + "'", long66 == (-100772000L));
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "1970-01-01" + "'", str69, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "1970-01-01 00:00:00" + "'", str72, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1970-01-01" + "'", str76, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "19700101" + "'", str77, "19700101");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "1970-01-01 14:00:00" + "'", str78, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-100772000L) + "'", long79 == (-100772000L));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 1);
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 2293857);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (short) 10);
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, (int) (byte) 0, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407904");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-07-19 07:57:13");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-07-19 07:57:13");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(2097187, 6357089, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, (int) (short) -1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) (byte) 0);
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (short) 100, (int) (short) 1);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray5, 2293857);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 14:00:00");
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27, zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray5, 0, zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(zonedDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-02 04:00:00" + "'", str29, "1970-01-02 04:00:00");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 3407904);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 0);
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
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 29143, (int) (byte) -1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 2097187);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 3407904);
        java.nio.charset.Charset charset22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 6357044, 6357089, charset22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 2293857);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 2097184);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (int) '4');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 2097187);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime(' ', 'a', '4', '#', 'a', 'a', '#', '#');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357024);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 1, (int) (byte) 10);
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
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date1, "");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1968-01-16");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1968-01-16" + "'", str7, "1968-01-16");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, 6357044);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray0, (int) '4', 2293812);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 3407904);
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
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
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
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(120632400000L, zoneId30);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1973-10-28" + "'", str37, "1973-10-28");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, 3407907, (int) '#');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 1, (int) (short) 100);
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId36);
        java.time.ZonedDateTime zonedDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId36);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId36);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date40);
        char[] charArray47 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate49 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray47, (int) ' ');
        java.time.LocalTime localTime51 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray47, (int) (short) 1);
        java.time.ZoneId zoneId54 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long55 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray47, (int) (byte) 100, 0, zoneId54);
        long long56 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00", zoneId54);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId54);
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.toString(75126289427700000L, false, zoneId54);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 100, (int) '#', zoneId54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-28800000L) + "'", long39 == (-28800000L));
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1969-12-31" + "'", str41, "1969-12-31");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate49);
        org.junit.Assert.assertNull(localTime51);
        org.junit.Assert.assertNotNull(zoneId54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 50400000L + "'", long56 == 50400000L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1969-12-31 04:00:00" + "'", str57, "1969-12-31 04:00:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+2382627-0 12:55:00" + "'", str58, "+2382627-0 12:55:00");
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray6, (int) (byte) 1);
        long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) 'a', (int) (short) 0);
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, (int) '4', 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293795");
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
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(localDate28);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (short) 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 3407924);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 2293857);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (short) -1);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 3407924);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969-12-30");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "1968-01-01 15:27:41.258");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-30 00:00:00" + "'", str2, "1969-12-30 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1968-01-01 15:27:41.258" + "'", str4, "1968-01-01 15:27:41.258");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 29143, (int) '#');
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
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 3407924);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) ' ');
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
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 1, 0, (int) (byte) 0, (int) ' ', (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0001-00-00 32:00:00" + "'", str6, "0001-00-00 32:00:00");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) 'a', 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 100);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (short) 100);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (-1));
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 3407904);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (int) '#');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(29143, 0, 28800, dateTimeFormatPattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0001/01/01" + "'", str7, "0001/01/01");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) 'a', (int) '4');
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 2097184, (int) (short) 100);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 28800);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 6357027, (int) (short) -1);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 1);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357044);
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
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray6, 1);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) '#', 0);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray6, 0);
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
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localDateTime28);
        org.junit.Assert.assertNull(localTime30);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, (int) (byte) -1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 400000000);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) 'a');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 2097184);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 2293792);
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
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "0001-00-01");
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31 04:00:28");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-00-01" + "'", str12, "0001-00-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31 04:00:28" + "'", str14, "1969-12-31 04:00:28");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 0);
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
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId10 = com.alibaba.fastjson2.util.DateUtils.getZoneId("5786/01/30", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 5786/01/30");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str8, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) '4', (int) (short) 100);
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
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 6357027);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 2097187);
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
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId4);
        long long7 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.time.ZoneId zoneId8 = null;
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-01-13 11:27:25");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-50372000L) + "'", long7 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50372000L) + "'", long9 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50372000L) + "'", long10 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1968-01-13 11:27:25" + "'", str12, "1968-01-13 11:27:25");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 0);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("31.12.1969 18:34:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 31.12.1969 18:34:57");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (short) 100);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) -1);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) '4');
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, 2293857);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 6357024, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) '#');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357087");
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 2293857);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) '#', 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(zonedDateTime14);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '4', 'a', '4', 'a', 'a', '4', '#', 'a', '4', '4', ' ', 'a', '#', '#', ' ', ' ', '#', ' ', '#', '4', '#', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 28800);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 6357024);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097184");
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
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 1, (int) (byte) 10, zoneId11);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) ' ');
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 3407924);
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
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (short) 0, (int) '4');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (short) 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (short) 10);
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 3407924);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) 10, (int) '4');
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) 0);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2293857, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -95");
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((long) 2097249, dateTimeFormatPattern3);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((-58754933900L), dateTimeFormatPattern3);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern3 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern3.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31.12.1969 18:00:00" + "'", str4, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31.12.1969 18:34:57" + "'", str5, "31.12.1969 18:34:57");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20.02.1968 17:11:06" + "'", str6, "20.02.1968 17:11:06");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("0035-10-00");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-14 08:03:22", 0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (short) 100, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 3407924);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (byte) 0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
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
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId4);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId4);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1141240135347L, zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("19680120", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19680120");
        } catch (java.time.format.DateTimeParseException e) {
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
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("0000-10-00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("26.01.1968");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(605032704, 2293792, (int) (byte) -1, 2293792, 0, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6050327");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) 0);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2293857, (int) (short) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 2097184);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01 00:00:00");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1968-01-27");
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1968-01-26 00:00:00");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000-01-01 00:00:00" + "'", str6, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1968-01-27" + "'", str10, "1968-01-27");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1968-01-26 00:00:00" + "'", str12, "1968-01-26 00:00:00");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, (int) (short) 100);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray6, (int) '4');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "####44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #, #, #, 4, 4]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray4, (int) (byte) 1);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray4, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray4, 0);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray4, (int) 'a');
        char[] charArray22 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray22, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray22, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 0, (int) (byte) 0, zoneId29);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray4, (int) (byte) 0, 0, zoneId29);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId29);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(zonedDateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01" + "'", str32, "1970-01-01");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (byte) 1, (int) '#', 10, 3407924, 3407969, 2293857);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62454739491L) + "'", long6 == (-62454739491L));
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 1, 28800);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (-1));
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("20.02.1968 17:11:06", "1969-12-31 18:00:00.01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '20.02.1968 17:11:06' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 0, (int) (short) 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, 6357089, 2293795);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8650884");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        char[] charArray13 = new char[] { '4', ' ' };
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray13, (int) (byte) 1);
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId19);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray13, 3407907, 0, zoneId19);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(10L, zoneId19);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 100, zoneId19);
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
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ]");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "19700101" + "'", str22, "19700101");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407924);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 1, (int) ' ');
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 3407904);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) (short) 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, 3407907);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray39, 0);
        java.time.LocalDateTime localDateTime43 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray39, 0);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId47);
        java.time.ZonedDateTime zonedDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray39, 28800, 0, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId47);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-61873185443L), zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray6, (int) (byte) -1, 6357089, zoneId47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
        org.junit.Assert.assertNull(localTime25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate41);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19731114" + "'", str50, "19731114");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1968-01-16" + "'", str51, "1968-01-16");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
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
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 1, 28800);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, 1);
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
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
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) '#');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 6357044);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, 28800);
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
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (short) 10);
        char[] charArray25 = new char[] { '4', ' ' };
        java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray25, (int) (byte) 1);
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray25, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray25, (int) (byte) 1);
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray25, 0);
        java.time.LocalTime localTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray25, 100);
        java.time.LocalDateTime localDateTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray25, 2097184);
        java.time.LocalDateTime localDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray25, 3407924);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId47);
        long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 04:00:00", zoneId47);
        java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray25, 2293795, 0, zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407907, 100, zoneId47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4,  ]");
        org.junit.Assert.assertNull(localDate27);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localTime36);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31 18:00:00.01" + "'", str49, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-50400000L) + "'", long50 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime51);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long40 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId24, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId24);
        java.time.ZonedDateTime zonedDateTime42 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 3407904, (int) (short) 1, zoneId24);
        java.time.LocalDateTime localDateTime44 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass47 = byteArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 66118358169080000L + "'", long32 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 5482764781252003L + "'", long40 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str41, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(zonedDateTime42);
        org.junit.Assert.assertNull(localDateTime44);
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (short) 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) '#');
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 6357044);
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
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) -1);
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (byte) 0, 2097204, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("\000\000\000\000\000\000\000\000\000\000\00000:00:00", zoneId1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-61779823000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1968-01-16 16:56:17" + "'", str1, "1968-01-16 16:56:17");
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
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
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) '4');
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.format(date23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(date23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString(date23);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId30);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId30);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date23);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23);
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId40);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId40);
        long long51 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId40, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime52 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId40);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId40);
        java.time.ZoneId zoneId58 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId58);
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId58);
        long long61 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId58);
        java.time.ZonedDateTime zonedDateTime62 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId58);
        java.lang.String str63 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId58);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 6357027, zoneId58);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 00:00:00" + "'", str24, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 14:00:00" + "'", str33, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970-01-01" + "'", str34, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 00:00:00" + "'", str35, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19700101" + "'", str42, "19700101");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-50400000L) + "'", long43 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 135235494809000L + "'", long51 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970-01-01 14:00:00" + "'", str53, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01" + "'", str59, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "19700101" + "'", str60, "19700101");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-50400000L) + "'", long61 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1970-01-01 14:00:00" + "'", str63, "1970-01-01 14:00:00");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 0);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 0, 0);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 6357044);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, (int) (byte) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 3407907);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        char[] charArray5 = new char[] { '4', ' ' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray5, (int) (byte) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId11);
        long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 3407907, 0, zoneId11);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("5375-12-04 00:00:00", zoneId11);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString(0L, false, zoneId11);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  ]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970-01-01 08:00:00" + "'", str15, "1970-01-01 08:00:00");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) (short) -1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
    }
}

