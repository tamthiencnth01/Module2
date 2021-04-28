package BaiTap02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Product> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String path = "product.csv";
    public static void main(String[] args) throws IOException {
        int choose;
        try {
            do {
                showMenu();
                choose = Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        inputProduct();
                        break;
                    case 2:
                        editProduct();
                        break;
                    case 3:
                        searchProduct();
                        break;
                    case 4:
                        showProduct();
                        break;
                    case 5:
                        deleteProduct();
                        break;
                    case 6:
                        System.out.println("Thoat");
                        break;
                    default:
                        System.out.println("Moi ban nhap lai: ");
                        break;
                }

            }while (choose!=6);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void deleteProduct() {
    }

    private static void showProduct() throws Exception {
        System.out.println(read(path));
    }

    private static void searchProduct() {
    }

    private static void editProduct() throws IOException {
        System.out.println("thong tin san pham nhu sau: ");
        System.out.println(read(path));
        System.out.println("Nhap Id Sinh Vien can sua:");
        int n = Integer.parseInt(sc.nextLine());
        for (Product product:
             list) {
            if (product.getId()==n){
                product.input();
                break;
            }
        }
    }

    private static void inputProduct() throws IOException {
        System.out.print("Moi ban Nhap So Luong San Pham Can Them:");
        int n = Integer.parseInt(sc.nextLine());
        try {
            for (int i=1;i<=n;i++){
                System.out.println("Nhap thong tin San Pham: ");
                Product product = new Product();
                product.input();
                list.add(product);
                write(list,path);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void showMenu(){
        System.out.println("--------Menu---------");
        System.out.println("1. Them san pham");
        System.out.println("2. Sua san pham");
        System.out.println("3. Tim kiem san pham");
        System.out.println("4. Hien thi san pham");
        System.out.println("5. Xoa San Pham");
        System.out.println("6. Thoat");
        System.out.println("---------------------");
    }
    public static void write(List<Product> products, String path) throws IOException {
        BufferedWriter bw = null;
        StringBuilder sb = null;
        try {
            Writer out;
            bw = new BufferedWriter(new FileWriter(path,true));
            sb = new StringBuilder();
            for (Product product:
                    products) {
                sb.append(product.toString());
            }
            bw.write(String.valueOf(sb));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            bw.flush();
            bw.close();
        }


    }
    public static List<Product> read(String path) throws IOException {
        ArrayList<Product> products = new ArrayList<>();
        Reader in;
        BufferedReader br =new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine())!=null){
            String[] check = line.split(",");
            products.add(new Product(Integer.parseInt(check[0]),check[1],check[2],Integer.parseInt(check[3])));
        }
        return products;
    }
    public static void createFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()){
            System.out.println("File is not exists! ");
        } else{
            file.createNewFile();
        }
    }
}
