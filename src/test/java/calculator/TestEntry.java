package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


/**
 * Tests for the Entry class.
 * 
 * @author zhac333
 *
 */
class TestEntry {
  private Entry entry;
  private Entry secondEntry;


  /**
   * Test 1: Testing the first constructor of Entry. this failed because there was no constructor
   * that takes a float, nor a class called Entry.
   */
  @Test
  void floatConstructorTest() {
    entry = new Entry(4);
  }


  /**
   * Test 2: Testing second constructor of Entry. this failed because there was no constructor that
   * takes a symbol as a parameter.
   */
  @Test
  void symbolConstructorTest() {
    entry = new Entry(Symbol.DIVIDE);
  }

  /**
   * Test 3: This test failed as there was no constructor for the string instance of entry. I
   * created the constructor and the test passed.
   */
  @Test
  void stringConstructorTest() {
    entry = new Entry("abc");
  }


  /**
   * Test 4: Testing the get type function. this failed firstly because there was no getType()
   * function. it then failed a second time because the function was supposed to return a Type but
   * could'nt because there were no variable of type Type, and there was no declaration of the type
   * within the constructors tested.
   */
  @Test
  void getTypeTest() {
    entry = new Entry(5);
    assertEquals(Type.NUMBER, entry.getType());
    entry = new Entry(Symbol.DIVIDE);
    assertEquals(Type.SYMBOL, entry.getType());
    entry = new Entry("string type");
    assertEquals(Type.STRING, entry.getType());
  }


  /**
   * Test 5: The get string function failed as there was no constructor taking a string as a
   * parameter. I created the constructor, then I tried the get string function by creating an
   * instance of entry using a string, then assertEquals to check if the input is equal to the
   * string i used. I also tested if a custom BadTypeException was being thrown, i was prompted to
   * create a custom exception class to handle the error. I did so and past the junit test.
   */
  @Test
  void getStringTest() {
    entry = new Entry(Symbol.DIVIDE);
    assertThrows(BadTypeException.class, () -> entry.getString());
    entry = new Entry("5 * 6");
    assertEquals("5 * 6", entry.getString());
  }


  /**
   * Test 6: This test failed firstly because there was no getSymbol() method. Once i created the
   * getSymbol() method, i checked if it returned the expected Symbol by using assertEquals. i then
   * used the badTypeException() i created in the last test to throw an error if needed.
   */
  @Test
  void getSymbolTest() {
    entry = new Entry(2);
    assertThrows(BadTypeException.class, () -> entry.getSymbol());
    entry = new Entry(Symbol.LEFTBRACKET);
    assertEquals("(", entry.getSymbol().toString());
    entry = new Entry(Symbol.MINUS);
    assertEquals("-", entry.getSymbol().toString());
    entry = new Entry(Symbol.DIVIDE);
    assertEquals("/", entry.getSymbol().toString());
    entry = new Entry(Symbol.PLUS);
    assertEquals("+", entry.getSymbol().toString());
    entry = new Entry(Symbol.TIMES);
    assertEquals("*", entry.getSymbol().toString());
    entry = new Entry(Symbol.RIGHTBRACKET);
    assertEquals(")", entry.getSymbol().toString());
  }


  /**
   * Test 7: This test failed firstly because there was no getSymbol() method. Once i created the
   * getSymbol() method, i checked if it returned the expected Symbol by using assertEquals. i then
   * used the badTypeException() i created in the last test to throw an error if needed.
   */
  @Test
  void getValueTest() {
    entry = new Entry("rfref");
    assertThrows(BadTypeException.class, () -> entry.getValue());
    entry = new Entry(3);
    assertEquals(3, entry.getValue());
  }


  /**
   * Test 8: This test let me run an equals method on an entry but didn't work because I had to
   * generate a new one in the entry class and override the current one. once i did this the test
   * passed.
   */
  @Test
  void equalsTest() {
    entry = new Entry(3);
    secondEntry = new Entry(3);
    assertEquals(true, entry.equals(secondEntry));
    secondEntry = new Entry(Symbol.LEFTBRACKET);
    assertEquals(false, entry.equals(secondEntry));
  }

}
