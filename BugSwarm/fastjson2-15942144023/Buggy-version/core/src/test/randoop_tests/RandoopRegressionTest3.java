import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407903");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (byte) 0, (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-52-00" + "'", str3, "0000-52-00");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray7, 100);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date14, zoneId17);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId17);
        java.time.ZonedDateTime zonedDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray7, 2097249, 1, zoneId17);
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:28", zoneId17);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId17, (int) (byte) 0, 2293857, (int) 'a', (int) (short) 100, (-1), 2097204, 100);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19700101" + "'", str19, "19700101");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 14:00:00" + "'", str20, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19700101" + "'", str21, "19700101");
        org.junit.Assert.assertNull(zonedDateTime22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Dec 30 14:00:28 CST 1969");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5999128540344000L + "'", long31 == 5999128540344000L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1969-12-31 17:59:59.999");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', 'a', ' ', 'a', '#', ' ', ' ', ' ', '#', 'a', ' ', '#', 'a', '4', ' ', '#', '4', 'a', '4', ' ', '#', '4', '#');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1969-12-31 03:59:59");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1969-12-31 04:00:28");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("5375-12-04 00:00:00", (int) (byte) 100);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 18:00:00.01");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray3, 6357044, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, 3407924);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 0);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId23);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId23);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0L, zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 29143, zoneId23);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str25, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01" + "'", str27, "1970-01-01");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 3407924);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 100);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (byte) 10);
        byte[] byteArray21 = new byte[] {};
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray21, (int) (byte) 10);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray21, (int) ' ');
        java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray21, (int) (byte) 100);
        java.time.LocalTime localTime31 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray21, 10);
        java.time.LocalDateTime localDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray21, (int) (short) -1);
        java.nio.charset.Charset charset36 = null;
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId40);
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray21, (int) ' ', (int) (short) 0, charset36, zoneId40);
        long long44 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 09:45:57.024+08:00", zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (byte) 10, zoneId40);
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
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNull(localTime31);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str42, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 6357024L + "'", long44 == 6357024L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray22 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray22, (int) ' ');
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray22, (int) (short) 1);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray22, (int) (byte) 100, 0, zoneId29);
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId29);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date33);
        java.time.ZoneId zoneId46 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId46);
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId46);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId46);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId46);
        long long51 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId46);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime17);
        java.time.LocalDateTime localDateTime55 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime55);
        java.time.ZoneId zoneId58 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str59 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId58);
        long long60 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime55, zoneId58);
        long long61 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId58);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime17, zoneId58);
        long long63 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, 1, zoneId58);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime65 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -28796");
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
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-50372000L) + "'", long31 == (-50372000L));
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01" + "'", str40, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1969-12-31" + "'", str47, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31 18:00:00.01" + "'", str48, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31 17:59:59.999" + "'", str49, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1970-01-01 00:00:00" + "'", str50, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-50372000L) + "'", long51 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str52, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str56, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1969-12-31" + "'", str59, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-50372000L) + "'", long60 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 21600000L + "'", long61 == 21600000L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-50372000L) + "'", long62 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 4L + "'", long63 == 4L);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("2160-02-23");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2160-02-23");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("hi!", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input hi!");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5482764781252003L + "'", long19 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str20, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 2097184);
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
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 2097184);
        java.nio.charset.Charset charset15 = null;
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId19);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis("0001/01/01", zoneId19);
        java.util.Date date22 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:00", zoneId19);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2293857, (int) (short) -1, charset15, zoneId19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-62135625943000L) + "'", long21 == (-62135625943000L));
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Tue Dec 30 14:00:00 CST 1969");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(date4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId12);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId12);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId12);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId12);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId12);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(5478713135728003L, zoneId12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01 00:00:00" + "'", str7, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-28800000L) + "'", long15 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01 14:00:00" + "'", str17, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 14:00:00" + "'", str18, "1970-01-01 14:00:00");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 3407969);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 3407924, 3407969);
        java.nio.charset.Charset charset28 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 100, 6357044, charset28);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 3407907);
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
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) 'a');
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) '#', 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-10-00" + "'", str3, "0035-10-00");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 29143, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 100, 0, zoneId16);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString(5482764781252003L, true, zoneId16);
        java.lang.Class<?> wildcardClass20 = zoneId16.getClass();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50372000L) + "'", long18 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+175711-11 11:00:52.003-06:00" + "'", str19, "+175711-11 11:00:52.003-06:00");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId7);
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 0, (int) (byte) 10, (int) (byte) 100, 2097204, (int) (byte) -1, 1, 6357027);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 100");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-50400000L) + "'", long2 == (-50400000L));
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str10, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-100800000L) + "'", long11 == (-100800000L));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) '#');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 2097204);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, (int) (short) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, 3407924);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, 29143, 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-61873185443L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29143 + "'", int1 == 29143);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 28800, (int) (short) 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097184);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("", zoneId17);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, 3407907, zoneId17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
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
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertNull(date18);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-00-00", "0001-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0001-00-00' could not be parsed at index 6");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "1969-12-31 18:00:28");
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 18:00:28" + "'", str8, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 00:00:00" + "'", str9, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 3407969, (int) (short) 10, (int) ' ', (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = localDate22.getClass();
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '#', '4', ' ', '4', 'a', ' ', ' ', '#', '4', '4', '#', 'a', '#');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 1);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId3);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("0001-00-01", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0001-00-01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 04:34:57 CST 1969");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray2, 2097204);
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1970-01-02 04:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', 'a', 'a', 'a', ' ', ' ', 'a', '4', '4', 'a', 'a', ' ', '#', '4', 'a', '#', '4', ' ', 'a', ' ', '#', '#', '4');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) ' ', 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "0032/10/00");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "0032/10/00" + "'", str39, "0032/10/00");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId5);
        java.time.ZonedDateTime zonedDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId5);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 04:00:28", zoneId5);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097184, zoneId5);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-28800000L) + "'", long8 == (-28800000L));
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Tue Dec 30 14:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId4);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId4);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 17:59:59", zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("+175711-11 11:00:52.003-06:00", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66118358169080000L + "'", long12 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 04:34:57 CST 1969");
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(3407904, 0, (int) (byte) 1, (int) '#', (int) (short) 1, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("0035-10-00");
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for DayOfMonth (valid values 1 - 28/31): 0");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 0, 3407907, (int) ' ', dateTimeFormatPattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, 0, zoneId11);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) 'a');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 2097249, (int) '4');
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 3407907);
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
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 08:00:00.032+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.032+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", "\000\000\000\000\000\000\000\000\000\000\00013:08:55");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 14:00:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 0);
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
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 3407969, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3408066");
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
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId7);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId7);
        long long27 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId7, 3407969, 3407907, (int) (byte) 10, 6357024, (int) ' ', (int) 'a', (int) (short) -1);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 05:00:14.557+08:00", zoneId7);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1968-01-01 15:27:41.258-06:00", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-01 15:27:41.258-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-50400000L) + "'", long10 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 135235494809000L + "'", long18 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 116489408803937000L + "'", long27 == 116489408803937000L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-61873185443L) + "'", long28 == (-61873185443L));
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1969/12/31");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate1, "31.12.1969");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31.12.1969" + "'", str3, "31.12.1969");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 2293857, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
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
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 100, (int) (short) 100, (int) 'a', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray7 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray7, (int) ' ');
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray7, (int) (short) 1);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, (int) (byte) 100, 0, zoneId14);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId14);
        long long17 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50372000L) + "'", long17 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-50372000L) + "'", long18 == (-50372000L));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray33, 100);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId43 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId43);
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId43);
        java.lang.String str46 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date40, zoneId43);
        java.lang.String str47 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId43);
        java.time.ZonedDateTime zonedDateTime48 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray33, 2097249, 1, zoneId43);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime49 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (byte) 10, (int) '4', zoneId43);
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
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(localDate24);
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
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0010-35-52 10:10:10", zoneId11);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0010-35-52 10:10:10");
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
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, (-1));
        java.util.Date date20 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(date20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.toString(date20);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId27);
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId27);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date20, zoneId27);
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId27);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31T18:00:00", zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 6357027, (int) (short) 1, zoneId27);
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
        org.junit.Assert.assertNull(localDate12);
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
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString(date6);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId13);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId13);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 09:45:57.024+08:00", zoneId13);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime20, "0010-35-52 10:10:10");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str18, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19700101" + "'", str19, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0010-35-52 10:10:10" + "'", str22, "0010-35-52 10:10:10");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray6, (int) (short) 1);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) '4');
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
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2, "31.12.1969 18:00:00");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31.12.1969 18:00:00" + "'", str4, "31.12.1969 18:00:00");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 2097249);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) '#', 100, (int) (short) 10, 3407924, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61416833096L) + "'", long6 == (-61416833096L));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.util.Date date24 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId20);
        java.time.ZoneId zoneId29 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId29);
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId29);
        java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId29);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date24, zoneId29);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date24);
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
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertNotNull(zoneId29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "19700101" + "'", str31, "19700101");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50400000L) + "'", long32 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 18:00:28" + "'", str34, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31" + "'", str35, "1969-12-31");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format((-62167248343000L), dateTimeFormatPattern1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 1, 6357027);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', ' ', ' ' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04");
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date15);
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId28);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId28);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date15, zoneId28);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime13, zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, 2097204, zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## a  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  , a,  ,  ]");
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 14:00:00" + "'", str21, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1969-12-31" + "'", str29, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1969-12-31 18:00:00.01" + "'", str30, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31 17:59:59.999" + "'", str31, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 00:00:00" + "'", str32, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 107480584800000L + "'", long33 == 107480584800000L);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 2293857);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, 0, 0);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
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
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray24 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray24, (int) ' ');
        java.time.LocalTime localTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray24, (int) (short) 1);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long32 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray24, (int) (byte) 100, 0, zoneId31);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime19, zoneId31);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId38 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId38);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId38);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date35, zoneId38);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date35);
        java.time.ZoneId zoneId48 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId48);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId48);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId48);
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date35, zoneId48);
        long long53 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime19, zoneId48);
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime19);
        java.time.LocalDateTime localDateTime57 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str58 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime57);
        java.time.ZoneId zoneId60 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str61 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId60);
        long long62 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime57, zoneId60);
        long long63 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId60);
        long long64 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime19, zoneId60);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime65 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 0, 10, zoneId60);
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
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(localTime28);
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-50372000L) + "'", long33 == (-50372000L));
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01" + "'", str39, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "19700101" + "'", str40, "19700101");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31" + "'", str49, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31 18:00:00.01" + "'", str50, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1969-12-31 17:59:59.999" + "'", str51, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01 00:00:00" + "'", str52, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-50372000L) + "'", long53 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str54, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str58, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1969-12-31" + "'", str61, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-50372000L) + "'", long62 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 21600000L + "'", long63 == 21600000L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-50372000L) + "'", long64 == (-50372000L));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray8, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray8, 0);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId16);
        java.time.ZonedDateTime zonedDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray8, 28800, 0, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122570285040L, zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("57860131", zoneId16);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 57860131");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19731114" + "'", str19, "19731114");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19731119" + "'", str20, "19731119");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
            java.time.LocalDate localDate27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 28800, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 28897");
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
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19691231" + "'", str2, "19691231");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:00.01" + "'", str3, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19691231" + "'", str4, "19691231");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(28800, 2097249, 29143, 1, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6390958934435L + "'", long6 == 6390958934435L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("1968-02-16 14:10:09");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (byte) -1, 3407907, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        long long60 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId47, 2293857, (int) (short) 1, 10, (int) (byte) 1, 100, 10, 2293857);
        java.lang.Class<?> wildcardClass61 = zoneId47.getClass();
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
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 72324968841610002L + "'", long60 == 72324968841610002L);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.util.Date date3 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date3);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId16);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId16);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date3, zoneId16);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31", zoneId16);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis("\000\000\000\000\000\000\000\000\000\000\00004:00:28", zoneId16);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????04:00:28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 14:00:00" + "'", str9, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31" + "'", str17, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31 18:00:00.01" + "'", str18, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 17:59:59.999" + "'", str19, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 00:00:00 CST 1969");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) ' ', 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("+175711-11 11:00:52.003-06:00", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray6, (int) (byte) -1, (int) (short) 0);
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
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, (int) ' ');
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
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:00:00.1", "1969-12-31 04:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 08:00:00.1' could not be parsed at index 2");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('a', '4', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray3, 3407907);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1969-12-31T18:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50372000L) + "'", long30 == (-50372000L));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("31.12.1969 18:00:00", zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2097249, (int) '4');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 6357044);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray0, 3407904);
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0010-35-52 10:10:10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 1, zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 10, zoneId7);
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str9, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 00:00:00" + "'", str10, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(8946587700389003L, dateTimeFormatPattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2854");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern2 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern2.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31.12.1969 18:00:00" + "'", str3, "31.12.1969 18:00:00");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) 'a', 3407924);
        java.nio.charset.Charset charset26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 10, 6357027, charset26);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(2097000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) '4');
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) '4');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 100);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId27);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId27);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, (int) (short) 100, 3407969, 0, (int) (byte) 1, 6357027, 3407969, 3407924);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) -1, 10, zoneId27);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "19700101" + "'", str29, "19700101");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8946587700389003L + "'", long37 == 8946587700389003L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(6357024, 0, 6357027, 0, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long30 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId22, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date31 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId22);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId22);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(1141240135347L, zoneId22);
        long long41 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId22, (int) (byte) 10, 2097184, (int) (short) 100, 2097204, (int) '4', 0, 3407969);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 0, 100, zoneId22);
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
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 66118358169080000L + "'", long30 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31" + "'", str32, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2006-03-02" + "'", str33, "2006-03-02");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 5478713135728003L + "'", long41 == 5478713135728003L);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) (short) -1);
        java.nio.charset.Charset charset15 = null;
        java.time.ZoneId zoneId19 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId19);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId19);
        long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) ' ', (int) (short) 0, charset15, zoneId19);
        java.nio.charset.Charset charset25 = null;
        java.time.ZoneId zoneId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 10, 2097184, charset25, zoneId26);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(zoneId19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01" + "'", str20, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str21, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("+175583-07 23:55:28.003");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +175583-07 23:55:28.003");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 0, 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 0);
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern2 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((long) 28800, dateTimeFormatPattern2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((-59006592000L), dateTimeFormatPattern2);
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern2 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH + "'", dateTimeFormatPattern2.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969/12/31" + "'", str3, "1969/12/31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1968/02/17" + "'", str4, "1968/02/17");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407924, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.getZoneId("hi!", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str9, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19700101" + "'", str10, "19700101");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1970-01-01 14:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date1, "31.12.1969");
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31.12.1969" + "'", str3, "31.12.1969");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) ' ');
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (short) 1, zoneId14);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 0, (int) (short) 1, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        char[] charArray0 = null;
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray0, 6357027, (int) (short) -1);
        org.junit.Assert.assertNull(localDateTime3);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 3407907, 0, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) -1, false, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("4071-01-09 00:00:00", zoneId13);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId13);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.004-06:00", zoneId13);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime19, "1970-01-01 09:45:57+08:00");
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
        org.junit.Assert.assertNotNull(zonedDateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 09:45:57+08:00" + "'", str21, "1970-01-01 09:45:57+08:00");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, (int) (short) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray5, (int) '#');
        java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, (int) (short) 100, (int) (byte) 1);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 3407924);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId25);
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId25);
        long long45 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId25, 3407969, 3407907, (int) (byte) 10, 6357024, (int) ' ', (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime46 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 2097184, 3407904, zoneId25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
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
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-50400000L) + "'", long28 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 135235494809000L + "'", long36 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime37);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 116489408803937000L + "'", long45 == 116489408803937000L);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 6357027, 28800);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 2097204);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray6, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097243");
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId3);
        java.util.Date date13 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId3);
        java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 17:59:59", zoneId3);
        java.lang.Class<?> wildcardClass15 = zonedDateTime14.getClass();
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19700101" + "'", str12, "19700101");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Wed Dec 31 04:34:57 CST 1969");
        org.junit.Assert.assertNotNull(zonedDateTime14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, (int) (short) 100);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 6357027, 3407904);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
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
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (-1));
        java.nio.charset.Charset charset24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 10, (int) 'a', charset24);
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) 'a');
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, (int) (short) 10);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray0, (int) (short) -1);
        java.util.Date date25 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(date25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(date25);
        char[] charArray32 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray32, (int) ' ');
        java.time.LocalTime localTime36 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray32, (int) (short) 1);
        java.time.ZoneId zoneId39 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray32, (int) (byte) 0, (int) (byte) 0, zoneId39);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date25, zoneId39);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) (byte) 10, zoneId39);
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
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01 00:00:00" + "'", str26, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate34);
        org.junit.Assert.assertNull(localTime36);
        org.junit.Assert.assertNotNull(zoneId39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01 14:00:00" + "'", str41, "1970-01-01 14:00:00");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 2097249);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (byte) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 3407904);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 0);
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
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray4, 3407924);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray4, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 10, 10]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407907);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 1, 28800);
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
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("00000101", (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 00000101");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', 1, (int) '#', 3407924, (int) (short) 1, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) -1, 2097204);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -92");
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 10);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407969);
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
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        java.time.LocalDateTime localDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime39);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str43 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId42);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId42);
        java.time.ZoneId zoneId48 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId48);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId48);
        java.time.ZonedDateTime zonedDateTime51 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId48);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId48);
        char[] charArray59 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate61 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray59, (int) ' ');
        java.time.LocalTime localTime63 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray59, (int) (short) 1);
        java.time.ZoneId zoneId66 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long67 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray59, (int) (byte) 0, (int) (byte) 0, zoneId66);
        java.lang.String str68 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId66);
        long long69 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId66);
        java.time.ZoneId zoneId72 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str73 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId72);
        java.time.ZonedDateTime zonedDateTime74 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId72);
        long long75 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime39, zoneId72);
        // The following exception was thrown during execution in test generation
        try {
            long long76 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 28800, 2097184, zoneId72);
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
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str40, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1969-12-31" + "'", str43, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-50372000L) + "'", long44 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01" + "'", str49, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "19700101" + "'", str50, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-100772000L) + "'", long52 == (-100772000L));
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate61);
        org.junit.Assert.assertNull(localTime63);
        org.junit.Assert.assertNotNull(zoneId66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "1970-01-01 08:00:00.001" + "'", str68, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-100772000L) + "'", long69 == (-100772000L));
        org.junit.Assert.assertNotNull(zoneId72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "1970-01-01" + "'", str73, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + (-100772000L) + "'", long75 == (-100772000L));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) 'a', (int) (short) 0, (int) '4', 6357024, (int) (byte) 0, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(0, (int) '#', (int) (byte) 0, (int) '#', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62077404180L) + "'", long6 == (-62077404180L));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        char[] charArray0 = new char[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray0, (int) '#');
        java.time.ZonedDateTime zonedDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray0, (int) '#', 0);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray0, (int) (byte) 1);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId12);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId12);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray0, (int) (short) 0, (int) ' ', zoneId12);
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
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31" + "'", str13, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31" + "'", str14, "1969-12-31");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, 1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, 3407969, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, 3407969);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("\000\000\000\000\000\000\000\000\000\000\00019:45:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 10);
        java.nio.charset.Charset charset17 = null;
        java.time.ZoneId zoneId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, 6357024, 6357044, charset17, zoneId18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) (short) 10, dateTimeFormatPattern6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(4L, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(6357027, (int) (short) 1, 0, dateTimeFormatPattern6);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        long long2 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-50372000L) + "'", long2 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((-1), (int) '4', (int) (byte) 0, (int) 'a', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-62063881140L) + "'", long6 == (-62063881140L));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 3407907);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime16, "19700101");
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId20);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime16, zoneId20);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime16);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime16, "1970-01-01 00:00:00");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime16, "1970-01-01 08:00:00.001+08:00");
        java.time.LocalDateTime localDateTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray35 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray35, (int) ' ');
        java.time.LocalTime localTime39 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray35, (int) (short) 1);
        java.time.ZoneId zoneId42 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray35, (int) (byte) 100, 0, zoneId42);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime30, zoneId42);
        long long45 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime16, zoneId42);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 0, (int) (short) -1, zoneId42);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "19700101" + "'", str18, "19700101");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01" + "'", str21, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-100772000L) + "'", long22 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str23, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 00:00:00" + "'", str25, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str27, "1970-01-01 08:00:00.001+08:00");
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-50372000L) + "'", long45 == (-50372000L));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('4', ' ', ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        char[] charArray5 = new char[] { '4', ' ' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray5, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray5, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray5, 100);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 100, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 100);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 10);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, (int) (short) 100, (int) (short) 0, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId24);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId24);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis("+175583-07 23:55:28.003", zoneId24);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +175583-07 23:55:28.003");
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
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-16 05:00:14.557+08:00");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-61873185443L) + "'", long1 == (-61873185443L));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, (int) (short) -1);
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (short) -1);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (byte) -1);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray5, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', 'a', ' ', 'a', '4', '4', '4', 'a', '#', ' ', ' ', '4', ' ', ' ', '#', '#', '#', 'a', ' ', '#', ' ', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('#', 'a', '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 100);
        byte[] byteArray21 = null;
        java.nio.charset.Charset charset24 = null;
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27);
        java.time.ZoneId zoneId35 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId35);
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId35);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId35);
        java.util.Date date39 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId35);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date27, zoneId35);
        long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray21, 28800, (int) (short) -1, charset24, zoneId35);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 6357044, 2097249, zoneId35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
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
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0001-01-01 00:00:00" + "'", str28, "0001-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1969-12-31" + "'", str36, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1969-12-31 18:00:00.01" + "'", str37, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969-12-31 17:59:59.999" + "'", str38, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0001-01-01 00:00:00" + "'", str40, "0001-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime('a', '#', ' ', ' ', ' ', ' ', '4', 'a');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1969-12-31 17:59:59", zoneId5);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31T18:00:00", zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis("+175711-11 11:00:52.003-06:00", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50401000L) + "'", long8 == (-50401000L));
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, (int) (byte) 10);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, (int) (byte) 10);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("1969-12-30 14:00:28");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, 2097184);
        byte[] byteArray17 = new byte[] {};
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray17, (int) (byte) -1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray17, (int) (byte) 10);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray17, (int) ' ');
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray17, (int) (byte) 100);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray17, 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray17, (int) (short) -1);
        java.nio.charset.Charset charset32 = null;
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray17, (int) ' ', (int) (short) 0, charset32, zoneId36);
        java.util.Date date40 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59.999", zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray3, 1, zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str38, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Wed Dec 31 17:59:59 CST 1969");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str54 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "");
        java.lang.String str56 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "12.01.1968 21:27:25");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "12.01.1968 21:27:25" + "'", str56, "12.01.1968 21:27:25");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, 2097184);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) 100, 6357044, zoneId18);
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
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31" + "'", str19, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31 18:00:00.01" + "'", str20, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969-12-31 17:59:59.999" + "'", str21, "1969-12-31 17:59:59.999");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray0, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 2097249);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) (short) 1);
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04 00:00:00", (int) ' ', 28800);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 5375-12-04 00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        char[] charArray7 = new char[] { '4', ' ' };
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray7, (int) (byte) 1);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray7, 3407907, 0, zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) -1, false, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("4071-01-09 00:00:00", zoneId13);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.004-06:00", zoneId13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("\000\000\000\000\000\000\000\000\000\000\00014:00:00", zoneId13);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ???????????14:00:00");
        } catch (java.time.format.DateTimeParseException e) {
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
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 18:00:00 CST 1969");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = null;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357024, 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds(66301912800000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2097184);
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 10, 6357027, zoneId37);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
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
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, (int) (byte) -1);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray0, (int) '4', 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097204");
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
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format((int) 'a', 2097184, 28800, dateTimeFormatPattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 0);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1968/02/17");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357025");
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "\000\000\000\000\000\000\000\000\000\000\00019:45:57");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.nio.charset.Charset charset11 = null;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '4', (int) (byte) 0, charset11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("40710109");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 40710109L + "'", long1 == 40710109L);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (int) '4', 10);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(zonedDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 28800);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 2097204);
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) '4', 3407969);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '4', ' ', '4', ' ', '#', '#', 'a', 'a', ' ', ' ', ' ', 'a', 'a', ' ', 'a', '#', 'a', 'a', ' ', '4', '4', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) '#', 2097249);
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
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.time.LocalDateTime localDateTime0 = null;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime0, "1973-10-02");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("19731028", zoneId35);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19731028");
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
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 0);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.format(date18, "");
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.toString(date18);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId25);
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId25);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, (int) (short) 0, zoneId25);
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
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01 00:00:00" + "'", str22, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19700101" + "'", str27, "19700101");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, (int) (byte) -1);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 0);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (byte) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2293857);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("");
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray6, (int) (short) -1, (int) (byte) 0);
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) '#');
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, 2097204);
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray6, (int) (byte) -1);
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray6, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 0, 2097249, 29143, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097249");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 2293857, (int) (short) 100);
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
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("5786-01-31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId3);
        java.time.ZonedDateTime zonedDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId3);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime6, "19691231");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime6);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "19691231" + "'", str10, "19691231");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 3407969, 29143);
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 3407904);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.lang.Class<?> wildcardClass9 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime3, "19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        long long9 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001-00-00", "2160-02-23", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0001-00-00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19700101" + "'", str5, "19700101");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100772000L) + "'", long9 == (-100772000L));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(0, 100, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, (int) (short) 10, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 6357027, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId6);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("31.12.1969 18:00:00", zoneId6);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) ' ', zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31 18:00:00", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31 18:00:00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28800000L) + "'", long9 == (-28800000L));
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 04:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097184);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) '#');
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 3407907);
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 08:00:00.1");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 2097184, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2097184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (byte) 1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 28800);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (short) 0, 6357044);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (short) -1, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId2);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("\000\000\000\000\000\000\000\000\000\000\00014:00:00", zoneId2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: ???????????14:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19691231" + "'", str3, "19691231");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (short) 100);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) -1);
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
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.nio.charset.Charset charset47 = null;
        java.time.ZoneId zoneId51 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str52 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId51);
        java.time.ZonedDateTime zonedDateTime53 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId51);
        long long54 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId51);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407907, 6357024, charset47, zoneId51);
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
        org.junit.Assert.assertNotNull(zoneId51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01" + "'", str52, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-28800000L) + "'", long54 == (-28800000L));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern9 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format((long) ' ', dateTimeFormatPattern9);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern9);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(10L, dateTimeFormatPattern9);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 10, 0, dateTimeFormatPattern9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 100, 0, 3407907, dateTimeFormatPattern9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern9 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern9.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31 18:00:00" + "'", str10, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1969-12-31 18:00:00" + "'", str11, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1969-12-31 18:00:00" + "'", str12, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0001/10/00" + "'", str13, "0001/10/00");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        char[] charArray5 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray5, (int) ' ');
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray5, (int) (short) 10);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray5, 3407907);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray5, (int) (byte) 10);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray23 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray23, (int) ' ');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray23, (int) (short) 1);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, (int) (byte) 100, 0, zoneId30);
        long long32 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId30);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId37 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId37);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId37);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId37);
        java.lang.String str41 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date34);
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId47);
        java.lang.String str50 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId47);
        java.lang.String str51 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date34, zoneId47);
        long long52 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId47);
        java.lang.String str53 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime18);
        java.time.LocalDateTime localDateTime56 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime56);
        java.time.ZoneId zoneId59 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str60 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId59);
        long long61 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime56, zoneId59);
        long long62 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId59);
        long long63 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId59);
        long long64 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, (int) (byte) 0, 1, zoneId59);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime65 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("2006-03-01", zoneId59);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2006-03-01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-50372000L) + "'", long32 == (-50372000L));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01" + "'", str38, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1970-01-01" + "'", str41, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1969-12-31" + "'", str48, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1969-12-31 18:00:00.01" + "'", str49, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1969-12-31 17:59:59.999" + "'", str50, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1970-01-01 00:00:00" + "'", str51, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-50372000L) + "'", long52 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str53, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str57, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1969-12-31" + "'", str60, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-50372000L) + "'", long61 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 21600000L + "'", long62 == 21600000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-50372000L) + "'", long63 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 4L + "'", long64 == 4L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId4, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId4);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:34:57", zoneId4);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 17:59:59", zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("-0001-10-3", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input -0001-10-3");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 66118358169080000L + "'", long12 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 04:34:57 CST 1969");
        org.junit.Assert.assertNotNull(zonedDateTime15);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -31");
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("2006-02-28");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2006-02-28");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long13 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date14 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId5);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId5);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.toString((-61873185443L), true, zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.getZoneId("19731114", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 19731114");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 66118358169080000L + "'", long13 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969-12-31" + "'", str15, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1968-01-16 05:00:14.557+08:00" + "'", str16, "1968-01-16 05:00:14.557+08:00");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 17:59:59");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 18:00:28");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59" + "'", str3, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 18:00:28" + "'", str5, "1969-12-31 18:00:28");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-0001-97-0" + "'", str3, "-0001-97-0");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        char[] charArray0 = new char[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, (int) (short) 100);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray0, (int) (short) 10);
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
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId5);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, (int) ' ', (int) (byte) 0, 2097249, (int) (byte) 100, 6357024, (int) ' ', 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.getZoneId("4071-01-09", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 4071-01-09");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 14:00:00" + "'", str8, "1970-01-01 14:00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 120424011872003L + "'", long16 == 120424011872003L);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("19680126", (int) (byte) 1, 29143);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 19680126");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime3);
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId6);
        long long8 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId6);
        java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId12);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId12);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId12);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId12);
        char[] charArray23 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray23, (int) ' ');
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray23, (int) (short) 1);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long31 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray23, (int) (byte) 0, (int) (byte) 0, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) 1, false, zoneId30);
        long long33 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId30);
        java.util.Date date34 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 17:59:59.999", zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31T19:45:57", zoneId30);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str4, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31" + "'", str7, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50372000L) + "'", long8 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01" + "'", str13, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19700101" + "'", str14, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-100772000L) + "'", long16 == (-100772000L));
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 08:00:00.001" + "'", str32, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-100772000L) + "'", long33 == (-100772000L));
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 03:59:59 CST 1969");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray3, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDateTime16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId6);
        java.time.ZonedDateTime zonedDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId6);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01", zoneId6);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31T18:00:00", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-28800000L) + "'", long9 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-28800000L) + "'", long10 == (-28800000L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-50400000L) + "'", long11 == (-50400000L));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 0, 6357027, charset23);
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
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("1970-01-01 08:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId13);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 0, zoneId13);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray5, (int) (byte) -1);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.nio.charset.Charset charset22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) (short) 0, (int) '4', charset22);
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
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        byte[] byteArray0 = null;
        java.time.ZonedDateTime zonedDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2097204, 3407969);
        org.junit.Assert.assertNull(zonedDateTime3);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (short) 10, 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 0);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, 100);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (short) -1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, (int) '#', 100);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) '#');
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long35 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long43 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str44 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId27);
        long long45 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) ' ', 0, zoneId27);
        java.time.LocalDateTime localDateTime47 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime50 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 2097249, 2097204);
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
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 66118358169080000L + "'", long35 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5482764781252003L + "'", long43 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str44, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(localDateTime47);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-48303000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 04:34:57" + "'", str1, "1969-12-31 04:34:57");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, (-1), 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray6, 3407904);
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
        org.junit.Assert.assertNull(localTime27);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 100, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (short) 10);
        java.nio.charset.Charset charset27 = null;
        java.util.Date date29 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date29);
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.format(date29);
        java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId36);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date33, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date29, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) '4', 29143, charset27, zoneId36);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localTime24);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970-01-01" + "'", str30, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01 00:00:00" + "'", str31, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "19700101" + "'", str38, "19700101");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970-01-01 14:00:00" + "'", str39, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 14:00:00" + "'", str40, "1970-01-01 14:00:00");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) ' ');
        long long15 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (short) 1, 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 3407969);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', 'a', '4', '4', '4', ' ', ' ', 'a', '#', '4', 'a', '#', ' ', ' ', '#', '#', ' ', ' ', '4', '4', 'a', 'a', '4');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 28800);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 3407969);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("19731114");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray6, (int) (byte) 0);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, 2293857);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 6357044, 0);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2293857);
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
            java.lang.Class<?> wildcardClass15 = localDateTime14.getClass();
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray5, 0);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input ?????");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(6357024, 100, 6357027, 0, (int) '#', 29143);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-169989531779957L) + "'", long6 == (-169989531779957L));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("0000-01-01");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0000-01-01");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.format(date1, "1969/12/31T18:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown pattern letter: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.time.ZoneId zoneId20 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(1L, zoneId20);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime18, zoneId20);
        long long23 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime1, zoneId20);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "1968-01-27");
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
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19700101" + "'", str21, "19700101");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-100772000L) + "'", long22 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100772000L) + "'", long23 == (-100772000L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1968-01-27" + "'", str25, "1968-01-27");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 6357027, (int) (byte) 100, charset25);
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
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("19700101");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(byteArray3, (int) (short) 10, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-170539039330016L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format(5478713135728003L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1755");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407966");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        char[] charArray2 = null;
        java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(date7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString(date7);
        java.time.ZoneId zoneId14 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId14);
        java.util.Date date16 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId14);
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date7, zoneId14);
        long long18 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId14);
        java.time.ZonedDateTime zonedDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 1, 28800, zoneId14);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(21600000L, zoneId14);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("19691231", zoneId14);
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
        org.junit.Assert.assertNull(zonedDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "19700101" + "'", str20, "19700101");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 23:28:11 CST 1969");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, (int) (short) 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (byte) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 1);
        java.time.LocalTime localTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray3, 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localTime17);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (short) 10);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray19, 0);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray19, 0);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId27);
        java.time.ZonedDateTime zonedDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray19, 28800, 0, zoneId27);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId27, 3407924, 1, 6357024, 3407907, 2097184, (int) (short) 10, (int) (byte) 1);
        long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("4071-01-09 00:00:00", zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) -1, 3407907, zoneId27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1969-12-31" + "'", str28, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime29);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 108030282971962000L + "'", long37 == 108030282971962000L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 66301862400000L + "'", long38 == 66301862400000L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0, 3407907, 0, 2293857, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray2, (int) (byte) 0);
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
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(6357044, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19700101" + "'", str6, "19700101");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray5, 6357024);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray5, 10);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray5, 3407924, 3407907);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray5, 28800);
        java.time.LocalDateTime localDateTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray5, 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (short) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1968-01-27");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-60890400000L) + "'", long1 == (-60890400000L));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00.004-06:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:00" + "'", str2, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, 28800);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, (int) (short) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray3, (-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("31.12.1969 18:34:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1968-01-26 14:00:00", 6357024);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (short) -1);
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
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray0, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date4, "");
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString(date4);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId11);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId11);
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId11);
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.toString((-62109155000L), false, zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.getZoneId("62550611", zoneId11);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 62550611");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01 00:00:00" + "'", str8, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19700101" + "'", str13, "19700101");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01 14:00:00" + "'", str14, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1968-01-13 11:27:25" + "'", str15, "1968-01-13 11:27:25");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 14:00:00", 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "19731114");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19731114" + "'", str4, "19731114");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str6, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, 6357024);
        java.nio.charset.Charset charset16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray5, (int) (byte) 100, 6357044, charset16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(116489408803937000L, zoneId6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 14:00:00" + "'", str4, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-02 04:00:00" + "'", str8, "1970-01-02 04:00:00");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern4 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format((-44043000L), dateTimeFormatPattern4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((-1), 29143, 3407904, dateTimeFormatPattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern4 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH + "'", dateTimeFormatPattern4.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_FORMAT_10_DASH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) (byte) 100);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (int) (short) -1);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 3407907);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (-1), (-1));
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
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 3407924);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(zonedDateTime23);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray2, 2097204, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 2097249, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 18:00:00");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1969-12-31 17:59:59");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 17:59:59" + "'", str3, "1969-12-31 17:59:59");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31 18:00:00" + "'", str4, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 18:00:00" + "'", str5, "1969-12-31 18:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31 18:00:00" + "'", str6, "1969-12-31 18:00:00");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDate localDate20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, (int) 'a');
        java.time.LocalDate localDate22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 0);
        java.time.LocalTime localTime24 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, 3407969);
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
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localTime24);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray2, 2097184);
        char[] charArray15 = new char[] { '4', ' ' };
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray15, (int) (byte) 1);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray15, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray15, (int) (byte) 1);
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray15, 0);
        java.time.LocalTime localTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray15, 100);
        java.time.LocalDate localDate28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray15, (int) (short) 0);
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray15, (int) (short) -1);
        java.time.LocalDateTime localDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray15, (int) '#', 100);
        java.time.LocalTime localTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray15, (int) '#');
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId40, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long56 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId40, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str57 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId40);
        long long58 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray15, (int) ' ', 0, zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray2, (int) (short) 10, zoneId40);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ]");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localTime26);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNull(localTime35);
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 66118358169080000L + "'", long48 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 5482764781252003L + "'", long56 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str57, "1970-01-01 08:00:00+08:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
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
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.nio.charset.Charset charset24 = null;
        java.time.ZoneId zoneId26 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-1000L), zoneId26);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (byte) 100, (int) 'a', charset24, zoneId26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertNotNull(zoneId26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "19691231" + "'", str27, "19691231");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.time.ZoneId zoneId4 = null;
        long long5 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId4);
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId8, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date17 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId8);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId8);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("+175711-11 11:00:52.003-06:00", zoneId8);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-50372000L) + "'", long5 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-50372000L) + "'", long6 == (-50372000L));
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 66118358169080000L + "'", long16 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100772000L) + "'", long18 == (-100772000L));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, 6357027);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 10);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 1);
        java.util.Date date21 = null;
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date23);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.format(date23, "");
        java.lang.String str27 = com.alibaba.fastjson2.util.DateUtils.toString(date23);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId30);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId30);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date21, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (short) 100, zoneId30);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01" + "'", str24, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01 00:00:00" + "'", str27, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01" + "'", str31, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "19700101" + "'", str32, "19700101");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01 14:00:00" + "'", str33, "1970-01-01 14:00:00");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 0, (int) (byte) -1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1970-01-01 08:00:00.032+08:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1970-01-01 08:00:00.032+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 29143);
        java.nio.charset.Charset charset28 = null;
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long38 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId30, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.lang.String str39 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) 'a', (int) 'a', charset28, zoneId30);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 66118358169080000L + "'", long38 == 66118358169080000L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "19700101" + "'", str39, "19700101");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2097184);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (-1));
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
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId6);
        java.util.Date date9 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31", zoneId6);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-44043000L), zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("+175711-11 11:00:52.003-06:00", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: +175711-11 11:00:52.003-06:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31" + "'", str7, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31 18:00:00.01" + "'", str8, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 00:00:00 CST 1969");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969-12-31" + "'", str10, "1969-12-31");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(2293857, 2097204, 28800, 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray5, 28800, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407969, 3407907);
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
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
        org.junit.Assert.assertNull(localTime17);
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("2160-02-23");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "21600223" + "'", str2, "21600223");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
            java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.getZoneId("2006-02-28", zoneId15);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 2006-02-28");
        } catch (java.time.DateTimeException e) {
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern5 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((long) 1, dateTimeFormatPattern5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(6357044, (int) '4', 3407924, dateTimeFormatPattern5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern5 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT + "'", dateTimeFormatPattern5.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31.12.1969 18:00:00" + "'", str6, "31.12.1969 18:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31.12.1969 18:00:00" + "'", str7, "31.12.1969 18:00:00");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097200");
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
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("4071-01-09 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 4071-01-09 00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', '4', '4', '#', '4', ' ', ' ', 'a', ' ', '#', 'a', ' ', '4', '4', ' ', '4', '4', '#', '#', '4', '4', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1970-01-01 08:00:00.001+08:00");
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        long long18 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId16);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
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
        long long36 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId30);
        long long44 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId30, (int) (short) 100, (int) (short) 10, 6357044, (int) (short) -1, 2293857, 6357027, (int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str20, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-100772000L) + "'", long36 == (-100772000L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 490404599247000L + "'", long44 == 490404599247000L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray6, (int) (short) 0);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, 10);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray6, 3407904, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407936");
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
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("", zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-52-00", "1968-01-01 15:27:41", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0000-52-00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) -1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 6357027);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 29143, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 29175");
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
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(10, 3407907, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 2097184);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) 10, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 3407924);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) 'a');
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) -1, 2097184);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(zonedDateTime15);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 10, 3407907, (int) (short) 1, 2097204, 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407907");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -35");
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
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (short) 10);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 08:00:00.001" + "'", str4, "1970-01-01 08:00:00.001");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 0, zoneId22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101", "1968-01-01 15:27:41.258-06:00", zoneId22);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '19700101' could not be parsed at index 2");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "19700101" + "'", str26, "19700101");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0000-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 3407924, (int) (byte) 10);
        java.time.LocalTime localTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 1);
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
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localTime23);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(10, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray4, (int) (byte) 1, 0);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
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
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.toString(21600000L, false, zoneId30);
        java.util.Date date37 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:00.01", zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 0, zoneId30);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 14:00:00" + "'", str36, "1970-01-01 14:00:00");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Dec 31 04:00:00 CST 1969");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
            java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357044, 28800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) '#', 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-00-01" + "'", str3, "0035-00-01");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 0, (int) (byte) 0, zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 2293857, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(zoneId11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(10, 1, (int) 'a', 6357024, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2097184);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) 'a');
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, 0);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray5, 6357027);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray5, 6357024);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, (int) (short) 1, 2097204);
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
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDate localDate9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (short) 0);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 3407907);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) (byte) 1);
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
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray6, 10);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray6, 6357024);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:00", 2293857, 10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969-12-31 04:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 3407969);
        byte[] byteArray17 = new byte[] {};
        java.time.LocalTime localTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray17, (int) (byte) -1);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray17, (int) (byte) 10);
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray17, (int) ' ');
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray17, (int) (byte) 100);
        java.time.LocalTime localTime27 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray17, 10);
        java.time.LocalDateTime localDateTime29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray17, (int) (short) -1);
        java.nio.charset.Charset charset32 = null;
        java.time.ZoneId zoneId36 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str37 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId36);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId36);
        long long39 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray17, (int) ' ', (int) (short) 0, charset32, zoneId36);
        java.lang.String str40 = com.alibaba.fastjson2.util.DateUtils.toString((long) 3407907, false, zoneId36);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 28800, (int) '4', zoneId36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
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
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNull(localTime19);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNull(localTime27);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNotNull(zoneId36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970-01-01" + "'", str37, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str38, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-01-01 08:56:47.907" + "'", str40, "1970-01-01 08:56:47.907");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("\000\000\000\000\000\000\000\000\000\000\00013:08:55", "-0001-97-0");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '???????????13:08:55' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format((int) (short) 0, 3407969, 100, 2097184, 29143, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId11 = com.alibaba.fastjson2.util.DateUtils.getZoneId("5786-01-31", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 5786-01-31");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str9, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertNull(zonedDateTime10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.time.ZoneId zoneId2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("Asia/Shanghai", zoneId2);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input Asia/Shanghai");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31" + "'", str3, "1969-12-31");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 3407907);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.format(date18);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.toString(date18);
        java.time.ZoneId zoneId25 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId25);
        java.util.Date date27 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId25);
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId25);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date18);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date18);
        java.time.ZoneId zoneId34 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId34);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId34);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId34);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date18, zoneId34);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime39 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407924, 2097249, zoneId34);
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
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01 00:00:00" + "'", str19, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 00:00:00" + "'", str20, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01 14:00:00" + "'", str28, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertNotNull(zoneId34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01" + "'", str35, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "19700101" + "'", str36, "19700101");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-50400000L) + "'", long37 == (-50400000L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1970-01-01 14:00:00" + "'", str38, "1970-01-01 14:00:00");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((long) 28800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28800 + "'", int1 == 28800);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern8 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(1, (int) (short) 1, 1, dateTimeFormatPattern8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.format(0L, dateTimeFormatPattern8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.format(1141240135347L, dateTimeFormatPattern8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(6357044, 0, (int) '4', dateTimeFormatPattern8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern8 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH + "'", dateTimeFormatPattern8.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0001/01/01" + "'", str9, "0001/01/01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1969/12/31T18:00:00" + "'", str10, "1969/12/31T18:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2006/03/01T13:08:55" + "'", str11, "2006/03/01T13:08:55");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 28800, 2293857);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2322657");
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
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) -1, zoneId7);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) ' ', zoneId7);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 08:00:00.032+08:00", zoneId7);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.032+08:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19700101" + "'", str11, "19700101");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01" + "'", str12, "1970-01-01");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 0);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 0, 0);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, 6357024);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, 28800);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, 100);
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
        org.junit.Assert.assertNull(zonedDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray0, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, 6357024);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, 3407907, 3407904);
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, 6357044, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1970-01-01 08:00:00.001");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 18:00:00.1", 3407907, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 1969-12-31 18:00:00.1");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, 0);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, (int) (byte) 0);
        java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) (byte) 10);
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
        org.junit.Assert.assertNull(localDateTime20);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', '4', 'a', '4', 'a', '4', '#', '4', 'a', 'a', 'a', 'a', '4', 'a', ' ', '#', ' ', 'a', 'a', '#', '4', ' ', ' ');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        char[] charArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((long) 3407924);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 18:56:47" + "'", str1, "1969-12-31 18:56:47");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("4071-01-09");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40710109" + "'", str2, "40710109");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 2097204, (int) (short) 100);
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("00000101", 3407904);
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, (int) (short) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray2, 2097204);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, 3407969);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray2, 3407907, (int) (short) 0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(6357027, (int) ' ', 3407969, 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-170244415523280L) + "'", long6 == (-170244415523280L));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.time.LocalDateTime localDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) (byte) -1);
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
        org.junit.Assert.assertNull(localDateTime33);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, 2293857, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray0, 3407969);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -3407969");
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
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) 'a', 2097204);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(6357044, (int) (byte) 10, 3407904, 3407924, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63570");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((-100801000L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-30 13:59:59" + "'", str1, "1969-12-30 13:59:59");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.time.ZoneId zoneId1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-170244415523280L), zoneId1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("-0001-97-0", (int) '4');
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 6357024);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -6357020");
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
        org.junit.Assert.assertNull(localTime14);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds((int) (byte) 0, 3407907, 28800, (int) (short) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8945371728157L + "'", long6 == 8945371728157L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalTime("31.12.1969 18:34:57");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(29143, 10, 3407904, (int) (short) 1, 29143, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01 00:00:00");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1970-01-01 14:00:00");
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000-01-01 00:00:00" + "'", str6, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01 14:00:00" + "'", str9, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01" + "'", str10, "1970-01-01");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, (int) (short) 100);
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (byte) 100);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId5);
        java.time.ZonedDateTime zonedDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId5);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01", zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 09:54:17 CST 1");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = com.alibaba.fastjson2.util.DateUtils.month('#', '4', '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId3);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.getZoneId("1969-12-31T18:00:00", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 1969-12-31T18:00:00");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1969-12-31" + "'", str4, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(byteArray0, (int) (short) 1);
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 3407904);
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
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1968-01-01 15:27:41.258");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1968-01-01 15:27:41.258");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 08:00:00.1", zoneId26);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1970-01-01 08:00:00.1");
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
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(3407969, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, 2293857);
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('4', ' ', ' ', '#', ' ', '4', 'a', ' ', ' ', '#', 'a', 'a', '4', '4', '#', '4', '#', ' ', 'a', 'a', '4', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 2097249);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, (int) (byte) 0);
        byte[] byteArray17 = null;
        java.nio.charset.Charset charset20 = null;
        java.util.Date date23 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", "");
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23);
        java.time.ZoneId zoneId31 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId31);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId31);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId31);
        java.util.Date date35 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 14:00:00", zoneId31);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date23, zoneId31);
        long long37 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray17, 28800, (int) (short) -1, charset20, zoneId31);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 29143, (int) '4', zoneId31);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Jan 02 23:50:36 CST 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0001-01-01 00:00:00" + "'", str24, "0001-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1969-12-31" + "'", str32, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31 18:00:00.01" + "'", str33, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 17:59:59.999" + "'", str34, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 14:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0001-01-01 00:00:00" + "'", str36, "0001-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '4', '#', 'a', '4', '#', '#', 'a', ' ', 'a', '#', '#', 'a', ' ');
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) (byte) 1, (int) (short) 0, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29143");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, (-1));
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray4, 3407969, (int) (short) -1);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern dateTimeFormatPattern6 = com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format((int) ' ', 10, (int) (short) 0, dateTimeFormatPattern6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(3407904, 3407907, (int) (byte) 100, dateTimeFormatPattern6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34079");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + dateTimeFormatPattern6 + "' != '" + com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH + "'", dateTimeFormatPattern6.equals(com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0032/10/00" + "'", str7, "0032/10/00");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) (byte) 1);
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
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) 'a');
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 6357024, 3407907);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, 2293857);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, 6357027, 28800);
        java.time.LocalDate localDate18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, 2097204, (int) (byte) 0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 28800);
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
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localTime4);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray3, 3407907, (int) (byte) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (short) 100);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray3, (int) ' ');
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray3, (int) (byte) 1, 1);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(byteArray3, 1);
        java.time.LocalTime localTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localTime21);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, 100);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 3407969);
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime(' ', 'a', 'a', '#', ' ', '4', ' ', '4');
        org.junit.Assert.assertNull(localTime8);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 03:59:59", "-0001-97-0");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1969-12-31 03:59:59' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 0);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(byteArray0, 28800);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray0, (-1));
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (short) -1);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 0);
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 1, 2097249, charset15);
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
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime22 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 0);
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
        org.junit.Assert.assertNull(localTime22);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long11 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId3, (int) (short) 100, 2097249, (int) 'a', 1, (int) (byte) 0, (int) '4', 3407907);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString(0L, true, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("40710109", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 40710109");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 66118358169080000L + "'", long11 == 66118358169080000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5482764781252003L + "'", long19 == 5482764781252003L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970-01-01 08:00:00+08:00" + "'", str20, "1970-01-01 08:00:00+08:00");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(byteArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        char[] charArray6 = new char[] { '#', '#', '#', '#', '4', '4' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray6, (int) (short) 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray6, (int) (short) 1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray6, (int) '#');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray6, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray6, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray6, (int) (byte) 0, 3407924);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3407924");
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
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("6255-06-11 10:13:29", (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: 6255-06-11 10:13:29");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6357024L + "'", long1 == 6357024L);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate1);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate1);
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01 00:00:00" + "'", str2, "0000-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000-01-01" + "'", str4, "0000-01-01");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass12 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray2, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray2, (int) '4');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 100);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (short) 0);
        java.time.LocalDate localDate19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, (-1));
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
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 100, 0);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray2, (int) (short) 0);
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
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format((int) 'a', 6357027, 2097204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        java.time.LocalDateTime localDateTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray4, (int) (short) 1);
        byte[] byteArray28 = new byte[] {};
        java.time.LocalTime localTime30 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray28, (int) (byte) -1);
        java.time.LocalDateTime localDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray28, (int) (byte) 10);
        java.time.LocalDateTime localDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray28, (int) ' ');
        java.time.LocalDate localDate36 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray28, (int) (byte) 100);
        java.time.LocalTime localTime38 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray28, 10);
        java.time.LocalDateTime localDateTime40 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray28, (int) (short) -1);
        java.nio.charset.Charset charset43 = null;
        java.time.ZoneId zoneId47 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str48 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId47);
        java.lang.String str49 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId47);
        long long50 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray28, (int) ' ', (int) (short) 0, charset43, zoneId47);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) 'a', (-1), zoneId47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localTime23);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNull(localTime30);
        org.junit.Assert.assertNull(localDateTime32);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertNull(localDate36);
        org.junit.Assert.assertNull(localTime38);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNotNull(zoneId47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970-01-01" + "'", str48, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str49, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
            java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, (int) (short) 0, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.time.ZoneId zoneId4 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId4);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = com.alibaba.fastjson2.util.DateUtils.parseDate("0032/10/00", "1968-01-15 20:30:27", zoneId4);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0032/10/00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31" + "'", str5, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        long long1 = com.alibaba.fastjson2.util.DateUtils.parseMillis("6255-06-11 10:13:29");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 135235494809000L + "'", long1 == 135235494809000L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray2, 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray2, 0, (int) (byte) 100);
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
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("21600223");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 21600223");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime4, "1970-01-01 08:00:00.001+08:00");
        char[] charArray11 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray11, (int) ' ');
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray11, (int) (short) 1);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray11, (int) (byte) 0, (int) (byte) 0, zoneId18);
        long long20 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime4, zoneId18);
        java.util.Date date21 = com.alibaba.fastjson2.util.DateUtils.parseDate("0001/01/01", zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("\000\000\000\000\000\000\000\000\000\000\00000:00:00", zoneId18);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
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
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Jan 02 09:54:17 CST 1");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 10);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray4, (int) '4');
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407969);
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        char[] charArray5 = new char[] { '4', ' ' };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray5, (int) (byte) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray5, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray5, (int) (byte) 1);
        java.time.LocalDate localDate14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray5, 100);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, 100, 0);
        java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 100);
        java.time.LocalDateTime localDateTime21 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray5, 10);
        java.time.ZoneId zoneId24 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long25 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray5, (int) (short) 100, (int) (short) 0, zoneId24);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId24);
        long long27 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 08:00:00.1", zoneId24);
        java.time.ZonedDateTime zonedDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00", zoneId24);
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
        org.junit.Assert.assertNotNull(zoneId24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(zonedDateTime28);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId8);
        long long10 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray2, 3407907, 0, zoneId8);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4,  ]");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 2097204);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray3, (int) (byte) -1);
        java.time.LocalDate localDate12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray3, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0]");
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        java.time.LocalDate localDate25 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, 29143, 0);
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
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.time.ZoneId zoneId6 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId6);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId6);
        java.time.ZonedDateTime zonedDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId6);
        java.util.Date date11 = com.alibaba.fastjson2.util.DateUtils.parseDate("0000-01-01", zoneId6);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId12 = com.alibaba.fastjson2.util.DateUtils.getZoneId("57860131", zoneId6);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: 57860131");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "19700101" + "'", str8, "19700101");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-50400000L) + "'", long9 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Jan 02 09:54:17 CST 1");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969/12/31T18:00:00", "0000-01-01 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1969/12/31T18:00:00' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 10, (int) (short) 100);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 1);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray3, (int) (byte) 1);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) '4');
        java.time.LocalDate localDate16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray3, 2097249);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("31.12.1969 18:34:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray4, 6357024);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str15 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime14);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId17);
        long long19 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime14, zoneId17);
        long long20 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId17);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, 6357027, zoneId17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357027");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str15, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31" + "'", str18, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-50372000L) + "'", long19 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 21600000L + "'", long20 == 21600000L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:28" + "'", str2, "1969-12-31 18:00:28");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.format((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1969-12-31 18:00:00" + "'", str1, "1969-12-31 18:00:00");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.util.Date date6 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.format(date6);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.toString(date6);
        java.time.ZoneId zoneId13 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str14 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId13);
        java.util.Date date15 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1969/12/31", zoneId13);
        java.lang.String str16 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date6, zoneId13);
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 17:59:59", zoneId13);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 1, true, zoneId13);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (short) 1, zoneId13);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 09:45:57.024+08:00", zoneId13);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime20);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01 08:00:00.001+08:00" + "'", str18, "1970-01-01 08:00:00.001+08:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19700101" + "'", str19, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 09:45:57" + "'", str21, "1970-01-01 09:45:57");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) 'a');
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, 1);
        java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        long long11 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, (int) (byte) 100, (int) (byte) 0);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (short) -1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(charArray4, 2097184);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime19 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray4, (int) '4');
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
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("", "1968-01-01 15:27:41");
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("5375-12-04");
        java.util.Date date4 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId7 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str8 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId7);
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId7);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId7);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date4);
        java.time.ZoneId zoneId17 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId17);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId17);
        java.lang.String str20 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId17);
        java.lang.String str21 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date4, zoneId17);
        long long22 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2, zoneId17);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00+08:00", zoneId17);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime23);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1970-01-01" + "'", str8, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19700101" + "'", str9, "19700101");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 14:00:00" + "'", str10, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1969-12-31" + "'", str18, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31 18:00:00.01" + "'", str19, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1969-12-31 17:59:59.999" + "'", str20, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01 00:00:00" + "'", str21, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 107480584800000L + "'", long22 == 107480584800000L);
        org.junit.Assert.assertNotNull(zonedDateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 08:00:00" + "'", str24, "1970-01-01 08:00:00");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 08:56:47.907", "\000\000\000\000\000\000\000\000\000\000\00019:45:57");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '1970-01-01 08:56:47.907' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-00-52" + "'", str3, "0000-00-52");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(10, (int) (short) 100, (int) (short) -1, 2293857, 3407907, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-61717901372L) + "'", long6 == (-61717901372L));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime1, "0001-00-00");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0001-00-00" + "'", str31, "0001-00-00");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "1969-12-31 18:00:28");
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01" + "'", str1, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1969-12-31 18:00:28" + "'", str3, "1969-12-31 18:00:28");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01 00:00:00" + "'", str4, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', ' ', ' ' };
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray6, (int) (short) -1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray6, 3407907, 0);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(charArray6, 2097204, 2097184);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray6, (int) 'a');
        char[] charArray21 = new char[] { '4', ' ' };
        java.time.LocalDate localDate23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray21, (int) (byte) 1);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray21, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime28 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray21, (int) (byte) 1);
        java.time.LocalDate localDate30 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray21, 100);
        long long33 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, 100, 0);
        java.time.LocalDateTime localDateTime35 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray21, 100);
        java.time.LocalDateTime localDateTime37 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray21, 10);
        java.time.ZoneId zoneId40 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long41 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray21, (int) (short) 100, (int) (short) 0, zoneId40);
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) 100, zoneId40);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray6, 28800, zoneId40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(zoneId40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1970-01-01" + "'", str42, "1970-01-01");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("62550611");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.time.ZoneId zoneId3 = com.alibaba.fastjson2.util.DateUtils.OFFSET_8_ZONE_ID;
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(1L, zoneId3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = com.alibaba.fastjson2.util.DateUtils.parseDate("-0001-12-3 10:03:41", "1968-01-16 05:00:14.557+08:00", zoneId3);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '-0001-12-3 10:03:41' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.format(date16);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31 04:00:00" + "'", str17, "1969-12-31 04:00:00");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(0, (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-35-35" + "'", str3, "0000-35-35");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1969-12-31 04:00:00", zoneId5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("2160-02-23", zoneId5);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 2160-02-23");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1969-12-31" + "'", str6, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1969-12-31 18:00:00.01" + "'", str7, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.time.LocalDateTime localDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1969-12-31 04:00:28", 0);
        char[] charArray8 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray8, (int) ' ');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray8, (int) (short) 1);
        java.time.ZoneId zoneId15 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        long long16 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray8, (int) (byte) 100, 0, zoneId15);
        long long17 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId15);
        java.util.Date date19 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.time.ZoneId zoneId22 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId22);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId22);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId22);
        java.lang.String str26 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date19);
        java.time.ZoneId zoneId32 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId32);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((long) (byte) 10, false, zoneId32);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.toString((long) (short) -1, false, zoneId32);
        java.lang.String str36 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date19, zoneId32);
        long long37 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId32);
        java.lang.String str38 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime3);
        java.time.LocalDateTime localDateTime41 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime("1969-12-31 04:00:28");
        java.lang.String str42 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime41);
        java.time.ZoneId zoneId44 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID;
        java.lang.String str45 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) '#', zoneId44);
        long long46 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime41, zoneId44);
        long long47 = com.alibaba.fastjson2.util.DateUtils.parseMillisYMDHMS19("1970-01-01 00:00:00", zoneId44);
        long long48 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime3, zoneId44);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("0035-00-00", zoneId44);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0035-00-00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, 4, a]");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-50372000L) + "'", long17 == (-50372000L));
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertNotNull(zoneId22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01" + "'", str23, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01 14:00:00" + "'", str25, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01" + "'", str26, "1970-01-01");
        org.junit.Assert.assertNotNull(zoneId32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31" + "'", str33, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1969-12-31 18:00:00.01" + "'", str34, "1969-12-31 18:00:00.01");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1969-12-31 17:59:59.999" + "'", str35, "1969-12-31 17:59:59.999");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1970-01-01 00:00:00" + "'", str36, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-50372000L) + "'", long37 == (-50372000L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str38, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str42, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zoneId44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1969-12-31" + "'", str45, "1969-12-31");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-50372000L) + "'", long46 == (-50372000L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 21600000L + "'", long47 == 21600000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-50372000L) + "'", long48 == (-50372000L));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray0, 3407907);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (byte) -1);
        java.util.Date date10 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(date10);
        java.lang.String str12 = com.alibaba.fastjson2.util.DateUtils.format(date10);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10);
        java.time.ZoneId zoneId18 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) (short) -1, zoneId18);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 14:00:00", zoneId18);
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis("1970-01-01 00:00:00", zoneId18);
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((long) 2097204, zoneId18);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date10, zoneId18);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((-28800000L), zoneId18);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(6000431513341L, zoneId18);
        java.time.ZonedDateTime zonedDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (short) 100, (int) (short) -1, zoneId18);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate29 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray0, (int) (byte) 1, 3407907);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3407908");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localDateTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 CST 1970");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01" + "'", str11, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01 00:00:00" + "'", str12, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 00:00:00" + "'", str13, "1970-01-01 00:00:00");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01" + "'", str19, "1970-01-01");
        org.junit.Assert.assertNotNull(zonedDateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-28800000L) + "'", long21 == (-28800000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01 14:00:00" + "'", str23, "1970-01-01 14:00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "19700101" + "'", str24, "19700101");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2160-02-23" + "'", str25, "2160-02-23");
        org.junit.Assert.assertNull(zonedDateTime26);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) (short) 100);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (short) 1);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(charArray4, (int) (short) 10, (int) (byte) 0);
        java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (byte) 0, 3407907);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.ZonedDateTime zonedDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (byte) -1, (int) (byte) 0);
        java.time.LocalTime localTime25 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray4, 3407924);
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        java.lang.Class<?> wildcardClass18 = zoneId9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1973-10-02");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(zonedDateTime1);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "");
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.format(zonedDateTime1, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
        org.junit.Assert.assertNotNull(zonedDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00004:00:28" + "'", str6, "\000\000\000\000\000\000\000\000\000\000\00004:00:28");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray2, (int) (short) 100, 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(charArray2, (int) (byte) 1);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(charArray2, 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, (int) (byte) 100);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, (int) (byte) 0);
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, 0);
        java.time.ZonedDateTime zonedDateTime20 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray2, 6357024, (int) (byte) 0);
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
        org.junit.Assert.assertNull(zonedDateTime20);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray6, 100);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray6, (int) (byte) 0, (-1));
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray6, 2097204);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 10, -1, 10]");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime('#', ' ', '#', ' ', 'a', '4', 'a', 'a', '#', '4', '#', ' ', ' ', ' ', '#', ' ', 'a', '4', '#', 'a', '4', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.util.Date date2 = com.alibaba.fastjson2.util.DateUtils.parseDate("19700101");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.format(date2);
        char[] charArray9 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray9, (int) ' ');
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray9, (int) (short) 1);
        java.time.ZoneId zoneId16 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long17 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray9, (int) (byte) 0, (int) (byte) 0, zoneId16);
        java.lang.String str18 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId16);
        java.time.ZoneId zoneId23 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        long long31 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId23, 2097204, (-1), (int) (byte) 1, 2097249, 3407907, (int) '4', (int) (byte) -1);
        java.util.Date date32 = com.alibaba.fastjson2.util.DateUtils.parseDate("1969-12-31 18:00:28", zoneId23);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50400000L), zoneId23);
        java.lang.String str34 = com.alibaba.fastjson2.util.DateUtils.toString((-61873185443L), true, zoneId23);
        java.lang.String str35 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(date2, zoneId23);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1973-11-19 23:18:05.04", zoneId23);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 1973-11-19 23:18:05.04");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(zoneId23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 66118358169080000L + "'", long31 == 66118358169080000L);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 04:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1969-12-31" + "'", str33, "1969-12-31");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1968-01-16 05:00:14.557+08:00" + "'", str34, "1968-01-16 05:00:14.557+08:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01 14:00:00" + "'", str35, "1970-01-01 14:00:00");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.time.ZoneId zoneId8 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str9 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId8);
        java.lang.String str10 = com.alibaba.fastjson2.util.DateUtils.toString((long) 6357024, true, zoneId8);
        java.lang.String str11 = com.alibaba.fastjson2.util.DateUtils.toString((-28800000L), false, zoneId8);
        long long12 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 03:59:59", zoneId8);
        java.lang.String str13 = com.alibaba.fastjson2.util.DateUtils.toString(2097000L, true, zoneId8);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01 09:45:57.024+08:00" + "'", str10, "1970-01-01 09:45:57.024+08:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01 00:00:00" + "'", str11, "1970-01-01 00:00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100801000L) + "'", long12 == (-100801000L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01 08:34:57+08:00" + "'", str13, "1970-01-01 08:34:57+08:00");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray0, (int) (byte) 10);
        long long9 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 0);
        java.time.LocalDate localDate11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray0, 2097204);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate24 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray22, 0);
        java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray22, 0);
        java.time.ZoneId zoneId30 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str31 = com.alibaba.fastjson2.util.DateUtils.formatYMD10((-50401000L), zoneId30);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray22, 28800, 0, zoneId30);
        java.lang.String str33 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(122090245797L, zoneId30);
        java.time.ZonedDateTime zonedDateTime34 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1969-12-31 03:59:59", zoneId30);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(byteArray0, (int) (byte) 10, zoneId30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate24);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertNotNull(zoneId30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969-12-31" + "'", str31, "1969-12-31");
        org.junit.Assert.assertNull(zonedDateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19731114" + "'", str33, "19731114");
        org.junit.Assert.assertNotNull(zonedDateTime34);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.String str17 = com.alibaba.fastjson2.util.DateUtils.toString(122570285040L, false, zoneId11);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId11, (int) (byte) 10, (int) (short) 100, (int) (byte) 0, (int) ' ', (int) (byte) 10, 3407907, 0);
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid value for MonthOfYear (valid values 1 - 12): 100");
        } catch (java.time.DateTimeException e) {
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1973-11-19 23:18:05.04" + "'", str17, "1973-11-19 23:18:05.04");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("19680217");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 19680217");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime26 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, (int) '4');
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
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("0001-00-01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (int) (byte) 10);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 2097204);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 2097184);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 2097249);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2097245");
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
        org.junit.Assert.assertNull(localTime16);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate1 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate("0000-01-01 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: illegal input 0000-01-01 00:00:00");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        char[] charArray1 = new char[] { '#' };
        java.time.LocalTime localTime3 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(charArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.alibaba.fastjson2.util.DateUtils.readNanos(charArray1, (int) (short) 0, 6357044);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6357044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[#]");
        org.junit.Assert.assertNull(localTime3);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isDate("2006-02-28");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        java.time.ZoneId zoneId28 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId28);
        java.lang.String str30 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId28);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 00:00:00", zoneId28);
        java.lang.String str32 = com.alibaba.fastjson2.util.DateUtils.toString(19691231L, false, zoneId28);
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime33 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, 2293857, 3407924, zoneId28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2293857");
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
        org.junit.Assert.assertNotNull(zoneId28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "19700101" + "'", str30, "19700101");
        org.junit.Assert.assertNotNull(zonedDateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01 13:28:11.231" + "'", str32, "1970-01-01 13:28:11.231");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, 0);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZonedDateTime zonedDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, (int) (short) 10, (int) '4');
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
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        char[] charArray4 = new char[] { '#', '#', '#', '#' };
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, (int) (byte) 100);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) -1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = com.alibaba.fastjson2.util.DateUtils.parseMillis(charArray4, 28800, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28800");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, #, #, #]");
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localTime10);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int int1 = com.alibaba.fastjson2.util.DateUtils.getShanghaiZoneOffsetTotalSeconds((-59161791000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29143 + "'", int1 == 29143);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(charArray4, (int) (short) 10, 1);
        java.time.LocalTime localTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(charArray4, (int) (byte) -1);
        java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(charArray4, 6357024);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(charArray4, 100);
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
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        byte[] byteArray0 = null;
        java.time.ZonedDateTime zonedDateTime3 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray0, (int) (byte) 1, 2293857);
        org.junit.Assert.assertNull(zonedDateTime3);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        byte[] byteArray2 = new byte[] {};
        java.time.LocalTime localTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, (int) (byte) -1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray2, (int) (byte) 10);
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray2, (int) ' ');
        java.time.LocalDate localDate10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray2, (int) 'a');
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray2, 100);
        java.time.LocalTime localTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray2, 28800);
        java.time.LocalTime localTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray2, (int) (byte) 1);
        java.time.LocalTime localTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray2, (int) (byte) -1);
        java.time.LocalTime localTime20 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray2, (int) (byte) 100);
        java.time.ZoneId zoneId27 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str28 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId27);
        java.lang.String str29 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId27);
        long long30 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId27);
        java.time.ZonedDateTime zonedDateTime31 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("", zoneId27);
        java.time.ZonedDateTime zonedDateTime32 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(byteArray2, (int) (short) 10, (int) (byte) 0, zoneId27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = com.alibaba.fastjson2.util.DateUtils.parseDate("0010-35-52 10:10:10", "+175583-07 23:55:28.003", zoneId27);
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '0010-35-52 10:10:10' could not be parsed at index 0");
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
        org.junit.Assert.assertNull(localTime14);
        org.junit.Assert.assertNull(localTime16);
        org.junit.Assert.assertNull(localTime18);
        org.junit.Assert.assertNull(localTime20);
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01" + "'", str28, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "19700101" + "'", str29, "19700101");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-50400000L) + "'", long30 == (-50400000L));
        org.junit.Assert.assertNull(zonedDateTime31);
        org.junit.Assert.assertNull(zonedDateTime32);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDate localDate2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(byteArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        java.time.LocalDateTime localDateTime5 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray3, (int) (byte) 1);
        java.time.LocalTime localTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(byteArray3, 10);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(byteArray3, 6357024);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 1]");
        org.junit.Assert.assertNull(localDateTime5);
        org.junit.Assert.assertNull(localTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, (int) ' ');
        java.time.LocalDate localDate8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(byteArray0, (int) (byte) 100);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, 10);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, 2097184, 3407924);
        java.time.LocalDate localDate15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(byteArray0, 10);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 10, (int) (short) 1, charset18);
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
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.time.ZoneId zoneId5 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId5);
        java.lang.String str7 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId5);
        long long8 = com.alibaba.fastjson2.util.DateUtils.parseMillis19("1969-12-31 18:00:00", zoneId5);
        long long16 = com.alibaba.fastjson2.util.DateUtils.millis(zoneId5, 0, (int) 'a', 2293857, 2097204, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1);
        java.time.ZonedDateTime zonedDateTime17 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime("1970-01-01 08:00:00.001+08:00", zoneId5);
        java.util.Date date18 = com.alibaba.fastjson2.util.DateUtils.parseDate("1970-01-01 07:59:59.999", zoneId5);
        java.lang.String str19 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(date18);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01" + "'", str6, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19700101" + "'", str7, "19700101");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-50400000L) + "'", long8 == (-50400000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 135235494809000L + "'", long16 == 135235494809000L);
        org.junit.Assert.assertNotNull(zonedDateTime17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 17:59:59 CST 1969");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19691231" + "'", str19, "19691231");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int2 = com.alibaba.fastjson2.util.DateUtils.hourAfterNoon('a', 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6357089 + "'", int2 == 6357089);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        char[] charArray2 = new char[] { '4', ' ' };
        java.time.LocalDate localDate4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(charArray2, (int) (byte) 1);
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) (byte) 0);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray2, 0);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(charArray2, (int) ' ');
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(charArray2, 2097204);
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(charArray2, 29143);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -29141");
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
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "0000-01-01");
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str4 = com.alibaba.fastjson2.util.DateUtils.formatYMD8(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str6 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-01" + "'", str2, "0000-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01 00:00:00" + "'", str3, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "19700101" + "'", str4, "19700101");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01 00:00:00" + "'", str5, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01 00:00:00" + "'", str6, "1970-01-01 00:00:00");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalDateTime localDateTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(charArray4, (int) (short) 10);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(charArray4, 3407907);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) '4');
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(charArray4, (-1));
        java.time.LocalDateTime localDateTime16 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(charArray4, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime18 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, 3407904);
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
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.time.LocalDate localDate0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101;
        java.lang.String str1 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDate0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(localDate0);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDate0, "57860131");
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1970-01-01 00:00:00" + "'", str1, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01 00:00:00" + "'", str2, "1970-01-01 00:00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "57860131" + "'", str5, "57860131");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 1);
        java.time.ZonedDateTime zonedDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(charArray4, (int) '4');
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(zonedDateTime13);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(byteArray0, 100);
        java.time.LocalTime localTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (byte) 10);
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(byteArray0, 3407969);
        java.time.LocalDateTime localDateTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime(byteArray0, (int) (byte) 100, 2097249);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray0, (int) (short) 0, 6357089);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localTime6);
        org.junit.Assert.assertNull(localTime8);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean1 = com.alibaba.fastjson2.util.DateUtils.isLocalDate("1968-01-01 15:27:41.258-06:00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, (int) (short) 1);
        java.time.ZoneId zoneId11 = null;
        java.time.ZonedDateTime zonedDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(charArray4, 6357024, 0, zoneId11);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, 10);
        java.time.ZoneId zoneId21 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID;
        java.lang.String str22 = com.alibaba.fastjson2.util.DateUtils.formatYMD10(100L, zoneId21);
        java.lang.String str23 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) (byte) 100, zoneId21);
        java.lang.String str24 = com.alibaba.fastjson2.util.DateUtils.toString((long) ' ', true, zoneId21);
        java.lang.String str25 = com.alibaba.fastjson2.util.DateUtils.formatYMD8((long) 3407924, zoneId21);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(charArray4, (int) (short) 100, zoneId21);
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
        org.junit.Assert.assertNull(zonedDateTime12);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(zoneId21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01" + "'", str22, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "19700101" + "'", str23, "19700101");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01 08:00:00.032+08:00" + "'", str24, "1970-01-01 08:00:00.032+08:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "19700101" + "'", str25, "19700101");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.util.Date date1 = com.alibaba.fastjson2.util.DateUtils.parseDateYMDHMS19("1969-12-31 18:00:28");
        java.lang.String str2 = com.alibaba.fastjson2.util.DateUtils.toString(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 18:00:28 CST 1969");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1969-12-31 18:00:28" + "'", str2, "1969-12-31 18:00:28");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        java.time.LocalDateTime localDateTime6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray3, (int) (byte) 100, (int) 'a');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray3, 10);
        java.time.LocalDateTime localDateTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, 3407907);
        java.time.LocalDateTime localDateTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray3, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(byteArray3, (-1));
        java.time.LocalDate localDate17 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate(byteArray3, (int) (byte) 100, 0);
        java.nio.charset.Charset charset20 = null;
        long long21 = com.alibaba.fastjson2.util.DateUtils.parseMillis(byteArray3, (int) (short) 1, (int) (short) 0, charset20);
        // The following exception was thrown during execution in test generation
        try {
            java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(byteArray3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -97");
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        long long6 = com.alibaba.fastjson2.util.DateUtils.utcSeconds(1, 3407969, (int) (short) 1, (int) (short) 1, 0, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8943078848400L + "'", long6 == 8943078848400L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.time.LocalDateTime localDateTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19("1970-01-01 14:00:00", 0);
        java.lang.String str3 = com.alibaba.fastjson2.util.DateUtils.formatYMDHMS19(localDateTime2);
        java.lang.String str5 = com.alibaba.fastjson2.util.DateUtils.format(localDateTime2, "1969-12-31 18:00:00");
        long long6 = com.alibaba.fastjson2.util.DateUtils.millis(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\00014:00:00" + "'", str3, "\000\000\000\000\000\000\000\000\000\000\00014:00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31 18:00:00" + "'", str5, "1969-12-31 18:00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 72000000L + "'", long6 == 72000000L);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.time.LocalDateTime localDateTime23 = com.alibaba.fastjson2.util.DateUtils.localDateTime(' ', '4', ' ', ' ', ' ', 'a', ' ', '4', 'a', '#', '#', 'a', '4', '#', 'a', 'a', '#', '4', ' ', 'a', '#', '#', '4');
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        java.lang.Class<?> wildcardClass33 = zoneId29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        char[] charArray4 = new char[] { '4', 'a', '4', 'a' };
        java.time.LocalDate localDate6 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(charArray4, (int) ' ');
        java.time.LocalTime localTime8 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(charArray4, 0);
        java.time.LocalTime localTime10 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(charArray4, 28800);
        java.time.LocalTime localTime12 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(charArray4, (int) (byte) 10);
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(charArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDateTime14.getClass();
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
        org.junit.Assert.assertNull(localTime10);
        org.junit.Assert.assertNull(localTime12);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        java.time.LocalDate localDate7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(byteArray5, 0);
        java.time.LocalTime localTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(byteArray5, 2097204);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(byteArray5, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10, 10]");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localTime9);
        org.junit.Assert.assertNull(localTime11);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        byte[] byteArray0 = new byte[] {};
        java.time.LocalTime localTime2 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(byteArray0, (int) (byte) -1);
        java.time.LocalDateTime localDateTime4 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(byteArray0, (int) (byte) 10);
        java.time.LocalDateTime localDateTime7 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(byteArray0, (int) (byte) 0, (int) (byte) 0);
        java.time.LocalDateTime localDateTime9 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(byteArray0, 100);
        java.time.LocalTime localTime11 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, (int) (short) 1);
        java.time.LocalDateTime localDateTime13 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(byteArray0, (int) (short) 1);
        java.time.LocalTime localTime15 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(byteArray0, 3407904);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertNull(localTime2);
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localTime11);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localTime15);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.time.LocalDateTime localDateTime14 = com.alibaba.fastjson2.util.DateUtils.localDateTime('a', '#', ' ', '#', '#', ' ', 'a', ' ', '#', 'a', '4', '#', 'a', 'a');
        org.junit.Assert.assertNull(localDateTime14);
    }
}

