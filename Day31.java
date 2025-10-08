public class Main {

	public static void main(String[] args) {

        boolean umurCukup = true;   // Umur >= 18? Ya (true)
        boolean punyaIzin = false;  // Punya izin? Tidak (false)
        // Pakai && untuk cek keduanya
        if (umurCukup && punyaIzin) {
            System.out.println("Bisa main game!");
        } else {
            System.out.println("Tidak bisa, kurang syarat.");
        }
        
        // Ubah untuk lihat hasil true
        punyaIzin = true;
        if (umurCukup && punyaIzin) {
            System.out.println("Sekarang bisa main game!");
        }
  }
}
