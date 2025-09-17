public class Main {
    // Mendeklarasikan konstanta dengan keyword 'final'
    // Nilai dari PHI tidak bisa diubah setelah diinisialisasi
    public static final double PHI = 3.14159;
    
    public static void main(String[] args) {
        
        // Menggunakan konstanta PHI untuk menghitung banyak boba
        double caramel = 7.0;
        double banyakboba = PHI * caramel * caramel;
        
        System.out.println("banyak boba dengan caramel " + caramel + " adalah " + banyakboba);
        // Jika kita coba mengubah nilai PHI, maka akan terjadi error
        // PHI = 3.14; // Ini akan error karena PHI adalah final
        
    }
}
