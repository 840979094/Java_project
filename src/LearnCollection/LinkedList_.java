package LearnCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
//        单列集合  改查高效  可以获取/添加 头部或尾部 增删高效
//        1.改查低效 根据索引查找 内部要从头遍历链表从而找到对应位置的成员
//        2.增删高效 因为内部是双向链表 所以增删成员不会导致其他成员的位置变化

        LinkedList<String> strings = new LinkedList<>();
        strings.add("heaven");
        strings.add("heaven");
        strings.add(0, "1 am");
        strings.add("666");
//        System.out.println(strings.get(1));
//        System.out.println(strings.getFirst());
//        System.out.println(strings.getLast());

        strings.addFirst("first");
        strings.addLast("last");
//        System.out.println(strings);
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
