package day06_StringManipulation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye
		// ayiriniz
		// ad ayri soyad ayri sekilde ekrana yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("ad�n�z� soyad�n�z giriniz : ");
		String adSoyad = scan.nextLine();// mustafa can
		String ad = adSoyad.substring(0, adSoyad.indexOf(" ")); // 0 �nc� indexten bo�lu�a kadar olana ad tan�mlad�
		String soyad = adSoyad.substring(adSoyad.indexOf(" ") + 1); // burada da ad Stringini tan�mlad��� i�in ad stringinin uzunlu�unu baz al�p +1 bo�luk karakterini de al�p substring yap�yor ve args kullanmadan sonuna kadar yazd�r�yor.
		System.out.println("ad�n�z : " + ad + " \nsoyad�n�z : " + soyad);
		scan.close();
	}

}
