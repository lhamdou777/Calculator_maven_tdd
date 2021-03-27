package calculator;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack class containing the constructor for the stack class and its methods.
 * 
 * @author zhac333
 *
 */
public class MyStack {
  int size;
  List<Entry> entries;

  /**
   * The constructor that is used to create an instance of the stack.
   */
  public MyStack() {
    this.entries = new ArrayList<>();
    this.size = 0;
  }

  /**
   * This method adds entries onto the stack and increments the size of the stack by one.
   * 
   * @param i Is the Entry needed being pushed onto the stack
   */
  public void push(Entry i) {
    this.entries.add(i);
    this.size++;

  }

  /**
   * This method pops an Entry off the stack and decreases the stack by one.
   * 
   * @return a The popped entry.
   */
  public Entry pop() throws EmptyStackException {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    Entry a = this.entries.get(size - 1);
    this.entries.remove(size - 1);
    this.size--;
    return a;
  }

  /**
   * This method shows what entry is at the top off the stack.
   * 
   * @return Entry This returns the entry at the top of the stack.
   */
  public Entry top() throws EmptyStackException {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    return this.entries.get(size - 1);
  }

  /**
   * This method shows how many entries are on the stack.
   * 
   * @return int The representation of the amount of entries on the stack.
   */
  public int size() {
    return this.size;
  }

}
