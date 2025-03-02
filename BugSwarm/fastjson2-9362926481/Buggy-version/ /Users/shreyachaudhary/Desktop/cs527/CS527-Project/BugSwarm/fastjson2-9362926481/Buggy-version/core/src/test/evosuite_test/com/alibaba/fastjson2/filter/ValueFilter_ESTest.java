/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:45:01 GMT 2024
 */

package com.alibaba.fastjson2.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.function.impl.StringToAny;
import com.alibaba.fastjson2.function.impl.ToBigDecimal;
import com.alibaba.fastjson2.function.impl.ToBigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ValueFilter_ESTest extends ValueFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      ValueFilter valueFilter0 = ValueFilter.of("XM'a?{_}{lR 9ex", (Map) hashMap0);
      Class<Integer> class0 = Integer.class;
      StringToAny stringToAny0 = new StringToAny(class0, (Object) null);
      ValueFilter valueFilter1 = ValueFilter.of("..", (Function) stringToAny0);
      ValueFilter valueFilter2 = ValueFilter.compose(valueFilter0, valueFilter1);
      assertFalse(valueFilter2.equals((Object)valueFilter0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ValueFilter valueFilter0 = ValueFilter.of("", (Function) null);
      Object object0 = valueFilter0.apply("", "=eh1mVBT;~Z", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToBigDecimal toBigDecimal0 = new ToBigDecimal();
      ValueFilter valueFilter0 = ValueFilter.of("between", (Function) toBigDecimal0);
      Object object0 = valueFilter0.apply("between", "", valueFilter0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToBigInteger toBigInteger0 = new ToBigInteger();
      ValueFilter valueFilter0 = ValueFilter.of("", (Function) toBigInteger0);
      ValueFilter valueFilter1 = ValueFilter.compose(valueFilter0, valueFilter0);
      Integer integer0 = new Integer(43);
      // Undeclared exception!
      try { 
        valueFilter1.apply("", "", integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to BigInteger class java.math.BigInteger
         //
         verifyException("com.alibaba.fastjson2.function.impl.ToBigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToBigDecimal toBigDecimal0 = new ToBigDecimal();
      ValueFilter valueFilter0 = ValueFilter.of("between", (Function) toBigDecimal0);
      // Undeclared exception!
      try { 
        valueFilter0.apply("between", "between", "");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ValueFilter valueFilter0 = ValueFilter.compose((ValueFilter) null, (ValueFilter) null);
      // Undeclared exception!
      try { 
        valueFilter0.apply((Object) null, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson2.filter.ValueFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Predicate<String> predicate0 = Predicate.isEqual((Object) "");
      Predicate<String> predicate1 = predicate0.negate();
      Class<Object> class0 = Object.class;
      StringToAny stringToAny0 = new StringToAny(class0, predicate0);
      ValueFilter valueFilter0 = ValueFilter.of(predicate1, (Function) stringToAny0);
      // Undeclared exception!
      try { 
        valueFilter0.apply("", "$VALUES", stringToAny0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson2.function.impl.StringToAny cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson2.function.impl.StringToAny", e);
      }
  }
}
