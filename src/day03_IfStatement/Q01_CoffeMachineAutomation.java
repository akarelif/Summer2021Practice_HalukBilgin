package day03_IfStatement;

import java.util.Scanner;

public class Q01_CoffeMachineAutomation {

	public static void main(String[] args) {
		/*
		 * 1. Basit bir Kahve makinesi olu�turun. 3 �e�it kahvemiz olsun. 2. Sistem �u
		 * soruyu sorsun: "Hangi Kahveyi istersiniz?" 3.Bu soru ile birlikte kullan�c�
		 * kahve bilgilerini g�rs�n. �rn: Hangi Kahveyi �stersiniz? 1.T�rk kahvesi
		 * 2.Filtre Kahve 3.Espresso
		 * 
		 * String hangiKahve olu�turun ve var olan kahvelerden birini yaz�n�z. (�rn:
		 * T�rk Kahvesi, ya da t�rk kahvesi. ---> B�y�k- k���k harf duyarl� olmamas�
		 * i�in String methodu kullan�n.) todo 1. Ko�ul b�l�m� E�er kahve T�rk kahvesi
		 * ise, konsola = T�rk kahvesi haz�rlan�yor. yazs�n.(D�md�z T�rk kahvesi
		 * yazmay�n. String hangiKahve'yi �a��r�n!!) E�er filtre kahve ise, konsola =
		 * Filtre kahve haz�rlan�yor. yazs�n. (String hangiKahve'yi kullan�n !) E�er
		 * Espresso ise, konsola = Espresso haz�rlan�yor... yazs�n. (String
		 * hangiKahve'yi kullan�n !) E�er yanl�� harf girerseniz, konsola = Hatal�
		 * tu�lama yapt�n�z. yazs�n. (Hatal� tuslamadan sonra kod cal�smaya devam
		 * edecektir, o konuyu daha g�rmediniz bu y�zden bastan baslat�n.) todo
		 * ---------------------------------- Sistem bize �u soruyu sorsun:
		 * "S�t eklememizi ister misiniz ? (Evet veya Hay�r olarak cevaplay�n�z):    "
		 * Konsolda aynen b�yle yazmal�. Parantez i�i de konsolda olsun. String sut
		 * olusturun. todo 2.Ko�ul B�l�m� e�er String sut, evet e e�itse,konsola, S�t
		 * ekleniyor... yaz�s� gelsin. -- (B�y�k k���k harf duyarl� olmamas� i�in String
		 * methodu kullan�n. Olmas� gereken ihtimaller: Evet, EVET, EvEt,EVEt vs. e�er
		 * String sut, hay�r a e�it ise, konsola , S�t eklenmiyor yaz�s� gelsin. todo
		 * ---------------------------------- Sistem bize
		 * "�eker ister misiniz ? (Evet veya hay�r cevab�n� veriniz) : " �eklinde bir
		 * soru sorsun. (B�y�k k���k harf duyarl�l�g� olmamas� i�in string method
		 * kullan�n. String seker olu�turunuz. todo 3.Ko�ul B�l�m� todo if(){ E�er
		 * String seker Evet e e�itse , sistem bize "Ka� �eker olsun?" sorusunu sormal�.
		 * Sorunun alt�na int kacSeker olu�turunuz. �eker say�s�n� giriniz. Ve konsola
		 * �unu yazd�r�n�z �rnek: 5 �eker ekleniyor. (ipucu: Bu kodlar�n heosi if
		 * blo�unun i�erisinde olacak) todo } todo else{ E�er String �eker hay�r 'a
		 * e�itse, sistem bize "�eker eklenmiyor" cevab�n� versin. ONEML� !! = bir int
		 * girdisinden sonra String girdisi yapacaksak,araya bo� bir nextLine koymam�z
		 * gerekiyor. (String bosKod = sc.nextLine(); ) dummy kod ekleyiniz. Sistem bize
		 * "Hangi boyutta olsun? (B�y�k boy - orta boy - k���k boy olarak giriniz.) :
		 * sorusunu sorsun. (b�y�k k���k harf duyarl�l�g� olmamal�. yani kullan�c� b�y�k
		 * boy veya B�Y�K Boy girdiginde kabul etmeli. String boyut olu�turun... todo
		 * 4.Ko�ul B�l�m� e�er String boyut B�y�k boy' a e�itse = Kahveniz b�y�k boy
		 * haz�rlan�yor. (B�y�k boy k�sm�n� String boyut'u kullanarak yazal�m=
		 * "Kahveniz" + boyut + "haz�rlan�yor.") E�er String boyut Orta Boy'a e�itse =
		 * Kahveniz orta boy haz�rlan�yor.. ("Kahveniz" + boyut + "haz�rlan�yor.) E�er
		 * String boyut K���k boy'a e�itse = Kahveniz k���k boy haz�rlan�yor. yazs�n.
		 * ("Kahveniz" + boyut + "haz�rlan�yor.) //todo SONU� B�L�M� Sipari�lerimizi
		 * verdik. Son hali g�rmek istiyoruz. konsola �unu yazd�r�n �rnek : T�rk Kahvesi
		 * orta boy haz�rd�r. Afiyet olsun !!! (T�rk kahvesi i�in String hangiKahveyi
		 * kullan�n. orta boy i�in de String boyut ' u kullan�n.) todo A��klama :
		 * Projeyi bilerek biraz zor haz�rlad�k. �zerinde fazla fazla kafa yorman�z ve
		 * "grup�a �al��man�z i�in" b�yle d�zenledik. Yapamayan arkada�lar kesinlikle
		 * canlar�n� s�kmas�n. Size �ok zor gelebilir. Ancak ad�m ad�m ilerlerseniz,
		 * grup ile ��zerseniz ve yazd���m notlar� tamamen uygularsan�z
		 * halledebilirsiniz. ��renmedi�iniz hi�bir �ey yok. Sadece biraz kar���k. Bir
		 * �dev ��z�m� g�n� yapaca��z. Bunun haberini ilerleyen g�nlerde size verece�im.
		 * Ancak arkada�lar�n�zla beraber Voice Channel larda �dev �zerine
		 * tart��abilirsiniz. HERKESE KOLAY GELS�N !! :)
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("*********KAHVE MAKINESI********");
		System.out.println("----Menude Bulunan Kahveler----");
		System.out.println("1.T�rk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso");

		System.out.print("Hangi kahveyi istersiniz : ");
		String hangiKahve = scanner.nextLine();

		if (hangiKahve.equalsIgnoreCase("T�rk Kahvesi")) {
			System.out.println("T�rk kahvesi haz�rlan�yor...");
		} else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")) {
			System.out.println("Filtre kahve haz�rlan�yor...");
		} else if (hangiKahve.equalsIgnoreCase("Espresso")) {
			System.out.println("Espresso haz�rlan�yor...");
		} else {
			System.out.println("Hatal� tu�lama yapt�n�z.Tekrar deneyiniz...");
		}

		System.out.print("\nS�t eklememizi ister misiniz? (Evet yada Hay�r olarak cevaplay�n�z) : ");
		String sut = scanner.nextLine();

		if (sut.equalsIgnoreCase("Evet")) {
			System.out.println("S�t ekleniyor...");
		} else if (sut.equalsIgnoreCase("Hay�r")) {
			System.out.println("Sut eklenmiyor...");
		} else {
			System.out.println("Hatali islem yaptiniz...");
		}

		System.out.print("\nSeker ister misiniz? (Evet yada Hay�r) : ");
		String seker = scanner.nextLine();

		if (seker.equalsIgnoreCase("Evet")) {
			System.out.print("Ka� seker olsun: ");
			int kacSeker = scanner.nextInt();
			scanner.nextLine();
			System.out.println(kacSeker + " seker ekleniyor");
		} else if (seker.equalsIgnoreCase("Hay�r")) {
			System.out.println("�eker eklenmiyor ");
		} else {
			System.out.println("Hatal� giris yapt�n�z. Tekrar deneyiniz...");
		}

		System.out.print("\nHangi boyutta olsun (Buyuk Boy-Orta Boy-Kucuk Boy) : ");
		String boyut = scanner.nextLine();

		if (boyut.equalsIgnoreCase("Buyuk Boy")) {
			System.out.println("Kahveniz " + boyut + " haz�rlan�yor");
		} else if (boyut.equalsIgnoreCase("Orta Boy")) {
			System.out.println("Kahveniz " + boyut + " haz�rlan�yor");
		} else if (boyut.equalsIgnoreCase("Kucuk Boy")) {
			System.out.println("Kahveniz " + boyut + " haz�rlan�yor");
		} else {
			System.out.println("Hatal� g�r�s yapt�n�z. Tekrar deneyiniz...");
		}

		System.out.println("\n" + hangiKahve + " " + boyut + " hazirdir.Afiyet olsun !!!");
		scanner.close();
	}

}
