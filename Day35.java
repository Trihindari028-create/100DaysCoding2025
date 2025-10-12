import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
	            
	            System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = indar.nextInt();
        if (bilangan > 0) {
            System.out.println("Bilangan tersebut adalah POSITIF.");
        } else if (bilangan < 0) {
           System.out.print("Masukkan sebuah bilangan negatif: ");
        } else {
            System.out.println("Bilangan tersebut adalah NOL.");
        }
}
}
