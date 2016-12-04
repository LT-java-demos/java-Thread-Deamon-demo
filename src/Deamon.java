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


