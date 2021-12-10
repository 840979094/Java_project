package LearnFs;

import java.io.*;
import java.security.DigestInputStream;

public class BufferedStream_ {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\dfg\\Desktop\\images\\unnamed.png";
        String path2 = "C:\\Users\\dfg\\Desktop\\images\\unnamed2.png";
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";
        String path4 = "C:\\Users\\dfg\\Desktop\\images\\hello2.txt";
//        字节输入包装流 字节输出包装流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));

//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path3));

        int readLen = 0;
//        while ((readLen = bis.read()) != -1) {
//            System.out.println(readLen);
//            bos.write(readLen);
//        }
        byte[] bs = new byte[8192];
        long startTime = System.currentTimeMillis(); //获取开始时间
        while ((readLen = bis.read(bs)) != -1) {
//            System.out.println(readLen);
            bos.write(bs, 0, readLen);
        }
        long endTime = System.currentTimeMillis(); //获取开始时间


//        String line = "";
//        while ((line = br.readLine()) != null) {
////            System.out.println(++lineNum + line);
//            bw.write(++lineNum + line);
//            bw.newLine();
//        }
        System.out.println(endTime - startTime); // 25ms

        bis.close();
        bos.close();
        System.out.println("拷贝结束");


    }
}
// 字节流必须关闭  字符流不需要关闭?