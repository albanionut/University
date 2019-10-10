package com.self;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket=new ServerSocket(6666);
            Socket socket=serverSocket.accept(); //stabilirea conexiunii
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string=dataInputStream.readUTF();
            System.out.println("Clientul spune : "+string);
            serverSocket.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
