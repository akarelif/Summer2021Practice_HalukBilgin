package day03_IfStatement;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Kullan�c�dan bir tarihi g�n, ay ve y�l �eklinde al�p bu tarihi
        ay, g�n, y�l ve y�l, ay, g�n s�ralar�na �evirerek yazan bir kod yaz�n�z.
        ipucu: her else komutundan sonra return; komutu kullan�n�z...
        �rnek Ekran ��kt�s�
        L�tfen g�n� giriniz: 10
        L�tfen ay� giriniz: 02
        L�tfen y�l� giriniz: 2009
        G�n ay y�l: 10.02.2009
        Ay g�n y�l: 02.10.2009
        Y�l ay g�n: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

        int gun;
        int ay;
        int yil;

        System.out.println("Tarihi g�n,ay,y�l olarak istenen �ekliyle giriniz... ");

        System.out.print("G�n: ");
        gun = scanner.nextInt();

        if (gun > 0 && gun <= 31) {
            System.out.println(gun);

        } else {
            System.out.println("Yanl�� giri� yapt�n�z.Program sonlan�yor...");
           
          
        }


        System.out.print("Ay: ");
        ay = scanner.nextInt();

        if (ay > 0 && ay <= 12) {
            System.out.println(ay);

        } else {
            System.out.println("Yanl�� giri� yapt�n�z.Program sonlan�yor...");
           // return;
        }

        System.out.print("Y�l: ");
        yil = scanner.nextInt();

        if (yil > 0) {
            System.out.println(yil);

        } else {
            System.out.println("Yanl�� giri� yapt�n�z.Program sonlan�yor...");
           // return;
        }

        System.out.println("Ay/G�n/Y�l : " + ay + "/" + gun + "/" + yil);
        System.out.println("Y�l/Ay/G�n : " + yil + "/" + ay + "/" + gun);
        
        scanner.close();
	}
	

}
