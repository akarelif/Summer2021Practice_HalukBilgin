package day07_ForLoop;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Girilen bir say� kadar sat�r ve s�t�nu olan ve
        sa� kenara dayal� ��geni basan kodu yaz�n�z.
        Ekran ��kt�s�
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam say� giriniz : ");
        int sayi = scan.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {//sat�r kontrolu
            for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= satir; yildiz++) {//y�ld�z kontrolu
                System.out.print("*");

            }
            System.out.println();
        }
         
        
        /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    �eklini yazd�r�n�z
             */

        for (int satir = 1; satir <= sayi; satir++) {//sat�r kontrolu

            for (int yildiz = 1; yildiz <= satir; yildiz++) {//y�ld�z kontrolu
                System.out.print("*");

            }
            System.out.println();
        }

	}

}
