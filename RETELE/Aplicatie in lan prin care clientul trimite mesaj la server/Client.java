package com.self;

import java.io.DataOutputStream;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	try{
        Socket socket=new Socket("192.168.1.37",6666); //ip ul serverului
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Salut server");
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();
    }catch (Exception e){
        System.out.println(e);
    }
    }
}
