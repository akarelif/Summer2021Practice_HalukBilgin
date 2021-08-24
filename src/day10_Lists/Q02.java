package day10_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
		//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki t�m elemanlar� bir
		//		listeye kopyalayan ve harf s�ras�na g�re yazd�ran bir METHOD yaz�n�z.
		//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
		//		Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]

		String isim[][] = { { "Ali", "Veli", "Ayse" }, { "Hasan", "Can" }, { "Suzan" } };
		
		/*
		 * "Ali", "Veli", "Ayse" -->0. kat "Hasan", "Can" -->1.kat "Suzan" -->.kat
		 * 
		 */
		
		yeniList(isim);
	}

	public static void yeniList(String str[][]) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < str.length; i++) {// katlara girii i�in kat kontrolu yap�ldo
			for (int j = 0; j < str[i].length; j++) {// her kattaki daireye giri� i�in daire kontrolu yap�ld�.
																	
				list.add(str[i][j]);// girdi�imiz her kat�n her dairesini list i�ine att�k

			}

		}
		System.out.println("s�ralamada �nceki list: " + list);
		Collections.sort(list);// list'i naturel order'eg�re harf s�ras�n� yapt�rd�k.
		System.out.println("listin s�ralanmm�� hali:" + list);
	}

}
