import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            double money = 1.0;
            int month = 1;
            double interset_rate = 1.0;
            System.out.println("Nhap so tien gui");
            money = sc.nextDouble();
            System.out.println("Nhap so thang gui");
            month = sc.nextInt();
            System.out.println("Nhap lai suat:");
            interset_rate = sc.nextDouble();
            double total_interset = 0;
            for (int i=0;i<month;i++){
                total_interset+=money*(interset_rate/100)/12*month;
            }
            System.out.println("Lai suat tong cong nhan duoc la: "+ total_interset);
        }
    }
}
