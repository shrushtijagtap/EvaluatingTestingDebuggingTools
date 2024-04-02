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
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField7 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Partial partial9 = new org.joda.time.Partial(chronology8);
        int[] intArray17 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray19 = delegatedDateTimeField7.add((org.joda.time.ReadablePartial) partial9, 0, intArray17, (int) (byte) -1);
        long long21 = delegatedDateTimeField7.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException26 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType22, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField7, dateTimeFieldType22, (-28800000));
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getDurationField();
        long long31 = offsetDateTimeField28.roundCeiling((long) (short) 1);
        int int33 = offsetDateTimeField28.getLeapAmount((long) (short) 100);
        long long35 = offsetDateTimeField28.roundFloor((long) (byte) 0);
        org.joda.time.field.SkipDateTimeField skipDateTimeField36 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology) iSOChronology0, (org.joda.time.DateTimeField) offsetDateTimeField28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField29", Math.signum(durationField2.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField2)));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField7 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Partial partial9 = new org.joda.time.Partial(chronology8);
        int[] intArray17 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray19 = delegatedDateTimeField7.add((org.joda.time.ReadablePartial) partial9, 0, intArray17, (int) (byte) -1);
        long long21 = delegatedDateTimeField7.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException26 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType22, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField7, dateTimeFieldType22, (-28800000));
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getDurationField();
        long long31 = offsetDateTimeField28.roundCeiling((long) (short) 1);
        int int32 = offsetDateTimeField28.getMaximumValue();
        org.joda.time.DurationField durationField33 = offsetDateTimeField28.getDurationField();
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology35.era();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology35);
        org.joda.time.DateTime.Property property38 = dateTime37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = dateTimeField39.getType();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField42 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, durationField33, dateTimeFieldType40, 16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField33", Math.signum(durationField2.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField2)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int3 = localDate2.getEra();
        org.joda.time.LocalTime localTime4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4, dateTimeZone6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime(dateTimeZone10);
        int int14 = dateTime8.getDayOfMonth();
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(1L, (org.joda.time.Chronology) julianChronology16);
        org.joda.time.Chronology chronology18 = julianChronology16.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = julianChronology16.getZone();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime8.toMutableDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime8.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime20", (mutableDateTime13.compareTo(mutableDateTime20) == 0) == mutableDateTime13.equals(mutableDateTime20));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        int int15 = partial4.size();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField18 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Partial partial20 = new org.joda.time.Partial(chronology19);
        int[] intArray28 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray30 = delegatedDateTimeField18.add((org.joda.time.ReadablePartial) partial20, 0, intArray28, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Partial partial32 = partial20.without(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = partial32.getChronology();
        boolean boolean34 = partial4.equals((java.lang.Object) partial32);
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone36 = gregorianChronology35.getZone();
        org.joda.time.Partial partial37 = partial32.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology35);
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology38.era();
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology38);
        int int41 = localDate40.getEra();
        org.joda.time.LocalTime localTime42 = null;
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localDate40.toDateTime(localTime42, dateTimeZone44);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.DateTime.Property property48 = dateTime46.minuteOfHour();
        org.joda.time.DateTime dateTime50 = dateTime46.plus((long) (short) 10);
        int int51 = dateTime50.getYearOfCentury();
        boolean boolean52 = partial32.isMatch((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial4 and partial37", (partial4.compareTo(partial37) == 0) == partial4.equals(partial37));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.centuryOfEra();
        org.joda.time.DurationField durationField10 = iSOChronology8.months();
        long long12 = durationField10.getMillis((long) 1900);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField10);
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField15 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType14);
        org.joda.time.IllegalFieldValueException illegalFieldValueException17 = new org.joda.time.IllegalFieldValueException(durationFieldType14, "DurationField[months]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and unsupportedDurationField15", Math.signum(durationField10.compareTo(unsupportedDurationField15)) == -Math.signum(unsupportedDurationField15.compareTo(durationField10)));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        long long16 = delegatedDateTimeField2.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException21 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType17, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField23 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField2, dateTimeFieldType17, (-28800000));
        org.joda.time.DurationField durationField24 = offsetDateTimeField23.getDurationField();
        long long26 = offsetDateTimeField23.roundCeiling((long) (short) 1);
        int int28 = offsetDateTimeField23.getLeapAmount((long) (short) 100);
        long long30 = offsetDateTimeField23.roundFloor((long) (byte) 0);
        java.util.Locale locale32 = null;
        java.lang.String str33 = offsetDateTimeField23.getAsShortText(1711991517304L, locale32);
        long long36 = offsetDateTimeField23.addWrapField(2440588L, (int) (byte) 2);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Partial partial38 = new org.joda.time.Partial(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.Partial partial40 = partial38.minus(readablePeriod39);
        int[] intArray47 = new int[] { 100, (-292275055), (short) 10, (byte) 1, 100, 0 };
        int int48 = offsetDateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) partial40, intArray47);
        int[] intArray49 = partial40.getValues();
        org.joda.time.Chronology chronology50 = partial40.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        long long58 = dateTimeZone53.getMillisKeepLocal(dateTimeZone55, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology59 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology59.centuryOfEra();
        org.joda.time.DurationField durationField61 = iSOChronology59.months();
        long long63 = durationField61.getMillis((long) 1900);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField64 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType51, durationField61);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = unsupportedDateTimeField64.getType();
        org.joda.time.Partial partial67 = partial40.with(dateTimeFieldType65, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField61", Math.signum(durationField24.compareTo(durationField61)) == -Math.signum(durationField61.compareTo(durationField24)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.Chronology chronology4 = iSOChronology0.withUTC();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology4.years();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.centuryOfEra();
        org.joda.time.DurationField durationField17 = iSOChronology15.months();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.Partial partial19 = new org.joda.time.Partial(chronology18);
        int[] intArray22 = new int[] { (short) 100, (byte) 100 };
        iSOChronology15.validate((org.joda.time.ReadablePartial) partial19, intArray22);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField26 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Partial partial28 = new org.joda.time.Partial(chronology27);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField31 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Partial partial33 = new org.joda.time.Partial(chronology32);
        int[] intArray41 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray43 = delegatedDateTimeField31.add((org.joda.time.ReadablePartial) partial33, 0, intArray41, (int) (byte) -1);
        int int44 = delegatedDateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) partial28, intArray43);
        org.joda.time.chrono.ISOChronology iSOChronology46 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology46.era();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology46);
        org.joda.time.DateTime dateTime50 = dateTime48.minus((long) '#');
        int int51 = dateTime50.getYear();
        boolean boolean52 = partial28.isMatch((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology53.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField55 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.Partial partial57 = new org.joda.time.Partial(chronology56);
        org.joda.time.chrono.ISOChronology iSOChronology58 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology58.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField60 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Partial partial62 = new org.joda.time.Partial(chronology61);
        int[] intArray70 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray72 = delegatedDateTimeField60.add((org.joda.time.ReadablePartial) partial62, 0, intArray70, (int) (byte) -1);
        int int73 = delegatedDateTimeField55.getMinimumValue((org.joda.time.ReadablePartial) partial57, intArray72);
        org.joda.time.Partial partial74 = new org.joda.time.Partial(partial28, intArray72);
        chronology4.validate((org.joda.time.ReadablePartial) partial19, intArray72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField17", (durationField5.compareTo(durationField17) == 0) == durationField5.equals(durationField17));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int3 = localDate2.getEra();
        org.joda.time.LocalTime localTime4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4, dateTimeZone6);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime.Property property10 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Instant instant14 = instant12.withMillis(9972000000L);
        org.joda.time.Instant instant16 = instant14.withMillis((long) 60846156);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        int int15 = partial4.size();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField18 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Partial partial20 = new org.joda.time.Partial(chronology19);
        int[] intArray28 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray30 = delegatedDateTimeField18.add((org.joda.time.ReadablePartial) partial20, 0, intArray28, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Partial partial32 = partial20.without(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = partial32.getChronology();
        boolean boolean34 = partial4.equals((java.lang.Object) partial32);
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone36 = gregorianChronology35.getZone();
        org.joda.time.Partial partial37 = partial32.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology35);
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology35.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on partial4 and partial37", (partial4.compareTo(partial37) == 0) == partial4.equals(partial37));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int3 = localDate2.getEra();
        org.joda.time.LocalTime localTime4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4, dateTimeZone6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime(dateTimeZone10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime13.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(16);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((-292275054));
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTimeISO();
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology25.weekyear();
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str28 = iSOChronology27.toString();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology27.year();
        long long35 = iSOChronology27.getDateTimeMillis(0L, (int) (byte) 1, 0, 10, (int) 'a');
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology27);
        int int37 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDate36);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long44 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology45 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone41);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone46 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone41);
        org.joda.time.DateTime dateTime47 = localDate36.toDateTimeAtMidnight(dateTimeZone41);
        boolean boolean48 = instant23.equals((java.lang.Object) localDate36);
        long long49 = instant23.getMillis();
        org.joda.time.chrono.ISOChronology iSOChronology50 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology50.era();
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology50);
        int int53 = localDate52.getEra();
        long long54 = localDate52.getLocalMillis();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = localDate52.toDateTimeAtCurrentTime(dateTimeZone55);
        int int57 = instant23.compareTo((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean58 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and mutableDateTime24", (instant23.compareTo(mutableDateTime24) == 0) == instant23.equals(mutableDateTime24));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Partial partial16 = partial4.without(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = partial16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        long long20 = dateTimeZone18.convertUTCToLocal((long) (byte) 5);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeUtils.getZone(dateTimeZone18);
        org.joda.time.chrono.JulianChronology julianChronology22 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = julianChronology22.withZone(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        long long31 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology32.centuryOfEra();
        org.joda.time.DurationField durationField34 = iSOChronology32.months();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Partial partial36 = new org.joda.time.Partial(chronology35);
        int[] intArray39 = new int[] { (short) 100, (byte) 100 };
        iSOChronology32.validate((org.joda.time.ReadablePartial) partial36, intArray39);
        int[] intArray42 = julianChronology22.get((org.joda.time.ReadablePartial) partial36, 0L);
        java.lang.String str43 = julianChronology22.toString();
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField46 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Partial partial48 = new org.joda.time.Partial(chronology47);
        int[] intArray56 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray58 = delegatedDateTimeField46.add((org.joda.time.ReadablePartial) partial48, 0, intArray56, (int) (byte) -1);
        long long60 = delegatedDateTimeField46.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException65 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType61, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField67 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField46, dateTimeFieldType61, (-28800000));
        org.joda.time.DurationField durationField68 = offsetDateTimeField67.getDurationField();
        long long70 = offsetDateTimeField67.roundCeiling((long) (short) 1);
        int int72 = offsetDateTimeField67.getLeapAmount((long) (short) 100);
        long long74 = offsetDateTimeField67.roundFloor((long) (byte) 0);
        java.util.Locale locale76 = null;
        java.lang.String str77 = offsetDateTimeField67.getAsShortText((int) (byte) 18, locale76);
        long long79 = offsetDateTimeField67.roundHalfCeiling(43200000L);
        org.joda.time.DurationField durationField80 = offsetDateTimeField67.getRangeDurationField();
        org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField81 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology) julianChronology22, (org.joda.time.DateTimeField) offsetDateTimeField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField68", Math.signum(durationField34.compareTo(durationField68)) == -Math.signum(durationField68.compareTo(durationField34)));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test13");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.withZone(dateTimeZone3);
        int int6 = dateTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test14");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long9 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology10.centuryOfEra();
        org.joda.time.DurationField durationField12 = iSOChronology10.months();
        long long14 = durationField12.getMillis((long) 1900);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField15 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType2, durationField12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = unsupportedDateTimeField15.getType();
        java.lang.String str17 = unsupportedDateTimeField15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = unsupportedDateTimeField15.getType();
        org.joda.time.DateTime dateTime20 = dateTime1.withField(dateTimeFieldType18, 0);
        org.joda.time.IllegalFieldValueException illegalFieldValueException22 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType18, "hourOfDay");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test15");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        long long16 = delegatedDateTimeField2.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException21 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType17, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField23 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField2, dateTimeFieldType17, (-28800000));
        org.joda.time.DurationField durationField24 = offsetDateTimeField23.getDurationField();
        long long26 = offsetDateTimeField23.roundCeiling((long) (short) 1);
        int int28 = offsetDateTimeField23.getLeapAmount((long) (short) 100);
        long long30 = offsetDateTimeField23.roundFloor((long) (byte) 0);
        java.util.Locale locale32 = null;
        java.lang.String str33 = offsetDateTimeField23.getAsShortText(1711991517304L, locale32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = offsetDateTimeField23.getType();
        long long36 = offsetDateTimeField23.roundFloor(1711991546607L);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology38 = null;
        boolean boolean39 = durationFieldType37.isSupported(chronology38);
        org.joda.time.field.PreciseDurationField preciseDurationField41 = new org.joda.time.field.PreciseDurationField(durationFieldType37, (long) 9);
        long long43 = preciseDurationField41.getMillis(236);
        boolean boolean44 = preciseDurationField41.isPrecise();
        long long47 = preciseDurationField41.add(1711991567824L, 2000);
        boolean boolean48 = preciseDurationField41.isPrecise();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField50 = new org.joda.time.field.DelegatedDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField23, (org.joda.time.DurationField) preciseDurationField41, dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, preciseDurationField41, and durationField24", !(durationField24.compareTo(preciseDurationField41) == 0) || (Math.signum(durationField24.compareTo(durationField24)) == Math.signum(preciseDurationField41.compareTo(durationField24))));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test16");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField2 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Partial partial4 = new org.joda.time.Partial(chronology3);
        int[] intArray12 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray14 = delegatedDateTimeField2.add((org.joda.time.ReadablePartial) partial4, 0, intArray12, (int) (byte) -1);
        long long16 = delegatedDateTimeField2.roundHalfFloor((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException21 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType17, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField23 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField2, dateTimeFieldType17, (-28800000));
        org.joda.time.DurationField durationField24 = offsetDateTimeField23.getDurationField();
        long long26 = offsetDateTimeField23.roundCeiling((long) (short) 1);
        long long28 = offsetDateTimeField23.roundHalfEven(41731200000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = offsetDateTimeField23.getType();
        int int31 = offsetDateTimeField23.get((long) (short) 1);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        long long38 = dateTimeZone33.getMillisKeepLocal(dateTimeZone35, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.centuryOfEra();
        org.joda.time.DurationField durationField41 = iSOChronology39.months();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology39.hourOfHalfday();
        long long45 = dateTimeField42.addWrapField(1711929600000L, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField48 = new org.joda.time.field.DividedDateTimeField(dateTimeField42, dateTimeFieldType46, (int) (byte) 16);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException52 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType49, "60846156");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField53 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField48, dateTimeFieldType49);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField55 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField23, dateTimeFieldType49, 36779);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField41", Math.signum(durationField24.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField24)));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test17");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTime.Property property4 = dateTime3.weekOfWeekyear();
        org.joda.time.DateTime dateTime5 = property4.withMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTimeISO();
        org.joda.time.Instant instant7 = dateTime5.toInstant();
        int int8 = dateTime5.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant7", (mutableDateTime6.compareTo(instant7) == 0) == mutableDateTime6.equals(instant7));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test18");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = instant0.getZone();
        org.joda.time.Instant instant4 = instant0.plus((long) 2);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(10L);
        int int9 = localDate8.size();
        org.joda.time.DateTimeField dateTimeField11 = localDate8.getField(0);
        boolean boolean12 = readableInterval6.equals((java.lang.Object) localDate8);
        long long13 = readableInterval6.getStartMillis();
        org.joda.time.Duration duration14 = readableInterval6.toDuration();
        org.joda.time.Instant instant15 = instant0.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.Instant instant18 = instant15.withDurationAdded((long) 457, 136);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime1", (instant15.compareTo(dateTime1) == 0) == instant15.equals(dateTime1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test19");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int4 = localDate2.getValue(0);
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.halfdays();
        boolean boolean7 = localDate2.equals((java.lang.Object) durationField6);
        org.joda.time.LocalDate.Property property8 = localDate2.era();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfMonth();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone26 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone21);
        org.joda.time.Chronology chronology27 = iSOChronology16.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone26);
        long long29 = cachedDateTimeZone26.previousTransition((long) (short) 0);
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.era();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology30);
        int int33 = localDate32.getEra();
        long long34 = localDate32.getLocalMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.chrono.GJChronology gJChronology37 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone26, (org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException42 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType38, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        java.lang.Number number43 = illegalFieldValueException42.getIllegalNumberValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException48 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType44, (java.lang.Number) (short) 10, (java.lang.Number) 15L, (java.lang.Number) 100.0d);
        java.lang.Number number49 = illegalFieldValueException48.getIllegalNumberValue();
        illegalFieldValueException42.addSuppressed((java.lang.Throwable) illegalFieldValueException48);
        boolean boolean51 = cachedDateTimeZone26.equals((java.lang.Object) illegalFieldValueException48);
        long long54 = cachedDateTimeZone26.convertLocalToUTC(1711991548108L, true);
        org.joda.time.DateTime dateTime55 = localDate2.toDateTimeAtStartOfDay((org.joda.time.DateTimeZone) cachedDateTimeZone26);
        org.joda.time.chrono.ISOChronology iSOChronology57 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology57.era();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology57);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        long long61 = dateTime59.getMillis();
        org.joda.time.DateTime.Property property62 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime64 = dateTime59.plusMillis(3);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime59.toMutableDateTime();
        org.joda.time.Instant instant66 = new org.joda.time.Instant();
        boolean boolean68 = instant66.isBefore((long) ' ');
        org.joda.time.Instant instant71 = instant66.withDurationAdded((long) '4', (int) 'a');
        boolean boolean72 = dateTime59.isBefore((org.joda.time.ReadableInstant) instant66);
        org.joda.time.chrono.GJChronology gJChronology73 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone26, (org.joda.time.ReadableInstant) instant66);
        org.joda.time.Chronology chronology74 = gJChronology73.withUTC();
        org.joda.time.Partial partial75 = new org.joda.time.Partial((org.joda.time.Chronology) gJChronology73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant66", (dateTime36.compareTo(instant66) == 0) == dateTime36.equals(instant66));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test20");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTime dateTime5 = dateTime3.minus((long) '#');
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfDay();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone15 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = cachedDateTimeZone15.getUncachedZone();
        long long18 = cachedDateTimeZone15.nextTransition((long) (-28799999));
        org.joda.time.DateTime dateTime19 = dateTime5.toDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone15);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime22 = dateTime19.withDayOfMonth(20);
        boolean boolean23 = dateTime19.isAfterNow();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology24);
        int int27 = localDate26.getEra();
        org.joda.time.LocalTime localTime28 = null;
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDate26.toDateTime(localTime28, dateTimeZone30);
        java.lang.String str33 = dateTime32.toString();
        org.joda.time.DateTime.Property property34 = dateTime32.minuteOfHour();
        org.joda.time.DateTime dateTime36 = dateTime32.minusMonths(20);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        boolean boolean39 = instant37.isBefore((long) ' ');
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant37.minus(readableDuration40);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(10L);
        int int46 = localDate45.size();
        org.joda.time.DateTimeField dateTimeField48 = localDate45.getField(0);
        boolean boolean49 = readableInterval43.equals((java.lang.Object) localDate45);
        long long50 = readableInterval43.getStartMillis();
        org.joda.time.Duration duration51 = readableInterval43.toDuration();
        org.joda.time.Instant instant52 = instant37.plus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime54 = dateTime32.withDurationAdded((org.joda.time.ReadableDuration) duration51, 60846);
        long long55 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration51);
        org.joda.time.DateTime dateTime57 = dateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration51, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean59 = dateTime19.isSupported(dateTimeFieldType58);
        org.joda.time.DateTime dateTime60 = dateTime19.toDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology62 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField63 = iSOChronology62.era();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology62);
        org.joda.time.DateTime dateTime66 = dateTime64.minus((long) '#');
        org.joda.time.DateTime.Property property67 = dateTime66.millisOfDay();
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone71);
        long long74 = dateTimeZone69.getMillisKeepLocal(dateTimeZone71, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology75 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone71);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone76 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone77 = cachedDateTimeZone76.getUncachedZone();
        long long79 = cachedDateTimeZone76.nextTransition((long) (-28799999));
        org.joda.time.DateTime dateTime80 = dateTime66.toDateTime((org.joda.time.DateTimeZone) cachedDateTimeZone76);
        org.joda.time.DateTime.Property property81 = dateTime80.weekyear();
        boolean boolean82 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant37", (dateTime32.compareTo(instant37) == 0) == dateTime32.equals(instant37));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test21");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology1);
        int int4 = localDate3.getEra();
        org.joda.time.LocalTime localTime5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate3.toDateTime(localTime5, dateTimeZone7);
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfMinute();
        boolean boolean12 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime.Property property13 = dateTime9.dayOfYear();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.era();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology14);
        int int17 = localDate16.getEra();
        org.joda.time.LocalTime localTime18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTime(localTime18, dateTimeZone20);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime22.toMutableDateTime(dateTimeZone24);
        int int28 = dateTime22.getDayOfMonth();
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTimeISO();
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology31.era();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology31);
        org.joda.time.DateTime dateTime35 = dateTime33.minus((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime33.withDurationAdded(0L, 20);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime41 = dateTime29.plus(5L);
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str43 = iSOChronology42.toString();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology42.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone45 = iSOChronology42.getZone();
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime29.toMutableDateTime(dateTimeZone45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime9.toMutableDateTime(dateTimeZone45);
        boolean boolean48 = mutableDateTime47.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test22");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int3 = localDate2.getEra();
        org.joda.time.LocalTime localTime4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4, dateTimeZone6);
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.era();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology9);
        int int12 = localDate11.getEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.LocalDate localDate16 = localDate14.withLocalMillis((long) 0);
        org.joda.time.Chronology chronology17 = localDate14.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime8.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTime dateTime20 = dateTime18.plusWeeks(59);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTimeISO();
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        boolean boolean26 = instant24.isBefore((long) ' ');
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant24.minus(readableDuration27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(10L);
        int int33 = localDate32.size();
        org.joda.time.DateTimeField dateTimeField35 = localDate32.getField(0);
        boolean boolean36 = readableInterval30.equals((java.lang.Object) localDate32);
        long long37 = readableInterval30.getStartMillis();
        org.joda.time.Duration duration38 = readableInterval30.toDuration();
        org.joda.time.Instant instant39 = instant24.plus((org.joda.time.ReadableDuration) duration38);
        long long40 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime42 = dateTime22.withDurationAdded((org.joda.time.ReadableDuration) duration38, 19);
        org.joda.time.DateTime dateTime43 = dateTime18.minus((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and instant21", (dateTime43.compareTo(instant21) == 0) == dateTime43.equals(instant21));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test23");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        int int3 = localDate2.getEra();
        org.joda.time.LocalTime localTime4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4, dateTimeZone6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.util.TimeZone timeZone12 = dateTimeZone10.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime(dateTimeZone10);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime18 = mutableDateTime13.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(16);
        org.joda.time.DateTime dateTime22 = dateTime18.minusWeeks(4);
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        int int24 = copticChronology23.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology23.clockhourOfDay();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(5L);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology28.era();
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology28);
        int int31 = localDate30.getEra();
        org.joda.time.LocalTime localTime32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate30.toDateTime(localTime32, dateTimeZone34);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        java.util.TimeZone timeZone40 = dateTimeZone38.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone38);
        int int42 = dateTime36.getDayOfMonth();
        org.joda.time.DateTime dateTime44 = dateTime36.withMonthOfYear((int) (byte) 9);
        org.joda.time.chrono.LimitChronology limitChronology45 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology) copticChronology23, (org.joda.time.ReadableDateTime) dateTime27, (org.joda.time.ReadableDateTime) dateTime44);
        org.joda.time.Chronology chronology46 = limitChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField47 = limitChronology45.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Chronology chronology49 = null;
        boolean boolean50 = durationFieldType48.isSupported(chronology49);
        org.joda.time.field.PreciseDurationField preciseDurationField52 = new org.joda.time.field.PreciseDurationField(durationFieldType48, (long) 9);
        boolean boolean53 = limitChronology45.equals((java.lang.Object) durationFieldType48);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime18.toMutableDateTime((org.joda.time.Chronology) limitChronology45);
        org.joda.time.DateTime dateTime56 = dateTime18.withMillis(2219681613240000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime54", (dateTime8.compareTo(mutableDateTime54) == 0) == dateTime8.equals(mutableDateTime54));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test24");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalTime localTime3 = null;
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone8 = new org.joda.time.tz.FixedDateTimeZone("DateTimeField[era]", "hi!", (int) 'a', (int) (byte) 9);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTime(localTime3, (org.joda.time.DateTimeZone) fixedDateTimeZone8);
        long long10 = localDate2.getLocalMillis();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime12 = localDate2.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears(2824);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTime dateTime20 = dateTime18.minus((long) '#');
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DateTime.Property property22 = dateTime20.yearOfEra();
        org.joda.time.DateTime dateTime23 = property22.getDateTime();
        int int24 = dateTime23.getDayOfWeek();
        boolean boolean25 = dateTime23.isBeforeNow();
        int int26 = dateTime23.getYearOfCentury();
        boolean boolean27 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime12", (dateTime9.compareTo(dateTime12) == 0) == dateTime9.equals(dateTime12));
    }
}

