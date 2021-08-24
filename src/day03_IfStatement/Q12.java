package day03_IfStatement;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*
        Kullan�c�dan vize ve final notlar�n� al�n�z.
        Kullan�c�n istedi�i oranlarda vize ve final y�zdeleri not ile not ortalamas�n� hesaplay�p
        not ortalamas�n� yazd�r�p 50 ve b�y�k ise "Tebrikler dersi ba�ar� ile ge�tiniz..." k���k ise
        "Malesef dersten kald�n�z..." yazd�r�n�z
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize Notunuz: ");
        int vize = scanner.nextInt();

        System.out.print("Final Notunuz: ");
        int fin = scanner.nextInt();

        System.out.print("Vize y�zdesi ka�t�r? ");
        double vize_yuzde = scanner.nextDouble();

        System.out.print("Final y�zdesi ka�t�r? ");
        double fin_yuzde = scanner.nextDouble();

        double not_ort = (double) (vize * vize_yuzde / 100) + (double) (fin * fin_yuzde / 100);

        System.out.println("Ortalaman�z hesaplan�yor..................");
        System.out.println("Not ortalaman�z: " + not_ort);

        if (not_ort >= 50) {
            System.out.println("Tebrikler dersi ba�ar� ile ge�tiniz...");
        } else {
            System.out.println("Malesef dersten kald�n�z...");
        }
        scanner.close();

	}

}
