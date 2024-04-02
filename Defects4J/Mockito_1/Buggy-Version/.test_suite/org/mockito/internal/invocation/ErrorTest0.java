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

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.internal.invocation.ArgumentsComparator argumentsComparator0 = new org.mockito.internal.invocation.ArgumentsComparator();
        org.mockito.invocation.Invocation invocation1 = null;
        org.mockito.internal.matchers.StartsWith startsWith3 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.matchers.StartsWith startsWith5 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.hamcrest.Matcher[] matcherArray6 = new org.hamcrest.Matcher[] { startsWith3, startsWith5 };
        java.util.ArrayList<org.hamcrest.Matcher> matcherList7 = new java.util.ArrayList<org.hamcrest.Matcher>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.hamcrest.Matcher>) matcherList7, matcherArray6);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher9 = new org.mockito.internal.invocation.InvocationMatcher(invocation1, (java.util.List<org.hamcrest.Matcher>) matcherList7);
        org.mockito.invocation.Invocation invocation10 = invocationMatcher9.getInvocation();
        org.mockito.internal.util.MockUtil mockUtil11 = new org.mockito.internal.util.MockUtil();
        org.mockito.exceptions.misusing.UnfinishedVerificationException unfinishedVerificationException13 = new org.mockito.exceptions.misusing.UnfinishedVerificationException("hi!");
        org.mockito.BDDMockito.BDDStubber bDDStubber14 = org.mockito.BDDMockito.willReturn((java.lang.Object) unfinishedVerificationException13);
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues15 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.BDDMockito.BDDStubber bDDStubber16 = bDDStubber14.willAnswer((org.mockito.stubbing.Answer) returnsEmptyValues15);
        boolean boolean17 = mockUtil11.isSpy((java.lang.Object) returnsEmptyValues15);
        org.mockito.internal.stubbing.StubbedInvocationMatcher stubbedInvocationMatcher18 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(invocationMatcher9, (org.mockito.stubbing.Answer) returnsEmptyValues15);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet19 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        org.mockito.exceptions.verification.VerificationInOrderFailure verificationInOrderFailure21 = new org.mockito.exceptions.verification.VerificationInOrderFailure("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        java.lang.Throwable[] throwableArray22 = verificationInOrderFailure21.getSuppressed();
        java.lang.String str23 = org.mockito.internal.util.StringJoiner.join((java.lang.Object[]) throwableArray22);
        java.util.List<org.hamcrest.Matcher> matcherList24 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) throwableArray22);
        boolean boolean25 = hashCodeAndEqualsSafeSet19.containsAll((java.util.Collection<org.hamcrest.Matcher>) matcherList24);
        org.mockito.Answers answers26 = org.mockito.Answers.RETURNS_MOCKS;
        boolean boolean27 = hashCodeAndEqualsSafeSet19.remove((java.lang.Object) answers26);
        java.lang.Object[] objArray28 = hashCodeAndEqualsSafeSet19.toArray();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru29 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.internal.util.ObjectMethodsGuru[] objectMethodsGuruArray30 = new org.mockito.internal.util.ObjectMethodsGuru[] { objectMethodsGuru29 };
        org.mockito.internal.util.ObjectMethodsGuru[] objectMethodsGuruArray31 = hashCodeAndEqualsSafeSet19.toArray(objectMethodsGuruArray30);
        boolean boolean32 = argumentsComparator0.argumentsMatch(invocationMatcher9, (java.lang.Object[]) objectMethodsGuruArray31);
        org.mockito.invocation.Invocation invocation33 = null;
        org.mockito.internal.matchers.StartsWith startsWith35 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.matchers.StartsWith startsWith37 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.hamcrest.Matcher[] matcherArray38 = new org.hamcrest.Matcher[] { startsWith35, startsWith37 };
        java.util.ArrayList<org.hamcrest.Matcher> matcherList39 = new java.util.ArrayList<org.hamcrest.Matcher>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.hamcrest.Matcher>) matcherList39, matcherArray38);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher41 = new org.mockito.internal.invocation.InvocationMatcher(invocation33, (java.util.List<org.hamcrest.Matcher>) matcherList39);
        org.mockito.invocation.Invocation invocation42 = invocationMatcher41.getInvocation();
        org.mockito.internal.util.MockUtil mockUtil43 = new org.mockito.internal.util.MockUtil();
        org.mockito.exceptions.misusing.UnfinishedVerificationException unfinishedVerificationException45 = new org.mockito.exceptions.misusing.UnfinishedVerificationException("hi!");
        org.mockito.BDDMockito.BDDStubber bDDStubber46 = org.mockito.BDDMockito.willReturn((java.lang.Object) unfinishedVerificationException45);
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues47 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.BDDMockito.BDDStubber bDDStubber48 = bDDStubber46.willAnswer((org.mockito.stubbing.Answer) returnsEmptyValues47);
        boolean boolean49 = mockUtil43.isSpy((java.lang.Object) returnsEmptyValues47);
        org.mockito.internal.stubbing.StubbedInvocationMatcher stubbedInvocationMatcher50 = new org.mockito.internal.stubbing.StubbedInvocationMatcher(invocationMatcher41, (org.mockito.stubbing.Answer) returnsEmptyValues47);
        org.mockito.invocation.Invocation invocation51 = null;
        org.mockito.internal.matchers.MatchersPrinter matchersPrinter52 = new org.mockito.internal.matchers.MatchersPrinter();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber> bDDStubberMockSettingsImpl54 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber>();
        org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues returnsMoreEmptyValues55 = new org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues();
        org.mockito.MockSettings mockSettings56 = bDDStubberMockSettingsImpl54.defaultAnswer((org.mockito.stubbing.Answer) returnsMoreEmptyValues55);
        java.util.List<org.mockito.listeners.InvocationListener> invocationListenerList57 = bDDStubberMockSettingsImpl54.getInvocationListeners();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber> bDDStubberMockSettingsImpl59 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.BDDMockito.BDDStubber>();
        java.util.Set<java.lang.Class> classSet60 = bDDStubberMockSettingsImpl59.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet61 = null;
        org.mockito.internal.creation.settings.CreationSettings<org.mockito.BDDMockito.BDDStubber> bDDStubberCreationSettings62 = bDDStubberMockSettingsImpl59.setExtraInterfaces(classSet61);
        boolean boolean63 = bDDStubberMockSettingsImpl59.isStubOnly();
        org.mockito.internal.matchers.StartsWith startsWith65 = new org.mockito.internal.matchers.StartsWith("org.mockito.exceptions.misusing.UnfinishedVerificationException: hi!");
        org.mockito.internal.verification.checkers.NumberOfInvocationsInOrderChecker numberOfInvocationsInOrderChecker66 = new org.mockito.internal.verification.checkers.NumberOfInvocationsInOrderChecker();
        org.mockito.internal.matchers.ArrayEquals arrayEquals67 = new org.mockito.internal.matchers.ArrayEquals((java.lang.Object) numberOfInvocationsInOrderChecker66);
        org.mockito.internal.matchers.LocalizedMatcher localizedMatcher68 = new org.mockito.internal.matchers.LocalizedMatcher((org.hamcrest.Matcher) arrayEquals67);
        org.mockito.internal.configuration.plugins.Plugins plugins69 = new org.mockito.internal.configuration.plugins.Plugins();
        boolean boolean70 = localizedMatcher68.matches((java.lang.Object) plugins69);
        java.lang.Object[] objArray71 = new java.lang.Object[] { false, bDDStubberMockSettingsImpl54, "", bDDStubberMockSettingsImpl59, startsWith65, boolean70 };
        java.util.List<org.hamcrest.Matcher> matcherList72 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers(objArray71);
        java.lang.Integer[] intArray79 = new java.lang.Integer[] { 10, 1, 2, 100, (-1), 0 };
        org.mockito.internal.reporting.PrintSettings printSettings80 = org.mockito.internal.reporting.PrintSettings.verboseMatchers(intArray79);
        java.lang.String str81 = matchersPrinter52.getArgumentsLine(matcherList72, printSettings80);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher82 = new org.mockito.internal.invocation.InvocationMatcher(invocation51, matcherList72);
        stubbedInvocationMatcher50.markStubUsed((org.mockito.invocation.DescribedInvocation) invocationMatcher82);
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues84 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        stubbedInvocationMatcher50.addAnswer((org.mockito.stubbing.Answer) returnsEmptyValues84);
        org.mockito.internal.stubbing.answers.Returns returns87 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) 0);
        java.lang.String str88 = returns87.toString();
        stubbedInvocationMatcher50.addAnswer((org.mockito.stubbing.Answer) returns87);
        java.lang.CharSequence[] charSequenceArray93 = new java.lang.CharSequence[] { "Returns: 0", "org.mockito.exceptions.verification.ArgumentsAreDifferent: ", "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" };
        java.util.Set<java.lang.CharSequence> charSequenceSet94 = org.mockito.internal.util.collections.Sets.newSet(charSequenceArray93);
        boolean boolean95 = argumentsComparator0.argumentsMatch((org.mockito.internal.invocation.InvocationMatcher) stubbedInvocationMatcher50, (java.lang.Object[]) charSequenceArray93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet60 and hashCodeAndEqualsSafeSet19.", classSet60.equals(hashCodeAndEqualsSafeSet19) == hashCodeAndEqualsSafeSet19.equals(classSet60));
    }
}

