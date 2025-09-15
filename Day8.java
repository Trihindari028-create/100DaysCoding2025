public class Main {
    public static void main(String[] args) {
        String teks = "Hayy, selamat datang di dinua boba!";
        
        // Menampilkan isi variabel teks ke layar
        System.out.println(teks);
        
        System.out.println("Panjang string: " + teks.length());
        
        // Mengakses karakter pertama dari string
        System.out.println("Karakter pertama: " + teks.charAt(0));
        
        // Mengubah string menjadi huruf besar
        System.out.println("Huruf besar: " + teks.toUpperCase());
        
        // Mengubah string menjadi huruf kecil
        System.out.println("Huruf kecil: " + teks.toLowerCase());
    }
}
