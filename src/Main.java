import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        //Kullanıcıdan Alınan Değerler
        Scanner inp = new Scanner(System.in);
        System.out.print("a değerini giriniz: ");
        a = inp.nextInt();

        System.out.print("b değerini giriniz: ");
        b = inp.nextInt();

        System.out.print("c değerini giriniz: ");
        c = inp.nextInt();
//İşlem Sonuc Kısmı
        int sonuc = a + b * c - b;
                System.out.print("işlem Sonucu: " + sonuc);

    }
}