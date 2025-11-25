import java.util.Scanner;
public class latihan79 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        
        String username, password;
        
        System.out.println("=== Membuat Akun Baru ===");
        System.out.println("Masukan Username baru: ");
        username = indar.nextLine();
        
        System.out.println("Masukan password baru: ");
        password = indar.nextLine();
        
        System.out.println("/nAkun berhasil dibua! ");
        System.out.println("-----------------------");
        
        String userLogin, passLogin;
        
        System.out.println("=== Login ke Akun ===");
        
        while (true) {
            System.out.println("Masukkan username: ");
            userLogin = indar.nextLine();
            
            System.out.println("Masukan Password: ");
            passLogin = indar.nextLine();
            
            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("/nLogin Berhasil! Selamat Datang, " + username + "!");
                break;
            } else {
                System.out.println("Username atau Password salah! coba lagi.\n");
            }
        }
    }
}
