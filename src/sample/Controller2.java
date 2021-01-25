package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Timer;
import java.util.TimerTask;


public class Controller2 {

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
    @FXML
    Label buffLabel1;
    @FXML
    Label buffLabel2;
    @FXML
    Label buffLabel3;



    int buy1 = 1;
    public void initialize() {
        buff.setDisable(true);
        buffFifty.setDisable(true);
        buffFiveH.setDisable(true);
        buffFiveT.setDisable(true);
        buff.setVisible(false);
        buffFifty.setVisible(false);
        buffFiveH.setVisible(false);
        buffFiveT.setVisible(false);
        checkpoints();
    }
    @FXML
    public void clickOnAction(ActionEvent event) {

        if (event.getSource().equals(click1)) {
            int p1 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p1 + buy1));


        } else if (event.getSource().equals(buff)) {
            int p5 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p5 - 5));
            buy1 = buy1 + 5;


        } else if (event.getSource().equals(buffFifty)) {
            int p50 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p50 - 10));
            buy1 = buy1 + 10;


        } else if (event.getSource().equals(buffFiveH)) {
            int p500 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p500 - 100));
            buy1 = buy1 + 100;


        } else if (event.getSource().equals(buffFiveT)) {
            int p5000 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p5000 - 1000));
            buy1 = buy1 + 1000;
        }

        if (Integer.parseInt(point.getText()) < 5 ) {
            buff.setVisible(false);
        } else {
            buff.setDisable(false);
            buff.setVisible(true);
        }

        if (Integer.parseInt(point.getText()) < 49) {
            buffFifty.setVisible(false);
        } else {
            buffFifty.setDisable(false);
            buffFifty.setVisible(true);
        }

        if (Integer.parseInt(point.getText()) < 199) {
            buffFiveH.setVisible(false);
        } else {
            buffFiveH.setDisable(false);
            buffFiveH.setVisible(true);
        }

        if (Integer.parseInt(point.getText()) < 1999) {
            buffFiveT.setVisible(false);
        } else {
            buffFiveT.setDisable(false);
            buffFiveT.setVisible(true);
        }
    }

    public void besked() {
        buffLabel.setText("I cost 5$!");
    }
    public void beskedE() {
        buffLabel.setText("");
    }

    public void besked1() {
        buffLabel1.setText("Go home and sleep");
    }
    public void beskedE1() {
        buffLabel1.setText("");
    }

    public void besked2() {
        buffLabel2.setText("Narh");
    }
    public void beskedE2() {
        buffLabel2.setText("");
    }

    public void besked3() {
        buffLabel3.setText("Narhhhhh Biatch");
    }
    public void beskedE3() {
        buffLabel3.setText("");
    }

    public void loopOnAction() {

                Timer time = new Timer();
                time.scheduleAtFixedRate(new TimerTask() {
                    public void run() {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                        int p = Integer.parseInt(point.getText());
                        point.setText(String.valueOf(p + 5));
                            }
                        });
                    }
                },0,5000);

    }
    public void loopOnAction1(ActionEvent actionEvent) {
        Timer time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        int pp = Integer.parseInt(point.getText());
                        point.setText(String.valueOf(pp + 20));
                    }
                });
            }
        },0,5000);
    }

    public void loopOnAction2(ActionEvent actionEvent) {
        Timer time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        int ppp = Integer.parseInt(point.getText());
                        point.setText(String.valueOf(ppp + 40));
                    }
                });
            }
        },0,5000);
    }

    public void checkpoints(){
        Timer time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        int ppp = Integer.parseInt(point.getText());
                        if (ppp >= 5) {
                            buff.setDisable(false);
                            buff.setVisible(true);}
                        if (ppp >= 50) {
                            buffFifty.setDisable(false);
                            buffFifty.setVisible(true);}
                        if (ppp >= 200) {
                            buffFiveH.setDisable(false);
                            buffFiveH.setVisible(true);}
                        if (ppp >= 2000) {
                            buffFiveT.setDisable(false);
                            buffFiveT.setVisible(true);}
                    }
                });
            }
        },0,500);
        }


}
