package day04_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// Kullanicidan bir character girmesini isteyiniz
		// Character harf ise kucuk harf olup olmadigini kontrol ediniz
		// Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
		// Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
		// Harf degilse ekrana "Harf degil" yazdiriniz
		// 97:a 122:z ascii de�eri

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir character giriniz : ");
		char ch = scan.next().charAt(0);

		System.out.println("*****  TERNARY ��z�m�  *****");

		String result = ((ch <= 'z' && ch >= 'a') || (ch >= 'A' && ch <= 'Z'))
				? ((ch <= 122 && ch >= 97) ? "Kucuk Harf" : "Buyuk Harf")
				: "Harf Degil";

		System.out.println(result);

		System.out.println("*****  if  ��z�m�  *****");

		if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A')) {
			if (ch <= 122 && ch >= 97) {
				System.out.println("k���k harf");

			} else
				System.out.println("B�y�k harf");

		} else
			System.out.println("Harf de�il");

		scan.close();
	}

}
