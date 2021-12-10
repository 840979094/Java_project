package LearnCollection;

import java.util.Hashtable;

public class hashTable_ {
    public static void main(String[] args) {
//        线程安全 和hashMap类似
        Hashtable<String, Object> hashTable = new Hashtable<>();
        hashTable.put("name", "heaven");
        hashTable.put("age", 30);
        hashTable.put("sex", "male");
        System.out.println(hashTable);

    }
}
