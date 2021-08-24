package day03_IfStatement;

import java.util.Scanner;

public class Q15_DenkleminKokleri {

	public static void main(String[] args) {
		 /* G�n�n sorusu: if statement
	        katsay�lar� verilen 2 bilinmeyenli denklemin k�kleriniz bulunuz.
	        ax^2 + bx + c;
	        ��z�m ad�mlar�
	        kullan�c�dan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane k�k vard�r x1=(-b + k�k(d)) / (2a)  , x2= (-b - k�k(d)) / (2*a)
	        Delta = 0 => 1 tane k�k vard�r x = -b/2a
	        Delta < 0 ise k�k yoktur.
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsay�lar�n� giriniz : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Girdi�iniz denklemin iki tane k�k� vard�r\nX1= " + x1 + " X2= " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Girdi�iniz denklemin 1 tane k�k� vard�r\nx= " + x);
        } else {
            System.out.println("Girdi�iniz denklemin k�k� yoktur");
        }scan.close();
	}

}
