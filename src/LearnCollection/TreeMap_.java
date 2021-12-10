package LearnCollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {

        TreeMap<Student, Object> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.score - o1.score;
            }
        });
        treeMap.put(new Student("heaven", 90), "heaven");
        treeMap.put(new Student("6666", 85), 30);
        treeMap.put(new Student("小明", 80), "male");
        System.out.println(treeMap);


        HashMap<Student, Object> hashMap = new HashMap<>();
        hashMap.put(new Student("heaven", 90), "heaven");
        hashMap.put(new Student("6666", 85), 30);
        hashMap.put(new Student("小明", 80), "male");
        System.out.println(hashMap);
    }
}
