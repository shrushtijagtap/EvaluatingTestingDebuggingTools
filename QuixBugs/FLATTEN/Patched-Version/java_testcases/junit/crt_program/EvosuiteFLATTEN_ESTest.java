/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 02:52:14 GMT 2024
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import correct_java_programs.FLATTEN;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteFLATTEN_ESTest extends EvosuiteFLATTEN_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = FLATTEN.flatten((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(780);
      arrayList0.add(integer0);
      ArrayList arrayList1 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertEquals(1, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
      arrayList0.add((Object) arrayList1);
      ArrayList arrayList2 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertTrue(arrayList2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FLATTEN fLATTEN0 = new FLATTEN();
      Object object0 = FLATTEN.flatten(fLATTEN0);
      assertSame(fLATTEN0, object0);
  }
}
