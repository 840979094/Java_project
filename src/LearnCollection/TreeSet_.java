package LearnCollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
//        ? super E
//      按照指定的顺序插入元素到set中
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                升序排列
                return o2.score - o1.score;
            }
        });

        treeSet.add(new Student("heaven", 90));
        treeSet.add(new Student("6666", 85));
        treeSet.add(new Student("小明", 80));
        System.out.println(treeSet);


//        String类实现了Comparable 所以不需要传入
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("heaven", 90));
        hashSet.add(new Student("6666", 85));
        hashSet.add(new Student("小明", 80));
        System.out.println(hashSet);

    }
}


