package day06_StringManipulation;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		System.out.println("**** JAVA MARKET'E HO�GELD�N�Z ****");
		Scanner scan = new Scanner (System.in);
		System.out.print("L�TFEN �R�NDEN KA� ADET ALACA�INIZI G�R�N�Z: ");
		int adet = scan.nextInt();
		System.out.print("L�TFEN �R�N�N F�YATINI G�R�N�Z: ");
		double fiyat = scan.nextDouble();
		double indFiyat;
		System.out.println("*** JAVA CARD'INIZ VAR MI? E/H");
		char card= scan.next().toUpperCase().charAt(0);
		if (card == 'E') {
			if (adet>10) {
				indFiyat=adet*fiyat*0.15;
				fiyat=((adet*fiyat)-indFiyat);
				System.out.println(fiyat);
			}else {
				indFiyat=adet*fiyat*0.15;
				fiyat=((adet*fiyat)-indFiyat);
				System.out.println(fiyat);
			}
		}else
			if (adet>10) {
				indFiyat=adet*fiyat*0.15;
				fiyat=((adet*fiyat)-indFiyat);
				System.out.println(fiyat);
			}else {
				indFiyat=adet*fiyat*0.1;
				fiyat=((adet*fiyat)-indFiyat);
				System.out.println(fiyat);
			}
		scan.close();
		
	}}


