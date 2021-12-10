package LearnCollection;

import java.util.*;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("name", "heaven");
        hashMap.put("age", 30);
        hashMap.put("sex", "male");
        hashMap.put("sex", "female");
        System.out.println(hashMap);

        HashMap<Student, Object> hashMap1 = new HashMap<>();

        hashMap1.put(new Student("Tom", 77), 1);
        hashMap1.put(new Student("Bob", 66), 2);
        hashMap1.put(new Student("Bob", 66), 2);

        hashMap1.put(new Student("Lily", 99), 3);
        System.out.println(hashMap1);
        System.out.println(hashMap1.get(new Student("Bob", 66)));

//        for (String s : hashMap.keySet()) {
//            System.out.println(s);
//        }
//        for (Object value : hashMap.values()) {
//            System.out.println(value);
//        }
//
//        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + "--" + entry.getValue());
//        }

//        Iterator<String> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
//
//        Iterator<Object> iterator1 = hashMap.values().iterator();
//        while (iterator1.hasNext()) {
//            Object next = iterator1.next();
//            System.out.println(next);
//        }
//
//
//        Iterator<Map.Entry<String, Object>> iterator2 = hashMap.entrySet().iterator();
//        while (iterator2.hasNext()) {
//            Map.Entry<String, Object> next = iterator2.next();
//            System.out.println(next.getKey() + "--" + next.getValue());
//        }


    }
}
