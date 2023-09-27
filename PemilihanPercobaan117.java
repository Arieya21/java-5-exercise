import java.util.Scanner;

public class PemilihanPercobaan117{
    public static void main(String[] args) {
        Scanner input17= new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka= input17.nextInt();

       String jenisangka = (angka % 2 == 0) ? "genap" : "ganjil";
       System.out.println(angka + " adalah angka " + jenisangka);
    }
}
