package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;


public class Controller {
    @FXML
    public Button click1;
    @FXML
    public Button buff;
    @FXML
    public Button buffFifty;
    @FXML
    public Button buffFiveH;
    @FXML
    public Button buffFiveT;
    @FXML
    Label point;
    @FXML
    Label buffLabel;
    int buy1 = 1;
    public void initialize() {
        buff.setDisable(true);
        buffFifty.setDisable(true);
        buffFiveH.setDisable(true);
        buffFiveT.setDisable(true);
    }
@FXML
    public void clickOnAction(ActionEvent event) {

        if (event.getSource().equals(click1)) {
            int p1 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p1 + buy1));


        } else if (event.getSource().equals(buff)) {
            int p5 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p5 - 5));

        } else if (event.getSource().equals(buffFifty)) {
            int p50 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p50 - 10));

        } else if (event.getSource().equals(buffFiveH)) {
            int p500 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p500 - 100));

        } else if (event.getSource().equals(buffFiveT)) {
            int p5000 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p5000 - 1000));
        }

        if (Integer.parseInt(point.getText()) > 5 ) {
            buff.setDisable(false);
            buy1 = 5;

        } else {
            buff.setDisable(true);
        }

        if (Integer.parseInt(point.getText()) > 49) {
            buffFifty.setDisable(false);
            buy1 = 10;
        } else {
            buffFifty.setDisable(true);
        }

        if (Integer.parseInt(point.getText()) > 199) {
            buffFiveH.setDisable(false);
            buy1 = 100;
        } else {
            buffFiveH.setDisable(true);
        }

        if (Integer.parseInt(point.getText()) > 1999) {
            buffFiveT.setDisable(false);
            buy1 = 1000;
        } else {
            buffFiveT.setDisable(true);
        }
    }

    public void besked() {
        buffLabel.setText("I cost ya mom!");

    }

    public void beskedE() {
        buffLabel.setText("");
    }
}