package LearnSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DatagramReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8090);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 8088);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        System.out.println(new String(data, 0, data.length));

    }
}
