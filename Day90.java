import java.util.Scanner;
public class day90 {
    public static int hitungluaspersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    
    public static String sapaan(String nama){
        return "HAY, " + nama + " KAMU GANTENG BANGATTT.";
    }
    
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.println("Masukan sisi persegi: ");
        int sisi = indar.nextInt();
        
        int hasilluas = hitungluaspersegi(sisi);
        System.out.println("Luas persegi adalah: " + hasilluas);
        
        indar.nextLine();
        
        System.out.println("Masukan nama kamu: ");
        String nama = indar.nextLine();
        
        String pesan = sapaan(nama);
        System.out.println(pesan);
    }
}
