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
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField18 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField18, and durationField5", !(durationField5.compareTo(unsupportedDurationField18) > 0 && unsupportedDurationField18.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField29, and durationField4", !(durationField4.compareTo(durationField29) > 0 && durationField29.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        int int21 = scaledDurationField17.getDifference((long) (byte) -1, (long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType22 = scaledDurationField17.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField23 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField23, and durationField5", !(durationField5.compareTo(unsupportedDurationField23) > 0 && unsupportedDurationField23.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField4, and durationField1", !(durationField1.compareTo(durationField4) > 0 && durationField4.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology6.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField12, and durationField4", !(durationField4.compareTo(durationField12) > 0 && durationField12.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long5 = durationField2.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long7 = durationField2.getValueAsLong((long) 10);
        long long10 = durationField2.subtract((long) 1, (int) ' ');
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DurationField durationField17 = durationFieldType11.getField(chronology14);
        org.joda.time.field.DecoratedDurationField decoratedDurationField18 = new org.joda.time.field.DecoratedDurationField(durationField2, durationFieldType11);
        int int19 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) decoratedDurationField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField16", (durationField2.compareTo(durationField16) == 0) == durationField2.equals(durationField16));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        int int29 = dividedDateTimeField11.iDivisor;
        long long32 = dividedDateTimeField11.add((long) 11, (long) (byte) -1);
        org.joda.time.DurationField durationField33 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField33, and durationField4", !(durationField4.compareTo(durationField33) > 0 && durationField33.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) > 0 && durationField6.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval13.contains(readableInterval14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = readableInterval13.toPeriod(periodType16);
        int[] intArray19 = chronology9.get((org.joda.time.ReadablePeriod) period17, (-210866846400000L));
        int[] intArray22 = iSOChronology0.get((org.joda.time.ReadablePeriod) period17, 0L, 2440588L);
        long long26 = iSOChronology0.add(3901L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DurationField durationField29 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField29, and durationField1", !(durationField1.compareTo(durationField29) > 0 && durationField29.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long16 = dividedDateTimeField11.roundFloor((-210861660779418L));
        org.joda.time.DurationField durationField17 = dividedDateTimeField11.iDurationField;
        org.joda.time.DurationField durationField18 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField18, and durationField4", !(durationField4.compareTo(durationField18) > 0 && durationField18.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField3 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField10 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType4, durationField9);
        long long13 = durationField9.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        boolean boolean19 = durationFieldType14.isSupported(chronology17);
        org.joda.time.field.ScaledDurationField scaledDurationField21 = new org.joda.time.field.ScaledDurationField(durationField9, durationFieldType14, (int) 'a');
        org.joda.time.DurationField durationField22 = scaledDurationField21.getWrappedField();
        long long25 = scaledDurationField21.add((-210866846400000L), (long) 53460006);
        int int28 = scaledDurationField21.getValue((long) 1, 1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField35 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType29, durationField34);
        long long38 = durationField34.getValueAsLong((-210866846400000L), (-31L));
        long long41 = durationField34.add(0L, (long) 1);
        int int42 = scaledDurationField21.compareTo(durationField34);
        int int43 = unsupportedDurationField3.compareTo((org.joda.time.DurationField) scaledDurationField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField9, unsupportedDurationField3, and durationField9", !(durationField9.compareTo(unsupportedDurationField3) > 0 && unsupportedDurationField3.compareTo(durationField9) > 0) || durationField9.compareTo(durationField9) > 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField10 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType4, durationField9);
        long long13 = durationField9.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        boolean boolean19 = durationFieldType14.isSupported(chronology17);
        org.joda.time.field.ScaledDurationField scaledDurationField21 = new org.joda.time.field.ScaledDurationField(durationField9, durationFieldType14, (int) 'a');
        int int22 = unsupportedDurationField1.compareTo(durationField9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on scaledDurationField21, unsupportedDurationField1, and scaledDurationField21", !(scaledDurationField21.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(scaledDurationField21) > 0) || scaledDurationField21.compareTo(scaledDurationField21) > 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        int int17 = dividedDateTimeField11.getDifference(1712392060782L, 1712392062253L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType21);
        org.joda.time.DurationField durationField23 = zeroIsMaxDateTimeField22.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField23, and durationField4", !(durationField4.compareTo(durationField23) > 0 && durationField23.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        int int17 = dividedDateTimeField11.getDifference(1712392060782L, 1712392062253L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        int int21 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField22 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField22, and durationField4", !(durationField4.compareTo(durationField22) > 0 && durationField22.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField12 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField12, and durationField5", !(durationField5.compareTo(unsupportedDurationField12) > 0 && unsupportedDurationField12.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        int int17 = dividedDateTimeField11.getDifference(1712392060782L, 1712392062253L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType21);
        int int23 = zeroIsMaxDateTimeField22.getMinimumValue();
        org.joda.time.DurationField durationField24 = zeroIsMaxDateTimeField22.getLeapDurationField();
        int int25 = zeroIsMaxDateTimeField22.getMinimumValue();
        org.joda.time.DurationField durationField26 = zeroIsMaxDateTimeField22.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField26, and durationField4", !(durationField4.compareTo(durationField26) > 0 && durationField26.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DurationField durationField0 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long3 = durationField0.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long5 = durationField0.getValueAsLong((long) 10);
        long long8 = durationField0.subtract((long) 1, (int) ' ');
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.DurationField durationField15 = durationFieldType9.getField(chronology12);
        org.joda.time.field.DecoratedDurationField decoratedDurationField16 = new org.joda.time.field.DecoratedDurationField(durationField0, durationFieldType9);
        java.lang.String str17 = durationField0.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and decoratedDurationField16", (durationField14.compareTo(decoratedDurationField16) == 0) == durationField14.equals(decoratedDurationField16));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField6 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean7 = unsupportedDurationField6.isSupported();
        org.joda.time.DurationFieldType durationFieldType8 = unsupportedDurationField6.getType();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField10 = iSOChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.dayOfMonth();
        boolean boolean16 = unsupportedDurationField6.equals((java.lang.Object) dateTimeField15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField10, unsupportedDurationField6, and durationField10", !(durationField10.compareTo(unsupportedDurationField6) > 0 && unsupportedDurationField6.compareTo(durationField10) > 0) || durationField10.compareTo(durationField10) > 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField6 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.field.PreciseDurationField preciseDurationField8 = new org.joda.time.field.PreciseDurationField(durationFieldType0, 1712392073212L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on unsupportedDurationField6, preciseDurationField8, and unsupportedDurationField6", !(unsupportedDurationField6.compareTo(preciseDurationField8) > 0 && preciseDurationField8.compareTo(unsupportedDurationField6) > 0) || unsupportedDurationField6.compareTo(unsupportedDurationField6) > 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        int int54 = dividedDateTimeField11.getMinimumValue();
        long long56 = dividedDateTimeField11.roundFloor((long) 25160);
        long long59 = dividedDateTimeField11.set(0L, (int) 'a');
        org.joda.time.DurationField durationField60 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField60, and durationField4", !(durationField4.compareTo(durationField60) > 0 && durationField60.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.Chronology chronology3 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField4, and durationField1", !(durationField1.compareTo(durationField4) > 0 && durationField4.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField6 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean7 = unsupportedDurationField6.isSupported();
        org.joda.time.DurationFieldType durationFieldType8 = unsupportedDurationField6.getType();
        java.lang.String str9 = unsupportedDurationField6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField16 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType10, durationField15);
        org.joda.time.DurationField durationField17 = unsupportedDateTimeField16.getDurationField();
        int int18 = unsupportedDurationField6.compareTo(durationField17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField17, unsupportedDurationField6, and durationField17", !(durationField17.compareTo(unsupportedDurationField6) > 0 && unsupportedDurationField6.compareTo(durationField17) > 0) || durationField17.compareTo(durationField17) > 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField6 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean7 = unsupportedDurationField6.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str9 = dateTimeFieldType8.getName();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldType8, (int) (short) 0, chronology13);
        org.joda.time.Chronology chronology16 = partial15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        boolean boolean18 = unsupportedDurationField6.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        long long28 = durationField24.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        boolean boolean34 = durationFieldType29.isSupported(chronology32);
        org.joda.time.field.ScaledDurationField scaledDurationField36 = new org.joda.time.field.ScaledDurationField(durationField24, durationFieldType29, (int) 'a');
        org.joda.time.DurationField durationField37 = scaledDurationField36.getWrappedField();
        long long40 = scaledDurationField36.add(2440588L, 1439);
        long long42 = scaledDurationField36.getMillis(0L);
        long long45 = scaledDurationField36.subtract((long) 1, 0);
        int int48 = scaledDurationField36.getValue((-971L), (long) (short) 100);
        int int49 = unsupportedDurationField6.compareTo((org.joda.time.DurationField) scaledDurationField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField17, unsupportedDurationField6, and durationField17", !(durationField17.compareTo(unsupportedDurationField6) > 0 && unsupportedDurationField6.compareTo(durationField17) > 0) || durationField17.compareTo(durationField17) > 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        boolean boolean12 = durationFieldType7.isSupported(chronology10);
        org.joda.time.DurationField durationField13 = chronology10.eras();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType6.getField(chronology10);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField17 = new org.joda.time.field.RemainderDateTimeField(dateTimeField5, dateTimeFieldType6, 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField13", Math.signum(durationField4.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField4)));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long24 = remainderDateTimeField22.roundHalfFloor((long) 100);
        boolean boolean25 = remainderDateTimeField22.isSupported();
        int int27 = remainderDateTimeField22.get(0L);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField29 = iSOChronology28.weeks();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField36 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType30, durationField35);
        long long39 = unsupportedDateTimeField36.add((-31L), (long) '#');
        org.joda.time.DurationField durationField40 = unsupportedDateTimeField36.getLeapDurationField();
        org.joda.time.DurationField durationField41 = unsupportedDateTimeField36.getRangeDurationField();
        long long44 = unsupportedDateTimeField36.getDifferenceAsLong(10L, 0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = unsupportedDateTimeField36.getType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField46 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, durationField29, dateTimeFieldType45);
        org.joda.time.DurationField durationField47 = remainderDateTimeField22.iDurationField;
        org.joda.time.DurationField durationField48 = remainderDateTimeField22.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str50 = dateTimeFieldType49.getName();
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval52);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.Partial partial56 = new org.joda.time.Partial(dateTimeFieldType49, (int) (short) 0, chronology54);
        org.joda.time.Chronology chronology57 = partial56.getChronology();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial62 = null;
        int int63 = dateTimeField61.getMinimumValue(readablePartial62);
        org.joda.time.DurationField durationField64 = dateTimeField61.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField69 = new org.joda.time.field.OffsetDateTimeField(dateTimeField61, dateTimeFieldType65, 24, 0, 1439);
        boolean boolean70 = partial56.isSupported(dateTimeFieldType65);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField74 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField22, dateTimeFieldType65, 9, 350, 8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField47 and durationField64", (durationField47.compareTo(durationField64) == 0) == durationField47.equals(durationField64));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationField durationField7 = chronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) > 0 && durationField7.compareTo(durationField6) > 0) || durationField6.compareTo(durationField6) > 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField16 = new org.joda.time.field.DividedDateTimeField(dateTimeField13, dateTimeFieldType14, 10);
        long long19 = dividedDateTimeField16.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField26 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType20, durationField25);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField27 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField16, dateTimeFieldType20);
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = null;
        java.lang.String str31 = dividedDateTimeField16.getAsShortText(readablePartial28, 29227899, locale30);
        boolean boolean32 = iSOChronology0.equals((java.lang.Object) str31);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField35 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField35, and durationField1", !(durationField1.compareTo(durationField35) > 0 && durationField35.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField7);
        long long11 = durationField7.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        boolean boolean17 = durationFieldType12.isSupported(chronology15);
        org.joda.time.field.ScaledDurationField scaledDurationField19 = new org.joda.time.field.ScaledDurationField(durationField7, durationFieldType12, (int) 'a');
        org.joda.time.DurationField durationField20 = scaledDurationField19.getWrappedField();
        int int23 = scaledDurationField19.getDifference((long) (byte) -1, (long) (short) 0);
        long long26 = scaledDurationField19.getDifferenceAsLong(328582762886L, (long) (byte) 1);
        boolean boolean27 = unsupportedDurationField1.equals((java.lang.Object) scaledDurationField19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField7, unsupportedDurationField1, and durationField7", !(durationField7.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField7) > 0) || durationField7.compareTo(durationField7) > 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField6 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean7 = unsupportedDurationField6.isSupported();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str9 = dateTimeFieldType8.getName();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldType8, (int) (short) 0, chronology13);
        org.joda.time.Chronology chronology16 = partial15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weeks();
        boolean boolean18 = unsupportedDurationField6.equals((java.lang.Object) durationField17);
        boolean boolean19 = unsupportedDurationField6.isSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField17, unsupportedDurationField6, and durationField17", !(durationField17.compareTo(unsupportedDurationField6) > 0 && unsupportedDurationField6.compareTo(durationField17) > 0) || durationField17.compareTo(durationField17) > 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology0.withUTC();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        boolean boolean12 = durationFieldType7.isSupported(chronology10);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField13 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType7);
        org.joda.time.Chronology chronology14 = null;
        boolean boolean15 = durationFieldType7.isSupported(chronology14);
        boolean boolean16 = iSOChronology0.equals((java.lang.Object) durationFieldType7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and unsupportedDurationField13", Math.signum(durationField1.compareTo(unsupportedDurationField13)) == -Math.signum(unsupportedDurationField13.compareTo(durationField1)));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        int int17 = dividedDateTimeField11.getDifference(1712392060782L, 1712392062253L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField22 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType21);
        int int23 = zeroIsMaxDateTimeField22.getMinimumValue();
        org.joda.time.DurationField durationField24 = zeroIsMaxDateTimeField22.getLeapDurationField();
        int int25 = zeroIsMaxDateTimeField22.getMinimumValue();
        int int27 = zeroIsMaxDateTimeField22.getMinimumValue(682029493144060782L);
        long long30 = zeroIsMaxDateTimeField22.add(84681L, 551134L);
        org.joda.time.DurationField durationField31 = zeroIsMaxDateTimeField22.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField31, and durationField4", !(durationField4.compareTo(durationField31) > 0 && durationField31.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField10, and durationField1", !(durationField1.compareTo(durationField10) > 0 && durationField10.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        boolean boolean10 = readableInterval8.contains(readableInterval9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = readableInterval8.toPeriod(periodType11);
        int[] intArray15 = iSOChronology0.get((org.joda.time.ReadablePeriod) period12, 0L, 32L);
        org.joda.time.DurationField durationField16 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField16, and durationField1", !(durationField1.compareTo(durationField16) > 0 && durationField16.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval5);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology7.millis();
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.joda.time.Chronology chronology11 = chronology7.withUTC();
        org.joda.time.DurationField durationField12 = chronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField16 = new org.joda.time.field.DividedDateTimeField(dateTimeField13, dateTimeFieldType14, 10);
        long long19 = dividedDateTimeField16.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField26 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType20, durationField25);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField27 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField16, dateTimeFieldType20);
        org.joda.time.ReadablePartial readablePartial28 = null;
        java.util.Locale locale30 = null;
        java.lang.String str31 = dividedDateTimeField16.getAsShortText(readablePartial28, 29227899, locale30);
        boolean boolean32 = iSOChronology0.equals((java.lang.Object) str31);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField34 = iSOChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField37 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField37, and durationField1", !(durationField1.compareTo(durationField37) > 0 && durationField37.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.minutes();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) > 0 && durationField6.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }
}

