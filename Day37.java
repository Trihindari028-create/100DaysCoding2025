import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masukkan sebuah angka: ");
        int angka = indar.nextInt();
		if (angka % 2 == 0) {
         System.out.println("Bilangan Genap");
        } else {
           System.out.println("Bilangan Ganjil");
       }
	}
}
