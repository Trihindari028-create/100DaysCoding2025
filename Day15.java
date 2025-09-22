import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Deklarasi variabel untuk menyimpan dua bilangan
        int bilangan1, bilangan2;
        int hasilPenjumlahan, hasilPengurangan;
        
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();
        
        // Meminta input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();
        
        // Operasi penjumlahan menggunakan operator +
        hasilPenjumlahan = bilangan1 + bilangan2;
        
        // Operasi pengurangan menggunakan operator -
        hasilPengurangan = bilangan1 - bilangan2;
        
        // Menampilkan hasil
        System.out.println("Hasil penjumlahan (" + bilangan1 + " + " + bilangan2 + ") = " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan (" + bilangan1 + " - " + bilangan2 + ") = " + hasilPengurangan);
        
        // Menutup Scanner untuk menghindari resource leak
        input.close();
	}
}
