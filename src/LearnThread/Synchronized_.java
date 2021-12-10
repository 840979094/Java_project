package LearnThread;

public class Synchronized_ {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread thread = new Thread(ticket);
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread.setName("窗口0");
        thread1.setName("窗口1");
        thread2.setName("窗口2");

        thread.start();
        thread1.start();
        thread2.start();
    }
}

//synchronized 解决了多个线程的竞争问题
//synchronized 锁代码块/普通方法(this)/静态方法(类.class)
//synchronized 可重入锁 线程A在获得锁后 在没有释放锁的情况下 还可以再次获得同样的锁
//synchronized 公平锁 线程A在获取锁后 执行完毕后释放锁  再次和其他线程竞争  线程A有可能再次获取锁
class Ticket implements Runnable {
    public static int count = 100;

    @Override
    public void run() {
        int num = 0;
        while (true) {
            try {
                Thread.sleep(50);
                num++;

                synchronized (this) {
                    if (count <= 0) {
                        System.out.println(Thread.currentThread().getName() + "卖完了,剩余数量" + count + ",共计卖出" + num);
                        break;
                    } else {
                        count--;
                        System.out.println(Thread.currentThread().getName() + "剩余数量" + count);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

