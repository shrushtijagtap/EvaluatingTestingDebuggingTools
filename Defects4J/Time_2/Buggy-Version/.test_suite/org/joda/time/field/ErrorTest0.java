package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology9.eras();
        org.joda.time.DurationField durationField12 = gJChronology9.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.DurationField durationField14 = gJChronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField14, and durationField11", !(durationField11.compareTo(durationField14) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField14.compareTo(durationField11))));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.yearOfCentury();
        org.joda.time.DurationField durationField13 = gJChronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.minus(0L);
        org.joda.time.Instant instant4 = instant2.plus((long) (short) 10);
        org.joda.time.DateTime dateTime5 = instant2.toDateTime();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology16 = gJChronology15.withUTC();
        org.joda.time.DurationField durationField17 = gJChronology15.eras();
        long long21 = gJChronology15.add(1L, (long) (byte) 100, 0);
        org.joda.time.MutableDateTime mutableDateTime22 = instant2.toMutableDateTime((org.joda.time.Chronology) gJChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime5", (instant2.compareTo(dateTime5) == 0) == instant2.equals(dateTime5));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = gregorianChronology0.weeks();
        org.joda.time.DurationField durationField4 = gregorianChronology0.millis();
        org.joda.time.DurationField durationField5 = gregorianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField1, and durationField3", !(durationField5.compareTo(durationField1) == 0) || (Math.signum(durationField5.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gJChronology9);
        int int11 = gJChronology9.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate3 and localDate10", (localDate3.compareTo(localDate10) == 0) == localDate3.equals(localDate10));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology9.eras();
        long long15 = gJChronology9.add(1L, (long) (byte) 100, 0);
        org.joda.time.DurationField durationField16 = gJChronology9.eras();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology9.dayOfWeek();
        org.joda.time.DurationField durationField18 = gJChronology9.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField18, and durationField11", !(durationField11.compareTo(durationField18) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField18.compareTo(durationField11))));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.Chronology chronology12 = gregorianChronology0.withZone(dateTimeZone9);
        java.lang.String str13 = gregorianChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology0.yearOfEra();
        boolean boolean16 = dateTimeField14.isLeap(2678400000L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24);
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        org.joda.time.DurationField durationField28 = iSOChronology27.years();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology27.getZone();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant30);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        java.lang.String str34 = localDate33.toString();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = localDate33.toDateTimeAtMidnight(dateTimeZone35);
        int int37 = localDate33.getYearOfEra();
        long long39 = iSOChronology27.set((org.joda.time.ReadablePartial) localDate33, (long) 3);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDate33, 0, locale41);
        int int43 = localDate33.getCenturyOfEra();
        org.joda.time.LocalTime localTime44 = null;
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant45);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate48.withPeriodAdded(readablePeriod49, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.chrono.GJChronology gJChronology54 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone52);
        org.joda.time.Chronology chronology55 = gJChronology54.withUTC();
        org.joda.time.DurationField durationField56 = gJChronology54.eras();
        org.joda.time.DateTimeField dateTimeField57 = gJChronology54.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone58 = gJChronology54.getZone();
        org.joda.time.DateTime dateTime59 = localDate33.toDateTime(localTime44, dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField56", Math.signum(durationField1.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField1)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField11 = iSOChronology10.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.weekyear();
        java.lang.String str13 = iSOChronology10.toString();
        org.joda.time.DurationField durationField14 = iSOChronology10.weekyears();
        org.joda.time.DurationField durationField15 = iSOChronology10.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField14", (durationField11.compareTo(durationField14) == 0) == durationField11.equals(durationField14));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfDay();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate4.withPeriodAdded(readablePeriod5, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8);
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.millisOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 10, (org.joda.time.Chronology) iSOChronology11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField20 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, durationField17, dateTimeFieldType18, (int) '4');
        boolean boolean21 = dividedDateTimeField20.isSupported();
        org.joda.time.DurationField durationField22 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField20, durationField22, dateTimeFieldType23);
        long long27 = remainderDateTimeField24.set((-230400000L), (int) (short) 1);
        org.joda.time.field.SkipDateTimeField skipDateTimeField28 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) iSOChronology11, (org.joda.time.DateTimeField) remainderDateTimeField24);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology11.dayOfWeek();
        org.joda.time.DurationField durationField30 = iSOChronology11.eras();
        org.joda.time.DurationField durationField31 = iSOChronology11.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField31, and durationField30", !(durationField30.compareTo(durationField31) == 0) || (Math.signum(durationField30.compareTo(durationField30)) == Math.signum(durationField31.compareTo(durationField30))));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant2);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate5.withPeriodAdded(readablePeriod6, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9);
        org.joda.time.Chronology chronology12 = gregorianChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField13 = gregorianChronology0.hours();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology0.yearOfEra();
        org.joda.time.DurationField durationField15 = gregorianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField1, and durationField13", !(durationField15.compareTo(durationField1) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField1.compareTo(durationField13))));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField11 = iSOChronology10.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.weekyear();
        java.lang.String str13 = iSOChronology10.toString();
        org.joda.time.DurationField durationField14 = iSOChronology10.millis();
        org.joda.time.DurationField durationField15 = iSOChronology10.weekyears();
        java.lang.String str16 = iSOChronology10.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField15", (durationField11.compareTo(durationField15) == 0) == durationField11.equals(durationField15));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant1);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.clockhourOfDay();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate4.withPeriodAdded(readablePeriod5, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtMidnight(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.minusHours((-1));
        org.joda.time.DateTime dateTime14 = dateTime12.minusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfCentury(53);
        boolean boolean17 = buddhistChronology0.equals((java.lang.Object) dateTime16);
        org.joda.time.Chronology chronology18 = buddhistChronology0.withUTC();
        org.joda.time.DurationField durationField19 = buddhistChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Chronology chronology21 = buddhistChronology0.withZone(dateTimeZone20);
        org.joda.time.DurationField durationField22 = buddhistChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField22, and durationField19", !(durationField19.compareTo(durationField22) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField22.compareTo(durationField19))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        java.lang.String str15 = dateTimeZone13.getShortName((long) 1);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13);
        org.joda.time.Instant instant17 = gJChronology16.getGregorianCutover();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant18);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField(dateTimeField20, durationField21, dateTimeFieldType22, (int) '4');
        boolean boolean25 = dividedDateTimeField24.isSupported();
        org.joda.time.DurationField durationField26 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField24, durationField26, dateTimeFieldType27);
        java.lang.String str29 = remainderDateTimeField28.toString();
        int int31 = remainderDateTimeField28.getMaximumValue((long) '4');
        java.util.Locale locale32 = null;
        int int33 = remainderDateTimeField28.getMaximumTextLength(locale32);
        org.joda.time.DurationField durationField34 = remainderDateTimeField28.iDurationField;
        long long36 = remainderDateTimeField28.roundHalfFloor((long) (-2024));
        org.joda.time.DurationField durationField37 = remainderDateTimeField28.getRangeDurationField();
        long long39 = remainderDateTimeField28.roundFloor(0L);
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField40 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) gJChronology16, (org.joda.time.DateTimeField) remainderDateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField37", Math.signum(durationField11.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(durationField11)));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.Partial partial7 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = partial7.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant9);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField11, durationField12, dateTimeFieldType13, (int) '4');
        java.util.Locale locale16 = null;
        int int17 = dateTimeField11.getMaximumShortTextLength(locale16);
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField18 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField11);
        java.lang.String str20 = delegatedDateTimeField18.getAsText(600000L);
        int int22 = delegatedDateTimeField18.getMaximumValue(31449600052L);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant23);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfDay();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(chronology24);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate26.withPeriodAdded(readablePeriod27, (int) (short) 10);
        org.joda.time.Partial partial30 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = partial30.getFieldTypes();
        int[] intArray32 = partial30.getValues();
        int int34 = partial30.getValue(0);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.Partial partial37 = partial30.withPeriodAdded(readablePeriod35, 0);
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfDay();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate41.withPeriodAdded(readablePeriod42, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant45);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate48.withPeriodAdded(readablePeriod49, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtMidnight(dateTimeZone52);
        int int54 = dateTime53.getCenturyOfEra();
        int int55 = dateTime53.getMinuteOfDay();
        int int56 = dateTime53.getSecondOfDay();
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant57);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.clockhourOfDay();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(chronology58);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDate localDate63 = localDate60.withPeriodAdded(readablePeriod61, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = localDate63.toDateTimeAtMidnight(dateTimeZone64);
        org.joda.time.chrono.GJChronology gJChronology66 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTime dateTime67 = dateTime53.toDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime68 = localDate41.toDateTimeAtCurrentTime(dateTimeZone64);
        org.joda.time.LocalDate localDate70 = localDate41.minusYears((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant71 = null;
        org.joda.time.Chronology chronology72 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant71);
        org.joda.time.DateTimeField dateTimeField73 = chronology72.clockhourOfDay();
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate(chronology72);
        java.lang.String str75 = localDate74.toString();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime77 = localDate74.toDateTimeAtMidnight(dateTimeZone76);
        org.joda.time.Interval interval78 = localDate41.toInterval(dateTimeZone76);
        int[] intArray79 = localDate41.getValues();
        int int80 = delegatedDateTimeField18.getMaximumValue((org.joda.time.ReadablePartial) partial30, intArray79);
        org.joda.time.chrono.JulianChronology julianChronology81 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField82 = julianChronology81.monthOfYear();
        org.joda.time.DateTimeField dateTimeField83 = julianChronology81.dayOfMonth();
        org.joda.time.Partial partial84 = new org.joda.time.Partial(dateTimeFieldTypeArray8, intArray79, (org.joda.time.Chronology) julianChronology81);
        org.joda.time.Partial partial85 = new org.joda.time.Partial((org.joda.time.Chronology) julianChronology81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate3 and partial84", (localDate3.compareTo(partial84) == 0) == localDate3.equals(partial84));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.chrono.BuddhistChronology buddhistChronology2 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.minusHours((-1));
        org.joda.time.DateTime dateTime16 = dateTime14.minusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.withYearOfCentury(53);
        boolean boolean19 = buddhistChronology2.equals((java.lang.Object) dateTime18);
        org.joda.time.DurationField durationField20 = durationFieldType0.getField((org.joda.time.Chronology) buddhistChronology2);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfDay();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate27 = localDate24.withPeriodAdded(readablePeriod25, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = localDate27.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.minusHours((-1));
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfDay();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate39 = localDate36.withPeriodAdded(readablePeriod37, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime41 = localDate39.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.minusHours((-1));
        org.joda.time.DateTime dateTime46 = dateTime44.minusYears((int) (byte) 10);
        int int47 = dateTime44.getSecondOfMinute();
        org.joda.time.DateTime dateTime49 = dateTime44.withYear((int) (short) 100);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime44);
        boolean boolean51 = durationFieldType0.isSupported(chronology50);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField52 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str53 = unsupportedDurationField52.getName();
        org.joda.time.DurationField durationField54 = null;
        int int55 = unsupportedDurationField52.compareTo(durationField54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Chronology chronology57 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant56);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.clockhourOfDay();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology57);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDate localDate62 = localDate59.withPeriodAdded(readablePeriod60, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime64 = localDate62.toDateTimeAtMidnight(dateTimeZone63);
        org.joda.time.chrono.GJChronology gJChronology65 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone63);
        org.joda.time.chrono.ISOChronology iSOChronology66 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone63);
        org.joda.time.DurationField durationField67 = iSOChronology66.years();
        org.joda.time.DateTimeField dateTimeField68 = iSOChronology66.weekyear();
        org.joda.time.DurationField durationField69 = iSOChronology66.weeks();
        int int70 = unsupportedDurationField52.compareTo(durationField69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField52, durationField20, and durationField67", !(unsupportedDurationField52.compareTo(durationField20) == 0) || (Math.signum(unsupportedDurationField52.compareTo(durationField67)) == Math.signum(durationField20.compareTo(durationField67))));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField11 = iSOChronology10.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField13 = iSOChronology10.seconds();
        org.joda.time.DurationField durationField14 = iSOChronology10.months();
        org.joda.time.DurationField durationField15 = iSOChronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField11, and durationField13", !(durationField15.compareTo(durationField11) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DurationField durationField11 = iSOChronology10.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.millisOfDay();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant13);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate19 = localDate16.withPeriodAdded(readablePeriod17, (int) (short) 10);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate19.minus(readablePeriod22);
        org.joda.time.LocalDate.Property property24 = localDate19.monthOfYear();
        int[] intArray26 = iSOChronology10.get((org.joda.time.ReadablePartial) localDate19, 86400000L);
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = gregorianChronology27.minutes();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.yearOfEra();
        org.joda.time.DurationField durationField30 = gregorianChronology27.weeks();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant31);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.chrono.JulianChronology julianChronology35 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = julianChronology35.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone37 = julianChronology35.getZone();
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtStartOfDay(dateTimeZone37);
        org.joda.time.Interval interval39 = localDate34.toInterval();
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.DateTimeUtils.getPeriodType(periodType40);
        org.joda.time.PeriodType periodType42 = org.joda.time.DateTimeUtils.getPeriodType(periodType40);
        org.joda.time.Period period43 = interval39.toPeriod(periodType40);
        int int44 = period43.size();
        long long47 = gregorianChronology27.add((org.joda.time.ReadablePeriod) period43, 28800012L, 20);
        int[] intArray49 = iSOChronology10.get((org.joda.time.ReadablePeriod) period43, 53052L);
        org.joda.time.DurationField durationField50 = iSOChronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField50, durationField11, and durationField28", !(durationField50.compareTo(durationField11) == 0) || (Math.signum(durationField50.compareTo(durationField28)) == Math.signum(durationField11.compareTo(durationField28))));
    }
}

