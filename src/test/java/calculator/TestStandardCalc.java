package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandardCalc {
  StandardCalc standard;

  /**
   * Test 1: firstly i tried to declare a StandardCalc, but was not able to as there was no class
   * called this. I created the class and tried to implement Calculator. Once i did this, my
   * declaration test ran smoothly.
   */
  @BeforeEach
  void declarationTest() {
    standard = new StandardCalc();
  }

  /**
   * Test 2: I tried to call the evaluate method but was not able to as there was no evaluate method
   * in my StandardCalc class. So i tried to Override the evaluate method that was supposed to be in
   * the Calculator interface. once i did this the test passed.
   */
  @Test
  void evaluateTest() {
    standard.evaluate("1+1");
  }

  /**
   * Test 3: I tested to see if my evaluate method would give me the right answer, it was not, so I
   * made changes accordingly so that the evaluate method would give me the right answer, my test
   * then passed.
   */
  @Test
  void correctEvaluateTest() {
    assertEquals(2, standard.evaluate("1+1"));
    assertEquals(4, standard.evaluate("2+3-1"));
  }

}
