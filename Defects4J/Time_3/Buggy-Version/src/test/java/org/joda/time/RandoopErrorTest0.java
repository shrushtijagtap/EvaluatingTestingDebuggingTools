package org.joda.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test01");
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
        boolean boolean14 = dateTimeZone0.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        mutableDateTime11.setMinuteOfDay((int) (byte) 21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        mutableDateTime21.setMonthOfYear(5);
        mutableDateTime21.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException28 = new org.joda.time.IllegalFieldValueException(durationFieldType26, "");
        java.lang.Throwable[] throwableArray29 = illegalFieldValueException28.getSuppressed();
        boolean boolean30 = mutableDateTime21.equals((java.lang.Object) illegalFieldValueException28);
        boolean boolean31 = dateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        int int32 = mutableDateTime21.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        int int14 = mutableDateTime11.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
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
        java.lang.String str15 = dateTimeZone0.getNameKey((long) 1969);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime3.toMutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int15 = mutableDateTime12.get(dateTimeFieldType14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean18 = dateTimeFieldType16.isSupported((org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean21 = dateTimeFieldType19.isSupported((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 0, chronology25);
        mutableDateTime26.setMonthOfYear(5);
        mutableDateTime26.setDayOfYear((int) (byte) 19);
        boolean boolean31 = mutableDateTime26.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone34 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime26.toMutableDateTime(dateTimeZone33);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.minuteOfDay();
        int int37 = mutableDateTime35.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology38.dayOfWeek();
        mutableDateTime35.setRounding(dateTimeField39, 5);
        int int42 = mutableDateTime35.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime35.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.era();
        mutableDateTime35.set(dateTimeFieldType44, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.IllegalFieldValueException illegalFieldValueException53 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType49, (java.lang.Number) 3, (java.lang.Number) 60000L, (java.lang.Number) 0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray55 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0, dateTimeFieldType14, dateTimeFieldType16, dateTimeFieldType19, dateTimeFieldType22, dateTimeFieldType23, dateTimeFieldType44, dateTimeFieldType47, dateTimeFieldType48, dateTimeFieldType49, dateTimeFieldType54 };
        java.util.ArrayList<org.joda.time.DateTimeFieldType> dateTimeFieldTypeList56 = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList56, dateTimeFieldTypeArray55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList56, true, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone23 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0, chronology26);
        mutableDateTime27.setMonthOfYear(5);
        mutableDateTime27.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException34 = new org.joda.time.IllegalFieldValueException(durationFieldType32, "");
        java.lang.Throwable[] throwableArray35 = illegalFieldValueException34.getSuppressed();
        boolean boolean36 = mutableDateTime27.equals((java.lang.Object) illegalFieldValueException34);
        mutableDateTime27.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology39.yearOfEra();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology39.secondOfDay();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology39.monthOfYear();
        org.joda.time.DateTime dateTime43 = mutableDateTime27.toDateTime((org.joda.time.Chronology) gregorianChronology39);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 0, chronology45);
        mutableDateTime46.setMonthOfYear(5);
        mutableDateTime46.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException53 = new org.joda.time.IllegalFieldValueException(durationFieldType51, "");
        java.lang.Throwable[] throwableArray54 = illegalFieldValueException53.getSuppressed();
        boolean boolean55 = mutableDateTime46.equals((java.lang.Object) illegalFieldValueException53);
        boolean boolean56 = dateTime43.isAfter((org.joda.time.ReadableInstant) mutableDateTime46);
        int int57 = mutableDateTime24.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and dateTime43", (mutableDateTime27.compareTo(dateTime43) == 0) == mutableDateTime27.equals(dateTime43));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
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
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0, chronology29);
        mutableDateTime30.setMonthOfYear(5);
        mutableDateTime30.setDayOfYear((int) (byte) 19);
        boolean boolean35 = mutableDateTime30.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone38 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime30.toMutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.minuteOfDay();
        mutableDateTime39.addYears((int) (byte) 23);
        mutableDateTime25.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        mutableDateTime21.setMonthOfYear(5);
        mutableDateTime21.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException28 = new org.joda.time.IllegalFieldValueException(durationFieldType26, "");
        java.lang.Throwable[] throwableArray29 = illegalFieldValueException28.getSuppressed();
        boolean boolean30 = mutableDateTime21.equals((java.lang.Object) illegalFieldValueException28);
        boolean boolean31 = dateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.setMillis((long) (byte) 21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        int int13 = mutableDateTime11.get(dateTimeFieldType12);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = gregorianChronology14.add(readablePeriod17, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DurationField durationField21 = gregorianChronology14.days();
        boolean boolean22 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) gregorianChronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.secondOfDay();
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        mutableDateTime21.setMillis((long) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone3 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone0);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone3);
        mutableDateTime4.addHours((int) (byte) 23);
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
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone30 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime9.toMutableDateTime(dateTimeZone29);
        mutableDateTime4.setZoneRetainFields(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime31", (mutableDateTime9.compareTo(mutableDateTime31) == 0) == mutableDateTime9.equals(mutableDateTime31));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test13");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType17.getRangeDurationType();
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology22.era();
        org.joda.time.DurationField durationField26 = gregorianChronology22.seconds();
        org.joda.time.DurationField durationField27 = gregorianChronology22.centuries();
        org.joda.time.DurationField durationField28 = durationFieldType21.getField((org.joda.time.Chronology) gregorianChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField26, and durationField27", !(durationField28.compareTo(durationField26) == 0) || (Math.signum(durationField28.compareTo(durationField27)) == Math.signum(durationField26.compareTo(durationField27))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test14");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        int int13 = property12.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test15");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        mutableDateTime21.setMonthOfYear(5);
        mutableDateTime21.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException28 = new org.joda.time.IllegalFieldValueException(durationFieldType26, "");
        java.lang.Throwable[] throwableArray29 = illegalFieldValueException28.getSuppressed();
        boolean boolean30 = mutableDateTime21.equals((java.lang.Object) illegalFieldValueException28);
        boolean boolean31 = dateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology32.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology37 = gregorianChronology32.withZone(dateTimeZone36);
        long long41 = gregorianChronology32.add((long) (short) 10, 100L, (int) (byte) 9);
        org.joda.time.DurationField durationField42 = gregorianChronology32.halfdays();
        org.joda.time.DateTime dateTime43 = mutableDateTime21.toDateTime((org.joda.time.Chronology) gregorianChronology32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test16");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.yearOfCentury();
        int int2 = dateTimeField1.getMaximumValue();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0, chronology4);
        mutableDateTime5.setMonthOfYear(5);
        mutableDateTime5.setDayOfYear((int) (byte) 19);
        boolean boolean10 = mutableDateTime5.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone13 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime5.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        int int16 = mutableDateTime14.get(dateTimeFieldType15);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField17 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField1, dateTimeFieldType15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime14", (mutableDateTime5.compareTo(mutableDateTime14) == 0) == mutableDateTime5.equals(mutableDateTime14));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test17");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test18");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.yearOfEra();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray21 = new int[] { (short) 0, 0, 'a', (byte) 23, 5 };
        int[] intArray23 = dateTimeField13.add(readablePartial14, 0, intArray21, 0);
        int int24 = remainderDateTimeField10.getMaximumValue(readablePartial11, intArray21);
        org.joda.time.DateTimeField dateTimeField25 = remainderDateTimeField10.getWrappedField();
        org.joda.time.ReadablePartial readablePartial26 = null;
        int[] intArray30 = new int[] { (-11), (short) 10, '4' };
        int int31 = remainderDateTimeField10.getMinimumValue(readablePartial26, intArray30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = gregorianChronology32.months();
        long long36 = durationField33.getMillis((int) (short) -1, 0L);
        long long39 = durationField33.subtract(0L, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType40 = durationField33.getType();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 0, chronology42);
        mutableDateTime43.setMonthOfYear(5);
        mutableDateTime43.setDayOfYear((int) (byte) 19);
        boolean boolean48 = mutableDateTime43.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone51 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime43.toMutableDateTime(dateTimeZone50);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int55 = mutableDateTime52.get(dateTimeFieldType54);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField56 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField33, dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime43 and mutableDateTime52", (mutableDateTime43.compareTo(mutableDateTime52) == 0) == mutableDateTime43.equals(mutableDateTime52));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test19");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone23 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone22);
        java.lang.String str26 = dateTimeZone22.getNameKey((long) 1970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test20");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology0.weekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 0, chronology6);
        mutableDateTime7.setMonthOfYear(5);
        mutableDateTime7.setDayOfYear((int) (byte) 19);
        boolean boolean12 = mutableDateTime7.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone15 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime7.toMutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int19 = mutableDateTime16.get(dateTimeFieldType18);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField23 = new org.joda.time.field.OffsetDateTimeField(dateTimeField4, dateTimeFieldType18, (int) (short) 10, 7740, 37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime16", (mutableDateTime7.compareTo(mutableDateTime16) == 0) == mutableDateTime7.equals(mutableDateTime16));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test21");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test22");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        long long14 = dateTimeZone9.adjustOffset((long) 57600000, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test23");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("DurationField[months]", "", 0, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        boolean boolean9 = cachedDateTimeZone7.isStandardOffset((-1L));
        long long11 = cachedDateTimeZone7.nextTransition((long) ' ');
        java.lang.String str13 = cachedDateTimeZone7.getNameKey(2524556129000L);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) cachedDateTimeZone7, (long) (-5));
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 0, chronology18);
        mutableDateTime19.setMonthOfYear(5);
        mutableDateTime19.setDayOfYear((int) (byte) 19);
        boolean boolean24 = mutableDateTime19.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone27 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime19.toMutableDateTime(dateTimeZone26);
        int int29 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) mutableDateTime28);
        long long31 = cachedDateTimeZone7.getMillisKeepLocal(dateTimeZone16, 1711992289673L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and mutableDateTime28", (mutableDateTime19.compareTo(mutableDateTime28) == 0) == mutableDateTime19.equals(mutableDateTime28));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test24");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        java.util.Locale locale13 = null;
        java.lang.String str14 = property12.getAsShortText(locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test25");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
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
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) mutableDateTime25);
        mutableDateTime25.addWeekyears(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test26");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) mutableDateTime0);
        java.lang.String str4 = mutableDateTime0.toString("1969");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 0, chronology6);
        mutableDateTime7.setMonthOfYear(5);
        mutableDateTime7.setDayOfYear((int) (byte) 19);
        boolean boolean12 = mutableDateTime7.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone15 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime7.toMutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.minuteOfDay();
        int int18 = mutableDateTime16.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfWeek();
        mutableDateTime16.setRounding(dateTimeField20, 5);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime16.add(readablePeriod23, 5);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime0.secondOfMinute();
        int int28 = property27.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime16", (mutableDateTime0.compareTo(mutableDateTime16) == 0) == mutableDateTime0.equals(mutableDateTime16));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test27");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = remainderDateTimeField10.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.millis();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str26 = dateTimeFieldType25.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField17, dateTimeFieldType25);
        org.joda.time.DurationField durationField30 = dividedDateTimeField29.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField32 = gregorianChronology31.months();
        long long35 = durationField32.getMillis((int) (short) -1, 0L);
        long long38 = durationField32.subtract(0L, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType39 = durationField32.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        org.joda.time.field.ScaledDurationField scaledDurationField43 = new org.joda.time.field.ScaledDurationField(durationField32, durationFieldType41, (int) (byte) 4);
        long long46 = scaledDurationField43.getMillis((int) (byte) 23, 0L);
        long long49 = scaledDurationField43.getMillis(10L, (long) (-292275054));
        long long52 = scaledDurationField43.add((long) 169, 0L);
        long long54 = scaledDurationField43.getMillis((int) (byte) 6);
        int int55 = scaledDurationField43.getScalar();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime((long) 0, chronology57);
        mutableDateTime58.setMonthOfYear(5);
        mutableDateTime58.setDayOfYear((int) (byte) 19);
        boolean boolean63 = mutableDateTime58.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone66 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone65);
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime58.toMutableDateTime(dateTimeZone65);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.era();
        int int69 = mutableDateTime67.get(dateTimeFieldType68);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField71 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField29, (org.joda.time.DurationField) scaledDurationField43, dateTimeFieldType68, 365);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime58 and mutableDateTime67", (mutableDateTime58.compareTo(mutableDateTime67) == 0) == mutableDateTime58.equals(mutableDateTime67));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test28");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = remainderDateTimeField10.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.millis();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str26 = dateTimeFieldType25.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField17, dateTimeFieldType25);
        long long32 = dividedDateTimeField29.add((long) (byte) -1, (long) 365);
        org.joda.time.chrono.GregorianChronology gregorianChronology33 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology33.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology33.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = gregorianChronology33.add(readablePeriod36, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology33.clockhourOfHalfday();
        org.joda.time.Chronology chronology42 = gregorianChronology33.withUTC();
        org.joda.time.DurationField durationField43 = gregorianChronology33.hours();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 0, chronology45);
        mutableDateTime46.setMonthOfYear(5);
        mutableDateTime46.setDayOfYear((int) (byte) 19);
        boolean boolean51 = mutableDateTime46.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone54 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone53);
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime46.toMutableDateTime(dateTimeZone53);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.yearOfEra();
        org.joda.time.ReadableDuration readableDuration57 = null;
        mutableDateTime55.add(readableDuration57);
        mutableDateTime55.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean63 = dateTimeFieldType61.isSupported((org.joda.time.Chronology) gregorianChronology62);
        int int64 = mutableDateTime55.get(dateTimeFieldType61);
        java.lang.Number number66 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException68 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType61, (java.lang.Number) (-1.0f), number66, (java.lang.Number) (-1.0f));
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.chrono.GregorianChronology gregorianChronology71 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = gregorianChronology71.seconds();
        boolean boolean73 = dateTimeFieldType61.isSupported((org.joda.time.Chronology) gregorianChronology71);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField74 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField29, durationField43, dateTimeFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField72", (durationField4.compareTo(durationField72) == 0) == durationField4.equals(durationField72));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test29");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone23 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) mutableDateTime2);
        org.joda.time.DurationField durationField26 = chronology25.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test30");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = gregorianChronology20.months();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology20.clockhourOfDay();
        org.joda.time.DateTime dateTime26 = mutableDateTime12.toDateTime((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 0, chronology29);
        mutableDateTime30.setMonthOfYear(5);
        mutableDateTime30.setDayOfYear((int) (byte) 19);
        boolean boolean35 = mutableDateTime30.isAfterNow();
        int int38 = dateTimeFormatter27.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime30, "monthOfYear", (int) (byte) 10);
        mutableDateTime30.addSeconds(10);
        int int41 = mutableDateTime30.getMillisOfDay();
        boolean boolean42 = dateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test31");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        int int12 = remainderDateTimeField10.getMaximumValue();
        long long14 = remainderDateTimeField10.roundHalfFloor((long) (byte) 10);
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray16 = null;
        int int17 = remainderDateTimeField10.getMinimumValue(readablePartial15, intArray16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0, chronology19);
        mutableDateTime20.setMonthOfYear(5);
        mutableDateTime20.setDayOfYear((int) (byte) 19);
        boolean boolean25 = mutableDateTime20.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone28 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime20.toMutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int32 = mutableDateTime29.get(dateTimeFieldType31);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField33 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime29", (mutableDateTime20.compareTo(mutableDateTime29) == 0) == mutableDateTime20.equals(mutableDateTime29));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test32");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = gregorianChronology20.months();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology20.clockhourOfDay();
        org.joda.time.DateTime dateTime26 = mutableDateTime12.toDateTime((org.joda.time.Chronology) gregorianChronology20);
        int int27 = mutableDateTime12.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime26", (mutableDateTime3.compareTo(dateTime26) == 0) == mutableDateTime3.equals(dateTime26));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test33");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime11.hourOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 0, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.secondOfDay();
        org.joda.time.Instant instant26 = mutableDateTime24.toInstant();
        int int27 = property21.compareTo((org.joda.time.ReadableInstant) instant26);
        int int28 = property21.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant26", (mutableDateTime24.compareTo(instant26) == 0) == mutableDateTime24.equals(instant26));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test34");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 0, chronology23);
        mutableDateTime24.setMonthOfYear(5);
        mutableDateTime24.setDayOfYear((int) (byte) 19);
        boolean boolean29 = mutableDateTime24.isAfterNow();
        int int32 = dateTimeFormatter21.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime24, "monthOfYear", (int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime24.add(durationFieldType33, (int) (byte) 0);
        org.joda.time.Instant instant36 = mutableDateTime24.toInstant();
        boolean boolean37 = mutableDateTime11.isBefore((org.joda.time.ReadableInstant) instant36);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant36", (mutableDateTime2.compareTo(instant36) == 0) == mutableDateTime2.equals(instant36));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test35");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = gregorianChronology20.months();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology20.clockhourOfDay();
        org.joda.time.DateTime dateTime26 = mutableDateTime12.toDateTime((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology27.era();
        org.joda.time.DurationField durationField31 = gregorianChronology27.seconds();
        org.joda.time.DurationField durationField32 = gregorianChronology27.millis();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology27.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str35 = dateTimeFieldType34.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField37 = new org.joda.time.field.RemainderDateTimeField(dateTimeField33, dateTimeFieldType34, (int) (short) 100);
        org.joda.time.DurationField durationField38 = remainderDateTimeField37.getRangeDurationField();
        org.joda.time.DurationField durationField39 = remainderDateTimeField37.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.yearOfEra();
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology40.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = gregorianChronology40.monthOfYear();
        org.joda.time.DurationField durationField44 = gregorianChronology40.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology45.era();
        org.joda.time.DurationField durationField49 = gregorianChronology45.seconds();
        org.joda.time.DurationField durationField50 = gregorianChronology45.millis();
        org.joda.time.DateTimeField dateTimeField51 = gregorianChronology45.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str53 = dateTimeFieldType52.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField55 = new org.joda.time.field.RemainderDateTimeField(dateTimeField51, dateTimeFieldType52, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField56 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField37, durationField44, dateTimeFieldType52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField57 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField56);
        long long59 = dividedDateTimeField56.remainder(0L);
        int int60 = dividedDateTimeField56.getDivisor();
        int int62 = dividedDateTimeField56.getMinimumValue(0L);
        long long64 = dividedDateTimeField56.roundFloor(105189840000L);
        int int65 = dateTime26.get((org.joda.time.DateTimeField) dividedDateTimeField56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test36");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withZone(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
        boolean boolean7 = mutableDateTime5.isBeforeNow();
        boolean boolean9 = mutableDateTime5.isBefore((long) (byte) 6);
        java.lang.String str10 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0, chronology12);
        mutableDateTime13.setMonthOfYear(5);
        mutableDateTime13.setDayOfYear((int) (byte) 19);
        boolean boolean18 = mutableDateTime13.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone21 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime13.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int25 = mutableDateTime22.get(dateTimeFieldType24);
        mutableDateTime5.set(dateTimeFieldType24, (int) (byte) 19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime22", (mutableDateTime13.compareTo(mutableDateTime22) == 0) == mutableDateTime13.equals(mutableDateTime22));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test37");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test38");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (byte) 13);
        int int10 = mutableDateTime2.getDayOfYear();
        int int11 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMonthOfYear((int) (byte) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone16.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone19 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone19);
        int int21 = mutableDateTime20.getCenturyOfEra();
        mutableDateTime20.addMonths(57601970);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Instant instant25 = mutableDateTime2.toInstant();
        int int26 = mutableDateTime2.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant25", (mutableDateTime20.compareTo(instant25) == 0) == mutableDateTime20.equals(instant25));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test39");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime11.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime11.toString(dateTimeFormatter22);
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.era();
        org.joda.time.DurationField durationField28 = gregorianChronology24.seconds();
        org.joda.time.DurationField durationField29 = gregorianChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology24.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime11.toMutableDateTime((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.DurationField durationField32 = gregorianChronology24.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime31", (mutableDateTime11.compareTo(mutableDateTime31) == 0) == mutableDateTime11.equals(mutableDateTime31));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test40");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        boolean boolean2 = mutableDateTime0.isBeforeNow();
        int int3 = mutableDateTime0.getRoundingMode();
        int int4 = mutableDateTime0.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0, chronology7);
        mutableDateTime8.setMonthOfYear(5);
        mutableDateTime8.setDayOfYear((int) (byte) 19);
        boolean boolean13 = mutableDateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(dateTimeZone15);
        int int18 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime17.add(readableDuration20, 2);
        int int23 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        int int24 = mutableDateTime0.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime17", (mutableDateTime8.compareTo(mutableDateTime17) == 0) == mutableDateTime8.equals(mutableDateTime17));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test41");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (byte) 13);
        int int10 = mutableDateTime2.getDayOfYear();
        int int11 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMonthOfYear((int) (byte) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone16.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone19 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone19);
        int int21 = mutableDateTime20.getCenturyOfEra();
        mutableDateTime20.addMonths(57601970);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Instant instant25 = mutableDateTime2.toInstant();
        int int26 = mutableDateTime2.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant25", (mutableDateTime20.compareTo(instant25) == 0) == mutableDateTime20.equals(instant25));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test42");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime11.hourOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 0, chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.secondOfDay();
        org.joda.time.Instant instant26 = mutableDateTime24.toInstant();
        int int27 = property21.compareTo((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property21.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant26", (mutableDateTime24.compareTo(instant26) == 0) == mutableDateTime24.equals(instant26));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test43");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        int int13 = mutableDateTime11.getDayOfMonth();
        int int14 = mutableDateTime11.getMinuteOfHour();
        java.lang.String str15 = mutableDateTime11.toString();
        org.joda.time.DateTime dateTime16 = mutableDateTime11.toDateTimeISO();
        mutableDateTime11.setSecondOfMinute(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime16", (mutableDateTime2.compareTo(dateTime16) == 0) == mutableDateTime2.equals(dateTime16));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test44");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        int int12 = mutableDateTime2.getWeekOfWeekyear();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 0, chronology14);
        mutableDateTime15.setMonthOfYear(5);
        mutableDateTime15.setDayOfYear((int) (byte) 19);
        boolean boolean20 = mutableDateTime15.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone23 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime15.toMutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.yearOfEra();
        org.joda.time.ReadableDuration readableDuration26 = null;
        mutableDateTime24.add(readableDuration26);
        mutableDateTime24.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean32 = dateTimeFieldType30.isSupported((org.joda.time.Chronology) gregorianChronology31);
        int int33 = mutableDateTime24.get(dateTimeFieldType30);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime24.hourOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0, chronology36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime37.secondOfDay();
        org.joda.time.Instant instant39 = mutableDateTime37.toInstant();
        int int40 = property34.compareTo((org.joda.time.ReadableInstant) instant39);
        boolean boolean41 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) instant39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime15", (mutableDateTime11.compareTo(mutableDateTime15) == 0) == mutableDateTime11.equals(mutableDateTime15));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test45");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = mutableDateTime0.getZone();
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 0, chronology5);
        mutableDateTime6.setMonthOfYear(5);
        mutableDateTime6.setDayOfYear((int) (byte) 19);
        boolean boolean11 = mutableDateTime6.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone14 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime6.toMutableDateTime(dateTimeZone13);
        int int16 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) mutableDateTime15);
        int int17 = mutableDateTime15.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime15.add(readableDuration18, 2);
        boolean boolean22 = mutableDateTime15.isEqual((-62071747199903L));
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = gregorianChronology23.months();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology23.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = mutableDateTime15.toDateTime((org.joda.time.Chronology) gregorianChronology23);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime2.toMutableDateTime((org.joda.time.Chronology) gregorianChronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime15", (mutableDateTime6.compareTo(mutableDateTime15) == 0) == mutableDateTime6.equals(mutableDateTime15));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test46");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        boolean boolean2 = mutableDateTime0.isBeforeNow();
        int int3 = mutableDateTime0.getRoundingMode();
        int int4 = mutableDateTime0.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0, chronology7);
        mutableDateTime8.setMonthOfYear(5);
        mutableDateTime8.setDayOfYear((int) (byte) 19);
        boolean boolean13 = mutableDateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(dateTimeZone15);
        int int18 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime17.add(readableDuration20, 2);
        int int23 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        mutableDateTime0.addDays(960);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime17", (mutableDateTime8.compareTo(mutableDateTime17) == 0) == mutableDateTime8.equals(mutableDateTime17));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test47");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        java.util.GregorianCalendar gregorianCalendar1 = mutableDateTime0.toGregorianCalendar();
        boolean boolean2 = mutableDateTime0.isBeforeNow();
        int int3 = mutableDateTime0.getRoundingMode();
        int int4 = mutableDateTime0.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 0, chronology7);
        mutableDateTime8.setMonthOfYear(5);
        mutableDateTime8.setDayOfYear((int) (byte) 19);
        boolean boolean13 = mutableDateTime8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime8.toMutableDateTime(dateTimeZone15);
        int int18 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) mutableDateTime17);
        int int19 = mutableDateTime17.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime17.add(readableDuration20, 2);
        int int23 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        int int24 = mutableDateTime0.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime17", (mutableDateTime8.compareTo(mutableDateTime17) == 0) == mutableDateTime8.equals(mutableDateTime17));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test48");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.Instant instant13 = mutableDateTime11.toInstant();
        mutableDateTime11.setMillis(132L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test49");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField4 = iSOChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime9.add(readableDuration10, 10);
        int int13 = mutableDateTime9.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.hourOfDay();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getMonthOfYear();
        boolean boolean18 = interval15.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.Interval interval19 = interval15.toInterval();
        org.joda.time.Interval interval20 = interval15.toInterval();
        org.joda.time.DateTime dateTime21 = interval15.getStart();
        boolean boolean23 = interval15.equals((java.lang.Object) (-62166787186995L));
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = interval15.overlaps(readableInterval24);
        org.joda.time.Interval interval26 = interval15.toInterval();
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology) iSOChronology27);
        org.joda.time.Chronology chronology31 = iSOChronology27.withUTC();
        org.joda.time.Chronology chronology32 = iSOChronology27.withUTC();
        boolean boolean33 = interval26.equals((java.lang.Object) iSOChronology27);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean36 = dateTimeFieldType34.isSupported((org.joda.time.Chronology) gregorianChronology35);
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology37.era();
        org.joda.time.DurationField durationField41 = gregorianChronology37.seconds();
        org.joda.time.DurationField durationField42 = gregorianChronology37.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter43.withZone(dateTimeZone46);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone48 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone46);
        org.joda.time.Chronology chronology49 = gregorianChronology37.withZone(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration51 = null;
        mutableDateTime50.add(readableDuration51, 10);
        int int54 = mutableDateTime50.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime50.hourOfDay();
        org.joda.time.Interval interval56 = property55.toInterval();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime();
        int int58 = mutableDateTime57.getMonthOfYear();
        boolean boolean59 = interval56.isAfter((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.Interval interval60 = interval56.toInterval();
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = interval56.toPeriod(periodType61);
        org.joda.time.Period period63 = period62.toPeriod();
        long long66 = gregorianChronology37.add((org.joda.time.ReadablePeriod) period62, (long) 20, (int) ' ');
        org.joda.time.Period period67 = period62.toPeriod();
        int[] intArray69 = gregorianChronology35.get((org.joda.time.ReadablePeriod) period67, (long) 86399);
        int[] intArray71 = iSOChronology27.get((org.joda.time.ReadablePeriod) period67, (long) (-28800000));
        long long74 = iSOChronology0.add((org.joda.time.ReadablePeriod) period67, (long) 1969, 57600000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField42", (durationField8.compareTo(durationField42) == 0) == durationField8.equals(durationField42));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test50");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = remainderDateTimeField10.getMaximumValue(readablePartial12);
        long long15 = remainderDateTimeField10.roundHalfCeiling(0L);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology16.eras();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0, chronology21);
        mutableDateTime22.setMonthOfYear(5);
        mutableDateTime22.setDayOfYear((int) (byte) 19);
        boolean boolean27 = mutableDateTime22.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone30 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime22.toMutableDateTime(dateTimeZone29);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.yearOfEra();
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime31.add(readableDuration33);
        mutableDateTime31.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean39 = dateTimeFieldType37.isSupported((org.joda.time.Chronology) gregorianChronology38);
        int int40 = mutableDateTime31.get(dateTimeFieldType37);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField10, durationField19, dateTimeFieldType37, 960);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField4, and durationField5", !(durationField19.compareTo(durationField4) == 0) || (Math.signum(durationField19.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test51");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        int int13 = mutableDateTime11.get(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime11.secondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 0, chronology16);
        mutableDateTime17.setMonthOfYear(5);
        mutableDateTime17.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException24 = new org.joda.time.IllegalFieldValueException(durationFieldType22, "");
        java.lang.Throwable[] throwableArray25 = illegalFieldValueException24.getSuppressed();
        boolean boolean26 = mutableDateTime17.equals((java.lang.Object) illegalFieldValueException24);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime17.dayOfYear();
        org.joda.time.DateTime dateTime28 = mutableDateTime17.toDateTimeISO();
        mutableDateTime17.setSecondOfMinute(0);
        int int31 = property14.getDifference((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test52");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        int int13 = mutableDateTime11.getDayOfMonth();
        int int14 = mutableDateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone17 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone16);
        boolean boolean19 = cachedDateTimeZone17.isStandardOffset((-1L));
        long long21 = cachedDateTimeZone17.nextTransition((long) ' ');
        java.lang.String str23 = cachedDateTimeZone17.getNameKey(2524556129000L);
        java.lang.String str25 = cachedDateTimeZone17.getName((long) 57600000);
        mutableDateTime11.setZoneRetainFields((org.joda.time.DateTimeZone) cachedDateTimeZone17);
        java.lang.String str28 = cachedDateTimeZone17.getNameKey((-62071747199903L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test53");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(368151679002L, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test54");
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
        org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime12.add(readableDuration13, 10);
        int int16 = mutableDateTime12.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime12.hourOfDay();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime();
        int int20 = mutableDateTime19.getMonthOfYear();
        boolean boolean21 = interval18.isAfter((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Interval interval22 = interval18.toInterval();
        org.joda.time.Interval interval23 = interval18.toInterval();
        long long24 = interval18.getEndMillis();
        org.joda.time.DateTime dateTime25 = interval18.getEnd();
        boolean boolean26 = interval10.isAfter((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28, 10);
        int int31 = mutableDateTime27.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime34.add(readableDuration35, 10);
        int int38 = mutableDateTime34.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime34.hourOfDay();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime();
        int int42 = mutableDateTime41.getMonthOfYear();
        boolean boolean43 = interval40.isAfter((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.Interval interval44 = interval40.toInterval();
        org.joda.time.Interval interval45 = interval40.toInterval();
        boolean boolean46 = interval33.isBefore((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 0, chronology48);
        mutableDateTime49.setMonthOfYear(5);
        mutableDateTime49.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        mutableDateTime49.add(readablePeriod54, (int) (byte) 13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        java.lang.String str58 = mutableDateTime49.toString(dateTimeFormatter57);
        mutableDateTime49.setMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone63 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        long long66 = dateTimeZone64.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone67 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = new org.joda.time.MutableDateTime((long) 0, chronology70);
        mutableDateTime71.setMonthOfYear(5);
        mutableDateTime71.setDayOfYear((int) (byte) 19);
        boolean boolean76 = mutableDateTime71.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone79 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone78);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime71.toMutableDateTime(dateTimeZone78);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime80.minuteOfDay();
        mutableDateTime80.addYears((int) (byte) 23);
        mutableDateTime80.setSecondOfDay((int) (byte) 15);
        java.lang.String str86 = dateTimeFormatter68.print((org.joda.time.ReadableInstant) mutableDateTime80);
        boolean boolean87 = cachedDateTimeZone67.equals((java.lang.Object) dateTimeFormatter68);
        long long89 = dateTimeZone62.getMillisKeepLocal((org.joda.time.DateTimeZone) cachedDateTimeZone67, 1279002L);
        org.joda.time.MutableDateTime mutableDateTime90 = mutableDateTime49.toMutableDateTime(dateTimeZone62);
        boolean boolean92 = mutableDateTime90.equals((java.lang.Object) "DurationField[years]");
        boolean boolean93 = interval33.isBefore((org.joda.time.ReadableInstant) mutableDateTime90);
        boolean boolean94 = interval18.isAfter((org.joda.time.ReadableInterval) interval33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime49 and mutableDateTime90", (mutableDateTime49.compareTo(mutableDateTime90) == 0) == mutableDateTime49.equals(mutableDateTime90));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test55");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (byte) 13);
        int int10 = mutableDateTime2.getDayOfYear();
        int int11 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.addMillis((int) (byte) 2);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime2.weekyear();
        int int15 = mutableDateTime2.getYearOfEra();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 0, chronology17);
        mutableDateTime18.setMonthOfYear(5);
        mutableDateTime18.setDayOfYear((int) (byte) 19);
        boolean boolean23 = mutableDateTime18.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone26 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime18.toMutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.minuteOfDay();
        int int29 = mutableDateTime27.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfWeek();
        mutableDateTime27.setRounding(dateTimeField31, 5);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology34.era();
        org.joda.time.DurationField durationField38 = gregorianChronology34.seconds();
        org.joda.time.DurationField durationField39 = gregorianChronology34.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter40.withZone(dateTimeZone43);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone45 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone43);
        org.joda.time.Chronology chronology46 = gregorianChronology34.withZone(dateTimeZone43);
        boolean boolean48 = dateTimeZone43.isStandardOffset((long) 4);
        org.joda.time.DateTime dateTime49 = mutableDateTime27.toDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime2.toMutableDateTime(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and dateTime49", (mutableDateTime27.compareTo(dateTime49) == 0) == mutableDateTime27.equals(dateTime49));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test56");
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
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone23 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTime(dateTimeZone22);
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology25.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology25.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = gregorianChronology25.add(readablePeriod28, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology25.clockhourOfHalfday();
        org.joda.time.Chronology chronology34 = gregorianChronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology25.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology25.weekyear();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime24.toMutableDateTime((org.joda.time.Chronology) gregorianChronology25);
        mutableDateTime37.addYears(365);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test57");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.secondOfDay();
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.hourOfDay();
        int int25 = property24.getMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test58");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = gregorianChronology20.months();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology20.clockhourOfDay();
        org.joda.time.DateTime dateTime26 = mutableDateTime12.toDateTime((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology27.monthOfYear();
        org.joda.time.DurationField durationField31 = gregorianChronology27.months();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology27.yearOfCentury();
        mutableDateTime12.setChronology((org.joda.time.Chronology) gregorianChronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime26", (mutableDateTime3.compareTo(dateTime26) == 0) == mutableDateTime3.equals(dateTime26));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test59");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime2.add(readablePeriod7, (int) (byte) 13);
        int int10 = mutableDateTime2.getDayOfYear();
        int int11 = mutableDateTime2.getYearOfCentury();
        mutableDateTime2.setMonthOfYear((int) (byte) 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime2.property(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone16.previousTransition(0L);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone19 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone19);
        int int21 = mutableDateTime20.getCenturyOfEra();
        mutableDateTime20.addMonths(57601970);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Instant instant25 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime2.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant25", (mutableDateTime20.compareTo(instant25) == 0) == mutableDateTime20.equals(instant25));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test60");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DurationField durationField19 = gregorianChronology14.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test61");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) "0", (java.lang.Object) dateTimeFormatter1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0, chronology4);
        mutableDateTime5.setMonthOfYear(5);
        long long8 = mutableDateTime5.getMillis();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 0, chronology10);
        mutableDateTime11.setMonthOfYear(5);
        mutableDateTime11.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException18 = new org.joda.time.IllegalFieldValueException(durationFieldType16, "");
        java.lang.Throwable[] throwableArray19 = illegalFieldValueException18.getSuppressed();
        boolean boolean20 = mutableDateTime11.equals((java.lang.Object) illegalFieldValueException18);
        mutableDateTime11.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration23 = null;
        mutableDateTime11.add(readableDuration23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime11.add(readablePeriod25, 0);
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone31 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone30);
        java.lang.String str33 = cachedDateTimeZone31.getNameKey((long) (byte) 23);
        java.util.Locale locale35 = null;
        java.lang.String str36 = cachedDateTimeZone31.getName((-1L), locale35);
        org.joda.time.DateTime dateTime37 = mutableDateTime11.toDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone31);
        int int40 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime11, "52", (-320));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime37", (mutableDateTime5.compareTo(dateTime37) == 0) == mutableDateTime5.equals(dateTime37));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test62");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = remainderDateTimeField10.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.millis();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str26 = dateTimeFieldType25.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField17, dateTimeFieldType25);
        org.joda.time.DurationField durationField30 = dividedDateTimeField29.getRangeDurationField();
        long long33 = dividedDateTimeField29.getDifferenceAsLong((long) (short) 0, (long) 86399);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dividedDateTimeField29.getType();
        long long36 = dividedDateTimeField29.roundFloor(0L);
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology37.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = gregorianChronology37.add(readablePeriod40, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology37.yearOfCentury();
        org.joda.time.DurationField durationField45 = gregorianChronology37.weekyears();
        org.joda.time.DurationField durationField46 = gregorianChronology37.years();
        long long49 = durationField46.add(100L, (long) 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder50.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder50.appendTimeZoneName(strMap52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 0, chronology56);
        mutableDateTime57.setMonthOfYear(5);
        mutableDateTime57.setDayOfYear((int) (byte) 19);
        boolean boolean62 = mutableDateTime57.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone65 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime57.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.yearOfEra();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68);
        mutableDateTime66.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology73 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean74 = dateTimeFieldType72.isSupported((org.joda.time.Chronology) gregorianChronology73);
        int int75 = mutableDateTime66.get(dateTimeFieldType72);
        java.lang.Number number77 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException79 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType72, (java.lang.Number) (-1.0f), number77, (java.lang.Number) (-1.0f));
        org.joda.time.IllegalFieldValueException illegalFieldValueException83 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType72, (java.lang.Number) (-62166787199995L), (java.lang.Number) 950400000L, (java.lang.Number) 2524556129000L);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder54.appendShortText(dateTimeFieldType72);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField86 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField29, durationField46, dateTimeFieldType72, 4);
        org.joda.time.ReadablePartial readablePartial87 = null;
        int[] intArray88 = null;
        int int89 = dividedDateTimeField29.getMaximumValue(readablePartial87, intArray88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField46", (durationField45.compareTo(durationField46) == 0) == durationField45.equals(durationField46));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test63");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = remainderDateTimeField10.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.millis();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str26 = dateTimeFieldType25.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField17, dateTimeFieldType25);
        org.joda.time.DurationField durationField30 = dividedDateTimeField29.getRangeDurationField();
        long long33 = dividedDateTimeField29.getDifferenceAsLong((long) (short) 0, (long) 86399);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dividedDateTimeField29.getType();
        long long36 = dividedDateTimeField29.roundFloor(0L);
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology37.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology37.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = gregorianChronology37.add(readablePeriod40, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology37.yearOfCentury();
        org.joda.time.DurationField durationField45 = gregorianChronology37.weekyears();
        org.joda.time.DurationField durationField46 = gregorianChronology37.years();
        long long49 = durationField46.add(100L, (long) 4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder50.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder50.appendTimeZoneName(strMap52);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) 0, chronology56);
        mutableDateTime57.setMonthOfYear(5);
        mutableDateTime57.setDayOfYear((int) (byte) 19);
        boolean boolean62 = mutableDateTime57.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone65 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone64);
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime57.toMutableDateTime(dateTimeZone64);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.yearOfEra();
        org.joda.time.ReadableDuration readableDuration68 = null;
        mutableDateTime66.add(readableDuration68);
        mutableDateTime66.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology73 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean74 = dateTimeFieldType72.isSupported((org.joda.time.Chronology) gregorianChronology73);
        int int75 = mutableDateTime66.get(dateTimeFieldType72);
        java.lang.Number number77 = null;
        org.joda.time.IllegalFieldValueException illegalFieldValueException79 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType72, (java.lang.Number) (-1.0f), number77, (java.lang.Number) (-1.0f));
        org.joda.time.IllegalFieldValueException illegalFieldValueException83 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType72, (java.lang.Number) (-62166787199995L), (java.lang.Number) 950400000L, (java.lang.Number) 2524556129000L);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder54.appendShortText(dateTimeFieldType72);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField86 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField29, durationField46, dateTimeFieldType72, 4);
        java.lang.String str87 = dateTimeFieldType72.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField46", (durationField45.compareTo(durationField46) == 0) == durationField45.equals(durationField46));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test64");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13);
        mutableDateTime11.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean19 = dateTimeFieldType17.isSupported((org.joda.time.Chronology) gregorianChronology18);
        int int20 = mutableDateTime11.get(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime11.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = mutableDateTime11.toString(dateTimeFormatter22);
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.era();
        org.joda.time.DurationField durationField28 = gregorianChronology24.seconds();
        org.joda.time.DurationField durationField29 = gregorianChronology24.centuries();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology24.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime11.toMutableDateTime((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration33 = null;
        mutableDateTime32.add(readableDuration33, 10);
        int int36 = mutableDateTime32.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime32.hourOfDay();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        int int40 = mutableDateTime39.getMonthOfYear();
        boolean boolean41 = interval38.isAfter((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.Interval interval42 = interval38.toInterval();
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = interval38.toPeriod(periodType43);
        org.joda.time.Period period45 = period44.toPeriod();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) 0, chronology47);
        mutableDateTime48.setMonthOfYear(5);
        java.lang.Object obj51 = null;
        boolean boolean52 = mutableDateTime48.equals(obj51);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.HOURS_TYPE;
        mutableDateTime48.add(durationFieldType53, (int) (short) 10);
        org.joda.time.field.PreciseDurationField preciseDurationField57 = new org.joda.time.field.PreciseDurationField(durationFieldType53, (long) (short) 0);
        int int58 = period45.get(durationFieldType53);
        mutableDateTime11.add(durationFieldType53, 0);
        java.lang.String str61 = durationFieldType53.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime31", (mutableDateTime11.compareTo(mutableDateTime31) == 0) == mutableDateTime11.equals(mutableDateTime31));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test65");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        java.lang.String str13 = property12.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test66");
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
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime12.add(readablePeriod22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 0, chronology25);
        mutableDateTime26.setMonthOfYear(5);
        mutableDateTime26.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException33 = new org.joda.time.IllegalFieldValueException(durationFieldType31, "");
        java.lang.Throwable[] throwableArray34 = illegalFieldValueException33.getSuppressed();
        boolean boolean35 = mutableDateTime26.equals((java.lang.Object) illegalFieldValueException33);
        mutableDateTime26.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology38.yearOfEra();
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology38.monthOfYear();
        org.joda.time.DateTime dateTime42 = mutableDateTime26.toDateTime((org.joda.time.Chronology) gregorianChronology38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 0, chronology44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.secondOfDay();
        boolean boolean47 = mutableDateTime26.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        boolean boolean48 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        int int49 = mutableDateTime12.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and dateTime42", (mutableDateTime26.compareTo(dateTime42) == 0) == mutableDateTime26.equals(dateTime42));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test67");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType7, "");
        java.lang.Throwable[] throwableArray10 = illegalFieldValueException9.getSuppressed();
        boolean boolean11 = mutableDateTime2.equals((java.lang.Object) illegalFieldValueException9);
        mutableDateTime2.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology14.monthOfYear();
        org.joda.time.DateTime dateTime18 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 0, chronology20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.secondOfDay();
        boolean boolean23 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.hourOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 0, chronology26);
        mutableDateTime27.setMonthOfYear(5);
        mutableDateTime27.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException34 = new org.joda.time.IllegalFieldValueException(durationFieldType32, "");
        java.lang.Throwable[] throwableArray35 = illegalFieldValueException34.getSuppressed();
        boolean boolean36 = mutableDateTime27.equals((java.lang.Object) illegalFieldValueException34);
        mutableDateTime27.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime27.add(readableDuration39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime27.add(readablePeriod41, 0);
        mutableDateTime27.setYear((-28800000));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone48 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime27.toMutableDateTime(dateTimeZone47);
        mutableDateTime27.addYears(0);
        org.joda.time.MutableDateTime mutableDateTime52 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration53 = null;
        mutableDateTime52.add(readableDuration53, 10);
        int int56 = mutableDateTime52.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime52.hourOfDay();
        org.joda.time.Interval interval58 = property57.toInterval();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime();
        int int60 = mutableDateTime59.getMonthOfYear();
        boolean boolean61 = interval58.isAfter((org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.Interval interval62 = interval58.toInterval();
        org.joda.time.ReadableInterval readableInterval63 = null;
        boolean boolean64 = interval58.contains(readableInterval63);
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone66 = mutableDateTime65.getZone();
        boolean boolean67 = interval58.isAfter((org.joda.time.ReadableInstant) mutableDateTime65);
        boolean boolean68 = mutableDateTime27.isBefore((org.joda.time.ReadableInstant) mutableDateTime65);
        int int69 = property24.getDifference((org.joda.time.ReadableInstant) mutableDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test68");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        int int13 = mutableDateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime11.getZone();
        long long18 = dateTimeZone14.convertLocalToUTC(0L, false, 126230400100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test69");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField10 = new org.joda.time.field.RemainderDateTimeField(dateTimeField6, dateTimeFieldType7, (int) (short) 100);
        org.joda.time.DurationField durationField11 = remainderDateTimeField10.getRangeDurationField();
        org.joda.time.DurationField durationField12 = remainderDateTimeField10.getDurationField();
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology13.monthOfYear();
        org.joda.time.DurationField durationField17 = gregorianChronology13.months();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology18.era();
        org.joda.time.DurationField durationField22 = gregorianChronology18.seconds();
        org.joda.time.DurationField durationField23 = gregorianChronology18.millis();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str26 = dateTimeFieldType25.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dateTimeField24, dateTimeFieldType25, (int) (short) 100);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField29 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField10, durationField17, dateTimeFieldType25);
        int int30 = dividedDateTimeField29.getMinimumValue();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 0, chronology32);
        mutableDateTime33.setMonthOfYear(5);
        mutableDateTime33.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException40 = new org.joda.time.IllegalFieldValueException(durationFieldType38, "");
        java.lang.Throwable[] throwableArray41 = illegalFieldValueException40.getSuppressed();
        boolean boolean42 = mutableDateTime33.equals((java.lang.Object) illegalFieldValueException40);
        mutableDateTime33.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = gregorianChronology45.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = gregorianChronology45.monthOfYear();
        org.joda.time.DateTime dateTime49 = mutableDateTime33.toDateTime((org.joda.time.Chronology) gregorianChronology45);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 0, chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.secondOfDay();
        boolean boolean54 = mutableDateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime52);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime33.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int57 = mutableDateTime33.get(dateTimeFieldType56);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField59 = new org.joda.time.field.RemainderDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField29, dateTimeFieldType56, 998);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and dateTime49", (mutableDateTime33.compareTo(dateTime49) == 0) == mutableDateTime33.equals(dateTime49));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test70");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = gregorianChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology0.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 10);
        int int10 = mutableDateTime6.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.hourOfDay();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        int int14 = mutableDateTime13.getMonthOfYear();
        boolean boolean15 = interval12.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.Interval interval16 = interval12.toInterval();
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = interval12.toPeriod(periodType17);
        long long21 = gregorianChronology0.add((org.joda.time.ReadablePeriod) period18, 84153600000L, (int) '#');
        int int22 = period18.size();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.DecoratedDurationField decoratedDurationField30 = new org.joda.time.field.DecoratedDurationField(durationField28, durationFieldType29);
        boolean boolean31 = period18.isSupported(durationFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField28 and decoratedDurationField30", (durationField28.compareTo(decoratedDurationField30) == 0) == durationField28.equals(decoratedDurationField30));
    }
}

