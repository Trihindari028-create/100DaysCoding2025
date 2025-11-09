public class Main {
	public static void main(String[] args) {
		int N = 6;
		long hasil = 1;
		for (int i = 1; i <= N; i++) {
			hasil *= i;
		}
		System.out.println("barang dari 1 sampai "+ N + " adalah: " + hasil);
	}
}
