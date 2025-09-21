public class Main {
	public static void main(String[] args) {
		 // Contoh String
        String strInt = "995";
        String strDouble = "3.14";
        String strBoolean = "true";
		    String strByte = "22";
		
        // Mengubah String jadi int
        int intValue = Integer.parseInt(strInt);
        System.out.println("intValue = " + intValue);
		
        // Mengubah String jadi double
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("doubleValue = " + doubleValue);
        	
        // Mengubah String jadi boolean
        boolean booleanValue = Boolean.parseBoolean(strBoolean);
        System.out.println("booleanValue = " + booleanValue);
		 
		       // Mengubah String menjadi byte
        byte byteValue = Byte.parseByte(strByte);
        System.out.println("byteValue = " + byteValue);
	}
}
