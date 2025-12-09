import java.util.Scanner;
public class day93 {
    public static void main(String[] args) {
        Scanner indar = new Scanner(System.in);
        
        System.out.println("MASUKAN ANGKA DESIMAL: ");
            double angka = indar.nextDouble();
            
            double hasilCeil = Math.ceil(angka);
            
            double hasilFloor = Math.floor(angka);
            
            long hasilRound = Math.round(angka);
            
            System.out.println("=== HASIL PERHITUNGAN ===");
            System.out.println("angka asli      : " + angka);
            System.out.println("Math.ceil()     : " + hasilCeil + "(di buat ke atas)");
            System.out.println("Math.floor()    : " + hasilFloor + "(di buat ke bawah)");
            System.out.println("Math.round()    : " + hasilRound + "(di buat ke terdekat)");
    }
}
