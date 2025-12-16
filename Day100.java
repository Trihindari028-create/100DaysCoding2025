import java.util.Scanner;
public class day100 {
    public static void main(String[] args) {
        Scanner indar = new Scanner (System.in);
        String input = indar.nextLine();
        
        int posI = -1;
        int posS = -1;
        int posC = -1;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'I') {
                posI = i;
                break;
            }
        }
        
        if (posI != -1) {
            for (int i = posI + 1; i < input.length(); i++) {
                if (input.charAt(i)== 'S') {
                    posS = i;
                    break;
                }
            }
            
            if (posS != -1) {
                for (int i = posC + 1; i < input.length(); i++) {
                    if (input.charAt(i) == 'C') {
                        posC = i;
                        break;
                    }
                }
            }
            
            if (posI != -1 && posS != -1 && posC != -1) {
                System.out.println("CANTIK");
            } else {
                System.out.println("TIDAK CANTIK");
            }
        }
        
    }
}
