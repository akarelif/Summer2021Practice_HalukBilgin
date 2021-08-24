package day07_ForLoop;

import java.util.Scanner;

public class HW01_PermutationCombination {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Verilen iki say�n�n kombinasyonunu bulan kodu yaz�n�z.
        Hat�rlatma C(n,r) = n! / (r!(n-r)!)
        Verilen iki say�n�n perm�tasyonunu bulan kodu yaz�n�z.
        Hat�rlatma P(n,r) = n! / (n-r)!
        Ekran ��kt�s�
        Birinci say�y� giriniz: 15
        Ikinci say�y� giriniz: 4
        Kombinasyon: 1365
        perm�tasyon: 32760
        Birinci say�y� giriniz: 5
        Ikinci say�y� giriniz: 3
        Kombinasyon: 10
        perm�tasyon: 60
      */
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Perm�tasyon ve Kombinasyon hesab� i�in n de�erini giriniz: ");
	    long n = scan.nextInt();

	    System.out.print("Perm�tasyon ve Kombinasyon hesab� i�in r de�erini giriniz: ");
	    long r = scan.nextInt();
	    
	    
	    if (combination(n,r)==0&& permutation(n,r)==0) {
			System.out.println("Se�im say�s�(n) eleman say�s�na(r) e�it veya eleman say�s�ndan(r) b�y�k olmal�d�r. (n>=r)");
		}else {
			System.out.println("kombinayon : "+combination(n,r));
		    System.out.println("perm�tasyon : "+permutation(n,r));
		}
	    scan.close();
	    
	        }
	
	public static long factorial (long n) {
	    long factor=1;
	    for (int i = 1; i <= n; i++) {
			factor*=i;
		}
	    return factor;
	}
	
	 public static long combination (long n,long r) {
		if (n>0 && r>0 && n>=r ) {
			return factorial (n) / (factorial (r)*(factorial (n-r)));
		}else if(n==0&&r==0) {
			return 1;
		}else {
			return 0;
		}
		 
		 
	 } 
	 
	 public static long permutation (long n,long r) {
			if (n>0 && r>0 && n>=r ) {
				return factorial (n) / (factorial (n-r));
			}else if(n==0&&r==0) {
				return 1;
			}else {
				return 0;
			}
			 
			 
		 }  

}
