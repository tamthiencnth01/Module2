package BT01;

public class Main {
    public static void reverse(StringBuffer str) {
        //Tạo một ngăn xếp
        int n=str.length();
        //So sánh độ dài chuỗi
        Stack obj = new Stack(n);
        //thêm tất cả ký tự vào chuỗi
        for (int i = 0; i < n; i++) {
            obj.push(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            char check = obj.pop();
            str.setCharAt(i,check);
        }
    }

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("mWord");
        reverse(s);
        System.out.println("Reversed string is: "+s);
    }
}
