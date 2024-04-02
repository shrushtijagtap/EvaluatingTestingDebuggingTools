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
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.yearOfEra();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.Partial partial10 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = partial10.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Partial partial13 = partial10.minus(readablePeriod12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        java.lang.String str18 = localDate17.toString();
        int int19 = partial13.compareTo((org.joda.time.ReadablePartial) localDate17);
        boolean boolean20 = gregorianChronology0.equals((java.lang.Object) localDate17);
        org.joda.time.DurationField durationField21 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology0.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField21", Math.signum(durationField1.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField1)));
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
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime8.minusHours((-1));
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears((int) (byte) 10);
        int int14 = dateTime13.getSecondOfDay();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfWeek();
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology16.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = julianChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology18.getZone();
        boolean boolean21 = julianChronology16.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant23);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekOfWeekyear();
        java.util.Locale locale26 = null;
        int int27 = dateTimeField25.getMaximumShortTextLength(locale26);
        long long30 = dateTimeField25.addWrapField(10L, 1);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant31);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.clockhourOfDay();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, (int) (short) 10);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(0);
        int[] intArray45 = new int[] { (-28800000), 0, 21, (-28800000) };
        int[] intArray47 = dateTimeField25.add((org.joda.time.ReadablePartial) localDate37, 0, intArray45, (int) (short) 0);
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant48);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfDay();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDate localDate54 = localDate51.withPeriodAdded(readablePeriod52, (int) (short) 10);
        org.joda.time.Partial partial55 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = partial55.getFieldTypes();
        boolean boolean57 = localDate37.equals((java.lang.Object) partial55);
        org.joda.time.DateTime dateTime58 = dateTime13.withFields((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate60 = localDate37.plusMonths((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime22", (dateTime13.compareTo(dateTime22) == 0) == dateTime13.equals(dateTime22));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.yearOfEra();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.Partial partial10 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = partial10.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Partial partial13 = partial10.minus(readablePeriod12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        java.lang.String str18 = localDate17.toString();
        int int19 = partial13.compareTo((org.joda.time.ReadablePartial) localDate17);
        boolean boolean20 = gregorianChronology0.equals((java.lang.Object) localDate17);
        org.joda.time.DurationField durationField21 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology0.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField21", Math.signum(durationField1.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField1)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone2 = gJChronology0.getZone();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate9.plusDays((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) (short) 10);
        org.joda.time.Interval interval28 = localDate24.toInterval(dateTimeZone25);
        boolean boolean29 = localDate13.isAfter((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = gregorianChronology30.minutes();
        org.joda.time.DateTimeField dateTimeField32 = gregorianChronology30.yearOfEra();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant33);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfDay();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(chronology34);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate39 = localDate36.withPeriodAdded(readablePeriod37, (int) (short) 10);
        org.joda.time.Partial partial40 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = partial40.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.Partial partial43 = partial40.minus(readablePeriod42);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant44);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfDay();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology45);
        java.lang.String str48 = localDate47.toString();
        int int49 = partial43.compareTo((org.joda.time.ReadablePartial) localDate47);
        boolean boolean50 = gregorianChronology30.equals((java.lang.Object) localDate47);
        int int51 = localDate13.compareTo((org.joda.time.ReadablePartial) localDate47);
        long long53 = gJChronology0.set((org.joda.time.ReadablePartial) localDate13, 2699186760000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField31", Math.signum(durationField1.compareTo(durationField31)) == -Math.signum(durationField31.compareTo(durationField1)));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.yearOfEra();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.Partial partial10 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = partial10.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.Partial partial13 = partial10.minus(readablePeriod12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        java.lang.String str18 = localDate17.toString();
        int int19 = partial13.compareTo((org.joda.time.ReadablePartial) localDate17);
        boolean boolean20 = gregorianChronology0.equals((java.lang.Object) localDate17);
        org.joda.time.DurationField durationField21 = gregorianChronology0.eras();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology0.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField21", Math.signum(durationField1.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField1)));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = julianChronology1.weekOfWeekyear();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((org.joda.time.Chronology) julianChronology1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now((org.joda.time.Chronology) julianChronology1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.Chronology chronology7 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant6);
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate12 = localDate9.withPeriodAdded(readablePeriod10, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) (short) 10);
        org.joda.time.Interval interval20 = localDate16.toInterval(dateTimeZone17);
        long long21 = interval20.getStartMillis();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = interval20.toPeriod(periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.IllegalFieldValueException illegalFieldValueException28 = new org.joda.time.IllegalFieldValueException(durationFieldType24, (java.lang.Number) (-10), (java.lang.Number) 100, (java.lang.Number) 1L);
        java.lang.String str29 = durationFieldType24.getName();
        int int30 = period23.get(durationFieldType24);
        org.joda.time.Period period31 = period23.toPeriod();
        int[] intArray34 = julianChronology1.get((org.joda.time.ReadablePeriod) period31, 230399999L, (-210866760000000L));
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfDay();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant39);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.clockhourOfDay();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(chronology40);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDate localDate45 = localDate42.withPeriodAdded(readablePeriod43, (int) (short) 10);
        org.joda.time.Partial partial46 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = partial46.getFieldTypes();
        int[] intArray48 = partial46.getValues();
        julianChronology1.validate((org.joda.time.ReadablePartial) localDate38, intArray48);
        org.joda.time.DateTimeField dateTimeField50 = julianChronology1.millisOfSecond();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 'a', (org.joda.time.Chronology) julianChronology1);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant52);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.clockhourOfDay();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.DurationField durationField56 = chronology53.months();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        long long60 = chronology53.add(readablePeriod57, 604800010L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField61 = chronology53.dayOfWeek();
        org.joda.time.DateTime dateTime62 = dateTime51.toDateTime(chronology53);
        org.joda.time.DateTime.Property property63 = dateTime51.millisOfDay();
        org.joda.time.chrono.GJChronology gJChronology64 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField65 = gJChronology64.eras();
        org.joda.time.Chronology chronology66 = gJChronology64.withUTC();
        org.joda.time.DateTime dateTime67 = dateTime51.toDateTime(chronology66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField56 and durationField65", Math.signum(durationField56.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField56)));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        int int2 = instant0.compareTo((org.joda.time.ReadableInstant) instant1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        int int14 = instant1.get(dateTimeFieldType12);
        org.joda.time.Instant instant17 = instant1.withDurationAdded(6L, (-1));
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant18);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfDay();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.plusSeconds((int) (short) 1);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant30);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate36 = localDate33.withPeriodAdded(readablePeriod34, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = localDate36.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone37);
        org.joda.time.Chronology chronology40 = gJChronology39.withUTC();
        org.joda.time.DateTime dateTime41 = dateTime26.withChronology((org.joda.time.Chronology) gJChronology39);
        org.joda.time.chrono.GregorianChronology gregorianChronology42 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = gregorianChronology42.minutes();
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology42.yearOfEra();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant45);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate48.withPeriodAdded(readablePeriod49, (int) (short) 10);
        org.joda.time.Partial partial52 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate48);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray53 = partial52.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.Partial partial55 = partial52.minus(readablePeriod54);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Chronology chronology57 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant56);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.clockhourOfDay();
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(chronology57);
        java.lang.String str60 = localDate59.toString();
        int int61 = partial55.compareTo((org.joda.time.ReadablePartial) localDate59);
        boolean boolean62 = gregorianChronology42.equals((java.lang.Object) localDate59);
        org.joda.time.Interval interval63 = localDate59.toInterval();
        org.joda.time.Duration duration64 = interval63.toDuration();
        org.joda.time.DateTime dateTime65 = dateTime41.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant67 = instant1.withDurationAdded((org.joda.time.ReadableDuration) duration64, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime41", (dateTime11.compareTo(dateTime41) == 0) == dateTime11.equals(dateTime41));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.weekOfWeekyear();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        long long25 = dateTimeZone21.adjustOffset(0L, true);
        long long27 = dateTimeZone21.convertUTCToLocal((-2699186760000000L));
        org.joda.time.Chronology chronology28 = gJChronology9.withZone(dateTimeZone21);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant29);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfDay();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate35 = localDate32.withPeriodAdded(readablePeriod33, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime37 = localDate35.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate35.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean42 = dateTimeZone40.isStandardOffset((long) (short) 10);
        org.joda.time.Interval interval43 = localDate39.toInterval(dateTimeZone40);
        org.joda.time.chrono.ZonedChronology zonedChronology44 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gJChronology9, dateTimeZone40);
        org.joda.time.chrono.GregorianChronology gregorianChronology46 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = gregorianChronology46.minutes();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        long long51 = gregorianChronology46.add(readablePeriod48, (-230400000L), 0);
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant52);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.clockhourOfDay();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology53);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDate localDate58 = localDate55.withPeriodAdded(readablePeriod56, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = localDate58.toDateTimeAtMidnight(dateTimeZone59);
        long long63 = dateTimeZone59.adjustOffset(0L, true);
        org.joda.time.Chronology chronology64 = gregorianChronology46.withZone(dateTimeZone59);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 4, dateTimeZone59);
        org.joda.time.Chronology chronology66 = zonedChronology44.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField47", Math.signum(durationField11.compareTo(durationField47)) == -Math.signum(durationField47.compareTo(durationField11)));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        int int2 = instant0.compareTo((org.joda.time.ReadableInstant) instant1);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, 24);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        org.joda.time.Instant instant17 = dateTime15.toInstant();
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = gregorianChronology18.minutes();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.yearOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant21);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfDay();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate27 = localDate24.withPeriodAdded(readablePeriod25, (int) (short) 10);
        org.joda.time.Partial partial28 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial28.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.Partial partial31 = partial28.minus(readablePeriod30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant32);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfDay();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology33);
        java.lang.String str36 = localDate35.toString();
        int int37 = partial31.compareTo((org.joda.time.ReadablePartial) localDate35);
        boolean boolean38 = gregorianChronology18.equals((java.lang.Object) localDate35);
        org.joda.time.Interval interval39 = localDate35.toInterval();
        org.joda.time.Duration duration40 = interval39.toDuration();
        org.joda.time.Instant instant41 = instant17.minus((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Instant instant42 = instant6.minus((org.joda.time.ReadableDuration) duration40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant17", (dateTime15.compareTo(instant17) == 0) == dateTime15.equals(instant17));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField14, and durationField11", !(durationField11.compareTo(durationField14) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField14.compareTo(durationField11))));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.chrono.JulianChronology julianChronology1 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = julianChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone3 = julianChronology1.getZone();
        org.joda.time.Chronology chronology4 = julianChronology1.withUTC();
        org.joda.time.DurationField durationField5 = chronology4.millis();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 53, chronology4);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant7);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate13 = localDate10.withPeriodAdded(readablePeriod11, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField19 = gJChronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = gJChronology18.millis();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology18.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant22);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(chronology23);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate28 = localDate25.withPeriodAdded(readablePeriod26, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant29);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfDay();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate35 = localDate32.withPeriodAdded(readablePeriod33, (int) (short) 10);
        org.joda.time.Partial partial36 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate32);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = partial36.getFieldTypes();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField44 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, durationField41, dateTimeFieldType42, (int) '4');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant45);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.clockhourOfDay();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(chronology46);
        java.lang.String str49 = localDate48.toString();
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant50);
        org.joda.time.DateTimeField dateTimeField52 = chronology51.clockhourOfDay();
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant53);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.clockhourOfDay();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(chronology54);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDate localDate59 = localDate56.withPeriodAdded(readablePeriod57, (int) (short) 10);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant60);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.clockhourOfDay();
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate(chronology61);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDate localDate66 = localDate63.withPeriodAdded(readablePeriod64, (int) (short) 10);
        org.joda.time.Partial partial67 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate63);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = partial67.getFieldTypes();
        int[] intArray69 = partial67.getValues();
        int int70 = dateTimeField52.getMinimumValue((org.joda.time.ReadablePartial) localDate56, intArray69);
        int int71 = dividedDateTimeField44.getMaximumValue((org.joda.time.ReadablePartial) localDate48, intArray69);
        org.joda.time.Partial partial72 = new org.joda.time.Partial(dateTimeFieldTypeArray37, intArray69);
        int int73 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localDate25, intArray69);
        int int74 = localDate6.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField20", (durationField5.compareTo(durationField20) == 0) == durationField5.equals(durationField20));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isAfter((org.joda.time.ReadableInstant) instant1);
        org.joda.time.Instant instant4 = instant1.withMillis((long) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("0", "DateTimeField[secondOfDay]", 100, 3600);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant10);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfDay();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology11);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate16 = localDate13.withPeriodAdded(readablePeriod14, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = localDate16.toDateTimeAtMidnight(dateTimeZone17);
        int int19 = dateTime18.getCenturyOfEra();
        int int20 = dateTime18.getMinuteOfDay();
        int int21 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime();
        boolean boolean23 = fixedDateTimeZone9.equals((java.lang.Object) dateTime18);
        boolean boolean24 = fixedDateTimeZone9.isFixed();
        int int26 = fixedDateTimeZone9.getOffset(99L);
        org.joda.time.MutableDateTime mutableDateTime27 = instant1.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant28);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.clockhourOfDay();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology29);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate34 = localDate31.withPeriodAdded(readablePeriod32, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = localDate34.toDateTimeAtMidnight(dateTimeZone35);
        int int37 = dateTime36.getCenturyOfEra();
        int int38 = dateTime36.getMinuteOfDay();
        int int39 = dateTime36.getMinuteOfDay();
        org.joda.time.DateTime dateTime41 = dateTime36.minusHours((int) '#');
        int int42 = dateTime36.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime36.minusMonths((int) (short) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology45 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField46 = gregorianChronology45.minutes();
        org.joda.time.DateTimeField dateTimeField47 = gregorianChronology45.yearOfEra();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant48);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.clockhourOfDay();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDate localDate54 = localDate51.withPeriodAdded(readablePeriod52, (int) (short) 10);
        org.joda.time.Partial partial55 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate51);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = partial55.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.Partial partial58 = partial55.minus(readablePeriod57);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant59);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.clockhourOfDay();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(chronology60);
        java.lang.String str63 = localDate62.toString();
        int int64 = partial58.compareTo((org.joda.time.ReadablePartial) localDate62);
        boolean boolean65 = gregorianChronology45.equals((java.lang.Object) localDate62);
        org.joda.time.Interval interval66 = localDate62.toInterval();
        org.joda.time.Duration duration67 = interval66.toDuration();
        org.joda.time.DateTime dateTime68 = dateTime36.plus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Instant instant69 = instant1.minus((org.joda.time.ReadableDuration) duration67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime27", (instant0.compareTo(mutableDateTime27) == 0) == instant0.equals(mutableDateTime27));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology9.centuryOfEra();
        org.joda.time.DurationField durationField16 = gJChronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField16, and durationField11", !(durationField11.compareTo(durationField16) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField16.compareTo(durationField11))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isAfter((org.joda.time.ReadableInstant) instant1);
        org.joda.time.Instant instant4 = instant0.withMillis((-151478629092000L));
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant5);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.clockhourOfDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDate localDate11 = localDate8.withPeriodAdded(readablePeriod9, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = gregorianChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology16.yearOfEra();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant19);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfDay();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate25 = localDate22.withPeriodAdded(readablePeriod23, (int) (short) 10);
        org.joda.time.Partial partial26 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = partial26.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Partial partial29 = partial26.minus(readablePeriod28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant30);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology31);
        java.lang.String str34 = localDate33.toString();
        int int35 = partial29.compareTo((org.joda.time.ReadablePartial) localDate33);
        boolean boolean36 = gregorianChronology16.equals((java.lang.Object) localDate33);
        org.joda.time.Interval interval37 = localDate33.toInterval();
        org.joda.time.Duration duration38 = interval37.toDuration();
        org.joda.time.Instant instant39 = instant15.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Instant instant40 = instant4.plus((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        int int2 = instant0.compareTo((org.joda.time.ReadableInstant) instant1);
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate10 = localDate7.withPeriodAdded(readablePeriod8, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtMidnight(dateTimeZone11);
        int int13 = dateTime12.getCenturyOfEra();
        int int14 = dateTime12.getMinuteOfDay();
        int int15 = dateTime12.getMinuteOfDay();
        org.joda.time.DateTime dateTime17 = dateTime12.minusHours((int) '#');
        int int18 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime12.minusMonths((int) (short) 1);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = gregorianChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology21.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant24);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.clockhourOfDay();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate30 = localDate27.withPeriodAdded(readablePeriod28, (int) (short) 10);
        org.joda.time.Partial partial31 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = partial31.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.Partial partial34 = partial31.minus(readablePeriod33);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.clockhourOfDay();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology36);
        java.lang.String str39 = localDate38.toString();
        int int40 = partial34.compareTo((org.joda.time.ReadablePartial) localDate38);
        boolean boolean41 = gregorianChronology21.equals((java.lang.Object) localDate38);
        org.joda.time.Interval interval42 = localDate38.toInterval();
        org.joda.time.Duration duration43 = interval42.toDuration();
        org.joda.time.DateTime dateTime44 = dateTime12.plus((org.joda.time.ReadableDuration) duration43);
        boolean boolean45 = instant1.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = gJChronology9.eras();
        org.joda.time.DurationField durationField15 = gJChronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField15, and durationField11", !(durationField11.compareTo(durationField15) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField15.compareTo(durationField11))));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.hourOfHalfday();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant3);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate9 = localDate6.withPeriodAdded(readablePeriod7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10);
        org.joda.time.Chronology chronology13 = gJChronology12.withUTC();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant14);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate17.withPeriodAdded(readablePeriod18, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.minusMonths((int) 'a');
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant25);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField31 = new org.joda.time.field.DividedDateTimeField(dateTimeField27, durationField28, dateTimeFieldType29, (int) '4');
        boolean boolean32 = dividedDateTimeField31.isSupported();
        org.joda.time.DurationField durationField33 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField35 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField31, durationField33, dateTimeFieldType34);
        int int37 = dividedDateTimeField31.getMaximumValue(97L);
        long long40 = dividedDateTimeField31.addWrapField(100L, (int) (byte) 10);
        org.joda.time.DurationField durationField41 = dividedDateTimeField31.getRangeDurationField();
        boolean boolean42 = localDate20.equals((java.lang.Object) durationField41);
        long long44 = chronology13.set((org.joda.time.ReadablePartial) localDate20, 6L);
        org.joda.time.Interval interval45 = localDate20.toInterval();
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate20, 0, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField41", Math.signum(durationField1.compareTo(durationField41)) == -Math.signum(durationField41.compareTo(durationField1)));
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
        long long11 = dateTimeZone7.adjustOffset(0L, true);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        int int14 = instant12.compareTo((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant13);
        long long17 = instant13.getMillis();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant18);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.clockhourOfDay();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate24 = localDate21.withPeriodAdded(readablePeriod22, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.Instant instant28 = dateTime26.toInstant();
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = gregorianChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology29.yearOfEra();
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant32);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfDay();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(chronology33);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate38 = localDate35.withPeriodAdded(readablePeriod36, (int) (short) 10);
        org.joda.time.Partial partial39 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = partial39.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.Partial partial42 = partial39.minus(readablePeriod41);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant43);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.clockhourOfDay();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(chronology44);
        java.lang.String str47 = localDate46.toString();
        int int48 = partial42.compareTo((org.joda.time.ReadablePartial) localDate46);
        boolean boolean49 = gregorianChronology29.equals((java.lang.Object) localDate46);
        org.joda.time.Interval interval50 = localDate46.toInterval();
        org.joda.time.Duration duration51 = interval50.toDuration();
        org.joda.time.Instant instant52 = instant28.minus((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Instant instant53 = instant13.plus((org.joda.time.ReadableDuration) duration51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant28", (dateTime8.compareTo(instant28) == 0) == dateTime8.equals(instant28));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.minuteOfHour();
        org.joda.time.Chronology chronology13 = gJChronology9.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField14, and durationField11", !(durationField11.compareTo(durationField14) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField14.compareTo(durationField11))));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.Partial partial7 = new org.joda.time.Partial((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = partial7.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.Partial partial10 = partial7.minus(readablePeriod9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.clockhourOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology12);
        java.lang.String str15 = localDate14.toString();
        int int16 = partial10.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfDay();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate23.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) (short) 10);
        org.joda.time.Interval interval31 = localDate27.toInterval(dateTimeZone28);
        long long32 = interval31.getStartMillis();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = interval31.toPeriod(periodType33);
        org.joda.time.Partial partial35 = partial10.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = partial10.getFieldTypes();
        org.joda.time.chrono.JulianChronology julianChronology37 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = julianChronology37.years();
        org.joda.time.DateTimeField dateTimeField39 = julianChronology37.secondOfDay();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant40);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant44);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfDay();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(chronology45);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate50 = localDate47.withPeriodAdded(readablePeriod48, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtMidnight(dateTimeZone51);
        org.joda.time.chrono.GJChronology gJChronology53 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone51);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gJChronology53);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localDate54, 0, locale56);
        int int58 = localDate54.getDayOfWeek();
        org.joda.time.LocalDate localDate60 = localDate54.minusMonths(3);
        int[] intArray62 = julianChronology37.get((org.joda.time.ReadablePartial) localDate54, 0L);
        org.joda.time.Partial partial63 = new org.joda.time.Partial(dateTimeFieldTypeArray36, intArray62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate3 and localDate54", (localDate3.compareTo(localDate54) == 0) == localDate3.equals(localDate54));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = org.joda.time.DateTimeUtils.getInstantChronology(readableInstant0);
        org.joda.time.DateTimeField dateTimeField2 = chronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate6 = localDate3.withPeriodAdded(readablePeriod4, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime8.minusHours((-1));
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears((int) (byte) 10);
        int int14 = dateTime13.getSecondOfDay();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfWeek();
        org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = julianChronology16.weekOfWeekyear();
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = julianChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone20 = julianChronology18.getZone();
        boolean boolean21 = julianChronology16.equals((java.lang.Object) dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime13.toDateTime(dateTimeZone20);
        boolean boolean23 = dateTime13.isAfterNow();
        org.joda.time.DateTime dateTime25 = dateTime13.minusHours(19);
        int int26 = dateTime25.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime22", (dateTime13.compareTo(dateTime22) == 0) == dateTime13.equals(dateTime22));
    }
}

