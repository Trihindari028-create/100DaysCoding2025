import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan Nilai N: ");
		int N = indar.nextInt();
		for (int i = 1; i <= N; i++){
			System.out.println(i + " ");
		}
		for (int i = N; i >= 1; i--){
			System.out.println(i + " " );
		}
	}
}
