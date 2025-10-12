import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
	            
	    System.out.println("Masukan umur kamu");
	    int umur = indar.nextInt();
	    System.out.println("masukan benar/salah");
	   if( umur >= 18 ); {
	   System.out.println("Dewasa");
	    } else {
            System.out.println("Belum Dewasa");
        
	   }
	}
}
