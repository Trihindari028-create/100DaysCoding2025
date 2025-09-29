import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
      double sisi; 
	    System.out.println("Masukan Panjang Sisi Persegi");
	    sisi = indar.nextDouble();
	    double luas = sisi * sisi;
	    System.out.println("Luas Persegi Adalah: " + luas);
	}
}
