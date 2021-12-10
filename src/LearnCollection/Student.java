package LearnCollection;


public class Student {
    public String name;
    public int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return String.format("{%s: score=%d}", name, score);
    }
}



/*
 *  单列集合 List
 *      接口的实现类ArrayList(线程不安全) LinkedList Vector(线程安全)通过索引查询数据
 *      特点:有序 重复
 *  单列集合 Set
 *      接口的实现类HashSet(哈希表) TreeSet(红黑树)
 *      特点:无序 不可重复
 *  多列集合 Map
 *      接口的实现类 HashMap  Hashtable通过key值查询数据
 *      特点:无序 键不可重复(不能存在相同hashCode的键值) 值可重复
 *
 *  多列集合 SortMap   把键值按照比较器的结果存到map中
 *      接口的实现类 TreeMap
 *      特点:有序 键不可重复(不能存在相同hashCode的键值) 值可重复
 *
 *
 *   new ArrayList() 内部步骤
 *       1. elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}
 *   list1.add("heaven")
 *       1. elementData==DEFAULTCAPACITY_EMPTY_ELEMENTDATA
 *       2. 首次扩容取默认容量DEFAULT_CAPACITY=10
 *   list1.add("1")
 *       1. 当前size - elementData.length > 0 不满足该条件 则不扩容
 *       2.满足条件则扩容 规则 10+10>>1
 * Arrays.copyOf(elementData, newCapacity)
 * System.arraycopy(elementData, index, elementData, index + 1,size - index)
 *
 *   new ArrayList(3)  内部步骤
 *       1. elementData = new Object[3] 默认容量是3
 *
 *   list1.add("heaven")
 *       1.当前size - elementData.length > 0 不满足该条件 则不扩容
 *       2.满足条件则扩容 规则 3+3>>1 即newCapacity = oldCapacity + (oldCapacity >> 1)
 *
 *  new LinkedList() 内部步驟
 *      1.first last 静态成员内部类Node 尾插法 每次添加的元素都放在双向链表的最后
 *
 *
 *
 *
 * new HashSet() 内部步骤
 *
 * p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k)))
 *
 * 老hash值和新传过来的hash值  并且老key和新传过来的key值相等  就判断是相同的数据 就不加入到table中
 *
 * */