package day10_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 * Bir integer list olu�turunuz ve bu listedeki tum say�lar�n karesinin
		 * toplam�n� bulunuz. Sonucu ekrana yazd�r�n�z.
		 */

		List<String> liste = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Listeye atamak �zere elemanlarinizi giriniz: ");
		System.out.println("Yeterli elemana ulasinca 'q' giriniz!");

		String islem = "";
		int sum = 0;

		while (!(islem.equalsIgnoreCase("q"))) {

			System.out.print("sayi giriniz: ");
			islem = scanner.nextLine();

			liste.add(islem);

		}
		liste.remove(liste.size() - 1); // Trick : girilen q silindi.

		for (String w : liste) {  // mehmet hoca each kullan�yor. Haluk hoca String ise wordun k�saltmas� olarak w kullan�yor.
			int y = Integer.parseInt(w);
			sum += y * y;
		}
		System.out.println(liste + " nin elemanlarinin kareleri toplami = " + sum);

	}
}
