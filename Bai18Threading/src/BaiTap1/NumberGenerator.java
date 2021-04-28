package BaiTap1;

import java.util.Scanner;

public class NumberGenerator extends Thread{
    private int guessNumber = 0;
    private int count = 0;

    public NumberGenerator(int guessNumber) {
        this.guessNumber = guessNumber;
    }

    @Override
    public void run() {
        int randomNumber = 0;
        do{
            randomNumber = (int) (Math.random()*100+1);
            count++;
            System.out.println(getName()+ " doan so "+randomNumber);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (randomNumber!=guessNumber);
        System.out.println(getName()+"da doan trung so"+guessNumber+"trong "+count+"lan dem");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap mot so nguyen de cac thread doan(tu 1-100):");
        int number = sc.nextInt();

        NumberGenerator thread1 = new NumberGenerator(number);
        NumberGenerator thread2 = new NumberGenerator(number);
        NumberGenerator thread3 = new NumberGenerator(number);

        thread1.setName("Quang Teo");
        thread2.setName("long Koi");
        thread3.setName("Nam Tatoo");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
