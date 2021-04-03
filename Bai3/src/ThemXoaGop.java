import java.util.Scanner;

public class ThemXoaGop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Nhập số lượng phần tử trong mảng");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            arr[i]=(int) Math.round(Math.random()*10);
        }
        //Tim gia tri trong mang
        System.out.println("Nhập giá trị cần tìm: ");
        int x = sc.nextInt();
        int pos = search(arr, x);
        if (pos == -1){
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay tai vi tri: " + pos);
        }

        //Hiển thị hàm
        System.out.println("Hàm trước khi xóa ");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        //Gọi hàm để xóa giá trị trong mảng
        System.out.println("Nhập giá trị cần xóa: ");
        int y= sc.nextInt();
        n = delete(arr,n,y);
        System.out.println("Hàm sau khi xóa: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        //Hiển thị hàm trước khi thêm
        System.out.println("Hàm trước khi thêm");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        //Gọi hàm thêm mới phần tử cuối cùng
        System.out.println("Nhập giá trị cần thêm");
        int z=sc.nextInt();
        n = add(arr,size,n,z);
        System.out.println("Hàm sau khi thêm:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        //Gọi hàm thêm mới giá trị vào phần tử bất kỳ
        System.out.println("Nhập giá trị cần thêm vào");
        int k = sc.nextInt();
        System.out.println("Nhập vị trí cần thêm");
        int l = sc.nextInt();
        n=addToPos(arr,size,n,k,l);
        System.out.print("Hàm sau khi thêm "+ k + " tại vị trí "+ l + " là: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }



    //Phương thức tìm giá trị trong mảng
     static int search(int[] arr,int x) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    //Phương thức xóa giá trị trong mảng
    static int delete(int[] arr,int n,int key){
        //Kiểm tra xem phần tử có trong mảng hay không?
        int pos = search(arr,key);
        if (pos==-1){
            System.out.println("Không tìm thấy giá trị phần tử cần xóa");
        }
        //Xóa phần tử với pos là giá trị phần tử đã tìm thấy và n là size
        for (int i=pos;i<n;i++){
             arr[i] = arr[i+1];
        }
        return n-1;
    }
    //Phương thức thêm giá trị vào cuối mảng
    static int add(int[] arr,int size,int n,int x){
        //Nếu n lớn hơn size thì trả về n
        if (n>=size){
            return n;
        }
        arr[n]=x;
        return n+1;
    }
    //Phương thức thêm giá trị vào phần tử bất kỳ
    static int addToPos(int[] arr,int size, int n, int x,int position){
        if (n>=size){
            return n;
        }
        if (position<0 || position>n){
            return n;
        }
        for (int i =n;i>position;i--){
            arr[i]=arr[i-1];
        }
        arr[position]=x;
        return n+1;
    }
}
