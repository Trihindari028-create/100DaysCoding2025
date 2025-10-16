import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1. Menu 1");
		System.out.println("2. Menu 2");
		System.out.println("3. Exit ");
		System.out.print("Pilih menu: ");
		int pilihan = indar.nextInt();
		if (pilihan == 1 ){
			System.out.println("Anda memilih Menu 1 ");
	}else if (pilihan == 2 ){
		System.out.println("Anda memilih Menu 2 ");
}else if (pilihan == 3 ){
	System.out.println("Keluar dari program ");
	}else {
		System.out.println("pilihan tidak valid coba ulang kembali ");
}
}
}
