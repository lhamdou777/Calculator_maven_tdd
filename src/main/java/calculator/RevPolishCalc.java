package calculator;

/**
 * /** RevPolishCalc class containing the evaluate method for the RevPolishCalc.
 * 
 * @author zhac333
 *
 */
public class RevPolishCalc implements Calculator {
  private NumStack values;

  /**
   * This method evaluates a string that is already in postfix form, and calculates the answer.
   * @param what is the string already in postfix form. 
   */
  @Override
  public float evaluate(String what) {
    values = new NumStack();
    float x = 0;
    float y = 0;
    char[] ch = what.toCharArray();
    
    for (char c : ch) {
      if (c >= '0' && c <= '9') {
        values.push((float) (c - '0'));
      } else {
        y = values.pop().getValue();
        x = values.pop().getValue();

        if (c == Symbol.PLUS.theSymbol.charAt(0)) {
          values.push(x + y);
        } else if (c == Symbol.MINUS.theSymbol.charAt(0)) {
          values.push(x - y);
        } else if (c == Symbol.TIMES.theSymbol.charAt(0)) {
          values.push(x * y);
        } else if (c == Symbol.DIVIDE.theSymbol.charAt(0)) {
          values.push(x / y);
        }

      }
    }
    return values.pop().getValue();
  }
}
