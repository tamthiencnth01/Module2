import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter a name's student:");
        String input = sc.nextLine();
        boolean isExist = false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input)){
                System.out.println("Position of the stundents in the list "+ input);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Khong tim thay "+ input + " in the list.");
    }
}
