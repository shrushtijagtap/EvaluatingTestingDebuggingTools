import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (short) 10);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) 100);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (byte) 100);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit(1L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (byte) -1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (byte) 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) 'a');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 1L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone(0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (short) -1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) '4');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (short) 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (-1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (byte) -1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone(1L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) '#');
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) 'a');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (byte) 100);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (short) -1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (byte) 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone(10L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (short) -1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (byte) 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (short) -1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (byte) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit(10L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (short) 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext(10L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (short) 100);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((-1L));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (short) 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone(100L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (short) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) ' ');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit(10L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (short) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit(0L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit(100L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (byte) 10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (byte) 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) ' ');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (short) 100);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext(0L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (byte) 100);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (byte) 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) '#');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((-1L));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (short) 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (byte) 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) ' ');
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 10L, 100L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 1L, 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) 'a');
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (short) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (short) 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) (short) 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (byte) -1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((-1L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (byte) -1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext(1L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (byte) 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) '4');
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) '#');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit(0L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (short) 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (short) 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, (-1L), (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, (-1L), 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 10L, 1L, 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, 1L, 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit(1L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (byte) 10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 10L, (-1L), (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (short) 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) '4');
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) 100);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) ' ');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 10L, 100L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 0L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (byte) 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) 'a');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) '4');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) (short) 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) (byte) 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((-1L));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, (-1L), 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getDistanceUnit((long) '#');
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 0L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (byte) 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext((long) 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 0L, 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 0L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = org.traccar.reports.ReportUtils.getTimezone((long) (-1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, (-1L), 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit(100L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jxls.common.Context context1 = org.traccar.reports.ReportUtils.initializeContext(100L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, 100L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, (-1L), 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 100L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = org.traccar.reports.ReportUtils.getSpeedUnit((long) 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 1L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 0L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 0L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 0L, 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 10L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 100L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, (-1L), 1L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 0L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 0L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 10L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 10L, 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 1L, (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 10L, (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), 100L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, (-1L), 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 10L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 0L, 10L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 0L, 10L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 1L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 0L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L, 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 10L, 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 0L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), (-1L), 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 100L, (-1L), 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 0L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 0L, 0L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, (-1L), 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, (-1L), 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 10L, 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, (-1L), (-1L), 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, 0L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), (-1L), (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 0L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), (-1L), 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 1L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, (-1L), 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, (-1L), 100L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 0L, 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 10L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 10L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, (-1L), 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 1L, 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, 100L, 100L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, (-1L), 10L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 0L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 10L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 100L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 0L, 100L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 1L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, (-1L), 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, (-1L), 100L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, (-1L), 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 100L, 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 100L, 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 10L, 1L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 100L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, (-1L), 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, 100L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 10L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 0L, (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 1L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, (-1L), 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 0L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 1L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 10L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 10L, 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 1L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, (-1L), (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 1L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 100L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 1L, (-1L), 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 0L, 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 100L, 10L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L, 100L, (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L, 1L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 100L, (-1L), 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 10L, 10L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 1L, 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 0L, 100L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 10L, 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray12 = new java.lang.Long[] { (-1L), 10L, 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 10L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 1L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 100L, 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 1L, 100L, 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 100L, (-1L), 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 0L, 0L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray8 = new java.lang.Long[] { (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 0L, (-1L), 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, (-1L), 0L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 0L, 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        java.lang.Long[] longArray3 = new java.lang.Long[] { (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 10L, 100L, (-1L), 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        java.lang.Long[] longArray1 = new java.lang.Long[] { (-1L) };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray5 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection8 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, (-1L), 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 1L, 0L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, (-1L), 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, 0L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray7 = new java.lang.Long[] { (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 100L, 100L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 100L, 1L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, 1L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, (-1L), 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { 100L, 1L, 0L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { (-1L), 1L, 1L, 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 0L, (-1L), 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 0L, 1L, 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 0L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L, 0L, 10L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L, 100L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 0L, (-1L), 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray12 = new java.lang.Long[] { 1L, 0L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList13 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList13, longArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection15 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList13);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 100L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, 0L, 1L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 10L, (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 1L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 100L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L, 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 10L, 1L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 10L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, (-1L), 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 100L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray7 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList8 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList8, longArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection10 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 1L, 1L, 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 0L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 10L, 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, 1L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 100L, 10L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), 1L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        java.lang.Long[] longArray4 = new java.lang.Long[] { 100L, 0L, 0L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 100L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray11 = new java.lang.Long[] { 100L, 100L, 1L, 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList12);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 100L, 10L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray8 = new java.lang.Long[] { 1L, 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList9 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList9, longArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection11 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList9);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 0L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { (-1L), 10L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 1L, 1L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, (-1L), (-1L), (-1L) };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 10L, 100L, (-1L), 10L, 0L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray13 = new java.lang.Long[] { (-1L), 100L, 0L, 0L, 100L };
        java.util.ArrayList<java.lang.Long> longList14 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList14, longArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection16 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList14);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        java.lang.Long[] longArray4 = new java.lang.Long[] { (-1L), 1L, 1L, 10L };
        java.util.ArrayList<java.lang.Long> longList5 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList5, longArray4);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 1L, (-1L) };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList5, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        java.lang.Long[] longArray2 = new java.lang.Long[] { (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 100L, 100L, (-1L), 1L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray9 = new java.lang.Long[] { (-1L), 10L, (-1L), 100L, 100L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        java.lang.Long[] longArray3 = new java.lang.Long[] { 0L, 0L, 0L };
        java.util.ArrayList<java.lang.Long> longList4 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList4, longArray3);
        java.lang.Long[] longArray9 = new java.lang.Long[] { 10L, 10L, 10L };
        java.util.ArrayList<java.lang.Long> longList10 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList10, longArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection12 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList4, (java.util.Collection<java.lang.Long>) longList10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        java.lang.Long[] longArray1 = new java.lang.Long[] { 1L };
        java.util.ArrayList<java.lang.Long> longList2 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList2, longArray1);
        java.lang.Long[] longArray6 = new java.lang.Long[] { 10L, 1L };
        java.util.ArrayList<java.lang.Long> longList7 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList7, longArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection9 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList2, (java.util.Collection<java.lang.Long>) longList7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        java.lang.Long[] longArray2 = new java.lang.Long[] { 10L, 100L };
        java.util.ArrayList<java.lang.Long> longList3 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList3, longArray2);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L, 10L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList3, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        java.lang.Long[] longArray5 = new java.lang.Long[] { (-1L), 10L, 10L, (-1L), 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray10 = new java.lang.Long[] { 1L, 0L };
        java.util.ArrayList<java.lang.Long> longList11 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList11, longArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection13 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        java.lang.Long[] longArray5 = new java.lang.Long[] { 0L, 1L, 100L, 1L, 100L };
        java.util.ArrayList<java.lang.Long> longList6 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList6, longArray5);
        java.lang.Long[] longArray11 = new java.lang.Long[] { (-1L), (-1L), 0L };
        java.util.ArrayList<java.lang.Long> longList12 = new java.util.ArrayList<java.lang.Long>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Long>) longList12, longArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Collection<java.lang.Long> longCollection14 = org.traccar.reports.ReportUtils.getDeviceList((java.util.Collection<java.lang.Long>) longList6, (java.util.Collection<java.lang.Long>) longList12);
    }
}

