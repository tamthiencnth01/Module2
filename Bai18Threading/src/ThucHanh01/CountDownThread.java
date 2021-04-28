package ThucHanh01;

public class CountDownThread implements Runnable{
    @Override
    public void run(){
        int count =100;
        for (int i =count ; i >0 ; i--) {
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Time out");
    }

    public static void main(String[] args) {

        new Thread(new CountDownThread()).start();
    }
}
