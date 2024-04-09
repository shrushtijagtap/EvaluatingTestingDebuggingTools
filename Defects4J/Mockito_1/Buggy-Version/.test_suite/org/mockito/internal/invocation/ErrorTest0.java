package org.mockito.internal.invocation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet0 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        int int1 = hashCodeAndEqualsSafeSet0.size();
        java.util.Spliterator<java.lang.Object> objSpliterator2 = hashCodeAndEqualsSafeSet0.spliterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.exceptions.verification.VerificationInOrderFailure verificationInOrderFailure5 = new org.mockito.exceptions.verification.VerificationInOrderFailure("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        java.lang.Throwable[] throwableArray6 = verificationInOrderFailure5.getSuppressed();
        java.lang.String str7 = org.mockito.internal.util.StringJoiner.join((java.lang.Object[]) throwableArray6);
        java.util.List<org.hamcrest.Matcher> matcherList8 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) throwableArray6);
        boolean boolean9 = hashCodeAndEqualsSafeSet3.containsAll((java.util.Collection<org.hamcrest.Matcher>) matcherList8);
        org.mockito.Answers answers10 = org.mockito.Answers.RETURNS_MOCKS;
        boolean boolean11 = hashCodeAndEqualsSafeSet3.remove((java.lang.Object) answers10);
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs12 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs[] returnsDeepStubsArray13 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs[] { returnsDeepStubs12 };
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs[] returnsDeepStubsArray14 = hashCodeAndEqualsSafeSet3.toArray(returnsDeepStubsArray13);
        org.mockito.internal.matchers.MatchersPrinter matchersPrinter15 = new org.mockito.internal.matchers.MatchersPrinter();
        org.mockito.invocation.Invocation invocation16 = null;
        org.mockito.internal.matchers.StartsWith startsWith18 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.matchers.StartsWith startsWith20 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.hamcrest.Matcher[] matcherArray21 = new org.hamcrest.Matcher[] { startsWith18, startsWith20 };
        java.util.ArrayList<org.hamcrest.Matcher> matcherList22 = new java.util.ArrayList<org.hamcrest.Matcher>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.hamcrest.Matcher>) matcherList22, matcherArray21);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher24 = new org.mockito.internal.invocation.InvocationMatcher(invocation16, (java.util.List<org.hamcrest.Matcher>) matcherList22);
        java.util.ArrayList<org.hamcrest.Matcher> matcherList26 = org.mockito.internal.util.Checks.checkItemsNotNull(matcherList22, "");
        java.lang.Integer[] intArray33 = new java.lang.Integer[] { 10, 1, 2, 100, (-1), 0 };
        org.mockito.internal.reporting.PrintSettings printSettings34 = org.mockito.internal.reporting.PrintSettings.verboseMatchers(intArray33);
        printSettings34.setMultiline(true);
        java.lang.String str37 = matchersPrinter15.getArgumentsBlock((java.util.List<org.hamcrest.Matcher>) matcherList26, printSettings34);
        org.mockito.invocation.Invocation invocation38 = null;
        org.mockito.internal.matchers.StartsWith startsWith40 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.matchers.StartsWith startsWith42 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.hamcrest.Matcher[] matcherArray43 = new org.hamcrest.Matcher[] { startsWith40, startsWith42 };
        java.util.ArrayList<org.hamcrest.Matcher> matcherList44 = new java.util.ArrayList<org.hamcrest.Matcher>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.hamcrest.Matcher>) matcherList44, matcherArray43);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher46 = new org.mockito.internal.invocation.InvocationMatcher(invocation38, (java.util.List<org.hamcrest.Matcher>) matcherList44);
        java.util.ArrayList<org.hamcrest.Matcher> matcherList48 = org.mockito.internal.util.Checks.checkItemsNotNull(matcherList44, "");
        org.mockito.internal.matchers.MatchersPrinter matchersPrinter49 = new org.mockito.internal.matchers.MatchersPrinter();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber> bDDStubberMockSettingsImpl51 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber>();
        org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues returnsMoreEmptyValues52 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
        org.mockito.MockSettings mockSettings53 = bDDStubberMockSettingsImpl51.defaultAnswer((org.mockito.stubbing.Answer) returnsMoreEmptyValues52);
        java.util.List<org.mockito.listeners.InvocationListener> invocationListenerList54 = bDDStubberMockSettingsImpl51.getInvocationListeners();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber> bDDStubberMockSettingsImpl56 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber>();
        java.util.Set<java.lang.Class> classSet57 = bDDStubberMockSettingsImpl56.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet58 = null;
        org.mockito.internal.creation.settings.CreationSettings<org.mockito.BDDMockito.BDDStubber> bDDStubberCreationSettings59 = bDDStubberMockSettingsImpl56.setExtraInterfaces(classSet58);
        boolean boolean60 = bDDStubberMockSettingsImpl56.isStubOnly();
        org.mockito.internal.matchers.StartsWith startsWith62 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.verification.checkers.NumberOfInvocationsInOrderChecker numberOfInvocationsInOrderChecker63 = new org.mockito.internal.verification.checkers.NumberOfInvocationsInOrderChecker();
        org.mockito.internal.matchers.ArrayEquals arrayEquals64 = new org.mockito.internal.matchers.ArrayEquals((java.lang.Object) numberOfInvocationsInOrderChecker63);
        org.mockito.internal.matchers.LocalizedMatcher localizedMatcher65 = new org.mockito.internal.matchers.LocalizedMatcher((org.hamcrest.Matcher) arrayEquals64);
        org.mockito.internal.configuration.plugins.Plugins plugins66 = new org.mockito.internal.configuration.plugins.Plugins();
        boolean boolean67 = localizedMatcher65.matches((java.lang.Object) plugins66);
        java.lang.Object[] objArray68 = new java.lang.Object[] { false, bDDStubberMockSettingsImpl51, "", bDDStubberMockSettingsImpl56, startsWith62, boolean67 };
        java.util.List<org.hamcrest.Matcher> matcherList69 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers(objArray68);
        java.lang.Integer[] intArray76 = new java.lang.Integer[] { 10, 1, 2, 100, (-1), 0 };
        org.mockito.internal.reporting.PrintSettings printSettings77 = org.mockito.internal.reporting.PrintSettings.verboseMatchers(intArray76);
        java.lang.String str78 = matchersPrinter49.getArgumentsLine(matcherList69, printSettings77);
        boolean boolean80 = printSettings77.extraTypeInfoFor((int) (byte) -1);
        java.lang.String str81 = matchersPrinter15.getArgumentsBlock((java.util.List<org.hamcrest.Matcher>) matcherList48, printSettings77);
        boolean boolean82 = hashCodeAndEqualsSafeSet3.retainAll((java.util.Collection<org.hamcrest.Matcher>) matcherList48);
        boolean boolean83 = hashCodeAndEqualsSafeSet0.removeAll((java.util.Collection<org.hamcrest.Matcher>) matcherList48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet57 and hashCodeAndEqualsSafeSet3.", classSet57.equals(hashCodeAndEqualsSafeSet3) == hashCodeAndEqualsSafeSet3.equals(classSet57));
    }
}

