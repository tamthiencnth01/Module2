public class BaiTap02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+" in duoc so " +i);
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable target;
        Thread thread1 = new Thread(new BaiTap02());
        Thread thread2 = new Thread(new BaiTap02());

        thread1.setName("Quang");
        thread2.setName("Long");
//        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread1.setPriority(Thread.MIN_PRIORITY);
//        thread2.setPriority(Thread.MAX_PRIORITY);
//        thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread1.join();
        thread2.start();

    }
}
