package proje1_Market;

public class Planning {
	/* Basrili Market al��-veri� program�.
    *
    * 1. Ad�m: �r�nler ve fiyatlar� i�eren listeleri olu�turunuz.
    *          No     �r�n         Fiyat
              ====  =======        =========
               00   Domates         2.10 TL
               01   Patates         3.20 TL
               02   Biber           1.50 TL
               03   So�an           2.30 TL
               04   Havu�           3.10 TL
               05   Elma            1.20 TL
               06   Muz             1.90 TL
               07   �ilek           6.10 TL
               08   Kavun           4.30 TL
               09   �z�m            2.70 TL
               10   Limon           0.50 TL
    * 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini isteyiniz.
    * 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz.
    * 4. Ad�m: Al�nacak bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z.
    * 5. Ba�ka bir �r�n al�p almak istemedi�ini sorunuz.
    * 6. E�er devam etmek istiyorsa yeniden �r�n se�me k�sm�na y�nlendiriniz.
    * 7. E�er bitirmek istiyorsa �deme k�sm�na ge�iniz ve �dem sonras�nda program� bitirinzi.
    */
	 
	/*
    1) �r�nler (String) ve �r�n fiyatlari(double) i�in ayri ayri list olu�turulmali.
    list ler class levelde omali cunku: main metod harici diger metodlarda kullan�lacak
    Listenen urunleri bir method() ile kullan�c�ya g�sterilmeli  yazdiran bir method olmali
     bu method bir cikti vermeyecegi ve sadece println calisagi icin return type void prmtsiz olmali.
    method --> public static void urunListele(){for, println(i+urun+fiyat)} olu�turaca��m�z method de�i�mesin o y�zden static olmal� 
    URUNUL�STELE
    2) 
    scanner class'indan obj creat edilmeli. urunListele() method call edilerek kullan�c� ekran�na 
    urun listesi g�sterilmeli.kullan�c�dan urun kodu ve urun miktari istenmeli(println)
    int urunNo= kullanicinin girdigi urun kodu atanmali 
    double kg= kullanicinin girdigi urun miktari kg atanmali 
    SEPETE URUN EKLE
    3)musteri i�in alisveris sepeti olusturulmali. sepetUrunler list(String) sepetKg list(double)
    sepetFiyat list(double) 
    public static void sepeteEkle(int urunKodu, double kg){sepetFiyat=urunFiyati*kg__list(double)}
    
    her sepet alisverisinden sonra olusan sepet fiyatini toplLAYAN B�R PR�M�T�VE (double) toplamFiyat olusturlmali
  	toplamFiyat+=sepetFiyati  
  
  	4) sepete eklenen urunler miktari toplamFiyati vs sepetin son durumunu hesaplatip yazdirilimali ki 
  	kullan�c� devem etmeyecei�ni sorabilelim.
   	public static double(toplamFiyat) sepetYazdir(){println(urunler+ fiyat+kg)}
   
   	5) kullan�c�ya alisverise devam edip etmecegi sorulmali.kullanici cevabi:boolean(true/false) String(e/h) int (1/0)) 
   	cevap verisine gore islem akisi icin  if kontrolu olmali--> cevap vet ise tum �slemler bastan tekrar edilmeli
   	do-While(cevap)--cevap evet ise "do" hay�rsa alisveris bitirilmeli odeme talep edilmeli.
   
   	6) public static void odeme(println(double toplamFiyat){println()}
   
   
   
     */
	

}
