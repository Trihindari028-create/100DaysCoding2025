import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
       
        System.out.print("Masukkan angka: ");
        int angka = indar.nextInt();
        
     
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + angka + " adalah " + hasil);
	}
}
