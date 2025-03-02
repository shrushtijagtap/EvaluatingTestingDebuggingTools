/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 03 00:34:12 GMT 2024
 */

package org.traccar.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class EvosuiteWatchProtocolDecoder_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.traccar.protocol.WatchProtocolDecoder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("user.dir", "/Users/strider/Dev/CS527-Project/Bears/Bears-115/Buggy-Version"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/p8/yfnxf01j0zl1djdmz617g_980000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EvosuiteWatchProtocolDecoder_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.channel.ChannelEvent",
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.database.ActiveDevice",
      "org.traccar.helper.PatternBuilder",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.WatchProtocol",
      "org.traccar.model.Message",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.traccar.StringProtocolEncoder",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.traccar.helper.Parser",
      "org.traccar.model.Position",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.channel.ChannelHandler",
      "org.traccar.protocol.WatchProtocolDecoder",
      "org.traccar.model.Extensible",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.traccar.model.Command",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.traccar.Protocol",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.DeviceSession"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EvosuiteWatchProtocolDecoder_ESTest_scaffolding.class.getClassLoader());

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.traccar.ExtendedObjectDecoder",
      "org.traccar.BaseProtocolDecoder",
      "org.traccar.helper.PatternBuilder",
      "org.traccar.protocol.WatchProtocolDecoder",
      "org.traccar.helper.Parser$DateTimeFormat",
      "org.traccar.helper.Parser$CoordinateFormat",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "org.traccar.BaseProtocol",
      "org.traccar.protocol.WatchProtocol",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.traccar.model.Extensible",
      "org.traccar.model.Device",
      "com.ning.http.client.AsyncHttpClient",
      "com.ning.http.client.AsyncHttpClientConfig$Builder",
      "com.ning.http.client.AsyncHttpClientConfigDefaults",
      "com.ning.http.util.MiscUtils",
      "com.ning.http.client.AsyncHttpClientConfig$Builder$1",
      "com.ning.http.client.ProxyServerSelector$1",
      "com.ning.http.client.ProxyServerSelector",
      "com.ning.http.client.AsyncHttpClientConfig",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProvider",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig",
      "com.ning.http.client.providers.netty.NettyAsyncHttpProviderConfig$DefaultNettyWebSocketFactory",
      "com.ning.http.client.providers.netty.handler.DefaultConnectionStrategy",
      "org.jboss.netty.util.internal.SharedResourceMisuseDetector",
      "org.jboss.netty.util.HashedWheelTimer",
      "org.jboss.netty.util.HashedWheelTimer$Worker",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelBucket",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "com.ning.http.client.providers.netty.channel.ChannelManager",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "com.ning.http.client.SSLEngineFactory$DefaultSSLEngineFactory",
      "org.jboss.netty.util.internal.DetectionUtil$1",
      "org.jboss.netty.util.internal.DetectionUtil",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$1",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8$1",
      "com.ning.http.client.providers.netty.chmv8.ConcurrentHashMapV8",
      "com.ning.http.client.providers.netty.channel.pool.DefaultChannelPool$IdleChannelDetector",
      "org.jboss.netty.util.HashedWheelTimer$HashedWheelTimeout",
      "com.ning.http.client.providers.netty.channel.CleanupChannelGroup",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorkerPool",
      "org.jboss.netty.channel.socket.nio.NioWorkerPool",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.socket.nio.AbstractNioBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBossPool",
      "org.jboss.netty.channel.socket.nio.NioClientBoss",
      "org.jboss.netty.channel.socket.nio.NioClientBoss$1",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.Channels$1",
      "com.ning.http.client.providers.netty.request.NettyRequestSender",
      "com.ning.http.client.providers.netty.request.NettyRequestFactory",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "com.ning.http.client.providers.netty.handler.Protocol",
      "com.ning.http.client.providers.netty.handler.HttpProtocol",
      "com.ning.http.client.MaxRedirectException",
      "com.ning.http.client.providers.jdk.JDKAsyncHttpProvider",
      "org.traccar.Context",
      "org.traccar.model.Message",
      "org.traccar.model.Position",
      "org.traccar.model.Command",
      "org.traccar.helper.Parser",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.handler.codec.oneone.OneToOneEncoder",
      "org.traccar.BaseProtocolEncoder",
      "org.traccar.StringProtocolEncoder",
      "org.traccar.protocol.Gps103ProtocolEncoder",
      "org.traccar.protocol.MiniFinderProtocolEncoder",
      "com.cloudhopper.commons.util.NamingThreadFactory",
      "com.cloudhopper.commons.util.Sequencer",
      "org.traccar.TrackerServer",
      "org.traccar.protocol.WatchProtocol$1",
      "org.jboss.netty.bootstrap.ServerBootstrap",
      "org.traccar.GlobalChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.NioServerBossPool",
      "org.jboss.netty.channel.socket.nio.NioServerBoss",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.traccar.protocol.WondexProtocolEncoder",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.local.LocalServerChannelSink$1",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture",
      "org.jboss.netty.channel.group.DefaultChannelGroupFuture$1",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.traccar.protocol.ArknavX8Protocol",
      "org.traccar.database.ActiveDevice",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.ZoneInfoProvider$1",
      "org.joda.time.DateTimeZone$LazyInit$1",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DateTimeZone$LazyInit",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.chrono.LimitChronology",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteTask",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel$WriteRequestQueue",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.channel.AdaptiveReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.socket.nio.DefaultNioSocketChannelConfig",
      "org.traccar.protocol.EnforaProtocolEncoder",
      "org.traccar.protocol.MeitrackProtocolEncoder",
      "org.jboss.netty.channel.SimpleChannelHandler",
      "com.zaxxer.hikari.util.UtilityElf$DefaultThreadFactory",
      "org.traccar.protocol.Pt502ProtocolEncoder",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.traccar.protocol.CarscopProtocol",
      "org.traccar.protocol.SuntechProtocolEncoder",
      "org.traccar.protocol.GranitProtocolSmsEncoder",
      "org.traccar.protocol.Tk103ProtocolEncoder",
      "org.traccar.protocol.PathAwayProtocol",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalDateTime",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.Instant"
    );
  }
}
