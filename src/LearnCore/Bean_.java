package LearnCore;

import java.beans.*;
import java.security.SecureRandom;
import java.util.Random;

public class Bean_ {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
//            System.out.println("  " + pd.getReadMethod());
//            System.out.println("  " + pd.getWriteMethod());
        }

        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(100));

//        指定种子 产生的随机数序列都一样
        Random random = new Random(100);
        System.out.println(random.nextInt(100));


        byte n1 = 127;
        short n2 = 100;
//        n2 = n2 + 100; 100为int类型 short+int 最终结果类型提升为int
//        n2 += 100; 等价于 n2 = (short)(n2+100)
        int n3 = 100;
        long n4 = 100;

        char c1 = 200;
        c1 = (char) n1;


        n3 = n1 + n2; // byte short char 三者参与运算 最终结果类型提升为int

        boolean b1 = false;
        float f1 = 1;
        double f2 = 1;
        f1 = f1 + n3;

        Integer[] integer = new Integer[]{1, 2, 3};
        int[] ints = {1, 2, 3};
        Integer[] integers = {1, 2, 3, 4};

        f2 = n4;
//        int i = 127;
//        byte b = (byte) i;
//        System.out.println(b);

        byte b = 125;
        int i = b;
        /*
         *   隐式转换(自动转换) 小空间转大空间
         *   byte->short->int->long->float->double
         *   强制转换  大空间转小空间 会有精度丢失
         *   double->float->long->int->short->byte
         *   布尔值不参与类型转换 即其他类型不能转布尔值  布尔值不能转其他类型
         *   运算符产生的类型转换
         *      1.默认会把结果提升到更高优先级 例如+= 三元运算符  +-/*
         *      2.byte char short 参与运算会将结果提升到int
         **/
    }

}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}