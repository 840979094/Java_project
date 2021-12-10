package LearnOOP;

public class Static_ {
    public static void main(String[] args) {
        /*
         *   什么操作会触发类加载?
         *   1.直接new操作实例化
         *   2.类调用静态属性或方法
         *   3.子类new操作实例化导致父类信息加载
         *
         *   new 操作实例化对象的过程
         *   无父类
         *       1.触发当前类信息的加载  会初始化静态属性和方法 优先级一样
         *       2.初始化普通属性和方法 优先级一样
         *       3.执行构造器内的语句
         *
         *   有父类
         *       1. 父类信息的初始化 会初始化静态属性和静态方法 优先级一样
         *       2. 子类信息的初始化 会初始化静态属性和静态方法 优先级一样
         *       3. 子类构造函数里隐式调用父类super() 导致父类的构造器执行 父类会先初始化普通属性和方法 再执行父类的构造器内的语句
         *       4. 子类的构造器执行 会先初始化普通属性和方法 再执行子类的构造器内的语句
         * */
        Son son = new Son();
    }
}


class Parent {
    static int num1 = getNum1();
    int num2 = getNum2();

    static {
        System.out.println("我是父类的静态代码块"); // 2
    }

    {
        System.out.println("我是父类的代码块"); // 6
    }

    Parent() {
        System.out.println("我是父类的构造函数"); // 7
    }

    static int getNum1() {
        System.out.println("触发父类getNum1"); // 1
        return 111;
    }

    int getNum2() {
        System.out.println("触发父类getNum2");
        return 222;
    }
}

class Son extends Parent {
    static int num1 = getNum1();
    int num2 = getNum2();

    static {
        System.out.println("我是子类的静态代码块");  // 4
    }

    {
        System.out.println("我是子类的代码块"); // 5
    }


    Son() {
        System.out.println("我是子类的构造函数");
    }

    static int getNum1() {
        System.out.println("触发子类getNum1"); // 3
        return 333;
    }

    int getNum2() {
        System.out.println("触发子类getNum2"); //5
        return 444;
    }


}