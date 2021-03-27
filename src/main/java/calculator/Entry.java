package calculator;

/**
 * This is the Entry class for the Calculator program.
 * 
 * @author zhac333
 *
 */


public class Entry {

  float number;
  Symbol symbol;
  Type type;
  String str;


  /**
   * Class constructor that constructs a float instance of Entry.
   * 
   * @param n This is the number that will be used as entry.
   */
  public Entry(float n) {
    this.number = n;
    this.type = Type.NUMBER;
    this.str = null;
    this.symbol = null;
  }


  /**
   * Class constructor that constructs a Symbol instance of Entry.
   * 
   * @param which This is the Symbol that will be used as entry.
   */
  public Entry(Symbol which) {
    this.symbol = which;
    this.type = Type.SYMBOL;
    this.str = null;
  }


  /**
   * Class constructor that constructs a String instance of Entry.
   * 
   * @param s This is the string that will be used as the entry.
   */
  public Entry(String s) {
    this.str = s;
    this.type = Type.STRING;
    this.symbol = null;
  }


  /**
   * This is a getter that gets the type of an Entry.
   * 
   * @return Type The type of Entry.
   */
  public Type getType() {
    return this.type;
  }


  /**
   * This is a getter that gets the string of an Entry.
   * 
   * @return String the input string.
   * @throws BadTypeException if entry type not a string.
   */
  public String getString() throws BadTypeException {
    if (this.str != null) {
      return this.str;
    }
    throw new BadTypeException("Bad Type");
  }


  /**
   * This is a getter that gets the Symbol of an Entry.
   * 
   * @return the input Symbol.
   * @throws BadTypeException if entry type not a symbol.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (this.symbol != null) {
      return this.symbol;
    }
    throw new BadTypeException("Bad Type");
  }


  /**
   * This is a getter that gets the number of an Entry.
   * 
   * @return the input number.
   * @throws BadTypeException if entry type not a number.
   */
  public float getValue() throws BadTypeException {
    if (Float.isNaN(this.number)) {
      throw new BadTypeException("Bad Type");
    }
    return this.number;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(number);
    result = prime * result + ((str == null) ? 0 : str.hashCode());
    result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }



  /**
   * This method indicates whether an entry is equal or not.
   * 
   * @param obj The object to compare with the entry.
   * @return boolean value according to equality of Entry.
   */
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    if (Float.floatToIntBits(number) != Float.floatToIntBits(other.number)) {
      return false;
    }
    if (str == null) {
      if (other.str != null) {
        return false;
      }
    } else if (!str.equals(other.str)) {
      return false;
    }
    if (symbol != other.symbol) {
      return false;
    }
    if (type != other.type) {
      return false;
    }
    return true;
  }
}
