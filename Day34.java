import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner indar = new Scanner(System.in);
	            
	            //Soal Pertama1 
	            System.out.println("Masukan nyawa awal: ");
	            int nyawa = indar.nextInt();
	            nyawa++;
	            nyawa--;
	            System.out.println("Sisah nyawa Terakhir: " + nyawa);
	            
	            //Soal kedua2
	            long saldo = 1000000l;
	            System.out.println("Uang ditabung: ");
	            long uangditabung = indar.nextLong();
	            saldo += uangditabung; 
	            System.out.println("uang yang diambil: ");
	            long uangdiambil = indar.nextLong();
	            saldo -= uangdiambil;
	            System.out.println("Saldo akhir: Rp " + String.format ("%,d", saldo));
	            
	            //Soal tiga3
	            System.out.println("Kode system: ");
	            int kodesistem = indar.nextInt();
	            System.out.println("kode user: ");
	            int kodeuser = indar.nextInt();
	            System.out.println("login berhadil: " + (kodesistem == kodeuser));
	            System.out.println("Login gagal: " + (kodesistem != kodeuser));
	            
	            //Soal empat4
	            System.out.println("Umur perserta: ");
	            int umur = indar.nextInt();
	            System.out.println("Boleh ikut lombah: " + (umur > 17));
	            
	            //Soal lima5
	            System.out.println("Nilai ujian: ");
	            int nilai = indar.nextInt();
	            System.out.println("Siswa lulus: " + (nilai >= 75 ));
	            
	            //Soal enam6
	            System.out.print("Nilai siswa: ");
            int nilaii = indar.nextInt();
	            indar.nextLine();
            System.out.print("Kehadiran: ");
            int kehadiran = indar.nextInt();
            System.out.println("Berhak beasiswa: " + (nilai >= 85 && kehadiran >= 90));
	            
	            //Soal tujuh7
	            System.out.println("Status kartu member (true/false): ");
	            String statusmember = indar.next();
	            boolean kartumember = Boolean.parseBoolean(statusmember);
	            System.out.println("jumblah barang: " );
	            int jumblahbarang = indar.nextInt();
	            System.out.println("Dapat diskon: " + (kartumember || jumblahbarang < 3 ));
	            
	            //Soal delapan8
	            System.out.print("Status hari libur (true/false): ");
	            String statusLiburStr = indar.next();
             boolean statusLibur = Boolean.parseBoolean(statusLiburStr);
             System.out.println("Harus bekerja: " + !statusLibur);
	            
	            }
}
