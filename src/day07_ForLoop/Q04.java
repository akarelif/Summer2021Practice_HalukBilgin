package day07_ForLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// kullan�c�dan 5 adet say� isteyiniz.
		// bu say�lardan 5 ile 10 aras�ndakiler hari� di�erlerinin toplam�n� bulunuz.
		// bu soruyu continue kullanarak ��z�n�z.

		Scanner scan = new Scanner (System.in);
		int sum= 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("l�tfen bir say� giriniz: ");
			int sayi = scan.nextInt();
			if (sayi>=5 && sayi<10) {
				System.err.println("Girdi�iniz say� 5 ile 10 aras�nda oldu�undan toplama yap�lmamaktad�r.");
				continue;
			}else {
				sum+=sayi;				
			}
					}
		System.out.println("Say�lar�n toplam� : "+sum);
		scan.close();
	}

}
