import java.util.Scanner;

public class PemilihanPercobaan317 {
    public static void main(String[] args) {
        double angka1, angka2, hasil;
        char operator;

        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama   : ");
        angka1 = input17.nextDouble();
        System.out.print("Masukkan Angka Kedua     : ");
        angka2 = input17.nextDouble();
        System.out.print("Masukkan Operator (+ - * /) :" );
        operator = input17.next().charAt(0);

        switch(operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " - " + hasil);

            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " - " + hasil);
                break;
            case '*':
                hasil = angka1 = angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid");
            input17.close();
        }
    }
    
}
