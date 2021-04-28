public class BaiTap03 {
    static class OddThread extends Thread{
        @Override
        public void run() {
            for (int i = 1; i < 10; i+=2) {
                try {
                    System.out.println(i);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class EvenThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i+=2) {
                try {
                    System.out.println(i);
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new OddThread());
        Thread thread2 = new Thread(new EvenThread());
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
