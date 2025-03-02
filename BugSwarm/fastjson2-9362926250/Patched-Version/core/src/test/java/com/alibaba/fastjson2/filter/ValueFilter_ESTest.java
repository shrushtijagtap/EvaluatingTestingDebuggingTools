/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 14:40:42 GMT 2024
 */

package com.alibaba.fastjson2.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.function.impl.StringToAny;
import com.alibaba.fastjson2.function.impl.ToBigDecimal;
import com.alibaba.fastjson2.function.impl.ToDouble;
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
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      ValueFilter valueFilter0 = ValueFilter.of("", (Map) hashMap0);
      ToBigDecimal toBigDecimal0 = new ToBigDecimal();
      ValueFilter valueFilter1 = ValueFilter.of("", (Function) toBigDecimal0);
      ValueFilter valueFilter2 = ValueFilter.compose(valueFilter0, valueFilter1);
      assertFalse(valueFilter2.equals((Object)valueFilter1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToBigDecimal toBigDecimal0 = new ToBigDecimal();
      ValueFilter valueFilter0 = ValueFilter.of((String) null, (Function) toBigDecimal0);
      Object object0 = valueFilter0.apply("com.alibaba.fastjson2.JSONPath$ValuesSegment", "min", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ValueFilter valueFilter0 = ValueFilter.of(";@+,B]B}G!>/Uvj", (Function) null);
      Object object0 = new Object();
      Object object1 = valueFilter0.apply(";@+,B]B}G!>/Uvj", "RB+nz0nt2>DlAf`N9N", object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToBigDecimal toBigDecimal0 = new ToBigDecimal();
      ValueFilter valueFilter0 = ValueFilter.of("", (Function) toBigDecimal0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        valueFilter0.apply(object0, "", object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to BigDecimal class java.lang.Object
         //
         verifyException("com.alibaba.fastjson2.function.impl.ToBigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double(0.0);
      ToDouble toDouble0 = new ToDouble(double0);
      ValueFilter valueFilter0 = ValueFilter.of("com.alibaba.fastjson2.JSONPath$NameFilter", (Function) toDouble0);
      Integer integer0 = new Integer(2042);
      // Undeclared exception!
      try { 
        valueFilter0.apply(integer0, "com.alibaba.fastjson2.JSONPath$NameFilter", "com.alibaba.fastjson2.JSONPath$NameFilter");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ValueFilter valueFilter0 = ValueFilter.of(";@+,B]B}G!>/Uvj", (Function) null);
      ValueFilter valueFilter1 = ValueFilter.of((Predicate<String>) null, (Function) null);
      // Undeclared exception!
      try { 
        valueFilter1.apply(valueFilter0, (String) null, "&-2cr\"s");
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
      Class<Integer> class0 = Integer.class;
      StringToAny stringToAny0 = new StringToAny(class0, class0);
      ValueFilter valueFilter0 = ValueFilter.of("", (Function) stringToAny0);
      Integer integer0 = new Integer((-793));
      // Undeclared exception!
      try { 
        valueFilter0.apply(stringToAny0, "", integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson2.function.impl.StringToAny", e);
      }
  }
}
