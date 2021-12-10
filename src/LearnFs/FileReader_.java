package LearnFs;

import java.io.*;

public class FileReader_ {
    public static void main(String[] args) throws IOException {

        String path1 = "C:\\Users\\dfg\\Desktop\\images\\unnamed.png";
        String path2 = "C:\\Users\\dfg\\Desktop\\images\\unnamed2.png";
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";
        String path4 = "C:\\Users\\dfg\\Desktop\\images\\hello2.txt";
//        字符输入流 字符输出流
        FileReader fileReader = new FileReader(path3);
        FileWriter fileWriter = new FileWriter(path4);

        int readLen = 0;
//        控制字符流读取的字符长度
        char[] cs = new char[8];

//        while ((readLen = fileReader.read()) != -1) {
//            System.out.println(readLen);
//            fileWriter.write(readLen);
//        }
        while ((readLen = fileReader.read(cs)) != -1) {
            System.out.println(readLen);
            fileWriter.write(cs, 0, readLen);
        }
        fileReader.close();
        fileWriter.close();
    }
}
