package calculator;

/**
 * StandardCalc class containing the evaluate.
 * 
 * @author zhac333
 *
 */
public class StandardCalc implements Calculator {
  private RevPolishCalc rpCalc = new RevPolishCalc();

  /**
   * The evaluate method overrides the evaluate method from the Calculator interface. It takes a
   * string parameter that is infix, converts it to postfix, the runs RevPolishCalc to calculate the
   * postfix expression.
   * 
   * @param what is the infix string expression.
   */
  @Override
  public float evaluate(String what) {
    char c;
    String output = "";
    StrStack stack = new StrStack();

    for (int i = 0; i < what.length(); i++) {
      c = what.charAt(i);
      if (Character.isLetterOrDigit(c)) {
        output += Character.toString(c);
      } else if (c == '(') {
        stack.push(Character.toString(c));;
      } else {
        while (!stack.isEmpty()) {
          output += stack.pop().getString();
        }
        stack.push(Character.toString(c));
      }
    }
    while (!stack.isEmpty()) {
      output += stack.pop().getString();
    }
    return rpCalc.evaluate(output);
  }
}

