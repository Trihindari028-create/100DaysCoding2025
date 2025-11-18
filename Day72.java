import java.util.Scanner;
public class day72 {
    public static void main(String[] args) {
        Scanner indar = new Scanner(System.in);
        int angka;
        int total = 0;
        System.out.println("Masukan Angka (Negatif untuk berhenti) ");
        while (true){
            System.out.print("Masukan Angka: ");
            angka = indar.nextInt();
            if (angka < 0){
                break;
            }
            total += angka;
        }
        System.out.println("Jumbla: " + total);
    }
}
