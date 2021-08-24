package proje1_Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

	/*
	 * Basrili Market al��-veri� program�.
	 *
	 * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.
	 * 
	 * No �r�n Fiyat ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02
	 * Biber 1.50 TL 03 So�an 2.30 TL 04 Havu� 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90
	 * TL 07 �ilek 6.10 TL 08 Kavun 4.30 TL 09 �z�m 2.70 TL 10 Limon 0.50 TL
	 * 
	 * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz. 3.
	 * Ad�m: Ka� kg sat�n almak istedi�ini sorunuz. 4. Ad�m: Al�nacak bu �r�n�
	 * sepete ekleyiniz ve Sepeti yazd�r�n�z. 5. Ba�ka bir �r�n al�p almak
	 * istemedi�ini sorunuz. 6. E�er devam etmek istiyorsa yeniden �r�n se�me
	 * k�sm�na y�nlendiriniz. 7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve
	 * �dem sonras�nda program� bitirinzi.
	 */

	static List<String> urunler = new ArrayList<>();
	static List<Double> fiyatlar = new ArrayList<>();
	static List<String> sepetUrunler = new ArrayList<>();
	static List<Double> sepettekiUrunFiyati = new ArrayList<>();
	static List<Double> sepetUrunKg = new ArrayList<>();

	static double toplamFiyat = 0;
	static int secim = 1;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		urunler.add("Domates");
		urunler.add("Patates");
		urunler.add("Biber");
		urunler.add("So�an");
		urunler.add("Havu�");
		urunler.add("Elma");
		urunler.add("Muz");
		urunler.add("�ilek");
		urunler.add("Kavun");
		urunler.add("�z�m");
		urunler.add("Limon");

		fiyatlar.add(2.10);
		fiyatlar.add(3.20);
		fiyatlar.add(1.50);
		fiyatlar.add(2.30);
		fiyatlar.add(3.10);
		fiyatlar.add(1.20);
		fiyatlar.add(1.90);
		fiyatlar.add(6.10);
		fiyatlar.add(4.30);
		fiyatlar.add(2.70);
		fiyatlar.add(0.50);

		System.out.println("                   JAVA MANAV'a HOS GELDINIZ!");

		do {

			menu();

		} while (secim == 1);

		int sepetSayac = 1;

		for (int i = 0; i < sepetUrunler.size(); i++) {

			if (sepetSayac == 1) {

				System.out.print("\n" + "Sepetinizdeki Urunler " + "\n" + "=================================" + "\n"
						+ sepetSayac + ". urun" + "\n" + sepetUrunler.get(i) + "\n" + "Urunun kg fiyati "
						+ sepettekiUrunFiyati.get(i) + "\n" + "Aldiginiz kg " + sepetUrunKg.get(i) + " " + "\n");
			} else {

				System.out.print("\n" + sepetSayac + ". urun" + "\n" + sepetUrunler.get(i) + "\n" + "Urunun kg fiyati "
						+ sepettekiUrunFiyati.get(i) + "\n" + "Aldiginiz kg " + sepetUrunKg.get(i) + " " + "\n");

			}

			sepetSayac++;

		}

		System.out.println("\n" + "Sepetinizin toplam tutari ==> " + toplamFiyat + "TL ");
		double para = 0;

		do {

			System.out.println("\n" + "Odeme yapmak icin vereceginiz tutari giriniz: ");
			para = scan.nextInt();

			if (para >= toplamFiyat) {

				System.out.println("Para ustunuz: " + (para - toplamFiyat) + "TL");
			} else {

				System.out.println("Eksik tutar girdiniz, en az " + toplamFiyat + "TL girmelisiniz!");
			}

		} while (para < toplamFiyat);

		System.out.println("\n" + "JAVA MANAV'I TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ!");

	}

	public static void menu() {

		System.out.println("\n" + "                   No    �r�n            Fiyat\r\n"
				+ "                  ====  =======        =========\r\n"
				+ "                   0   Domates         2.10 TL\r\n"
				+ "                   1   Patates         3.20 TL\r\n"
				+ "                   2   Biber           1.50 TL\r\n"
				+ "                   3   So�an           2.30 TL\r\n"
				+ "                   4   Havu�           3.10 TL\r\n"
				+ "                   5   Elma            1.20 TL\r\n"
				+ "                   6   Muz             1.90 TL\r\n"
				+ "                   7   �ilek           6.10 TL\r\n"
				+ "                   8   Kavun           4.30 TL\r\n"
				+ "                   9   �z�m            2.70 TL\r\n"
				+ "                   10  Limon           0.50 TL\r\n" + "");

		System.out.println("Lutfen almak istediginiz urunun barkod numarasini giriniz: ");
		int urunNo = scan.nextInt();
		System.out.println("Lutfen kac kg almak istediginiz giriniz: ");
		double urunKilo = scan.nextDouble();

		sepetListele(urunNo, urunKilo);

	}

	public static void sepetListele(int urunNo, double urunKilo) {

		sepetUrunler.add(urunler.get(urunNo));
		sepettekiUrunFiyati.add(fiyatlar.get(urunNo));
		sepetUrunKg.add(urunKilo);
		double sepetFiyat = urunKilo * fiyatlar.get(urunNo);
		toplamFiyat += sepetFiyat;

		int sayac = 1;

		for (int i = 0; i < sepetUrunler.size(); i++) {

			if (sayac == 1) {

				System.out.print("\n" + "Sepetinizdeki Urunler " + "\n" + "=================================" + "\n"
						+ sayac + ". urun" + "\n" + sepetUrunler.get(i) + "\n" + "Urunun kg fiyati "
						+ sepettekiUrunFiyati.get(i) + "\n" + "Aldiginiz kg " + sepetUrunKg.get(i) + " " + "\n");
			} else {

				System.out.print("\n" + sayac + ". urun" + "\n" + sepetUrunler.get(i) + "\n" + "Urunun kg fiyati "
						+ sepettekiUrunFiyati.get(i) + "\n" + "Aldiginiz kg " + sepetUrunKg.get(i) + " " + "\n");

			}

			sayac++;
		}

		System.out.println("\n" + "Sepetinizin toplam tutari ==> " + toplamFiyat + "TL ");

		tamamMiDevamMi();
	}

	public static void tamamMiDevamMi() {
		System.out.println();
		System.out.println("=================================");
		System.out.println("Sepeti onaylip odeme yapmak istiyorsaniz '0' alisverise devam etmek istiyorsaniz '1'");

		secim = scan.nextInt();
	}
}
