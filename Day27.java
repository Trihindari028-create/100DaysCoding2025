import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	   Scanner indar = new Scanner(System.in);
	   System.out.print("Jumlah pulsa: ");
        int jumlahPulsa = indar.nextInt();
        int totalSebelum = jumlahPulsa * 10000;
        int totalSesudah = totalSebelum + 2000;
	   
        System.out.println("Sebelum: " + totalSebelum);
        System.out.println("Sesudah: " + totalSesudah);
   }
}
