package day12_maps;

import java.util.HashMap;

public class Q2 {
	public static void main(String[] args) {
		// Ad ve soyad bulunduruan iki ayr� array'i ad=soyad seklinde yazd�r�n�z.
		// input : {"ahmet", "ahmet can", "haluk"}; {"�eref", "erdem", "bilgin"};
		// output : {ahmet=�eref, ahmet can=erdem, haluk=bilgin};

		String ad[] = { "ahmet", "ahmet can", "haluk" };
		String soyad[] = { "�eref", "erdem", "bilgin" };
		
		HashMap<String, String> adSoyad = new HashMap<>();
		
		for (int i = 0; i < ad.length; i++) {
			adSoyad.put(ad[i], soyad[i]);
		}
		
		System.out.println("adSoyad = " + adSoyad);// adSoyad = {ahmet=�eref, ahmet can=erdem, haluk=bilgin}
	
	}
}