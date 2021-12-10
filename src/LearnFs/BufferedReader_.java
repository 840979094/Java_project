package LearnFs;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\dfg\\Desktop\\images\\unnamed.png";
        String path2 = "C:\\Users\\dfg\\Desktop\\images\\unnamed2.png";
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";
        String path4 = "C:\\Users\\dfg\\Desktop\\images\\hello2.txt";
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "utf-8"));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path3),"utf-8"));

        BufferedReader br = new BufferedReader(new FileReader(path3));
        BufferedWriter bw = new BufferedWriter(new FileWriter(path4));

        int readLen = 0;
//        while ((readLen = br.read()) != -1) {
//            System.out.println(readLen);
//            bw.write(readLen);
//        }

        char[] cs = new char[16];
        int lineNum = 0;
        while ((readLen = br.read(cs)) != -1) {
//            System.out.println(readLen);
            bw.write(cs, 0, readLen);
        }
//        String line = "";
//        while ((line = br.readLine()) != null) {
////            System.out.println(++lineNum + line);
//            bw.write(++lineNum + line);
//            bw.newLine();
//        }

        br.close();
        bw.close();
        System.out.println("拷贝结束");

    }
}
