package LearnFs;

import java.io.*;
import java.util.Arrays;

public class ObjectStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path3 = "C:\\Users\\dfg\\Desktop\\images\\hello1.txt";
//        序列化:保存数据的值和类型
//        反序列化:读取数据的值和类型
//        必须是实现Serializable(空接口 标记接口)/Externalizable接口的类才可以被序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path3));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path3));

        oos.writeInt(100);
        oos.writeChar('h');
        oos.writeChar('e');
        oos.writeUTF("heaven");
        oos.writeBoolean(false);
        oos.writeObject(new Dog("heaven", 28));
        oos.close();

        System.out.println(ois.readInt());
        System.out.println(ois.readChar());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readObject());
        ois.close();


//        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {
////            output.writeInt(12345);
//            output.writeUTF("Hello");
////            output.writeObject(Double.valueOf(123.456));
//        }
//        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}

class Dog implements Serializable {
    public String name;
    public Number age;

    public Dog(String name, Number age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}