package LearnOOP;

import LearnArray.MyArray;

public class Polymorphic_ {
    int num = 1;
    public static void main(String[] args) {
        Person1 p = new Student1();
        Person1 person1 = new Person1();
        p.run(); // 应该打印Person.run还是Student.run?
        MyArray myArray = new MyArray();
        myArray.aaa();

        AAA aaa = new AAA();

        Student1 student1 = new Student1();
    }
}


class AAA extends MyArray {

}

class Person1 {
    private void fff() {
    }

    void ddd() {
    }

    protected void eee() {
    }

    public void run() {
        System.out.println("Person.run");
    }
}

class Student1 extends Person1 {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}

/*
 *   this   this() 构造器的第一行
 *   super  super() 构造器的第一行
 *   构造器中 this() super()不共存  都需要在第一行
 *
 *   代码块 是构造函数的补充机制 可以把构造函数内可复用的逻辑抽出来放在代码块中
 *
 *   static
 *      静态方法里只能访问静态的成员属性  静态方法里没有this
 *      普通方法里可以访问所有成员属性
 *      静态代码块
 *
 *   final  修饰符
 *     类不能被继承
 *     类方法不能被override
 *     类属性不能被修改 可以在构造器中初始化 因为在实例创建后 属性就不能更改
 *
 *
 *   对象的多态：真正执行时的调用哪个方法取决于其运行类型
 *     编译类型决定可以调用哪些方法   运行类型决定执行哪个对象上的方法
 *
 *   方法的多态 ：
 *       override  继承树下父子类 函数名 参数 返回值 都一样
 *       overload  同类  函数名一样  返回值一样 参数不一样  字符串.indexOf
 *
 *
 *    package 包 包是为了解决类重名的问题而产生的
 *       一个类完整的类名是 包名.类名
 *       同一个包下不能出现同名的类
 *       包作用域??
 *
 *    访问权限修饰符
 *    public      不同包之间 可以访问
 *    projected   在同一个包 基于继承树 子类可以访问父类的projected属性   如果在不同包 即使有继承关系 也不能访问projected属性
 *    package 默认 不同包之间 不能访问  相同包之间才可以访问
 *    private     仅在本类可以访问
 *
 *    不同包 只能访问public  相同包 可以访问public projected 默认
 *
 *    嵌套类  在一个类中定义另外一个类
 *
 * */