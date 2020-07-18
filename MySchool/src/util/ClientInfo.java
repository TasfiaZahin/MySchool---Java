/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author User
 */
public class ClientInfo {
    public String username;
    public NetworkUtil connection;
    
    public ClientInfo(String user,NetworkUtil conn){
        username=user;
        connection=conn;
    }
    
}