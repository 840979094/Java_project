package LearnCore;

public class Wrapper_ {

    public static void main(String[] args) {
        Integer n = 100; //编译器自动调用 Integer.valueOf(100) 转成Integer   自动装箱 Auto Boxing
        int i = n; // 编辑器自动调用 n.intValue() 转成int 自动拆箱 Auto UnBoxing

        Integer x = 127; // Integer.valueOf(127)
        Integer y = 127;// Integer.valueOf(127)

        System.out.println(x == y); //true 返回两个对象   编译器对于[-128,127]区间的数字  会返回相同的实例对象
        System.out.println(x.equals(y)); // true 比较引用数据的内容是否相同


        Integer x1 = 199999;
        Integer y1 = 199999;
        System.out.println(x1 == y1);
        System.out.println(x1.equals(y1));

        Byte b1 = 1;
        Byte b2 = 1;
        System.out.println(b1 == b2);

        System.out.println(Byte.SIZE);

//        整型和浮点型都继承自Number
    }

}

