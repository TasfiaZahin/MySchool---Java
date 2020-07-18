/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.NetworkUtil;

/**
 *
 * @author User
 */
public class LoginReadThread implements Runnable{
    
    private NetworkUtil nc;
    private Thread thr;
    String IdPass[] = new String[100];
    int TotalId ;
    
    public LoginReadThread(NetworkUtil nc) {
        this.nc = nc;
        TotalId = 0;
        LoginInfoFileOpen();
        
        this.thr = new Thread(this);
        thr.start();
    }
    
    
    private void LoginInfoFileOpen()
    {
        String fileName = "LoginInfo.txt";
        String line = null;
        System.out.println("LogIn FIle Open"); 
        int numberOfId = 0;
        
        try 
        {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader(fileName);

            try ( // Always wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) 
                {
                    while ((line = bufferedReader.readLine()) != null)
                    {
                        System.out.println(line);
                        IdPass[numberOfId++] = line ;
                    }
                // Always close files.
                bufferedReader.close() ;
            }         
        } catch (Exception e) {
            System.out.println("Unable to open file : " + e.toString());
        }
        
        for(int i = 0; i < numberOfId ; i++)
        {
            System.out.println(IdPass[i]);
        }
        
        TotalId = numberOfId ;
        
    }

    @Override
    public void run() {
        try{
        String namePass = (String)nc.read();
        FileWriter filewriter = new FileWriter("test.txt") ;
        filewriter.write("yo bro" + namePass ) ;
        filewriter.close() ;
        boolean CanLogIn = false;
        
        for(int i = 0; i < TotalId ; i++)
        {
            if(namePass.equals(IdPass[i]))
            {
                CanLogIn = true;
            }
        }
        if(CanLogIn) nc.write("YES");
        else nc.write("NO");
            
        }catch(Exception e){
            System.out.println("username Checking exception" + e.toString());
        }
        
        try {
            nc.closeConnection();
        } catch (Exception ex) {
            Logger.getLogger(LoginReadThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
