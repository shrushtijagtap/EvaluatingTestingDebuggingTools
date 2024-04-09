package org.joda.time;

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
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        mutableDateTime21.setMillis((-1L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        mutableDateTime21.setMillis((long) (byte) 6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21, (org.joda.time.Chronology) gregorianChronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        int int26 = remainderDateTimeField10.getMinimumValue();
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology27.era();
        org.joda.time.DurationField durationField31 = gregorianChronology27.seconds();
        org.joda.time.DurationField durationField32 = gregorianChronology27.centuries();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology27.dayOfMonth();
        org.joda.time.DurationField durationField34 = gregorianChronology27.years();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0, chronology36);
        mutableDateTime37.setMonthOfYear(5);
        mutableDateTime37.setDayOfYear((int) (byte) 19);
        boolean boolean42 = mutableDateTime37.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone45 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime37.toMutableDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.yearOfEra();
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime46.add(readableDuration48);
        mutableDateTime46.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean54 = dateTimeFieldType52.isSupported((org.joda.time.Chronology) gregorianChronology53);
        int int55 = mutableDateTime46.get(dateTimeFieldType52);
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType52.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField58 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField10, durationField34, dateTimeFieldType52, 162);
        int int59 = dividedDateTimeField58.getDivisor();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((long) 0, chronology61);
        mutableDateTime62.setMonthOfYear(5);
        mutableDateTime62.setDayOfYear((int) (byte) 19);
        boolean boolean67 = mutableDateTime62.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone70 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = mutableDateTime62.toMutableDateTime(dateTimeZone69);
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int74 = mutableDateTime71.get(dateTimeFieldType73);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField75 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField58, dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and mutableDateTime71", (mutableDateTime37.compareTo(mutableDateTime71) == 0) == mutableDateTime37.equals(mutableDateTime71));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology21.months();
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DurationField durationField27 = gregorianChronology21.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime26", (mutableDateTime2.compareTo(dateTime26) == 0) == mutableDateTime2.equals(dateTime26));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology21.months();
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology21.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime26", (mutableDateTime2.compareTo(dateTime26) == 0) == mutableDateTime2.equals(dateTime26));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology14.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        mutableDateTime21.setMinuteOfDay((int) (byte) 15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int14 = mutableDateTime11.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = null;
        boolean boolean16 = dateTimeFieldType13.isSupported(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        mutableDateTime12.setDayOfWeek(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        int int24 = mutableDateTime21.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        mutableDateTime21.setWeekyear(161);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime12.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "monthOfYear", (int) (byte) 10);
        mutableDateTime3.addMonths((-28800000));
        org.joda.time.ReadableDuration readableDuration14 = null;
        mutableDateTime3.add(readableDuration14, 20);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology17.yearOfCentury();
        java.lang.String str19 = iSOChronology17.toString();
        org.joda.time.Chronology chronology20 = iSOChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime3.toMutableDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime22", (mutableDateTime3.compareTo(mutableDateTime22) == 0) == mutableDateTime3.equals(mutableDateTime22));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        org.joda.time.DateTime dateTime28 = mutableDateTime25.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        int int5 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.era();
        org.joda.time.DurationField durationField10 = gregorianChronology6.seconds();
        org.joda.time.DateTime dateTime11 = mutableDateTime4.toDateTime((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology12.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = gregorianChronology12.add(readablePeriod15, (long) (short) 100, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology12.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField19.getType();
        boolean boolean21 = dateTimeField19.isSupported();
        boolean boolean22 = mutableDateTime4.equals((java.lang.Object) dateTimeField19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime11", (mutableDateTime4.compareTo(dateTime11) == 0) == mutableDateTime4.equals(dateTime11));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        org.joda.time.Instant instant18 = mutableDateTime12.toInstant();
        int int19 = mutableDateTime12.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant18", (mutableDateTime3.compareTo(instant18) == 0) == mutableDateTime3.equals(instant18));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology21.monthOfYear();
        org.joda.time.DurationField durationField25 = gregorianChronology21.months();
        org.joda.time.DateTime dateTime26 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology21);
        org.joda.time.DurationField durationField27 = gregorianChronology21.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime26", (mutableDateTime2.compareTo(dateTime26) == 0) == mutableDateTime2.equals(dateTime26));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
        int int26 = remainderDateTimeField10.getMinimumValue();
        org.joda.time.chrono.GregorianChronology gregorianChronology27 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology27.yearOfEra();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology27.era();
        org.joda.time.DurationField durationField31 = gregorianChronology27.seconds();
        org.joda.time.DurationField durationField32 = gregorianChronology27.centuries();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology27.dayOfMonth();
        org.joda.time.DurationField durationField34 = gregorianChronology27.years();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime((long) 0, chronology36);
        mutableDateTime37.setMonthOfYear(5);
        mutableDateTime37.setDayOfYear((int) (byte) 19);
        boolean boolean42 = mutableDateTime37.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone45 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime37.toMutableDateTime(dateTimeZone44);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime46.yearOfEra();
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime46.add(readableDuration48);
        mutableDateTime46.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology53 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean54 = dateTimeFieldType52.isSupported((org.joda.time.Chronology) gregorianChronology53);
        int int55 = mutableDateTime46.get(dateTimeFieldType52);
        org.joda.time.DurationFieldType durationFieldType56 = dateTimeFieldType52.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField58 = new org.joda.time.field.DividedDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField10, durationField34, dateTimeFieldType52, 162);
        int int59 = dividedDateTimeField58.getMaximumValue();
        long long61 = dividedDateTimeField58.remainder((long) 1970);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime((long) 0, chronology63);
        mutableDateTime64.setMonthOfYear(5);
        mutableDateTime64.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException71 = new org.joda.time.IllegalFieldValueException(durationFieldType69, "");
        java.lang.Throwable[] throwableArray72 = illegalFieldValueException71.getSuppressed();
        boolean boolean73 = mutableDateTime64.equals((java.lang.Object) illegalFieldValueException71);
        mutableDateTime64.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration76 = null;
        mutableDateTime64.add(readableDuration76);
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        mutableDateTime64.add(readablePeriod78, 0);
        mutableDateTime64.setYear((-28800000));
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone85 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone84);
        org.joda.time.MutableDateTime mutableDateTime86 = mutableDateTime64.toMutableDateTime(dateTimeZone84);
        mutableDateTime64.addMonths(0);
        mutableDateTime64.addMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean92 = mutableDateTime64.isSupported(dateTimeFieldType91);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField93 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField58, dateTimeFieldType91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime64 and mutableDateTime86", (mutableDateTime64.compareTo(mutableDateTime86) == 0) == mutableDateTime64.equals(mutableDateTime86));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2, (int) (byte) 9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter32.withZone(dateTimeZone35);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone37 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone35);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone35.getName(0L, locale39);
        java.lang.Object obj41 = dateTimeZone35.writeReplace();
        mutableDateTime12.setZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        int int5 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology6.era();
        org.joda.time.DurationField durationField10 = gregorianChronology6.seconds();
        org.joda.time.DateTime dateTime11 = mutableDateTime4.toDateTime((org.joda.time.Chronology) gregorianChronology6);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology6.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime11", (mutableDateTime2.compareTo(dateTime11) == 0) == mutableDateTime2.equals(dateTime11));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        int int32 = mutableDateTime21.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(5);
        java.lang.Object obj28 = dateTimeZone27.writeReplace();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(dateTimeZone27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getName((long) 35005, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.era();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.Instant instant4 = mutableDateTime2.toInstant();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = gregorianChronology5.months();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.millisOfSecond();
        int int11 = mutableDateTime2.get(dateTimeField10);
        org.joda.time.DurationField durationField12 = dateTimeField10.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant4", (mutableDateTime2.compareTo(instant4) == 0) == mutableDateTime2.equals(instant4));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.months();
        long long4 = durationField1.getMillis((int) (short) -1, 0L);
        long long7 = durationField1.subtract(0L, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType8 = durationField1.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        org.joda.time.field.ScaledDurationField scaledDurationField12 = new org.joda.time.field.ScaledDurationField(durationField1, durationFieldType10, (int) (byte) 4);
        int int14 = scaledDurationField12.getValue(1712408494885L);
        long long17 = scaledDurationField12.add((long) 1970, 162);
        long long20 = scaledDurationField12.add((long) 365, (long) (-11));
        long long23 = scaledDurationField12.add((long) (-11), 20);
        long long26 = scaledDurationField12.getMillis(0, (-62166787199995L));
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
        org.joda.time.DurationField durationField39 = remainderDateTimeField37.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.HALFDAYS_TYPE;
        org.joda.time.field.ScaledDurationField scaledDurationField42 = new org.joda.time.field.ScaledDurationField(durationField39, durationFieldType40, (int) (byte) 6);
        org.joda.time.DurationField durationField43 = scaledDurationField42.getWrappedField();
        int int44 = scaledDurationField12.compareTo((org.joda.time.DurationField) scaledDurationField42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 0, chronology46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.secondOfDay();
        org.joda.time.Instant instant49 = mutableDateTime47.toInstant();
        boolean boolean50 = scaledDurationField12.equals((java.lang.Object) mutableDateTime47);
        long long52 = scaledDurationField12.getValueAsLong(863999680L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime47 and instant49", (mutableDateTime47.compareTo(instant49) == 0) == mutableDateTime47.equals(instant49));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime24.copy();
        mutableDateTime25.addMinutes((-98));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        int int32 = mutableDateTime21.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
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
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType12.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.yearOfEra();
        mutableDateTime11.addDays(0);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
        int int28 = mutableDateTime25.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime11.dayOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 0, chronology21);
        mutableDateTime22.setMonthOfYear(5);
        mutableDateTime22.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException29 = new org.joda.time.IllegalFieldValueException(durationFieldType27, "");
        java.lang.Throwable[] throwableArray30 = illegalFieldValueException29.getSuppressed();
        boolean boolean31 = mutableDateTime22.equals((java.lang.Object) illegalFieldValueException29);
        mutableDateTime22.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology34.monthOfYear();
        org.joda.time.DateTime dateTime38 = mutableDateTime22.toDateTime((org.joda.time.Chronology) gregorianChronology34);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 0, chronology40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.secondOfDay();
        boolean boolean43 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime22.era();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now();
        boolean boolean46 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) mutableDateTime45);
        long long47 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and dateTime38", (mutableDateTime22.compareTo(dateTime38) == 0) == mutableDateTime22.equals(dateTime38));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "monthOfYear", (int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime3.add(durationFieldType12, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gregorianChronology16.months();
        boolean boolean18 = dateTimeZone15.equals((java.lang.Object) gregorianChronology16);
        org.joda.time.DurationField durationField19 = durationFieldType12.getField((org.joda.time.Chronology) gregorianChronology16);
        org.joda.time.DurationField durationField20 = gregorianChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology16.weekyear();
        org.joda.time.DurationField durationField22 = gregorianChronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField17, and durationField19", !(durationField22.compareTo(durationField17) == 0) || (Math.signum(durationField22.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(5);
        java.lang.Object obj28 = dateTimeZone27.writeReplace();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(dateTimeZone27);
        mutableDateTime29.setWeekyear(960);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(5);
        java.lang.Object obj28 = dateTimeZone27.writeReplace();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(dateTimeZone27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getName(1712408526237L, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        long long32 = mutableDateTime12.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology17.era();
        org.joda.time.DurationField durationField21 = gregorianChronology17.seconds();
        org.joda.time.DurationField durationField22 = gregorianChronology17.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField23 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField22);
        int int24 = mutableDateTime12.get(dateTimeFieldType15);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType15.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonth();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) 0, chronology4);
        mutableDateTime5.setMonthOfYear(5);
        mutableDateTime5.setDayOfYear((int) (byte) 19);
        boolean boolean10 = mutableDateTime5.isAfterNow();
        int int13 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "monthOfYear", (int) (byte) 10);
        mutableDateTime5.addMonths((-28800000));
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutableDateTime5.add(readableDuration16, 20);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.yearOfCentury();
        java.lang.String str21 = iSOChronology19.toString();
        org.joda.time.Chronology chronology22 = iSOChronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime5.toMutableDateTime(chronology22);
        int int27 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "62", 51);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime5.property(dateTimeFieldType28);
        java.lang.String str30 = property29.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime24", (mutableDateTime5.compareTo(mutableDateTime24) == 0) == mutableDateTime5.equals(mutableDateTime24));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.era();
        org.joda.time.DurationField durationField4 = gregorianChronology0.seconds();
        org.joda.time.DurationField durationField5 = gregorianChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = gregorianChronology0.months();
        org.joda.time.DurationField durationField9 = gregorianChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology0.yearOfCentury();
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology11.era();
        org.joda.time.DurationField durationField15 = gregorianChronology11.seconds();
        org.joda.time.DurationField durationField16 = gregorianChronology11.millis();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology11.halfdayOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0, chronology19);
        mutableDateTime20.setMonthOfYear(5);
        mutableDateTime20.setMillis(0L);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableDateTime20.add(readablePeriod25, (int) (byte) 13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        java.lang.String str29 = mutableDateTime20.toString(dateTimeFormatter28);
        mutableDateTime20.addMinutes(20);
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
        org.joda.time.Interval interval43 = interval38.toInterval();
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
        org.joda.time.Interval interval55 = interval50.toInterval();
        boolean boolean56 = interval38.isBefore((org.joda.time.ReadableInterval) interval50);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval50.toPeriod(periodType57);
        mutableDateTime20.add((org.joda.time.ReadablePeriod) period58);
        int[] intArray62 = gregorianChronology11.get((org.joda.time.ReadablePeriod) period58, 69000L, 0L);
        int int63 = period58.size();
        org.joda.time.MutablePeriod mutablePeriod64 = period58.toMutablePeriod();
        long long67 = gregorianChronology0.add((org.joda.time.ReadablePeriod) period58, (long) (byte) -1, 27);
        org.joda.time.DateTimeField dateTimeField68 = gregorianChronology0.secondOfDay();
        org.joda.time.DurationField durationField69 = gregorianChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField69, durationField4, and durationField5", !(durationField69.compareTo(durationField4) == 0) || (Math.signum(durationField69.compareTo(durationField5)) == Math.signum(durationField4.compareTo(durationField5))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = mutableDateTime31.toDateTimeISO();
        int int33 = dateTime32.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
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
        mutableDateTime2.setMillisOfSecond(4);
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.era();
        org.joda.time.DurationField durationField28 = gregorianChronology24.seconds();
        org.joda.time.DurationField durationField29 = gregorianChronology24.millis();
        org.joda.time.DurationField durationField30 = gregorianChronology24.weekyears();
        org.joda.time.DurationField durationField31 = gregorianChronology24.weekyears();
        org.joda.time.DateTime dateTime32 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology24);
        org.joda.time.chrono.GregorianChronology gregorianChronology33 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology33.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology33.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology33.era();
        org.joda.time.DurationField durationField37 = gregorianChronology33.seconds();
        org.joda.time.DurationField durationField38 = gregorianChronology33.millis();
        boolean boolean39 = dateTime32.equals((java.lang.Object) gregorianChronology33);
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology33.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime32", (mutableDateTime2.compareTo(dateTime32) == 0) == mutableDateTime2.equals(dateTime32));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        mutableDateTime11.setMinuteOfHour(11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime12.setChronology(chronology20);
        int int22 = mutableDateTime12.getDayOfYear();
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology23.era();
        org.joda.time.DurationField durationField27 = gregorianChronology23.seconds();
        org.joda.time.DurationField durationField28 = gregorianChronology23.centuries();
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime12.toMutableDateTime(dateTimeZone30);
        mutableDateTime12.setMinuteOfHour(26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime31", (mutableDateTime3.compareTo(mutableDateTime31) == 0) == mutableDateTime3.equals(mutableDateTime31));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology13 = gregorianChronology8.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology8.weekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology8.halfdayOfDay();
        mutableDateTime2.setRounding(dateTimeField16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 0, chronology19);
        mutableDateTime20.setMonthOfYear(5);
        mutableDateTime20.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException27 = new org.joda.time.IllegalFieldValueException(durationFieldType25, "");
        java.lang.Throwable[] throwableArray28 = illegalFieldValueException27.getSuppressed();
        boolean boolean29 = mutableDateTime20.equals((java.lang.Object) illegalFieldValueException27);
        mutableDateTime20.setSecondOfDay((int) (short) 10);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology32.monthOfYear();
        org.joda.time.DateTime dateTime36 = mutableDateTime20.toDateTime((org.joda.time.Chronology) gregorianChronology32);
        int int37 = mutableDateTime20.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int39 = mutableDateTime20.get(dateTimeFieldType38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime2.property(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and dateTime36", (mutableDateTime20.compareTo(dateTime36) == 0) == mutableDateTime20.equals(dateTime36));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        int int19 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int21 = mutableDateTime2.get(dateTimeFieldType20);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology22.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology22.weekyear();
        long long31 = gregorianChronology22.getDateTimeMillis(27, (int) (byte) 7, (int) (byte) 20, (int) (byte) 16);
        boolean boolean32 = dateTimeFieldType20.isSupported((org.joda.time.Chronology) gregorianChronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
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
        int int28 = mutableDateTime11.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime25", (mutableDateTime2.compareTo(mutableDateTime25) == 0) == mutableDateTime2.equals(mutableDateTime25));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, (int) (byte) 100);
        int int4 = mutableDateTime0.getCenturyOfEra();
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
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.dayOfWeek();
        mutableDateTime17.add(0L);
        int int22 = mutableDateTime17.getYearOfEra();
        int int23 = mutableDateTime0.compareTo((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime0.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime17", (mutableDateTime8.compareTo(mutableDateTime17) == 0) == mutableDateTime8.equals(mutableDateTime17));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        mutableDateTime12.setSecondOfMinute((int) '#');
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.Chronology chronology22 = gregorianChronology17.withZone(dateTimeZone21);
        long long26 = gregorianChronology17.add((long) (short) 10, 100L, (int) (byte) 9);
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology17.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = gregorianChronology17.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime12, (org.joda.time.Chronology) gregorianChronology17);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime29", (mutableDateTime12.compareTo(mutableDateTime29) == 0) == mutableDateTime12.equals(mutableDateTime29));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
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
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 0, chronology15);
        mutableDateTime16.setMonthOfYear(5);
        mutableDateTime16.setDayOfYear((int) (byte) 19);
        boolean boolean21 = mutableDateTime16.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone24 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.minuteOfDay();
        int int27 = mutableDateTime25.getMillisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology28.dayOfWeek();
        mutableDateTime25.setRounding(dateTimeField29, 5);
        int int32 = mutableDateTime25.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime25.millisOfSecond();
        mutableDateTime25.setTime((int) (byte) 19, 14, (int) (short) 1, 3);
        mutableDateTime25.setSecondOfMinute((int) (byte) 5);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant13", (mutableDateTime2.compareTo(instant13) == 0) == mutableDateTime2.equals(instant13));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-19T00:00:00.005+00:00:00.005");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 0, chronology3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.secondOfDay();
        int int6 = mutableDateTime4.getWeekOfWeekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 0, chronology8);
        mutableDateTime9.setMonthOfYear(5);
        mutableDateTime9.setDayOfYear((int) (byte) 19);
        boolean boolean14 = mutableDateTime9.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone17 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime9.toMutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime18.add(readableDuration20);
        mutableDateTime18.setHourOfDay((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        boolean boolean26 = dateTimeFieldType24.isSupported((org.joda.time.Chronology) gregorianChronology25);
        int int27 = mutableDateTime18.get(dateTimeFieldType24);
        int int28 = mutableDateTime4.get(dateTimeFieldType24);
        org.joda.time.IllegalFieldValueException illegalFieldValueException30 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType24, "+00:00:00.005");
        int int31 = mutableDateTime1.get(dateTimeFieldType24);
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType24.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime9", (mutableDateTime1.compareTo(mutableDateTime9) == 0) == mutableDateTime1.equals(mutableDateTime9));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
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
        mutableDateTime2.setMillisOfSecond(4);
        org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = gregorianChronology24.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = gregorianChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology24.era();
        org.joda.time.DurationField durationField28 = gregorianChronology24.seconds();
        org.joda.time.DurationField durationField29 = gregorianChronology24.millis();
        org.joda.time.DurationField durationField30 = gregorianChronology24.weekyears();
        org.joda.time.DurationField durationField31 = gregorianChronology24.weekyears();
        org.joda.time.DateTime dateTime32 = mutableDateTime2.toDateTime((org.joda.time.Chronology) gregorianChronology24);
        int int33 = gregorianChronology24.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime32", (mutableDateTime2.compareTo(dateTime32) == 0) == mutableDateTime2.equals(dateTime32));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
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
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime12.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime15 = property14.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime15", (mutableDateTime3.compareTo(mutableDateTime15) == 0) == mutableDateTime3.equals(mutableDateTime15));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
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
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) 0, chronology12);
        mutableDateTime13.setMonthOfYear(5);
        mutableDateTime13.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException20 = new org.joda.time.IllegalFieldValueException(durationFieldType18, "");
        java.lang.Throwable[] throwableArray21 = illegalFieldValueException20.getSuppressed();
        boolean boolean22 = mutableDateTime13.equals((java.lang.Object) illegalFieldValueException20);
        mutableDateTime13.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime13.add(readableDuration25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime13.add(readablePeriod27, 0);
        mutableDateTime13.setYear((-28800000));
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone34 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime13.toMutableDateTime(dateTimeZone33);
        int int36 = mutableDateTime35.getSecondOfDay();
        boolean boolean37 = interval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime38.add(readableDuration39, 10);
        int int42 = mutableDateTime38.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime38.hourOfDay();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime();
        int int46 = mutableDateTime45.getMonthOfYear();
        boolean boolean47 = interval44.isAfter((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.Interval interval48 = interval44.toInterval();
        org.joda.time.Interval interval49 = interval44.toInterval();
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
        org.joda.time.Interval interval61 = interval56.toInterval();
        org.joda.time.MutableDateTime mutableDateTime62 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration63 = null;
        mutableDateTime62.add(readableDuration63, 10);
        int int66 = mutableDateTime62.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime62.hourOfDay();
        org.joda.time.Interval interval68 = property67.toInterval();
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime();
        int int70 = mutableDateTime69.getMonthOfYear();
        boolean boolean71 = interval68.isAfter((org.joda.time.ReadableInstant) mutableDateTime69);
        org.joda.time.Interval interval72 = interval68.toInterval();
        org.joda.time.Interval interval73 = interval68.toInterval();
        boolean boolean74 = interval56.isBefore((org.joda.time.ReadableInterval) interval68);
        boolean boolean75 = interval49.isBefore((org.joda.time.ReadableInterval) interval68);
        org.joda.time.MutableInterval mutableInterval76 = interval49.toMutableInterval();
        org.joda.time.Interval interval77 = mutableInterval76.toInterval();
        boolean boolean78 = interval6.isAfter((org.joda.time.ReadableInterval) interval77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime35", (mutableDateTime13.compareTo(mutableDateTime35) == 0) == mutableDateTime13.equals(mutableDateTime35));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "monthOfYear", (int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime3.add(durationFieldType12, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gregorianChronology16.months();
        boolean boolean18 = dateTimeZone15.equals((java.lang.Object) gregorianChronology16);
        org.joda.time.DurationField durationField19 = durationFieldType12.getField((org.joda.time.Chronology) gregorianChronology16);
        org.joda.time.DurationField durationField20 = gregorianChronology16.millis();
        org.joda.time.Chronology chronology21 = gregorianChronology16.withUTC();
        org.joda.time.DurationField durationField22 = gregorianChronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField17, and durationField19", !(durationField22.compareTo(durationField17) == 0) || (Math.signum(durationField22.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.secondOfDay();
        org.joda.time.Instant instant4 = mutableDateTime2.toInstant();
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = gregorianChronology5.months();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology5.millisOfSecond();
        int int11 = mutableDateTime2.get(dateTimeField10);
        int int14 = dateTimeField10.getDifference(86400000L, 60000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant4", (mutableDateTime2.compareTo(instant4) == 0) == mutableDateTime2.equals(instant4));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
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
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        boolean boolean26 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
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
        mutableDateTime25.addMonths(24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone12 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 0, chronology1);
        mutableDateTime2.setMonthOfYear(5);
        mutableDateTime2.setDayOfYear((int) (byte) 19);
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone10 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime2.toMutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.minuteOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.weekyear();
        java.lang.String str14 = property13.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime11", (mutableDateTime2.compareTo(mutableDateTime11) == 0) == mutableDateTime2.equals(mutableDateTime11));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 0, chronology2);
        mutableDateTime3.setMonthOfYear(5);
        mutableDateTime3.setDayOfYear((int) (byte) 19);
        boolean boolean8 = mutableDateTime3.isAfterNow();
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime3, "monthOfYear", (int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime3.add(durationFieldType12, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gregorianChronology16.months();
        boolean boolean18 = dateTimeZone15.equals((java.lang.Object) gregorianChronology16);
        org.joda.time.DurationField durationField19 = durationFieldType12.getField((org.joda.time.Chronology) gregorianChronology16);
        org.joda.time.DurationField durationField20 = gregorianChronology16.millis();
        org.joda.time.Chronology chronology21 = gregorianChronology16.withUTC();
        org.joda.time.DurationField durationField22 = gregorianChronology16.weeks();
        org.joda.time.DurationField durationField23 = gregorianChronology16.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField17, and durationField19", !(durationField23.compareTo(durationField17) == 0) || (Math.signum(durationField23.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
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
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours(5);
        java.lang.Object obj28 = dateTimeZone27.writeReplace();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime2.toMutableDateTime(dateTimeZone27);
        long long30 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) mutableDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime24", (mutableDateTime2.compareTo(mutableDateTime24) == 0) == mutableDateTime2.equals(mutableDateTime24));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology17.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology17.era();
        org.joda.time.DurationField durationField21 = gregorianChronology17.seconds();
        org.joda.time.DurationField durationField22 = gregorianChronology17.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField23 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField22);
        int int24 = mutableDateTime12.get(dateTimeFieldType15);
        org.joda.time.Instant instant25 = mutableDateTime12.toInstant();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 0, chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfFloor();
        org.joda.time.Chronology chronology31 = property29.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property29.getFieldType();
        int int33 = instant25.get(dateTimeFieldType32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime12", (mutableDateTime3.compareTo(mutableDateTime12) == 0) == mutableDateTime3.equals(mutableDateTime12));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
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
        org.joda.time.Chronology chronology19 = gregorianChronology14.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(3);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 0, chronology5);
        mutableDateTime6.setMonthOfYear(5);
        mutableDateTime6.setMillis(0L);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.IllegalFieldValueException illegalFieldValueException13 = new org.joda.time.IllegalFieldValueException(durationFieldType11, "");
        java.lang.Throwable[] throwableArray14 = illegalFieldValueException13.getSuppressed();
        boolean boolean15 = mutableDateTime6.equals((java.lang.Object) illegalFieldValueException13);
        mutableDateTime6.setSecondOfDay((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime6.add(readableDuration18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.HOURS_TYPE;
        mutableDateTime6.add(durationFieldType20, 3);
        mutableDateTime6.addMillis(3);
        java.lang.String str25 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) mutableDateTime6);
        java.lang.String str26 = mutableDateTime6.toString();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 0, chronology28);
        mutableDateTime29.setMonthOfYear(5);
        mutableDateTime29.setDayOfYear((int) (byte) 19);
        boolean boolean34 = mutableDateTime29.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(5);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone37 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime29.toMutableDateTime(dateTimeZone36);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int41 = mutableDateTime38.get(dateTimeFieldType40);
        mutableDateTime6.set(dateTimeFieldType40, 30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and mutableDateTime38", (mutableDateTime29.compareTo(mutableDateTime38) == 0) == mutableDateTime29.equals(mutableDateTime38));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        mutableDateTime0.add(readableDuration1, 10);
        int int4 = mutableDateTime0.getWeekOfWeekyear();
        int int5 = mutableDateTime0.getMillisOfSecond();
        org.joda.time.Instant instant6 = mutableDateTime0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, 10);
        int int11 = mutableDateTime7.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.hourOfDay();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime14.add(readableDuration15, 10);
        int int18 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime14.hourOfDay();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime();
        int int22 = mutableDateTime21.getMonthOfYear();
        boolean boolean23 = interval20.isAfter((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Interval interval24 = interval20.toInterval();
        org.joda.time.Interval interval25 = interval20.toInterval();
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
        org.joda.time.Interval interval37 = interval32.toInterval();
        boolean boolean38 = interval20.isBefore((org.joda.time.ReadableInterval) interval32);
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = gregorianChronology39.months();
        int int43 = durationField40.getValue(0L, 0L);
        java.lang.String str44 = durationField40.toString();
        boolean boolean45 = interval32.equals((java.lang.Object) str44);
        org.joda.time.Duration duration46 = interval32.toDuration();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime47.add(readableDuration48, 10);
        int int51 = mutableDateTime47.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.hourOfDay();
        org.joda.time.Interval interval53 = property52.toInterval();
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime();
        int int55 = mutableDateTime54.getMonthOfYear();
        boolean boolean56 = interval53.isAfter((org.joda.time.ReadableInstant) mutableDateTime54);
        org.joda.time.Interval interval57 = interval53.toInterval();
        org.joda.time.Interval interval58 = interval53.toInterval();
        org.joda.time.MutableDateTime mutableDateTime59 = org.joda.time.MutableDateTime.now();
        org.joda.time.ReadableDuration readableDuration60 = null;
        mutableDateTime59.add(readableDuration60, 10);
        int int63 = mutableDateTime59.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime59.hourOfDay();
        org.joda.time.Interval interval65 = property64.toInterval();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime();
        int int67 = mutableDateTime66.getMonthOfYear();
        boolean boolean68 = interval65.isAfter((org.joda.time.ReadableInstant) mutableDateTime66);
        org.joda.time.Interval interval69 = interval65.toInterval();
        org.joda.time.Interval interval70 = interval65.toInterval();
        boolean boolean71 = interval53.isBefore((org.joda.time.ReadableInterval) interval65);
        org.joda.time.chrono.GregorianChronology gregorianChronology72 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField73 = gregorianChronology72.months();
        int int76 = durationField73.getValue(0L, 0L);
        java.lang.String str77 = durationField73.toString();
        boolean boolean78 = interval65.equals((java.lang.Object) str77);
        org.joda.time.Duration duration79 = interval65.toDuration();
        long long80 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration79);
        long long81 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration79);
        int int82 = duration46.compareTo((org.joda.time.ReadableDuration) duration79);
        org.joda.time.Period period83 = duration46.toPeriod();
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration46, (int) '#');
        org.joda.time.Duration duration86 = duration46.toDuration();
        java.lang.Object obj87 = null;
        boolean boolean88 = duration46.equals(obj87);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration46, (-66));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime14", (instant6.compareTo(mutableDateTime14) == 0) == instant6.equals(mutableDateTime14));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
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
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now();
        boolean boolean26 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime18", (mutableDateTime2.compareTo(dateTime18) == 0) == mutableDateTime2.equals(dateTime18));
    }
}

