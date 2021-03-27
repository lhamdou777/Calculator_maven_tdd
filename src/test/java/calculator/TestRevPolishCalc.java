package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRevPolishCalc {
  RevPolishCalc reversePol;

  /**
   * Test 1: firstly i tried to declare a RevPolishCalc, but was not able to as there was no class
   * called this. I created the class and tried to implement Calculator as told to in the class
   * diagram, i was not able to as there was no interface called Calculator, so I created the
   * interface. Once i did this, my declaration test ran smoothly.
   */
  @BeforeEach
  void declarationTest() {
    reversePol = new RevPolishCalc();
  }

  /**
   * Test 2: I tried to call the evaluate method but was not able to as there was no evaluate method
   * in my RevPolishCalc class. So i tried to Override the evaluate method that was supposed to be
   * in the Calculator interface, but was not able to as there was no method in there, so i created
   * the evaluate method in the Calculator interface. once i did this the test passed.
   */
  @Test
  void evaluateTest() {
    reversePol.evaluate("23+1-");
  }

  /**
   * Test 3: I tested to see if my evaluate method would give me the right answer, it was not, so I
   * made changes accordingly so that the evaluate method would give me the right answer, my test
   * then passed.
   */
  @Test
  void correctAnswerEvaluateTest() {
    assertEquals(0, reversePol.evaluate("11-"));
    assertEquals(4, reversePol.evaluate("23+1-"));
  }
}
