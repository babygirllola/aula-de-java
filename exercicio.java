package exercicios;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float f; float c;
		System.out.println("valor em f ");
		f = scanner.nextFloat();
		c = 5*(f-32)/9;
		System.out.println("temp em c: "+c);
		
	}

}
