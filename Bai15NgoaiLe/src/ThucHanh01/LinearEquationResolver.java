package ThucHanh01;
import java.io.IOException;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
//        try {
//            int data = 50/0;
//        } catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code... ");
//        try {
//            int a[] = new int[5];
//            a[5] = 30 / 0;
//        } catch (Exception e) {
//            System.out.println("common task compledted");
//        } catch (ArithmeticException e){
//            System.out.println("task 1 is completed");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("task 2 is completed");
//        }
//        System.out.println("rest of the code...");
//    }
//        try{
//            try {
//                System.out.println("thuc hien phep tinh");
//                int b = 39/0;
//            }catch (ArithmeticException e){
//                System.out.println(e);
//            }
//            try {
//                int a[] = new int[5];
//                a[5] = 4;
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//            }
//            System.out.println("khoi lenhj khac");
//        }catch (Exception e){
//            System.out.println("Xu ly ngoai le");
//        }
//        System.out.println("tiep tuc chuong trinh");
        //nơi ngoại lệ ko xảy ra
//        try{
//            int data = 25/5;
//            System.out.println(data);
//        }catch (NullPointerException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("finalyy block is alway");
//        }
//        System.out.println("rest of the code");
        //nơi xảy ra ngoại lê
//        try{
//            int data = 25/0;
//            System.out.println(data);
//        }catch (NullPointerException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("fiana");
//        }
//        System.out.println("rest of the code");
//        try {
//            int data = 25;
//            if (data % 2 != 0){
//                System.out.println(data + " data is odd number");
//            return;
//            }
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("finanly");
//        }
//        System.out.println("rest of the ");
//        validate(13);
//        System.out.println("rest of the code");
        LinearEquationResolver resolver = new LinearEquationResolver();
        resolver.p();
        System.out.println("Luong binh thuong");
    }
    static void validate(int age){
        try{
            if (age<18){
                throw new ArithmeticException("not valid");
            }
            else System.out.println("welcome");
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
    void m() throws IOException{
        throw new IOException("Loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("ngoai le");
        }
    }
}