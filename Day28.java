public class Main {
	public static void main(String[] args) {
	    int i = 5;
        int f = 5;
        int t = 10;

        // Cek sama (==)
        System.out.println("i == f: " + (i == f));  // true, karena 5 sama 5
        System.out.println("i == t: " + (i == t));  // false, karena 5 beda 10
        // Cek beda (!=)
        System.out.println("i != f: " + (i != f));  // false, karena sama
        System.out.println("i != t: " + (i != t));  // true, karena beda
    }
}
