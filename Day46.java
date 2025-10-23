import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masukan angka (1-3) untuk memilih menu: ");
		int menu = indar.nextInt();
		switch (menu) {
			case 1:
			System.out.println("Menu: ikan bakar ");
			break; 
			case  2:
			System.out.println("Menu: sayur pedas ");
			break;
			case 3:
			System.out.println("Menu: Nasi tergoda ");
			break;
			default:
			System.out.println("Angka yang kamu masukan salah bebz! tolong imput 1-3 ");
		}
	}
}
