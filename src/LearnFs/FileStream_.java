package LearnFs;

import java.io.*;

public class FileStream_ {
    public static void main(String[] args) throws IOException {
//      流的分类
//        根据操作单位  分为字节流 字符流
//        根据流的方向 分为输入流 外部设备 文件/网络->内存  输出流 内存到外部设备 文件/网络
//        节点流 包装流/处理流 装饰器模式 其构造函数接受一个节点流 内部封装对节点流的操作方法  为运行期动态添加功能
        String path1 = "C:\\Users\\dfg\\Desktop\\images\\unnamed.png";
        String path2 = "C:\\Users\\dfg\\Desktop\\images\\unnamed2.png";
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello.txt";
        String path4 = "C:\\Users\\dfg\\Desktop\\images\\hello2.txt";
        FileInputStream fileInputStream = new FileInputStream(path3);
        FileOutputStream fileOutputStream = new FileOutputStream(path4);
//        字节输入流  字节输出流
//        FileInputStream fileInputStream = new FileInputStream(path3);
//        FileOutputStream fileOutputStream = new FileOutputStream(path4);
//        方式1 读取单位为一个字节
        int readLen;
//        while ((readLen = fileInputStream.read()) != -1) {
////            System.out.println(readLen);
//            fileOutputStream.write(readLen);
//        }

        
        byte[] bs = new byte[8192];
        long startTime = System.currentTimeMillis(); //获取开始时间
        while ((readLen = fileInputStream.read(bs)) != -1) {
            System.out.println(readLen);
            fileOutputStream.write(bs, 0, readLen);
        }
        long endTime = System.currentTimeMillis(); //获取开始时间

        System.out.println(endTime - startTime); // 1850ms


        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("拷贝结束");
//        字节输入流
//        输出流的flush方法 默认在1.缓冲区写满后 2.close关闭流后 jvm会自动调用flush 把数据输出到设备中


    }
}
