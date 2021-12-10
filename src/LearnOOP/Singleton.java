package LearnOOP;

public class Singleton {
    public static void main(String[] args) {
//        饿汉式  只要加载类信息 就会创建好实例
//        GirlFriend girlFriend = GirlFriend.getStance();
//        System.out.println(girlFriend);
//        GirlFriend stance = GirlFriend.getStance();
//        System.out.println(stance == girlFriend);

//        懒汉式
        GirlFriend girlFriend = GirlFriend.getInstance();
        GirlFriend girlFriend01 = GirlFriend.getInstance();

    }

    int num = 1;
}

class GirlFriend {
//    饿汉式
//    private static GirlFriend instance = new GirlFriend("啦啦啦");
//    String name;
//
//    //    禁止new操作
//    private GirlFriend(String name) {
//        this.name = name;
//    }
//
//    public static GirlFriend getStance() {
//        return instance;
//    }

    //    懒汉式
    private static GirlFriend instance;

    private GirlFriend(String name) {

    }

    public static GirlFriend getInstance() {
//        判断运行类型
        if (instance instanceof GirlFriend) {
            return instance;
        } else {
            return instance = new GirlFriend("呵呵");
        }
    }

    //    num常量 可以在 三个地方初始化  声明时 静态代码块里 构造函数里
    final int num = 1;


}
