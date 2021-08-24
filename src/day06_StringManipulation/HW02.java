package day06_StringManipulation;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		/* Problem Tan�m� :
        Basit 4 i�lem yapan bir hesap makinesi methodu kodlay�n�z....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalin�z.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdir�n�z.
        */
		System.out.println("**** HESAP MAK�NES� ****");
		Scanner scan = new Scanner (System.in);
		System.out.print("1.say�y� giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.print("2.say�y� giriniz: ");
		double sayi2 = scan.nextDouble();
		System.out.println("L�TFEN YAPMAK �STED���N�Z ��LEM� SEMBOLUNU G�R�N�Z:\n+ TOPLAMA \n- �IKARMA \n* �ARPMA \n/ B�LME ");
		char sembol = scan.next().charAt(0);
		double sonuc;
		if (sembol =='+') {
			sonuc= sayi1+sayi2;
			System.out.print(sonuc);
		}else if(sembol =='-') {
			sonuc= sayi1-sayi2;
			System.out.print(sonuc);
		}else if(sembol =='*') {
			sonuc= sayi1*sayi2;
			System.out.print(sonuc);
		}else if(sembol =='/') {
			
			if (sayi2 == 0) {
				System.out.println("SIFIRA B�LME ��LEM� GE�ERS�ZD�R.");
			}else {
				sonuc= sayi1/sayi2;
				System.out.print(sonuc);
			}
		}else {
			System.out.println("L�TFEN GE�ERL� B�R ��LEM G�R�N�Z.");
		}
		
		
		
		
		
	}

}
