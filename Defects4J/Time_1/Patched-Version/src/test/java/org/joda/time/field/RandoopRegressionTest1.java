package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test501");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        int int38 = partial14.compareTo((org.joda.time.ReadablePartial) partial28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = partial14.toString("year");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test502");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.Partial partial6 = new org.joda.time.Partial((org.joda.time.Chronology) zonedChronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = partial6.getFieldTypes();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test503");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.minuteOfDay();
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField14 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long17 = durationField14.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long19 = durationField14.getValueAsLong((long) 10);
        int int21 = durationField14.getValue((long) (byte) 10);
        boolean boolean22 = partial13.equals((java.lang.Object) durationField14);
        org.joda.time.Chronology chronology23 = partial13.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        boolean boolean25 = partial13.isBefore((org.joda.time.ReadablePartial) partial24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = partial13.getFieldTypes();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField28 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long31 = durationField28.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long33 = durationField28.getValueAsLong((long) 10);
        int int35 = durationField28.getValue((long) (byte) 10);
        boolean boolean36 = partial27.equals((java.lang.Object) durationField28);
        org.joda.time.Chronology chronology37 = partial27.getChronology();
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        boolean boolean39 = partial27.isBefore((org.joda.time.ReadablePartial) partial38);
        int int40 = partial13.compareTo((org.joda.time.ReadablePartial) partial27);
        org.joda.time.Partial partial41 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField42 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long45 = durationField42.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long47 = durationField42.getValueAsLong((long) 10);
        int int49 = durationField42.getValue((long) (byte) 10);
        boolean boolean50 = partial41.equals((java.lang.Object) durationField42);
        int int51 = partial27.compareTo((org.joda.time.ReadablePartial) partial41);
        int[] intArray52 = partial41.getValues();
        int[] intArray53 = partial41.getValues();
        org.joda.time.Partial partial54 = new org.joda.time.Partial();
        int[] intArray55 = partial54.getValues();
        iSOChronology0.validate((org.joda.time.ReadablePartial) partial41, intArray55);
        int[] intArray57 = partial41.getValues();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeUtils.getZone(dateTimeZone0);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone5 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = cachedDateTimeZone5.getUncachedZone();
        org.joda.time.DateTimeZone dateTimeZone7 = cachedDateTimeZone5.getUncachedZone();
        int int9 = cachedDateTimeZone5.getOffset((-110602L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(cachedDateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test505");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        boolean boolean12 = offsetDateTimeField11.isSupported();
        long long14 = offsetDateTimeField11.remainder((long) 53460006);
        long long16 = offsetDateTimeField11.roundHalfFloor(1711909507403L);
        int int18 = offsetDateTimeField11.get(551169L);
        long long20 = offsetDateTimeField11.roundFloor((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField25 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField11, dateTimeFieldType21, (int) '#', (int) (byte) 10, 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField29 = iSOChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology28.halfdayOfDay();
        org.joda.time.Partial partial35 = new org.joda.time.Partial(dateTimeFieldType26, 10, (org.joda.time.Chronology) iSOChronology28);
        int int36 = partial35.size();
        java.lang.String str37 = partial35.toString();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField40 = iSOChronology39.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology39, dateTimeZone41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        boolean boolean47 = readableInterval45.contains(readableInterval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = readableInterval45.toPeriod(periodType48);
        org.joda.time.DateTime dateTime50 = readableInterval45.getEnd();
        org.joda.time.MutableInterval mutableInterval51 = readableInterval45.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.ReadableInterval readableInterval54 = null;
        boolean boolean55 = readableInterval53.contains(readableInterval54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = readableInterval53.toPeriod(periodType56);
        org.joda.time.DateTime dateTime58 = readableInterval53.getEnd();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        boolean boolean62 = readableInterval60.contains(readableInterval61);
        boolean boolean63 = readableInterval53.overlaps(readableInterval60);
        boolean boolean64 = readableInterval45.contains(readableInterval60);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.PeriodType periodType66 = org.joda.time.DateTimeUtils.getPeriodType(periodType65);
        org.joda.time.PeriodType periodType67 = org.joda.time.DateTimeUtils.getPeriodType(periodType66);
        org.joda.time.Period period68 = readableInterval45.toPeriod(periodType67);
        int[] intArray71 = zonedChronology43.get((org.joda.time.ReadablePeriod) period68, (-53459996L), 27647338425L);
        int[] intArray73 = offsetDateTimeField11.addWrapPartial((org.joda.time.ReadablePartial) partial35, (int) (short) 1, intArray71, 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval75 = null;
        org.joda.time.ReadableInterval readableInterval76 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval75);
        org.joda.time.Chronology chronology77 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval75);
        org.joda.time.DateTimeField dateTimeField78 = chronology77.yearOfCentury();
        org.joda.time.DurationField durationField79 = chronology77.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField80 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType74, durationField79);
        long long83 = unsupportedDateTimeField80.add((-31L), (long) '#');
        org.joda.time.DurationField durationField84 = unsupportedDateTimeField80.getLeapDurationField();
        org.joda.time.DurationField durationField85 = unsupportedDateTimeField80.getDurationField();
        java.lang.String str86 = unsupportedDateTimeField80.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = unsupportedDateTimeField80.getType();
        boolean boolean88 = partial35.isSupported(dateTimeFieldType87);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3060006L + "'", long14 == 3060006L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711908000000L + "'", long16 == 1711908000000L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-W10" + "'", str37, "-W10");
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertNotNull(readableInterval53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 20, 2, 2, 14, 39, 58, 421]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 20, 2, 2, 14, 39, 58, 421]");
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(readableInterval76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField80);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 4L + "'", long83 == 4L);
        org.junit.Assert.assertNull(durationField84);
        org.junit.Assert.assertNotNull(durationField85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "UnsupportedDateTimeField" + "'", str86, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test506");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DurationField durationField7 = gregorianChronology5.weekyears();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test507");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        java.lang.String str6 = durationFieldType4.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test508");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        boolean boolean12 = offsetDateTimeField11.isSupported();
        long long14 = offsetDateTimeField11.remainder((long) 53460006);
        long long16 = offsetDateTimeField11.roundHalfFloor(1711909507403L);
        int int18 = offsetDateTimeField11.get(551169L);
        long long20 = offsetDateTimeField11.roundFloor((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField25 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField11, dateTimeFieldType21, (int) '#', (int) (byte) 10, 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField29 = iSOChronology28.minutes();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology28.halfdayOfDay();
        org.joda.time.Partial partial35 = new org.joda.time.Partial(dateTimeFieldType26, 10, (org.joda.time.Chronology) iSOChronology28);
        int int36 = partial35.size();
        java.lang.String str37 = partial35.toString();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField40 = iSOChronology39.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str42 = dateTimeZone41.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology43 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology39, dateTimeZone41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        boolean boolean47 = readableInterval45.contains(readableInterval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = readableInterval45.toPeriod(periodType48);
        org.joda.time.DateTime dateTime50 = readableInterval45.getEnd();
        org.joda.time.MutableInterval mutableInterval51 = readableInterval45.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.ReadableInterval readableInterval54 = null;
        boolean boolean55 = readableInterval53.contains(readableInterval54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = readableInterval53.toPeriod(periodType56);
        org.joda.time.DateTime dateTime58 = readableInterval53.getEnd();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        boolean boolean62 = readableInterval60.contains(readableInterval61);
        boolean boolean63 = readableInterval53.overlaps(readableInterval60);
        boolean boolean64 = readableInterval45.contains(readableInterval60);
        org.joda.time.PeriodType periodType65 = null;
        org.joda.time.PeriodType periodType66 = org.joda.time.DateTimeUtils.getPeriodType(periodType65);
        org.joda.time.PeriodType periodType67 = org.joda.time.DateTimeUtils.getPeriodType(periodType66);
        org.joda.time.Period period68 = readableInterval45.toPeriod(periodType67);
        int[] intArray71 = zonedChronology43.get((org.joda.time.ReadablePeriod) period68, (-53459996L), 27647338425L);
        int[] intArray73 = offsetDateTimeField11.addWrapPartial((org.joda.time.ReadablePartial) partial35, (int) (short) 1, intArray71, 10);
        long long75 = offsetDateTimeField11.roundFloor(5727530857768L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3060006L + "'", long14 == 3060006L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711908000000L + "'", long16 == 1711908000000L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-W10" + "'", str37, "-W10");
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertNotNull(readableInterval53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[0, 20, 2, 2, 14, 39, 58, 421]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[0, 20, 2, 2, 14, 39, 58, 421]");
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 5727528000000L + "'", long75 == 5727528000000L);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test509");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str34 = dateTimeFieldType33.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial36 = partial16.withField(dateTimeFieldType33, 2848689);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "centuryOfEra" + "'", str34, "centuryOfEra");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test510");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        int int38 = partial14.compareTo((org.joda.time.ReadablePartial) partial28);
        int[] intArray39 = partial28.getValues();
        java.lang.String str40 = partial28.toString();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test511");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        boolean boolean4 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException3);
        illegalFieldValueException3.prependMessage("hi!");
        java.lang.Number number7 = illegalFieldValueException3.getUpperBound();
        java.lang.Number number8 = illegalFieldValueException3.getIllegalNumberValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertEquals("'" + number8 + "' != '" + 60035L + "'", number8, 60035L);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology1.hourOfHalfday();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("13", "32", (int) (byte) 0, 29227999);
        org.joda.time.Chronology chronology8 = gregorianChronology1.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone7);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test513");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gregorianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.clockhourOfDay();
        long long5 = dateTimeField2.getDifferenceAsLong(294139L, 9700L);
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test514");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add(97L, 24);
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField12 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long15 = durationField12.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long17 = durationField12.getValueAsLong((long) 10);
        int int19 = durationField12.getValue((long) (byte) 10);
        boolean boolean20 = partial11.equals((java.lang.Object) durationField12);
        org.joda.time.Chronology chronology21 = partial11.getChronology();
        org.joda.time.Partial partial22 = new org.joda.time.Partial();
        boolean boolean23 = partial11.isBefore((org.joda.time.ReadablePartial) partial22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = partial11.getFieldTypes();
        int[] intArray25 = partial11.getValues();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        boolean boolean40 = readableInterval38.contains(readableInterval39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = readableInterval38.toPeriod(periodType41);
        int[] intArray44 = chronology34.get((org.joda.time.ReadablePeriod) period42, (-210866846400000L));
        int[] intArray47 = chronology28.get((org.joda.time.ReadablePeriod) period42, 2173795348453L, (long) 1439);
        org.joda.time.Partial partial48 = partial11.plus((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Partial partial49 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial11);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 121L + "'", long9 == 121L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(intArray44);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(partial48);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test515");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.Chronology chronology17 = iSOChronology8.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        int int19 = cachedDateTimeZone16.getOffset((long) ' ');
        org.joda.time.Chronology chronology20 = zonedChronology4.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology4.era();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology4.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(cachedDateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test516");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology6.secondOfDay();
        org.joda.time.Partial partial8 = new org.joda.time.Partial();
        int[] intArray9 = partial8.getValues();
        int int10 = partial8.size();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.ReadableInterval readableInterval13 = null;
        boolean boolean14 = readableInterval12.contains(readableInterval13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = readableInterval12.toPeriod(periodType15);
        org.joda.time.Partial partial18 = partial8.withPeriodAdded((org.joda.time.ReadablePeriod) period16, (int) (short) 100);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.DurationField durationField24 = chronology21.centuries();
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        boolean boolean39 = readableInterval37.contains(readableInterval38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = readableInterval37.toPeriod(periodType40);
        int[] intArray43 = chronology33.get((org.joda.time.ReadablePeriod) period41, (-210866846400000L));
        int[] intArray46 = chronology27.get((org.joda.time.ReadablePeriod) period41, 2173795348453L, (long) 1439);
        int[] intArray49 = chronology21.get((org.joda.time.ReadablePeriod) period41, 291L, 2580171L);
        org.joda.time.Partial partial51 = partial18.withPeriodAdded((org.joda.time.ReadablePeriod) period41, 0);
        int[] intArray54 = zonedChronology6.get((org.joda.time.ReadablePeriod) period41, (-210863520000000L), 315511200000L);
        org.joda.time.DurationField durationField55 = zonedChronology6.weekyears();
        int int56 = durationField1.compareTo(durationField55);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(partial18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(intArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertNotNull(partial51);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[6691, 11, 4, 2, 18, 0, 0, 0]");
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test517");
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
        long long16 = dividedDateTimeField11.roundFloor(291L);
        boolean boolean17 = dividedDateTimeField11.isSupported();
        org.joda.time.DurationField durationField18 = dividedDateTimeField11.getDurationField();
        long long20 = dividedDateTimeField11.roundFloor((long) 10);
        int int21 = dividedDateTimeField11.getMinimumValue();
        long long23 = dividedDateTimeField11.roundCeiling(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test518");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        boolean boolean6 = unsupportedDurationField5.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField5.add((-3060L), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test519");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test520");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException6 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType3, (java.lang.Number) 60035L, "");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField8 = new org.joda.time.field.DividedDateTimeField(dateTimeField2, dateTimeFieldType3, 10);
        long long10 = dividedDateTimeField8.roundHalfEven(166055221892365L);
        int int11 = dividedDateTimeField8.getMinimumValue();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 166055221892360L + "'", long10 == 166055221892360L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test521");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology2.seconds();
        org.joda.time.DurationField durationField7 = iSOChronology2.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology2.seconds();
        boolean boolean10 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "secondOfMinute" + "'", str1, "secondOfMinute");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test522");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        boolean boolean16 = unsupportedDurationField5.isSupported();
        long long17 = unsupportedDurationField5.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = unsupportedDurationField5.getMillis(5727502310153L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test523");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        boolean boolean13 = readableInterval11.contains(readableInterval12);
        org.joda.time.Duration duration14 = readableInterval11.toDuration();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.Duration duration19 = readableInterval16.toDuration();
        org.joda.time.DateTime dateTime20 = readableInterval16.getEnd();
        boolean boolean21 = readableInterval11.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = readableInterval23.contains(readableInterval24);
        org.joda.time.Duration duration26 = readableInterval23.toDuration();
        org.joda.time.DateTime dateTime27 = readableInterval23.getEnd();
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime29 = partial0.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(readableInterval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test524");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        int int13 = offsetDateTimeField11.get(60000L);
        int int14 = offsetDateTimeField11.getMaximumValue();
        int int16 = offsetDateTimeField11.getMaximumValue(1396236845826L);
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str19 = dateTimeZone18.toString();
        org.joda.time.Chronology chronology20 = iSOChronology17.withZone(dateTimeZone18);
        org.joda.time.Partial partial21 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.Partial partial22 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField23 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long26 = durationField23.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long28 = durationField23.getValueAsLong((long) 10);
        int int30 = durationField23.getValue((long) (byte) 10);
        boolean boolean31 = partial22.equals((java.lang.Object) durationField23);
        boolean boolean32 = partial21.isBefore((org.joda.time.ReadablePartial) partial22);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.Chronology chronology36 = iSOChronology33.withZone(dateTimeZone34);
        org.joda.time.Partial partial37 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology33);
        boolean boolean38 = partial21.isBefore((org.joda.time.ReadablePartial) partial37);
        java.lang.String str39 = partial37.toString();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.ReadableInterval readableInterval42 = null;
        boolean boolean43 = readableInterval41.contains(readableInterval42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = readableInterval41.toPeriod(periodType44);
        org.joda.time.DateTime dateTime46 = readableInterval41.getEnd();
        org.joda.time.MutableInterval mutableInterval47 = readableInterval41.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        boolean boolean51 = readableInterval49.contains(readableInterval50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = readableInterval49.toPeriod(periodType52);
        org.joda.time.DateTime dateTime54 = readableInterval49.getEnd();
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        boolean boolean58 = readableInterval56.contains(readableInterval57);
        boolean boolean59 = readableInterval49.overlaps(readableInterval56);
        boolean boolean60 = readableInterval41.contains(readableInterval56);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.PeriodType periodType62 = org.joda.time.DateTimeUtils.getPeriodType(periodType61);
        org.joda.time.PeriodType periodType63 = org.joda.time.DateTimeUtils.getPeriodType(periodType62);
        org.joda.time.Period period64 = readableInterval41.toPeriod(periodType63);
        org.joda.time.Partial partial65 = partial37.minus((org.joda.time.ReadablePeriod) period64);
        int[] intArray67 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray69 = offsetDateTimeField11.add((org.joda.time.ReadablePartial) partial37, 22, intArray67, 37113);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(partial65);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test525");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfCentury();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone8 = new org.joda.time.tz.FixedDateTimeZone("", "7", 32, (int) '4');
        int int10 = fixedDateTimeZone8.getStandardOffset((long) 53460006);
        org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, (org.joda.time.DateTimeZone) fixedDateTimeZone8);
        int int13 = fixedDateTimeZone8.getOffsetFromLocal(5727502324383L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(28531765);
        long long17 = fixedDateTimeZone8.getMillisKeepLocal(dateTimeZone15, 1711851964745L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(zonedChronology11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1711823433012L + "'", long17 == 1711823433012L);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test526");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        boolean boolean16 = unsupportedDurationField5.isSupported();
        long long17 = unsupportedDurationField5.getUnitMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean19 = unsupportedDurationField5.equals((java.lang.Object) dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test527");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long7 = fixedDateTimeZone4.nextTransition(28800001L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-1443850494178L), true, 1711938394191L);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28800001L + "'", long7 == 28800001L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1443850494178L) + "'", long11 == (-1443850494178L));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test528");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField14 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType8, durationField13);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType8);
        int int17 = zeroIsMaxDateTimeField15.getLeapAmount(1711909507403L);
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        int int19 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial18);
        long long21 = zeroIsMaxDateTimeField15.roundHalfCeiling((long) 323506);
        long long24 = zeroIsMaxDateTimeField15.add((long) 29227899, 0);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 29227899L + "'", long24 == 29227899L);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test529");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology6.halfdays();
        org.joda.time.DurationField durationField11 = chronology6.years();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test530");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        boolean boolean16 = unsupportedDurationField5.isSupported();
        long long17 = unsupportedDurationField5.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = unsupportedDurationField5.getMillis(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test531");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        boolean boolean7 = unsupportedDateTimeField6.isLenient();
        long long10 = unsupportedDateTimeField6.add(1396290305822L, (-53459996L));
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getLeapDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(315479340004L, 139583L);
        long long17 = unsupportedDateTimeField6.add((long) 12, 12);
        java.lang.String str18 = unsupportedDateTimeField6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField22 = iSOChronology21.minutes();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology21.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology21.halfdayOfDay();
        org.joda.time.Partial partial28 = new org.joda.time.Partial(dateTimeFieldType19, 10, (org.joda.time.Chronology) iSOChronology21);
        int int29 = partial28.size();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1396236845826L + "'", long10 == 1396236845826L);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 315479200421L + "'", long14 == 315479200421L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 24L + "'", long17 == 24L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UnsupportedDateTimeField" + "'", str18, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test532");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str7 = dateTimeZone6.toString();
        java.lang.String str9 = dateTimeZone6.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeUtils.getZone(dateTimeZone6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone10);
        java.lang.Object obj12 = null;
        boolean boolean13 = cachedDateTimeZone11.equals(obj12);
        long long15 = cachedDateTimeZone11.nextTransition(2580171L);
        boolean boolean16 = cachedDateTimeZone11.isFixed();
        org.joda.time.chrono.ZonedChronology zonedChronology17 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, (org.joda.time.DateTimeZone) cachedDateTimeZone11);
        org.joda.time.Chronology chronology18 = iSOChronology0.withUTC();
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(cachedDateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2580171L + "'", long15 == 2580171L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zonedChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test533");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28531825L);
        boolean boolean4 = preciseDurationField3.isPrecise();
        boolean boolean5 = preciseDurationField3.isPrecise();
        int int8 = preciseDurationField3.getDifference(28800001L, 27647338416L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-967) + "'", int8 == (-967));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test534");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        boolean boolean7 = dateTimeZone3.isFixed();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
        boolean boolean9 = dateTimeFieldType2.isSupported((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.IllegalFieldValueException illegalFieldValueException13 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType2, (java.lang.Number) 1711909511784L, (java.lang.Number) 969L, (java.lang.Number) 22410261324L);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField16 = iSOChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.millisOfDay();
        org.joda.time.DurationField durationField18 = iSOChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology15.yearOfCentury();
        org.joda.time.DurationField durationField21 = iSOChronology15.seconds();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology15.weekyearOfCentury();
        org.joda.time.Partial partial23 = new org.joda.time.Partial(dateTimeFieldType2, 203, (org.joda.time.Chronology) iSOChronology15);
        boolean boolean24 = jodaTimePermission1.equals((java.lang.Object) 203);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test535");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test536");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.Chronology chronology17 = iSOChronology8.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        int int19 = cachedDateTimeZone16.getOffset((long) ' ');
        org.joda.time.Chronology chronology20 = zonedChronology4.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        java.lang.String str22 = cachedDateTimeZone16.getNameKey((-58877480091246L));
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        java.lang.String str24 = gregorianChronology23.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = gregorianChronology23.getDateTimeMillis(29227899, 471, 0, 0, (int) (byte) 10, (int) (byte) 1, 323506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 323506 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(cachedDateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "GregorianChronology[UTC]" + "'", str24, "GregorianChronology[UTC]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test537");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        boolean boolean10 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.Partial partial12 = new org.joda.time.Partial(dateTimeFieldType0, 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = partial12.getFields();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test538");
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
        long long24 = remainderDateTimeField22.roundHalfFloor(3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        long long34 = unsupportedDateTimeField31.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = unsupportedDateTimeField31.getType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, dateTimeFieldType35);
        int int38 = dividedDateTimeField37.getMinimumValue();
        org.joda.time.DurationField durationField39 = dividedDateTimeField37.iRangeDurationField;
        long long41 = dividedDateTimeField37.roundCeiling(32L);
        boolean boolean42 = dividedDateTimeField37.isLenient();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField43 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4L + "'", long34 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(durationField39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 315532800000L + "'", long41 == 315532800000L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test539");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        long long5 = readableInterval4.getEndMillis();
        boolean boolean6 = readableInterval1.overlaps(readableInterval4);
        java.lang.String str7 = readableInterval4.toString();
        org.joda.time.MutableInterval mutableInterval8 = readableInterval4.toMutableInterval();
        org.joda.time.DateTime dateTime9 = mutableInterval8.getEnd();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        boolean boolean13 = readableInterval11.contains(readableInterval12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        boolean boolean15 = readableInterval11.isBefore(readableInterval14);
        boolean boolean16 = mutableInterval8.isBefore(readableInterval11);
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        long long19 = readableInterval18.getStartMillis();
        boolean boolean20 = readableInterval11.isAfter(readableInterval18);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.Chronology chronology24 = iSOChronology21.withZone(dateTimeZone22);
        org.joda.time.Partial partial25 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.Partial partial26 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField27 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long30 = durationField27.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long32 = durationField27.getValueAsLong((long) 10);
        int int34 = durationField27.getValue((long) (byte) 10);
        boolean boolean35 = partial26.equals((java.lang.Object) durationField27);
        boolean boolean36 = partial25.isBefore((org.joda.time.ReadablePartial) partial26);
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = partial25.getFields();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        boolean boolean41 = readableInterval39.contains(readableInterval40);
        org.joda.time.Duration duration42 = readableInterval39.toDuration();
        org.joda.time.DateTime dateTime43 = readableInterval39.getEnd();
        org.joda.time.Period period44 = readableInterval39.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone45.getOffset(readableInstant46);
        java.util.TimeZone timeZone48 = dateTimeZone45.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.ReadableInterval readableInterval52 = null;
        boolean boolean53 = readableInterval51.contains(readableInterval52);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = readableInterval51.toPeriod(periodType54);
        org.joda.time.DateTime dateTime56 = readableInterval51.getEnd();
        int int57 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean58 = readableInterval39.isBefore((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime59 = partial25.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        boolean boolean60 = readableInterval11.contains((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24595579223636L + "'", long2 == 24595579223636L);
        org.junit.Assert.assertNotNull(readableInterval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 24595579223636L + "'", long5 == 24595579223636L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2749-05-28T01:20:23.636Z/2749-05-28T01:20:23.636Z" + "'", str7, "2749-05-28T01:20:23.636Z/2749-05-28T01:20:23.636Z");
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(readableInterval18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 24595579223640L + "'", long19 == 24595579223640L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray37);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test540");
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
        long long18 = scaledDurationField17.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType19 = scaledDurationField17.getType();
        boolean boolean20 = scaledDurationField17.isPrecise();
        long long23 = scaledDurationField17.getValueAsLong(28800000L, 60035L);
        org.joda.time.DurationField durationField24 = scaledDurationField17.getWrappedField();
        boolean boolean25 = durationField24.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 296907L + "'", long23 == 296907L);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test541");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = zonedChronology4.withZone(dateTimeZone9);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test542");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = readableInterval6.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = readableInterval6.getEnd();
        int int12 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField14 = iSOChronology13.weeks();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.Duration duration19 = readableInterval16.toDuration();
        org.joda.time.Period period20 = readableInterval16.toPeriod();
        int[] intArray22 = iSOChronology13.get((org.joda.time.ReadablePeriod) period20, (long) (short) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.minuteOfDay();
        long long25 = dateTimeField23.roundHalfFloor(1711909513099L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1711909500000L + "'", long25 == 1711909500000L);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test543");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        org.joda.time.DurationField durationField10 = zonedChronology6.weeks();
        java.lang.String str11 = zonedChronology6.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str11, "ZonedChronology[ISOChronology[UTC], UTC]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test544");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = partial1.getFields();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test545");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = partial16.getFieldTypes();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        boolean boolean42 = readableInterval40.contains(readableInterval41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = readableInterval40.toPeriod(periodType43);
        int[] intArray46 = chronology36.get((org.joda.time.ReadablePeriod) period44, (-210866846400000L));
        org.joda.time.Partial partial47 = partial16.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField49 = iSOChronology48.minutes();
        org.joda.time.Partial partial50 = partial47.withChronologyRetainFields((org.joda.time.Chronology) iSOChronology48);
        int int51 = partial47.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField55 = iSOChronology54.minutes();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology54.millisOfDay();
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField58 = iSOChronology54.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = iSOChronology54.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology54.halfdayOfDay();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType52, 10, (org.joda.time.Chronology) iSOChronology54);
        int int62 = partial61.size();
        java.lang.String str63 = partial61.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = partial47.isAfter((org.joda.time.ReadablePartial) partial61);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(partial50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(iSOChronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "-W10" + "'", str63, "-W10");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test546");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.Partial partial5 = new org.joda.time.Partial(dateTimeFieldType0, 1, chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test547");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        boolean boolean12 = offsetDateTimeField11.isSupported();
        long long14 = offsetDateTimeField11.remainder((long) 53460006);
        long long16 = offsetDateTimeField11.roundHalfFloor(1711909507403L);
        int int18 = offsetDateTimeField11.get(551169L);
        long long20 = offsetDateTimeField11.roundFloor((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField25 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField11, dateTimeFieldType21, (int) '#', (int) (byte) 10, 3);
        long long27 = offsetDateTimeField25.roundFloor(29227899L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3060006L + "'", long14 == 3060006L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1711908000000L + "'", long16 == 1711908000000L);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 28800000L + "'", long27 == 28800000L);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test548");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = zonedChronology6.getZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test549");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.DateTime dateTime5 = readableInterval1.getEnd();
        org.joda.time.DateTime dateTime6 = readableInterval1.getStart();
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        long long11 = readableInterval10.getEndMillis();
        boolean boolean12 = readableInterval8.isBefore(readableInterval10);
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField14 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long17 = durationField14.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long19 = durationField14.getValueAsLong((long) 10);
        int int21 = durationField14.getValue((long) (byte) 10);
        boolean boolean22 = partial13.equals((java.lang.Object) durationField14);
        org.joda.time.Chronology chronology23 = partial13.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        boolean boolean25 = partial13.isBefore((org.joda.time.ReadablePartial) partial24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = partial13.getFieldTypes();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField28 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long31 = durationField28.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long33 = durationField28.getValueAsLong((long) 10);
        int int35 = durationField28.getValue((long) (byte) 10);
        boolean boolean36 = partial27.equals((java.lang.Object) durationField28);
        org.joda.time.Chronology chronology37 = partial27.getChronology();
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        boolean boolean39 = partial27.isBefore((org.joda.time.ReadablePartial) partial38);
        int int40 = partial13.compareTo((org.joda.time.ReadablePartial) partial27);
        org.joda.time.Partial partial41 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField42 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long45 = durationField42.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long47 = durationField42.getValueAsLong((long) 10);
        int int49 = durationField42.getValue((long) (byte) 10);
        boolean boolean50 = partial41.equals((java.lang.Object) durationField42);
        int int51 = partial27.compareTo((org.joda.time.ReadablePartial) partial41);
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        long long54 = readableInterval53.getStartMillis();
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        boolean boolean58 = readableInterval56.contains(readableInterval57);
        org.joda.time.Duration duration59 = readableInterval56.toDuration();
        org.joda.time.DateTime dateTime60 = readableInterval56.getEnd();
        boolean boolean61 = readableInterval53.contains((org.joda.time.ReadableInstant) dateTime60);
        long long62 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime64 = partial27.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime64);
        boolean boolean66 = readableInterval10.isBefore((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.MutableInterval mutableInterval67 = readableInterval10.toMutableInterval();
        org.joda.time.ReadableInstant readableInstant68 = null;
        boolean boolean69 = readableInterval10.isBefore(readableInstant68);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(readableInterval10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 24595579226589L + "'", long11 == 24595579226589L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(readableInterval53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 24595579226596L + "'", long54 == 24595579226596L);
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 24595579226596L + "'", long62 == 24595579226596L);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(mutableInterval67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = readableInterval6.toPeriod(periodType9);
        org.joda.time.DateTime dateTime11 = readableInterval6.getEnd();
        int int12 = dateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField14 = iSOChronology13.weeks();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.Duration duration19 = readableInterval16.toDuration();
        org.joda.time.Period period20 = readableInterval16.toPeriod();
        int[] intArray22 = iSOChronology13.get((org.joda.time.ReadablePeriod) period20, (long) (short) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology13.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test551");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        boolean boolean10 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = zonedChronology6.getDateTimeMillis(19, 97, 32, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test552");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.JodaTimePermission jodaTimePermission12 = new org.joda.time.JodaTimePermission("100");
        java.lang.String str13 = jodaTimePermission12.toString();
        java.security.PermissionCollection permissionCollection14 = jodaTimePermission12.newPermissionCollection();
        boolean boolean15 = partial0.equals((java.lang.Object) permissionCollection14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Partial partial29 = partial16.with(dateTimeFieldType27, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial31 = partial0.withField(dateTimeFieldType27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(\"org.joda.time.JodaTimePermission\" \"100\")" + "'", str13, "(\"org.joda.time.JodaTimePermission\" \"100\")");
        org.junit.Assert.assertNotNull(permissionCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(partial29);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test553");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = zonedChronology6.getDateTimeMillis(28531765, (int) (short) 10, 52, (int) (byte) 100, 28531765, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test554");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.Chronology chronology17 = iSOChronology8.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        int int19 = cachedDateTimeZone16.getOffset((long) ' ');
        org.joda.time.Chronology chronology20 = zonedChronology4.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        org.joda.time.DateTimeField dateTimeField21 = zonedChronology4.era();
        org.joda.time.DateTimeField dateTimeField22 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.Partial partial23 = new org.joda.time.Partial();
        int[] intArray25 = zonedChronology4.get((org.joda.time.ReadablePartial) partial23, (-63879074170616L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(cachedDateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test555");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = unsupportedDurationField5.getValueAsLong(24595579226596L, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test556");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField4 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long7 = durationField4.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long9 = durationField4.getValueAsLong((long) 10);
        int int11 = durationField4.getValue((long) (byte) 10);
        boolean boolean12 = partial3.equals((java.lang.Object) durationField4);
        org.joda.time.Chronology chronology13 = partial3.getChronology();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        boolean boolean15 = partial3.isBefore((org.joda.time.ReadablePartial) partial14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = partial3.getFieldTypes();
        org.joda.time.Partial partial17 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField18 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long21 = durationField18.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long23 = durationField18.getValueAsLong((long) 10);
        int int25 = durationField18.getValue((long) (byte) 10);
        boolean boolean26 = partial17.equals((java.lang.Object) durationField18);
        org.joda.time.Chronology chronology27 = partial17.getChronology();
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        boolean boolean29 = partial17.isBefore((org.joda.time.ReadablePartial) partial28);
        int int30 = partial3.compareTo((org.joda.time.ReadablePartial) partial17);
        org.joda.time.Partial partial31 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField32 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long35 = durationField32.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long37 = durationField32.getValueAsLong((long) 10);
        int int39 = durationField32.getValue((long) (byte) 10);
        boolean boolean40 = partial31.equals((java.lang.Object) durationField32);
        int int41 = partial17.compareTo((org.joda.time.ReadablePartial) partial31);
        int[] intArray42 = partial31.getValues();
        int[] intArray44 = iSOChronology0.get((org.joda.time.ReadablePartial) partial31, 10L);
        org.joda.time.Chronology chronology45 = partial31.getChronology();
        org.joda.time.Partial partial46 = new org.joda.time.Partial();
        int[] intArray47 = partial46.getValues();
        int int48 = partial46.size();
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.ReadableInterval readableInterval50 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval49);
        org.joda.time.ReadableInterval readableInterval51 = null;
        boolean boolean52 = readableInterval50.contains(readableInterval51);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = readableInterval50.toPeriod(periodType53);
        org.joda.time.Partial partial56 = partial46.withPeriodAdded((org.joda.time.ReadablePeriod) period54, (int) (short) 100);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DurationField durationField61 = chronology59.millis();
        org.joda.time.DurationField durationField62 = chronology59.centuries();
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval69);
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval74 = null;
        org.joda.time.ReadableInterval readableInterval75 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval74);
        org.joda.time.ReadableInterval readableInterval76 = null;
        boolean boolean77 = readableInterval75.contains(readableInterval76);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = readableInterval75.toPeriod(periodType78);
        int[] intArray81 = chronology71.get((org.joda.time.ReadablePeriod) period79, (-210866846400000L));
        int[] intArray84 = chronology65.get((org.joda.time.ReadablePeriod) period79, 2173795348453L, (long) 1439);
        int[] intArray87 = chronology59.get((org.joda.time.ReadablePeriod) period79, 291L, 2580171L);
        org.joda.time.Partial partial89 = partial56.withPeriodAdded((org.joda.time.ReadablePeriod) period79, 0);
        boolean boolean90 = partial31.isMatch((org.joda.time.ReadablePartial) partial89);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType92 = partial31.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(readableInterval50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(partial56);
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(readableInterval75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(period79);
        org.junit.Assert.assertNotNull(intArray81);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertNotNull(partial89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test557");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = zonedChronology6.getDateTimeMillis(0, 297, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test558");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        boolean boolean12 = offsetDateTimeField11.isSupported();
        int int13 = offsetDateTimeField11.getMaximumValue();
        int int14 = offsetDateTimeField11.getMinimumValue();
        long long16 = offsetDateTimeField11.roundFloor((long) 17);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 24 + "'", int13 == 24);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test559");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray1 = partial0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = partial0.getValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test560");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology5, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology9.getZone();
        org.joda.time.DurationField durationField11 = zonedChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = zonedChronology9.getZone();
        boolean boolean14 = iSOChronology0.equals((java.lang.Object) zonedChronology9);
        long long20 = zonedChronology9.getDateTimeMillis(0L, (int) (short) 10, 9, 1, (int) 'a');
        org.joda.time.DurationField durationField21 = zonedChronology9.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36541097L + "'", long20 == 36541097L);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test561");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getDurationField();
        java.lang.String str12 = unsupportedDateTimeField6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.Partial partial16 = new org.joda.time.Partial(dateTimeFieldType13, (int) (byte) 10);
        org.joda.time.DurationField durationField17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField18 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType13, durationField17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnsupportedDateTimeField" + "'", str12, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test562");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.minuteOfDay();
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField14 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long17 = durationField14.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long19 = durationField14.getValueAsLong((long) 10);
        int int21 = durationField14.getValue((long) (byte) 10);
        boolean boolean22 = partial13.equals((java.lang.Object) durationField14);
        org.joda.time.Chronology chronology23 = partial13.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        boolean boolean25 = partial13.isBefore((org.joda.time.ReadablePartial) partial24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = partial13.getFieldTypes();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField28 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long31 = durationField28.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long33 = durationField28.getValueAsLong((long) 10);
        int int35 = durationField28.getValue((long) (byte) 10);
        boolean boolean36 = partial27.equals((java.lang.Object) durationField28);
        org.joda.time.Chronology chronology37 = partial27.getChronology();
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        boolean boolean39 = partial27.isBefore((org.joda.time.ReadablePartial) partial38);
        int int40 = partial13.compareTo((org.joda.time.ReadablePartial) partial27);
        org.joda.time.Partial partial41 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField42 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long45 = durationField42.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long47 = durationField42.getValueAsLong((long) 10);
        int int49 = durationField42.getValue((long) (byte) 10);
        boolean boolean50 = partial41.equals((java.lang.Object) durationField42);
        int int51 = partial27.compareTo((org.joda.time.ReadablePartial) partial41);
        int[] intArray52 = partial41.getValues();
        int[] intArray53 = partial41.getValues();
        org.joda.time.Partial partial54 = new org.joda.time.Partial();
        int[] intArray55 = partial54.getValues();
        iSOChronology0.validate((org.joda.time.ReadablePartial) partial41, intArray55);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = partial41.getFieldTypes();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.Partial partial59 = partial41.withChronologyRetainFields(chronology58);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray57);
        org.junit.Assert.assertNotNull(partial59);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test563");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DurationField durationField4 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test564");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        org.joda.time.Chronology chronology38 = partial28.getChronology();
        org.joda.time.Partial partial39 = new org.joda.time.Partial();
        boolean boolean40 = partial28.isBefore((org.joda.time.ReadablePartial) partial39);
        java.util.Locale locale42 = null;
        java.lang.String str43 = partial39.toString("723", locale42);
        org.joda.time.Partial partial44 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField45 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long48 = durationField45.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long50 = durationField45.getValueAsLong((long) 10);
        int int52 = durationField45.getValue((long) (byte) 10);
        boolean boolean53 = partial44.equals((java.lang.Object) durationField45);
        org.joda.time.Chronology chronology54 = partial44.getChronology();
        org.joda.time.Partial partial55 = new org.joda.time.Partial();
        boolean boolean56 = partial44.isBefore((org.joda.time.ReadablePartial) partial55);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray57 = partial44.getFieldTypes();
        java.lang.Object obj58 = null;
        boolean boolean59 = partial44.equals(obj58);
        boolean boolean60 = partial39.isBefore((org.joda.time.ReadablePartial) partial44);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = partial44.getFieldTypes();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.ReadableInterval readableInterval69 = null;
        boolean boolean70 = readableInterval68.contains(readableInterval69);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = readableInterval68.toPeriod(periodType71);
        int[] intArray74 = chronology64.get((org.joda.time.ReadablePeriod) period72, (-210866846400000L));
        org.joda.time.Partial partial75 = partial44.minus((org.joda.time.ReadablePeriod) period72);
        org.joda.time.chrono.ISOChronology iSOChronology76 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField77 = iSOChronology76.minutes();
        org.joda.time.DateTimeZone dateTimeZone78 = iSOChronology76.getZone();
        org.joda.time.DateTimeField dateTimeField79 = iSOChronology76.yearOfCentury();
        boolean boolean80 = partial44.equals((java.lang.Object) iSOChronology76);
        org.joda.time.Chronology chronology81 = partial44.getChronology();
        int int82 = partial14.compareTo((org.joda.time.ReadablePartial) partial44);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray83 = partial14.getFieldTypes();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "723" + "'", str43, "723");
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray61);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(intArray74);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial75);
        org.junit.Assert.assertNotNull(iSOChronology76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertNotNull(dateTimeField79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray83);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test565");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((-210861660779418L), 3600000L);
        boolean boolean10 = unsupportedDateTimeField6.isLenient();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField13 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long16 = durationField13.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long18 = durationField13.getValueAsLong((long) 10);
        int int20 = durationField13.getValue((long) (byte) 10);
        boolean boolean21 = partial12.equals((java.lang.Object) durationField13);
        org.joda.time.Chronology chronology22 = partial12.getChronology();
        org.joda.time.Partial partial23 = new org.joda.time.Partial();
        boolean boolean24 = partial12.isBefore((org.joda.time.ReadablePartial) partial23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = partial23.toString("723", locale26);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        org.joda.time.Chronology chronology38 = partial28.getChronology();
        org.joda.time.Partial partial39 = new org.joda.time.Partial();
        boolean boolean40 = partial28.isBefore((org.joda.time.ReadablePartial) partial39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = partial28.getFieldTypes();
        java.lang.Object obj42 = null;
        boolean boolean43 = partial28.equals(obj42);
        boolean boolean44 = partial23.isBefore((org.joda.time.ReadablePartial) partial28);
        org.joda.time.Chronology chronology45 = partial28.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int46 = unsupportedDateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) partial28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210861664379418L) + "'", long9 == (-210861664379418L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "723" + "'", str27, "723");
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test566");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        boolean boolean10 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DurationField durationField11 = zonedChronology6.months();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology6.yearOfCentury();
        long long16 = dateTimeField13.getDifferenceAsLong(0L, 551171L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test567");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray1 = partial0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = partial0.getValue(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test568");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField14 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long17 = durationField14.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long19 = durationField14.getValueAsLong((long) 10);
        int int21 = durationField14.getValue((long) (byte) 10);
        boolean boolean22 = partial13.equals((java.lang.Object) durationField14);
        org.joda.time.Chronology chronology23 = partial13.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        boolean boolean25 = partial13.isBefore((org.joda.time.ReadablePartial) partial24);
        int int26 = offsetDateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) partial24);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) offsetDateTimeField12, (int) ' ');
        long long30 = offsetDateTimeField28.roundCeiling(5727502308325L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 5743353600000L + "'", long30 == 5743353600000L);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test569");
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
        long long24 = remainderDateTimeField22.roundHalfFloor(3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        long long34 = unsupportedDateTimeField31.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = unsupportedDateTimeField31.getType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, dateTimeFieldType35);
        int int38 = dividedDateTimeField37.getMinimumValue();
        org.joda.time.DurationField durationField39 = dividedDateTimeField37.iRangeDurationField;
        long long41 = dividedDateTimeField37.roundCeiling(32L);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dividedDateTimeField37.getAsText((int) ' ', locale43);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DurationField durationField50 = chronology47.centuries();
        org.joda.time.Chronology chronology51 = chronology47.withUTC();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology51.add(readablePeriod52, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField57 = chronology51.hourOfHalfday();
        org.joda.time.DurationField durationField58 = chronology51.months();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException62 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType59, (java.lang.Number) 60035L, "");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField63 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37, durationField58, dateTimeFieldType59);
        org.joda.time.ReadablePartial readablePartial64 = null;
        int int65 = remainderDateTimeField63.getMaximumValue(readablePartial64);
        int int66 = remainderDateTimeField63.getMaximumValue();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4L + "'", long34 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(durationField39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 315532800000L + "'", long41 == 315532800000L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "32" + "'", str44, "32");
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test570");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField9 = iSOChronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        org.joda.time.Chronology chronology17 = iSOChronology8.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        int int19 = cachedDateTimeZone16.getOffset((long) ' ');
        org.joda.time.Chronology chronology20 = zonedChronology4.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        java.lang.String str22 = cachedDateTimeZone16.getNameKey((-58877480091246L));
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        org.joda.time.DateTimeField dateTimeField24 = gregorianChronology23.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(cachedDateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test571");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology0.get(readablePeriod7, (long) (-202));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test572");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField3 = new org.joda.time.field.PreciseDurationField(durationFieldType1, 28531825L);
        long long6 = preciseDurationField3.getMillis(60035L, (-210866846400000L));
        boolean boolean7 = preciseDurationField3.isPrecise();
        long long10 = preciseDurationField3.getDifferenceAsLong((-1893477600000L), 28531765L);
        long long13 = preciseDurationField3.add((-3600000L), 2);
        org.joda.time.DurationFieldType durationFieldType14 = preciseDurationField3.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField18 = iSOChronology17.minutes();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology21 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology17, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = zonedChronology21.getZone();
        boolean boolean23 = dateTimeFieldType15.isSupported((org.joda.time.Chronology) zonedChronology21);
        org.joda.time.DateTimeField dateTimeField24 = zonedChronology21.hourOfDay();
        java.lang.String str25 = zonedChronology21.toString();
        org.joda.time.DateTimeField dateTimeField26 = zonedChronology21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = zonedChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField28 = zonedChronology21.minuteOfDay();
        boolean boolean29 = durationFieldType14.isSupported((org.joda.time.Chronology) zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1712908113875L + "'", long6 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-66364L) + "'", long10 == (-66364L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53463650L + "'", long13 == 53463650L);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfMonth" + "'", str16, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str25, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test573");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.lang.String str13 = partial0.toStringList();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.Chronology chronology17 = iSOChronology14.withZone(dateTimeZone15);
        org.joda.time.Partial partial18 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.Partial partial19 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField20 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long23 = durationField20.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long25 = durationField20.getValueAsLong((long) 10);
        int int27 = durationField20.getValue((long) (byte) 10);
        boolean boolean28 = partial19.equals((java.lang.Object) durationField20);
        boolean boolean29 = partial18.isBefore((org.joda.time.ReadablePartial) partial19);
        boolean boolean30 = partial0.isEqual((org.joda.time.ReadablePartial) partial19);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test574");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("millis");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test575");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        long long6 = mutableInterval5.getStartMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        long long9 = readableInterval8.getStartMillis();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        long long12 = readableInterval11.getEndMillis();
        boolean boolean13 = readableInterval8.overlaps(readableInterval11);
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = readableInterval16.toPeriod(periodType19);
        org.joda.time.DateTime dateTime21 = readableInterval16.getEnd();
        org.joda.time.MutableInterval mutableInterval22 = readableInterval16.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        boolean boolean26 = readableInterval24.contains(readableInterval25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = readableInterval24.toPeriod(periodType27);
        org.joda.time.DateTime dateTime29 = readableInterval24.getEnd();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        boolean boolean33 = readableInterval31.contains(readableInterval32);
        boolean boolean34 = readableInterval24.overlaps(readableInterval31);
        boolean boolean35 = readableInterval16.contains(readableInterval31);
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Partial partial37 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField38 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long41 = durationField38.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long43 = durationField38.getValueAsLong((long) 10);
        int int45 = durationField38.getValue((long) (byte) 10);
        boolean boolean46 = partial37.equals((java.lang.Object) durationField38);
        org.joda.time.Chronology chronology47 = partial37.getChronology();
        org.joda.time.Partial partial48 = new org.joda.time.Partial();
        boolean boolean49 = partial37.isBefore((org.joda.time.ReadablePartial) partial48);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = partial37.getFieldTypes();
        org.joda.time.Partial partial51 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField52 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long55 = durationField52.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long57 = durationField52.getValueAsLong((long) 10);
        int int59 = durationField52.getValue((long) (byte) 10);
        boolean boolean60 = partial51.equals((java.lang.Object) durationField52);
        org.joda.time.Chronology chronology61 = partial51.getChronology();
        org.joda.time.Partial partial62 = new org.joda.time.Partial();
        boolean boolean63 = partial51.isBefore((org.joda.time.ReadablePartial) partial62);
        int int64 = partial37.compareTo((org.joda.time.ReadablePartial) partial51);
        org.joda.time.Partial partial65 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField66 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long69 = durationField66.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long71 = durationField66.getValueAsLong((long) 10);
        int int73 = durationField66.getValue((long) (byte) 10);
        boolean boolean74 = partial65.equals((java.lang.Object) durationField66);
        int int75 = partial51.compareTo((org.joda.time.ReadablePartial) partial65);
        org.joda.time.ReadableInterval readableInterval76 = null;
        org.joda.time.ReadableInterval readableInterval77 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval76);
        org.joda.time.ReadableInterval readableInterval78 = null;
        boolean boolean79 = readableInterval77.contains(readableInterval78);
        org.joda.time.Duration duration80 = readableInterval77.toDuration();
        org.joda.time.DateTime dateTime81 = readableInterval77.getEnd();
        org.joda.time.DateTime dateTime82 = readableInterval77.getStart();
        org.joda.time.DateTime dateTime83 = partial65.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        boolean boolean84 = readableInterval36.isBefore((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.ReadableInterval readableInterval85 = null;
        org.joda.time.ReadableInterval readableInterval86 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval85);
        long long87 = readableInterval86.getStartMillis();
        org.joda.time.ReadableInterval readableInterval88 = null;
        org.joda.time.ReadableInterval readableInterval89 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval88);
        long long90 = readableInterval89.getEndMillis();
        boolean boolean91 = readableInterval86.overlaps(readableInterval89);
        java.lang.String str92 = readableInterval89.toString();
        org.joda.time.MutableInterval mutableInterval93 = readableInterval89.toMutableInterval();
        org.joda.time.DateTime dateTime94 = mutableInterval93.getEnd();
        boolean boolean95 = readableInterval36.contains((org.joda.time.ReadableInstant) dateTime94);
        boolean boolean96 = readableInterval14.contains(readableInterval36);
        boolean boolean97 = mutableInterval5.isBefore(readableInterval14);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 24595579234401L + "'", long6 == 24595579234401L);
        org.junit.Assert.assertNotNull(readableInterval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24595579234402L + "'", long9 == 24595579234402L);
        org.junit.Assert.assertNotNull(readableInterval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 24595579234402L + "'", long12 == 24595579234402L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableInterval22);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray50);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(readableInterval77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(readableInterval86);
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + 24595579234411L + "'", long87 == 24595579234411L);
        org.junit.Assert.assertNotNull(readableInterval89);
// flaky:         org.junit.Assert.assertTrue("'" + long90 + "' != '" + 24595579234411L + "'", long90 == 24595579234411L);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str92 + "' != '" + "2749-05-28T01:20:34.411Z/2749-05-28T01:20:34.411Z" + "'", str92, "2749-05-28T01:20:34.411Z/2749-05-28T01:20:34.411Z");
        org.junit.Assert.assertNotNull(mutableInterval93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test576");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField6.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test577");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        long long6 = unsupportedDurationField5.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField5.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDurationField5.getValue((-210863490802402L), (-1443850494178L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test578");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1439);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(1711909511783L);
        int int10 = fixedDateTimeZone4.getStandardOffset(166055222218642154L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str8, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test579");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        int int9 = unsupportedDurationField5.compareTo(durationField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test580");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.MutableInterval mutableInterval4 = readableInterval1.toMutableInterval();
        org.joda.time.Interval interval5 = readableInterval1.toInterval();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mutableInterval4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test581");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField8 = iSOChronology7.minutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology11 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology7, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology11.getZone();
        boolean boolean13 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology11);
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology11.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test582");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        org.joda.time.DurationField durationField8 = zonedChronology6.centuries();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        boolean boolean10 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DurationField durationField11 = zonedChronology6.months();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology6.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test583");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DurationField durationField6 = gregorianChronology5.days();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gregorianChronology5.eras();
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test584");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        java.lang.String str8 = iSOChronology0.toString();
        org.joda.time.DurationField durationField9 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[100]" + "'", str8, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test585");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        int[] intArray13 = partial12.getValues();
        int int14 = partial12.size();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = readableInterval16.toPeriod(periodType19);
        org.joda.time.Partial partial22 = partial12.withPeriodAdded((org.joda.time.ReadablePeriod) period20, (int) (short) 100);
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField25 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long28 = durationField25.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long30 = durationField25.getValueAsLong((long) 10);
        int int32 = durationField25.getValue((long) (byte) 10);
        boolean boolean33 = partial24.equals((java.lang.Object) durationField25);
        org.joda.time.Chronology chronology34 = partial24.getChronology();
        org.joda.time.Partial partial35 = new org.joda.time.Partial();
        boolean boolean36 = partial24.isBefore((org.joda.time.ReadablePartial) partial35);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = partial24.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = partial24.getFieldTypes();
        int[] intArray39 = partial24.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial12, 17, intArray39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(partial22);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test586");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = iSOChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test587");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        org.joda.time.Partial partial13 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField14 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long17 = durationField14.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long19 = durationField14.getValueAsLong((long) 10);
        int int21 = durationField14.getValue((long) (byte) 10);
        boolean boolean22 = partial13.equals((java.lang.Object) durationField14);
        org.joda.time.Chronology chronology23 = partial13.getChronology();
        org.joda.time.Partial partial24 = new org.joda.time.Partial();
        boolean boolean25 = partial13.isBefore((org.joda.time.ReadablePartial) partial24);
        int int26 = offsetDateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) partial24);
        java.lang.String str27 = offsetDateTimeField12.getName();
        java.util.Locale locale28 = null;
        int int29 = offsetDateTimeField12.getMaximumTextLength(locale28);
        java.util.Locale locale31 = null;
        java.lang.String str32 = offsetDateTimeField12.getAsShortText(7, locale31);
        int int34 = offsetDateTimeField12.getMaximumValue((long) 1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "weekOfWeekyear" + "'", str27, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test588");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = partial16.getFieldTypes();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        boolean boolean42 = readableInterval40.contains(readableInterval41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = readableInterval40.toPeriod(periodType43);
        int[] intArray46 = chronology36.get((org.joda.time.ReadablePeriod) period44, (-210866846400000L));
        org.joda.time.Partial partial47 = partial16.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField49 = iSOChronology48.minutes();
        org.joda.time.Partial partial50 = partial47.withChronologyRetainFields((org.joda.time.Chronology) iSOChronology48);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial53 = partial50.with(dateTimeFieldType51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(partial50);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test589");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        int int38 = partial14.compareTo((org.joda.time.ReadablePartial) partial28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = partial28.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test590");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = gregorianChronology0.eras();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test591");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = unsupportedDateTimeField6.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unsupportedDateTimeField6.get(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test592");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.clockhourOfHalfday();
        java.lang.Object obj12 = null;
        boolean boolean13 = zonedChronology6.equals(obj12);
        org.joda.time.DurationField durationField14 = zonedChronology6.halfdays();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        long long6 = unsupportedDurationField5.getUnitMillis();
        boolean boolean7 = unsupportedDurationField5.isPrecise();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField14 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType8, durationField13);
        long long17 = durationField13.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        boolean boolean23 = durationFieldType18.isSupported(chronology21);
        org.joda.time.field.ScaledDurationField scaledDurationField25 = new org.joda.time.field.ScaledDurationField(durationField13, durationFieldType18, (int) 'a');
        int int27 = scaledDurationField25.getValue((long) (short) -1);
        long long30 = scaledDurationField25.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str32 = dateTimeFieldType31.getName();
        boolean boolean33 = scaledDurationField25.equals((java.lang.Object) str32);
        long long35 = scaledDurationField25.getValueAsLong(1711909517307L);
        int int36 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) scaledDurationField25);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = unsupportedDurationField5.getValue(24595579192356L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-210866846400000L) + "'", long17 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 969L + "'", long30 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hourOfDay" + "'", str32, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 17648551724L + "'", long35 == 17648551724L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test594");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfMonth();
        org.joda.time.DurationField durationField10 = zonedChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology6.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test595");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = zonedChronology6.minuteOfDay();
        org.joda.time.DurationField durationField14 = zonedChronology6.years();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test596");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        int int33 = partial16.size();
        boolean boolean34 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) partial16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField36 = partial16.getField(323506);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 323506");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test597");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField2 = iSOChronology0.months();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology4.getZone();
        org.joda.time.DurationField durationField7 = iSOChronology4.days();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology4.getZone();
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone(dateTimeZone8);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField11 = iSOChronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology14 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology10, dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology14.secondOfDay();
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        int[] intArray17 = partial16.getValues();
        int int18 = partial16.size();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        boolean boolean22 = readableInterval20.contains(readableInterval21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = readableInterval20.toPeriod(periodType23);
        org.joda.time.Partial partial26 = partial16.withPeriodAdded((org.joda.time.ReadablePeriod) period24, (int) (short) 100);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval27);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DurationField durationField31 = chronology29.millis();
        org.joda.time.DurationField durationField32 = chronology29.centuries();
        org.joda.time.ReadableInterval readableInterval33 = null;
        org.joda.time.ReadableInterval readableInterval34 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval33);
        org.joda.time.Chronology chronology35 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval33);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.yearOfCentury();
        org.joda.time.DurationField durationField37 = chronology35.millis();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        boolean boolean47 = readableInterval45.contains(readableInterval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = readableInterval45.toPeriod(periodType48);
        int[] intArray51 = chronology41.get((org.joda.time.ReadablePeriod) period49, (-210866846400000L));
        int[] intArray54 = chronology35.get((org.joda.time.ReadablePeriod) period49, 2173795348453L, (long) 1439);
        int[] intArray57 = chronology29.get((org.joda.time.ReadablePeriod) period49, 291L, 2580171L);
        org.joda.time.Partial partial59 = partial26.withPeriodAdded((org.joda.time.ReadablePeriod) period49, 0);
        int[] intArray62 = zonedChronology14.get((org.joda.time.ReadablePeriod) period49, (-210863520000000L), 315511200000L);
        long long65 = iSOChronology0.add((org.joda.time.ReadablePeriod) period49, (long) (-25200000), 1969);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(partial26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(readableInterval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(intArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertNotNull(partial59);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[6691, 11, 4, 2, 18, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-25200000L) + "'", long65 == (-25200000L));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test598");
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
        long long24 = remainderDateTimeField22.roundHalfFloor(3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        long long34 = unsupportedDateTimeField31.add((-31L), (long) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = unsupportedDateTimeField31.getType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getRangeDurationType();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, dateTimeFieldType35);
        int int38 = dividedDateTimeField37.getMinimumValue();
        org.joda.time.DurationField durationField39 = dividedDateTimeField37.iRangeDurationField;
        long long41 = dividedDateTimeField37.roundCeiling(32L);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dividedDateTimeField37.getAsShortText(1711909554484L, locale43);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 4L + "'", long34 == 4L);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(durationField39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 315532800000L + "'", long41 == 315532800000L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "202" + "'", str44, "202");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test599");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        org.joda.time.DurationField durationField10 = zonedChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology6.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test600");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((-210866846400000L));
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        boolean boolean7 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) iSOChronology6);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 1711909511784L, (java.lang.Number) 969L, (java.lang.Number) 22410261324L);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField14 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.millisOfDay();
        org.joda.time.DurationField durationField16 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField19 = iSOChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekyearOfCentury();
        org.joda.time.Partial partial21 = new org.joda.time.Partial(dateTimeFieldType0, 203, (org.joda.time.Chronology) iSOChronology13);
        java.lang.String str22 = dateTimeFieldType0.getName();
        org.joda.time.IllegalFieldValueException illegalFieldValueException26 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 4140004L, (java.lang.Number) 24595579192356L, (java.lang.Number) (-19520387628L));
        boolean boolean27 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException26);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "yearOfEra" + "'", str22, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test601");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.year();
        org.joda.time.DurationField durationField12 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test602");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        long long6 = unsupportedDurationField5.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType7 = unsupportedDurationField5.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField5.getMillis(1711909558172L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test603");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        int int38 = partial14.compareTo((org.joda.time.ReadablePartial) partial28);
        int[] intArray39 = partial28.getValues();
        int[] intArray40 = partial28.getValues();
        org.joda.time.Partial partial41 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField42 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long45 = durationField42.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long47 = durationField42.getValueAsLong((long) 10);
        int int49 = durationField42.getValue((long) (byte) 10);
        boolean boolean50 = partial41.equals((java.lang.Object) durationField42);
        org.joda.time.Chronology chronology51 = partial41.getChronology();
        org.joda.time.Partial partial52 = new org.joda.time.Partial();
        boolean boolean53 = partial41.isBefore((org.joda.time.ReadablePartial) partial52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = partial41.getFieldTypes();
        org.joda.time.Partial partial55 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField56 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long59 = durationField56.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long61 = durationField56.getValueAsLong((long) 10);
        int int63 = durationField56.getValue((long) (byte) 10);
        boolean boolean64 = partial55.equals((java.lang.Object) durationField56);
        org.joda.time.Chronology chronology65 = partial55.getChronology();
        org.joda.time.Partial partial66 = new org.joda.time.Partial();
        boolean boolean67 = partial55.isBefore((org.joda.time.ReadablePartial) partial66);
        int int68 = partial41.compareTo((org.joda.time.ReadablePartial) partial55);
        org.joda.time.Partial partial69 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField70 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long73 = durationField70.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long75 = durationField70.getValueAsLong((long) 10);
        int int77 = durationField70.getValue((long) (byte) 10);
        boolean boolean78 = partial69.equals((java.lang.Object) durationField70);
        int int79 = partial55.compareTo((org.joda.time.ReadablePartial) partial69);
        int[] intArray80 = partial69.getValues();
        boolean boolean81 = partial28.isBefore((org.joda.time.ReadablePartial) partial69);
        org.joda.time.Chronology chronology82 = partial28.getChronology();
        java.lang.String str83 = partial28.toStringList();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray54);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[]" + "'", str83, "[]");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test604");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.centuries();
        java.lang.String str4 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[100]" + "'", str4, "ISOChronology[100]");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test605");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField14 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType8, durationField13);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType8);
        int int17 = zeroIsMaxDateTimeField15.getLeapAmount(1711909507403L);
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        int int19 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial18);
        org.joda.time.Partial partial20 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial18);
        java.lang.String str21 = partial20.toStringList();
        boolean boolean22 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) partial20);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test606");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = readableInterval1.toPeriod(periodType4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = readableInterval9.contains(readableInterval10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = readableInterval9.toPeriod(periodType12);
        org.joda.time.DateTime dateTime14 = readableInterval9.getEnd();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        boolean boolean19 = readableInterval9.overlaps(readableInterval16);
        boolean boolean20 = readableInterval1.contains(readableInterval16);
        long long21 = readableInterval16.getStartMillis();
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = readableInterval23.contains(readableInterval24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = readableInterval23.toPeriod(periodType26);
        org.joda.time.DateTime dateTime28 = readableInterval23.getEnd();
        org.joda.time.MutableInterval mutableInterval29 = readableInterval23.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.ReadableInterval readableInterval32 = null;
        boolean boolean33 = readableInterval31.contains(readableInterval32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = readableInterval31.toPeriod(periodType34);
        org.joda.time.DateTime dateTime36 = readableInterval31.getEnd();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.ReadableInterval readableInterval39 = null;
        boolean boolean40 = readableInterval38.contains(readableInterval39);
        boolean boolean41 = readableInterval31.overlaps(readableInterval38);
        boolean boolean42 = readableInterval23.contains(readableInterval38);
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.DateTime dateTime44 = readableInterval43.getEnd();
        boolean boolean45 = readableInterval16.isBefore(readableInterval43);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone50 = new org.joda.time.tz.FixedDateTimeZone("hi!", "53460006", (int) (short) 100, 29227899);
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = fixedDateTimeZone50.isLocalDateTimeGap(localDateTime51);
        long long55 = fixedDateTimeZone50.convertLocalToUTC(551154L, false);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        long long58 = readableInterval57.getStartMillis();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        long long61 = readableInterval60.getEndMillis();
        boolean boolean62 = readableInterval57.overlaps(readableInterval60);
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        long long66 = readableInterval65.getStartMillis();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.ReadableInterval readableInterval69 = null;
        boolean boolean70 = readableInterval68.contains(readableInterval69);
        org.joda.time.Duration duration71 = readableInterval68.toDuration();
        org.joda.time.DateTime dateTime72 = readableInterval68.getEnd();
        boolean boolean73 = readableInterval65.contains((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.Chronology chronology74 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean75 = readableInterval57.isAfter((org.joda.time.ReadableInstant) dateTime72);
        int int76 = fixedDateTimeZone50.getOffset((org.joda.time.ReadableInstant) dateTime72);
        boolean boolean77 = readableInterval16.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.ReadableInterval readableInterval78 = null;
        org.joda.time.ReadableInterval readableInterval79 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval78);
        long long80 = readableInterval79.getStartMillis();
        boolean boolean81 = readableInterval16.overlaps(readableInterval79);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 24595579244388L + "'", long21 == 24595579244388L);
        org.junit.Assert.assertNotNull(readableInterval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableInterval29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 551054L + "'", long55 == 551054L);
        org.junit.Assert.assertNotNull(readableInterval57);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 24595579244395L + "'", long58 == 24595579244395L);
        org.junit.Assert.assertNotNull(readableInterval60);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 24595579244395L + "'", long61 == 24595579244395L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(readableInterval65);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 24595579244398L + "'", long66 == 24595579244398L);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(readableInterval79);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 24595579244400L + "'", long80 == 24595579244400L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test607");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        boolean boolean7 = unsupportedDateTimeField6.isLenient();
        java.lang.String str8 = unsupportedDateTimeField6.getName();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        boolean boolean14 = durationFieldType9.isSupported(chronology12);
        org.joda.time.DurationField durationField15 = chronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField23 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType17, durationField22);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField24 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField16, dateTimeFieldType17);
        int int26 = zeroIsMaxDateTimeField24.getLeapAmount(1711909507403L);
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        int int28 = zeroIsMaxDateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) partial27);
        org.joda.time.Partial partial29 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial27);
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial29, 32, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test608");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField11 = new org.joda.time.field.OffsetDateTimeField(dateTimeField8, dateTimeFieldType9, (int) (short) 1);
        int int13 = offsetDateTimeField11.get(60000L);
        int int14 = offsetDateTimeField11.getMaximumValue();
        boolean boolean15 = offsetDateTimeField11.isSupported();
        int int16 = offsetDateTimeField11.getMinimumValue();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test609");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology6.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test610");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField14 = iSOChronology0.weeks();
        org.joda.time.Partial partial15 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField16 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long19 = durationField16.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long21 = durationField16.getValueAsLong((long) 10);
        int int23 = durationField16.getValue((long) (byte) 10);
        boolean boolean24 = partial15.equals((java.lang.Object) durationField16);
        org.joda.time.Chronology chronology25 = partial15.getChronology();
        org.joda.time.Partial partial26 = new org.joda.time.Partial();
        boolean boolean27 = partial15.isBefore((org.joda.time.ReadablePartial) partial26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = partial15.getFieldTypes();
        org.joda.time.Partial partial29 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField30 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long33 = durationField30.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long35 = durationField30.getValueAsLong((long) 10);
        int int37 = durationField30.getValue((long) (byte) 10);
        boolean boolean38 = partial29.equals((java.lang.Object) durationField30);
        org.joda.time.Chronology chronology39 = partial29.getChronology();
        org.joda.time.Partial partial40 = new org.joda.time.Partial();
        boolean boolean41 = partial29.isBefore((org.joda.time.ReadablePartial) partial40);
        int int42 = partial15.compareTo((org.joda.time.ReadablePartial) partial29);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str44 = dateTimeZone43.toString();
        java.lang.String str46 = dateTimeZone43.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeUtils.getZone(dateTimeZone43);
        boolean boolean48 = partial29.equals((java.lang.Object) dateTimeZone47);
        org.joda.time.Partial partial49 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField50 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long53 = durationField50.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long55 = durationField50.getValueAsLong((long) 10);
        int int57 = durationField50.getValue((long) (byte) 10);
        boolean boolean58 = partial49.equals((java.lang.Object) durationField50);
        org.joda.time.Chronology chronology59 = partial49.getChronology();
        org.joda.time.Partial partial60 = new org.joda.time.Partial();
        boolean boolean61 = partial49.isBefore((org.joda.time.ReadablePartial) partial60);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray62 = partial49.getFieldTypes();
        boolean boolean63 = partial29.isAfter((org.joda.time.ReadablePartial) partial49);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.Partial partial65 = partial29.plus(readablePeriod64);
        int[] intArray67 = iSOChronology0.get((org.joda.time.ReadablePartial) partial65, (long) 6631178);
        java.lang.String str68 = partial65.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(partial65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test611");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        boolean boolean9 = readableInterval7.contains(readableInterval8);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = readableInterval7.toPeriod(periodType10);
        org.joda.time.DateTime dateTime12 = readableInterval7.getEnd();
        org.joda.time.MutableInterval mutableInterval13 = readableInterval7.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.ReadableInterval readableInterval16 = null;
        boolean boolean17 = readableInterval15.contains(readableInterval16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = readableInterval15.toPeriod(periodType18);
        org.joda.time.DateTime dateTime20 = readableInterval15.getEnd();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        boolean boolean24 = readableInterval22.contains(readableInterval23);
        boolean boolean25 = readableInterval15.overlaps(readableInterval22);
        boolean boolean26 = readableInterval7.contains(readableInterval22);
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        boolean boolean28 = readableInterval1.contains(readableInterval27);
        org.joda.time.Partial partial29 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField30 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long33 = durationField30.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long35 = durationField30.getValueAsLong((long) 10);
        int int37 = durationField30.getValue((long) (byte) 10);
        boolean boolean38 = partial29.equals((java.lang.Object) durationField30);
        org.joda.time.Chronology chronology39 = partial29.getChronology();
        org.joda.time.Partial partial40 = new org.joda.time.Partial();
        boolean boolean41 = partial29.isBefore((org.joda.time.ReadablePartial) partial40);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = partial29.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = partial29.getFieldTypes();
        java.lang.String str44 = partial29.toString();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.ReadableInterval readableInterval47 = null;
        boolean boolean48 = readableInterval46.contains(readableInterval47);
        org.joda.time.Duration duration49 = readableInterval46.toDuration();
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.ReadableInterval readableInterval52 = null;
        boolean boolean53 = readableInterval51.contains(readableInterval52);
        org.joda.time.Duration duration54 = readableInterval51.toDuration();
        org.joda.time.DateTime dateTime55 = readableInterval51.getEnd();
        boolean boolean56 = readableInterval46.isBefore((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.ReadableInterval readableInterval59 = null;
        boolean boolean60 = readableInterval58.contains(readableInterval59);
        org.joda.time.Duration duration61 = readableInterval58.toDuration();
        org.joda.time.DateTime dateTime62 = readableInterval58.getEnd();
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime64 = partial29.toDateTime((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean65 = readableInterval1.contains((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(readableInterval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableInterval13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray42);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test612");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology6.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test613");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DurationField durationField5 = zonedChronology4.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = durationField5.getMillis((int) ' ', 22883669517525L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test614");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = zonedChronology4.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = zonedChronology4.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test615");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        int int13 = partial11.size();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test616");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField7 = iSOChronology0.minutes();
        org.joda.time.DurationField durationField8 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology0.get(readablePeriod10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test617");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = partial16.getFieldTypes();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        boolean boolean42 = readableInterval40.contains(readableInterval41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = readableInterval40.toPeriod(periodType43);
        int[] intArray46 = chronology36.get((org.joda.time.ReadablePeriod) period44, (-210866846400000L));
        org.joda.time.Partial partial47 = partial16.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField49 = iSOChronology48.minutes();
        org.joda.time.Partial partial50 = partial47.withChronologyRetainFields((org.joda.time.Chronology) iSOChronology48);
        org.joda.time.Chronology chronology51 = partial47.getChronology();
        int[] intArray52 = partial47.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType54 = partial47.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(partial50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test618");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField6 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long9 = durationField6.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long11 = durationField6.getValueAsLong((long) 10);
        int int13 = durationField6.getValue((long) (byte) 10);
        boolean boolean14 = partial5.equals((java.lang.Object) durationField6);
        boolean boolean15 = partial4.isBefore((org.joda.time.ReadablePartial) partial5);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.Chronology chronology19 = iSOChronology16.withZone(dateTimeZone17);
        org.joda.time.Partial partial20 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology16);
        boolean boolean21 = partial4.isBefore((org.joda.time.ReadablePartial) partial20);
        java.lang.String str22 = partial20.toString();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        boolean boolean26 = readableInterval24.contains(readableInterval25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = readableInterval24.toPeriod(periodType27);
        org.joda.time.DateTime dateTime29 = readableInterval24.getEnd();
        org.joda.time.MutableInterval mutableInterval30 = readableInterval24.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.ReadableInterval readableInterval33 = null;
        boolean boolean34 = readableInterval32.contains(readableInterval33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = readableInterval32.toPeriod(periodType35);
        org.joda.time.DateTime dateTime37 = readableInterval32.getEnd();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        boolean boolean41 = readableInterval39.contains(readableInterval40);
        boolean boolean42 = readableInterval32.overlaps(readableInterval39);
        boolean boolean43 = readableInterval24.contains(readableInterval39);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.DateTimeUtils.getPeriodType(periodType44);
        org.joda.time.PeriodType periodType46 = org.joda.time.DateTimeUtils.getPeriodType(periodType45);
        org.joda.time.Period period47 = readableInterval24.toPeriod(periodType46);
        org.joda.time.Partial partial48 = partial20.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Chronology chronology49 = partial20.getChronology();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableInterval30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(partial48);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) 28800001L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(22883669517525L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test620");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField14 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType8, durationField13);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType8);
        int int17 = zeroIsMaxDateTimeField15.getLeapAmount(1711909507403L);
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        int int19 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial18);
        org.joda.time.Partial partial20 = new org.joda.time.Partial((org.joda.time.ReadablePartial) partial18);
        java.lang.String str21 = partial20.toStringList();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType23 = partial20.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test621");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.halfdayOfDay();
        org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldType0, 10, (org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test622");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        boolean boolean6 = unsupportedDurationField5.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField5.getMillis(5727502314739L, 2830L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test623");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        java.lang.String str16 = unsupportedDurationField5.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = unsupportedDurationField5.add(76188L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnsupportedDurationField[hours]" + "'", str16, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test624");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField14 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType8, durationField13);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField15 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField7, dateTimeFieldType8);
        int int17 = zeroIsMaxDateTimeField15.getLeapAmount(1711909507403L);
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        int int19 = zeroIsMaxDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial18);
        int int21 = zeroIsMaxDateTimeField15.getMinimumValue(53459997L);
        long long23 = zeroIsMaxDateTimeField15.roundFloor(63072001367L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 63072000000L + "'", long23 == 63072000000L);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test625");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = readableInterval1.toPeriod(periodType4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = readableInterval9.contains(readableInterval10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = readableInterval9.toPeriod(periodType12);
        org.joda.time.DateTime dateTime14 = readableInterval9.getEnd();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        boolean boolean19 = readableInterval9.overlaps(readableInterval16);
        boolean boolean20 = readableInterval1.contains(readableInterval16);
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.ReadableInterval readableInterval24 = null;
        boolean boolean25 = readableInterval23.contains(readableInterval24);
        org.joda.time.Duration duration26 = readableInterval23.toDuration();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.ReadableInterval readableInterval29 = null;
        boolean boolean30 = readableInterval28.contains(readableInterval29);
        org.joda.time.Duration duration31 = readableInterval28.toDuration();
        org.joda.time.DateTime dateTime32 = readableInterval28.getEnd();
        boolean boolean33 = readableInterval23.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.ReadableInterval readableInterval36 = null;
        boolean boolean37 = readableInterval35.contains(readableInterval36);
        org.joda.time.Duration duration38 = readableInterval35.toDuration();
        org.joda.time.DateTime dateTime39 = readableInterval35.getEnd();
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime39);
        boolean boolean41 = readableInterval1.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        long long44 = readableInterval43.getStartMillis();
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        long long47 = readableInterval46.getEndMillis();
        boolean boolean48 = readableInterval43.overlaps(readableInterval46);
        java.lang.String str49 = readableInterval46.toString();
        org.joda.time.MutableInterval mutableInterval50 = readableInterval46.toMutableInterval();
        org.joda.time.JodaTimePermission jodaTimePermission52 = new org.joda.time.JodaTimePermission("hi!");
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.minuteOfDay();
        int int58 = dateTimeField57.getMinimumValue();
        long long61 = dateTimeField57.add(0L, (long) (byte) 1);
        java.util.Locale locale64 = null;
        long long65 = dateTimeField57.set(4L, "69", locale64);
        jodaTimePermission52.checkGuard((java.lang.Object) locale64);
        org.joda.time.JodaTimePermission jodaTimePermission68 = new org.joda.time.JodaTimePermission("hi!");
        boolean boolean69 = jodaTimePermission52.implies((java.security.Permission) jodaTimePermission68);
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.PeriodType periodType71 = org.joda.time.DateTimeUtils.getPeriodType(periodType70);
        org.joda.time.PeriodType periodType72 = org.joda.time.DateTimeUtils.getPeriodType(periodType71);
        boolean boolean73 = jodaTimePermission52.equals((java.lang.Object) periodType72);
        org.joda.time.Period period74 = mutableInterval50.toPeriod(periodType72);
        org.joda.time.Period period75 = readableInterval1.toPeriod(periodType72);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(readableInterval23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(readableInterval43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 7200000L + "'", long44 == 7200000L);
        org.junit.Assert.assertNotNull(readableInterval46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 7200000L + "'", long47 == 7200000L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01T02:00:00.000Z/1970-01-01T02:00:00.000Z" + "'", str49, "1970-01-01T02:00:00.000Z/1970-01-01T02:00:00.000Z");
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 60000L + "'", long61 == 60000L);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 4140004L + "'", long65 == 4140004L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(period75);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test626");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField6 = iSOChronology5.minutes();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology9 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology5, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology9.getZone();
        org.joda.time.DurationField durationField11 = zonedChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField12 = zonedChronology9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = zonedChronology9.getZone();
        boolean boolean14 = iSOChronology0.equals((java.lang.Object) zonedChronology9);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology0.millisOfSecond();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("", "7", 32, (int) '4');
        org.joda.time.Chronology chronology21 = iSOChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test627");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = partial16.getFieldTypes();
        org.joda.time.ReadableInterval readableInterval34 = null;
        org.joda.time.ReadableInterval readableInterval35 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval34);
        org.joda.time.Chronology chronology36 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval34);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.ReadableInterval readableInterval41 = null;
        boolean boolean42 = readableInterval40.contains(readableInterval41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = readableInterval40.toPeriod(periodType43);
        int[] intArray46 = chronology36.get((org.joda.time.ReadablePeriod) period44, (-210866846400000L));
        org.joda.time.Partial partial47 = partial16.minus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField49 = iSOChronology48.minutes();
        org.joda.time.Partial partial50 = partial47.withChronologyRetainFields((org.joda.time.Chronology) iSOChronology48);
        int int51 = partial47.size();
        java.lang.String str52 = partial47.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology56.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField59 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType53, durationField58);
        long long62 = durationField58.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        boolean boolean68 = durationFieldType63.isSupported(chronology66);
        org.joda.time.field.ScaledDurationField scaledDurationField70 = new org.joda.time.field.ScaledDurationField(durationField58, durationFieldType63, (int) 'a');
        long long71 = scaledDurationField70.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType72 = scaledDurationField70.getType();
        org.joda.time.field.PreciseDurationField preciseDurationField74 = new org.joda.time.field.PreciseDurationField(durationFieldType72, (long) ' ');
        long long75 = preciseDurationField74.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType76 = preciseDurationField74.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial78 = partial47.withFieldAdded(durationFieldType76, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(readableInterval35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(intArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(partial47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(partial50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(readableInterval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-210866846400000L) + "'", long62 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 97L + "'", long71 == 97L);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 32L + "'", long75 == 32L);
        org.junit.Assert.assertNotNull(durationFieldType76);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test628");
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
        long long23 = scaledDurationField17.getValueAsLong((long) 53460006);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField25 = iSOChronology24.minutes();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str27 = dateTimeZone26.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology28 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology24, dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology24.era();
        org.joda.time.DurationField durationField31 = iSOChronology24.hours();
        int int32 = scaledDurationField17.compareTo(durationField31);
        long long35 = durationField31.subtract(32001L, 32);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = durationField31.getMillis((-898957916640000000L), 203L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -898957916640000000 * 3600000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 551134L + "'", long23 == 551134L);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-115167999L) + "'", long35 == (-115167999L));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test629");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.field.PreciseDurationField preciseDurationField9 = new org.joda.time.field.PreciseDurationField(durationFieldType7, 28531825L);
        long long12 = preciseDurationField9.getMillis(60035L, (-210866846400000L));
        boolean boolean13 = preciseDurationField9.isPrecise();
        boolean boolean14 = preciseDurationField9.isSupported();
        int int15 = unsupportedDurationField5.compareTo((org.joda.time.DurationField) preciseDurationField9);
        boolean boolean16 = unsupportedDurationField5.isSupported();
        long long17 = unsupportedDurationField5.getUnitMillis();
        long long18 = unsupportedDurationField5.getUnitMillis();
        long long19 = unsupportedDurationField5.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1712908113875L + "'", long12 == 1712908113875L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test630");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.String str4 = dateTimeZone1.getShortName((-210866846400000L));
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        boolean boolean7 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) iSOChronology6);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 1711909511784L, (java.lang.Number) 969L, (java.lang.Number) 22410261324L);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField14 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.millisOfDay();
        org.joda.time.DurationField durationField16 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.yearOfCentury();
        org.joda.time.DurationField durationField19 = iSOChronology13.seconds();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology13.weekyearOfCentury();
        org.joda.time.Partial partial21 = new org.joda.time.Partial(dateTimeFieldType0, 203, (org.joda.time.Chronology) iSOChronology13);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial24 = partial21.withFieldAddWrapped(durationFieldType22, 53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationFieldType22);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test631");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        int[] intArray14 = partial0.getValues();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.ReadableInterval readableInterval28 = null;
        boolean boolean29 = readableInterval27.contains(readableInterval28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = readableInterval27.toPeriod(periodType30);
        int[] intArray33 = chronology23.get((org.joda.time.ReadablePeriod) period31, (-210866846400000L));
        int[] intArray36 = chronology17.get((org.joda.time.ReadablePeriod) period31, 2173795348453L, (long) 1439);
        org.joda.time.Partial partial37 = partial0.plus((org.joda.time.ReadablePeriod) period31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField39 = partial0.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(partial37);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test632");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology2.halfdayOfDay();
        org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldType0, 10, (org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        int int11 = partial9.indexOf(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test633");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = partial0.getFieldTypes();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField15 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long18 = durationField15.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long20 = durationField15.getValueAsLong((long) 10);
        int int22 = durationField15.getValue((long) (byte) 10);
        boolean boolean23 = partial14.equals((java.lang.Object) durationField15);
        org.joda.time.Chronology chronology24 = partial14.getChronology();
        org.joda.time.Partial partial25 = new org.joda.time.Partial();
        boolean boolean26 = partial14.isBefore((org.joda.time.ReadablePartial) partial25);
        int int27 = partial0.compareTo((org.joda.time.ReadablePartial) partial14);
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField29 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long32 = durationField29.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long34 = durationField29.getValueAsLong((long) 10);
        int int36 = durationField29.getValue((long) (byte) 10);
        boolean boolean37 = partial28.equals((java.lang.Object) durationField29);
        int int38 = partial14.compareTo((org.joda.time.ReadablePartial) partial28);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        long long41 = readableInterval40.getStartMillis();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.Duration duration46 = readableInterval43.toDuration();
        org.joda.time.DateTime dateTime47 = readableInterval43.getEnd();
        boolean boolean48 = readableInterval40.contains((org.joda.time.ReadableInstant) dateTime47);
        long long49 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime51 = partial14.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime51);
        long long53 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(readableInterval40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 7200000L + "'", long41 == 7200000L);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 7200000L + "'", long49 == 7200000L);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 7200000L + "'", long53 == 7200000L);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test634");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField7, dateTimeFieldType8, 4, (int) ' ', (int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField15 = new org.joda.time.field.RemainderDateTimeField(dateTimeField7, dateTimeFieldType13, 28531765);
        org.joda.time.DurationField durationField16 = remainderDateTimeField15.getDurationField();
        int int18 = remainderDateTimeField15.getMinimumValue((-58877472891246L));
        org.joda.time.DurationField durationField19 = remainderDateTimeField15.getDurationField();
        long long21 = remainderDateTimeField15.roundCeiling((-97L));
        org.joda.time.Partial partial22 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField23 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long26 = durationField23.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long28 = durationField23.getValueAsLong((long) 10);
        int int30 = durationField23.getValue((long) (byte) 10);
        boolean boolean31 = partial22.equals((java.lang.Object) durationField23);
        org.joda.time.Chronology chronology32 = partial22.getChronology();
        org.joda.time.Partial partial33 = new org.joda.time.Partial();
        boolean boolean34 = partial22.isBefore((org.joda.time.ReadablePartial) partial33);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = partial22.getFieldTypes();
        org.joda.time.Partial partial36 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField37 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long40 = durationField37.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long42 = durationField37.getValueAsLong((long) 10);
        int int44 = durationField37.getValue((long) (byte) 10);
        boolean boolean45 = partial36.equals((java.lang.Object) durationField37);
        org.joda.time.Chronology chronology46 = partial36.getChronology();
        org.joda.time.Partial partial47 = new org.joda.time.Partial();
        boolean boolean48 = partial36.isBefore((org.joda.time.ReadablePartial) partial47);
        int int49 = partial22.compareTo((org.joda.time.ReadablePartial) partial36);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int51 = partial22.indexOf(dateTimeFieldType50);
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField54 = iSOChronology53.minutes();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology53.millisOfDay();
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval56);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology58.millis();
        org.joda.time.DurationField durationField61 = chronology58.centuries();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DurationField durationField66 = chronology64.millis();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.dayOfWeek();
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
        int[] intArray83 = chronology64.get((org.joda.time.ReadablePeriod) period78, 2173795348453L, (long) 1439);
        int[] intArray86 = chronology58.get((org.joda.time.ReadablePeriod) period78, 291L, 2580171L);
        int[] intArray89 = iSOChronology53.get((org.joda.time.ReadablePeriod) period78, (-30610224000000L), 291L);
        java.util.Locale locale91 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray92 = remainderDateTimeField15.set((org.joda.time.ReadablePartial) partial22, 24, intArray89, "2151-07-01T12:51:48.321Z/2151-07-01T12:51:48.321Z", locale91);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2151-07-01T12:51:48.321Z/2151-07-01T12:51:48.321Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationField19);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(readableInterval74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(intArray80);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertNotNull(intArray89);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[970, 0, 0, 0, 0, 0, 0, 291]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test635");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = zonedChronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology4.dayOfMonth();
        org.joda.time.Chronology chronology10 = zonedChronology4.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        java.lang.String str14 = dateTimeZone11.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeUtils.getZone(dateTimeZone11);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone16 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone15);
        int int18 = cachedDateTimeZone16.getStandardOffset(28800001L);
        org.joda.time.DateTimeZone dateTimeZone19 = cachedDateTimeZone16.getUncachedZone();
        java.util.Locale locale21 = null;
        java.lang.String str22 = cachedDateTimeZone16.getName(0L, locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = cachedDateTimeZone16.getUncachedZone();
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone24 = org.joda.time.tz.CachedDateTimeZone.forZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        org.joda.time.Chronology chronology25 = zonedChronology4.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone16);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(cachedDateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(cachedDateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test636");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        java.lang.String str6 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfSecond();
        org.joda.time.Partial partial8 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField9 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long12 = durationField9.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long14 = durationField9.getValueAsLong((long) 10);
        int int16 = durationField9.getValue((long) (byte) 10);
        boolean boolean17 = partial8.equals((java.lang.Object) durationField9);
        org.joda.time.Chronology chronology18 = partial8.getChronology();
        org.joda.time.Partial partial19 = new org.joda.time.Partial();
        boolean boolean20 = partial8.isBefore((org.joda.time.ReadablePartial) partial19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = partial8.getFieldTypes();
        org.joda.time.Partial partial22 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField23 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long26 = durationField23.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long28 = durationField23.getValueAsLong((long) 10);
        int int30 = durationField23.getValue((long) (byte) 10);
        boolean boolean31 = partial22.equals((java.lang.Object) durationField23);
        org.joda.time.Chronology chronology32 = partial22.getChronology();
        org.joda.time.Partial partial33 = new org.joda.time.Partial();
        boolean boolean34 = partial22.isBefore((org.joda.time.ReadablePartial) partial33);
        int int35 = partial8.compareTo((org.joda.time.ReadablePartial) partial22);
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        boolean boolean39 = readableInterval37.contains(readableInterval38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = readableInterval37.toPeriod(periodType40);
        org.joda.time.DateTime dateTime42 = readableInterval37.getEnd();
        org.joda.time.MutableInterval mutableInterval43 = readableInterval37.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        boolean boolean47 = readableInterval45.contains(readableInterval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = readableInterval45.toPeriod(periodType48);
        org.joda.time.DateTime dateTime50 = readableInterval45.getEnd();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.ReadableInterval readableInterval53 = null;
        boolean boolean54 = readableInterval52.contains(readableInterval53);
        boolean boolean55 = readableInterval45.overlaps(readableInterval52);
        boolean boolean56 = readableInterval37.contains(readableInterval52);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.PeriodType periodType58 = org.joda.time.DateTimeUtils.getPeriodType(periodType57);
        org.joda.time.PeriodType periodType59 = org.joda.time.DateTimeUtils.getPeriodType(periodType58);
        org.joda.time.Period period60 = readableInterval37.toPeriod(periodType59);
        org.joda.time.Partial partial61 = partial8.plus((org.joda.time.ReadablePeriod) period60);
        long long64 = iSOChronology0.add((org.joda.time.ReadablePeriod) period60, 53463650L, 7);
        org.joda.time.DateTimeField dateTimeField65 = iSOChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[100]" + "'", str5, "ISOChronology[100]");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[100]" + "'", str6, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(periodType58);
        org.junit.Assert.assertNotNull(periodType59);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(partial61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 53463650L + "'", long64 == 53463650L);
        org.junit.Assert.assertNotNull(dateTimeField65);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test637");
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
        int int19 = scaledDurationField17.getValue((long) (short) -1);
        long long22 = scaledDurationField17.add((long) (-1), 10);
        org.joda.time.DurationFieldType durationFieldType23 = scaledDurationField17.getType();
        long long26 = scaledDurationField17.getMillis(1711909504045L, (long) (-1));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone31);
        boolean boolean33 = scaledDurationField17.equals((java.lang.Object) fixedDateTimeZone31);
        java.lang.String str35 = fixedDateTimeZone31.getNameKey(24614409600000L);
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.ReadableInterval readableInterval38 = null;
        boolean boolean39 = readableInterval37.contains(readableInterval38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = readableInterval37.toPeriod(periodType40);
        org.joda.time.DateTime dateTime42 = readableInterval37.getEnd();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.ReadableInterval readableInterval45 = null;
        boolean boolean46 = readableInterval44.contains(readableInterval45);
        boolean boolean47 = readableInterval37.overlaps(readableInterval44);
        boolean boolean48 = fixedDateTimeZone31.equals((java.lang.Object) readableInterval37);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 969L + "'", long22 == 969L);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 166055221892365L + "'", long26 == 166055221892365L);
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str35, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(readableInterval44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test638");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        long long6 = unsupportedDurationField5.getUnitMillis();
        long long7 = unsupportedDurationField5.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = unsupportedDurationField5.getMillis(36557899L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test639");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.centuryOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = iSOChronology2.withZone(dateTimeZone7);
        org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldType0, 274, chronology8);
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = iSOChronology11.getZone();
        org.joda.time.DurationField durationField14 = iSOChronology11.years();
        org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldType0, (-1140), (org.joda.time.Chronology) iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test640");
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
        long long21 = scaledDurationField17.add(2440588L, 1439);
        org.joda.time.DurationField durationField22 = scaledDurationField17.getWrappedField();
        long long23 = scaledDurationField17.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2580171L + "'", long21 == 2580171L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test641");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.Chronology chronology33 = partial16.getChronology();
        java.lang.String str34 = partial16.toString();
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test642");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField1 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long4 = durationField1.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long6 = durationField1.getValueAsLong((long) 10);
        int int8 = durationField1.getValue((long) (byte) 10);
        boolean boolean9 = partial0.equals((java.lang.Object) durationField1);
        org.joda.time.Chronology chronology10 = partial0.getChronology();
        org.joda.time.Partial partial11 = new org.joda.time.Partial();
        boolean boolean12 = partial0.isBefore((org.joda.time.ReadablePartial) partial11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = partial11.toString("723", locale14);
        org.joda.time.Partial partial16 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField17 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long20 = durationField17.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long22 = durationField17.getValueAsLong((long) 10);
        int int24 = durationField17.getValue((long) (byte) 10);
        boolean boolean25 = partial16.equals((java.lang.Object) durationField17);
        org.joda.time.Chronology chronology26 = partial16.getChronology();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        boolean boolean28 = partial16.isBefore((org.joda.time.ReadablePartial) partial27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = partial16.getFieldTypes();
        java.lang.Object obj30 = null;
        boolean boolean31 = partial16.equals(obj30);
        boolean boolean32 = partial11.isBefore((org.joda.time.ReadablePartial) partial16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = partial16.getFieldTypes();
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone35 = iSOChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology34.minuteOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str39 = dateTimeZone38.toString();
        org.joda.time.Chronology chronology40 = iSOChronology37.withZone(dateTimeZone38);
        org.joda.time.Partial partial41 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology37);
        org.joda.time.Partial partial42 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField43 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long46 = durationField43.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long48 = durationField43.getValueAsLong((long) 10);
        int int50 = durationField43.getValue((long) (byte) 10);
        boolean boolean51 = partial42.equals((java.lang.Object) durationField43);
        boolean boolean52 = partial41.isBefore((org.joda.time.ReadablePartial) partial42);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DurationField durationField58 = chronology55.centuries();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval59);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfCentury();
        org.joda.time.DurationField durationField63 = chronology61.millis();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        int[] intArray80 = chronology61.get((org.joda.time.ReadablePeriod) period75, 2173795348453L, (long) 1439);
        int[] intArray83 = chronology55.get((org.joda.time.ReadablePeriod) period75, 291L, 2580171L);
        int int84 = dateTimeField36.getMaximumValue((org.joda.time.ReadablePartial) partial42, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial85 = new org.joda.time.Partial(dateTimeFieldTypeArray33, intArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "723" + "'", str15, "723");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(iSOChronology34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1439 + "'", int84 == 1439);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test643");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.yearOfCentury();
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField13 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long16 = durationField13.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long18 = durationField13.getValueAsLong((long) 10);
        int int20 = durationField13.getValue((long) (byte) 10);
        boolean boolean21 = partial12.equals((java.lang.Object) durationField13);
        org.joda.time.Chronology chronology22 = partial12.getChronology();
        org.joda.time.Partial partial23 = new org.joda.time.Partial();
        boolean boolean24 = partial12.isBefore((org.joda.time.ReadablePartial) partial23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = partial12.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = partial12.getFieldTypes();
        org.joda.time.Partial partial27 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField28 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long31 = durationField28.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long33 = durationField28.getValueAsLong((long) 10);
        int int35 = durationField28.getValue((long) (byte) 10);
        boolean boolean36 = partial27.equals((java.lang.Object) durationField28);
        org.joda.time.Chronology chronology37 = partial27.getChronology();
        org.joda.time.Partial partial38 = new org.joda.time.Partial();
        boolean boolean39 = partial27.isBefore((org.joda.time.ReadablePartial) partial38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = partial27.getFieldTypes();
        org.joda.time.Partial partial41 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField42 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long45 = durationField42.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long47 = durationField42.getValueAsLong((long) 10);
        int int49 = durationField42.getValue((long) (byte) 10);
        boolean boolean50 = partial41.equals((java.lang.Object) durationField42);
        org.joda.time.Chronology chronology51 = partial41.getChronology();
        org.joda.time.Partial partial52 = new org.joda.time.Partial();
        boolean boolean53 = partial41.isBefore((org.joda.time.ReadablePartial) partial52);
        int int54 = partial27.compareTo((org.joda.time.ReadablePartial) partial41);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str56 = dateTimeZone55.toString();
        java.lang.String str58 = dateTimeZone55.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeUtils.getZone(dateTimeZone55);
        boolean boolean60 = partial41.equals((java.lang.Object) dateTimeZone59);
        org.joda.time.Partial partial61 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField62 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long65 = durationField62.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long67 = durationField62.getValueAsLong((long) 10);
        int int69 = durationField62.getValue((long) (byte) 10);
        boolean boolean70 = partial61.equals((java.lang.Object) durationField62);
        org.joda.time.Chronology chronology71 = partial61.getChronology();
        org.joda.time.Partial partial72 = new org.joda.time.Partial();
        boolean boolean73 = partial61.isBefore((org.joda.time.ReadablePartial) partial72);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray74 = partial61.getFieldTypes();
        boolean boolean75 = partial41.isAfter((org.joda.time.ReadablePartial) partial61);
        int int76 = partial12.compareTo((org.joda.time.ReadablePartial) partial41);
        org.joda.time.Partial partial78 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField79 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long82 = durationField79.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long84 = durationField79.getValueAsLong((long) 10);
        int int86 = durationField79.getValue((long) (byte) 10);
        boolean boolean87 = partial78.equals((java.lang.Object) durationField79);
        org.joda.time.Chronology chronology88 = partial78.getChronology();
        org.joda.time.Partial partial89 = new org.joda.time.Partial();
        boolean boolean90 = partial78.isBefore((org.joda.time.ReadablePartial) partial89);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray91 = partial78.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray92 = partial78.getFieldTypes();
        int[] intArray93 = partial78.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray95 = dateTimeField11.add((org.joda.time.ReadablePartial) partial41, 9, intArray93, 28531764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00" + "'", str58, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(durationField79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L + "'", long84 == 10L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray91);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray92);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test644");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField6 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long9 = durationField6.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long11 = durationField6.getValueAsLong((long) 10);
        int int13 = durationField6.getValue((long) (byte) 10);
        boolean boolean14 = partial5.equals((java.lang.Object) durationField6);
        boolean boolean15 = partial4.isBefore((org.joda.time.ReadablePartial) partial5);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.Chronology chronology19 = iSOChronology16.withZone(dateTimeZone17);
        org.joda.time.Partial partial20 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology16);
        boolean boolean21 = partial4.isBefore((org.joda.time.ReadablePartial) partial20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = partial20.getFormatter();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateTimeFormatter22);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test645");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis(0, (int) ' ', (int) 'a', 323506);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test646");
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
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, (int) ' ', locale25);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = dividedDateTimeField11.getAsText(readablePartial27, (int) (byte) 10, locale29);
        long long32 = dividedDateTimeField11.roundHalfFloor((long) 100);
        long long35 = dividedDateTimeField11.add(0L, 28531765);
        long long37 = dividedDateTimeField11.remainder((-53459996L));
        org.joda.time.DurationField durationField38 = dividedDateTimeField11.getDurationField();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str41 = dateTimeZone40.toString();
        org.joda.time.Chronology chronology42 = iSOChronology39.withZone(dateTimeZone40);
        org.joda.time.Partial partial43 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology39);
        org.joda.time.Partial partial44 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField45 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long48 = durationField45.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long50 = durationField45.getValueAsLong((long) 10);
        int int52 = durationField45.getValue((long) (byte) 10);
        boolean boolean53 = partial44.equals((java.lang.Object) durationField45);
        boolean boolean54 = partial43.isBefore((org.joda.time.ReadablePartial) partial44);
        org.joda.time.chrono.ISOChronology iSOChronology55 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str57 = dateTimeZone56.toString();
        org.joda.time.Chronology chronology58 = iSOChronology55.withZone(dateTimeZone56);
        org.joda.time.Partial partial59 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology55);
        boolean boolean60 = partial43.isBefore((org.joda.time.ReadablePartial) partial59);
        java.lang.String str61 = partial59.toString();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.ReadableInterval readableInterval64 = null;
        boolean boolean65 = readableInterval63.contains(readableInterval64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = readableInterval63.toPeriod(periodType66);
        org.joda.time.DateTime dateTime68 = readableInterval63.getEnd();
        org.joda.time.MutableInterval mutableInterval69 = readableInterval63.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        org.joda.time.DateTime dateTime76 = readableInterval71.getEnd();
        org.joda.time.ReadableInterval readableInterval77 = null;
        org.joda.time.ReadableInterval readableInterval78 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval77);
        org.joda.time.ReadableInterval readableInterval79 = null;
        boolean boolean80 = readableInterval78.contains(readableInterval79);
        boolean boolean81 = readableInterval71.overlaps(readableInterval78);
        boolean boolean82 = readableInterval63.contains(readableInterval78);
        org.joda.time.PeriodType periodType83 = null;
        org.joda.time.PeriodType periodType84 = org.joda.time.DateTimeUtils.getPeriodType(periodType83);
        org.joda.time.PeriodType periodType85 = org.joda.time.DateTimeUtils.getPeriodType(periodType84);
        org.joda.time.Period period86 = readableInterval63.toPeriod(periodType85);
        org.joda.time.Partial partial87 = partial59.minus((org.joda.time.ReadablePeriod) period86);
        java.util.Locale locale88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = dividedDateTimeField11.getAsText((org.joda.time.ReadablePartial) partial59, locale88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "32" + "'", str26, "32");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10" + "'", str30, "10");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9003755385792000000L + "'", long35 == 9003755385792000000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 315479340004L + "'", long37 == 315479340004L);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(iSOChronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(iSOChronology55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "[]" + "'", str61, "[]");
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(mutableInterval69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(readableInterval78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(partial87);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test647");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfWeek();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.minuteOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.Chronology chronology17 = iSOChronology14.withZone(dateTimeZone15);
        org.joda.time.Partial partial18 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.Partial partial19 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField20 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long23 = durationField20.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long25 = durationField20.getValueAsLong((long) 10);
        int int27 = durationField20.getValue((long) (byte) 10);
        boolean boolean28 = partial19.equals((java.lang.Object) durationField20);
        boolean boolean29 = partial18.isBefore((org.joda.time.ReadablePartial) partial19);
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.DurationField durationField35 = chronology32.centuries();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.DurationField durationField40 = chronology38.millis();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.ReadableInterval readableInterval49 = null;
        boolean boolean50 = readableInterval48.contains(readableInterval49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = readableInterval48.toPeriod(periodType51);
        int[] intArray54 = chronology44.get((org.joda.time.ReadablePeriod) period52, (-210866846400000L));
        int[] intArray57 = chronology38.get((org.joda.time.ReadablePeriod) period52, 2173795348453L, (long) 1439);
        int[] intArray60 = chronology32.get((org.joda.time.ReadablePeriod) period52, 291L, 2580171L);
        int int61 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) partial19, intArray60);
        java.util.Locale locale63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) partial19, 19, locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray54);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1439 + "'", int61 == 1439);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test648");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.centuries();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField9 = zonedChronology4.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test649");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.minutes();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField10 = iSOChronology9.minutes();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology9, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = zonedChronology13.getZone();
        boolean boolean15 = dateTimeFieldType7.isSupported((org.joda.time.Chronology) zonedChronology13);
        org.joda.time.DateTimeField dateTimeField16 = zonedChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = zonedChronology13.secondOfMinute();
        org.joda.time.Partial partial18 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField19 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long22 = durationField19.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long24 = durationField19.getValueAsLong((long) 10);
        int int26 = durationField19.getValue((long) (byte) 10);
        boolean boolean27 = partial18.equals((java.lang.Object) durationField19);
        org.joda.time.Chronology chronology28 = partial18.getChronology();
        org.joda.time.Partial partial29 = new org.joda.time.Partial();
        boolean boolean30 = partial18.isBefore((org.joda.time.ReadablePartial) partial29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = partial29.toString("723", locale32);
        org.joda.time.Partial partial34 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField35 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long38 = durationField35.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long40 = durationField35.getValueAsLong((long) 10);
        int int42 = durationField35.getValue((long) (byte) 10);
        boolean boolean43 = partial34.equals((java.lang.Object) durationField35);
        org.joda.time.Chronology chronology44 = partial34.getChronology();
        org.joda.time.Partial partial45 = new org.joda.time.Partial();
        boolean boolean46 = partial34.isBefore((org.joda.time.ReadablePartial) partial45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = partial34.getFieldTypes();
        java.lang.Object obj48 = null;
        boolean boolean49 = partial34.equals(obj48);
        boolean boolean50 = partial29.isBefore((org.joda.time.ReadablePartial) partial34);
        long long52 = zonedChronology13.set((org.joda.time.ReadablePartial) partial34, 0L);
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone54 = iSOChronology53.getZone();
        org.joda.time.DateTimeZone dateTimeZone55 = iSOChronology53.getZone();
        java.lang.String str57 = dateTimeZone55.getShortName((-210861660779418L));
        boolean boolean58 = partial34.equals((java.lang.Object) dateTimeZone55);
        long long60 = chronology2.set((org.joda.time.ReadablePartial) partial34, 3252915463L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfMonth" + "'", str8, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "723" + "'", str33, "723");
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00" + "'", str57, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 3252915463L + "'", long60 == 3252915463L);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test650");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.minutes();
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology0.getDateTimeMillis(274, (-114), 0, 0, (int) (short) -1, (int) (short) 0, 471);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test651");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.Partial partial3 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField4 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long7 = durationField4.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long9 = durationField4.getValueAsLong((long) 10);
        int int11 = durationField4.getValue((long) (byte) 10);
        boolean boolean12 = partial3.equals((java.lang.Object) durationField4);
        org.joda.time.Chronology chronology13 = partial3.getChronology();
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        boolean boolean15 = partial3.isBefore((org.joda.time.ReadablePartial) partial14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = partial3.getFieldTypes();
        org.joda.time.Partial partial17 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField18 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long21 = durationField18.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long23 = durationField18.getValueAsLong((long) 10);
        int int25 = durationField18.getValue((long) (byte) 10);
        boolean boolean26 = partial17.equals((java.lang.Object) durationField18);
        org.joda.time.Chronology chronology27 = partial17.getChronology();
        org.joda.time.Partial partial28 = new org.joda.time.Partial();
        boolean boolean29 = partial17.isBefore((org.joda.time.ReadablePartial) partial28);
        int int30 = partial3.compareTo((org.joda.time.ReadablePartial) partial17);
        org.joda.time.Partial partial31 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField32 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long35 = durationField32.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long37 = durationField32.getValueAsLong((long) 10);
        int int39 = durationField32.getValue((long) (byte) 10);
        boolean boolean40 = partial31.equals((java.lang.Object) durationField32);
        int int41 = partial17.compareTo((org.joda.time.ReadablePartial) partial31);
        int[] intArray42 = partial31.getValues();
        int[] intArray44 = iSOChronology0.get((org.joda.time.ReadablePartial) partial31, 10L);
        org.joda.time.Chronology chronology45 = partial31.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test652");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gregorianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test653");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone1 = gregorianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = gregorianChronology0.eras();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test654");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-1", "723", 97, (int) (short) 1);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test655");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone1);
        org.joda.time.Partial partial4 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.Partial partial5 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField6 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long9 = durationField6.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long11 = durationField6.getValueAsLong((long) 10);
        int int13 = durationField6.getValue((long) (byte) 10);
        boolean boolean14 = partial5.equals((java.lang.Object) durationField6);
        boolean boolean15 = partial4.isBefore((org.joda.time.ReadablePartial) partial5);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str18 = dateTimeZone17.toString();
        org.joda.time.Chronology chronology19 = iSOChronology16.withZone(dateTimeZone17);
        org.joda.time.Partial partial20 = new org.joda.time.Partial((org.joda.time.Chronology) iSOChronology16);
        boolean boolean21 = partial4.isBefore((org.joda.time.ReadablePartial) partial20);
        java.lang.String str22 = partial20.toString();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.ReadableInterval readableInterval25 = null;
        boolean boolean26 = readableInterval24.contains(readableInterval25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = readableInterval24.toPeriod(periodType27);
        org.joda.time.DateTime dateTime29 = readableInterval24.getEnd();
        org.joda.time.MutableInterval mutableInterval30 = readableInterval24.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.ReadableInterval readableInterval33 = null;
        boolean boolean34 = readableInterval32.contains(readableInterval33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = readableInterval32.toPeriod(periodType35);
        org.joda.time.DateTime dateTime37 = readableInterval32.getEnd();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.ReadableInterval readableInterval40 = null;
        boolean boolean41 = readableInterval39.contains(readableInterval40);
        boolean boolean42 = readableInterval32.overlaps(readableInterval39);
        boolean boolean43 = readableInterval24.contains(readableInterval39);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.DateTimeUtils.getPeriodType(periodType44);
        org.joda.time.PeriodType periodType46 = org.joda.time.DateTimeUtils.getPeriodType(periodType45);
        org.joda.time.Period period47 = readableInterval24.toPeriod(periodType46);
        org.joda.time.Partial partial48 = partial20.minus((org.joda.time.ReadablePeriod) period47);
        java.lang.String str49 = partial48.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableInterval30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(readableInterval39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(partial48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test656");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test657");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.hourOfDay();
        java.lang.String str10 = zonedChronology6.toString();
        org.joda.time.DateTimeField dateTimeField11 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = zonedChronology6.getZone();
        org.joda.time.DurationField durationField13 = zonedChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = zonedChronology6.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZonedChronology[ISOChronology[UTC], UTC]" + "'", str10, "ZonedChronology[ISOChronology[UTC], UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test658");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getDurationField();
        java.lang.String str12 = unsupportedDateTimeField6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = unsupportedDateTimeField6.getType();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException16 = new org.joda.time.IllegalFieldValueException(durationFieldType14, "100");
        org.joda.time.DurationFieldType durationFieldType17 = illegalFieldValueException16.getDurationFieldType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField18 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = unsupportedDurationField18.getValue(442L, 9003756648096000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: days field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnsupportedDateTimeField" + "'", str12, "UnsupportedDateTimeField");
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(unsupportedDurationField18);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test659");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        int[] intArray1 = partial0.getValues();
        int int2 = partial0.size();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.ReadableInterval readableInterval5 = null;
        boolean boolean6 = readableInterval4.contains(readableInterval5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = readableInterval4.toPeriod(periodType7);
        org.joda.time.Partial partial10 = partial0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, (int) (short) 100);
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.millis();
        org.joda.time.DurationField durationField16 = chronology13.centuries();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DurationField durationField21 = chronology19.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval23);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.ReadableInterval readableInterval30 = null;
        boolean boolean31 = readableInterval29.contains(readableInterval30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = readableInterval29.toPeriod(periodType32);
        int[] intArray35 = chronology25.get((org.joda.time.ReadablePeriod) period33, (-210866846400000L));
        int[] intArray38 = chronology19.get((org.joda.time.ReadablePeriod) period33, 2173795348453L, (long) 1439);
        int[] intArray41 = chronology13.get((org.joda.time.ReadablePeriod) period33, 291L, 2580171L);
        org.joda.time.Partial partial43 = partial10.withPeriodAdded((org.joda.time.ReadablePeriod) period33, 0);
        org.joda.time.ReadablePartial readablePartial44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = partial43.compareTo(readablePartial44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(partial10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(readableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 42, 59, 880]");
        org.junit.Assert.assertNotNull(partial43);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test660");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField3 = iSOChronology2.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology2, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = zonedChronology6.getZone();
        boolean boolean8 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) zonedChronology6);
        org.joda.time.DateTimeField dateTimeField9 = zonedChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = zonedChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = zonedChronology6.getZone();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfMonth" + "'", str1, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test661");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField5 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType4);
        long long6 = unsupportedDurationField5.getUnitMillis();
        boolean boolean7 = unsupportedDurationField5.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unsupportedDurationField5.getValue(24595579244400L, 80891030799112975L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(unsupportedDurationField5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test662");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone2.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology4 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = zonedChronology4.getZone();
        org.joda.time.DurationField durationField6 = zonedChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = zonedChronology4.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test663");
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
        int int19 = scaledDurationField17.getValue((long) (short) -1);
        long long22 = scaledDurationField17.add((long) (-1), 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str24 = dateTimeFieldType23.getName();
        boolean boolean25 = scaledDurationField17.equals((java.lang.Object) str24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField29 = iSOChronology28.minutes();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str31 = dateTimeZone30.toString();
        org.joda.time.chrono.ZonedChronology zonedChronology32 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology28, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone33 = zonedChronology32.getZone();
        org.joda.time.DurationField durationField34 = zonedChronology32.centuries();
        org.joda.time.DateTimeField dateTimeField35 = zonedChronology32.dayOfMonth();
        boolean boolean36 = dateTimeFieldType26.isSupported((org.joda.time.Chronology) zonedChronology32);
        org.joda.time.Partial partial38 = new org.joda.time.Partial(dateTimeFieldType26, 10);
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.ReadableInterval readableInterval46 = null;
        boolean boolean47 = readableInterval45.contains(readableInterval46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = readableInterval45.toPeriod(periodType48);
        int[] intArray51 = chronology41.get((org.joda.time.ReadablePeriod) period49, (-210866846400000L));
        java.lang.String str52 = chronology41.toString();
        java.lang.String str53 = chronology41.toString();
        java.lang.String str54 = chronology41.toString();
        org.joda.time.DurationField durationField55 = chronology41.years();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType26.getField(chronology41);
        boolean boolean57 = scaledDurationField17.equals((java.lang.Object) dateTimeField56);
        long long60 = scaledDurationField17.getMillis(28531765, 1711938393597L);
        long long61 = scaledDurationField17.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 969L + "'", long22 == 969L);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hourOfDay" + "'", str24, "hourOfDay");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(zonedChronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(intArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, -348655, -3, -12, 0, 0, 0]");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ISOChronology[100]" + "'", str52, "ISOChronology[100]");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ISOChronology[100]" + "'", str53, "ISOChronology[100]");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[100]" + "'", str54, "ISOChronology[100]");
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 2767581205L + "'", long60 == 2767581205L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 97L + "'", long61 == 97L);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test664");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = readableInterval1.toPeriod(periodType4);
        org.joda.time.DateTime dateTime6 = readableInterval1.getEnd();
        org.joda.time.MutableInterval mutableInterval7 = readableInterval1.toMutableInterval();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = readableInterval9.contains(readableInterval10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = readableInterval9.toPeriod(periodType12);
        org.joda.time.DateTime dateTime14 = readableInterval9.getEnd();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.ReadableInterval readableInterval17 = null;
        boolean boolean18 = readableInterval16.contains(readableInterval17);
        boolean boolean19 = readableInterval9.overlaps(readableInterval16);
        boolean boolean20 = readableInterval1.contains(readableInterval16);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DurationField durationField22 = chronology21.minutes();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test665");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeUtils.getZone(dateTimeZone3);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone8 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone8);
        int int11 = cachedDateTimeZone8.getStandardOffset(1711909540326L);
        org.joda.time.Partial partial12 = new org.joda.time.Partial();
        org.joda.time.DurationField durationField13 = org.joda.time.field.MillisDurationField.INSTANCE;
        long long16 = durationField13.getValueAsLong((long) (short) 1, (long) (short) 100);
        long long18 = durationField13.getValueAsLong((long) 10);
        int int20 = durationField13.getValue((long) (byte) 10);
        boolean boolean21 = partial12.equals((java.lang.Object) durationField13);
        boolean boolean22 = cachedDateTimeZone8.equals((java.lang.Object) durationField13);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(cachedDateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest1.test666");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }
}
