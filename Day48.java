import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner indar = new Scanner(System.in);
		System.out.print("Masukkan angka pertama: ");
        double angka1 = indar.nextDouble();
          System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = indar.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double angka2 = indar.nextDouble();
        double hasil = 0;
       
        switch (operator) {
            case '+':
                hasil = angka1 + angka2; 
                break; 
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2; 
                break;
            case '/':
                if (angka2 != 0) {  
                    hasil = angka1 / angka2; 
                } else {
                    System.out.println("Error: Tidak bisa bagi dengan nol!");
                    return; 
                }
                break;
            default:
                System.out.println("Operator tidak valid Gunakan +, -, *, atau /.");
                return;
        }
        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
       
    }
}
