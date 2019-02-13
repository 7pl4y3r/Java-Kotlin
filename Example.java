/* In java este obligatoriu sa folosim clasele
 * Numele clasei trebuie sa fie acelasi cu al fisierului
*/

/* java.util reprezinta package-ul unui fisier numit Scanner.java 
 * Un package este foarte important in java 
 * java este un folder care contine un alt folder numit util care contine fisierul Scanner.java
*/

import java.util.Scanner;

public class Example {


	static void readInt() {

		//Pentru a lua input de la consola avem nevoie de o functie/metoda a obiectul Scanner
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		// Daca e prim afiseaza Yes altfel No
		System.out.println(isPrime(x) ? "Yes" : "No");

	}

	static boolean isPrime(int x) {

		if (x == 2)
			return true;
		if (x < 2 || x % 2 == 0)
			return false;
		for (int d = 3; d * d <= x / d; d += 2)
			if (x % d == 0)
				return false;

		return true;

	}

	public static void main(String[] args) {

		System.out.println("Hello! This is java");
		readInt();

	}

}