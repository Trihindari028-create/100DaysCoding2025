public class Main {
    public static void main(String[] args) {
        char huruf = 'A';
        boolean isVokal = false;
        
        if (huruf == 'A' || huruf == 'a' || huruf == 'I' || huruf == 'i' ||
            huruf == 'U' || huruf == 'u' || huruf == 'E' || huruf == 'e' ||
            huruf == 'O' || huruf == 'o') {
            isVokal = true;
        }
        System.out.println("Huruf: " + huruf);
        System.out.println("Apakah huruf vokal? " + isVokal);
    }
}
