import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.println("Masukan Nilai (0-100): ");
		int nilai = indar.nextInt();
		char predikat;
		if (nilai >=90 ){
			predikat = 'A';
		}else if (nilai >= 80 ){
			predikat = 'B';
		}else if (nilai >= 70 ){
			predikat = 'C';
		}else if (nilai >= 60 ){
			predikat = 'D';
		} else {
			predikat = 'E';
		}
		System.out.println("predikat: " + predikat);
	}
}
