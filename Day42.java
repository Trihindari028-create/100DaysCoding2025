import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masuka gaji kotor: ");
		double gajikotor = indar.nextDouble();
		double pajak = 0.1 * gajikotor;
		double asuransi = 0.5 * gajikotor;
		double gajibersih = gajikotor - pajak - asuransi;
		System.out.println("Gaji bersi: Rp " + gajibersih);
		
	}
}
