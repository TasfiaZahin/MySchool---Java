
package Server;

import java.net.ServerSocket;
import java.net.Socket;
import util.NetworkUtil;


class LoginChecker implements Runnable{
    
    private ServerSocket serverSocket;
    private Thread th;
    
    LoginChecker(){
        th = new Thread(this);
        th.start();
    }
    
    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(22222);
            while(true)
            {
                Socket clientSocket = serverSocket.accept();
                NetworkUtil nc = new NetworkUtil(clientSocket);
                new LoginReadThread(nc);
            }
            
        } catch (Exception e) {
            System.out.println("Login Checker failed " + e.toString());
        }
    }
    
    
    
}
