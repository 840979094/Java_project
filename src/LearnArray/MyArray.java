package LearnArray;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // 字面量
        int[] arr1 = new int[5]; //构造函数
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        Arrays.sort();
        Parent p = new Son();
        Son s = (Son) p;
        s.trigger();
    }

    public void aaa() {
    }

    protected void bbb() {
    }

    void ccc() {
    }
}


class Parent {
    public String name;

    Parent() {
        this.name = "parent";
    }

    void getX() {
        System.out.println("getX");
    }

    void getName() {
        this.getX();
        System.out.println(this.name);
    }
}

class Son extends Parent {
    public String name;

    Son() {
        super();
        this.name = "son";
    }

    void trigger() {
        this.getName();
    }

    void getX() {
        System.out.println("getParentX");
    }
}


