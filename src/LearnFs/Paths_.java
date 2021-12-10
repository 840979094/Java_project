package LearnFs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Paths_ {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\dfg\\Desktop\\images\\unnamed.png";
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";

//      读取指定路径的文件 对应的字节
        System.out.println(Files.readAllBytes(Paths.get(path1)));
//      读取指定路径的文件 每行对应的字符 返回数组
        List<String> strings = Files.readAllLines(Paths.get(path3));
        for (String string : strings) {
            System.out.println(string);
        }
//      Files提供的工具方法 只可以读写小文件 读取大型文件需要用流式读取  每次读取一部分内容
//      Files工具类提供了读写方法 可以方便操作文件和目录

    }
}
