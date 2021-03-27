package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {
  OpStack operationStack;

  /**
   * Test 1: Tried to declare a OpStack but was not able to as there was no OpStack class. I then
   * created the class and the test passed.
   */
  @BeforeEach
  void declarationTest() {
    operationStack = new OpStack();
  }

  /**
   * Test 2: Tried to check the size of the OpStack was equal to 0 as default. it would not pass as
   * i needed to create a constructor in my OpStack class that uses MyStack to create a stack. Once
   * I done this my test passed.
   */
  @Test
  void sizeTest() {
    assertEquals(0, operationStack.size());
  }

  /**
   * Test 3: Tried to push a symbol onto the OpStack, but wasnt able to as the push method I
   * inherited from the MyStack class only took Entries as a parameter, so i made a new push method
   * in the OpStack class and the test passed.
   */
  @Test
  void pushTest() {
    operationStack.push(Symbol.LEFTBRACKET);
    assertEquals(1, operationStack.size());
  }

  /**
   * Test 4: In this test i pushed a symbol on the OpStack then checked wether the pop method
   * returned the pushed symbol, it wasnt at first so i had to make a few small changes to the
   * inherited pop method. once i did this the test passed fine.
   */
  @Test
  void popTest() {
    assertThrows(EmptyStackException.class, () -> operationStack.pop());
    operationStack.push(Symbol.LEFTBRACKET);
    assertEquals(Symbol.LEFTBRACKET, operationStack.pop().getSymbol());
    assertEquals(0, operationStack.size());
  }

  void isEmptyTest() {
    assertEquals(true, operationStack.isEmpty());
    operationStack.push(Symbol.LEFTBRACKET);
    assertEquals(false, operationStack.isEmpty());
  }
}
