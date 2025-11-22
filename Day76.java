import java.util.Scanner;
public class day76 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.println("MASUKAN ISI HATI KAMU: ");
        String kata = indar.nextLine();
        
        String perbandingan = "java";
        
        System.out.println("/n== pengecekan equals() ==");
        if (kata.equals(perbandingan)){
            System.out.println("Kata sama percis dengan '" + perbandingan + "'");
        } else {
            System.out.println("Kata tidak sama dengan ' " + perbandingan + "'");
        }
        
        System.out.println("/n== pengecekan equalsIgnoreCase() ==");
        if (kata.equalsIgnoreCase(perbandingan)){
            System.out.println("Kata sama(tanpa membedakan huruf besar/kecil) dengan '" + perbandingan + "'");
        } else {
            System.out.println("Kata berada dari ' " + perbandingan + "'");
        }
        
        System.out.println("/n== pengecekan contains() ==");
        if (kata.contains("va")){
            System.out.println("Kata mengandung substring 'va'");
        } else {
            System.out.println("Kata tidak mengandung substring 'va'");
        }
        
        System.out.println("/n== pengecekan isEmpty() ==");
        if (kata.isEmpty()){
            System.out.println("input kosong");
        } else {
            System.out.println("input tidak kosong. panjangnya: " + kata.length());
        }
    }
}
