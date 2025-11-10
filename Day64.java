import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner (System.in);
		System.out.println("Masukan nilai M: ");
		int M = indar.nextInt();
		System.out.println("Masukan nilai N: ");
		int N = indar.nextInt();
		int hasil = 1;
		for ( int i = 0; i < N; i++ ){
			hasil *= M;
		}
		System.out.println(" Hasil dari "+  M +" pangkat " +  N + " adalah " + hasil ); 
	}
}
