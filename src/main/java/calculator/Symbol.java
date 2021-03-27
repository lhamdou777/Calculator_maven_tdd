package calculator;

/**
 * Types of symbols that can be used.
 * 
 * @author zhac333
 *
 */

public enum Symbol {
  /**
   * Left bracket symbol.
   */
  LEFTBRACKET("("),

  /**
   * Right bracket symbol.
   */
  RIGHTBRACKET(")"),

  /**
   * Multiply symbol.
   */
  TIMES("*"),

  /**
   * Division symbol.
   */
  DIVIDE("/"),

  /**
   * Addition symbol.
   */
  PLUS("+"),

  /**
   * Subtraction symbol.
   */
  MINUS("-"),

  /**
   * Invalid input.
   */
  INVALID("");

  /**
   * String that is generated by the parameter in the constructor.
   */
  public final String theSymbol;

  Symbol(String symbol) {
    this.theSymbol = symbol;
  }

  public String toString() {
    return this.theSymbol;
  }

}
