/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 06:42:10 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SUBSEQUENCES_ESTest extends SUBSEQUENCES_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(641, 1, 641);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1789, 50, 1450);
      assertEquals(0, arrayList1.size());
      assertTrue(arrayList1.isEmpty());
      assertTrue(arrayList1.equals((Object)arrayList0));
      assertNotNull(arrayList1);
      assertNotSame(arrayList1, arrayList0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertNotNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 50);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertNotNull(arrayList0);
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 1464);
      assertEquals(0, arrayList1.size());
      assertTrue(arrayList1.isEmpty());
      assertTrue(arrayList1.equals((Object)arrayList0));
      assertNotNull(arrayList1);
      assertNotSame(arrayList1, arrayList0);
      
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(517, 1799, 1799);
      assertEquals(0, arrayList2.size());
      assertTrue(arrayList2.isEmpty());
      assertTrue(arrayList2.equals((Object)arrayList1));
      assertTrue(arrayList2.equals((Object)arrayList0));
      assertNotNull(arrayList2);
      assertNotSame(arrayList2, arrayList1);
      assertNotSame(arrayList2, arrayList0);
      
      ArrayList<ArrayList> arrayList3 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1, 4492, 1);
      assertEquals(0, arrayList3.size());
      assertTrue(arrayList3.isEmpty());
      assertTrue(arrayList3.equals((Object)arrayList2));
      assertTrue(arrayList3.equals((Object)arrayList1));
      assertTrue(arrayList3.equals((Object)arrayList0));
      assertNotNull(arrayList3);
      assertNotSame(arrayList3, arrayList0);
      assertNotSame(arrayList3, arrayList1);
      assertNotSame(arrayList3, arrayList2);
      
      // Undeclared exception!
      SUBSEQUENCES.subsequences((-2677), 0, 276);
  }
}
