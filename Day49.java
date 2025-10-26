import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masukan umur kamu: ");
		int umur = indar.nextInt();
		String hasil = (umur >= 18) ? "Boleh Minum Boba" : "Tidak Boleh Minum Boba";
		System.out.println("hasil" + hasil );
	}
}
