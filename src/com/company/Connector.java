package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by aaron on 4/6/2017.
 */
public class Connector {
     public Socket getClientSocket(){
         try {
             ServerSocket serverSocket = new ServerSocket(8080);
             return serverSocket.accept();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return null;
     }
}
