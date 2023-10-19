import java.util.Scanner;

public class Pemilihan2Percobaan328 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);

        String Kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        Kategori = input28.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input28.nextInt();

        if (Kategori.equalsIgnoreCase("pekerja")); {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
               pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("penghasil Bersih : " + gajiBersih);
        } if (Kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else;
               pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        } else
            System.out.print("Masukkan Kategori Salah");
    }
}
    

