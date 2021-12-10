package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_ {
    public static void main(String[] args) {
//        单列集合 可以存放多个不同类型的元素 可重复
//        1.改查高效 基于索引可以快速定位成员 get/set
//        2.增删低效 因为增删成员会导致后续成员都发生位移 所以增删低效 add/remove
        ArrayList<String> strings = new ArrayList<>();
        strings.add("heaven");
        strings.add("666");
        strings.add("heaven");
        strings.add(0, "我是");
        System.out.println(strings.contains("heaven"));

//        删除 返回删除的项
//        System.out.println(strings.remove(1));
//        System.out.println(strings.get(0));
//        System.out.println(strings.indexOf("heaven"));
//        System.out.println(strings);
//        Object clone = strings.clone();

//        增强for循环
//        for (String string : strings) {
//            System.out.println(string);
//        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
