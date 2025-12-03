import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.println("MASUKAN JUMBLAH ELEMEN ARRAY: ");
        int jumblah = indar.nextInt();
        int [] angka = new int [jumblah];
        System.out.println("MASUKAN ELEMEN ARRAY: ");
        for (int i = 0; i < jumblah; i++) {
            System.out.println("Elemen ke " + (i+1));
            angka [i] = indar.nextInt();
        }
        System.out.println("MASUKAN ELEMEN ARRAY: ");
        for(int nilai : angka ){
            System.out.println(nilai);
        }
    }
}
