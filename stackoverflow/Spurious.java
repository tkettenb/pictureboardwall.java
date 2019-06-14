package stackoverflow;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Spurious {
  public static void main(String[] args) {
    Thread t = Thread.currentThread();
    Thread interruptor = new Thread(() -> {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.interrupted();
        e.printStackTrace();
      }
      t.interrupt();
    });

    interruptor.start();
    // rock'n'roll

    Lock lock = new ReentrantLock();
    Condition cond = lock.newCondition();
    lock.lock();
    try {
      try {
        cond.await();
        System.out.println("Spurious wakeup!");
      } catch (InterruptedException ex) {
        System.out.println("Just a regular interrupt.");
      }
    } finally {
      lock.unlock();
    }
  }
}