/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 04:32:42 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java_programs.KNAPSACK;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class KNAPSACK_ESTest extends KNAPSACK_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[3][0];
      int[] intArray1 = new int[6];
      intArray1[1] = 808;
      intArray0[0] = intArray1;
      intArray0[1] = intArray0[0];
      intArray0[2] = intArray1;
      int int0 = KNAPSACK.knapsack(1411, intArray0);
      assertEquals(2424, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(2324, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java_programs.KNAPSACK", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2335), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java_programs.KNAPSACK", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[2][4];
      int[] intArray1 = new int[6];
      intArray1[0] = (-1);
      intArray0[1] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(347, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 348
         //
         verifyException("java_programs.KNAPSACK", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[2][4];
      int[] intArray1 = new int[7];
      intArray1[0] = 347;
      intArray0[0] = intArray1;
      // Undeclared exception!
      KNAPSACK.knapsack(3867, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      int int0 = KNAPSACK.knapsack(745, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
  }
}
