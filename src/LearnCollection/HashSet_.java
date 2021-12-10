package LearnCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ {
    public static void main(String[] args) {
//        单列集合 是value固定的map
//        1.成员不能重复
//        2.无序 因为成员的索引顺序是根据key值得hash计算得到的
//        没有get方法 因为1.set数据不重复的特点 导致get方法获取到成员的的不确定性 2.value值默认是写死的new Object() 获取到也没有意义
//        内部数据结构是 table+双向链表+红黑树
        HashSet<String> strings = new HashSet<>();
        strings.add("heaven");
        strings.add("heaven");
        strings.add("last");
        //增强for
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
