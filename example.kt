/*
 * In kotlin nu este obligatoriu sa folosim o clasa
 * Are o sintaxa diferita fata de ce am folosit noi pana acum (C/C++, Dart)
 * Consider ca sintaxa este mai simpla si mult mai frumoasa
*/

/* Toate functiile incep cu fun (un keyword)
 * args este un parametru de tip lista de String statica (ca un vector din C++)
 * La parametrii se scrie prima data numele si dupa : se pune tipul
*/ 

// Voi folosi o clasa pentru a da un exemplu 

import java.util.Scanner

// asa se poate init o propietate si nu avem nevoie de un constructor clasic
// asta se numeste constructor integrat
class Num(private val x: Int) {


	// Un exemplu de setter
	fun setNum(x: Int) {
		this.x = x;
	}

	// un exemplu de getter
	fun getNum(): Int = x

	// tipul functiei se pune dupa exact ca la Int, String...
	fun isPrime(): Boolean {

		if (x == 2)
			return true
		if (x < 2 || x % 2 == 0)
			return false
		for (d in 3..(x / d / d) step 2)
			if (x % d == 0)
				return false

		return true

	}

}


fun main(args: Array<String>) {

	/* Nu trebuie sa punem ; la sfarsit de linie decat daca avem doua "linii" de cod
 	 * exemplu: print("Ceva"); println()
	*/
	println("Hello! This is Kotlin")

	// Codul scris in java se poate folosi in kotlin si invers fara probleme
	// ele sunt 100% compatibile

	/* Pentru a declara a variabila se foloseste var 
	 * pentru a valoare val (nu se poate schimba dupa init)
	 * este foarte important sa luam in considerare daca varibila noastra este 
	 * variabila sau constanta 
	 * se folosesc si pentru obiecte
	*/

	 val scanner = Scanner(System.`in`)
	 val x = scanner.nextInt()
	 val num = Num(x)

	 println(if (num.isPrime()) "Yes" else "No")

}