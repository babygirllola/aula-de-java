package exercicios; 
import java.util.Scanner;

	public class exercicio3 {
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
		     int n1 = s.nextInt();
		     int n2 = s.nextInt();
		     int n3 = s.nextInt();
		int maior; int menor;
		if (n1 > n2) {
			maior = n1;
			menor = n2;
		} else {
			maior = n2;
			menor = n1;
		}
		if (n3 > maior) {
	  maior = n3;
} else  if (n3 < menor) {
	menor = n3;
}
System.out.println("maior: "+maior);
System.out.println("MENOR: "+menor);
		} 

	}


	