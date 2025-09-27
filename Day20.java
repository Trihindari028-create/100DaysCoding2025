public class Main {
	public static void main(String[] args) {
	        int f = 2205;
	        
        String str1 = "" + f;
        String str2 = String.valueOf(f);
        String str3 = Integer.toString(f);
	        
        System.out.println("Angka asli (int): " + f);
        System.out.println("Cara 1 ('' + angka): " + str1);
        System.out.println("Cara 2 (String.valueOf()): " + str2);
        System.out.println("Cara 3 (Integer.toString()): " + str3);
        
	}
}
