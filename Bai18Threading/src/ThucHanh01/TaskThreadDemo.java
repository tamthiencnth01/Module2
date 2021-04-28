package ThucHanh01;

public class TaskThreadDemo {
    static class PrintNum implements Runnable{
        private int lastNum;
        public PrintNum(int n){
            lastNum = n;
        }
        @Override
        public void run() {
            for (int i = 1; i < lastNum; i++) {
                System.out.print(i+ " ");
            }
        }
    }
    static class PrintCharacter implements Runnable{
        private char charToPrint;
        private int times;
        public PrintCharacter(int t, char c){
            charToPrint = c;
            times = t;
        }
        @Override
        public void run() {
            for (int i = 0; i < times; i++) {
                System.out.print(charToPrint);
            }
        }
    }

    public static void main(String[] args) {
//        Runnable printA = ;
//        Runnable printC = new PrintCharacter(50,'c');
//        Runnable print120 = new PrintNum(120);
//
//        Thread thread1 = new Thread(printA);
//        Thread thread2 = new Thread(printC);
//        Thread thread3 = new Thread(print120);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
        new Thread(new PrintCharacter(100,'a')).start();
        new Thread(new PrintCharacter(50,'d')).start();
        new Thread(new PrintNum(120)).start();
    }
}
