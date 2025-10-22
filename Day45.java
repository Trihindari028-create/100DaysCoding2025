import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan angka (1-3) untuk memilih keluarga: ");
		int keluarga = indar.nextInt();
		switch (keluarga) {
			case 1:
			System.out.println("Keluarga: Cemara ");
			break;
			case 2:
			System.out.println("Keluarga: Kuat ");
			break;
			case 3:
			System.out.println("Keluarga: Broken Home ");
			break;
			default:
			System.out.println("Angka tidak Valid Tolong masukan angka 1-3  untuk memilih keluarga yang kamu inginkan jika tidak memilih maka kamu akan sendirian ");
		}
	}
}
