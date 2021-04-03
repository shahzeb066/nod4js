/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksocket;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author Rayan
 */
public class MyClient {
    public static void main(String[] args) {
        try{
            
            Socket s = new Socket("localhost", 786);
            
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            dout.writeUTF("Hello Asad");
            
            dout.flush();
            dout.close();
            s.close();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
