import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        int jumlahSiswa, nilai, totalNilai =0;
        double rata;
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa : ");
        jumlahSiswa = s.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai Siswa "+i+" : ");
            nilai = s.nextInt();
            totalNilai = totalNilai+nilai;
            
        }
        rata = totalNilai/jumlahSiswa;
        System.out.println("Total Nilai = "+totalNilai);
        System.out.println("Rata-Rata Nilai = "+rata);

        s.close();
    }

}
