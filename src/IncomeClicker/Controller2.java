package IncomeClicker;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
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
    String ssound = new File("src/money/Cash_Register_Sound_Effect-AudioTrimmer.com.mp3").toURI().toString();
    private MediaPlayer background;
    String ssound1 = new File("src/money/Magic Glitter - Fairy Dust Sound Effect.mp3").toURI().toString();
    public Button backmenu;
    int buy1 = 1;

    public void initialize() { //alt det der sker herinde åbner lige så snart denne stage bliver åbnet.
        buff.setDisable(true);
        buffFifty.setDisable(true);
        buffFiveH.setDisable(true);
        buffFiveT.setDisable(true);
        buff.setVisible(false);
        buffFifty.setVisible(false);
        buffFiveH.setVisible(false);
        buffFiveT.setVisible(false);
        checkpoints();
        Thread thread = new Thread(new Runnable() {
           @Override
            public void run() {
                background = new MediaPlayer(new Media(ssound1));
                background.play();
            }
        });
        thread.start();
    }
    public void muteOnAction(ActionEvent actionEvent) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                background = new MediaPlayer(new Media(ssound1));
                background.setVolume(0);
            }
        });
        thread.start();
    }

    public void unmuteOnAction(ActionEvent actionEvent) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                background = new MediaPlayer(new Media(ssound1));
                background.play();
            }
        });
        thread.start();
    }

    @FXML
    public void clickOnAction(ActionEvent event) {

        if (event.getSource().equals(click1)) {
            int p1 = Integer.parseInt(point.getText());
            point.setText(String.valueOf(p1 + buy1));
            MediaPlayer noise = new MediaPlayer( new Media(ssound));
            noise.play();

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

//        if (Integer.parseInt(point.getText()) < 5 ) { Bruger det ikke længere da det bliver brugt optimalt nede i "checkpoints" thread.
//            buff.setVisible(false);                   Men i starten brugte jeg koden her til at holde styr på knapperne og pointsne.
//        } else {
//            buff.setDisable(false);
//            buff.setVisible(true);
//        }

//        if (Integer.parseInt(point.getText()) < 49) {
//            buffFifty.setVisible(false);
//        } else {
//            buffFifty.setDisable(false);
//            buffFifty.setVisible(true);
//        }

//        if (Integer.parseInt(point.getText()) < 199) {
//            buffFiveH.setVisible(false);
//        } else {
//            buffFiveH.setDisable(false);
//            buffFiveH.setVisible(true);
//        }

//        if (Integer.parseInt(point.getText()) < 1999) {
//            buffFiveT.setVisible(false);
//        } else {
//            buffFiveT.setDisable(false);
//            buffFiveT.setVisible(true);
//        }
    }

    public void besked() {
        buffLabel.setText("I cost 5$!");
    }
    public void beskedE() {
        buffLabel.setText("");
    }

    public void besked1() {
        buffLabel1.setText("I cost 10$!");
    }
    public void beskedE1() {
        buffLabel1.setText("");
    }

    public void besked2() {
        buffLabel2.setText("I cost 100!");
    }
    public void beskedE2() {
        buffLabel2.setText("");
    }

    public void besked3() {
        buffLabel3.setText("I cost 1000$!");
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
                        else {
                        buff.setDisable(true);
                           buff.setVisible(false);}
                        if (ppp >= 50) {
                            buffFifty.setDisable(false);
                            buffFifty.setVisible(true);}
                        else {
                            buffFifty.setDisable(true);
                            buffFifty.setVisible(false);
                        }
                        if (ppp >= 200) {
                            buffFiveH.setDisable(false);
                            buffFiveH.setVisible(true);}
                        else {
                            buffFiveH.setDisable(true);
                            buffFiveH.setVisible(false);
                        }
                        if (ppp >= 2000) {
                            buffFiveT.setDisable(false);
                            buffFiveT.setVisible(true);}
                        else {
                            buffFiveT.setDisable(true);
                            buffFiveT.setVisible(false);
                        }
                    }
                });
            }
        },0,50);
        }

    public void backMenu(ActionEvent actionEvent) throws IOException {
        Stage oldstage1 = (Stage) backmenu.getScene().getWindow();
        oldstage1.close();  // lukker gammel scene ned
        Parent root1 = FXMLLoader.load(getClass().getResource("/sample/GameMenu.fxml")); // kalder efter rigtige GUI.
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root1));
        stage1.show(); // Laver en ny Scene.
        background.stop();
    }
}
