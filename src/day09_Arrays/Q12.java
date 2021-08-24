package day09_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		// A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n 
		// toplam�n� birer birer bulan ve herbir sonucu yeni bir array�in eleman� yapan
		// ve yeni array�i ekrana yazd�ran bir program yaz�n�z  
		// Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}  
			
		int arr[][] = { {1,2,3}, {4,5,11}, {6,7}, {8, 9, 10}};
		
		int arr1 [] = new int [arr.length];
		
		int sum = 0;  // toplamlar� yazd�rmak i�in bir variable olu�turdum 
		for (int i = 0; i < arr.length; i++) {  // MD arrayin elemanlar�n� bulmak i�in for d�ng�s� yapt�m
			for (int j = 0; j < arr[i].length; j++) { // inner array elemanlar�n� alaca��m.
				sum+=arr[i][j]; // inner arraylar�n toplam�n� variable a atad�m.
			}
			arr1[i]= sum; // arrayin indexlerine toplam de�i�kenimi atad�m.
			// b�ylece indexlerime arrnin inner arraylar�n elementler toplam�n� artam�� oldum.
			sum=0; // burada toplam� s�f�rlad�m ki outer arrayda toplma variable im s�f�rlans�n arr 1 arrayinin yeni index toplam�n� bulay�m .
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}
