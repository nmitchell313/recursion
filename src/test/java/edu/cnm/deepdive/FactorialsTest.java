package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FactorialsTest {

  @ParameterizedTest
  @CsvFileSource(resources = "recursive.csv", numLinesToSkip = 1)
  void computeRecursive(int n, long expected) {
    assertEquals(expected, Factorials.computeRecursive(n));
  }

  @Test
  void computeRecursive_negative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "bigint-recursive.csv", numLinesToSkip = 1)
  void computeBigIntRecursive(long n, BigInteger expected) {
    assertEquals(expected, Factorials.computeBigIntRecursive(n));

  }

  @ParameterizedTest
  void computeIterative(int n, long expected) {

  }

}