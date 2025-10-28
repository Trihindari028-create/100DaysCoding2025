import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan Jumlah angka");
		int jumblah = indar.nextInt();
		for (int i = 1; i <= jumblah; i++ ){
			System.out.println("angka: " + i);
		}
	}
}
