package LearnSocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8085);
        int count = 0;
        heaven:
        while (true) {
            Socket accept = serverSocket.accept();
            System.out.println("客户端进来了" + ++count);

            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(accept.getOutputStream());
            byte[] bytes = new byte[1024];
            int readLen = 0;


            System.out.println("while开始" + readLen);  // read 方法会阻塞
            while ((readLen = bis.read(bytes)) != -1) {
                String s = new String(bytes, 0, readLen);
                System.out.println(s);

                if (s.equals("bye")) {
                    bis.close();
                    bos.close();
                    accept.close();
                    break heaven;
                }
            }
            System.out.println("while结束" + readLen);

//            bis.close();
//            bos.close();
//            accept.close();
        }

    }
}
