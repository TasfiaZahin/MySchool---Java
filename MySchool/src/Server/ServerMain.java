/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import javafx.scene.control.TextField;
import util.ClientInfo;
import util.NetworkUtil;

/**
 *
 * @author User
 */
public class ServerMain implements Runnable{

        private ServerSocket ServSock;
	
	ServerMain() 
        {
            new Thread(this).start() ;
        }

    @Override
    public void run()
    {   
        try
            {
                System.out.println("start..........");
		ServSock = new ServerSocket(55555);
		while (true) 
                {
		Socket clientSock = ServSock.accept();
                System.out.println("Conn Successful......");
		NetworkUtil nc=new NetworkUtil(clientSock);
		new ServerThread(nc);
                
		}
            }catch(Exception e)
            {
            System.out.println("Conn failed... "+e);
            }
    }
    public static void main(String[] args) {
            
            new LoginChecker() ;
            new ServerMain();
    }
    
}