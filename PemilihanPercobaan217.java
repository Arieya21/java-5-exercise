import java.util.Scanner;

public class PemilihanPercobaan217{
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float uas = input17.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input17.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input17.nextFloat();
        System.out.print("Nilai Tugas   : ");
        float tugas = input17.nextFloat();

        float total = (uas * 0.40f) + (uts * 0.30f) + (kuis * 0.1f) + (tugas * 0.2f);
        System.out.println("Nilai Akhir \t\t:" + total);

        if(total >= 81){
            System.out.println("Anda mendapat Nilai huruf A");
        }
        else if(total >= 74){
            System.out.println("Anda mendapatkan Nilai huruf B+");
        }
        else if(total >= 66){
            System.out.println("Anda mendapatkan Nilai huruf B+");
        }
        else if(total >= 61){
            System.out.println("Anda mendapatkan Nilai C+");
        }
        else if(total >= 51){
            System.out.println("Anda mendapatkan Nilai C");
        }
        else if(total >= 38){
            System.out.println("Anda mendapatkan Nilai D");
        }
        else if(total >= 0){
            System.out.println("Anda mendapatkan Nilai huruf E");
        }
        input17.close();
    }
}