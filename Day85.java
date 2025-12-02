import java.util.Scanner;
public class day85 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        System.out.println("MASUKAN ELEM ARRAY: ");
        int mini = indar.nextInt();
        
        int[] angka = new int[mini];
        
        for (int i = 0; i < mini; i++) {
            System.out.println("MASUKAN ELEMEN PERTAMA :"+ (i+1 ));
            angka[i] = indar.nextInt();
        }
        int min = angka[0];
        for (int i = 1; i < mini; i++){
            if (angka[i] < min ) {
                min = angka[i];
            }
        }
        System.out.println(" NILAI MINIMAL DALAM ARRAY ADALAH: " + min);
    }
}
