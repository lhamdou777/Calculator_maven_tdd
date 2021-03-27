package calculator;

import java.util.EmptyStackException;

/**
 * NumStack class containing the constructor for the NumStack class and its methods.
 * 
 * @author zhac333
 *
 */

public class NumStack extends MyStack {
  private MyStack numStack;

  /**
   * The constructor that is used to create an instance of the stack.
   */
  public NumStack() {
    numStack = new MyStack();
  }

  /**
   * This method adds floats onto the NumStack and increments the size of the NumStack by one.
   * 
   * @param i Is the float needed to be pushed onto the NumStack
   */
  public void push(float i) {
    Entry number = new Entry(i);
    numStack.push(number);
    this.size++;
  }

  /**
   * This method pops an float off the NumStack and decreases the NumStack size by one.
   * 
   * @return a The popped entry.
   */
  public Entry pop() throws EmptyStackException {
    if (numStack.size == 0) {
      throw new EmptyStackException();
    }
    Entry a = numStack.entries.get(size - 1);
    numStack.entries.remove(size - 1);
    this.size--;
    return a;
  }

  /**
   * This method checks to see wether the NumStack is empty or not.
   * 
   * @return Boolean according to the result of the return statement.
   */
  public boolean isEmpty() {
    return this.size() == 0;
  }
}
