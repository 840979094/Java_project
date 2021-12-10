package LearnSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChar {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8084);
        Socket accept = serverSocket.accept();
        System.out.println("客户端进来了");

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        int readLen = 0;
        char[] chars = new char[1024];
        while ((readLen = br.read(chars)) != -1) {
//            字符数组传字符串
            System.out.println(new String(chars, 0, readLen));
        }
        br.close();
    }
}
