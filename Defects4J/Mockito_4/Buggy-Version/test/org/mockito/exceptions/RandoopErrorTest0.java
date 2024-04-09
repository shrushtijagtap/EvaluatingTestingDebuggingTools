package org.mockito.exceptions;

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
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 10, 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test02");
        org.mockito.internal.MockitoCore mockitoCore0 = new org.mockito.internal.MockitoCore();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.invocation.Invocation invocation1 = mockitoCore0.getLastInvocation();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test03");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test04");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.lang.String str15 = invocationContainerImpl14.toString();
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher16 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher16);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test05");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) 'a');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test06");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.lang.String str15 = invocationContainerImpl14.toString();
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher16 = null;
        org.mockito.internal.verification.VerificationDataImpl verificationDataImpl17 = new org.mockito.internal.verification.VerificationDataImpl((org.mockito.internal.stubbing.InvocationContainer) invocationContainerImpl14, invocationMatcher16);
        org.mockito.invocation.Invocation invocation18 = null;
        org.mockito.mock.SerializableMode serializableMode19 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray20 = new org.mockito.mock.SerializableMode[] { serializableMode19 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet21 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray20);
        java.util.List<org.hamcrest.Matcher> matcherList22 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray20);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher23 = new org.mockito.internal.invocation.InvocationMatcher(invocation18, matcherList22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher23);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test07");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.lang.String str15 = invocationContainerImpl14.toString();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress16 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener17 = null;
        threadSafeMockingProgress16.setListener(mockingProgressListener17);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet19 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor20 = hashCodeAndEqualsSafeSet19.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet22 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet19, "");
        boolean boolean24 = hashCodeAndEqualsSafeSet19.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl25 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean26 = hashCodeAndEqualsSafeSet19.contains((java.lang.Object) genericDeclarationMockSettingsImpl25);
        org.mockito.MockSettings mockSettings28 = genericDeclarationMockSettingsImpl25.name("hi!");
        java.lang.String str29 = genericDeclarationMockSettingsImpl25.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl30 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress16, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl25);
        java.util.List<org.mockito.invocation.Invocation> invocationList31 = invocationContainerImpl30.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList32 = invocationContainerImpl30.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl33 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl30);
        org.mockito.invocation.Invocation invocation34 = null;
        org.mockito.mock.SerializableMode serializableMode35 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray36 = new org.mockito.mock.SerializableMode[] { serializableMode35 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet37 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray36);
        java.util.List<org.hamcrest.Matcher> matcherList38 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray36);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher39 = new org.mockito.internal.invocation.InvocationMatcher(invocation34, matcherList38);
        invocationContainerImpl30.resetInvocationForPotentialStubbing(invocationMatcher39);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher39);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test08");
        org.mockito.internal.util.MockUtil mockUtil0 = new org.mockito.internal.util.MockUtil();
        boolean boolean2 = mockUtil0.isSpy((java.lang.Object) "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        java.util.List list3 = org.mockito.Matchers.anyList();
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList4 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.invocation.Invocation>) list3);
        boolean boolean5 = mockUtil0.isSpy((java.lang.Object) invocationMatcherList4);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl6 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings7 = genericDeclarationMockSettingsImpl6.verboseLogging();
        org.mockito.MockSettings mockSettings8 = genericDeclarationMockSettingsImpl6.stubOnly();
        java.lang.Object obj9 = genericDeclarationMockSettingsImpl6.getSpiedInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.GenericDeclaration genericDeclaration10 = mockUtil0.createMock((org.mockito.mock.MockCreationSettings<java.lang.reflect.GenericDeclaration>) genericDeclarationMockSettingsImpl6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test09");
        org.mockito.internal.creation.cglib.CglibMockMaker cglibMockMaker0 = new org.mockito.internal.creation.cglib.CglibMockMaker();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout2 = org.mockito.Mockito.timeout((long) ' ');
        org.mockito.verification.VerificationMode verificationMode3 = verificationWithTimeout2.atLeastOnce();
        org.mockito.invocation.MockHandler mockHandler4 = cglibMockMaker0.getHandler((java.lang.Object) verificationWithTimeout2);
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl5 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl5.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode7 = mockingProgressImpl5.pullVerificationMode();
        java.lang.String str8 = mockingProgressImpl5.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings10 = genericDeclarationMockSettingsImpl9.verboseLogging();
        java.util.Set<java.lang.Class> classSet11 = genericDeclarationMockSettingsImpl9.getExtraInterfaces();
        java.lang.Object obj12 = genericDeclarationMockSettingsImpl9.getSpiedInstance();
        boolean boolean13 = genericDeclarationMockSettingsImpl9.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl5, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        org.mockito.internal.handler.MockHandlerFactory mockHandlerFactory15 = new org.mockito.internal.handler.MockHandlerFactory();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl16 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings17 = genericDeclarationMockSettingsImpl16.verboseLogging();
        java.util.Set<java.lang.Class> classSet18 = genericDeclarationMockSettingsImpl16.getExtraInterfaces();
        java.lang.Object obj19 = genericDeclarationMockSettingsImpl16.getSpiedInstance();
        org.mockito.internal.InternalMockHandler internalMockHandler20 = mockHandlerFactory15.create((org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.reflect.GenericDeclaration genericDeclaration21 = cglibMockMaker0.createMock((org.mockito.mock.MockCreationSettings<java.lang.reflect.GenericDeclaration>) genericDeclarationMockSettingsImpl9, (org.mockito.invocation.MockHandler) internalMockHandler20);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test10");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.debugging.LocationImpl locationImpl3 = new org.mockito.internal.debugging.LocationImpl();
        // during test generation this statement threw an exception of type org.mockito.exceptions.verification.junit.ArgumentsAreDifferent in error
        reporter0.argumentsAreDifferent("iOngoingStubbing: null, verificationMode: null, stubbingInProgress: -> at sun.reflect.GeneratedMethodAccessor38.invoke(Unknown Source)", "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: -> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)", (org.mockito.invocation.Location) locationImpl3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test11");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test12");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test13");
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl0 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl0.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode2 = mockingProgressImpl0.pullVerificationMode();
        java.lang.String str3 = mockingProgressImpl0.toString();
        org.mockito.internal.progress.ArgumentMatcherStorage argumentMatcherStorage4 = mockingProgressImpl0.getArgumentMatcherStorage();
        java.lang.String str5 = mockingProgressImpl0.toString();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor7 = hashCodeAndEqualsSafeSet6.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet9 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet6, "");
        boolean boolean11 = hashCodeAndEqualsSafeSet6.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl12 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean13 = hashCodeAndEqualsSafeSet6.contains((java.lang.Object) genericDeclarationMockSettingsImpl12);
        java.util.List<org.mockito.listeners.InvocationListener> invocationListenerList14 = genericDeclarationMockSettingsImpl12.getInvocationListeners();
        org.mockito.MockSettings mockSettings15 = genericDeclarationMockSettingsImpl12.useConstructor();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl16 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = invocationContainerImpl16.invokedMock();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test14");
        org.mockito.internal.invocation.InvocationsFinder invocationsFinder0 = new org.mockito.internal.invocation.InvocationsFinder();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress1 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener2 = null;
        threadSafeMockingProgress1.setListener(mockingProgressListener2);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet4 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor5 = hashCodeAndEqualsSafeSet4.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet7 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet4, "");
        boolean boolean9 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl10 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean11 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) genericDeclarationMockSettingsImpl10);
        org.mockito.MockSettings mockSettings13 = genericDeclarationMockSettingsImpl10.name("hi!");
        java.lang.String str14 = genericDeclarationMockSettingsImpl10.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl15 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress1, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl10);
        java.util.List<org.mockito.invocation.Invocation> invocationList16 = invocationContainerImpl15.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList17 = invocationContainerImpl15.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl18 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl15);
        java.util.List<org.mockito.invocation.Invocation> invocationList19 = verificationModeFactoryOngoingStubbingImpl18.getRegisteredInvocations();
        org.mockito.internal.verification.api.InOrderContext inOrderContext20 = null;
        org.mockito.invocation.Invocation invocation21 = invocationsFinder0.findPreviousVerifiedInOrder(invocationList19, inOrderContext20);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress22 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener23 = null;
        threadSafeMockingProgress22.setListener(mockingProgressListener23);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet25 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor26 = hashCodeAndEqualsSafeSet25.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet28 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet25, "");
        boolean boolean30 = hashCodeAndEqualsSafeSet25.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl31 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean32 = hashCodeAndEqualsSafeSet25.contains((java.lang.Object) genericDeclarationMockSettingsImpl31);
        org.mockito.MockSettings mockSettings34 = genericDeclarationMockSettingsImpl31.name("hi!");
        java.lang.String str35 = genericDeclarationMockSettingsImpl31.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress22, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl31);
        java.util.List<org.mockito.invocation.Invocation> invocationList37 = invocationContainerImpl36.getInvocations();
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl38 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl38.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode40 = mockingProgressImpl38.pullVerificationMode();
        java.lang.String str41 = mockingProgressImpl38.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl42 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings43 = genericDeclarationMockSettingsImpl42.verboseLogging();
        java.util.Set<java.lang.Class> classSet44 = genericDeclarationMockSettingsImpl42.getExtraInterfaces();
        java.lang.Object obj45 = genericDeclarationMockSettingsImpl42.getSpiedInstance();
        boolean boolean46 = genericDeclarationMockSettingsImpl42.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl47 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl38, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl42);
        org.mockito.invocation.Invocation invocation48 = null;
        org.mockito.mock.SerializableMode serializableMode49 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray50 = new org.mockito.mock.SerializableMode[] { serializableMode49 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet51 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray50);
        java.util.List<org.hamcrest.Matcher> matcherList52 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray50);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher53 = new org.mockito.internal.invocation.InvocationMatcher(invocation48, matcherList52);
        invocationContainerImpl47.setInvocationForPotentialStubbing(invocationMatcher53);
        org.mockito.invocation.Invocation invocation55 = invocationsFinder0.findSimilarInvocation(invocationList37, invocationMatcher53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet44 and hashCodeAndEqualsSafeSet4.", classSet44.equals(hashCodeAndEqualsSafeSet4) == hashCodeAndEqualsSafeSet4.equals(classSet44));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test15");
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl0 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl0.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode2 = mockingProgressImpl0.pullVerificationMode();
        java.lang.String str3 = mockingProgressImpl0.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings5 = genericDeclarationMockSettingsImpl4.verboseLogging();
        java.util.Set<java.lang.Class> classSet6 = genericDeclarationMockSettingsImpl4.getExtraInterfaces();
        java.lang.Object obj7 = genericDeclarationMockSettingsImpl4.getSpiedInstance();
        boolean boolean8 = genericDeclarationMockSettingsImpl4.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl9 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl4);
        java.lang.Class<java.lang.reflect.GenericDeclaration> genericDeclarationClass10 = genericDeclarationMockSettingsImpl4.getTypeToMock();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress11 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener12 = null;
        threadSafeMockingProgress11.setListener(mockingProgressListener12);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet14 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor15 = hashCodeAndEqualsSafeSet14.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet17 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet14, "");
        boolean boolean19 = hashCodeAndEqualsSafeSet14.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl20 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean21 = hashCodeAndEqualsSafeSet14.contains((java.lang.Object) genericDeclarationMockSettingsImpl20);
        org.mockito.MockSettings mockSettings23 = genericDeclarationMockSettingsImpl20.name("hi!");
        java.lang.String str24 = genericDeclarationMockSettingsImpl20.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl25 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress11, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl20);
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener26 = null;
        threadSafeMockingProgress11.setListener(mockingProgressListener26);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing28 = threadSafeMockingProgress11.pullOngoingStubbing();
        org.mockito.MockSettings mockSettings29 = genericDeclarationMockSettingsImpl4.spiedInstance((java.lang.Object) threadSafeMockingProgress11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet6 and hashCodeAndEqualsSafeSet14.", classSet6.equals(hashCodeAndEqualsSafeSet14) == hashCodeAndEqualsSafeSet14.equals(classSet6));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test16");
        org.mockito.internal.invocation.InvocationsFinder invocationsFinder0 = new org.mockito.internal.invocation.InvocationsFinder();
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter1 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        org.mockito.internal.MockitoCore mockitoCore2 = new org.mockito.internal.MockitoCore();
        java.util.List list3 = org.mockito.Matchers.anyList();
        org.mockito.internal.verification.api.InOrderContext inOrderContext4 = null;
        mockitoCore2.verifyNoMoreInteractionsInOrder((java.util.List<java.lang.Object>) list3, inOrderContext4);
        java.lang.String str6 = scenarioPrinter1.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list3);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter7 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list8 = org.mockito.Matchers.anyList();
        java.lang.String str9 = scenarioPrinter7.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list8);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter10 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list11 = org.mockito.Matchers.anyList();
        java.lang.String str12 = scenarioPrinter10.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list11);
        java.lang.String str13 = scenarioPrinter7.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list11);
        java.lang.String str14 = scenarioPrinter1.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list11);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList15 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.invocation.Invocation>) list11);
        org.mockito.internal.verification.api.InOrderContext inOrderContext16 = null;
        org.mockito.invocation.Invocation invocation17 = invocationsFinder0.findPreviousVerifiedInOrder((java.util.List<org.mockito.invocation.Invocation>) list11, inOrderContext16);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress18 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener19 = null;
        threadSafeMockingProgress18.setListener(mockingProgressListener19);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet21 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor22 = hashCodeAndEqualsSafeSet21.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet24 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet21, "");
        boolean boolean26 = hashCodeAndEqualsSafeSet21.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl27 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean28 = hashCodeAndEqualsSafeSet21.contains((java.lang.Object) genericDeclarationMockSettingsImpl27);
        org.mockito.MockSettings mockSettings30 = genericDeclarationMockSettingsImpl27.name("hi!");
        java.lang.String str31 = genericDeclarationMockSettingsImpl27.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl32 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress18, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl27);
        java.util.List<org.mockito.invocation.Invocation> invocationList33 = invocationContainerImpl32.getInvocations();
        org.mockito.internal.verification.api.InOrderContext inOrderContext34 = null;
        org.mockito.invocation.Invocation invocation35 = invocationsFinder0.findPreviousVerifiedInOrder(invocationList33, inOrderContext34);
        org.mockito.internal.verification.SingleRegisteredInvocation singleRegisteredInvocation36 = new org.mockito.internal.verification.SingleRegisteredInvocation();
        java.util.List<org.mockito.invocation.Invocation> invocationList37 = singleRegisteredInvocation36.getAll();
        java.util.List<org.mockito.invocation.Invocation> invocationList38 = singleRegisteredInvocation36.getAll();
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl39 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl39.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode41 = mockingProgressImpl39.pullVerificationMode();
        java.lang.String str42 = mockingProgressImpl39.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl43 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings44 = genericDeclarationMockSettingsImpl43.verboseLogging();
        java.util.Set<java.lang.Class> classSet45 = genericDeclarationMockSettingsImpl43.getExtraInterfaces();
        java.lang.Object obj46 = genericDeclarationMockSettingsImpl43.getSpiedInstance();
        boolean boolean47 = genericDeclarationMockSettingsImpl43.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl48 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl39, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl43);
        org.mockito.invocation.Invocation invocation49 = null;
        org.mockito.mock.SerializableMode serializableMode50 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray51 = new org.mockito.mock.SerializableMode[] { serializableMode50 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet52 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray51);
        java.util.List<org.hamcrest.Matcher> matcherList53 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray51);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher54 = new org.mockito.internal.invocation.InvocationMatcher(invocation49, matcherList53);
        invocationContainerImpl48.setInvocationForPotentialStubbing(invocationMatcher54);
        org.mockito.internal.verification.api.InOrderContext inOrderContext56 = null;
        org.mockito.invocation.Invocation invocation57 = invocationsFinder0.findFirstMatchingUnverifiedInvocation(invocationList38, invocationMatcher54, inOrderContext56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet45 and hashCodeAndEqualsSafeSet21.", classSet45.equals(hashCodeAndEqualsSafeSet21) == hashCodeAndEqualsSafeSet21.equals(classSet45));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test17");
        org.mockito.internal.creation.instance.InstantiatorProvider instantiatorProvider0 = new org.mockito.internal.creation.instance.InstantiatorProvider();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress1 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener2 = null;
        threadSafeMockingProgress1.setListener(mockingProgressListener2);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet4 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor5 = hashCodeAndEqualsSafeSet4.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet7 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet4, "");
        boolean boolean9 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl10 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean11 = hashCodeAndEqualsSafeSet4.contains((java.lang.Object) genericDeclarationMockSettingsImpl10);
        org.mockito.MockSettings mockSettings13 = genericDeclarationMockSettingsImpl10.name("hi!");
        java.lang.String str14 = genericDeclarationMockSettingsImpl10.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl15 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress1, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl10);
        org.mockito.internal.creation.instance.Instantiator instantiator16 = instantiatorProvider0.getInstantiator((org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl10);
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine17 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl18 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings19 = genericDeclarationMockSettingsImpl18.verboseLogging();
        java.util.Set<java.lang.Class> classSet20 = genericDeclarationMockSettingsImpl18.getExtraInterfaces();
        java.lang.Object obj21 = genericDeclarationMockSettingsImpl18.getSpiedInstance();
        org.mockito.MockSettings mockSettings22 = genericDeclarationMockSettingsImpl18.serializable();
        injectingAnnotationEngine17.injectMocks((java.lang.Object) mockSettings22);
        org.mockito.internal.creation.settings.CreationSettings<java.lang.reflect.GenericDeclaration> genericDeclarationCreationSettings24 = new org.mockito.internal.creation.settings.CreationSettings<java.lang.reflect.GenericDeclaration>();
        injectingAnnotationEngine17.injectMocks((java.lang.Object) genericDeclarationCreationSettings24);
        org.mockito.internal.creation.instance.Instantiator instantiator26 = instantiatorProvider0.getInstantiator((org.mockito.mock.MockCreationSettings) genericDeclarationCreationSettings24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet20 and hashCodeAndEqualsSafeSet4.", classSet20.equals(hashCodeAndEqualsSafeSet4) == hashCodeAndEqualsSafeSet4.equals(classSet20));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test18");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = org.mockito.Mockito.spy(reporter0);
        org.mockito.internal.exceptions.stacktrace.StackTraceFilter stackTraceFilter4 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
        org.mockito.exceptions.misusing.MockitoConfigurationException mockitoConfigurationException6 = new org.mockito.exceptions.misusing.MockitoConfigurationException("");
        java.lang.StackTraceElement[] stackTraceElementArray7 = mockitoConfigurationException6.getUnfilteredStackTrace();
        java.lang.StackTraceElement[] stackTraceElementArray9 = stackTraceFilter4.filter(stackTraceElementArray7, false);
        org.mockito.internal.debugging.LocationImpl locationImpl10 = new org.mockito.internal.debugging.LocationImpl(stackTraceFilter4);
        // during test generation this statement threw an exception of type org.mockito.exceptions.verification.junit.ArgumentsAreDifferent in error
        reporter0.argumentsAreDifferent("iOngoingStubbing: null, verificationMode: null, stubbingInProgress: -> at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)", "org.mockito.exceptions.verification.WantedButNotInvoked: -> at sun.reflect.GeneratedConstructorAccessor33.newInstance(Unknown Source)", (org.mockito.invocation.Location) locationImpl10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test19");
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl0 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl0.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode2 = mockingProgressImpl0.pullVerificationMode();
        java.lang.String str3 = mockingProgressImpl0.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings5 = genericDeclarationMockSettingsImpl4.verboseLogging();
        java.util.Set<java.lang.Class> classSet6 = genericDeclarationMockSettingsImpl4.getExtraInterfaces();
        java.lang.Object obj7 = genericDeclarationMockSettingsImpl4.getSpiedInstance();
        boolean boolean8 = genericDeclarationMockSettingsImpl4.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl9 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl4);
        mockingProgressImpl0.resetOngoingStubbing();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl11 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.mock.SerializableMode serializableMode12 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.MockSettings mockSettings13 = genericDeclarationMockSettingsImpl11.serializable(serializableMode12);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy14 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.MockSettings mockSettings15 = genericDeclarationMockSettingsImpl11.outerInstance((java.lang.Object) mockInjectionStrategy14);
        org.mockito.exceptions.verification.SmartNullPointerException smartNullPointerException17 = new org.mockito.exceptions.verification.SmartNullPointerException("hi!");
        org.mockito.MockSettings mockSettings18 = genericDeclarationMockSettingsImpl11.spiedInstance((java.lang.Object) "hi!");
        boolean boolean19 = genericDeclarationMockSettingsImpl11.isStubOnly();
        java.lang.Object obj20 = null;
        org.mockito.MockSettings mockSettings21 = genericDeclarationMockSettingsImpl11.outerInstance(obj20);
        org.mockito.internal.creation.MockSettingsImpl mockSettingsImpl22 = genericDeclarationMockSettingsImpl11.stubOnly();
        java.util.Set<java.lang.Class> classSet23 = genericDeclarationMockSettingsImpl11.getExtraInterfaces();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl24 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl11);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress25 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener26 = null;
        threadSafeMockingProgress25.setListener(mockingProgressListener26);
        threadSafeMockingProgress25.reset();
        org.mockito.verification.VerificationMode verificationMode29 = threadSafeMockingProgress25.pullVerificationMode();
        threadSafeMockingProgress25.stubbingStarted();
        threadSafeMockingProgress25.reset();
        org.mockito.verification.VerificationMode verificationMode32 = threadSafeMockingProgress25.pullVerificationMode();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress33 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener34 = null;
        threadSafeMockingProgress33.setListener(mockingProgressListener34);
        threadSafeMockingProgress33.reset();
        org.mockito.verification.VerificationMode verificationMode37 = threadSafeMockingProgress33.pullVerificationMode();
        threadSafeMockingProgress33.stubbingStarted();
        threadSafeMockingProgress33.reset();
        org.mockito.verification.VerificationMode verificationMode40 = threadSafeMockingProgress33.pullVerificationMode();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress41 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener42 = null;
        threadSafeMockingProgress41.setListener(mockingProgressListener42);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet44 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor45 = hashCodeAndEqualsSafeSet44.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet47 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet44, "");
        boolean boolean49 = hashCodeAndEqualsSafeSet44.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl50 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean51 = hashCodeAndEqualsSafeSet44.contains((java.lang.Object) genericDeclarationMockSettingsImpl50);
        org.mockito.MockSettings mockSettings53 = genericDeclarationMockSettingsImpl50.name("hi!");
        java.lang.String str54 = genericDeclarationMockSettingsImpl50.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl55 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress41, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl50);
        java.util.List<org.mockito.invocation.Invocation> invocationList56 = invocationContainerImpl55.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList57 = invocationContainerImpl55.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl58 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl55);
        org.mockito.exceptions.verification.TooLittleActualInvocations tooLittleActualInvocations60 = new org.mockito.exceptions.verification.TooLittleActualInvocations("[]");
        java.lang.Throwable[] throwableArray61 = tooLittleActualInvocations60.getSuppressed();
        java.lang.Object[] objArray62 = org.mockito.Mockito.ignoreStubs((java.lang.Object[]) throwableArray61);
        org.mockito.stubbing.OngoingStubbing<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbing63 = verificationModeFactoryOngoingStubbingImpl58.thenThrow(throwableArray61);
        java.util.List<org.mockito.invocation.Invocation> invocationList64 = verificationModeFactoryOngoingStubbingImpl58.getRegisteredInvocations();
        threadSafeMockingProgress33.reportOngoingStubbing((org.mockito.internal.progress.IOngoingStubbing) verificationModeFactoryOngoingStubbingImpl58);
        threadSafeMockingProgress25.reportOngoingStubbing((org.mockito.internal.progress.IOngoingStubbing) verificationModeFactoryOngoingStubbingImpl58);
        mockingProgressImpl0.reportOngoingStubbing((org.mockito.internal.progress.IOngoingStubbing) verificationModeFactoryOngoingStubbingImpl58);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet6 and hashCodeAndEqualsSafeSet44.", classSet6.equals(hashCodeAndEqualsSafeSet44) == hashCodeAndEqualsSafeSet44.equals(classSet6));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test20");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (int) '4');
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test21");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList15 = invocationContainerImpl14.getStubbedInvocations();
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl16 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl16.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode18 = mockingProgressImpl16.pullVerificationMode();
        java.lang.String str19 = mockingProgressImpl16.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl20 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings21 = genericDeclarationMockSettingsImpl20.verboseLogging();
        java.util.Set<java.lang.Class> classSet22 = genericDeclarationMockSettingsImpl20.getExtraInterfaces();
        java.lang.Object obj23 = genericDeclarationMockSettingsImpl20.getSpiedInstance();
        boolean boolean24 = genericDeclarationMockSettingsImpl20.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl25 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl16, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl20);
        org.mockito.invocation.Invocation invocation26 = null;
        org.mockito.mock.SerializableMode serializableMode27 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray28 = new org.mockito.mock.SerializableMode[] { serializableMode27 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet29 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray28);
        java.util.List<org.hamcrest.Matcher> matcherList30 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray28);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher31 = new org.mockito.internal.invocation.InvocationMatcher(invocation26, matcherList30);
        invocationContainerImpl25.setInvocationForPotentialStubbing(invocationMatcher31);
        invocationContainerImpl14.setInvocationForPotentialStubbing(invocationMatcher31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet22 and hashCodeAndEqualsSafeSet3.", classSet22.equals(hashCodeAndEqualsSafeSet3) == hashCodeAndEqualsSafeSet3.equals(classSet22));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test22");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.invocation.Invocation> invocationList15 = invocationContainerImpl14.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList16 = invocationContainerImpl14.getStubbedInvocations();
        java.lang.String str17 = invocationContainerImpl14.toString();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList18 = invocationContainerImpl14.getStubbedInvocations();
        java.util.List<org.mockito.invocation.Invocation> invocationList19 = invocationContainerImpl14.getInvocations();
        boolean boolean20 = invocationContainerImpl14.hasInvocationForPotentialStubbing();
        org.mockito.internal.progress.MockingProgressImpl mockingProgressImpl21 = new org.mockito.internal.progress.MockingProgressImpl();
        mockingProgressImpl21.stubbingStarted();
        org.mockito.verification.VerificationMode verificationMode23 = mockingProgressImpl21.pullVerificationMode();
        java.lang.String str24 = mockingProgressImpl21.toString();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl25 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings26 = genericDeclarationMockSettingsImpl25.verboseLogging();
        java.util.Set<java.lang.Class> classSet27 = genericDeclarationMockSettingsImpl25.getExtraInterfaces();
        java.lang.Object obj28 = genericDeclarationMockSettingsImpl25.getSpiedInstance();
        boolean boolean29 = genericDeclarationMockSettingsImpl25.isSerializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl30 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) mockingProgressImpl21, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl25);
        org.mockito.invocation.Invocation invocation31 = null;
        org.mockito.mock.SerializableMode serializableMode32 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray33 = new org.mockito.mock.SerializableMode[] { serializableMode32 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet34 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray33);
        java.util.List<org.hamcrest.Matcher> matcherList35 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray33);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher36 = new org.mockito.internal.invocation.InvocationMatcher(invocation31, matcherList35);
        invocationContainerImpl30.setInvocationForPotentialStubbing(invocationMatcher36);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher38 = invocationContainerImpl30.getInvocationForStubbing();
        invocationContainerImpl14.setInvocationForPotentialStubbing(invocationMatcher38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet27 and hashCodeAndEqualsSafeSet3.", classSet27.equals(hashCodeAndEqualsSafeSet3) == hashCodeAndEqualsSafeSet3.equals(classSet27));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test23");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) 'a');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test24");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.mock.SerializableMode serializableMode4 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.MockSettings mockSettings5 = genericDeclarationMockSettingsImpl3.serializable(serializableMode4);
        org.mockito.mock.SerializableMode serializableMode6 = org.mockito.mock.SerializableMode.BASIC;
        org.mockito.MockSettings mockSettings7 = genericDeclarationMockSettingsImpl3.serializable(serializableMode6);
        org.mockito.MockSettings mockSettings8 = genericDeclarationMockSettingsImpl3.useConstructor();
        org.mockito.mock.MockName mockName9 = genericDeclarationMockSettingsImpl3.getMockName();
        org.mockito.MockSettings mockSettings10 = genericDeclarationMockSettingsImpl3.stubOnly();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl11 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl3);
        org.mockito.internal.invocation.InvocationsFinder invocationsFinder12 = new org.mockito.internal.invocation.InvocationsFinder();
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter13 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        org.mockito.internal.MockitoCore mockitoCore14 = new org.mockito.internal.MockitoCore();
        java.util.List list15 = org.mockito.Matchers.anyList();
        org.mockito.internal.verification.api.InOrderContext inOrderContext16 = null;
        mockitoCore14.verifyNoMoreInteractionsInOrder((java.util.List<java.lang.Object>) list15, inOrderContext16);
        java.lang.String str18 = scenarioPrinter13.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list15);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter19 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list20 = org.mockito.Matchers.anyList();
        java.lang.String str21 = scenarioPrinter19.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list20);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter22 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list23 = org.mockito.Matchers.anyList();
        java.lang.String str24 = scenarioPrinter22.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list23);
        java.lang.String str25 = scenarioPrinter19.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list23);
        java.lang.String str26 = scenarioPrinter13.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list23);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList27 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.invocation.Invocation>) list23);
        org.mockito.internal.verification.api.InOrderContext inOrderContext28 = null;
        org.mockito.invocation.Invocation invocation29 = invocationsFinder12.findPreviousVerifiedInOrder((java.util.List<org.mockito.invocation.Invocation>) list23, inOrderContext28);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter30 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        org.mockito.internal.MockitoCore mockitoCore31 = new org.mockito.internal.MockitoCore();
        java.util.List list32 = org.mockito.Matchers.anyList();
        org.mockito.internal.verification.api.InOrderContext inOrderContext33 = null;
        mockitoCore31.verifyNoMoreInteractionsInOrder((java.util.List<java.lang.Object>) list32, inOrderContext33);
        java.lang.String str35 = scenarioPrinter30.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list32);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter36 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list37 = org.mockito.Matchers.anyList();
        java.lang.String str38 = scenarioPrinter36.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list37);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter39 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list40 = org.mockito.Matchers.anyList();
        java.lang.String str41 = scenarioPrinter39.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list40);
        java.lang.String str42 = scenarioPrinter36.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list40);
        java.lang.String str43 = scenarioPrinter30.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list40);
        java.util.List<org.mockito.internal.invocation.InvocationMatcher> invocationMatcherList44 = org.mockito.internal.invocation.InvocationMatcher.createFrom((java.util.List<org.mockito.invocation.Invocation>) list40);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress45 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener46 = null;
        threadSafeMockingProgress45.setListener(mockingProgressListener46);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet48 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor49 = hashCodeAndEqualsSafeSet48.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet51 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet48, "");
        boolean boolean53 = hashCodeAndEqualsSafeSet48.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl54 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean55 = hashCodeAndEqualsSafeSet48.contains((java.lang.Object) genericDeclarationMockSettingsImpl54);
        org.mockito.MockSettings mockSettings57 = genericDeclarationMockSettingsImpl54.name("hi!");
        java.lang.String str58 = genericDeclarationMockSettingsImpl54.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl59 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress45, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl54);
        java.util.List<org.mockito.invocation.Invocation> invocationList60 = invocationContainerImpl59.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList61 = invocationContainerImpl59.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl62 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl59);
        org.mockito.invocation.Invocation invocation63 = null;
        org.mockito.mock.SerializableMode serializableMode64 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray65 = new org.mockito.mock.SerializableMode[] { serializableMode64 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet66 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray65);
        java.util.List<org.hamcrest.Matcher> matcherList67 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray65);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher68 = new org.mockito.internal.invocation.InvocationMatcher(invocation63, matcherList67);
        invocationContainerImpl59.resetInvocationForPotentialStubbing(invocationMatcher68);
        java.util.List<org.mockito.invocation.Invocation> invocationList70 = invocationsFinder12.findInvocations((java.util.List<org.mockito.invocation.Invocation>) list40, invocationMatcher68);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl11.setMethodForStubbing(invocationMatcher68);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test25");
        org.mockito.internal.configuration.DefaultInjectionEngine defaultInjectionEngine0 = new org.mockito.internal.configuration.DefaultInjectionEngine();
        java.util.Set set1 = org.mockito.Matchers.anySet();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet2 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor3 = hashCodeAndEqualsSafeSet2.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet5 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet2, "");
        boolean boolean7 = hashCodeAndEqualsSafeSet2.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl8 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean9 = hashCodeAndEqualsSafeSet2.contains((java.lang.Object) genericDeclarationMockSettingsImpl8);
        java.lang.String[] strArray14 = new java.lang.String[] { "[]", "[]", "[HashCodeAndEqualsMockWrapper{mockInstance=CallsRealMethods(216157735)}]", "[HashCodeAndEqualsMockWrapper{mockInstance=CallsRealMethods(216157735)}]" };
        java.lang.String[] strArray15 = hashCodeAndEqualsSafeSet2.toArray(strArray14);
        java.lang.Object obj16 = null;
        boolean boolean17 = hashCodeAndEqualsSafeSet2.remove(obj16);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl18 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings19 = genericDeclarationMockSettingsImpl18.verboseLogging();
        java.util.Set<java.lang.Class> classSet20 = genericDeclarationMockSettingsImpl18.getExtraInterfaces();
        java.lang.Object obj21 = genericDeclarationMockSettingsImpl18.getSpiedInstance();
        org.mockito.MockSettings mockSettings22 = genericDeclarationMockSettingsImpl18.serializable();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl23 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.mock.SerializableMode serializableMode24 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.MockSettings mockSettings25 = genericDeclarationMockSettingsImpl23.serializable(serializableMode24);
        org.mockito.MockSettings mockSettings26 = genericDeclarationMockSettingsImpl18.serializable(serializableMode24);
        java.lang.Class<java.lang.reflect.GenericDeclaration> genericDeclarationClass27 = genericDeclarationMockSettingsImpl18.getTypeToMock();
        org.mockito.mock.SerializableMode serializableMode28 = genericDeclarationMockSettingsImpl18.getSerializableMode();
        defaultInjectionEngine0.injectMocksOnFields((java.util.Set<java.lang.reflect.Field>) set1, (java.util.Set<java.lang.Object>) hashCodeAndEqualsSafeSet2, (java.lang.Object) serializableMode28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet20 and hashCodeAndEqualsSafeSet2.", classSet20.equals(hashCodeAndEqualsSafeSet2) == hashCodeAndEqualsSafeSet2.equals(classSet20));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test26");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = org.mockito.Mockito.spy(reporter0);
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test27");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.invocation.Invocation> invocationList15 = invocationContainerImpl14.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList16 = invocationContainerImpl14.getStubbedInvocations();
        java.lang.String str17 = invocationContainerImpl14.toString();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList18 = invocationContainerImpl14.getStubbedInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList19 = invocationContainerImpl14.getStubbedInvocations();
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher20 = invocationContainerImpl14.getInvocationForStubbing();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList21 = invocationContainerImpl14.getStubbedInvocations();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress22 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener23 = null;
        threadSafeMockingProgress22.setListener(mockingProgressListener23);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet25 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor26 = hashCodeAndEqualsSafeSet25.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet28 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet25, "");
        boolean boolean30 = hashCodeAndEqualsSafeSet25.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl31 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean32 = hashCodeAndEqualsSafeSet25.contains((java.lang.Object) genericDeclarationMockSettingsImpl31);
        org.mockito.MockSettings mockSettings34 = genericDeclarationMockSettingsImpl31.name("hi!");
        java.lang.String str35 = genericDeclarationMockSettingsImpl31.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl36 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress22, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl31);
        java.lang.String str37 = invocationContainerImpl36.toString();
        org.mockito.invocation.Invocation invocation38 = null;
        org.mockito.mock.SerializableMode serializableMode39 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray40 = new org.mockito.mock.SerializableMode[] { serializableMode39 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet41 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray40);
        java.util.List<org.hamcrest.Matcher> matcherList42 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray40);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher43 = new org.mockito.internal.invocation.InvocationMatcher(invocation38, matcherList42);
        org.mockito.invocation.Invocation invocation44 = null;
        invocationMatcher43.captureArgumentsFrom(invocation44);
        invocationContainerImpl36.setInvocationForPotentialStubbing(invocationMatcher43);
        org.mockito.invocation.Invocation invocation47 = null;
        org.mockito.mock.SerializableMode serializableMode48 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray49 = new org.mockito.mock.SerializableMode[] { serializableMode48 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet50 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray49);
        java.util.List<org.hamcrest.Matcher> matcherList51 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray49);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher52 = new org.mockito.internal.invocation.InvocationMatcher(invocation47, matcherList51);
        org.mockito.invocation.Invocation invocation53 = null;
        invocationMatcher52.captureArgumentsFrom(invocation53);
        java.util.List<org.hamcrest.Matcher> matcherList55 = invocationMatcher52.getMatchers();
        org.mockito.invocation.Invocation invocation56 = null;
        invocationMatcher52.captureArgumentsFrom(invocation56);
        invocationContainerImpl36.setInvocationForPotentialStubbing(invocationMatcher52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher52);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test28");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.invocation.Invocation> invocationList15 = invocationContainerImpl14.getInvocations();
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter16 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        org.mockito.internal.MockitoCore mockitoCore17 = new org.mockito.internal.MockitoCore();
        java.util.List list18 = org.mockito.Matchers.anyList();
        org.mockito.internal.verification.api.InOrderContext inOrderContext19 = null;
        mockitoCore17.verifyNoMoreInteractionsInOrder((java.util.List<java.lang.Object>) list18, inOrderContext19);
        java.lang.String str21 = scenarioPrinter16.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list18);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter22 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list23 = org.mockito.Matchers.anyList();
        java.lang.String str24 = scenarioPrinter22.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list23);
        org.mockito.internal.exceptions.util.ScenarioPrinter scenarioPrinter25 = new org.mockito.internal.exceptions.util.ScenarioPrinter();
        java.util.List list26 = org.mockito.Matchers.anyList();
        java.lang.String str27 = scenarioPrinter25.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list26);
        java.lang.String str28 = scenarioPrinter22.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list26);
        java.lang.String str29 = scenarioPrinter16.print((java.util.List<org.mockito.internal.exceptions.VerificationAwareInvocation>) list26);
        invocationContainerImpl14.setAnswersForStubbing((java.util.List<org.mockito.stubbing.Answer>) list26);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress31 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener32 = null;
        threadSafeMockingProgress31.setListener(mockingProgressListener32);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet34 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor35 = hashCodeAndEqualsSafeSet34.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet37 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet34, "");
        boolean boolean39 = hashCodeAndEqualsSafeSet34.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl40 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean41 = hashCodeAndEqualsSafeSet34.contains((java.lang.Object) genericDeclarationMockSettingsImpl40);
        org.mockito.MockSettings mockSettings43 = genericDeclarationMockSettingsImpl40.name("hi!");
        java.lang.String str44 = genericDeclarationMockSettingsImpl40.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl45 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress31, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl40);
        java.util.List<org.mockito.invocation.Invocation> invocationList46 = invocationContainerImpl45.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList47 = invocationContainerImpl45.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl48 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl45);
        org.mockito.invocation.Invocation invocation49 = null;
        org.mockito.mock.SerializableMode serializableMode50 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray51 = new org.mockito.mock.SerializableMode[] { serializableMode50 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet52 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray51);
        java.util.List<org.hamcrest.Matcher> matcherList53 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray51);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher54 = new org.mockito.internal.invocation.InvocationMatcher(invocation49, matcherList53);
        invocationContainerImpl45.resetInvocationForPotentialStubbing(invocationMatcher54);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress56 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener57 = null;
        threadSafeMockingProgress56.setListener(mockingProgressListener57);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet59 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor60 = hashCodeAndEqualsSafeSet59.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet62 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet59, "");
        boolean boolean64 = hashCodeAndEqualsSafeSet59.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl65 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean66 = hashCodeAndEqualsSafeSet59.contains((java.lang.Object) genericDeclarationMockSettingsImpl65);
        org.mockito.MockSettings mockSettings68 = genericDeclarationMockSettingsImpl65.name("hi!");
        java.lang.String str69 = genericDeclarationMockSettingsImpl65.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl70 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress56, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl65);
        java.util.List<org.mockito.invocation.Invocation> invocationList71 = invocationContainerImpl70.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList72 = invocationContainerImpl70.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl73 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl70);
        org.mockito.invocation.Invocation invocation74 = null;
        org.mockito.mock.SerializableMode serializableMode75 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray76 = new org.mockito.mock.SerializableMode[] { serializableMode75 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet77 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray76);
        java.util.List<org.hamcrest.Matcher> matcherList78 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray76);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher79 = new org.mockito.internal.invocation.InvocationMatcher(invocation74, matcherList78);
        invocationContainerImpl70.resetInvocationForPotentialStubbing(invocationMatcher79);
        invocationContainerImpl45.resetInvocationForPotentialStubbing(invocationMatcher79);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher79);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test29");
        org.mockito.internal.progress.MockingProgress mockingProgress0 = null;
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings2 = genericDeclarationMockSettingsImpl1.verboseLogging();
        java.util.Set<java.lang.Class> classSet3 = genericDeclarationMockSettingsImpl1.getExtraInterfaces();
        java.lang.Object obj4 = genericDeclarationMockSettingsImpl1.getSpiedInstance();
        org.mockito.MockSettings mockSettings5 = genericDeclarationMockSettingsImpl1.serializable();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl6 = new org.mockito.internal.stubbing.InvocationContainerImpl(mockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl1);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress7 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener8 = null;
        threadSafeMockingProgress7.setListener(mockingProgressListener8);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet10 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor11 = hashCodeAndEqualsSafeSet10.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet13 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet10, "");
        boolean boolean15 = hashCodeAndEqualsSafeSet10.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl16 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean17 = hashCodeAndEqualsSafeSet10.contains((java.lang.Object) genericDeclarationMockSettingsImpl16);
        org.mockito.MockSettings mockSettings19 = genericDeclarationMockSettingsImpl16.name("hi!");
        java.lang.String str20 = genericDeclarationMockSettingsImpl16.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl21 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress7, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl16);
        java.util.List<org.mockito.invocation.Invocation> invocationList22 = invocationContainerImpl21.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList23 = invocationContainerImpl21.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl24 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl21);
        org.mockito.invocation.Invocation invocation25 = null;
        org.mockito.mock.SerializableMode serializableMode26 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray27 = new org.mockito.mock.SerializableMode[] { serializableMode26 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet28 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray27);
        java.util.List<org.hamcrest.Matcher> matcherList29 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray27);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher30 = new org.mockito.internal.invocation.InvocationMatcher(invocation25, matcherList29);
        invocationContainerImpl21.resetInvocationForPotentialStubbing(invocationMatcher30);
        java.util.List<org.hamcrest.Matcher> matcherList32 = invocationMatcher30.getMatchers();
        invocationContainerImpl6.setInvocationForPotentialStubbing(invocationMatcher30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet3 and hashCodeAndEqualsSafeSet10.", classSet3.equals(hashCodeAndEqualsSafeSet10) == hashCodeAndEqualsSafeSet10.equals(classSet3));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test30");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = org.mockito.Mockito.spy(reporter0);
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test31");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList15 = invocationContainerImpl14.getStubbedInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList16 = invocationContainerImpl14.getStubbedInvocations();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress17 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener18 = null;
        threadSafeMockingProgress17.setListener(mockingProgressListener18);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet20 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor21 = hashCodeAndEqualsSafeSet20.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet23 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet20, "");
        boolean boolean25 = hashCodeAndEqualsSafeSet20.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl26 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean27 = hashCodeAndEqualsSafeSet20.contains((java.lang.Object) genericDeclarationMockSettingsImpl26);
        org.mockito.MockSettings mockSettings29 = genericDeclarationMockSettingsImpl26.name("hi!");
        java.lang.String str30 = genericDeclarationMockSettingsImpl26.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl31 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress17, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl26);
        java.util.List<org.mockito.invocation.Invocation> invocationList32 = invocationContainerImpl31.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList33 = invocationContainerImpl31.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl34 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl31);
        org.mockito.invocation.Invocation invocation35 = null;
        org.mockito.mock.SerializableMode serializableMode36 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray37 = new org.mockito.mock.SerializableMode[] { serializableMode36 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet38 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray37);
        java.util.List<org.hamcrest.Matcher> matcherList39 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray37);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher40 = new org.mockito.internal.invocation.InvocationMatcher(invocation35, matcherList39);
        invocationContainerImpl31.resetInvocationForPotentialStubbing(invocationMatcher40);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher40);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test32");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet0 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor1 = hashCodeAndEqualsSafeSet0.iterator();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl2 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.mock.SerializableMode serializableMode3 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.MockSettings mockSettings4 = genericDeclarationMockSettingsImpl2.serializable(serializableMode3);
        org.mockito.mock.SerializableMode serializableMode5 = org.mockito.mock.SerializableMode.BASIC;
        org.mockito.MockSettings mockSettings6 = genericDeclarationMockSettingsImpl2.serializable(serializableMode5);
        boolean boolean7 = hashCodeAndEqualsSafeSet0.contains((java.lang.Object) genericDeclarationMockSettingsImpl2);
        java.util.stream.Stream<java.lang.Object> objStream8 = hashCodeAndEqualsSafeSet0.parallelStream();
        org.mockito.internal.handler.MockHandlerFactory mockHandlerFactory9 = new org.mockito.internal.handler.MockHandlerFactory();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl10 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings11 = genericDeclarationMockSettingsImpl10.verboseLogging();
        java.util.Set<java.lang.Class> classSet12 = genericDeclarationMockSettingsImpl10.getExtraInterfaces();
        java.lang.Object obj13 = genericDeclarationMockSettingsImpl10.getSpiedInstance();
        org.mockito.internal.InternalMockHandler internalMockHandler14 = mockHandlerFactory9.create((org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl10);
        org.mockito.internal.verification.Times times16 = org.mockito.internal.verification.VerificationModeFactory.times(10);
        java.lang.String[] strArray17 = new java.lang.String[] {};
        org.mockito.internal.verification.api.VerificationInOrderMode verificationInOrderMode18 = org.mockito.Matchers.refEq((org.mockito.internal.verification.api.VerificationInOrderMode) times16, strArray17);
        org.mockito.internal.InternalMockHandler internalMockHandler19 = org.mockito.Matchers.refEq(internalMockHandler14, strArray17);
        java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>> objBaseStream20 = org.mockito.Matchers.refEq((java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>>) objStream8, strArray17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet12 and hashCodeAndEqualsSafeSet0.", classSet12.equals(hashCodeAndEqualsSafeSet0) == hashCodeAndEqualsSafeSet0.equals(classSet12));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test33");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test34");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.MockitoCore mockitoCore3 = new org.mockito.internal.MockitoCore();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress4 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener5 = null;
        threadSafeMockingProgress4.setListener(mockingProgressListener5);
        org.mockito.MockingDetails mockingDetails7 = mockitoCore3.mockingDetails((java.lang.Object) mockingProgressListener5);
        org.mockito.internal.creation.cglib.CglibMockMaker cglibMockMaker8 = new org.mockito.internal.creation.cglib.CglibMockMaker();
        org.mockito.verification.VerificationWithTimeout verificationWithTimeout10 = org.mockito.Mockito.timeout((long) ' ');
        org.mockito.verification.VerificationMode verificationMode11 = verificationWithTimeout10.atLeastOnce();
        org.mockito.invocation.MockHandler mockHandler12 = cglibMockMaker8.getHandler((java.lang.Object) verificationWithTimeout10);
        org.mockito.MockingDetails mockingDetails13 = mockitoCore3.mockingDetails((java.lang.Object) cglibMockMaker8);
        org.mockito.plugins.MockMaker mockMaker14 = org.mockito.Matchers.same((org.mockito.plugins.MockMaker) cglibMockMaker8);
        org.mockito.invocation.MockHandler mockHandler16 = cglibMockMaker8.getHandler((java.lang.Object) "[]");
        org.mockito.invocation.MockHandler mockHandler18 = cglibMockMaker8.getHandler((java.lang.Object) "-> at sun.reflect.GeneratedConstructorAccessor46.newInstance(Unknown Source)");
        org.mockito.internal.debugging.LocationImpl locationImpl19 = new org.mockito.internal.debugging.LocationImpl();
        org.mockito.invocation.MockHandler mockHandler20 = cglibMockMaker8.getHandler((java.lang.Object) locationImpl19);
        // during test generation this statement threw an exception of type org.mockito.exceptions.verification.junit.ArgumentsAreDifferent in error
        reporter0.argumentsAreDifferent("[HashCodeAndEqualsMockWrapper{mockInstance=CallsRealMethods(975950141)}]", "\n[]\n1.0\norg.mockito.exceptions.verification.WantedButNotInvoked: hi!\nclass org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue\norg.mockito.exceptions.misusing.NotAMockException: \n", (org.mockito.invocation.Location) locationImpl19);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test35");
        org.mockito.internal.configuration.InjectingAnnotationEngine injectingAnnotationEngine0 = new org.mockito.internal.configuration.InjectingAnnotationEngine();
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        org.mockito.MockSettings mockSettings2 = genericDeclarationMockSettingsImpl1.verboseLogging();
        java.util.Set<java.lang.Class> classSet3 = genericDeclarationMockSettingsImpl1.getExtraInterfaces();
        java.lang.Object obj4 = genericDeclarationMockSettingsImpl1.getSpiedInstance();
        org.mockito.MockSettings mockSettings5 = genericDeclarationMockSettingsImpl1.serializable();
        injectingAnnotationEngine0.injectMocks((java.lang.Object) mockSettings5);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress7 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener8 = null;
        threadSafeMockingProgress7.setListener(mockingProgressListener8);
        org.mockito.verification.VerificationAfterDelay verificationAfterDelay11 = org.mockito.Mockito.after((long) ' ');
        org.mockito.verification.VerificationMode verificationMode13 = verificationAfterDelay11.atMost(2);
        threadSafeMockingProgress7.verificationStarted((org.mockito.verification.VerificationMode) verificationAfterDelay11);
        injectingAnnotationEngine0.injectMocks((java.lang.Object) verificationAfterDelay11);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress16 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener17 = null;
        threadSafeMockingProgress16.setListener(mockingProgressListener17);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet19 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor20 = hashCodeAndEqualsSafeSet19.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet22 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet19, "");
        boolean boolean24 = hashCodeAndEqualsSafeSet19.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl25 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean26 = hashCodeAndEqualsSafeSet19.contains((java.lang.Object) genericDeclarationMockSettingsImpl25);
        org.mockito.MockSettings mockSettings28 = genericDeclarationMockSettingsImpl25.name("hi!");
        java.lang.String str29 = genericDeclarationMockSettingsImpl25.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl30 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress16, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl25);
        java.util.List<org.mockito.invocation.Invocation> invocationList31 = invocationContainerImpl30.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList32 = invocationContainerImpl30.getStubbedInvocations();
        java.lang.String str33 = invocationContainerImpl30.toString();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList34 = invocationContainerImpl30.getStubbedInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList35 = invocationContainerImpl30.getStubbedInvocations();
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher36 = invocationContainerImpl30.getInvocationForStubbing();
        org.mockito.Answers answers37 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.stubbing.Answer<java.lang.Object> objAnswer38 = answers37.get();
        invocationContainerImpl30.addAnswerForVoidMethod((org.mockito.stubbing.Answer) objAnswer38);
        injectingAnnotationEngine0.injectMocks((java.lang.Object) objAnswer38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet3 and hashCodeAndEqualsSafeSet19.", classSet3.equals(hashCodeAndEqualsSafeSet19) == hashCodeAndEqualsSafeSet19.equals(classSet3));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test36");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.exceptions.Reporter reporter1 = org.mockito.Mockito.spy(reporter0);
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter1.wantedAtMostX((int) '4', (int) (byte) 10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopErrorTest0.test37");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener1 = null;
        threadSafeMockingProgress0.setListener(mockingProgressListener1);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet3 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor4 = hashCodeAndEqualsSafeSet3.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet6 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet3, "");
        boolean boolean8 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl9 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean10 = hashCodeAndEqualsSafeSet3.contains((java.lang.Object) genericDeclarationMockSettingsImpl9);
        org.mockito.MockSettings mockSettings12 = genericDeclarationMockSettingsImpl9.name("hi!");
        java.lang.String str13 = genericDeclarationMockSettingsImpl9.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl14 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl9);
        java.util.List<org.mockito.invocation.Invocation> invocationList15 = invocationContainerImpl14.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList16 = invocationContainerImpl14.getStubbedInvocations();
        java.lang.String str17 = invocationContainerImpl14.toString();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList18 = invocationContainerImpl14.getStubbedInvocations();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress19 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.listeners.MockingProgressListener mockingProgressListener20 = null;
        threadSafeMockingProgress19.setListener(mockingProgressListener20);
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet22 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.util.Iterator<java.lang.Object> objItor23 = hashCodeAndEqualsSafeSet22.iterator();
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet25 = org.mockito.internal.util.Checks.checkItemsNotNull(hashCodeAndEqualsSafeSet22, "");
        boolean boolean27 = hashCodeAndEqualsSafeSet22.contains((java.lang.Object) true);
        org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration> genericDeclarationMockSettingsImpl28 = new org.mockito.internal.creation.MockSettingsImpl<java.lang.reflect.GenericDeclaration>();
        boolean boolean29 = hashCodeAndEqualsSafeSet22.contains((java.lang.Object) genericDeclarationMockSettingsImpl28);
        org.mockito.MockSettings mockSettings31 = genericDeclarationMockSettingsImpl28.name("hi!");
        java.lang.String str32 = genericDeclarationMockSettingsImpl28.getName();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl33 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress19, (org.mockito.mock.MockCreationSettings) genericDeclarationMockSettingsImpl28);
        java.util.List<org.mockito.invocation.Invocation> invocationList34 = invocationContainerImpl33.getInvocations();
        java.util.List<org.mockito.internal.stubbing.StubbedInvocationMatcher> stubbedInvocationMatcherList35 = invocationContainerImpl33.getStubbedInvocations();
        org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory> verificationModeFactoryOngoingStubbingImpl36 = new org.mockito.internal.stubbing.OngoingStubbingImpl<org.mockito.internal.verification.VerificationModeFactory>(invocationContainerImpl33);
        org.mockito.invocation.Invocation invocation37 = null;
        org.mockito.mock.SerializableMode serializableMode38 = org.mockito.mock.SerializableMode.NONE;
        org.mockito.mock.SerializableMode[] serializableModeArray39 = new org.mockito.mock.SerializableMode[] { serializableMode38 };
        java.util.Set<org.mockito.mock.SerializableMode> serializableModeSet40 = org.mockito.internal.util.collections.Sets.newSet(serializableModeArray39);
        java.util.List<org.hamcrest.Matcher> matcherList41 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) serializableModeArray39);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher42 = new org.mockito.internal.invocation.InvocationMatcher(invocation37, matcherList41);
        invocationContainerImpl33.resetInvocationForPotentialStubbing(invocationMatcher42);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl14.setMethodForStubbing(invocationMatcher42);
    }
}

