package Lession.TCPFileThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(65534);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                5,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()

        );

        while (true){
            Socket socket = ss.accept();//等待客户端链接
            ThreadSocket threadSocket = new ThreadSocket(socket);
            pool.submit(threadSocket);
//            new Thread(threadSocket).start();
        }
//        ss.close();
    }
}
