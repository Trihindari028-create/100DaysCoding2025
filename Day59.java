import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan Nilai N: ");
		int N = indar.nextInt();
		System.out.println("Angka Ganjil i sampai " + N + ": ");
		for (int i = 1; i <= N; i++) {
			if ( i % 2 != 0 ) {
			System.out.println(i + " ");
			}
	}
	System.out.println("");
	
	System.out.println("Angka Genap i sampai " + N +": ");
	  for (int i = 1; i <=N; i++){
	  	if (i % 2 == 0) {
	  		System.out.println(i + " ");
	  	}	
	 }
	 System.out.println("");
	}
}
