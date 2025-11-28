import java.util.Scanner;
public class day82 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.println("Masukan Jumbah elemen Array: ");
        int jumblah = indar.nextInt();
        
        int[] angka = new int[jumblah];
        
        System.out.println("=== MENGISI ELEMEN ARRAY ===");
        for(int i = 0; i < angka.length; i++){
            System.out.println("MASUKKAN ELEMEN KE " + i + ": ");
            angka[i] = indar.nextInt();
        }
        System.out.println("== MENAMPILKAN SEMUA ELEMEN ARRAY ==");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("ELEMEN KE " + i + ": " + angka[i]);
        }
    }
}
