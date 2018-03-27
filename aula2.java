package Aula;

import java.util.Scanner;

public class aula2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos vc tem?");
		int numero = scanner.nextInt();
		System.out.println();
		if (numero >=30){
			System.out.println ("vc é velho");
			} 
	else if (numero<30) {
		System.out.println("fala ninfeta");
		
	}
	}

}
