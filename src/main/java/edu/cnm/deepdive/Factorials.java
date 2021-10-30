package edu.cnm.deepdive;

import java.math.BigInteger;

public abstract class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n ==0 ) ? 1 : ( n * computeRecursive(n-1));

  }

  public static Integer computeBigIntRecursive(BigInteger n) throws IllegalArgumentException {
    if (n < 0)
      throw new IllegalArgumentException();
    return (n == 0 ) ? 1 : ( n * computeRecursive(n - 1));
  return ( n == 0) ? 1 : (n * computeBigIntRecursive(n - 1));

  }

}
