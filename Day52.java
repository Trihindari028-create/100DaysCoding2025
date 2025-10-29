import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan angka: ");
		int angka = indar.nextInt();
		int i = 1;
		while (i <= angka ) {
			System.out.println(i);
			i++;
		}
	}
}
