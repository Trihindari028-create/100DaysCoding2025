public class Main {
	public static void main(String[] args) {
        int M = 3;
        int N = 20;
        
        System.out.println("Bilangan kelipatan " + M + " dari 1 hingga " + N + " adalah:");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
}
}
