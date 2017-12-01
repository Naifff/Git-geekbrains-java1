package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

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
