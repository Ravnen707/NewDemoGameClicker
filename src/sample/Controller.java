package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.io.IOException;


public class Controller {
    @FXML
    public Button incomeGame;
    @FXML
    public Button hANDm;
    @FXML
    public Button setting;
    @FXML
    public TextField SearchBar;

    public void searchOnAction(ActionEvent actionEvent) throws Exception {
        String search = SearchBar.getText(); // text fra textfield.
        int numbers = Integer.parseInt(search); // lavet om til en "int".
        switch (numbers) { // Start på Switch.
            case 1:
                Stage oldstage = (Stage) SearchBar.getScene().getWindow();
                oldstage.close();
                Parent root = FXMLLoader.load(getClass().getResource("SceneClick.fxml")); // kalder efter rigtige GUI.
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show(); // Laver en ny Scene.
                break;
            case 2:

                break;
            case 3:
                break;
        }
    }

    public void incomeOnAction(ActionEvent actionEvent) {
    }
    @FXML
    public void helpOnAction() {
    }
    @FXML
    public void settingOnAction() {
    }




//    Parent root = FXMLLoader.load(getClass().getResource("SceneClick.fxml")); // kalder efter rigtige GUI.
//    Stage stage = new Stage();
//        stage.setScene(new Scene(root));
//        stage.show();



}

