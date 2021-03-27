package calculator;

import java.util.EmptyStackException;

/**
 * StrStack class containing the constructor for the StrStack class and its methods.
 * 
 * @author zhac333
 *
 */
public class StrStack extends MyStack {
  private MyStack stringStack;

  /**
   * The constructor that is used to create an instance of the StrStack.
   */
  public StrStack() {
    stringStack = new MyStack();
  }

  /**
   * This method pushes strings onto the NumStack and increments the size of the StrStack by one.
   * 
   * @param i Is the string needed to be pushed onto the NumStack
   */
  public void push(String i) {
    Entry string = new Entry(i);
    stringStack.push(string);
    this.size++;
  }

  /**
   * This method pops an string off the StrStack and decreases the StrStack size by one.
   * 
   * @return a The popped entry.
   */
  public Entry pop() throws EmptyStackException {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    Entry a = stringStack.entries.get(size - 1);
    stringStack.entries.remove(size - 1);
    this.size--;
    return a;
  }

  /**
   * This method checks to see whether the StrStack is empty or not.
   * 
   * @return Boolean according to the result of the return statement.
   */
  public boolean isEmpty() {
    return this.size == 0;
  }
}
