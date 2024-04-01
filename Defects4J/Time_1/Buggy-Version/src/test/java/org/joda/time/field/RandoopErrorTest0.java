package org.joda.time.field;

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
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
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
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
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
        long long26 = iSOChronology0.add(3900L, 60035L, 0);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField28 = iSOChronology0.hours();
        org.joda.time.DurationField durationField29 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField29, and durationField1", !(durationField1.compareTo(durationField29) > 0 && durationField29.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField8, and durationField1", !(durationField1.compareTo(durationField8) > 0 && durationField8.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        long long9 = durationField6.getDifferenceAsLong(1711953054921L, (long) 1);
        int int10 = unsupportedDurationField1.compareTo(durationField6);
        java.lang.String str11 = unsupportedDurationField1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField6, unsupportedDurationField1, and durationField6", !(durationField6.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField6) > 0) || durationField6.compareTo(durationField6) > 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.Chronology chronology5 = iSOChronology2.withUTC();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on unsupportedDurationField1 and durationField6", Math.signum(unsupportedDurationField1.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(unsupportedDurationField1)));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test13");
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
        int int28 = dividedDateTimeField11.getLeapAmount((-210866760000000L));
        int int29 = dividedDateTimeField11.getMaximumValue();
        int int30 = dividedDateTimeField11.getDivisor();
        org.joda.time.DurationField durationField31 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField31, and durationField4", !(durationField4.compareTo(durationField31) > 0 && durationField31.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test14");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.centuryOfEra();
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
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField33 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField16, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str35 = dateTimeFieldType34.getName();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.Partial partial41 = new org.joda.time.Partial(dateTimeFieldType34, (int) (short) 0, chronology39);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial49 = null;
        int[] intArray56 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int57 = dateTimeField48.getMaximumValue(readablePartial49, intArray56);
        int int58 = dividedDateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) partial41, intArray56);
        java.lang.String str59 = partial41.toString();
        org.joda.time.chrono.ISOChronology iSOChronology61 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField62 = iSOChronology61.minutes();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology61.millisOfDay();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology61.halfdayOfDay();
        org.joda.time.DurationField durationField65 = iSOChronology61.seconds();
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology61.secondOfDay();
        org.joda.time.DateTimeField dateTimeField67 = iSOChronology61.era();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.Chronology chronology70 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval68);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval73 = null;
        org.joda.time.ReadableInterval readableInterval74 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval73);
        org.joda.time.ReadableInterval readableInterval75 = null;
        boolean boolean76 = readableInterval74.contains(readableInterval75);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = readableInterval74.toPeriod(periodType77);
        int[] intArray80 = chronology70.get((org.joda.time.ReadablePeriod) period78, (-210866846400000L));
        int[] intArray83 = iSOChronology61.get((org.joda.time.ReadablePeriod) period78, 0L, 2440588L);
        int[] intArray85 = dateTimeField4.add((org.joda.time.ReadablePartial) partial41, (int) (byte) 0, intArray83, 24);
        boolean boolean86 = unsupportedDurationField1.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField9, unsupportedDurationField1, and durationField9", !(durationField9.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField9) > 0) || durationField9.compareTo(durationField9) > 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test15");
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
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        long long31 = offsetDateTimeField28.roundFloor(970L);
        long long34 = offsetDateTimeField28.addWrapField(0L, 1439);
        int int36 = offsetDateTimeField28.getLeapAmount(1711953060220L);
        int int38 = offsetDateTimeField28.getLeapAmount(113605027228532550L);
        long long40 = offsetDateTimeField28.roundHalfCeiling(2440588L);
        org.joda.time.DurationField durationField41 = offsetDateTimeField28.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField41, and durationField4", !(durationField4.compareTo(durationField41) > 0 && durationField41.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test16");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField6, and durationField1", !(durationField1.compareTo(durationField6) > 0 && durationField6.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test17");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        java.lang.String str7 = chronology3.toString();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = chronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) > 0 && durationField9.compareTo(durationField6) > 0) || durationField6.compareTo(durationField6) > 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test18");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.minutes();
        boolean boolean6 = durationFieldType0.isSupported(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField7 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField7, and durationField5", !(durationField5.compareTo(unsupportedDurationField7) > 0 && unsupportedDurationField7.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test19");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType3, durationField8);
        long long12 = unsupportedDateTimeField9.getDifferenceAsLong((long) 100, (long) 11);
        org.joda.time.DurationField durationField13 = unsupportedDateTimeField9.getLeapDurationField();
        org.joda.time.DurationField durationField14 = unsupportedDateTimeField9.getDurationField();
        int int15 = unsupportedDurationField1.compareTo(durationField14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField14, unsupportedDurationField1, and durationField14", !(durationField14.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField14) > 0) || durationField14.compareTo(durationField14) > 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test20");
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
        org.joda.time.DurationField durationField23 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField23, and durationField1", !(durationField1.compareTo(durationField23) > 0 && durationField23.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test21");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationFieldType durationFieldType2 = unsupportedDurationField1.getType();
        long long3 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        boolean boolean12 = unsupportedDurationField1.equals((java.lang.Object) dateTimeField11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField8, unsupportedDurationField1, and durationField8", !(durationField8.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField8) > 0) || durationField8.compareTo(durationField8) > 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test22");
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
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        long long17 = dividedDateTimeField11.getDifferenceAsLong(1232603564400032L, 1711953056985L);
        int int18 = dividedDateTimeField11.iDivisor;
        long long20 = dividedDateTimeField11.roundCeiling(31556995200024L);
        long long23 = dividedDateTimeField11.set(3138110999413L, (int) (byte) 100);
        org.joda.time.DurationField durationField24 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField24, and durationField4", !(durationField4.compareTo(durationField24) > 0 && durationField24.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test23");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        java.lang.String str8 = iSOChronology0.toString();
        org.joda.time.Chronology chronology9 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField10 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField11 = iSOChronology0.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField10", (durationField5.compareTo(durationField10) == 0) == durationField5.equals(durationField10));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test24");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        long long2 = unsupportedDurationField1.getUnitMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType3, durationField8);
        long long12 = durationField8.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        boolean boolean18 = durationFieldType13.isSupported(chronology16);
        org.joda.time.field.ScaledDurationField scaledDurationField20 = new org.joda.time.field.ScaledDurationField(durationField8, durationFieldType13, (int) 'a');
        org.joda.time.DurationField durationField21 = scaledDurationField20.getWrappedField();
        int int24 = scaledDurationField20.getDifference((long) (byte) -1, (long) (short) 0);
        long long26 = scaledDurationField20.getValueAsLong((long) 53460006);
        org.joda.time.DurationField durationField27 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long30 = durationField27.getValueAsLong((long) (short) 1, (long) (short) 100);
        int int31 = scaledDurationField20.compareTo(durationField27);
        int int32 = unsupportedDurationField1.compareTo(durationField27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField8, unsupportedDurationField1, and durationField8", !(durationField8.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField8) > 0) || durationField8.compareTo(durationField8) > 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test25");
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
        java.util.Locale locale12 = null;
        int int13 = dividedDateTimeField11.getMaximumTextLength(locale12);
        int int15 = dividedDateTimeField11.get(970L);
        org.joda.time.DurationField durationField16 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField16, and durationField4", !(durationField4.compareTo(durationField16) > 0 && durationField16.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test26");
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
        java.util.Locale locale12 = null;
        int int13 = dividedDateTimeField11.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField14, and durationField4", !(durationField4.compareTo(durationField14) > 0 && durationField14.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test27");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, (int) (short) 100);
        boolean boolean7 = offsetDateTimeField5.isLeap(236737036L);
        boolean boolean8 = offsetDateTimeField5.isLenient();
        org.joda.time.DurationField durationField9 = offsetDateTimeField5.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField9, and durationField1", !(durationField1.compareTo(durationField9) > 0 && durationField9.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test28");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.DurationField durationField6 = durationFieldType0.getField(chronology3);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField7 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField7, and durationField5", !(durationField5.compareTo(unsupportedDurationField7) > 0 && unsupportedDurationField7.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test29");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField12, dateTimeFieldType13, 10);
        long long18 = dividedDateTimeField15.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField26 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField15, dateTimeFieldType19);
        long long29 = remainderDateTimeField26.getDifferenceAsLong((long) 3, (long) 0);
        int int31 = remainderDateTimeField26.getLeapAmount(1L);
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, dateTimeFieldType41, 10);
        long long46 = dividedDateTimeField43.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField54 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField43, dateTimeFieldType47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = dividedDateTimeField43.getAsShortText(readablePartial55, 29227899, locale57);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField60 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField43, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str62 = dateTimeFieldType61.getName();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(dateTimeFieldType61, (int) (short) 0, chronology66);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval69);
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DurationField durationField73 = chronology71.millis();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray83 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int84 = dateTimeField75.getMaximumValue(readablePartial76, intArray83);
        int int85 = dividedDateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) partial68, intArray83);
        boolean boolean87 = partial68.equals((java.lang.Object) "29227899");
        int[] intArray88 = partial68.getValues();
        java.util.Locale locale90 = null;
        java.lang.String str91 = remainderDateTimeField26.getAsShortText((org.joda.time.ReadablePartial) partial68, (int) (short) 1, locale90);
        boolean boolean92 = unsupportedDurationField1.equals((java.lang.Object) remainderDateTimeField26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField8, unsupportedDurationField1, and durationField8", !(durationField8.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField8) > 0) || durationField8.compareTo(durationField8) > 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test30");
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
        long long29 = dividedDateTimeField11.addWrapField(1711953060497L, (int) (byte) 100);
        java.util.Locale locale30 = null;
        int int31 = dividedDateTimeField11.getMaximumShortTextLength(locale30);
        long long33 = dividedDateTimeField11.roundFloor((-1711953056944L));
        org.joda.time.DurationField durationField34 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField34, and durationField4", !(durationField4.compareTo(durationField34) > 0 && durationField34.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test31");
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
        org.joda.time.DurationField durationField23 = remainderDateTimeField22.iDurationField;
        boolean boolean24 = remainderDateTimeField22.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField26 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField26, dateTimeFieldType27);
        org.joda.time.DurationField durationField29 = dividedDateTimeField26.iRangeDurationField;
        org.joda.time.DurationField durationField30 = dividedDateTimeField26.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField30, and durationField4", !(durationField4.compareTo(durationField30) > 0 && durationField30.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test32");
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
        org.joda.time.DurationField durationField55 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField55, and durationField4", !(durationField4.compareTo(durationField55) > 0 && durationField55.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test33");
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
        int int17 = dividedDateTimeField11.getDifference(1711953056959L, 1711953058391L);
        int int18 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.DurationField durationField19 = dividedDateTimeField11.getDurationField();
        int int20 = dividedDateTimeField11.getDivisor();
        long long22 = dividedDateTimeField11.remainder(28800291L);
        org.joda.time.DurationField durationField23 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField23, and durationField4", !(durationField4.compareTo(durationField23) > 0 && durationField23.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }
}

