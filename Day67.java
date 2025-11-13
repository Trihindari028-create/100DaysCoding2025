import java.util.Scanner;


public class day67 {
    public static void main(String[] args) {
      Scanner indar = new Scanner(System.in);
        System.out.print("masukan tinggi pola (n): ");
        int n = indar.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("*_*");
            }
            System.out.println();
        }
    } 
}
