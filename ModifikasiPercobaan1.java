import java.util.Scanner;

public class ModifikasiPercobaan1 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input28.nextInt();
        
        if ((tahun % 400) == 0){
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        }else;
            System.out.println("Bukan Tahun Kabisat");
    }
}
