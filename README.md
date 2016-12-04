#java-Thread-Deamon-demo

进程要等到所有线程都终止后才结束，即使主线程结束，只要还有子线程活动，进程也会一直运行，如果将线程标示为守护线程，则无需等待此线程就可以结束程序运行。


必须在启动线程前，通过 `setDeamon` 方法将线程设置成守护线程。

##Demo
创建一个守护线程不停地打印星号（*），但只要主线程结束，守护线程就会自动停止。


```java
class DeamonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.print("*");
        }
    }
}

public class Deamon extends Thread {
    public static void main(String[] args) throws InterruptedException {
        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true); //将线程设置成守护线程
        Thread.sleep(2000);
        deamonThread.start();
    }
}
```