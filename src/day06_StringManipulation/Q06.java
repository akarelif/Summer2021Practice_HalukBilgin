package day06_StringManipulation;

public class Q06 {

	public static void main(String[] args) {
		// String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// yukar�daki string de�i�keni kullanarak konsolda A L i yazd�r�n�z.
		
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char a = pickName.charAt(pickName.indexOf("A")); // burada A karakterini index de�erini buluyoruz.bu de�er int oldu�u i�in charat() i�inde kullan�yoruz
		char l = pickName.charAt(pickName.indexOf("L"));
		char i = pickName.toLowerCase().charAt(pickName.indexOf("I"));
		System.out.println("" + a + " " + l + " " + i);

	}

}
