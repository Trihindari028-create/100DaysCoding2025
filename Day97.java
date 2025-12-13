public class day97 {
    static int hitungluas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        int sisi = 6;
        int hasil = hitungluas(sisi);
        
        System.out.println("SISI Persegi : " + sisi);
        System.out.println("LUAS Persegi : " + hasil);
    }
}
