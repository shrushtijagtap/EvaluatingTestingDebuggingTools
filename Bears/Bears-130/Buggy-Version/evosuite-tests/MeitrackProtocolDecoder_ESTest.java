/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 03:23:12 GMT 2024
 */

package org.traccar.protocol;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.SocketAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalClientChannelFactory;
import org.jboss.netty.channel.local.LocalChannel;
import org.junit.runner.RunWith;
import org.traccar.protocol.MeitrackProtocol;
import org.traccar.protocol.MeitrackProtocolDecoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeitrackProtocolDecoder_ESTest extends MeitrackProtocolDecoder_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test0()  throws Throwable  {
      MeitrackProtocol meitrackProtocol0 = new MeitrackProtocol();
      MeitrackProtocolDecoder meitrackProtocolDecoder0 = new MeitrackProtocolDecoder(meitrackProtocol0);
      try { 
        meitrackProtocolDecoder0.decode((Channel) null, (SocketAddress) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.traccar.protocol.MeitrackProtocolDecoder", e);
      }
  }

  @Test(timeout = 50)
  public void test1()  throws Throwable  {
      MeitrackProtocol meitrackProtocol0 = new MeitrackProtocol();
      MeitrackProtocolDecoder meitrackProtocolDecoder0 = new MeitrackProtocolDecoder(meitrackProtocol0);
      DefaultLocalClientChannelFactory defaultLocalClientChannelFactory0 = new DefaultLocalClientChannelFactory();
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      LocalChannel localChannel0 = defaultLocalClientChannelFactory0.newChannel(defaultChannelPipeline0);
      try { 
        meitrackProtocolDecoder0.decode(localChannel0, (SocketAddress) null, defaultChannelPipeline0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jboss.netty.channel.DefaultChannelPipeline cannot be cast to org.jboss.netty.buffer.ChannelBuffer
         //
         verifyException("org.traccar.protocol.MeitrackProtocolDecoder", e);
      }
  }
}
