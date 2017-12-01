package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller{
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("(k:mm:ss dd/MM/yyyy)");

public int id;
@FXML
    TextField textField;
@FXML
    TextArea chatWindow;


public void textSend(ActionEvent actionEvent){
    sendMgs("You");
    textField.clear();
    textField.requestFocus();
}

public void sendMgs(String str){
    String runText = str+" " + formatForDateNow.format(new Date()) + ">";
    chatWindow.appendText(runText+textField.getText()+"\n");
}

}
