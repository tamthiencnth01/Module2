package com.thien;
import java.util.ArrayList;

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
         if (amount>number){
             System.out.println("Giao Dịch Thành Công! Bạn vừa rút "+ number +"thành công. ");
             System.out.println("Số dư tài khoản khách hàng là "+ (amount-number));
             setAmount(amount-number);
             history.add("Rút Tiền: "+number);
             System.out.println();
             System.out.println("Bấm nút theo Menu để tiếp tục giao dịch");
             System.out.println("============================================");
         }
         else{
             System.out.println("Giao Dịch Không Thành Công!");
             System.out.println("Số dư tài khoản khách hàng là "+amount);
             System.out.println("Bạn không thể rút hơn số dư trong tài khoản.");
         }


    }
}
