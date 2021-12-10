package LearnFs;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream_ {
    public static void main(String[] args) throws IOException {

//        ZipInputStream zip = new ZipInputStream(new FileInputStream(path1));
//        ZipEntry entry = null;
//        while ((entry = zip.getNextEntry()) != null) {
//            String name = entry.getName();
//            System.out.println(name);
//        }

        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";
        String path4 = "C:\\Users\\dfg\\Desktop\\images\\hello2.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path3), "gbk"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path4), "utf8"));


        String line = "";
        int lineNum = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
//            System.out.println(++lineNum + line);
            bw.write(++lineNum + line);
            bw.newLine();
        }
        br.close();
        bw.close();
        System.out.println("拷贝结束");

    }

}
