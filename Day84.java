public class day84 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 20};
        int besar = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > besar ) {
                besar = arr[i];
            }
        }
        System.out.println("ANGKA MAXSIMAL DALAM ARRAY ADALAH: " + besar);
    }
}
