/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.NetworkUtil;

/**
 *
 * @author saad
 */
public class ServerThread implements Runnable
{
	private Thread thr;
	private NetworkUtil nc;
        String []FromClient = new String[10];
        String Post , ClientName,mark ;
        
	public ServerThread(NetworkUtil nc) 
        {
		this.nc = nc;               
		this.thr = new Thread(this);
		thr.start();
	}
	
        @Override
	public void run() 
        {
            try 
            {
                //System.out.println("OOPReadWriteThreadWOrking..............");
                String StringfromCLient = (String)nc.read();
                System.out.println("stringFromclient is " + StringfromCLient );
                int i = 0 ;
                for (String yo: StringfromCLient.split(":",2))
                {
                    //System.out.println("after split , yo = " + yo);
                    FromClient[i] = yo ;
                    i++ ;
                }
                Post = FromClient[0] ;
                mark = FromClient[1] ;
                System.out.println("Post : " + Post ) ;
                //System.out.println("PostNo : " + PostNo ) ;
                System.out.println("mark : " + mark) ;
                
                if( mark.equals("BCR"))
                {
                    String Post = BCR() ;
                    nc.write( Post);
                }
                else if( mark.equals("BCW"))
                {
                    BCW(Post);
                }        
                else if( mark.equals("BER"))
                {
                    String Post = BER() ;
                    nc.write( Post);
                }
                else if( mark.equals("BEW"))
                {
                    BEW(Post);
                }
                else if( mark.equals("BMR"))
                {
                    String Post = BMR() ;
                    nc.write( Post);
                }
                else if( mark.equals("BMW"))
                {
                    BMW(Post);
                }
                else if( mark.equals("MCR"))
                {
                    String Post = MCR() ;
                    nc.write( Post);
                }
                else if( mark.equals("MCW"))
                {
                    MCW(Post);
                }
                else if( mark.equals("MER"))
                {
                    String Post = MER() ;
                    nc.write( Post);
                }
                else if( mark.equals("MEW"))
                {
                    MEW(Post);
                }
                else if( mark.equals("MMR"))
                {
                    String Post = MMR() ;
                    nc.write( Post);
                }
                else if( mark.equals("MMW"))
                {
                    MMW(Post);
                }
                else if( mark.equals("OCR"))
                {
                    String Post = OCR() ;
                    nc.write( Post);
                }
                else if( mark.equals("OCW"))
                {
                    OCW(Post);
                }
                else if( mark.equals("OER"))
                {
                    String Post = OER() ;
                    nc.write( Post);
                }
                else if( mark.equals("OEW"))
                {
                    OEW(Post);
                }
                else if( mark.equals("OMR"))
                {
                    String Post = OMR() ;
                    nc.write( Post);
                }
                else if( mark.equals("OMW"))
                {
                    OMW(Post);
                }
            } catch(Exception e)
            {
                System.out.println (e);
            }
            try {
                nc.closeConnection();
            } catch (Exception ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
        
        String BCR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Buet_CSE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void BCW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Buet_CSE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        
        String BER() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Buet_EEE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("size of file " + new String( data));
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void BEW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Buet_EEE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
           /* File file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("!!!!!!" + new String( data) + "!!!!!!" );*/
            filewriter.write(NewPost+"\n") ;
            System.out.println(" new post "+ NewPost ) ;
            filewriter.close();   
        }
        
        
        String BMR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Buet_ME.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void BMW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Buet_ME.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String MCR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Mit_CSE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void MCW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Mit_CSE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String MER() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Mit_EEE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void MEW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Mit_EEE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String MMR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Mit_ME.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void MMW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Mit_ME.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String OCR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Oxford_CSE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void OCW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Oxford_CSE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String OER() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Oxford_EEE.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void OEW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Oxford_EEE.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }
        
        String OMR() throws FileNotFoundException, IOException
        {
            System.out.println("???????????????????????????");
            String filename = "Oxford_ME.txt";
            File file ;
            file = new File( filename );
            FileReader filereader = new FileReader(file ) ;
            char data[]=new char[(int)file.length()];
            //System.out.println("data size is now : " + data.length ) ;
            filereader.read(data);
            System.out.println("reading from file" + new String( data) );
            String Post = new String(data) ;
            filereader.close() ;   
            return Post ;
        }

        
        void OMW( String NewPost) throws IOException
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            String filename = "Oxford_ME.txt";
            FileWriter filewriter = new FileWriter(filename,true) ;
            filewriter.write(NewPost+"\n") ;
            System.out.println(" update new post in file "+ NewPost ) ;
            filewriter.close();   
        }

}
