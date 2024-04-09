package org.joda.time;

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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime2.add(readablePeriod16, 0);
        mutableDateTime2.setYear((-28800000));
        mutableDateTime2.addWeeks((int) (byte) 8);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int24 = mutableDateTime2.get(dateTimeFieldType23);
        int int25 = mutableDateTime2.getSecondOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology26.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology31 = gregorianChronology26.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology32 = gregorianChronology26.withUTC();
        long long38 = gregorianChronology26.getDateTimeMillis((long) 1969, 0, (int) (byte) 21, 19, 2);
        org.joda.time.DurationField durationField39 = gregorianChronology26.months();
        org.joda.time.MutableDateTime mutableDateTime40 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime40.add(readableDuration41, 10);
        int int44 = mutableDateTime40.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime40.hourOfDay();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime();
        int int48 = mutableDateTime47.getMonthOfYear();
        boolean boolean49 = interval46.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.Interval interval50 = interval46.toInterval();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = interval46.toPeriod(periodType51);
        int[] intArray55 = gregorianChronology26.get((org.joda.time.ReadablePeriod) period52, (long) 29, (long) 14);
        mutableDateTime2.add((org.joda.time.ReadablePeriod) period52, (int) (byte) 1);
        mutableDateTime2.setMillisOfDay(2);
        mutableDateTime2.addWeekyears(15);
        int int62 = mutableDateTime2.getWeekyear();
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(gregorianChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1279002L + "'", long38 == 1279002L);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, 0, 0, 0, -15]");
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-28799985) + "'", int62 == (-28799985));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime2.add(readablePeriod16, 0);
        mutableDateTime2.setYear((-28800000));
        mutableDateTime2.addWeeks((int) (byte) 8);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0, chronology24);
        mutableDateTime25.setMonthOfYear(5);
        mutableDateTime25.setDayOfYear((int) (byte) 19);
        boolean boolean30 = mutableDateTime25.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone33 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.minuteOfDay();
        int int36 = mutableDateTime34.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.dayOfWeek();
        mutableDateTime34.setRounding(dateTimeField38, 5);
        int int41 = mutableDateTime34.getDayOfMonth();
        boolean boolean42 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime34);
        java.util.Date date43 = mutableDateTime34.toDate();
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(cachedDateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 19 + "'", int41 == 19);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Sun Jan 18 16:00:00 PST 1970");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getMonthOfYear();
        boolean boolean9 = interval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        mutableDateTime7.setDayOfYear((int) '#');
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime7.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology15.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = gregorianChronology15.add(readablePeriod18, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology15.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType13.getField((org.joda.time.Chronology) gregorianChronology15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0, chronology28);
        mutableDateTime29.setMonthOfYear(5);
        mutableDateTime29.setDayOfYear((int) (byte) 19);
        boolean boolean34 = mutableDateTime29.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone37 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime29.toMutableDateTime(dateTimeZone36);
        int int39 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) mutableDateTime38);
        int int40 = mutableDateTime38.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime38.add(readableDuration41, 2);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration45 = null;
        mutableDateTime44.add(readableDuration45, 10);
        int int48 = mutableDateTime44.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime44.hourOfDay();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime();
        int int52 = mutableDateTime51.getMonthOfYear();
        boolean boolean53 = interval50.isAfter((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.Interval interval54 = interval50.toInterval();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = interval50.toPeriod(periodType55);
        mutableDateTime38.add((org.joda.time.ReadablePeriod) period56);
        int[] intArray59 = gregorianChronology15.get((org.joda.time.ReadablePeriod) period56, (long) 913);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone64 = new org.joda.time.tz.FixedDateTimeZone("DurationField[months]", "", 0, (int) (byte) 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology65 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField66 = gregorianChronology65.months();
        long long69 = durationField66.getMillis((int) (short) -1, 0L);
        long long72 = durationField66.subtract(0L, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType73 = durationField66.getType();
        boolean boolean74 = fixedDateTimeZone64.equals((java.lang.Object) durationFieldType73);
        boolean boolean75 = period56.isSupported(durationFieldType73);
        mutableDateTime12.add((org.joda.time.ReadablePeriod) period56, 236);
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(cachedDateTimeZone37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 19 + "'", int40 == 19);
        org.junit.Assert.assertNotNull(mutableDateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 913]");
        org.junit.Assert.assertNotNull(gregorianChronology65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-2678400000L) + "'", long69 == (-2678400000L));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-2678400000L) + "'", long72 == (-2678400000L));
        org.junit.Assert.assertNotNull(durationFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        java.lang.String str5 = property3.toString();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.MutableDateTime mutableDateTime8 = property3.set(365);
        org.joda.time.ReadableInstant readableInstant9 = null;
        boolean boolean10 = mutableDateTime8.isAfter(readableInstant9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[secondOfDay]" + "'", str5, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = gregorianChronology0.add(readablePeriod3, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = gregorianChronology0.days();
        org.joda.time.DurationField durationField11 = gregorianChronology0.years();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean14 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) gregorianChronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 0, chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = property18.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.hourOfDay();
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType12.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.dayOfMonth();
        boolean boolean24 = gregorianChronology0.equals((java.lang.Object) chronology21);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(gregorianChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.dayOfWeek();
        org.joda.time.Chronology chronology4 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.era();
        org.joda.time.DurationField durationField10 = gregorianChronology6.seconds();
        org.joda.time.DurationField durationField11 = gregorianChronology6.millis();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField16 = new org.joda.time.field.RemainderDateTimeField(dateTimeField12, dateTimeFieldType13, (int) (short) 100);
        int int17 = remainderDateTimeField16.getDivisor();
        int int18 = remainderDateTimeField16.getMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        mutableDateTime21.setMonthOfYear(5);
        mutableDateTime21.setDayOfYear((int) (byte) 19);
        boolean boolean26 = mutableDateTime21.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone29 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime21.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        int int32 = mutableDateTime30.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.dayOfWeek();
        mutableDateTime30.setRounding(dateTimeField34, 5);
        int int37 = mutableDateTime30.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime30.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        mutableDateTime30.set(dateTimeFieldType39, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology42.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology47 = gregorianChronology42.withZone(dateTimeZone46);
        long long51 = gregorianChronology42.add((long) (short) 10, 100L, (int) (byte) 9);
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType39.getField((org.joda.time.Chronology) gregorianChronology42);
        java.lang.String str54 = dateTimeFieldType39.getName();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField55 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField16, dateTimeFieldType39);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType39.getField(chronology56);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField58 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField5, dateTimeFieldType39);
        org.joda.time.ReadablePartial readablePartial59 = null;
        int int60 = zeroIsMaxDateTimeField58.getMaximumValue(readablePartial59);
        int int62 = zeroIsMaxDateTimeField58.get((long) (-222680));
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "monthOfYear" + "'", str14, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(cachedDateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 19 + "'", int37 == 19);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 910L + "'", long51 == 910L);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "era" + "'", str54, "era");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 86400 + "'", int60 == 86400);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 86177 + "'", int62 == 86177);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getMonthOfYear();
        boolean boolean9 = interval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Interval interval10 = interval6.toInterval();
        org.joda.time.Interval interval11 = interval6.toInterval();
        org.joda.time.DateTime dateTime12 = interval6.getStart();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeField15.getAsShortText((int) '#', locale17);
        mutableDateTime13.setRounding(dateTimeField15, 5);
        int int21 = mutableDateTime13.getRoundingMode();
        boolean boolean22 = interval6.equals((java.lang.Object) int21);
        org.joda.time.Interval interval23 = interval6.toInterval();
        org.joda.time.Interval interval24 = interval6.toInterval();
        org.joda.time.Interval interval25 = interval24.toInterval();
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) interval24);
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35" + "'", str18, "35");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.yearOfCentury();
        java.lang.String str2 = iSOChronology0.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 0, chronology8);
        mutableDateTime9.setMonthOfYear(5);
        mutableDateTime9.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException16 = new org.joda.time.IllegalFieldValueException(durationFieldType14, "");
        java.lang.Throwable[] throwableArray17 = illegalFieldValueException16.getSuppressed();
        boolean boolean18 = mutableDateTime9.equals((java.lang.Object) illegalFieldValueException16);
        mutableDateTime9.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime9.add(readableDuration21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime9.add(readablePeriod23, 0);
        mutableDateTime9.setYear((-28800000));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        mutableDateTime9.setZoneRetainFields(dateTimeZone28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 0, chronology31);
        mutableDateTime32.setMonthOfYear(5);
        mutableDateTime32.setDayOfYear((int) (byte) 19);
        boolean boolean37 = mutableDateTime32.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone40 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone39);
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime32.toMutableDateTime(dateTimeZone39);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.minuteOfDay();
        int int43 = mutableDateTime41.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfWeek();
        mutableDateTime41.setRounding(dateTimeField45, 5);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime41);
        mutableDateTime41.setYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime41.getZone();
        org.joda.time.Chronology chronology52 = iSOChronology0.withZone(dateTimeZone51);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[DurationField[months]]" + "'", str2, "ISOChronology[DurationField[months]]");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(cachedDateTimeZone40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "monthOfYear", (int) (byte) 10);
        mutableDateTime3.addSeconds(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZone(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withPivotYear(17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withZoneUTC();
        java.lang.String str22 = mutableDateTime3.toString(dateTimeFormatter18);
        int int23 = dateTimeFormatter18.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-11) + "'", int11 == (-11));
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-019T02:09:10.000+02:09" + "'", str22, "1970-019T02:09:10.000+02:09");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2000 + "'", int23 == 2000);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        boolean boolean2 = mutableDateTime0.isBeforeNow();
        boolean boolean4 = mutableDateTime0.isBefore((long) (byte) 6);
        int int5 = mutableDateTime0.getHourOfDay();
        mutableDateTime0.setMinuteOfDay((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime0.getZone();
        org.junit.Assert.assertNotNull(gregorianCalendar1);
// flaky:         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("DurationField[months]", "", 0, (int) (byte) 0);
        java.lang.String str6 = fixedDateTimeZone4.getName((long) (-1));
        java.lang.String str8 = fixedDateTimeZone4.getShortName((long) (byte) 12);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(725809896000L);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 13);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZone(dateTimeZone9);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.Chronology chronology12 = gregorianChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0, chronology15);
        mutableDateTime16.setMonthOfYear(5);
        mutableDateTime16.setDayOfYear((int) (byte) 19);
        boolean boolean21 = mutableDateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone24 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(dateTimeZone23);
        int int26 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) mutableDateTime25);
        int int27 = mutableDateTime25.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime25.add(readableDuration28, 2);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 10);
        int int35 = mutableDateTime31.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        int int39 = mutableDateTime38.getMonthOfYear();
        boolean boolean40 = interval37.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.Interval interval41 = interval37.toInterval();
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = interval37.toPeriod(periodType42);
        mutableDateTime25.add((org.joda.time.ReadablePeriod) period43);
        org.joda.time.MutablePeriod mutablePeriod45 = period43.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.HALFDAYS_TYPE;
        int int47 = period43.get(durationFieldType46);
        long long50 = chronology12.add((org.joda.time.ReadablePeriod) period43, (-500000L), (int) (byte) 23);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(cachedDateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(cachedDateTimeZone24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(mutablePeriod45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 82300000L + "'", long50 == 82300000L);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone3 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.year();
        mutableDateTime4.setYear(3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(cachedDateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = gregorianChronology1.months();
        long long5 = durationField2.getMillis((int) (short) -1, 0L);
        long long8 = durationField2.subtract(0L, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType9 = durationField2.getType();
        int int12 = durationField2.getDifference(0L, (long) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        org.joda.time.field.DecoratedDurationField decoratedDurationField14 = new org.joda.time.field.DecoratedDurationField(durationField2, durationFieldType13);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, (org.joda.time.DurationField) decoratedDurationField14);
        org.joda.time.ReadablePartial readablePartial16 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.centuries();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology25.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology25.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology30 = gregorianChronology25.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology31 = gregorianChronology25.withUTC();
        long long37 = gregorianChronology25.getDateTimeMillis((long) 1969, 0, (int) (byte) 21, 19, 2);
        org.joda.time.DurationField durationField38 = gregorianChronology25.months();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, 10);
        int int43 = mutableDateTime39.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.hourOfDay();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime();
        int int47 = mutableDateTime46.getMonthOfYear();
        boolean boolean48 = interval45.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.Interval interval49 = interval45.toInterval();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = interval45.toPeriod(periodType50);
        int[] intArray54 = gregorianChronology25.get((org.joda.time.ReadablePeriod) period51, (long) 29, (long) 14);
        int[] intArray57 = iSOChronology24.get((org.joda.time.ReadablePeriod) period51, 0L, 39601970L);
        int[] intArray59 = gregorianChronology18.get((org.joda.time.ReadablePeriod) period51, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = unsupportedDateTimeField15.addWrapPartial(readablePartial16, (-1036), intArray59, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: millisOfSecond field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2678400000L) + "'", long5 == (-2678400000L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2678400000L) + "'", long8 == (-2678400000L));
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField15);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(gregorianChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1279002L + "'", long37 == 1279002L);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(interval45);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0, 0, 0, 0, 0, -15]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 11, 0, 1, 970]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 10);
        int int11 = mutableDateTime7.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getMonthOfYear();
        boolean boolean16 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Interval interval17 = interval13.toInterval();
        org.joda.time.Interval interval18 = interval13.toInterval();
        boolean boolean19 = interval6.isBefore((org.joda.time.ReadableInterval) interval13);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, 10);
        int int24 = mutableDateTime20.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getMonthOfYear();
        boolean boolean29 = interval26.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Interval interval30 = interval26.toInterval();
        org.joda.time.Interval interval31 = interval26.toInterval();
        boolean boolean32 = interval13.isAfter((org.joda.time.ReadableInterval) interval31);
        java.lang.String str33 = interval13.toString();
        org.joda.time.Duration duration34 = interval13.toDuration();
        org.joda.time.Chronology chronology35 = interval13.getChronology();
        org.joda.time.Duration duration36 = interval13.toDuration();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-01T01:00:00.000Z" + "'", str33, "1970-01-01T00:00:00.000Z/1970-01-01T01:00:00.000Z");
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(duration36);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        int int13 = mutableDateTime11.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfWeek();
        mutableDateTime11.setRounding(dateTimeField15, 5);
        int int18 = mutableDateTime11.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.millisOfSecond();
        mutableDateTime11.setTime((int) (byte) 0, (int) (byte) 1, 2, 1);
        int int25 = mutableDateTime11.getEra();
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime3.toMutableDateTime(dateTimeZone10);
        int int13 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) mutableDateTime12);
        int int14 = mutableDateTime12.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime12.add(readableDuration15, 2);
        boolean boolean19 = mutableDateTime12.isEqual((-62071747199903L));
        mutableDateTime12.setSecondOfMinute((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology22.era();
        org.joda.time.DurationField durationField26 = gregorianChronology22.seconds();
        org.joda.time.DurationField durationField27 = gregorianChronology22.centuries();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology22.dayOfMonth();
        mutableDateTime12.setChronology((org.joda.time.Chronology) gregorianChronology22);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        mutableDateTime12.add(readablePeriod30, (int) '4');
        java.util.Date date33 = mutableDateTime12.toDate();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(cachedDateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Sun Jan 18 16:00:10 PST 1970");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime2.add(readablePeriod16, 0);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime2.add(readableDuration19);
        java.util.Date date21 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        mutableDateTime2.set(dateTimeFieldType22, 0);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.yearOfCentury();
        java.lang.String str27 = iSOChronology25.toString();
        org.joda.time.DurationField durationField28 = iSOChronology25.weeks();
        org.joda.time.DurationField durationField29 = iSOChronology25.minutes();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField30 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType22, durationField29);
        long long33 = unsupportedDateTimeField30.add((long) 40, 349200019L);
        org.joda.time.DurationField durationField34 = unsupportedDateTimeField30.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int35 = unsupportedDateTimeField30.getMaximumValue();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: millisOfDay field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed Dec 31 16:00:10 PST 1969");
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ISOChronology[DurationField[months]]" + "'", str27, "ISOChronology[DurationField[months]]");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 20952001140040L + "'", long33 == 20952001140040L);
        org.junit.Assert.assertNull(durationField34);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableDateTime2.equals(obj5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.HOURS_TYPE;
        mutableDateTime2.add(durationFieldType7, (int) (short) 10);
        mutableDateTime2.addWeeks(0);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime12.add(readableDuration13, 10);
        int int16 = mutableDateTime12.getWeekOfWeekyear();
        int int17 = mutableDateTime12.getMillisOfSecond();
        boolean boolean19 = mutableDateTime12.isAfter((long) 913);
        boolean boolean20 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.CENTURIES_TYPE;
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = gregorianChronology22.add(readablePeriod25, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology22.yearOfCentury();
        org.joda.time.DurationField durationField30 = gregorianChronology22.weekyears();
        org.joda.time.DurationField durationField31 = durationFieldType21.getField((org.joda.time.Chronology) gregorianChronology22);
        mutableDateTime12.setChronology((org.joda.time.Chronology) gregorianChronology22);
        org.joda.time.DurationField durationField33 = gregorianChronology22.years();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.era();
        org.joda.time.DurationField durationField5 = gregorianChronology1.seconds();
        org.joda.time.DurationField durationField6 = gregorianChronology1.centuries();
        org.joda.time.DurationField durationField7 = gregorianChronology1.halfdays();
        org.joda.time.Chronology chronology8 = gregorianChronology1.withUTC();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 0, chronology10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfFloor();
        java.lang.String str14 = property12.toString();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.MutableDateTime mutableDateTime16 = property12.roundHalfFloor();
        boolean boolean17 = gregorianChronology1.equals((java.lang.Object) mutableDateTime16);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) (-7730231L), (org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology19.era();
        org.joda.time.DurationField durationField23 = gregorianChronology19.seconds();
        org.joda.time.DurationField durationField24 = gregorianChronology19.millis();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology19.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str27 = dateTimeFieldType26.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dateTimeField25, dateTimeFieldType26, (int) (short) 100);
        org.joda.time.DurationField durationField30 = remainderDateTimeField29.getRangeDurationField();
        org.joda.time.DurationField durationField31 = remainderDateTimeField29.getDurationField();
        long long33 = remainderDateTimeField29.roundFloor(32L);
        int int35 = remainderDateTimeField29.getLeapAmount((long) 129);
        org.joda.time.DurationField durationField36 = remainderDateTimeField29.getRangeDurationField();
        long long38 = remainderDateTimeField29.roundFloor(157766400000L);
        org.joda.time.MutableDateTime.Property property39 = new org.joda.time.MutableDateTime.Property(mutableDateTime18, (org.joda.time.DateTimeField) remainderDateTimeField29);
        mutableDateTime18.setMillisOfSecond((int) (byte) 0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[secondOfDay]" + "'", str14, "Property[secondOfDay]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "monthOfYear" + "'", str27, "monthOfYear");
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 157766400000L + "'", long38 == 157766400000L);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setWeekOfWeekyear(57600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57600000 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (byte) 13);
        int int10 = mutableDateTime2.getDayOfYear();
        int int11 = mutableDateTime2.getMinuteOfHour();
        int int12 = mutableDateTime2.getMonthOfYear();
        mutableDateTime2.setYear((-4));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYear(24, 20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendTwoDigitYear((int) (byte) 2);
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12, 10);
        int int15 = mutableDateTime11.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.dayOfWeek();
        boolean boolean18 = property16.equals((java.lang.Object) (-1));
        org.joda.time.DateTimeField dateTimeField19 = property16.getField();
        org.joda.time.MutableDateTime mutableDateTime20 = property16.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder5.appendSignedDecimal(dateTimeFieldType21, (int) (byte) 11, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendClockhourOfDay(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendTimeZoneShortName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap28 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder24.appendTimeZoneShortName(strMap28);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = dateTimeFormatterBuilder24.toPrinter();
        boolean boolean31 = property3.equals((java.lang.Object) dateTimeFormatterBuilder24);
        org.joda.time.MutableDateTime mutableDateTime33 = property3.set(544);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimePrinter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.dayOfWeek();
        org.joda.time.Chronology chronology4 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.era();
        org.joda.time.DurationField durationField10 = gregorianChronology6.seconds();
        org.joda.time.DurationField durationField11 = gregorianChronology6.millis();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField16 = new org.joda.time.field.RemainderDateTimeField(dateTimeField12, dateTimeFieldType13, (int) (short) 100);
        int int17 = remainderDateTimeField16.getDivisor();
        int int18 = remainderDateTimeField16.getMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        mutableDateTime21.setMonthOfYear(5);
        mutableDateTime21.setDayOfYear((int) (byte) 19);
        boolean boolean26 = mutableDateTime21.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone29 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime21.toMutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        int int32 = mutableDateTime30.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.dayOfWeek();
        mutableDateTime30.setRounding(dateTimeField34, 5);
        int int37 = mutableDateTime30.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime30.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        mutableDateTime30.set(dateTimeFieldType39, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology42.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology47 = gregorianChronology42.withZone(dateTimeZone46);
        long long51 = gregorianChronology42.add((long) (short) 10, 100L, (int) (byte) 9);
        org.joda.time.DateTimeField dateTimeField52 = gregorianChronology42.dayOfYear();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType39.getField((org.joda.time.Chronology) gregorianChronology42);
        java.lang.String str54 = dateTimeFieldType39.getName();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField55 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField16, dateTimeFieldType39);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType39.getField(chronology56);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField58 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField5, dateTimeFieldType39);
        long long61 = zeroIsMaxDateTimeField58.addWrapField(0L, 960);
        long long63 = zeroIsMaxDateTimeField58.roundHalfEven(121001L);
        long long65 = zeroIsMaxDateTimeField58.roundHalfEven(1712408905631L);
        int int66 = zeroIsMaxDateTimeField58.getMaximumValue();
        org.joda.time.ReadablePartial readablePartial67 = null;
        int int68 = zeroIsMaxDateTimeField58.getMinimumValue(readablePartial67);
        boolean boolean70 = zeroIsMaxDateTimeField58.isLeap((-2678400000L));
        int int72 = zeroIsMaxDateTimeField58.getMaximumValue(105151900000L);
        int int74 = zeroIsMaxDateTimeField58.getMinimumValue(20020L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "monthOfYear" + "'", str14, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(cachedDateTimeZone29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 18 + "'", int37 == 18);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(gregorianChronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 910L + "'", long51 == 910L);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "era" + "'", str54, "era");
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 960000L + "'", long61 == 960000L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 121000L + "'", long63 == 121000L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1712408906000L + "'", long65 == 1712408906000L);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 86400 + "'", int66 == 86400);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 86400 + "'", int72 == 86400);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        mutableDateTime4.addYears((int) '#');
        mutableDateTime4.setMillisOfDay(97);
        mutableDateTime4.setSecondOfDay(1969);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime4.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setMillisOfSecond(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime2.dayOfYear();
        org.joda.time.DateTime dateTime13 = mutableDateTime2.toDateTimeISO();
        mutableDateTime2.setSecondOfMinute(0);
        org.joda.time.Chronology chronology16 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.toMutableDateTime();
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(24, 20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTwoDigitYear((int) (byte) 2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYear((int) (byte) 1, (int) (byte) 19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendTimeZoneId();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatterBuilder5.toPrinter();
        int int11 = dateTimePrinter10.estimatePrintedLength();
        int int12 = dateTimePrinter10.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendYear(24, 20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendTwoDigitYear((int) (byte) 2);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime19.add(readableDuration20, 10);
        int int23 = mutableDateTime19.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.dayOfWeek();
        boolean boolean26 = property24.equals((java.lang.Object) (-1));
        org.joda.time.DateTimeField dateTimeField27 = property24.getField();
        org.joda.time.MutableDateTime mutableDateTime28 = property24.roundHalfEven();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property24.getFieldType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder13.appendSignedDecimal(dateTimeFieldType29, (int) (byte) 11, (int) (byte) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter34.withZone(dateTimeZone37);
        int int39 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter38.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder13.append(dateTimeParser40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder13.appendSecondOfDay(236);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder13.appendCenturyOfEra(2000, (int) (byte) 10);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatterBuilder13.toParser();
        int int50 = dateTimeParser49.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimePrinter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 77 + "'", int11 == 77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 77 + "'", int12 == 77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeParser40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeParser49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2312 + "'", int50 == 2312);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.dayOfWeek();
        mutableDateTime0.addYears(1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        mutableDateTime0.setZone(dateTimeZone8);
        mutableDateTime0.setWeekOfWeekyear(37);
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfCeiling();
        int int7 = mutableDateTime6.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        mutableDateTime11.addYears((int) (byte) 23);
        int int15 = mutableDateTime11.getMillisOfDay();
        java.lang.String str17 = mutableDateTime11.toString("28800000");
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(cachedDateTimeZone10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "28800000" + "'", str17, "28800000");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime2.add(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        mutableDateTime2.add(readablePeriod16, 0);
        mutableDateTime2.setYear((-28800000));
        mutableDateTime2.addWeeks((int) (byte) 8);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 0, chronology24);
        mutableDateTime25.setMonthOfYear(5);
        mutableDateTime25.setDayOfYear((int) (byte) 19);
        boolean boolean30 = mutableDateTime25.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone33 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime25.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.minuteOfDay();
        int int36 = mutableDateTime34.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.dayOfWeek();
        mutableDateTime34.setRounding(dateTimeField38, 5);
        int int41 = mutableDateTime34.getDayOfMonth();
        boolean boolean42 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.Chronology chronology43 = mutableDateTime34.getChronology();
        mutableDateTime34.addWeekyears(913);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime34.weekOfWeekyear();
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(cachedDateTimeZone33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 18 + "'", int41 == 18);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(property46);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getMonthOfYear();
        boolean boolean9 = interval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Interval interval10 = interval6.toInterval();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration12 = null;
        mutableDateTime11.add(readableDuration12, 10);
        int int15 = mutableDateTime11.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime11.hourOfDay();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime18.add(readableDuration19, 10);
        int int22 = mutableDateTime18.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.hourOfDay();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime();
        int int26 = mutableDateTime25.getMonthOfYear();
        boolean boolean27 = interval24.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.Interval interval28 = interval24.toInterval();
        org.joda.time.Interval interval29 = interval24.toInterval();
        boolean boolean30 = interval17.isBefore((org.joda.time.ReadableInterval) interval24);
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime31.add(readableDuration32, 10);
        int int35 = mutableDateTime31.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime31.hourOfDay();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime();
        int int39 = mutableDateTime38.getMonthOfYear();
        boolean boolean40 = interval37.isAfter((org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.Interval interval41 = interval37.toInterval();
        org.joda.time.Interval interval42 = interval37.toInterval();
        boolean boolean43 = interval24.isAfter((org.joda.time.ReadableInterval) interval42);
        boolean boolean44 = interval10.overlaps((org.joda.time.ReadableInterval) interval42);
        long long45 = interval10.toDurationMillis();
        org.joda.time.MutableDateTime mutableDateTime46 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, 10);
        int int50 = mutableDateTime46.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.hourOfDay();
        org.joda.time.Interval interval52 = property51.toInterval();
        org.joda.time.MutableDateTime mutableDateTime53 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration54 = null;
        mutableDateTime53.add(readableDuration54, 10);
        int int57 = mutableDateTime53.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime53.hourOfDay();
        org.joda.time.Interval interval59 = property58.toInterval();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime();
        int int61 = mutableDateTime60.getMonthOfYear();
        boolean boolean62 = interval59.isAfter((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.Interval interval63 = interval59.toInterval();
        org.joda.time.Interval interval64 = interval59.toInterval();
        boolean boolean65 = interval52.isBefore((org.joda.time.ReadableInterval) interval59);
        org.joda.time.DateTime dateTime66 = interval52.getEnd();
        org.joda.time.ReadableInterval readableInterval67 = null;
        boolean boolean68 = interval52.isBefore(readableInterval67);
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) interval52);
        boolean boolean70 = interval10.isAfter(readableInterval69);
        long long71 = readableInterval69.toDurationMillis();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableDateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 3600000L + "'", long45 == 3600000L);
        org.junit.Assert.assertNotNull(mutableDateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(interval59);
// flaky:         org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 3600000L + "'", long71 == 3600000L);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gregorianChronology1.add(readablePeriod5, (long) 100, (int) (byte) 3);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(105228000000L, (org.joda.time.Chronology) gregorianChronology1);
        java.lang.String str10 = gregorianChronology1.toString();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((org.joda.time.Chronology) gregorianChronology1);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GregorianChronology[UTC]" + "'", str10, "GregorianChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getMonthOfYear();
        boolean boolean9 = interval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.Interval interval10 = interval6.toInterval();
        org.joda.time.Interval interval11 = interval6.toInterval();
        org.joda.time.DateTime dateTime12 = interval6.getStart();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now();
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeField15.getAsShortText((int) '#', locale17);
        mutableDateTime13.setRounding(dateTimeField15, 5);
        int int21 = mutableDateTime13.getRoundingMode();
        boolean boolean22 = interval6.equals((java.lang.Object) int21);
        org.joda.time.Interval interval23 = interval6.toInterval();
        org.joda.time.Interval interval24 = interval6.toInterval();
        org.joda.time.Interval interval25 = interval24.toInterval();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0, chronology27);
        mutableDateTime28.setMonthOfYear(5);
        mutableDateTime28.setDayOfYear((int) (byte) 19);
        boolean boolean33 = mutableDateTime28.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone36 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime28.toMutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.minuteOfDay();
        boolean boolean39 = interval25.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        mutableDateTime37.setSecondOfDay(78660);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime37.minuteOfDay();
        int int43 = mutableDateTime37.getRoundingMode();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35" + "'", str18, "35");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(interval25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(cachedDateTimeZone36);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(property38);
// flaky:         org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.halfdayOfDay();
        java.util.Locale locale7 = null;
        int int8 = dateTimeField6.getMaximumTextLength(locale7);
        org.joda.time.ReadablePartial readablePartial9 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology11.era();
        org.joda.time.DurationField durationField15 = gregorianChronology11.seconds();
        org.joda.time.DurationField durationField16 = gregorianChronology11.millis();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology11.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str19 = dateTimeFieldType18.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField21 = new org.joda.time.field.RemainderDateTimeField(dateTimeField17, dateTimeFieldType18, (int) (short) 100);
        org.joda.time.DurationField durationField22 = remainderDateTimeField21.getRangeDurationField();
        org.joda.time.DurationField durationField23 = remainderDateTimeField21.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.monthOfYear();
        org.joda.time.DurationField durationField28 = gregorianChronology24.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.yearOfEra();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology29.secondOfDay();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology29.era();
        org.joda.time.DurationField durationField33 = gregorianChronology29.seconds();
        org.joda.time.DurationField durationField34 = gregorianChronology29.millis();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology29.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str37 = dateTimeFieldType36.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField39 = new org.joda.time.field.RemainderDateTimeField(dateTimeField35, dateTimeFieldType36, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField40 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField21, durationField28, dateTimeFieldType36);
        long long43 = dividedDateTimeField40.add((long) (byte) -1, (long) 365);
        long long45 = dividedDateTimeField40.roundFloor((long) 7750);
        long long48 = dividedDateTimeField40.add((-62071747199903L), 4);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField49 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField40);
        int int50 = dividedDateTimeField40.getDivisor();
        long long53 = dividedDateTimeField40.set(0L, (int) (byte) 7);
        org.joda.time.ReadablePartial readablePartial54 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology55 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField56 = gregorianChronology55.yearOfEra();
        org.joda.time.DateTimeField dateTimeField57 = gregorianChronology55.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology60 = gregorianChronology55.withZone(dateTimeZone59);
        org.joda.time.Chronology chronology61 = gregorianChronology55.withUTC();
        long long67 = gregorianChronology55.getDateTimeMillis((long) 1969, 0, (int) (byte) 21, 19, 2);
        org.joda.time.DurationField durationField68 = gregorianChronology55.months();
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration70 = null;
        mutableDateTime69.add(readableDuration70, 10);
        int int73 = mutableDateTime69.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime69.hourOfDay();
        org.joda.time.Interval interval75 = property74.toInterval();
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime();
        int int77 = mutableDateTime76.getMonthOfYear();
        boolean boolean78 = interval75.isAfter((org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.Interval interval79 = interval75.toInterval();
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = interval75.toPeriod(periodType80);
        int[] intArray84 = gregorianChronology55.get((org.joda.time.ReadablePeriod) period81, (long) 29, (long) 14);
        int int85 = dividedDateTimeField40.getMaximumValue(readablePartial54, intArray84);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray87 = dateTimeField6.addWrapPartial(readablePartial9, 391, intArray84, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 391");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "monthOfYear" + "'", str19, "monthOfYear");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(gregorianChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "monthOfYear" + "'", str37, "monthOfYear");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 36499999L + "'", long43 == 36499999L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-62071746799903L) + "'", long48 == (-62071746799903L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 700000L + "'", long53 == 700000L);
        org.junit.Assert.assertNotNull(gregorianChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1279002L + "'", long67 == 1279002L);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(mutableDateTime69);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(interval75);
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[0, 0, 0, 0, 0, 0, 0, -15]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 863 + "'", int85 == 863);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        java.lang.Object obj5 = null;
        boolean boolean6 = mutableDateTime2.equals(obj5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.HOURS_TYPE;
        mutableDateTime2.add(durationFieldType7, (int) (short) 10);
        org.joda.time.field.PreciseDurationField preciseDurationField11 = new org.joda.time.field.PreciseDurationField(durationFieldType7, (long) (short) 0);
        long long14 = preciseDurationField11.add(2524556160000L, (-292275054));
        long long17 = preciseDurationField11.add(1969L, (int) (short) -1);
        long long20 = preciseDurationField11.getMillis((long) 31, (long) (short) 100);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology21.dayOfWeek();
        long long29 = gregorianChronology21.getDateTimeMillis(5, 4, (int) (byte) 3, (int) (byte) 15);
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology21.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology21.weekyearOfCentury();
        boolean boolean32 = preciseDurationField11.equals((java.lang.Object) gregorianChronology21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2524556160000L + "'", long14 == 2524556160000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1969L + "'", long17 == 1969L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-62001417599985L) + "'", long29 == (-62001417599985L));
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.hourOfDay();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 10);
        int int11 = mutableDateTime7.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getMonthOfYear();
        boolean boolean16 = interval13.isAfter((org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Interval interval17 = interval13.toInterval();
        org.joda.time.Interval interval18 = interval13.toInterval();
        boolean boolean19 = interval6.isBefore((org.joda.time.ReadableInterval) interval13);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, 10);
        int int24 = mutableDateTime20.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.hourOfDay();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getMonthOfYear();
        boolean boolean29 = interval26.isAfter((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Interval interval30 = interval26.toInterval();
        org.joda.time.Interval interval31 = interval26.toInterval();
        boolean boolean32 = interval13.isAfter((org.joda.time.ReadableInterval) interval31);
        java.lang.String str33 = interval13.toString();
        org.joda.time.Duration duration34 = interval13.toDuration();
        org.joda.time.Chronology chronology35 = interval13.getChronology();
        org.joda.time.Chronology chronology36 = interval13.getChronology();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 0, chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.secondOfDay();
        java.lang.String str41 = property40.getAsShortText();
        org.joda.time.MutableDateTime mutableDateTime42 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration43 = null;
        mutableDateTime42.add(readableDuration43, 10);
        int int46 = mutableDateTime42.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime42.dayOfWeek();
        boolean boolean49 = property47.equals((java.lang.Object) (-1));
        org.joda.time.MutableDateTime mutableDateTime50 = property47.roundHalfCeiling();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter51.withZone(dateTimeZone54);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone56 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone54);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone54.getName(0L, locale58);
        mutableDateTime50.setZoneRetainFields(dateTimeZone54);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) 0, chronology63);
        mutableDateTime64.setMonthOfYear(5);
        mutableDateTime64.setDayOfYear((int) (byte) 19);
        boolean boolean69 = mutableDateTime64.isAfterNow();
        int int72 = dateTimeFormatter61.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime64, "monthOfYear", (int) (byte) 10);
        mutableDateTime64.addSeconds(10);
        mutableDateTime64.addWeekyears(20);
        int int77 = mutableDateTime64.getSecondOfDay();
        int int78 = mutableDateTime50.compareTo((org.joda.time.ReadableInstant) mutableDateTime64);
        boolean boolean79 = property40.equals((java.lang.Object) mutableDateTime50);
        int int80 = mutableDateTime50.getCenturyOfEra();
        boolean boolean81 = interval13.isBefore((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.MutableDateTime mutableDateTime82 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration83 = null;
        mutableDateTime82.add(readableDuration83, 10);
        int int86 = mutableDateTime82.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property87 = mutableDateTime82.hourOfDay();
        org.joda.time.Interval interval88 = property87.toInterval();
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime();
        int int90 = mutableDateTime89.getMonthOfYear();
        boolean boolean91 = interval88.isAfter((org.joda.time.ReadableInstant) mutableDateTime89);
        org.joda.time.Interval interval92 = interval88.toInterval();
        org.joda.time.Interval interval93 = interval88.toInterval();
        boolean boolean94 = interval13.isBefore((org.joda.time.ReadableInterval) interval93);
        long long95 = interval13.getStartMillis();
        org.joda.time.Chronology chronology96 = interval13.getChronology();
        org.junit.Assert.assertNotNull(mutableDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T02:00:00.000+02:09/1970-01-01T03:00:00.000+02:09" + "'", str33, "1970-01-01T02:00:00.000+02:09/1970-01-01T03:00:00.000+02:09");
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "7740" + "'", str41, "7740");
        org.junit.Assert.assertNotNull(mutableDateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(cachedDateTimeZone56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+02:09" + "'", str59, "+02:09");
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
// flaky:         org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-11) + "'", int72 == (-11));
// flaky:         org.junit.Assert.assertTrue("'" + int77 + "' != '" + 7750 + "'", int77 == 7750);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 19 + "'", int80 == 19);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(mutableDateTime82);
// flaky:         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(interval88);
// flaky:         org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(interval92);
        org.junit.Assert.assertNotNull(interval93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-540000L) + "'", long95 == (-540000L));
        org.junit.Assert.assertNotNull(chronology96);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.centuries();
        org.joda.time.DurationField durationField6 = gregorianChronology0.halfdays();
        org.joda.time.Chronology chronology7 = gregorianChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 0, chronology10);
        mutableDateTime11.setMonthOfYear(5);
        mutableDateTime11.setDayOfYear((int) (byte) 19);
        boolean boolean16 = mutableDateTime11.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone19 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime11.toMutableDateTime(dateTimeZone18);
        int int21 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) mutableDateTime20);
        int int22 = mutableDateTime20.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime20.add(readableDuration23, 2);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, 10);
        int int30 = mutableDateTime26.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.hourOfDay();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        int int34 = mutableDateTime33.getMonthOfYear();
        boolean boolean35 = interval32.isAfter((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.Interval interval36 = interval32.toInterval();
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = interval32.toPeriod(periodType37);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period38);
        org.joda.time.MutablePeriod mutablePeriod40 = period38.toMutablePeriod();
        org.joda.time.MutablePeriod mutablePeriod41 = mutablePeriod40.toMutablePeriod();
        int[] intArray43 = gregorianChronology0.get((org.joda.time.ReadablePeriod) mutablePeriod40, (-62071747199903L));
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology44.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology49 = gregorianChronology44.withZone(dateTimeZone48);
        org.joda.time.Chronology chronology50 = gregorianChronology44.withUTC();
        long long56 = gregorianChronology44.getDateTimeMillis((long) 1969, 0, (int) (byte) 21, 19, 2);
        org.joda.time.DurationField durationField57 = gregorianChronology44.months();
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime58.add(readableDuration59, 10);
        int int62 = mutableDateTime58.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime58.hourOfDay();
        org.joda.time.Interval interval64 = property63.toInterval();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime();
        int int66 = mutableDateTime65.getMonthOfYear();
        boolean boolean67 = interval64.isAfter((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.Interval interval68 = interval64.toInterval();
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = interval64.toPeriod(periodType69);
        int[] intArray73 = gregorianChronology44.get((org.joda.time.ReadablePeriod) period70, (long) 29, (long) 14);
        org.joda.time.Period period74 = period70.toPeriod();
        org.joda.time.DurationFieldType durationFieldType75 = org.joda.time.DurationFieldType.WEEKYEARS_TYPE;
        boolean boolean76 = period74.isSupported(durationFieldType75);
        long long79 = gregorianChronology0.add((org.joda.time.ReadablePeriod) period74, (long) (byte) 19, (int) 'a');
        org.joda.time.DurationField durationField80 = gregorianChronology0.years();
        org.joda.time.DateTimeField dateTimeField81 = gregorianChronology0.era();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(cachedDateTimeZone19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7740000 + "'", int21 == 7740000);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, -102631, -5, -23, -59, -59, -903]");
        org.junit.Assert.assertNotNull(gregorianChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1279002L + "'", long56 == 1279002L);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(mutableDateTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(interval64);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 0, 0, 0, 0, 0, 0, -15]");
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 349200019L + "'", long79 == 349200019L);
        org.junit.Assert.assertNotNull(durationField80);
        org.junit.Assert.assertNotNull(dateTimeField81);
    }
}
