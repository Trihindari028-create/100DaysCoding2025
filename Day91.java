public class day91 {
    static void isihati(String nama){
        System.out.println("HAY " + nama + ", KAKAK CANTIKKK BANGAT LOO!");
    }
    
    static int luaspersegipanjang(int panjang, int lebar){
        return panjang * lebar;
    }
    
    static double luaslingkaran(double radius) {
        return 3.14 * radius * radius;
    }
    
    static int volumebalok (int p, int l, int  t){
        return p * l * t;
    }
    
    public static void main(String[] args) {
        isihati("KAK SINTA");
        
        int luaspp = luaspersegipanjang(5, 3);
        System.out.println("LUAS LINGKATRAN = " + luaspp);
        
        double luasl = luaslingkaran(7);
        System.out.println("LUAS LINGKARAN = " + luasl);
        
        int vol = volumebalok(4, 3, 2);
        System.out.println("VOLUME BALOK = " + vol);
    }
}
