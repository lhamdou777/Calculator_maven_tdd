package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * This is the junit test class to test the StrStack class.
 * 
 * @author zhac333
 *
 */
class TestStrStack {
  StrStack stringStack;

  /**
   * Test 1: Tried to declare a StrStack but was not able to as there was no StrStack class. I then
   * created the class and the test passed.
   */
  @BeforeEach
  void declarationTest() {
    stringStack = new StrStack();
  }

  /**
   * Test 2: Tried to check the size of the StrStack was equal to 0 default. it would not pass as i
   * needed to create a constructor in my StrStack class that uses MyStack to create a stack. Once I
   * done this my test passed.
   */
  @Test
  void sizeTest() {
    assertEquals(0, stringStack.size());
  }

  /**
   * Test 3: Tried to push a string entry onto the string stack but didnt have a push method, so I
   * decided to use inheritance in order to inherit the methods from MyStack class. Once I
   * implemented this, the test passed. There was a further problem, after realising that the class
   * diagram required the push method to take a string as a parameter, i tried to do it and it didnt
   * work, so i created a push method in the StrStack class that took a parameter as a number. The
   * test then passed.
   */
  @Test
  void pushTest() {
    stringStack.push("Test");
    assertEquals(1, stringStack.size());
    stringStack.push("Case");
    assertEquals(2, stringStack.size());
  }

  /**
   * Test 4: Firstly, i pushed a string onto the StrStack, I then tried to pop the string of the
   * stack to see if it would return the expected string, unfortunately it didnt because i never had
   * a pop method in my StrStack class. So I then added the pop method to the StrStack class, but
   * the String was not removed from the StrStack, so i fixed the problem in the StrStack class,
   * then the test passed.
   */
  @Test
  void popReturnTest() {
    assertThrows(EmptyStackException.class, () -> stringStack.pop());
    stringStack.push("Test");
    assertEquals("Test", stringStack.pop().getString());
  }
  
  /**
   * Test 5: The last test checked if the popped value was returned. this test was to see if the
   * popped entry was removed from the stack, the test ran smoothly with the pop method i had
   * already created.
   */
  @Test
  void popRemoveTest() {
    assertThrows(EmptyStackException.class, () -> stringStack.pop());
    stringStack.push("Test1");
    assertEquals(1, stringStack.size());
    stringStack.pop();
    assertEquals(0, stringStack.size());
  }
  
  /**
   * Test 6: I tried to check if the stringStack is empty using the isEmpty method, but it was not
   * possible as i didnt have an isEmpty method i my StrStack class, once i made one the test
   * passed.
   */
  @Test
  void isEmptyTest() {
    assertEquals(true, stringStack.isEmpty());
    stringStack.push("Test");
    assertEquals(false, stringStack.isEmpty());
  }
}
