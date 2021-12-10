package LearnFs;

import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Properties_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
//        字节流 -> 字符流
        properties.load(new BufferedReader(new InputStreamReader(new FileInputStream("user.properties"), "utf-8")));
        System.out.println(properties.getProperty("name"));

        Set<Map.Entry<Object, Object>> entries = properties.entrySet();

        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getValue());
        }

    }
}
