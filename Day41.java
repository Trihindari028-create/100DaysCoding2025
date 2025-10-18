import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masukan angka pertama: ");
		int angka1 = indar.nextInt();
		System.out.print("Masukan angka kedua: ");
		int angka2 = indar.nextInt();
		boolean hasil = (angka1 == angka2 );
		System.out.println(hasil);
	}
}
