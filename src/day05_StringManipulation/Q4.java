package day05_StringManipulation;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// Kullan�c�ndan ald���n�z  Y�l�n  ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen yilin kacinci ay�nda olugunzu   giriniz : ");
        int ay = scanner.nextInt();
    
        
        switch (ay) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("girdiginiz ay 31 gun �ekiyor");
            break;
    
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("girdiginiz ay 30 gun �ekiyor");
            break;
        case 2:
            System.out.print("yilinizi giriniz :");
            int yil=scanner.nextInt();
            
            if (yil%4==0) {
                System.out.println("girdiginiz ay 29 gun �ekiyor");
                
            }else {
                System.out.println("girdiginiz ay 28 gun �ekiyor");
                
            }
            break;
        
    default:
        System.out.println("hatali giris yaptniz");
        }scanner.close();
	}

}
