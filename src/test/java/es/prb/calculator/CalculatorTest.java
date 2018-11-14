package es.prb.calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @org.junit.Test
  public void sum() {
    assertEquals(5, calculator.sum(2, 3));
  }
}