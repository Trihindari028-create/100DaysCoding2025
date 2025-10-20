import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan sebuh angka: ");
		int angka = indar.nextInt();
		if (angka % 3 == 0 && angka % 5 == 0) {
		System.out.println("indarrr");	
		}
		else if (angka % 3 == 0 ) {
			System.out.println("darr");
		}
		else if (angka % 5 == 0 ) {
			System.out.println("rrrr");
		}
		else {
		System.out.println(angka);
		}
	}
}
