/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 03 01:04:04 GMT 2024
 */

package com.wrapper.spotify.requests.data.player;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.wrapper.spotify.SpotifyHttpManager;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteStartResumeUsersPlaybackRequest_ESTest extends EvosuiteStartResumeUsersPlaybackRequest_ESTest_scaffolding {

  @Test(timeout = 50)
  public void test00()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("Source byte array");
      startResumeUsersPlaybackRequest_Builder0.setScheme("Source byte array");
      JsonArray jsonArray0 = new JsonArray(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      StartResumeUsersPlaybackRequest startResumeUsersPlaybackRequest0 = startResumeUsersPlaybackRequest_Builder1.build();
      Integer integer0 = new Integer(0);
      startResumeUsersPlaybackRequest_Builder1.position_ms(integer0);
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }

  @Test(timeout = 50)
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("t9jbf#i q#~ _X0%6(8");
          JsonObject jsonObject0 = new JsonObject();
          StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.offset(jsonObject0);
          StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.device_id("t9jbf#i q#~ _X0%6(8");
          JsonArray jsonArray0 = new JsonArray();
          JsonArray jsonArray1 = jsonArray0.deepCopy();
          StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder3 = startResumeUsersPlaybackRequest_Builder2.uris(jsonArray1);
          StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder4 = startResumeUsersPlaybackRequest_Builder3.context_uri("t9jbf#i q#~ _X0%6(8");
          StartResumeUsersPlaybackRequest startResumeUsersPlaybackRequest0 = startResumeUsersPlaybackRequest_Builder4.build();
          // Undeclared exception!
          try { 
            startResumeUsersPlaybackRequest0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"200.42.42.0:443\" \"connect,resolve\")
             // java.lang.Thread.getStackTrace(Thread.java:1564)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkConnect(SecurityManager.java:1051)
             // java.net.Socket.connect(Socket.java:602)
             // org.apache.http.conn.ssl.SSLConnectionSocketFactory.connectSocket(SSLConnectionSocketFactory.java:339)
             // org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142)
             // org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:373)
             // org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:381)
             // org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:237)
             // org.apache.http.impl.client.cache.CachingExec.callBackend(CachingExec.java:592)
             // org.apache.http.impl.client.cache.CachingExec.execute(CachingExec.java:269)
             // org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:185)
             // org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)
             // org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:111)
             // org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)
             // org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)
             // com.wrapper.spotify.SpotifyHttpManager.execute(SpotifyHttpManager.java:223)
             // com.wrapper.spotify.SpotifyHttpManager.put(SpotifyHttpManager.java:193)
             // com.wrapper.spotify.requests.AbstractRequest.putJson(AbstractRequest.java:145)
             // com.wrapper.spotify.requests.data.player.StartResumeUsersPlaybackRequest.execute(StartResumeUsersPlaybackRequest.java:37)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:750)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 50)
  public void test02()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("6Nf28i|a2EX^Ka[");
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.context_uri("6Nf28i|a2EX^Ka[");
      startResumeUsersPlaybackRequest_Builder1.context_uri("/v1/me/player/play");
      StartResumeUsersPlaybackRequest startResumeUsersPlaybackRequest0 = startResumeUsersPlaybackRequest_Builder0.build();
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest0.execute();
        fail("Expecting exception: ThreadDeath");
      
      } catch(ThreadDeath e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 50)
  public void test03()  throws Throwable  {
      String string0 = null;
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder((String) null);
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.context_uri((String) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test04()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("Yybl{.1RU{qbb(-j");
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("Yybl{.1RU{qbb(-j", (Number) null);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.offset(jsonObject0);
      assertSame(startResumeUsersPlaybackRequest_Builder1, startResumeUsersPlaybackRequest_Builder0);
      
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Yybl{.1RU{qbb(-j");
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.context_uri((String) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test05()  throws Throwable  {
      String string0 = null;
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder((String) null);
      int int0 = 259;
      Integer integer0 = new Integer(259);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.position_ms(integer0);
      JsonArray jsonArray0 = null;
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.uris((JsonArray) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test06()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("Source byte array");
      JsonArray jsonArray0 = new JsonArray(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      StartResumeUsersPlaybackRequest startResumeUsersPlaybackRequest0 = startResumeUsersPlaybackRequest_Builder1.build();
      assertNotNull(startResumeUsersPlaybackRequest0);
      
      JsonArray jsonArray1 = null;
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.uris((JsonArray) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test07()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("Yybl{.1RU{qbb(-j");
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("Yybl{.1RU{qbb(-j", (Number) null);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.offset(jsonObject0);
      Integer integer0 = new Integer((-2084));
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.position_ms(integer0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test08()  throws Throwable  {
      String string0 = "c4v6PjpF\\";
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("c4v6PjpF");
      Integer integer0 = Integer.valueOf((-470));
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.position_ms(integer0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test09()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("9\"c{,%22OEK(>{Kf");
      JsonObject jsonObject0 = new JsonObject();
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.offset(jsonObject0);
      JsonArray jsonArray0 = new JsonArray(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.uris(jsonArray0);
      Integer integer0 = new Integer(73);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder3 = startResumeUsersPlaybackRequest_Builder2.position_ms(integer0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder4 = startResumeUsersPlaybackRequest_Builder3.device_id("O;}ATAhApp>h;S=US[");
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder5 = startResumeUsersPlaybackRequest_Builder4.uris(jsonArray0);
      assertSame(startResumeUsersPlaybackRequest_Builder4, startResumeUsersPlaybackRequest_Builder5);
  }

  @Test(timeout = 50)
  public void test10()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder(".");
      Integer integer0 = null;
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.position_ms((Integer) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test11()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("n\u0007` C`kly`3$Bu0n.");
      startResumeUsersPlaybackRequest_Builder0.device_id("n\u0007` C`kly`3$Bu0n.");
      startResumeUsersPlaybackRequest_Builder0.setPathParameter("n\u0007` C`kly`3$Bu0n.", "n\u0007` C`kly`3$Bu0n.");
      SpotifyHttpManager.Builder spotifyHttpManager_Builder0 = new SpotifyHttpManager.Builder();
      SpotifyHttpManager spotifyHttpManager0 = new SpotifyHttpManager(spotifyHttpManager_Builder0);
  }

  @Test(timeout = 50)
  public void test12()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("Source byte array");
      JsonArray jsonArray0 = new JsonArray(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      startResumeUsersPlaybackRequest_Builder1.build();
      Integer integer0 = new Integer(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.position_ms(integer0);
      assertSame(startResumeUsersPlaybackRequest_Builder2, startResumeUsersPlaybackRequest_Builder0);
  }

  @Test(timeout = 50)
  public void test13()  throws Throwable  {
      String string0 = "";
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("");
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.position_ms((Integer) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test14()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("u:");
      JsonArray jsonArray0 = new JsonArray();
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      JsonObject jsonObject0 = new JsonObject();
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.offset(jsonObject0);
      int int0 = 0;
      Integer integer0 = new Integer(0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder3 = startResumeUsersPlaybackRequest_Builder2.position_ms(integer0);
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder3.context_uri("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test15()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder((String) null);
      String string0 = null;
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.device_id((String) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test16()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder((String) null);
      JsonArray jsonArray0 = new JsonArray(5136);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.device_id((String) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test17()  throws Throwable  {
      String string0 = "";
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("");
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.context_uri("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test18()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("-T@yqx2");
      JsonArray jsonArray0 = new JsonArray();
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.uris(jsonArray0);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.context_uri("-T@yqx2");
      int int0 = 59;
      Integer integer0 = new Integer(59);
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder3 = startResumeUsersPlaybackRequest_Builder2.position_ms(integer0);
      String string0 = "";
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder3.device_id("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test19()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("QH}m5ORa");
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.context_uri("3!MB");
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder2 = startResumeUsersPlaybackRequest_Builder1.device_id("9OA(B9w");
      StartResumeUsersPlaybackRequest startResumeUsersPlaybackRequest0 = startResumeUsersPlaybackRequest_Builder2.build();
      assertNotNull(startResumeUsersPlaybackRequest0);
  }

  @Test(timeout = 50)
  public void test20()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("oY'Fn");
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder1 = startResumeUsersPlaybackRequest_Builder0.context_uri(" is not Comparable");
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder1.device_id("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test21()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("");
      // Undeclared exception!
      try { 
        startResumeUsersPlaybackRequest_Builder0.offset((JsonObject) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 50)
  public void test22()  throws Throwable  {
      StartResumeUsersPlaybackRequest.Builder startResumeUsersPlaybackRequest_Builder0 = new StartResumeUsersPlaybackRequest.Builder("q%'");
      Integer integer0 = new Integer(0);
      startResumeUsersPlaybackRequest_Builder0.setPort(integer0);
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.getAsJsonObject("R^,#i}z~FD b");
      // Undeclared exception!
      try { 
        jsonObject0.getAsString();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // JsonObject
         //
         verifyException("com.google.gson.JsonElement", e);
      }
  }
}
