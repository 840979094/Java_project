package LearnSocket;


import java.io.IOException;
import java.net.*;

public class DatagramSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8088);

        byte[] bytes = "hello receivers".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 8090);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
