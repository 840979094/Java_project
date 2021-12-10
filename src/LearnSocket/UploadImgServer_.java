package LearnSocket;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadImgServer_ {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8083);
        Socket accept = serverSocket.accept();

        System.out.println("客户端进入");
        //获得网络设备的输入流 并包装成处理流/包装流
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        FileOutputStream fileOutputStream = new FileOutputStream("img.png");
        byte[] bytes = new byte[1024];
        int readLen = 0;
        System.out.println("while开始" + readLen);  // read 方法会阻塞
        while ((readLen = bis.read(bytes)) != -1) {
//            System.out.println(readLen);
            fileOutputStream.write(bytes, 0, readLen);
        }
        System.out.println("while结束" + readLen);
        bis.close();
        fileOutputStream.close();
    }
}
