package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    TextField firstField, secondField, resultField;

    @FXML
    TextArea resultsArea;

    @FXML
    ListView<String> mainList;

    ObservableList<String> listData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listData = FXCollections.observableArrayList();
        mainList.setItems(listData);
        firstField.requestFocus();
    }

    public void btnClick(ActionEvent actionEvent) {
        String operation = ((Button) actionEvent.getSource()).getText();
        try {
            float x1 = Float.parseFloat(firstField.getText());
            float x2 = Float.parseFloat(secondField.getText());
            float res = 0.0f;
            firstField.clear();
            secondField.clear();
            switch (operation) {
                case "+":
                    res = x1 + x2;
                    break;
                case "-":
                    res = x1 - x2;
                    break;
                case "*":
                    res = x1 * x2;
                    break;
                case "/":
                    res = x1 / x2;
                    break;
            }
            resultField.setText(String.valueOf(res));
            resultsArea.appendText(String.format("%f %s %f = %f\n", x1, operation, x2, res));
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "WRONG DATA IN VALUES", ButtonType.OK);
            alert.showAndWait();
        }

    }

    public void addNewEntry(ActionEvent actionEvent) {
        listData.add("Entry #" + (listData.size() + 1));
    }

    public void removeSelectedEntry(ActionEvent actionEvent) {
        if (mainList.getSelectionModel().getSelectedIndex() != -1) {
            listData.remove(mainList.getSelectionModel().getSelectedIndex());
        }
    }

    public void testWin(ActionEvent actionEvent) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root = loader.load();
            LoginController lc = (LoginController) loader.getController();
            lc.id = 100;
            stage.setTitle("JavaFX Autorization");
            stage.setScene(new Scene(root, 400, 200));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
