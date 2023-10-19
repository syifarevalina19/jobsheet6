import java.util.Scanner;

public class ModifikasiPercobaan2 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        
        System.out.println("Masukkan sudut1");
        int sudut1 = input28.nextInt();
        System.out.println("Masukkan sudut2");
        int sudut2 = input28.nextInt();
        System.out.println("Masukkan sudut3");
        int sudut3 = input28.nextInt();
        
        int totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 ==90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == 80) || (sudut2 == 80) || (sudut3 ==80))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
             else if ((sudut1 == 70) || (sudut2 == 70) || (sudut3 ==70))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }else
            System.out.println("Bukan Segitiga");


    }
}
