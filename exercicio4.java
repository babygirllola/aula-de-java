package exercicios;


import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	     int n = s.nextInt();
	if (n>=1 && n<=10) {
		System.out.println ("tabuada de "+n);
		for (int i=1;i<=10; i++) {
			int r = i*n;
			System.out.println (n+"X"+i+"="+r);
			
		}
	} else {
		System.out.println ("num invalido");
	}
	
	}
}

