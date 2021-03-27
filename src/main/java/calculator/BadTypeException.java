package calculator;

/**
 * This is the bad type exception class what is thrown when the getter methods in the entry class
 * are used on the wrong type of entry.
 * 
 * 
 * @author zhac333
 *
 */
public class BadTypeException extends IllegalArgumentException {

  private static final long serialVersionUID = 1L;

  /**
   * Constructor that constructs the exception.
   * 
   * @param errorMessage is the string returned to alert the user the excpetion has been thrown.
   */
  public BadTypeException(String errorMessage) {
    super(errorMessage);
  }
}
