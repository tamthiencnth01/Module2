package com.thien;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class acountATM implements ATM{
     public String name;
     public int amount;
     public ArrayList<String> history = new ArrayList<String>();

     public acountATM() {
     }


     public acountATM(String name, int amount) {
         this.name = name;
         this.amount = amount;

     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAmount() {
         return amount;
     }

     public void setAmount(int amount) {
         this.amount = amount;
     }

     @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void mainMenu(){
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Ngân hàng ABC xin kính chào quý khách: "+getName());
            System.out.println("Menu");
            System.out.println("1. Nhấn phím A để kiểm tra tài khoản");
            System.out.println("2. Nhấn phím D để nạp tiền");
            System.out.println("3. Nhan phim W để rút tiền");
            System.out.println("4. Nhấn phím H để xem lịch sử 3 lần");
            System.out.println("5. Nhân phím X để thoát.");
            System.out.println("============================================");
            System.out.print("Enter your choice: ");
            choice = input.next().charAt(0);

            switch (choice){
                case 'a':
                    checkAccount();
                    cls();
                    break;
                case 'd':
                    System.out.println("Giao Dịch Nạp Tiền: ");
                    System.out.println("Vui Lòng Nhập Số Tiền: ");
                    int topUp = input.nextInt();
                    topUp(topUp);
                    break;
                case 'w':
                    System.out.println("Giao Dịch Rút Tiền: ");
                    System.out.println("Vui Lòng Nhập Số Tiền: ");
                    int withDraw = input.nextInt();
                    withDraw(withDraw);
                    break;
                case 'h':
                    System.out.println("Lịch Sử Giao Dịch: ");
                    if (history.size()==0){
                        System.out.print(" Hiện Tại Hệ Thống Chưa Nhận Giao Dịch \n");
                    }
                    if (history.size()>3){
                        for (int i = history.size()-1; i > history.size()-4; i--) {
                            System.out.println(i+1 +". " + history.get(i));
                        }
                    }
                    else {
                        for (int i =history.size()-1 ;i>=0; i--) {
                            System.out.println(2-i + ". " + history.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Bạn nhập sai chức năng!");
                    System.out.println("Bấm theo Menu để tiếp tục giao dịch");
                    System.out.println("============================================");
            }
        }while (choice!='x');
    }

    @Override
    public void checkAccount() {
        System.out.println("Số dư tài khoản khách hàng là: "+this.amount);
        System.out.println("Bấm nút theo Menu để tiếp tục giao dịch");
        System.out.println("============================================");
    }


     @Override
    public void topUp(int number) {
        System.out.println("Giao Dịch Thành Công! Bạn vừa nạp "+ number +"thành công. ");
        System.out.println("Số dư tài khoản khách hàng là "+ (amount+number));
        setAmount(amount+number);
        history.add("Nạp Tiền: "+number);
        System.out.println();
        System.out.println("Bấm nút theo Menu để tiếp tục giao dịch");
        System.out.println("============================================");
    }

    @Override
    public void withDraw(int number) {
        if (amount > number) {
            System.out.println("Giao Dịch Thành Công! Bạn vừa rút " + number + "thành công. ");
            System.out.println("Số dư tài khoản khách hàng là " + (amount - number));
            setAmount(amount - number);
            history.add("Rút Tiền: " + number);
            System.out.println();
            System.out.println("Bấm nút theo Menu để tiếp tục giao dịch");
            System.out.println("============================================");
        } else {
            System.out.println("Giao Dịch Không Thành Công!");
            System.out.println("Số dư tài khoản khách hàng là " + amount);
            System.out.println("Bạn không thể rút hơn số dư trong tài khoản.");
        }
    }
    public void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
