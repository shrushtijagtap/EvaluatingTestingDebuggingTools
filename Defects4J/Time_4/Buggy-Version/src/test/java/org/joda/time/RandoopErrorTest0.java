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
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTime.Property property4 = dateTime3.weekOfWeekyear();
        long long5 = dateTime3.getMillis();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        boolean boolean8 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime7);
        int int9 = dateTime3.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("DateTimeField[yearOfEra]");
        java.lang.String str2 = jodaTimePermission1.getName();
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField5 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField4);
        long long7 = delegatedDateTimeField5.roundHalfCeiling((-1L));
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField10 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Partial partial12 = new org.joda.time.Partial(chronology11);
        int[] intArray20 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray22 = delegatedDateTimeField10.add((org.joda.time.ReadablePartial) partial12, 0, intArray20, (int) (byte) -1);
        int int23 = partial12.size();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str25 = iSOChronology24.toString();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.Partial partial27 = new org.joda.time.Partial(chronology26);
        int[] intArray30 = new int[] { (byte) -1, 2000 };
        iSOChronology24.validate((org.joda.time.ReadablePartial) partial27, intArray30);
        int int32 = delegatedDateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) partial12, intArray30);
        java.lang.String str33 = partial12.toStringList();
        jodaTimePermission1.checkGuard((java.lang.Object) partial12);
        java.lang.String str35 = jodaTimePermission1.getActions();
        org.joda.time.JodaTimePermission jodaTimePermission37 = new org.joda.time.JodaTimePermission("DateTimeField[yearOfEra]");
        java.lang.String str38 = jodaTimePermission37.getName();
        org.joda.time.chrono.ISOChronology iSOChronology39 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology39.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField41 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField40);
        long long43 = delegatedDateTimeField41.roundHalfCeiling((-1L));
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField46 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Partial partial48 = new org.joda.time.Partial(chronology47);
        int[] intArray56 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray58 = delegatedDateTimeField46.add((org.joda.time.ReadablePartial) partial48, 0, intArray56, (int) (byte) -1);
        int int59 = partial48.size();
        org.joda.time.chrono.ISOChronology iSOChronology60 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str61 = iSOChronology60.toString();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Partial partial63 = new org.joda.time.Partial(chronology62);
        int[] intArray66 = new int[] { (byte) -1, 2000 };
        iSOChronology60.validate((org.joda.time.ReadablePartial) partial63, intArray66);
        int int68 = delegatedDateTimeField41.getMinimumValue((org.joda.time.ReadablePartial) partial48, intArray66);
        java.lang.String str69 = partial48.toStringList();
        jodaTimePermission37.checkGuard((java.lang.Object) partial48);
        java.lang.String str71 = jodaTimePermission37.getActions();
        boolean boolean72 = jodaTimePermission1.equals((java.lang.Object) str71);
        org.joda.time.chrono.CopticChronology copticChronology73 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        boolean boolean75 = copticChronology73.equals((java.lang.Object) 3023999999L);
        int int76 = copticChronology73.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField77 = copticChronology73.halfdays();
        org.joda.time.DurationFieldType durationFieldType78 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.DecoratedDurationField decoratedDurationField79 = new org.joda.time.field.DecoratedDurationField(durationField77, durationFieldType78);
        long long81 = decoratedDurationField79.getMillis(48);
        java.lang.String str82 = decoratedDurationField79.toString();
        boolean boolean83 = jodaTimePermission1.equals((java.lang.Object) str82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField77 and decoratedDurationField79", (durationField77.compareTo(decoratedDurationField79) == 0) == durationField77.equals(decoratedDurationField79));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
        org.joda.time.chrono.BuddhistChronology buddhistChronology0 = org.joda.time.chrono.BuddhistChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = buddhistChronology0.eras();
        org.joda.time.DateTimeField dateTimeField2 = buddhistChronology0.year();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long9 = dateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone6);
        long long13 = cachedDateTimeZone11.nextTransition((long) (byte) 20);
        java.lang.String str15 = cachedDateTimeZone11.getNameKey(9972000000L);
        long long17 = cachedDateTimeZone11.nextTransition((long) (byte) 20);
        java.lang.String str19 = cachedDateTimeZone11.getName(0L);
        org.joda.time.Chronology chronology20 = buddhistChronology0.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone11);
        java.lang.String str21 = buddhistChronology0.toString();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.era();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology22);
        int int25 = localDate24.getEra();
        org.joda.time.LocalTime localTime26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDate24.toDateTime(localTime26, dateTimeZone28);
        org.joda.time.LocalDate localDate32 = localDate24.minusMonths(60846);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.era();
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology33);
        int int36 = localDate35.getEra();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDate localDate38 = localDate35.plus(readablePeriod37);
        org.joda.time.LocalDate localDate40 = localDate38.plusWeeks((int) ' ');
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        long long47 = dateTimeZone42.getMillisKeepLocal(dateTimeZone44, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology48.centuryOfEra();
        org.joda.time.DurationField durationField50 = iSOChronology48.months();
        boolean boolean51 = localDate38.equals((java.lang.Object) iSOChronology48);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(10L);
        boolean boolean54 = localDate38.isAfter((org.joda.time.ReadablePartial) localDate53);
        int int55 = localDate24.compareTo((org.joda.time.ReadablePartial) localDate53);
        org.joda.time.LocalDate.Property property56 = localDate24.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        int int61 = dateTimeZone59.getOffsetFromLocal((long) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter57.withZone(dateTimeZone59);
        org.joda.time.LocalDate localDate63 = org.joda.time.LocalDate.now(dateTimeZone59);
        java.lang.String str64 = dateTimeZone59.getID();
        org.joda.time.DateTime dateTime65 = localDate24.toDateTimeAtCurrentTime(dateTimeZone59);
        org.joda.time.Chronology chronology66 = buddhistChronology0.withZone(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField50", Math.signum(durationField1.compareTo(durationField50)) == -Math.signum(durationField50.compareTo(durationField1)));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTime.Property property4 = dateTime3.weekOfWeekyear();
        int int5 = dateTime3.getHourOfDay();
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime.Property property7 = dateTime3.monthOfYear();
        int int8 = dateTime3.getMinuteOfDay();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.Instant instant11 = instant9.toInstant();
        boolean boolean12 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant9", (dateTime10.compareTo(instant9) == 0) == dateTime10.equals(instant9));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.SECONDS_TYPE;
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str3 = iSOChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.year();
        long long10 = iSOChronology2.getDateTimeMillis(0L, (int) (byte) 1, 0, 10, (int) 'a');
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.LocalDate localDate13 = localDate11.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDate localDate15 = localDate11.minusMonths(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean17 = localDate11.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localDate11.getChronology();
        org.joda.time.DurationField durationField19 = durationFieldType0.getField(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField1, durationField19, and unsupportedDurationField1", !(unsupportedDurationField1.compareTo(durationField19) == 0) || (Math.signum(unsupportedDurationField1.compareTo(unsupportedDurationField1)) == Math.signum(durationField19.compareTo(unsupportedDurationField1))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) 3023999999L);
        int int3 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.DecoratedDurationField decoratedDurationField6 = new org.joda.time.field.DecoratedDurationField(durationField4, durationFieldType5);
        org.joda.time.DurationField durationField7 = decoratedDurationField6.getWrappedField();
        long long10 = decoratedDurationField6.getMillis((-230400000L), (long) 60846);
        long long13 = decoratedDurationField6.getDifferenceAsLong((long) 2000, (long) 107);
        long long16 = decoratedDurationField6.getMillis(147, 3155760000000L);
        long long19 = decoratedDurationField6.add(1712407666594L, 48);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTime dateTime25 = dateTime23.minus((long) (byte) -1);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.LocalTime localTime27 = dateTime25.toLocalTime();
        org.joda.time.DateTime dateTime29 = dateTime25.withYearOfEra(4559);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(5);
        org.joda.time.DateTime.Property property32 = dateTime29.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime35 = dateTime29.withFieldAdded(durationFieldType33, 0);
        org.joda.time.field.PreciseDurationField preciseDurationField37 = new org.joda.time.field.PreciseDurationField(durationFieldType33, (-86L));
        org.joda.time.DurationFieldType durationFieldType38 = preciseDurationField37.getType();
        org.joda.time.field.ScaledDurationField scaledDurationField40 = new org.joda.time.field.ScaledDurationField((org.joda.time.DurationField) decoratedDurationField6, durationFieldType38, (int) (byte) 13);
        int int42 = scaledDurationField40.getValue((long) 1969);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and decoratedDurationField6", (durationField4.compareTo(decoratedDurationField6) == 0) == durationField4.equals(decoratedDurationField6));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
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
        org.joda.time.DateTime dateTime14 = dateTime9.plusSeconds(41);
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour((int) (byte) 0);
        boolean boolean17 = dateTime14.isEqualNow();
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.Chronology chronology19 = julianChronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.secondOfDay();
        java.lang.String str21 = dateTimeField20.getName();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str23 = iSOChronology22.toString();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology22.clockhourOfDay();
        org.joda.time.DurationField durationField25 = iSOChronology22.halfdays();
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField28 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.Partial partial30 = new org.joda.time.Partial(chronology29);
        int[] intArray38 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray40 = delegatedDateTimeField28.add((org.joda.time.ReadablePartial) partial30, 0, intArray38, (int) (byte) -1);
        java.lang.String str41 = delegatedDateTimeField28.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField46 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField28, dateTimeFieldType42, (int) (byte) 1, 10, (-28800000));
        org.joda.time.IllegalFieldValueException illegalFieldValueException48 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType42, "JulianChronology[UTC]");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField50 = new org.joda.time.field.RemainderDateTimeField(dateTimeField20, durationField25, dateTimeFieldType42, 2922750);
        long long53 = remainderDateTimeField50.add((long) (byte) 14, 0);
        java.util.Locale locale55 = null;
        java.lang.String str56 = remainderDateTimeField50.getAsShortText(0, locale55);
        int int58 = remainderDateTimeField50.get((long) 31);
        long long61 = remainderDateTimeField50.addWrapField((-62135571600000L), 16);
        long long64 = remainderDateTimeField50.addWrapField(52594920000L, 3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder65.appendLiteral('4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder67.appendMillisOfSecond((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder69.appendTwoDigitYear(2024, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType73.getDurationType();
        org.joda.time.DurationFieldType durationFieldType75 = dateTimeFieldType73.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder69.appendSignedDecimal(dateTimeFieldType73, (int) (byte) 10, (int) (byte) -1);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField79 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField50, dateTimeFieldType73);
        org.joda.time.chrono.ISOChronology iSOChronology80 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str81 = iSOChronology80.toString();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.Partial partial83 = new org.joda.time.Partial(chronology82);
        int[] intArray86 = new int[] { (byte) -1, 2000 };
        iSOChronology80.validate((org.joda.time.ReadablePartial) partial83, intArray86);
        org.joda.time.DateTimeZone dateTimeZone88 = iSOChronology80.getZone();
        org.joda.time.DurationField durationField89 = iSOChronology80.months();
        org.joda.time.DateTimeField dateTimeField90 = iSOChronology80.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField91 = iSOChronology80.hourOfDay();
        org.joda.time.DateTimeField dateTimeField92 = dateTimeFieldType73.getField((org.joda.time.Chronology) iSOChronology80);
        int int93 = dateTime14.get(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = julianChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.secondOfDay();
        java.lang.String str3 = dateTimeField2.getName();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str5 = iSOChronology4.toString();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology4.clockhourOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology4.halfdays();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField10 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Partial partial12 = new org.joda.time.Partial(chronology11);
        int[] intArray20 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray22 = delegatedDateTimeField10.add((org.joda.time.ReadablePartial) partial12, 0, intArray20, (int) (byte) -1);
        java.lang.String str23 = delegatedDateTimeField10.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) delegatedDateTimeField10, dateTimeFieldType24, (int) (byte) 1, 10, (-28800000));
        org.joda.time.IllegalFieldValueException illegalFieldValueException30 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType24, "JulianChronology[UTC]");
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField32 = new org.joda.time.field.RemainderDateTimeField(dateTimeField2, durationField7, dateTimeFieldType24, 2922750);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        boolean boolean35 = copticChronology33.equals((java.lang.Object) 3023999999L);
        int int36 = copticChronology33.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField37 = copticChronology33.halfdays();
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.DecoratedDurationField decoratedDurationField39 = new org.joda.time.field.DecoratedDurationField(durationField37, durationFieldType38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendLiteral('4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendMillisOfSecond((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder44.appendTwoDigitYear(2024, true);
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology48.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField50 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Partial partial52 = new org.joda.time.Partial(chronology51);
        int[] intArray60 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray62 = delegatedDateTimeField50.add((org.joda.time.ReadablePartial) partial52, 0, intArray60, (int) (byte) -1);
        int int64 = delegatedDateTimeField50.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField65 = delegatedDateTimeField50.getWrappedField();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField67 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField65, dateTimeFieldType66);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder47.appendShortText(dateTimeFieldType66);
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType66.getDurationType();
        java.lang.String str70 = dateTimeFieldType66.toString();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField71 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField32, durationField37, dateTimeFieldType66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and decoratedDurationField39", (durationField7.compareTo(decoratedDurationField39) == 0) == durationField7.equals(decoratedDurationField39));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        boolean boolean2 = copticChronology0.equals((java.lang.Object) 3023999999L);
        int int3 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField4 = copticChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.MILLIS_TYPE;
        org.joda.time.field.DecoratedDurationField decoratedDurationField6 = new org.joda.time.field.DecoratedDurationField(durationField4, durationFieldType5);
        org.joda.time.DurationField durationField7 = decoratedDurationField6.getWrappedField();
        long long10 = decoratedDurationField6.getMillis((-230400000L), (long) 60846);
        long long13 = decoratedDurationField6.getDifferenceAsLong((long) 2000, (long) 107);
        long long16 = decoratedDurationField6.getMillis(147, 3155760000000L);
        long long19 = decoratedDurationField6.add(1712407666594L, 48);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((-9223372036825975809L), (org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTime dateTime25 = dateTime23.minus((long) (byte) -1);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.LocalTime localTime27 = dateTime25.toLocalTime();
        org.joda.time.DateTime dateTime29 = dateTime25.withYearOfEra(4559);
        org.joda.time.DateTime dateTime31 = dateTime29.plusDays(5);
        org.joda.time.DateTime.Property property32 = dateTime29.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime35 = dateTime29.withFieldAdded(durationFieldType33, 0);
        org.joda.time.field.PreciseDurationField preciseDurationField37 = new org.joda.time.field.PreciseDurationField(durationFieldType33, (-86L));
        org.joda.time.DurationFieldType durationFieldType38 = preciseDurationField37.getType();
        org.joda.time.field.ScaledDurationField scaledDurationField40 = new org.joda.time.field.ScaledDurationField((org.joda.time.DurationField) decoratedDurationField6, durationFieldType38, (int) (byte) 13);
        long long42 = scaledDurationField40.getValueAsLong((long) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and decoratedDurationField6", (durationField4.compareTo(decoratedDurationField6) == 0) == durationField4.equals(decoratedDurationField6));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.millisOfSecond();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone5.getMillisKeepLocal(dateTimeZone7, (long) 0);
        java.lang.String str12 = dateTimeZone7.getName(100L);
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) iSOChronology0, dateTimeZone7);
        org.joda.time.DurationField durationField14 = zonedChronology13.eras();
        org.joda.time.DateTimeField dateTimeField15 = zonedChronology13.millisOfSecond();
        org.joda.time.DurationField durationField16 = zonedChronology13.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField16, and durationField14", !(durationField14.compareTo(durationField16) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField16.compareTo(durationField14))));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        java.lang.String str1 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField10 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.Partial partial12 = new org.joda.time.Partial(chronology11);
        int[] intArray20 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray22 = delegatedDateTimeField10.add((org.joda.time.ReadablePartial) partial12, 0, intArray20, (int) (byte) -1);
        java.lang.String str23 = delegatedDateTimeField10.getName();
        org.joda.time.DurationField durationField24 = delegatedDateTimeField10.getDurationField();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        long long31 = dateTimeZone26.getMillisKeepLocal(dateTimeZone28, (long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology32.centuryOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField36 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Partial partial38 = new org.joda.time.Partial(chronology37);
        int[] intArray46 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray48 = delegatedDateTimeField36.add((org.joda.time.ReadablePartial) partial38, 0, intArray46, (int) (byte) -1);
        java.lang.String str49 = partial38.toString();
        long long51 = iSOChronology32.set((org.joda.time.ReadablePartial) partial38, 1712361600000L);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.Partial partial53 = partial38.minus(readablePeriod52);
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology54.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField56 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Partial partial58 = new org.joda.time.Partial(chronology57);
        org.joda.time.chrono.ISOChronology iSOChronology59 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology59.era();
        org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField61 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.Partial partial63 = new org.joda.time.Partial(chronology62);
        int[] intArray71 = new int[] { 1, 1, 10, (byte) 0, ' ', (byte) 16 };
        int[] intArray73 = delegatedDateTimeField61.add((org.joda.time.ReadablePartial) partial63, 0, intArray71, (int) (byte) -1);
        int int74 = delegatedDateTimeField56.getMinimumValue((org.joda.time.ReadablePartial) partial58, intArray73);
        int int75 = delegatedDateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) partial38, intArray73);
        int int76 = delegatedDateTimeField10.getMaximumValue();
        long long78 = delegatedDateTimeField10.roundHalfFloor((long) 17283);
        boolean boolean79 = delegatedDateTimeField10.isLenient();
        boolean boolean80 = iSOChronology0.equals((java.lang.Object) delegatedDateTimeField10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField24", Math.signum(durationField5.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField5)));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        boolean boolean2 = instant0.isBefore((long) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant0.minus(readableDuration3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant4.minus(readableDuration5);
        org.joda.time.DateTime dateTime7 = instant4.toDateTimeISO();
        org.joda.time.Instant instant8 = instant4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime7", (instant8.compareTo(dateTime7) == 0) == instant8.equals(dateTime7));
    }
}

