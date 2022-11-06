package Study.UpFileTreadSocketPool;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        //接收客户端上传的文件，上传之后给客户端反馈
        ServerSocket ss = new ServerSocket(15978);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            //接收客户端的数据
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
//            new Thread(ts).start();
            pool.submit(ts);
        }
//        ss.close();


    }
}
