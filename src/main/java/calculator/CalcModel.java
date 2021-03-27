package calculator;

public class CalcModel {
  private Calculator revPolish;
  private Calculator standardCalc;

  /**
   * This evaluate method calculates the value of the entered input.
   * 
   * @param string an expression in infix or postfix form to be calculated.
   * @param infix is a boolean to indicate whether the string input will be infix or postfix.
   * @return a float value representing the result of the calculation.
   */
  public float evaluate(String string, boolean infix) {
    if (infix == true) {
      standardCalc = new StandardCalc();
      return standardCalc.evaluate(string);
    }
    revPolish = new RevPolishCalc();
    return revPolish.evaluate(string);
  }


}
