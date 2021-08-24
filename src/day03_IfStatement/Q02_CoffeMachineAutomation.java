package day03_IfStatement;

import java.util.Scanner;

public class Q02_CoffeMachineAutomation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        String islemler = "1.T�rk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.C�k�s";
        System.out.println(islemler);
        System.out.println("************************");

        while (true) {
            System.out.print("Yapmak istediginiz islemin numarasini giriniz : ");
            String hangiKahve = scanner.nextLine();

            if (hangiKahve.equals("6")) {
                System.out.println("Kahve Makinesi Sisteminden cikiliyor...");
                break;
            } else if (hangiKahve.equals("1")) {
                System.out.println("T�rk kahvesi haz�rlan�yor...");
            } else if (hangiKahve.equals("2")) {
                System.out.println("Filtre kahve haz�rlan�yor...");
            } else if (hangiKahve.equals("3")) {
                System.out.println("Espresso haz�rlan�yor...");
            } else if (hangiKahve.equals("4")) {
                System.out.println("Americano haz�rlan�yor...");
            } else if (hangiKahve.equals("5")) {
                System.out.println("Cappicino haz�rlan�yor...");
            } else {
                System.out.println("Hatal� tu�lama yapt�n�z.Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nS�t eklememizi ister misiniz?\n" + "1.Evet\n" + "2.Hay�r\n" + "Tuslayiniz: ");
            String sut = scanner.nextLine();

            if (sut.equals("1")) {
                System.out.println("S�t ekleniyor...");
            } else if (sut.equals("2")) {
                System.out.println("Sut eklenmiyor...");
            } else {
                System.out.println("Hatali islem yaptiniz...");
                break;
            }

            System.out.print("\nSeker ister misiniz?\n" + "1.Evet\n" + "2.Hay�r\n" + "Tuslayiniz: ");
            String seker = scanner.nextLine();

            if (seker.equals("1")) {
                System.out.print("Ka� seker olsun: ");
                int kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " seker ekleniyor");
            } else if (seker.equals("2")) {
                System.out.println("�eker eklenmiyor ");
            } else {
                System.out.println("Hatal� giris yapt�n�z. Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nHangi boyutta olsun?\n" + "1.Buyuk Boy\n" + "2.Orta Boy\n" + "3.Kucuk Boy\n" + "Tuslayiniz: ");
            String boyut = scanner.nextLine();

            if (boyut.equals("1")) {
                System.out.println("Buyuk Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("2")) {
                System.out.println("Orta Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("3")) {
                System.out.println("Kucuk Boy Kahveniz hazirlaniyor...");
            } else {
                System.out.println("Hatali g�r�s yapt�n�z. Tekrar deneyiniz...");
                break;
            }


            System.out.println("\nKahveniz hazir. Afiyet olsun !!!");
            break;
            
	}
        scanner.close();

}
	
}