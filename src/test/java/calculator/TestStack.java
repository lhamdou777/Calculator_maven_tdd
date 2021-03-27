package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Tests for the stack class.
 * 
 * @author zhac333
 *
 */
class TestStack {

  MyStack stack;
  Entry entry;
  Entry entryTwo;

  /**
   * Test 1: I firstly tried to declare a stack, it was not possible to as there was no Stack class.
   * I created the stack class after the test, then passed the test.
   */
  @BeforeEach
  void declarationTest() {
    stack = new MyStack();
  }


  /**
   * Test 2: Checking the size of the stack when first declared is 0. Would'nt let me get the size
   * as there was no function to return the size, i used the size attribute of the class stack to
   * check the size. This returned the expected size.
   */
  @Test
  void checkingEmptyStack() {
    assertEquals(0, stack.size);
  }


  /**
   * Test 3: Tried to push an entry into the stack, so i created an instance of entry in the test
   * and tried to push, but it required me to create the push method in my stack class. Once i done
   * that the test passed.
   */
  @Test
  void pushTest() {
    entry = new Entry("5 * 6");
    stack.push(entry);
    assertEquals(1, stack.size());
  }


  /**
   * Test 4: Tried to pop an entry, but it was'nt possible as i never created the pop method in the
   * stack class, so i created it to pass the test and it passed. I then used assertEquals to check
   * if the value of entry was the same that was being popped, it was equal as expected.
   */
  @Test
  void popReturnTest() {
    assertThrows(EmptyStackException.class, () -> stack.pop());
    entry = new Entry(1);
    stack.push(entry);
    assertEquals(1, stack.pop().getValue());
  }

  /**
   * Test 5: the last test checked if the popped value was returned. this test was to see if the
   * popped entry was removed from the stack. When i first checked the size after pushing, the size
   * of stack did not change, so i went to my pop method, and removed whatever was to be popped, and
   * took one away from the size, this fixed my issue.
   */
  @Test
  void popRemoveTest() {
    assertThrows(EmptyStackException.class, () -> stack.pop());
    entry = new Entry("test");
    stack.push(entry);
    assertEquals(1, stack.size);
    stack.pop();
    assertEquals(0, stack.size);
  }


  /**
   * Test 6: Tried to use top method, but didn't allow me as i didn't create it in the stack class.
   * Once i created it, i pushed two entries into the stack then checked if the top of the stack was
   * the value I last pushed, this was successful. so i then checked if the size matched the amount
   * of entries i pushed, and this was also successful.
   */
  @Test
  void topTest() {
    assertThrows(EmptyStackException.class, () -> stack.top());
    entryTwo = new Entry(6);
    entry = new Entry(3);
    stack.push(entry);
    stack.push(entryTwo);
    assertEquals(6, stack.top().getValue());
  }


  /**
   * Test 7: This test was to test to see if it was possible to push different entries onto the
   * stack without any problems, this case passed first time.
   */
  @Test
  void pushDifferentEntriesTest() {
    entry = new Entry(6);
    entryTwo = new Entry("abc");
    stack.push(entry);
    stack.push(entryTwo);
    assertEquals("abc", stack.pop().getString());
    assertEquals(6, stack.pop().getValue());
  }


  /**
   * Test 8: First, I created two entries and pushed them onto the stack. I then checked the size
   * with a size method but it didn't work as there was no size method. I then made the size method
   * and checked if the amount of entries were 2 using assertEquals.The test then passed.
   */
  @Test
  void sizeTest() {
    entryTwo = new Entry(6);
    entry = new Entry(4);
    stack.push(entry);
    stack.push(entryTwo);
    assertEquals(2, stack.size());
  }

}
