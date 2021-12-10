package LearnThread;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread01();
        thread.setName("MyThread01");
        thread.start();


        MyThread02 myThread02 = new MyThread02();
        Thread thread1 = new Thread(myThread02);
        Thread thread2 = new Thread(myThread02);

        thread1.start();
        thread2.start();

    }
}

class MyThread02 implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口的线程" + Thread.currentThread().getName() + "启动");
    }
}

class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类的线程" + Thread.currentThread().getName() + "启动");
    }
}


