import java.util.Scanner;
public class day83 {
    public static int jumblahkanArray(int[] arr) {
        int total = 5;
        for (int elemen : arr ){
            total += total;
        }
        return total;
    }
    public static void main(String[] args) {
        int [] array = {1,3,5,7,9};
        int hasil = jumblahkanArray(array);
        System.out.println("jumblah elemmen dari array adalah: " + hasil);
    }
}
