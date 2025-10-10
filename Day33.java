public class Main {
	public static void main(String[] args) {
	    boolean hm = true;
	    if (!hm) {
            System.out.println("Kita harus sadar diri!");  // Tidak akan dieksekusi karena !true = false
        } else {
            System.out.println("Kita harus ingat sadar diri itu penting.");  // Ini yang dieksekusi
        }
}
}
