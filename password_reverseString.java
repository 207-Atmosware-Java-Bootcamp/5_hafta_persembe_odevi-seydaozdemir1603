package javaSE_Odev;

import java.util.Scanner;

public class password_reverseString {
	
	public static void pass() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Parola giriniz : ");
		String password = scanner.nextLine();
		String yildiz = "";
		String newPassword = "";
		
		if (password.equals("")) {
			System.out.println("Sifre girmediniz");
		} else {
			for (int i = 0; i < password.length() - 2; i++) {
				yildiz = yildiz + "*";
			}
			System.out.println(
					password.charAt(0) + password.replace(password, yildiz) + password.charAt(password.length() - 1));
		}
		
	}
	public static void kelimeCevir() {
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Bir kelime giriniz : ");
		String kelime = scanner2.nextLine();
		
		
		for (int i = kelime.length() - 1; i >= 0; i--) {
			System.out.print(kelime.charAt(i));
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		kelimeCevir();
		pass();
		
	}
	
	
}
	
	
	
