/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 08:08:37 GMT 2024
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvosuiteSubLine_ESTest extends EvosuiteSubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D2, vector3D1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      Vector3D vector3D1 = subLine0.intersection(subLine0, true);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Vector3D vector3D2 = new Vector3D((-933.72417), vector3D1, (-933.72417), vector3D1);
      SubLine subLine0 = new SubLine(vector3D2, vector3D0);
      Vector3D vector3D3 = subLine0.intersection(subLine0, true);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      Vector3D vector3D2 = Vector3D.PLUS_I;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      Segment segment0 = new Segment(vector3D1, vector3D0, line0);
      SubLine subLine1 = new SubLine(segment0);
      Vector3D vector3D3 = subLine0.intersection(subLine1, true);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = Vector1D.NaN;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D2 = subLine1.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertEquals(0.0, vector3D2.getZ(), 0.01);
  }
}
