import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner indar = new Scanner(System.in);
	    
	            System.out.print("Masukan umur kamu: ");
	            int umur = indar.nextInt();
	            if (umur >= 18 ){
	                        System.out.println("Umur kamu sudah cukup dewasa: ");
	                        System.out.print("apa kamu sudah kerja? (ketik 'ya', 'n' untuk tidak): ");
	                        String kerja = indar.next();
	                        if (kerja.equals("ya")){
	                                    System.out.println("selamat! anda boleh mendaftar kuliah. ");
	                        } else {
	                                    System.out.println("Maaf anda belum cukup umur untuk kuliah. ");
	                        }
	            } else {
	                        System.out.println("Maaf anda masi anak-anak. ");
	            }
	}
}
