package LearnCore;


public class String_ {
    public static void main(String[] args) {
//        new 操作可以创建数组
//        不指定长度  用内容填充
//        String[] strings = new String[]{"H", "E"};
//        指定长度 没有内容填充
//        String[] strings1 = new String[5];
//        System.out.println(strings.length);
//
//
//        String s1 = "hello";
//        String s2 = "hello";
//因为在编译阶段相同的字符串被当作同一个对象放到常量池中
//        System.out.println(s1 == s2); // true
//        System.out.println(s1.equals(s2));
//左右两边返回的都是新的String对象 所以是false
//        System.out.println(s1.toUpperCase() == s2.toUpperCase());
//        System.out.println(Arrays.toString(s1.split("")));
//        System.out.println(String.join("***", s1.split("")));
//        System.out.println(String.format("Hi i am %s,i am %d years old %s", "heaven", 30, "哈哈哈"));

//        静态方法 format  %s %d %f浮点数  %x16进制 join valueOf
//        实例方法 split replace replaceAll isBlank只有空白字符 isEmpty toUpperCase indexOf

//        任意类型转String   1.拼接"" 即可   2.String.valueOf
//        String转任意类型
//          Byte.parseByte("1");
//          Short.parseShort("200");
//          Integer.parseInt("2");
//          Long.parseLong("12.3");
//          Boolean.parseBoolean("true");
//          Float.parseFloat("12.5");
//          Double.parseDouble("12.5");  12.5为double类型  浮点数字面量默认是double类型
//          s1.toCharArray(); String可以转成char[]
//        创建可变对象 预分配缓存区 新增字符时 不会创建新的字符串对象
//        StringBuilder sb = new StringBuilder(1024);
//        StringJoiner sj = new StringJoiner(joiner,start,end) 指定连接符拼接字符串 可以指定字符串的开始和结束位置
//        for (int i = 0; i < 1000; i++) {
//            sb.append(',').append(i);
//        }
//        String s = sb.toString();

//        String s1 = new String("哈哈");
        StringBuffer s2 = new StringBuffer(); // 默认16
        StringBuffer s3 = new StringBuffer("哈哈ha"); //默认16+字符串长度
//
//        s2.append("666");
//        int num = 1;
//        System.out.println(num);
//        StringBuilder s2 = new StringBuilder(); // 默认16
//        StringBuilder s3 = new StringBuilder("哈哈ha"); //默认16+字符串长度

//        s3.append("666666666666666666"); // 扩容规则 *2+2 16 16*2+2=34 34*2+2=70
//        System.out.println(s3.length());

        for (int i = 0; i <= 50; i++) {
            s2.append(1);
        }
    }
}