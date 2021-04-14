package com.thien;

import java.util.Scanner;

public class Entry extends acountATM {
    public static void main(String[] args) {
        acountATM person = new acountATM("Lại Phước Khánh",
                12);
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Ngân hàng ABC xin kính chào quý khách: "+person.getName());
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
                        person.checkAccount();
                        break;
                    case 'd':
                        System.out.println("Giao Dịch Nạp Tiền: ");
                        System.out.println("Vui Lòng Nhập Số Tiền: ");
                        int topUp = input.nextInt();
                        person.topUp(topUp);
                        break;
                    case 'w':
                        System.out.println("Giao Dịch Rút Tiền: ");
                        System.out.println("Vui Lòng Nhập Số Tiền: ");
                        int withDraw = input.nextInt();
                        person.withDraw(withDraw);
                        break;
                    case 'h':
                        System.out.println("Lịch Sử Giao Dịch: ");
                        if (person.history.size()==0){
                            System.out.print(" Hiện Tại Hệ Thống Chưa Nhận Giao Dịch \n");
                        }
                        if (person.history.size()>3){
                            for (int i = person.history.size()-1; i > person.history.size()-4; i--) {
                                System.out.println(i+1 +". " +person.history.get(i));
                            }
                        }
                        else {
                            for (int i =person.history.size()-1 ;i>=0; i--) {
                                System.out.println(2-i + ". " + person.history.get(i));
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
}
