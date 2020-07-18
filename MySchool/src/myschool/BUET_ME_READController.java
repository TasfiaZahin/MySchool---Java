/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class BUET_ME_READController implements Initializable {

    @FXML
    private TextArea show;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showbtn(ActionEvent event){
        String filename="Buet_ME.txt";
        File file = new File(filename);
        StringBuffer contents = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BUET_CSE_READController.class.getName()).log(Level.SEVERE, null, ex);
        }
        String text = null;
        try {
            while ((text = reader.readLine()) != null) {
                contents.append(text).append(System.getProperty("line.separator"));
            }
        } catch (IOException ex) {
            Logger.getLogger(BUET_CSE_READController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(BUET_CSE_READController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(contents.toString());
        show.setText(contents.toString());
        
    }

    @FXML
    private void back(ActionEvent event) {
        show.setText("");
        MySchool.window.setScene(MySchool.BUET_READ);
    }
    
    
}
