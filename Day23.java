import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
	      System.out.println("Masukan Panjang: " );
	      double panjang = indar.nextDouble();
	      System.out.println("Masukan Lebar: " );
	      double lebar = indar.nextDouble();
	      double luas = panjang * lebar;
	      System.out.println("Luas Persegi Panjang Adalah: " + luas);
	}
}
