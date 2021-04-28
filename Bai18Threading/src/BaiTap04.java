public class BaiTap04 {
    private static int size = 10000;
    static class LazyPrimeFactorization implements Runnable{

        @Override
        public void run() {
            try {
                for (int i = 0; i < size; i++) {
                    if (isPrimeNumber(i)){
                        System.out.println("************");
                        System.out.println(Thread.currentThread().getName()+" chay duoc "+ i);
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        public static boolean isPrimeNumber(int n){
            if (n<2) return false;
            int squareRoot = n/2;
            for (int i = 2; i <= squareRoot; i++) {
                if (n%i==0) return false;
            }
            return true;
        }
    }
    static class OptimizedPrimeFactorization implements Runnable{

        @Override
        public void run() {
            try {
                for (int i = 0; i < size; i++) {
                    if (isPrimeNumber(i)){
                        System.out.println(Thread.currentThread().getName()+" chay duoc "+ i);
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        public static boolean isPrimeNumber(int n){
            if (n<2) return false;
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n%i==0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Runnable target;
        Thread thread1 =new Thread(new LazyPrimeFactorization());
        Thread thread2 =new Thread(new OptimizedPrimeFactorization());

        thread1.setName("Quang");
        thread2.setName("Long");

        thread1.start();
        thread2.start();
    }
}
