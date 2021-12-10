package LearnThread;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState1 threadState = new ThreadState1();
        ThreadState2 threadState2 = new ThreadState2();

        System.out.println(threadState.getState());
        threadState.start();
        System.out.println(threadState.getState());

//        threadState2.start();
//        Thread.sleep(1000);
//        threadState.join();
//        threadState2.join();
//        System.out.println(threadState2.getState());
    }
}

class ThreadState1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getState() + "1");
    }
}

class ThreadState2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getState() + "2");
    }
}
/**
 * 线程的生命周期
 * NEW 刚创建
 * RUNNABLE 可运行状态 内部有分为Ready(就绪状态)  Running(运行状态)
 * BLOCKED
 * WAITING
 * TIMED_WAITING 等待状态 此时在执行sleep导致线程休眠
 * TERMINATED 终止状态
 */
