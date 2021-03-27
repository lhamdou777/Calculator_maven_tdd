package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is the junit test class to test the NumStack class.
 * 
 * @author zhac333
 *
 */
class TestNumStack {
  NumStack numberStack;

  /**
   * Test 1: Tried to declare a NumStack but was not able to as there was no NumStack class. I then
   * created the class and the test passed.
   */
  @BeforeEach
  void declarationTest() {
    numberStack = new NumStack();
  }

  /**
   * Test 2: Tried to check the size of the numStack was equal to 0 default. it would not pass as i
   * needed to create a constructor in my NumStack class that uses MyStack to create a stack. Once I
   * done this my test passed.
   */
  @Test
  void sizeTest() {
    assertEquals(0, numberStack.size());
  }

  /**
   * Test 3: Tried to push a number entry onto the number stack but didnt have a push method, so I
   * decided to use inheritance in order to inherit the methods from MyStack class. Once I
   * implemented this, the test passed. There was a further problem, after realising that the class
   * diagram required the push method to take a float as a parameter, i tried to do it and it didnt
   * work, so i created a push method in the NumStack class that took a parameter as a float. The
   * test then passed.
   */
  @Test
  void pushTest() {
    numberStack.push(1);
    assertEquals(1, numberStack.size());
    numberStack.push(2);
    assertEquals(2, numberStack.size());
  }

  /**
   * Test 4: Firstly, i pushed a float onto the NumStack, I then tried to pop the float of the stack
   * to see if it would return the expected number, unfortunately it didnt because i never had a pop
   * method in my NumStack class. So I then added the pop method to the NumStack class, but the
   * number was not removed from the NumStack, so i fixed the problem in the NumStack class, then
   * the test passed.
   */
  @Test
  void popReturnTest() {
    assertThrows(EmptyStackException.class, () -> numberStack.pop());
    numberStack.push(1);
    assertEquals(1, numberStack.pop().getValue());
  }

  /**
   * Test 5: The last test checked if the popped value was returned. this test was to see if the
   * popped entry was removed from the stack, the test ran smoothly with the pop method i had
   * already created.
   */
  @Test
  void popRemoveTest() {
    assertThrows(EmptyStackException.class, () -> numberStack.pop());
    numberStack.push(1);
    assertEquals(1, numberStack.size());
    numberStack.pop();
    assertEquals(0, numberStack.size());
  }


  /**
   * Test 6: I tried to check if the stack is empty using the isEmpty method, but it was not
   * possible as i didnt have an isEmpty method i my NumStack class, once i made one the test
   * passed.
   */
  @Test
  void isEmptyTest() {
    assertEquals(true, numberStack.isEmpty());
  }

}
