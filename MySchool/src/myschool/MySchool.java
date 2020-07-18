/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import util.NetworkUtil;

/**
 *
 * @author User
 */
public class MySchool extends Application {
    
    public static String USERNAME ;
    public static Stage window;
    public static Scene login,home,university,buet,mit,oxford,buet_cse,buet_me,buet_eee,mit_cse,mit_me,mit_eee;
    public static Scene HOME_READ,UNIVERSITY_READ,MIT_READ,BUET_READ,OXFORD_READ,BUET_CSE_READ,BUET_EEE_READ,BUET_ME_READ,MIT_CSE_READ,MIT_EEE_READ,MIT_ME_READ,OXFORD_CSE_READ,OXFORD_EEE_READ,OXFORD_ME_READ;
    public static Scene oxford_cse,oxford_me,oxford_eee;
    //public static NetworkUtil connection;
   public  MySchool()
    {
        
      //  connection=new NetworkUtil("127.0.0.1",44445);
        
    }
    @Override
    public void start(Stage stage) throws Exception {
        window=stage;
        Parent root1 = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        login = new Scene(root1);
        window.setTitle("MySchool");
        window.setScene(login);
        
        Parent root2 = FXMLLoader.load(getClass().getResource("Home.fxml"));
        home = new Scene(root2);
        
        Parent root3 = FXMLLoader.load(getClass().getResource("University.fxml"));
        university = new Scene(root3);
        
        Parent root4 = FXMLLoader.load(getClass().getResource("BUET.fxml"));
        buet = new Scene(root4);
        
        Parent root5 = FXMLLoader.load(getClass().getResource("MIT.fxml"));
        mit = new Scene(root5);
        
        Parent root6 = FXMLLoader.load(getClass().getResource("OXFORD.fxml"));
        oxford = new Scene(root6);
        
        Parent root7 = FXMLLoader.load(getClass().getResource("BUET_CSE.fxml"));
        buet_cse = new Scene(root7);
        
        Parent root8 = FXMLLoader.load(getClass().getResource("BUET_EEE.fxml"));
        buet_eee = new Scene(root8);
        
        Parent root9 = FXMLLoader.load(getClass().getResource("BUET_ME.fxml"));
        buet_me = new Scene(root9);
        
        Parent root10 = FXMLLoader.load(getClass().getResource("MIT_CSE.fxml"));
        mit_cse = new Scene(root10);
        
        Parent root11 = FXMLLoader.load(getClass().getResource("MIT_EEE.fxml"));
        mit_eee = new Scene(root11);
        
        Parent root12 = FXMLLoader.load(getClass().getResource("MIT_ME.fxml"));
        mit_me = new Scene(root12);
        
        Parent root13 = FXMLLoader.load(getClass().getResource("OXFORD_CSE.fxml"));
        oxford_cse = new Scene(root13);
        
        Parent root14 = FXMLLoader.load(getClass().getResource("OXFORD_EEE.fxml"));
        oxford_eee = new Scene(root14);
        
        Parent root15 = FXMLLoader.load(getClass().getResource("OXFORD_ME.fxml"));
        oxford_me = new Scene(root15);
       
        
        
        Parent root16 = FXMLLoader.load(getClass().getResource("HOME_READ.fxml"));
        HOME_READ = new Scene(root16);
        
        Parent root17 = FXMLLoader.load(getClass().getResource("UNIVERSITY_READ.fxml"));
        UNIVERSITY_READ = new Scene(root17);
        
        Parent root18 = FXMLLoader.load(getClass().getResource("BUET_READ.fxml"));
        BUET_READ = new Scene(root18);
        
        Parent root19 = FXMLLoader.load(getClass().getResource("MIT_READ.fxml"));
        MIT_READ = new Scene(root19);
        
        Parent root20 = FXMLLoader.load(getClass().getResource("OXFORD_READ.fxml"));
        OXFORD_READ = new Scene(root20);
        
        Parent root21 = FXMLLoader.load(getClass().getResource("BUET_CSE_READ.fxml"));
        BUET_CSE_READ = new Scene(root21);
        
        Parent root24 = FXMLLoader.load(getClass().getResource("BUET_EEE_READ.fxml"));
        BUET_EEE_READ = new Scene(root24);
        
        Parent root25 = FXMLLoader.load(getClass().getResource("BUET_ME_READ.fxml"));
        BUET_ME_READ = new Scene(root25);
        
        Parent root26 = FXMLLoader.load(getClass().getResource("MIT_CSE_READ.fxml"));
        MIT_CSE_READ = new Scene(root26);
        
        Parent root27 = FXMLLoader.load(getClass().getResource("MIT_EEE_READ.fxml"));
        MIT_EEE_READ = new Scene(root27);
        
        Parent root28 = FXMLLoader.load(getClass().getResource("MIT_ME_READ.fxml"));
        MIT_ME_READ = new Scene(root28);
        
        Parent root29 = FXMLLoader.load(getClass().getResource("OXFORD_CSE_READ.fxml"));
        OXFORD_CSE_READ = new Scene(root29);
        
        Parent root30 = FXMLLoader.load(getClass().getResource("OXFORD_EEE_READ.fxml"));
        OXFORD_EEE_READ = new Scene(root30);
        
        Parent root31 = FXMLLoader.load(getClass().getResource("OXFORD_ME_READ.fxml"));
        OXFORD_ME_READ = new Scene(root31);
       
        
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
