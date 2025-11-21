import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner indar = new Scanner(System.in);
        System.out.print("MASUKAN ISI HATIMU: ");
        String teks = indar.nextLine();
        int panjang = teks.length();
        String hurufB = teks.toUpperCase();
        String hurufk = teks.toLowerCase();
        System.out.println("/n= HASIL= ");
        System.out.println("Teks hasil      : " + teks);
        System.out.println("Panjang teks    : " + panjang);
        System.out.println("Huruf Besar     : " + hurufB);
        System.out.println("huruf kecil     : " + hurufk);
    }
 
}
