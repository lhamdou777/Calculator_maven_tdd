package calculator;

import java.util.EmptyStackException;

/**
 * OpStack class containing the constructor for the OpStack class and its methods.
 * 
 * @author zhac333
 *
 */

public class OpStack extends MyStack {
  private MyStack opStack;

  /**
   * The constructor that is used to create an instance of the OpStack.
   */
  public OpStack() {
    opStack = new MyStack();
  }

  /**
   * This method adds Symbols onto the OpStack and increments the size of the OpStack by one.
   * 
   * @param i Is the Symbol needed to be pushed onto the OpStack
   */
  public void push(Symbol i) {
    Entry e = new Entry(i);
    opStack.push(e);
    this.size++;
  }

  /**
   * This method pops an Symbol off the OpStack and decreases the OpStack size by one.
   * 
   * @return a The popped entry.
   */
  public Entry pop() throws EmptyStackException {
    if (opStack.size == 0) {
      throw new EmptyStackException();
    }
    Entry a = opStack.entries.get(size - 1);
    opStack.entries.remove(size - 1);
    this.size--;
    return a;
  }

  /**
   * This method checks to see wether the OpStack is empty or not.
   * 
   * @return Boolean according to the result of the return statement.
   */
  public boolean isEmpty() {
    return this.size() == 0;
  }
}
