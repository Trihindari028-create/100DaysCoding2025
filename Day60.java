import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		
        System.out.print("Masukkan nilai N: ");
        int N = indar.nextInt();
        
        
        System.out.println("Angka ganjil dari N hingga " + 1 + ":");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) {  
            
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("Angka genap dari 1 hingga " + N + ":");
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {  
            
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        
    }
}
