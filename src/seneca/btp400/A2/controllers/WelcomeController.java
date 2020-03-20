package seneca.btp400.A2.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {

    @FXML
    Button LoginBtn;

    @FXML
    private void LoginAction(ActionEvent event) throws IOException {
        Parent login = FXMLLoader.load(getClass().getResource("../resources/fxml/Login.fxml"));
        Scene loginScene = new Scene(login);

        //get stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}