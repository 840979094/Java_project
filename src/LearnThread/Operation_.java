package LearnThread;

public class Operation_ {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new TestOperation();
        thread.setName("TestOperation");
//        设置线程成为守护线程   守护线程是为其他线程服务的线程  当所有的非守护线程都结束后 则守护线程也会结束
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(100);
////        中断休眠的thead线程
//        thread.interrupt();

//        等待thread线程8000ms  在8000ms内 若thread线程未执行完 则执行本线程代码  如thread线程已执行完 则执行本线程代码
//        thread.join(1000);
//        System.out.println("main线程的代码");
    }
}

class TestOperation extends Thread {
    @Override
    public void run() {
//        try {
//            Thread.sleep(3000);
//            System.out.println("执行");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        while (!isInterrupted()) {
            System.out.println("while循环");
        }
        System.out.println("线程被挂断了");
//        while (true) {
//            System.out.println("while循环");
//        }
    }
}