package LearnOOP;

import LearnInterface.Lession01;

public class Modifer_ extends Lession01 {
    public Modifer_(){
        this.num ++;
    }
//    public Modifer_() {
//        Test01 test01 = new Test01();
//
//        System.out.println(test01.num4);
//        System.out.println(test01.num3);
//
//    }
}

class TestParent {
    protected int num = 2;
    protected int num1 = 2;
    int num2 = 2;
}

class Test01 {
    int num3 = 2;
    protected int num4 = 2;
}


