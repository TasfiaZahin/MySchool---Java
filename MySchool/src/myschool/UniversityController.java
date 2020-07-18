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
public class UniversityController implements Initializable {
    @FXML
    Button button_buet;
    @FXML
    Button button_mit;
    @FXML
    Button button_oxford;
    @FXML
    Button button_back_home;
    @FXML
    Button button_university_log_out;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
         /*if(event.getSource()==hyperlink_log_out)
        {
            MySchool.window.setScene(MySchool.login);
            
        }*/
         if(event.getSource()==button_back_home)
        {
            MySchool.window.setScene(MySchool.home);
            
        }
        else if(event.getSource()==button_university_log_out)
        {
            MySchool.window.setScene(MySchool.login);
        }
        else if(event.getSource()==button_buet)
        {
            MySchool.window.setScene(MySchool.buet);
        }
        else if(event.getSource()==button_mit)
        {
            MySchool.window.setScene(MySchool.mit);
        }
        else if(event.getSource()==button_oxford)
        {
            MySchool.window.setScene(MySchool.oxford);
        }
    }
}
