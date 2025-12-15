import java.util.Scanner;
public class day99 {
    
    static boolean prima(int angka) {
        if (angka <= 1 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        System.out.print("Masukan nilai N: ");
        int n = indar.nextInt();
        
        System.out.println("Deretan bilangan prima dari 1 sampai " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (prima(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
