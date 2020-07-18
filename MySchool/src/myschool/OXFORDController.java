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
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author User
 */
public class OXFORDController implements Initializable {
    @FXML
    Button button_log_out;
    @FXML
    Button button_back_university;
    @FXML
    Button button_oxford_cse;
    @FXML
    Button button_oxford_eee;
    @FXML
    Button button_oxford_me;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException
    {
        if(event.getSource()==button_back_university)
        {
            MySchool.window.setScene(MySchool.university);
            
        }
        else if(event.getSource()==button_log_out)
        {
            MySchool.window.setScene(MySchool.login);
        }
        else if(event.getSource()==button_oxford_cse)
        {
            MySchool.window.setScene(MySchool.oxford_cse);
        }
        else if(event.getSource()==button_oxford_eee)
        {
            MySchool.window.setScene(MySchool.oxford_eee);
        }
        else if(event.getSource()==button_oxford_me)
        {
            MySchool.window.setScene(MySchool.oxford_me);
        }
        
    }
    
}
