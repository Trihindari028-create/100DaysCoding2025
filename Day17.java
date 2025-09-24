import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        int angka1 = 10;
        int angka2 = 3;
        int sisa = angka1 % angka2;
        System.out.println("Contoh 1: " + angka1 + " % " + angka2 + " = " + sisa);
		
        int bilangan = 7;
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
		
	}
}
