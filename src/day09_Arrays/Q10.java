package day09_Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
			/* you have a string "GayetBasarili"
	        *  with arrays change it to "CoookBasarili" and write changing array
			*  (String iniz: "GayetBasarili"  Diziyi "CoookBasarili" ye cevirin )
			*
			*/
		
		
		String str = "GayetBasarili";
		str.replace("Gayet", "Coook");
		System.out.println(str); // stringi �evirdik fakat soruda bunu arraya �evirin diyor
		String strArr [] = new String [1];
		strArr[0]= str;
		System.out.println(Arrays.toString(strArr));
		
		
		
		
		
	}

}
