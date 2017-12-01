package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField login;

    @FXML
    PasswordField password;

    @FXML
    VBox globParent;

    public int id;

    public void auth(ActionEvent actionEvent) {
        if(login.getText().hashCode()==2420272&&password.getText().hashCode()==-946852072){
            globParent.getScene().getWindow().hide();
            try {
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Parent root = loader.load();
                Controller lc = (Controller) loader.getController();
                lc.id = 100;
                stage.setTitle("T h e   M a t r i x   h a s   U . . .");
                stage.setScene(new Scene(root, 640, 300));
                //stage.initModality(Modality.APPLICATION_MODAL);
                stage.show();
//          stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }



        }
//        String u=login.getText();
//        String p=password.getText();
        login.clear();
        password.clear();
        login.requestFocus();
        //  System.out.println("User:"+u.hashCode()+"\nPass:"+p.hashCode());
        // System.out.println(login.getText() + " " + password.getText());
        //System.out.println("id = " + id);



    }}
