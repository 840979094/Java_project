package LearnInterface;


import java.util.Arrays;

public class Lession01 {
    protected int num = 1;

    public static void main(String[] args) {
        B b = new B();
        System.out.println(A.num); //接口.静态属性
        System.out.println(B.num); //实现接口时 会继承接口的静态属性
        System.out.println(b.num); //实例化对象 先访问普通属性 再访问静态属性

        BB bb = new BB();
//        BB.fn3();  //实现接口时 不会继承接口的静态方法??
        bb.fn2(2);

        CC cc = new CC();
        cc.fn2(2);

//        接口多态
//        AA bb1 = new BB();
//
//        AA[] aas = new AA[2];
//        aas[0] = new BB();
//        aas[1] = new CC();
//        System.out.println(Arrays.toString(aas));

    }
}

interface A {
    int num = 1;
}

class B implements A {
//    int num = 2;
}

interface AA {
    //    默认是 public static final
    int num = 1;

    //    默认是 public abstract   类实现该方法时 不能缩小方法的访问权限
    void fn1(int num);


    //  默认是public
    default void fn2(int num) {
        System.out.println("我是接口的默认实现方法");
    }

    //    默认w是public
    static void fn3(int num) {
        System.out.println("我是接口的静态方法");
    }
}


class BB implements AA {
    //    类实现接口的抽象方法时 不能缩小该方法的访问权限
    public void fn1(int num) {
        System.out.println("1");
    }

    @Override
    public void fn2(int num) {
        AA.super.fn2(num);
        System.out.println("哈哈");
    }
}

class CC implements AA {
    //    类实现接口的抽象方法时 不能缩小该方法的访问权限
    public void fn1(int num) {
        System.out.println("2");
    }
}

//一个接口可以继承多个不同的接口

interface DD extends AA, A {

}

//一个类可以实现多个不同的接口

class EE implements AA, A {
    public void fn1(int num) {
        System.out.println("1");
    }
}




