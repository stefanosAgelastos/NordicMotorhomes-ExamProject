package view;

import databaseConnection.Staff;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Employee;

import java.beans.EventHandler;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    Employee actor;
    @FXML
    Button signInButton;
    @FXML
    TextField signInTextField;
    @FXML
    PasswordField signInPasswordField;
    @FXML

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Staff staff= new Staff();

    }

    public Employee signIn(Event event){
                actor=staff.
    }
}
