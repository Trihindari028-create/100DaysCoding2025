import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan Nilai N: ");
		int N = indar.nextInt();
		int total = 0;
		for (int i = 1; i <= N; i++){
			total += i;
		}
		System.out.println("Jumblah dari 1 sampai " + N + " adalah: " + total);
	}
}
