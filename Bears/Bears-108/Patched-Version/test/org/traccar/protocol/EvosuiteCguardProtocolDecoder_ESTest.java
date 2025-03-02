/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 01:21:52 GMT 2024
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetSocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteCguardProtocolDecoder_ESTest extends EvosuiteCguardProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test0()  throws Throwable  {
      CguardProtocol cguardProtocol0 = new CguardProtocol();
      CguardProtocolDecoder cguardProtocolDecoder0 = new CguardProtocolDecoder(cguardProtocol0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(3886);
      try { 
        cguardProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, mockInetSocketAddress0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.net.MockInetSocketAddress cannot be cast to java.lang.String
         //
         verifyException("org.traccar.protocol.CguardProtocolDecoder", e);
      }
  }

  @Test(timeout = 50)
  public void test1()  throws Throwable  {
      CguardProtocol cguardProtocol0 = new CguardProtocol();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(1439);
      CguardProtocolDecoder cguardProtocolDecoder0 = new CguardProtocolDecoder(cguardProtocol0);
      try { 
        cguardProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, "IDRO:/iF-^`lM>XQ2");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocolDecoder", e);
      }
  }

  @Test(timeout = 50)
  public void test2()  throws Throwable  {
      CguardProtocol cguardProtocol0 = new CguardProtocol();
      CguardProtocolDecoder cguardProtocolDecoder0 = new CguardProtocolDecoder(cguardProtocol0);
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("", 296);
      try { 
        cguardProtocolDecoder0.decode(localServerChannel0, inetSocketAddress0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocolDecoder", e);
      }
  }

  @Test(timeout = 50)
  public void test3()  throws Throwable  {
      CguardProtocol cguardProtocol0 = new CguardProtocol();
      CguardProtocolDecoder cguardProtocolDecoder0 = new CguardProtocolDecoder(cguardProtocol0);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("naZa@Ze,I2aF", 1);
      try { 
        cguardProtocolDecoder0.decode((Channel) null, mockInetSocketAddress0, "ID:naZa@Ze,I2aFF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.BaseProtocolDecoder", e);
      }
  }
}
