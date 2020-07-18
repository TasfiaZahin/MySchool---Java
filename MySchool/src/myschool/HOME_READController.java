/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class HOME_READController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @FXML
    Hyperlink hyperlink_university;
    @FXML
    Hyperlink hyperlink_log_out;
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
         if(event.getSource()==hyperlink_log_out)
        {
            MySchool.window.setScene(MySchool.login);
            
        }
         else if(event.getSource()==hyperlink_university)
        {
           MySchool.window.setScene(MySchool.UNIVERSITY_READ);
            
        }
    }
    
}
