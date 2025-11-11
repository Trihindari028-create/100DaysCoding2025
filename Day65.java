import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = indar.nextInt();
        
        long hasil = hitungFaktorial(n);
        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
    }
    
    public static long hitungFaktorial(int n) {
        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        return faktorial;
    }
