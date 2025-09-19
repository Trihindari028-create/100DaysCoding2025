import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner bc = new Scanner(System.in);
       System.out.println("Masukan nama: ");
       String nama = bc.nextLine();
       System.out.println("Masukan umur: ");
       int umur = bc.nextInt();
       bc.nextLine();
       System.out.println("Masukan alamat: ");
       String alamat = bc.nextLine();
       System.out.println("Masukan asalsekolah: ");
       String asalsekolah = bc.nextLine();
       System.out.println("tb: ");
       double tb = bc.nextDouble();
       
       System.out.println("nama saya " + nama);
       System.out.println("umur saya " + umur);
       System.out.println("alamat saya " + alamat);
       System.out.println("asal sekolah saya " + asalsekolah);
       System.out.println("tb saya " + tb);
       
    }
}
