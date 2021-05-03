import java.util.Scanner;
import java.util.regex.Pattern;

public class ThucHanh01 {
    public static void main(String[] args) {
        //"^[a-zA-Z0-9 ]+$"
        //Nhập dấu + phía sau được nhập thoải mái
        //Lớn hơn {9,}
        //Trong khoảng {9,10}
        //So dien thoai
        Scanner sc =  new Scanner(System.in);
        Pattern p = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
        while (true){
            System.out.println("Input txt: ");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()){
                System.out.println("OKKK");
                break;
            }else {
                System.err.println("Not OKKKK");
            }
        }
    }
}
