public class day81 {
    public static void main(String[] args) {
        String[] buah = {"nangka", "nanas", "mangga", "alvucado", "apel"};
        
        System.out.println("Elem pertma     : " + buah[0]);
        System.out.println("Elemen kedua    : " + buah[1]);
        System.out.println("Elemen ketiga   : " + buah[2]);
        System.out.println("Elemen keempat  : " + buah[3]);
        System.out.println("Elemen kelima   : " + buah[4]);
        
        buah[2] = "anggur";
        System.out.println(" == SETELAH DIUBAH ==");
        System.out.println("Elemna ketiga   : " + buah [2]);
    }
}
