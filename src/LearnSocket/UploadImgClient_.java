package LearnSocket;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UploadImgClient_ {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Socket通信本质是两个进程间的通信

        Socket socket = new Socket(InetAddress.getLocalHost(), 8083);
        System.out.println(socket);
//        图片对应的字节流
        FileInputStream fileInputStream = new FileInputStream("unnamed.png");
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int readLen = 0;
        Thread.sleep(5000);
        while ((readLen = fileInputStream.read(bytes)) != -1) {
            bos.write(bytes, 0, readLen);
        }
        fileInputStream.close();
        bos.close();
//        socket.shutdownOutput();
    }
}
