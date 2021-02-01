package MenuSettings;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.control.Button;


import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    public TextArea ShowNr;
    public TextField NrHelp;
    public Button backmenu;


    public ArrayList arrayhelp1() {
    ArrayList<nr1> nrumbers1 = new ArrayList<nr1>();
    nrumbers1.add(new nr1(1, "first try" + "\n" + "does this work?"));

        return nrumbers1;
    }

    public void SearchNr() {
    ArrayList<nr1> Number1 = arrayhelp1();
    NrHelp.setOnKeyPressed(new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent t) {
            if (t.getCode() == KeyCode.ENTER) {
               ShowNr.clear();
                String search = NrHelp.getText(); // text fra textfield.
                int numbers = Integer.parseInt(search); // lavet om til en "int".
               switch (numbers) {
                   case 1:
                       break;
               }
               int total = 0;
               for (nr1 n1 : Number1) {
                   total += n1.tal;
                   System.out.println(n1.tal + " " + nr1.ord + "\n");
                   ShowNr.appendText(n1.tal + " " + n1.ord + "\n");
               }
            }
        }
    });
    }
    public void backMenu(ActionEvent actionEvent) throws IOException {
        Stage oldstage1 = (Stage) backmenu.getScene().getWindow();
        oldstage1.close();  // lukker gammel scene ned
        Parent root1 = FXMLLoader.load(getClass().getResource("/MainPackage/GameMenu.fxml")); // kalder efter rigtige GUI.
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root1));
        stage1.show(); // Laver en ny Scene.
    }

}

