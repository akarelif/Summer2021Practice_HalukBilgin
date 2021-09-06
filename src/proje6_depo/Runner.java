package proje6_depo;

import java.util.Scanner;

public class Runner {
	/*
	 * basit bir depo projesi
	 * 
	 * �al��an bir fabrikada uygulanan bir sistem olan depo uygulamas�d�r.
	 * 
	 * 1-) burada �ncelikle �r�n�n tan�mlamas�  yap�l�r. id urunIsmi uretici miktar birim ve raf (6 adet fields mevcut)
	 * 
	 * 2-) methodlar olu�turaca��z.
	 * 		urunTanimlama 	==> burda �r�n�n ismi �reticisi ve birimi girilecek. id count yap�larak al�nacak.
	 * 		
	 * 		urunListele 	==> tan�mlanan �r�nler listelenecek. foreack kullanarak �r�nleri listeleyebiliriz.
	 * 		*** burada �r�n�n adeti ve raf numaras� tan�mlama yap�lmad�ysa default de�er g�r�ns�n.
	 * 		
	 * 		urunGirisi 		==> burada listelenen urunlere bakaca��z. giri� yapmak istedi�imiz �r�n�n id numaras�n� girece�iz. 
	 * 		giri� yapmak istedi�imiz �r�n�n id numaras�n� girdikten sonra ne kadar giri� yapmak istedi�imizi yazaca��z. 
	 * 		id numaras�ndaki t�m de�i�ikli�i yaz�draca��z. 
	 * 		
	 * 		urunuRafaKoy 	==> listeden �r�n� se�ece�iz ve id numaras�na g�re �r�n� rafa koyaca��z.
	 * 
	 *		urunCikisi 		==> listeden �r�n� se�ece�iz ve �r�n�n ��k��� yapca��z. burada �r�n listesinden sadece miktarda de�i�iklik yap�lacak.
	 *							�r�n adedi 0dan az olamaz. 0 olunca �r�n tan�mlamas� silinmesin. sadece miktar� 0 olsun. 
	 * 		===> yapt���m�z t�m de�i�iklikler listede de g�r�ns�n. 
	 * 
	 * 
	 * 			id		ismi 	�reticisi	miktar�		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		�r: 1000	 un 	hekimoglu	0 			�uval 		null
	 * 
	 * 		urunGirisi		==> id:1000  �r�n giri�i :5
	 * 		urunListele 	==>
	 * 		
	 * 			id		ismi 	�reticisi	miktar�		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		�r: 1000	 un 	hekimoglu	5 			�uval 		null
	 * 
	 * 		urunuRafaKoy 	==> id:1000 raf : raf1
	 * 		urunListele 	==>
	 * 			id		ismi 	�reticisi	miktar�		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		�r: 1000	 un 	hekimoglu	5 			�uval 		raf1
	 * 
	 * 		urunCikisi 		==> id 1000: �r�n ��k��� : 3 (kalan 2 �uval un)
	 * 		urunListele 	==>
	 * 			id		ismi 	�reticisi	miktar�		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		�r: 1000	 un 	hekimoglu	2 			�uval 		raf1
	 * 
	 * 
	 */
	
	public static int secenek;
	public static void main(String[] args) {
		
		Met01 objm = new Met01();
		
		
		do {
			menu();
			switch (secenek) {
			case 1:
				objm.urunTanimlama();
				break;
			case 2:
				objm.urunListele();
				break;
			case 3:
				objm.urunGirisi();	
				break;
			case 4:
				objm.urunuRafaKoy();	
				break;
			case 5:
				objm.urunCikisi();	
				break;			
			}
			
		} while (secenek!=6);
		System.out.println("�Y� G�NLER D�LER�Z.");
		

	}

	private static void menu() {		
		System.out.println(
				  "+===== MAIN MENU====+\r\n"
				+ "|1: �R�N EKLE       |\r\n"
				+ "|2: �R�NLER� L�STELE|\r\n"
				+ "|3: �R�N G�R���     |\r\n"
				+ "|4: RAF G�R���      |\r\n"
				+ "|5: �R�N �IKI�      |\r\n"
				+ "|6: �IKI�           |\r\n"
				+ "+-------------------+");
		System.out.println("L�TFEN YAPMAK �STED���N�Z ��LEM� SE��N�Z?");
		Scanner scan = new Scanner (System.in);
		secenek=scan.nextInt();
	}

}
