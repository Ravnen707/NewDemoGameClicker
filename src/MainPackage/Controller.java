package MainPackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    @FXML
    public Button incomeGame;
    @FXML
    public Button hANDm;
    @FXML
    public TextField SearchBar;

    public void searchOnAction(ActionEvent actionEvent) throws Exception {
        String search = SearchBar.getText(); // text fra textfield.
        int numbers = Integer.parseInt(search); // lavet om til en "int".
        switch (numbers) { // Start på Switch.
            case 1:
                Stage oldstage = (Stage) SearchBar.getScene().getWindow();
                oldstage.close();  // lukker gammel scene ned
                Parent root = FXMLLoader.load(getClass().getResource("../IncomeClicker/SceneClick.fxml")); // kalder efter rigtige GUI.
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show(); // Laver en ny Scene.
                break;
            case 2:
                Stage oldstage1 = (Stage) SearchBar.getScene().getWindow();
                oldstage1.close();  // lukker gammel scene ned
                Parent root1 = FXMLLoader.load(getClass().getResource("/ChilasDipo/code/sample.fxml")); // kalder efter rigtige GUI.
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root1));
                stage1.show(); // Laver en ny Scene.
                break;
            case 3:
                Stage oldstage2 = (Stage) SearchBar.getScene().getWindow();
                oldstage2.close(); // lukker gammel scene ned
                Parent root2 = FXMLLoader.load(getClass().getResource("/RiskyInvestor/RiskyInvestor.fxml")); // kalder efter rigtige GUI.
                Stage stage2 = new Stage();
                stage2.setScene(new Scene(root2));
                stage2.show(); // Laver en ny Scene.
                break;
            case 99:
                Stage oldstage99 = (Stage) SearchBar.getScene().getWindow();
                oldstage99.close(); // lukker gammel scene ned
                Parent root99 = FXMLLoader.load(getClass().getResource("/MenuSettings/MenuSettings.fxml")); // kalder efter rigtige GUI.
                Stage stage99 = new Stage();
                stage99.setScene(new Scene(root99));
                stage99.show(); // Laver en ny Scene.
                break;


        }
    }
}

