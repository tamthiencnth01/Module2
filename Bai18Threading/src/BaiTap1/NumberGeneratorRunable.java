package BaiTap1;

import java.util.Scanner;

public class NumberGeneratorRunable implements Runnable{
    private int guessNumber = 0;
    private int count =0;

    public NumberGeneratorRunable(int guessNumber) {
        this.guessNumber = guessNumber;
    }


    @Override
    public void run() {
        int randomNumber = 0;
        do{
            randomNumber = (int) (Math.random()*100+1);
            count++;
            System.out.println(Thread.currentThread().getName()+" doan so "+ randomNumber);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (randomNumber!= guessNumber);
        System.out.println(Thread.currentThread().getName()+" da doan dung so "+guessNumber+" trong " + count + " lan doan! ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so can doan: ");
        int n = sc.nextInt();

        Runnable target;
        Thread thread1 = new Thread(new NumberGeneratorRunable(n));
        Thread thread2 = new Thread(new NumberGeneratorRunable(n));
        Thread thread3 = new Thread(new NumberGeneratorRunable(n));

        thread1.setName("Binh Hu");
        thread2.setName("Huy Le");
        thread3.setName("Thien Tatoo");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
