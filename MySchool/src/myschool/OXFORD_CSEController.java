/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

/*import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import util.NetworkUtil;*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import util.NetworkUtil;
//import util.Reader;
//import util.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author
 */
public class OXFORD_CSEController implements Initializable{

    @FXML
    Button button_log_out;
    @FXML
    Button button_back_oxford;
    @FXML
    Button button_send;
    @FXML
    Button button_see;
    @FXML
    private TextArea Text;
    String msg;
    String sentence;
    String modifiedSentence;
    @FXML
    private TextArea newsfeed;
    
    private String txt = "" ;
    private NetworkUtil connection;

        
    void ShowPosts() throws FileNotFoundException, IOException, Exception
    {
                String serverAddress = "127.0.0.1";
                int serverPort = 55555;
                NetworkUtil nc = new NetworkUtil(serverAddress,serverPort);          
                nc.write("give:OCR");
                String Post = (String)nc.read(); ;
                newsfeed.setText(Post);
       
                System.out.println("news found ");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
           
    }    

    @FXML
    private void Send(ActionEvent event) throws IOException, Exception 
    {
        if(event.getSource()==button_back_oxford)
        {
            MySchool.window.setScene(MySchool.oxford);
            
        }
        else if(event.getSource()==button_log_out)
        {
            MySchool.window.setScene(MySchool.login);
        }
        else if(event.getSource()==button_see)
        {
            newsfeed.setText("");
            ShowPosts();
            
        }
        if(event.getSource()==button_send)
            {
                String Post = Text.getText();
                System.out.println(" newpost is : " +  Post ) ; 
                Text.setText("");
                //newsfeed.setText("");
        //Posts.setText(NewPost);
            String serverAddress = "127.0.0.1";
            int serverPort = 55555;
            NetworkUtil nc = new NetworkUtil(serverAddress,serverPort);  
            String newPost = MySchool.USERNAME +  "---\n" + Post + ":OCW" ;
            nc.write(newPost);
        
            }
        
        }
}
    
     
    
