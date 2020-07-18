package util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkUtil
{
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
        
        public NetworkUtil()
        {
            
        }
        
	public NetworkUtil(String s,int port) {
		try {
			this.socket=new Socket(s,port);  
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			System.out.println("In NetworkUtil : " + e.toString());
		}
	}

	public NetworkUtil(Socket s) {
		try {
			this.socket = s;
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			System.out.println("In NetworkUtil : " + e.toString());
		}
	}

	public Object read() throws Exception {
		Object o = null;
                
		try {
			o=ois.readObject();
		} catch (Exception e) {
		  //System.out.println("Reading Error in network : " + e.toString());
                    throw e;
		}
		return o;
	}
	
	public void write(Object o) throws IOException {
		try {
			oos.writeObject(o);                        
		} catch (IOException e) {
			//System.out.println("Writing  Error in network : " + e.toString());
                        throw e;
		}
	}

	public void closeConnection() throws Exception {
		try {
			ois.close();
			oos.close();
		} catch (Exception e) {
			//System.out.println("Closing Error in network : "  + e.toString());
                        throw e;
		}
	}

	public Socket getSocket() {
		return this.socket;
	}
}

