package edu.cnm.deepdive;

public abstract class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    return (n ==0 ) ? 1 : ( n * computeRecursive(n-1));

  }

  public static long computeBigIntRecursive(long n) throws IllegalArgumentException {
    if (n < 0)
      throw new IllegalArgumentException();
    return (n == 0 ) ? 1 : ( n * computeRecursive((int) (n - 1)));

  }

}
