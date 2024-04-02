package org.mockito.internal.util;

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
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.lang.reflect.Field[] fieldArray1 = new java.lang.reflect.Field[] {};
        java.util.LinkedHashSet<java.lang.reflect.Field> fieldSet2 = new java.util.LinkedHashSet<java.lang.reflect.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Field>) fieldSet2, fieldArray1);
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine5 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine7 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException9 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber10 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException9);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer12 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode23 = null;
        org.mockito.verification.Timeout timeout24 = new org.mockito.verification.Timeout(0L, verificationMode23);
        org.mockito.verification.VerificationMode verificationMode25 = timeout24.only();
        org.mockito.stubbing.Stubber stubber27 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls34 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer36 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable37 = null;
        java.util.Set<java.lang.Object> objSet38 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable37);
        org.mockito.internal.util.Checks checks46 = new org.mockito.internal.util.Checks();
        java.util.Collection collection47 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer48 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine49 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks50 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException56 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine57 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber62 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks63 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException69 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor70 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException72 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine5, (byte) 1, injectingAnnotationEngine7, stubber10, 0, objAnswer12, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode25, stubber27, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer36, objSet38, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks46, collection47, objAnswer48, injectingAnnotationEngine49, checks50, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine57, 0, true, (byte) 100, (byte) -1, stubber62, checks63, 0, 1.0d, 10L, "", friendlyReminderException69, mockAnnotationProcessor70, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet74 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet74, objArray73);
        java.util.Spliterator<java.lang.Object> objSpliterator76 = objSet74.spliterator();
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) fieldSet2, (java.util.Set<java.lang.Object>) objSet74, (java.lang.Object) (byte) 100);
        java.util.Set<java.lang.Object> objSet79 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet((java.lang.Iterable<java.lang.Object>) objSet74);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldSet2 and objSet38.", fieldSet2.equals(objSet38) == objSet38.equals(fieldSet2));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.lang.reflect.Field[] fieldArray1 = new java.lang.reflect.Field[] {};
        java.util.LinkedHashSet<java.lang.reflect.Field> fieldSet2 = new java.util.LinkedHashSet<java.lang.reflect.Field>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Field>) fieldSet2, fieldArray1);
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine5 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine7 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException9 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber10 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException9);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer12 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode23 = null;
        org.mockito.verification.Timeout timeout24 = new org.mockito.verification.Timeout(0L, verificationMode23);
        org.mockito.verification.VerificationMode verificationMode25 = timeout24.only();
        org.mockito.stubbing.Stubber stubber27 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls34 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer36 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable37 = null;
        java.util.Set<java.lang.Object> objSet38 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable37);
        org.mockito.internal.util.Checks checks46 = new org.mockito.internal.util.Checks();
        java.util.Collection collection47 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer48 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine49 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks50 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException56 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine57 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber62 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks63 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException69 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor70 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException72 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray73 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine5, (byte) 1, injectingAnnotationEngine7, stubber10, 0, objAnswer12, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode25, stubber27, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer36, objSet38, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks46, collection47, objAnswer48, injectingAnnotationEngine49, checks50, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine57, 0, true, (byte) 100, (byte) -1, stubber62, checks63, 0, 1.0d, 10L, "", friendlyReminderException69, mockAnnotationProcessor70, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet74 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet74, objArray73);
        java.util.Spliterator<java.lang.Object> objSpliterator76 = objSet74.spliterator();
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) fieldSet2, (java.util.Set<java.lang.Object>) objSet74, (java.lang.Object) (byte) 100);
        java.util.Spliterator<java.lang.Object> objSpliterator79 = objSet74.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldSet2 and objSet38.", fieldSet2.equals(objSet38) == objSet38.equals(fieldSet2));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine1 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.util.Set set2 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine4 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine6 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException8 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber9 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException8);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer11 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode22 = null;
        org.mockito.verification.Timeout timeout23 = new org.mockito.verification.Timeout(0L, verificationMode22);
        org.mockito.verification.VerificationMode verificationMode24 = timeout23.only();
        org.mockito.stubbing.Stubber stubber26 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls33 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer35 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable36 = null;
        java.util.Set<java.lang.Object> objSet37 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable36);
        org.mockito.internal.util.Checks checks45 = new org.mockito.internal.util.Checks();
        java.util.Collection collection46 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer47 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine48 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks49 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException55 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine56 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber61 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks62 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException68 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor69 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException71 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray72 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine4, (byte) 1, injectingAnnotationEngine6, stubber9, 0, objAnswer11, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode24, stubber26, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer35, objSet37, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks45, collection46, objAnswer47, injectingAnnotationEngine48, checks49, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine56, 0, true, (byte) 100, (byte) -1, stubber61, checks62, 0, 1.0d, 10L, "", friendlyReminderException68, mockAnnotationProcessor69, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet73 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet73, objArray72);
        java.util.Spliterator<java.lang.Object> objSpliterator75 = objSet73.spliterator();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException77 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        defaultInjectionEngine1.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) set2, (java.util.Set<java.lang.Object>) objSet73, (java.lang.Object) friendlyReminderException77);
        java.lang.reflect.Field field79 = null;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine80 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.NotAMockException notAMockException82 = new org.mockito.exceptions.misusing.NotAMockException("");
        injectingAnnotationEngine80.injectMocks((java.lang.Object) notAMockException82);
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter84 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet73, field79, (java.lang.Object) notAMockException82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set2 and objSet37.", set2.equals(objSet37) == objSet37.equals(set2));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) ' ');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean2 = timer1.isCounting();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.verification.VerificationMode verificationMode3 = null;
        org.mockito.verification.Timeout timeout4 = new org.mockito.verification.Timeout(0L, verificationMode3);
        org.mockito.verification.VerificationMode verificationMode5 = timeout4.only();
        org.mockito.internal.util.Timer timer8 = new org.mockito.internal.util.Timer((long) ' ');
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl9 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '\000', 0L, (org.mockito.verification.VerificationMode) timeout4, true, timer8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean10 = timer8.isCounting();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.util.Set set1 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine3 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine5 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException7 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber8 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException7);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer10 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode21 = null;
        org.mockito.verification.Timeout timeout22 = new org.mockito.verification.Timeout(0L, verificationMode21);
        org.mockito.verification.VerificationMode verificationMode23 = timeout22.only();
        org.mockito.stubbing.Stubber stubber25 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls32 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer34 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable35 = null;
        java.util.Set<java.lang.Object> objSet36 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable35);
        org.mockito.internal.util.Checks checks44 = new org.mockito.internal.util.Checks();
        java.util.Collection collection45 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer46 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine47 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks48 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException54 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine55 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber60 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks61 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException67 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor68 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException70 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine3, (byte) 1, injectingAnnotationEngine5, stubber8, 0, objAnswer10, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode23, stubber25, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer34, objSet36, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks44, collection45, objAnswer46, injectingAnnotationEngine47, checks48, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine55, 0, true, (byte) 100, (byte) -1, stubber60, checks61, 0, 1.0d, 10L, "", friendlyReminderException67, mockAnnotationProcessor68, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet72 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet72, objArray71);
        java.util.Spliterator<java.lang.Object> objSpliterator74 = objSet72.spliterator();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException76 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) set1, (java.util.Set<java.lang.Object>) objSet72, (java.lang.Object) friendlyReminderException76);
        java.util.Spliterator<java.lang.Object> objSpliterator78 = objSet72.spliterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set1 and objSet36.", set1.equals(objSet36) == objSet36.equals(set1));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.util.Set set1 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine3 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine5 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException7 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber8 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException7);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer10 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode21 = null;
        org.mockito.verification.Timeout timeout22 = new org.mockito.verification.Timeout(0L, verificationMode21);
        org.mockito.verification.VerificationMode verificationMode23 = timeout22.only();
        org.mockito.stubbing.Stubber stubber25 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls32 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer34 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable35 = null;
        java.util.Set<java.lang.Object> objSet36 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable35);
        org.mockito.internal.util.Checks checks44 = new org.mockito.internal.util.Checks();
        java.util.Collection collection45 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer46 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine47 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks48 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException54 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine55 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber60 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks61 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException67 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor68 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException70 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine3, (byte) 1, injectingAnnotationEngine5, stubber8, 0, objAnswer10, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode23, stubber25, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer34, objSet36, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks44, collection45, objAnswer46, injectingAnnotationEngine47, checks48, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine55, 0, true, (byte) 100, (byte) -1, stubber60, checks61, 0, 1.0d, 10L, "", friendlyReminderException67, mockAnnotationProcessor68, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet72 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet72, objArray71);
        java.util.Spliterator<java.lang.Object> objSpliterator74 = objSet72.spliterator();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException76 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) set1, (java.util.Set<java.lang.Object>) objSet72, (java.lang.Object) friendlyReminderException76);
        java.util.HashSet<java.lang.Object> objSet79 = org.mockito.internal.util.Checks.checkItemsNotNull((java.util.HashSet<java.lang.Object>) objSet72, "org.mockito.exceptions.verification.TooManyActualInvocations: hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set1 and objSet36.", set1.equals(objSet36) == objSet36.equals(set1));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer((long) 2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean2 = timer1.isCounting();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs1 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.stubbing.Stubber stubber2 = mockitoCore0.doAnswer((org.mockito.stubbing.Answer) returnsDeepStubs1);
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.verification.Timeout timeout7 = new org.mockito.verification.Timeout(0L, verificationMode6);
        org.mockito.verification.VerificationMode verificationMode8 = timeout7.only();
        org.mockito.internal.util.Timer timer11 = new org.mockito.internal.util.Timer((long) ' ');
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '\000', 0L, (org.mockito.verification.VerificationMode) timeout7, true, timer11);
        long long13 = verificationOverTimeImpl12.getDuration();
        org.mockito.MockingDetails mockingDetails14 = mockitoCore0.mockingDetails((java.lang.Object) verificationOverTimeImpl12);
        mockitoCore0.validateMockitoUsage();
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine16 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.lang.reflect.Field[] fieldArray17 = new java.lang.reflect.Field[] {};
        java.util.LinkedHashSet<java.lang.reflect.Field> fieldSet18 = new java.util.LinkedHashSet<java.lang.reflect.Field>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.reflect.Field>) fieldSet18, fieldArray17);
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine21 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine23 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException25 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber26 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException25);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer28 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode39 = null;
        org.mockito.verification.Timeout timeout40 = new org.mockito.verification.Timeout(0L, verificationMode39);
        org.mockito.verification.VerificationMode verificationMode41 = timeout40.only();
        org.mockito.stubbing.Stubber stubber43 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls50 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer52 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable53 = null;
        java.util.Set<java.lang.Object> objSet54 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable53);
        org.mockito.internal.util.Checks checks62 = new org.mockito.internal.util.Checks();
        java.util.Collection collection63 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer64 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine65 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks66 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException72 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine73 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber78 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks79 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException85 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor86 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException88 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray89 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine21, (byte) 1, injectingAnnotationEngine23, stubber26, 0, objAnswer28, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode41, stubber43, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer52, objSet54, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks62, collection63, objAnswer64, injectingAnnotationEngine65, checks66, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine73, 0, true, (byte) 100, (byte) -1, stubber78, checks79, 0, 1.0d, 10L, "", friendlyReminderException85, mockAnnotationProcessor86, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet90 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet90, objArray89);
        java.util.Spliterator<java.lang.Object> objSpliterator92 = objSet90.spliterator();
        defaultInjectionEngine16.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) fieldSet18, (java.util.Set<java.lang.Object>) objSet90, (java.lang.Object) (byte) 100);
        org.mockito.MockingDetails mockingDetails95 = mockitoCore0.mockingDetails((java.lang.Object) (byte) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on fieldSet18 and objSet54.", fieldSet18.equals(objSet54) == objSet54.equals(fieldSet18));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.util.Set set1 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine3 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine5 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.exceptions.misusing.MissingMethodInvocationException missingMethodInvocationException7 = new org.mockito.exceptions.misusing.MissingMethodInvocationException("hi!");
        org.mockito.stubbing.Stubber stubber8 = org.mockito.Mockito.doThrow((java.lang.Throwable) missingMethodInvocationException7);
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer10 = org.mockito.Mockito.RETURNS_DEFAULTS;
        org.mockito.verification.VerificationMode verificationMode21 = null;
        org.mockito.verification.Timeout timeout22 = new org.mockito.verification.Timeout(0L, verificationMode21);
        org.mockito.verification.VerificationMode verificationMode23 = timeout22.only();
        org.mockito.stubbing.Stubber stubber25 = org.mockito.Mockito.doReturn((java.lang.Object) 0L);
        org.mockito.internal.verification.Calls calls32 = org.mockito.internal.verification.VerificationModeFactory.calls((int) '4');
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer34 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        java.lang.Iterable<java.lang.Object> objIterable35 = null;
        java.util.Set<java.lang.Object> objSet36 = org.mockito.internal.util.collections.Sets.newMockSafeHashSet(objIterable35);
        org.mockito.internal.util.Checks checks44 = new org.mockito.internal.util.Checks();
        java.util.Collection collection45 = org.mockito.Matchers.anyCollection();
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer46 = org.mockito.Mockito.RETURNS_SMART_NULLS;
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine47 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.util.Checks checks48 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException54 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine55 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.stubbing.Stubber stubber60 = org.mockito.Mockito.doCallRealMethod();
        org.mockito.internal.util.Checks checks61 = new org.mockito.internal.util.Checks();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException67 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        org.mockito.internal.configuration.MockAnnotationProcessor mockAnnotationProcessor68 = new org.mockito.internal.configuration.MockAnnotationProcessor();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException70 = new org.mockito.exceptions.misusing.FriendlyReminderException("");
        java.lang.Object[] objArray71 = new java.lang.Object[] { (short) 100, injectingAnnotationEngine3, (byte) 1, injectingAnnotationEngine5, stubber8, 0, objAnswer10, 'a', 0L, 1L, false, 0, 'a', 10.0f, true, 0.0d, verificationMode23, stubber25, '\000', (byte) 100, 100.0f, 0.0f, 1.0f, '4', 1, objAnswer34, objSet36, (short) 0, 1.0f, 1.0f, 10.0d, (-1.0f), (-1L), 100.0f, checks44, collection45, objAnswer46, injectingAnnotationEngine47, checks48, (byte) -1, (byte) -1, ' ', 0L, "hi!", injectingAnnotationEngine55, 0, true, (byte) 100, (byte) -1, stubber60, checks61, 0, 1.0d, 10L, "", friendlyReminderException67, mockAnnotationProcessor68, "" };
        java.util.LinkedHashSet<java.lang.Object> objSet72 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet72, objArray71);
        java.util.Spliterator<java.lang.Object> objSpliterator74 = objSet72.spliterator();
        org.mockito.exceptions.misusing.FriendlyReminderException friendlyReminderException76 = new org.mockito.exceptions.misusing.FriendlyReminderException("hi!");
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) set1, (java.util.Set<java.lang.Object>) objSet72, (java.lang.Object) friendlyReminderException76);
        java.util.LinkedHashSet<java.lang.Object> objSet79 = org.mockito.internal.util.Checks.checkItemsNotNull(objSet72, "org.mockito.exceptions.verification.WantedButNotInvoked: org.mockito.exceptions.misusing.MockitoConfigurationException: hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set1 and objSet36.", set1.equals(objSet36) == objSet36.equals(set1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.internal.util.Timer timer1 = new org.mockito.internal.util.Timer(0L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean2 = timer1.isCounting();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter1);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet4 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 100.0f);
        org.mockito.verification.VerificationMode verificationMode10 = org.mockito.Mockito.atLeast((int) (short) 0);
        org.mockito.verification.Timeout timeout11 = new org.mockito.verification.Timeout(10L, verificationMode10);
        org.mockito.verification.VerificationMode verificationMode13 = timeout11.times((int) (byte) 1);
        org.mockito.verification.VerificationMode verificationMode14 = timeout11.only();
        boolean boolean15 = mockUtil5.isMock((java.lang.Object) verificationMode14);
        java.util.Collection collection16 = org.mockito.Matchers.anyCollection();
        org.mockito.internal.util.collections.ListUtil.Filter<java.lang.Object> objFilter17 = null;
        java.util.LinkedList<java.lang.Object> objList18 = org.mockito.internal.util.collections.ListUtil.filter((java.util.Collection<java.lang.Object>) collection16, objFilter17);
        java.util.LinkedList<java.lang.Object> objList20 = org.mockito.internal.util.Checks.checkItemsNotNull(objList18, "");
        java.util.stream.Stream<java.lang.Object> objStream21 = objList18.parallelStream();
        boolean boolean22 = mockUtil5.isMock((java.lang.Object) objList18);
        boolean boolean23 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) mockUtil5);
        org.mockito.configuration.DefaultMockitoConfiguration defaultMockitoConfiguration24 = new org.mockito.configuration.DefaultMockitoConfiguration();
        boolean boolean25 = hashCodeAndEqualsSafeSet4.add((java.lang.Object) defaultMockitoConfiguration24);
        java.util.Iterator<java.lang.Object> objItor26 = hashCodeAndEqualsSafeSet4.iterator();
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl28 = new org.mockito.internal.progress.MockingProgressImpl();
        org.mockito.verification.VerificationMode verificationMode29 = mockingProgressImpl28.pullVerificationMode();
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing30 = null;
        mockingProgressImpl28.reportOngoingStubbing(iOngoingStubbing30);
        mockingProgressImpl28.validateState();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet4, field27, (java.lang.Object) mockingProgressImpl28);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet34 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.MockUtil mockUtil35 = new org.mockito.internal.util.MockUtil();
        boolean boolean37 = mockUtil35.isMock((java.lang.Object) 100.0f);
        org.mockito.verification.VerificationMode verificationMode40 = org.mockito.Mockito.atLeast((int) (short) 0);
        org.mockito.verification.Timeout timeout41 = new org.mockito.verification.Timeout(10L, verificationMode40);
        org.mockito.verification.VerificationMode verificationMode43 = timeout41.times((int) (byte) 1);
        org.mockito.verification.VerificationMode verificationMode44 = timeout41.only();
        boolean boolean45 = mockUtil35.isMock((java.lang.Object) verificationMode44);
        java.util.Collection collection46 = org.mockito.Matchers.anyCollection();
        org.mockito.internal.util.collections.ListUtil.Filter<java.lang.Object> objFilter47 = null;
        java.util.LinkedList<java.lang.Object> objList48 = org.mockito.internal.util.collections.ListUtil.filter((java.util.Collection<java.lang.Object>) collection46, objFilter47);
        java.util.LinkedList<java.lang.Object> objList50 = org.mockito.internal.util.Checks.checkItemsNotNull(objList48, "");
        java.util.stream.Stream<java.lang.Object> objStream51 = objList48.parallelStream();
        boolean boolean52 = mockUtil35.isMock((java.lang.Object) objList48);
        boolean boolean53 = hashCodeAndEqualsSafeSet34.contains((java.lang.Object) mockUtil35);
        java.util.Iterator<java.lang.Object> objItor54 = hashCodeAndEqualsSafeSet34.iterator();
        boolean boolean55 = hashCodeAndEqualsSafeSet4.addAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet34);
        boolean boolean56 = hashCodeAndEqualsSafeSet4.isEmpty();
        org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection ongoingMockInjection57 = org.mockito.internal.configuration.injection.MockInjection.onFields((java.util.Set<java.lang.reflect.Field>) set0, (java.lang.Object) boolean56);
        ongoingMockInjection57.apply();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set0 and hashCodeAndEqualsSafeSet34.", set0.equals(hashCodeAndEqualsSafeSet34) == hashCodeAndEqualsSafeSet34.equals(set0));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        java.util.Set set0 = org.mockito.Matchers.anySet();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter1);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet4 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.MockUtil mockUtil5 = new org.mockito.internal.util.MockUtil();
        boolean boolean7 = mockUtil5.isMock((java.lang.Object) 100.0f);
        org.mockito.verification.VerificationMode verificationMode10 = org.mockito.Mockito.atLeast((int) (short) 0);
        org.mockito.verification.Timeout timeout11 = new org.mockito.verification.Timeout(10L, verificationMode10);
        org.mockito.verification.VerificationMode verificationMode13 = timeout11.times((int) (byte) 1);
        org.mockito.verification.VerificationMode verificationMode14 = timeout11.only();
        boolean boolean15 = mockUtil5.isMock((java.lang.Object) verificationMode14);
        java.util.Collection collection16 = org.mockito.Matchers.anyCollection();
        org.mockito.internal.util.collections.ListUtil.Filter<java.lang.Object> objFilter17 = null;
        java.util.LinkedList<java.lang.Object> objList18 = org.mockito.internal.util.collections.ListUtil.filter((java.util.Collection<java.lang.Object>) collection16, objFilter17);
        java.util.LinkedList<java.lang.Object> objList20 = org.mockito.internal.util.Checks.checkItemsNotNull(objList18, "");
        java.util.stream.Stream<java.lang.Object> objStream21 = objList18.parallelStream();
        boolean boolean22 = mockUtil5.isMock((java.lang.Object) objList18);
        boolean boolean23 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) mockUtil5);
        org.mockito.configuration.DefaultMockitoConfiguration defaultMockitoConfiguration24 = new org.mockito.configuration.DefaultMockitoConfiguration();
        boolean boolean25 = hashCodeAndEqualsSafeSet4.add((java.lang.Object) defaultMockitoConfiguration24);
        java.util.Iterator<java.lang.Object> objItor26 = hashCodeAndEqualsSafeSet4.iterator();
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl28 = new org.mockito.internal.progress.MockingProgressImpl();
        org.mockito.verification.VerificationMode verificationMode29 = mockingProgressImpl28.pullVerificationMode();
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing30 = null;
        mockingProgressImpl28.reportOngoingStubbing(iOngoingStubbing30);
        mockingProgressImpl28.validateState();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet4, field27, (java.lang.Object) mockingProgressImpl28);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet34 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.internal.util.MockUtil mockUtil35 = new org.mockito.internal.util.MockUtil();
        boolean boolean37 = mockUtil35.isMock((java.lang.Object) 100.0f);
        org.mockito.verification.VerificationMode verificationMode40 = org.mockito.Mockito.atLeast((int) (short) 0);
        org.mockito.verification.Timeout timeout41 = new org.mockito.verification.Timeout(10L, verificationMode40);
        org.mockito.verification.VerificationMode verificationMode43 = timeout41.times((int) (byte) 1);
        org.mockito.verification.VerificationMode verificationMode44 = timeout41.only();
        boolean boolean45 = mockUtil35.isMock((java.lang.Object) verificationMode44);
        java.util.Collection collection46 = org.mockito.Matchers.anyCollection();
        org.mockito.internal.util.collections.ListUtil.Filter<java.lang.Object> objFilter47 = null;
        java.util.LinkedList<java.lang.Object> objList48 = org.mockito.internal.util.collections.ListUtil.filter((java.util.Collection<java.lang.Object>) collection46, objFilter47);
        java.util.LinkedList<java.lang.Object> objList50 = org.mockito.internal.util.Checks.checkItemsNotNull(objList48, "");
        java.util.stream.Stream<java.lang.Object> objStream51 = objList48.parallelStream();
        boolean boolean52 = mockUtil35.isMock((java.lang.Object) objList48);
        boolean boolean53 = hashCodeAndEqualsSafeSet34.contains((java.lang.Object) mockUtil35);
        java.util.Iterator<java.lang.Object> objItor54 = hashCodeAndEqualsSafeSet34.iterator();
        boolean boolean55 = hashCodeAndEqualsSafeSet4.addAll((java.util.Collection<java.lang.Object>) hashCodeAndEqualsSafeSet34);
        boolean boolean56 = hashCodeAndEqualsSafeSet4.isEmpty();
        org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection ongoingMockInjection57 = org.mockito.internal.configuration.injection.MockInjection.onFields((java.util.Set<java.lang.reflect.Field>) set0, (java.lang.Object) boolean56);
        org.mockito.internal.configuration.injection.MockInjection.OngoingMockInjection ongoingMockInjection58 = ongoingMockInjection57.tryPropertyOrFieldInjection();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set0 and hashCodeAndEqualsSafeSet34.", set0.equals(hashCodeAndEqualsSafeSet34) == hashCodeAndEqualsSafeSet34.equals(set0));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.internal.verification.Times times3 = org.mockito.internal.verification.VerificationModeFactory.times((int) ' ');
        org.mockito.internal.util.Timer timer6 = new org.mockito.internal.util.Timer((long) 2);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl7 = new org.mockito.internal.verification.VerificationOverTimeImpl(0L, 0L, (org.mockito.verification.VerificationMode) times3, true, timer6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean8 = timer6.isCounting();
    }
}

