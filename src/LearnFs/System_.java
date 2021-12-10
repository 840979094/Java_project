package LearnFs;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class System_ {
    public static void main(String[] args) throws IOException {
//        System.in 编译类型是InputStream  运行类型是BufferedInputStream 默认设备是键盘
//        System.out 编译类型是PrintStream 运行类型是PrintStream 默认设备是控制台
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\..\\hello1.txt";

//        设置System.out输出流的初始位置  默认是在控制台  现在设置成外部文件
//        System.setOut(new PrintStream(path3));
//        System.out.println("哈哈");

//        设置System.in的初始位置 默认是键盘  现在设置成外部文件
//        System.setIn(new FileInputStream(path3));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner.next());


        File file = new File("./");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getCanonicalFile());
//        System.out.println(file.getPath());
//        System.out.println(File.separator);
//        保留路径
        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file.list()));

        Path p1 = Paths.get(".", "project", "study"); // 构造一个Path对象
        System.out.println(p1.toAbsolutePath().normalize().toFile().isDirectory());
        System.out.println(p1.toAbsolutePath());


    }
}
