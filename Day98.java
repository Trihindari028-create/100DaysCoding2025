import java.util.Scanner;
public class day98 {
    public static void main(String[] args) {
        Scanner indar = new Scanner(System.in);
        
        System.out.println("MASUKAN NILAI N: ");
        int n = indar.nextInt();
        
        int a = 1, b = 1;
        
        System.out.println("Deretan Finonacci dari 1 sampai " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            System.out.println( a +" ");
            
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
