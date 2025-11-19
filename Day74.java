import java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner indar = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("===Menu Utuma ===");
            System.out.println("1. Opsi 1: Tampilkan Pesanan ");
            System.out.println("2. Opsi 2: Hitung Sederhana ");
            System.out.println("3. Keluar:");
            System.out.print("Pilih Opsi (1-3): ");
            
            pilihan = indar.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Anda Memilih Opsi 1: HAY SELAMAT DATANG DI TOKOH KAMI ");
                    break;
                case 2:
                    System.out.println("Masukan Angka Pertama: ");
                    int a = indar.nextInt();
                    System.out.println("Masukan Angka Kedua: ");
                    int b = indar.nextInt();
                    System.out.println("Total: "+ (a + b));
                    break;
            }
            System.out.println();
        } while (pilihan != 3);
    }
}
