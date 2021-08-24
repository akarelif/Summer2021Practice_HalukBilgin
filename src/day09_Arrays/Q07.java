package day09_Arrays;

import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a method that accepts a 2 dimensional array and finds the max value
		 * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
		 * Input : {{1,24,3},{45,5},{62,7,76}} 
		 * Output : 76 
		 */
	
		int arr [][]= {{1,24,3},{45,5},{62,7,76}};
		int uzunluk=0;
		
		for (int i = 0; i < arr.length; i++) {
			uzunluk+=arr[i].length;
			
		}
		int arr1[]= new int [uzunluk]; // burada yeni array olu�turdum.
		// bu arrayi olu�turma sebebim yukar�daki MD arraydaki t�m elemanlar� bu arrayin i�ine tan�mlayaca��m.
		// peki olu�turaca��m arrayin uzunlu�unu nas�l bulaca��m onu da a�a��daki for d�ng�s� ile elde edece�im.
		
		int count=0; // d�ng� her eleman i�in d�nd���nde arr1[] indexi bir artacak
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[count]=arr[i][j];  // burada t�m indexleri arr arrayindeki gibi s�ras�yla ald�k.
				count++;
			}
		}
		Arrays.sort(arr1);	// burada arr1 dizisini k���kten b�y��e do�ru s�ralad�k
		System.out.println(Arrays.toString(arr1));
		System.out.println("\"arr\"nin en b�y�k eleman� : "+ arr1[arr1.length-1]); // burada son ve enb�y�k eleman� yazd�rd�k
		
	
	}

}
