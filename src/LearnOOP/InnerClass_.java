package LearnOOP;

public class InnerClass_ {
    public static void main(String[] args) {
        //    普通内部类  必须先实例化外部类
        Outer outer = new Outer("heaven");
        Outer.Inner inner = outer.new Inner();
        inner.hello();

        //    静态内部类
        Outer1.Inner inner1 = new Outer1.Inner();
        inner1.hello();

    }
}


class Outer {
    //    普通内部类
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        String name;

        void hello() {
//            设置外部类的属性
            Outer.this.name = "666";
            System.out.println("hello " + name);
        }
    }
}

class Outer1 {
    //    静态内部类
    private String name1;
    private static String name2 = "外部类name2";

    Outer1(String name) {
        this.name1 = name;
    }

    static class Inner {
        void hello() {
//            设置外部类静态属性
//            System.out.println(Outer.this.name1);
            System.out.println(Outer1.name2);
        }
    }
}
