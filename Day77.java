import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        System.out.println("MASUKAN KALIMAT AWAL SUBSTRING: ");
        String teks = indar.nextLine();
         
        String teksTrim = teks.trim();
        
        String teksSubstring;
        if (teks.length() >=3) {
            teksSubstring = teks.substring(0, 3);
        } else {
            teksSubstring = teks;
        }
       
        String teksReplace = teksTrim.replace("a", "@");
        
        
        System.out.println("/n=== HASIL MANIPULASI STRING ===");
        System.out.println("Kalimat asli        : " + teks );
        System.out.println("Hasil substring     : " + teksTrim);
        System.out.println("Hasil repelace      : " + teksSubstring);
        System.out.println("Hasil trim          : " + teksReplace);
    }
}
