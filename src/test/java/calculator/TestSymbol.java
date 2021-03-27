package calculator;

import org.junit.jupiter.api.Test;

class TestSymbol {
  Symbol sym;
  /**
   * Testing the declaration of an Enum type for the symbol. 
   */
  
  @Test
  void declarationTest() {
    sym = Symbol.TIMES;
  }
}
