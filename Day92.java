import java.util.Scanner;
public class day92 {
    
    public static int hitungluas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.print("MASUKAN PANJANG: ");
        int p = indar.nextInt();
        
        System.out.print("MASUKAN LEBAR: ");
        int l = indar.nextInt();
        
        int luas = hitungluas(p,l);
        
        System.out.println("LUAS PERSEGI PANJANG ADALAH: " + luas);
    }
}
