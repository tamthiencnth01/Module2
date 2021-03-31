public class checkPrime {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tô nhỏ hơn 100 là: ");
        for (int i=0;i<100;i++){
            if (isPrimeNumber(i)){
                System.out.println(i+ " ");
            }
        }
    }

public static boolean isPrimeNumber(int n){
    //so nguyen n<2 ko phai la so nguyen to
    if (n<2){
        return false;
    }
    //check so nguyen to khi n>=2
    for (int i=2; i <= Math.sqrt(n);i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
}
}