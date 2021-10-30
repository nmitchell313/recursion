package edu.cnm.deepdive;

import java.math.BigInteger;

public abstract class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n ==0 ) ? 1 : ( n * computeRecursive(n-1));

  }

  public static BigInteger computeBigIntRecursive(long n) throws IllegalArgumentException {
    if (n < 0)
      throw new IllegalArgumentException();
    return new BigInteger(String.valueOf((n == 0 ? 1 : ( n * computeRecursive((int) (n - 1))))));

  }

//  public static long computeIterative(int n) throws IllegalArgumentException {
//
//  }

}
