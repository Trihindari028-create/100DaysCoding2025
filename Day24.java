import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
	    System.out.println("Masukan jari-jari lingkaran: " );
	    double jarijari = indar.nextDouble();
	    double pi = 3.14;
	    double luas = pi * jarijari * jarijari;
	    System.out.println("Luas Lingkaran dan jari-jari: " + jarijari + "adalah" + luas);
	}
}
