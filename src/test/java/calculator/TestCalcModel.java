package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalcModel {
  CalcModel calc;

  /**
   * Test 1: Here I ran a quick declaration test, but was not able to declare the CalcModel as i
   * didnt have that class, i created the class then ran my test and my test passed.
   */
  @BeforeEach
  void declarationTest() {
    calc = new CalcModel();
  }

  /**
   * Test 2: I tried to run an evaluate method on my CalcModel but couldnt as i didnt have a
   * evaluate method in the class i created so i went on to create it. Once i created the evaluate
   * method the test passed.
   */
  @Test
  void evaluateTest() {
    calc.evaluate("2+3-1", true);
  }

  /**
   * Test 3: Here i tested to see if my evaluate method would return the right output while the
   * string was infix and the boolean indicated true meaning the input was infix. it didnt work so i
   * used an if statement in the evaluate method saying if infix was true, the use a StandardCalc
   * instance to evaluate it. Once i did this, my test passed.
   */
  @Test
  void infixTest() {
    assertEquals(4, calc.evaluate("2+3-1", true));
  }

  /**
   * Test 4: Here i tested to see if my evaluate method would return the right output while the
   * string was postfix and the boolean indicated false meaning the input was postfix. it didnt work
   * so i used an if statement in the evaluate method saying if infix was false, then use a
   * RevPolishCalc instance to evaluate it. Once i did this, my test passed.
   */
  @Test
  void postFixTest() {
    assertEquals(63, calc.evaluate("567+*2-", false));
  }

}
