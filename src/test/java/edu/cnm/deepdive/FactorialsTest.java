package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialsTest {

  static final int[] nArgs = {
      0,
      1,
      5,
      10,
      13
  };
  static final long[] expectedReturn = {
      1,
      1,
      120,
      3628800,
      6227020800L
  };

  @Test
  void computeRecursive() {
    for (int i = 0; i < nArgs.length; i++) {
      int n = nArgs[i];
      long expected = expectedReturn[i];
      long actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
  }

  @Test
  void computeRecursive_negative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

}