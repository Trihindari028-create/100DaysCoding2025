public class Main {
	public static void main(String[] args) {
      int f = 22;
	    int i = 06;
	    System.out.println("Sebelum Penukaran Angka");
	    System.out.println("Nilai f: " + f);
	    System.out.println("Nilai i: " + i);
		
	    f = i + f;
	    i = f - i;
	    f = f - i;
	    System.out.println("\nSesudah Penukaran");
	    System.out.println("Nilai f: " + f);
	    System.out.println("Nilai i: " + i);
	}
}
