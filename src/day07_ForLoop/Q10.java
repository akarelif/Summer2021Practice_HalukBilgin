package day07_ForLoop;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		    /*Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldu�unu,
		    de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf de�ilse yada
		            1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen harfi b�y�k yada k���kl���ne duyarl�d�r.)
		    Sesli harfler: a,e,i,o,u
		    Test Data:
		    a
		    Beklenen ��kt�:
		    a harfi sesli harfdir.
		    Test Data:
		    d
		    Beklenen ��kt�:
		    d harfi sesiz harftir.
		    Test Data:
		    we  yada %
		    Beklenen ��kt�:
		    Yanlis karakter girdiniz!
		     */
		    

		        Scanner scan = new Scanner(System.in);

		        System.out.print("harf giriniz: ");
		        String kelime = scan.nextLine();

		        String sesliHarf = "aeuoiAEUOI";
		        if (kelime.length()==1) {


		            for (int i = 0; i <= sesliHarf.length(); i++) {
		                if (kelime.charAt(0) == sesliHarf.charAt(i)) {
		                    System.out.println("sesli");
		                    break;
		                } else {
		                    System.out.println("sessiz");
		                    break;
		                }
		            }
		        }else System.out.println("Yanlis karakter girdiniz!!!");

	}}


