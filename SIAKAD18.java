import java.util.Scanner;

public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        //input data diri mahasiswa
        System.out.println("---------------------DATA DIRI MAHASISWA---------------------");
        System.out.print("Masukkan Nama\t\t: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen\t: ");
        absen = sc.nextByte();

        //input nilai mahasiswa
        System.out.println("-----------------------Nili Mahasiswa------------------------");
        System.out.print("Masukkan nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian\t: ");
        nilaiUjian = sc.nextDouble();

        System.out.println("---------------------------Maka-------------------------------\n");
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUjian)/3;
        System.out.println("Mahasiwa dengan nama " +nama+ " NIM = " +nim+ " kelas "+kelas+ " No. absen = "+absen);
        System.out.println("Nilai akhir \t\t: " +nilaiAkhir);

        String nilaiHuruf, kualifikasi;
        double nilaiSetara;

        if (80 < nilaiAkhir && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
        } else if (73 < nilaiAkhir && nilaiAkhir <=80){
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (65 < nilaiAkhir && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
        } else if (60 < nilaiAkhir && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";
        } else if (50 < nilaiAkhir && nilaiAkhir <=60){
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
        } else if (39 < nilaiAkhir && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal";
      }
      System.out.println("Nilai Huruf\t\t: "+nilaiHuruf);
      System.out.println("Nilai Setara\t\t: "+nilaiSetara);
      System.out.println("Kualifikasi\t\t: "+kualifikasi);

      sc.close();

    }
    
}
