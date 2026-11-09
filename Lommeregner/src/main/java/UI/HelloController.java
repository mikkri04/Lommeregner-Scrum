package UI;

import BLL.handler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label result;

    handler handler = new handler();

    @FXML
    protected void onHelloButtonClick() {
        result.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onBtnClickPlus() {
        result.setText(handler.addUnit(result.getText(), "+"));
    }

    @FXML
    protected void onBtnClickMinus() {
        result.setText(handler.addUnit(result.getText(), "-"));
    }

    @FXML
    protected void onBtnClickDivide() {
        result.setText(handler.addUnit(result.getText(), "/"));
    }

    @FXML
    protected void onBtnClickMultiply() {
        result.setText(handler.addUnit(result.getText(), "*"));
    }

    @FXML
    protected void onBtnClickPercantage() {
        result.setText(handler.addUnit(result.getText(), "%"));
    }

    @FXML
    protected void onBtnClickOne() {
        result.setText(handler.addUnit(result.getText(), "1"));
    }

    @FXML
    protected void onBtnClickTwo() {
        result.setText(handler.addUnit(result.getText(), "2"));
    }

    @FXML
    protected void onBtnClickThree() {
        result.setText(handler.addUnit(result.getText(), "+3"));
    }

    @FXML
    protected void onBtnClickFour() {
        result.setText(handler.addUnit(result.getText(), "4"));
    }

    @FXML
    protected void onBtnClickFive() {
        result.setText(handler.addUnit(result.getText(), "5"));
    }

    @FXML
    protected void onBtnClickSix() {
        result.setText(handler.addUnit(result.getText(), "6"));
    }

    @FXML
    protected void onBtnClickSeven() {
        result.setText(handler.addUnit(result.getText(), "7"));
    }

    @FXML
    protected void onBtnClickEight() {
        result.setText(handler.addUnit(result.getText(), "8"));
    }

    @FXML
    protected void onBtnClickNine() {
        result.setText(handler.addUnit(result.getText(), "9"));
    }



}
