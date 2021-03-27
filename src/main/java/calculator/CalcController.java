package calculator;

import com.sun.glass.ui.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
  private static CalcModel model = new CalcModel();

  public Button calculateBtn;
  public Button exitBtn;
  public TextField input;
  public CheckBox checkBx;
  

  public boolean expressionType() {
    if (checkBx.isSelected()) {
      return false;
    } else {
      return true;
    }
  }

  public void calculate() {
    calculateBtn.setOnAction(value -> {
      String s = Float.toString(model.evaluate(input.getText(), expressionType()));
      input.setText(s);
    });
  }
  
  public void leave() {
    exitBtn.setOnAction(value -> {
      System.exit(0);
    });
  }


}
