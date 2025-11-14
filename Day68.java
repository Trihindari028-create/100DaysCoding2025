public class Main {
	public static void main(String[] args) {
		int ukuran = 6;
        
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
               
                if (i == 0 || i == ukuran - 1 || j == 0 || j == ukuran - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
	}
}
}
