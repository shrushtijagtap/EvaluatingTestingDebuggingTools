/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 13:29:18 GMT 2024
 */

package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteStringArrayDeserializer_ESTest extends EvosuiteStringArrayDeserializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        stringArrayDeserializer0.deserializeWithType(jsonParser0, defaultDeserializationContext_Impl0, (TypeDeserializer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = StringArrayDeserializer.instance;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
      JsonParser jsonParser0 = arrayNode0.traverse();
      StringArrayDeserializer stringArrayDeserializer1 = new StringArrayDeserializer(stringArrayDeserializer0);
      StringArrayDeserializer stringArrayDeserializer2 = new StringArrayDeserializer(stringArrayDeserializer1);
      // Undeclared exception!
      try { 
        stringArrayDeserializer2._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = StringArrayDeserializer.instance;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      ObjectMapper objectMapper0 = new ObjectMapper();
      ArrayNode arrayNode0 = objectMapper0.createArrayNode();
      TextNode textNode0 = new TextNode("~");
      arrayNode0.insert(42, (JsonNode) textNode0);
      JsonParser jsonParser0 = arrayNode0.traverse();
      StringArrayDeserializer stringArrayDeserializer1 = new StringArrayDeserializer(stringArrayDeserializer0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        stringArrayDeserializer1._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      ObjectMapper objectMapper0 = new ObjectMapper();
      ArrayNode arrayNode0 = objectMapper0.createArrayNode();
      arrayNode0.insert(42, (JsonNode) null);
      JsonParser jsonParser0 = arrayNode0.traverse();
      StringArrayDeserializer stringArrayDeserializer1 = new StringArrayDeserializer(stringArrayDeserializer0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        stringArrayDeserializer1._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      BigIntegerNode bigIntegerNode0 = BigIntegerNode.valueOf((BigInteger) null);
      ObjectMapper objectMapper0 = new ObjectMapper();
      ArrayNode arrayNode0 = objectMapper0.createArrayNode();
      ArrayNode arrayNode1 = arrayNode0.insert(42, (JsonNode) bigIntegerNode0);
      arrayNode1.insert(42, (JsonNode) bigIntegerNode0);
      ArrayNode arrayNode2 = arrayNode1.addAll(arrayNode0);
      arrayNode2.insert(42, (double) (-373));
      arrayNode0.insert(107, (float) 2537);
      ArrayNode arrayNode3 = arrayNode0.addAll(arrayNode0);
      arrayNode3.insert(12, (-2170.513F));
      JsonParser jsonParser0 = arrayNode3.traverse();
      StringArrayDeserializer stringArrayDeserializer1 = new StringArrayDeserializer(stringArrayDeserializer0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      JsonParserSequence jsonParserSequence0 = JsonParserSequence.createFlattened(jsonParser0, jsonParser0);
      // Undeclared exception!
      try { 
        stringArrayDeserializer1._deserializeCustom(jsonParserSequence0, defaultDeserializationContext_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringArrayDeserializer stringArrayDeserializer0 = StringArrayDeserializer.instance;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      ObjectMapper objectMapper0 = new ObjectMapper();
      NullNode nullNode0 = NullNode.getInstance();
      StringArrayDeserializer stringArrayDeserializer1 = new StringArrayDeserializer(stringArrayDeserializer0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      JsonParser jsonParser0 = objectMapper0.treeAsTokens(nullNode0);
      // Undeclared exception!
      try { 
        stringArrayDeserializer1._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      ObjectMapper objectMapper0 = new ObjectMapper();
      ArrayNode arrayNode0 = objectMapper0.createArrayNode();
      arrayNode0.insert(63, (JsonNode) arrayNode0);
      JsonParser jsonParser0 = arrayNode0.traverse();
      JsonDeserializer<Module> jsonDeserializer0 = (JsonDeserializer<Module>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
      doReturn((Module) null, (Object) null, (Object) null, (Object) null, (Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class) , any(com.fasterxml.jackson.databind.DeserializationContext.class));
      StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer(jsonDeserializer0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      stringArrayDeserializer0._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
      Class<?> class0 = stringArrayDeserializer0.handledType();
      ObjectReader objectReader0 = objectMapper0.reader(class0);
      assertNotNull(objectReader0);
  }
}
