public class day80 {
    public static void main(String[] args) {
        int [] nilai = {80, 75, 90,85,70,};
        System.out.println("Daftar nilai: ");
        for (int i = 0; i < nilai.length; i++){
            System.out.println("Nilai ke- " + i + ": " + nilai[i]);
        }
        int total = 0;
        for (int i = 0; i < nilai.length; i++){
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("/n Total Nilai: " + total);
        System.out.println("Rata-rata Nilai: " + rataRata);
    }
  
}
