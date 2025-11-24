import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        System.out.println("MASUKAN ISI HATI KAMU: ");
        String isihati = indar.nextLine();
        
        System.out.println("/n== HASIL PEMROSESAN STRING ==");
        
        System.out.println("Panjang isi hati: " + isihati.length());
        
        System.out.println("Huruf BESAR: " + isihati.toUpperCase());
        
        System.out.println("Huruf kecil: " + isihati.toLowerCase());
        
        System.out.println("Setelah trim (hapus spasi depan & belakang): '" + isihati.trim() + "'");
        
        if (isihati.length() >= 5){
            System.out.println("Substring (0-5): " + isihati.substring(0, 5));
        } else {
            System.out.println("Substring tidak bisa (panjang < 5)");
        }
        
        System.out.println("Ganti Huruf 'a' manjadi '*': " + isihati.replace("a", "*"));
        
        System.out.println("/n= Masukan kata utuk dibandingkan: ");
        String bandingkan = indar.nextLine();
        
        System.out.println("equasl(): " + isihati.equalsIgnoreCase(bandingkan));
        
        System.out.println("Masukan kata yang ingin di cetak: (contains): ");
        String cari = indar.nextLine();
        
        System.out.println("Kalimat mengandung '"+ cari + "' ?" + isihati.contains(cari));
        
        System.out.println("/n== Apakah kalimat kosong? " + isihati.isEmpty());
    }
}
