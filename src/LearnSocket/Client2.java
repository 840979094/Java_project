package LearnSocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8085);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//        立刻写到网络中
        bos.write("hello server".getBytes());
        bos.flush();
        heaven:
        while (true) {
            System.out.print(">>>");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            bos.write(next.getBytes());
            bos.flush();
            System.out.println(next);
//            if (next.equals("bye")) {
//                socket.close();
//                break;
//            }
            byte[] bytes = new byte[1024];
            int readLen = 0;
            while ((readLen = bis.read(bytes)) != -1) {
                String s = new String(bytes, 0, readLen);
                System.out.println(s + " " + readLen);
                if (s.equals("bye")) {
                    bis.close();
                    bos.close();
                    break heaven;
                }
            }
//            bis.close();
//            bos.close();
        }
    }
}
