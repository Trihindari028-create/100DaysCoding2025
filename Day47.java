import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan angka hari (1-7): " );
		int hari = indar.nextInt();
		switch (hari) {
			case 1:
			System.out.println("Hari: Senin");
			break;
			case 2:
			System.out.println("Hari: Selasa");
			break;
			case 3:
			System.out.println("Hari: Rabu");
			break;
			case 4:
			System.out.println("Hari: kamis");
			break;
			case 5:
			System.out.println("Hari: Jumat");
			break;
			case 6:
			System.out.println("Hari: sabtu");
			case 7:
			System.out.println("Hari: Minggu");
			default: 
			System.out.println("Maaf Angka Yang Kamu Masukan Salah");
			break;
	}	
	}
}
