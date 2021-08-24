package day03_IfStatement;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Kullan�c�dan �� adet say� alarak bu say�lar�n
        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
        (Yard�m: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
        ba�lant�s�ndan yararlanabilirsiniz)
        �rnek Ekran ��kt�s�
        birinci kenar� giriniz: 2
        ikinci kenar� giriniz 15
        ���nc� kenar� giriniz: 7
        Bu bir dik ��gen de�ildir.
        Bu bir dik ��gendir
     */

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Birinci say�y� giriniz: ");
        a = scanner.nextInt();

        System.out.print("�kinci say�y� giriniz: ");
        b = scanner.nextInt();

        System.out.print("���nc� say�y� giriniz: ");
        c = scanner.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println("Bu bir dik ��gendir.");
        } else if ((a * a) + (c * c) == b * b) {
            System.out.println("Bu bir dik ��gendir.");
        } else if ((b * b) + (c * c) == a * a) {
            System.out.println("Bu bir dik ��gendir.");
        } else {
            System.out.println("Bu ��gen bir dik ��gen de�ildir.");
        }
        scanner.close();

	}

}
