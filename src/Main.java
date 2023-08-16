import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("a'nin degerini giriniz :");   
        a = input.nextDouble();
        System.out.print("b'nin degerini giriniz :");
        b = input.nextDouble();
        double c = ((a * a) + (b * b));
        double sonuc = Math.sqrt(c); 
        System.out.println("c'nin degerti :" + sonuc);
    }
}