package com.reo.socket;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatService extends Service {
    public ChatService() {
    }

    @Override
    public void onCreate(){
        super.onCreate();
        MainActivity.ServerThread thread = new MainActivity.ServerThread();
        thread.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
    }
//    class ServerThread extends Thread {
//        public void run() {
//            int port = 5001;
//
//            try {
//                ServerSocket server = new ServerSocket(port);
//                Log.d("ServerThread", "서버가 실행됨.");
//
//                while (true){
//                    Socket socket = server.accept();
//                    ObjectInputStream instream =  new ObjectInputStream(socket.getInputStream());
//                    Object input = instream.readObject();
//                    Log.d("ServerThread","input :" + input);
//
//                    ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
//                    outStream.writeObject(input + " from server.");
//                    outStream.flush();
//                    Log.d("ServerThread","output 보냄.");
//
//                    socket.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//
//    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}