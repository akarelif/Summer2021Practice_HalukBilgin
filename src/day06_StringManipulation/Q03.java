package day06_StringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		 /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip de�il
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("ad�n�z� giriniz : ");
        String name=scan.nextLine();//eda
        
        char c1=name.charAt(0);//e
        char c2=name.charAt(1);//d
        char c3=name.charAt(2);//a
        
        // ternary ile soru ��zd�. �NCE KEL�ME UZUNLU�U 3 M� D�YE SORDU. ARDINDAN TRUE KISMINA HARFLER AYNI MI D�YE CHAR OLARAK SORDU.
        // TRUE'YA  NESTED TERNARY UYGULADI SORDU�U SORU �SE �U KEL�MEDE AYNI HARFTEN BA�KA B�R KARAKTER VAR MI.
        
        String result=name.length() == 3 ?((c1!=c2 && c1!=c3 && c2!=c3)? "girdiginiz isim unique karakterlerden olusuyor ":"girdiginiz isim unique karakterlerden olusmuyor " ):"3 karakterden farkl� isim girdiniz";
        
       System.out.println(result);
       scan.close();
	}

}
