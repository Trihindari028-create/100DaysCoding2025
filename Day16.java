import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Deklarasi variabel untuk menyimpan dua bilangan
        int bilangan1, bilangan2;
        int hasilperkalian, hasilpembagian;
        
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = input.nextInt();
        
        // Meminta input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = input.nextInt();
        
        // Operasi perkalian menggunakan operator *
        hasilperkalian = bilangan1 * bilangan2;
        
        // Operasi pembagian menggunakan operator /
        hasilpembagian = bilangan1 / bilangan2;
        
        // Menampilkan hasil
        System.out.println("Hasil perkalian (" + bilangan1 + " * " + bilangan2 + ") = " + hasilperkalian);
        System.out.println("Hasil pembagian (" + bilangan1 + " / " + bilangan2 + ") = " + hasilpembagian);
        
        // Menutup Scanner untuk menghindari resource leak
        input.close();
	}
}
