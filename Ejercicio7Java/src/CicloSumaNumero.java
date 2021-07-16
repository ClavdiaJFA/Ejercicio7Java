
/* Hacer un programa que pida un número por teclado.
 * hacer un recorrido desde el númro uno hasta el núm. introducido.
 * 
 * Ejemplo:
 * num: 12
 * 
 * numero par: 2 + 4 + 6 + 8 + 10 + 12
 * numero impar: 1 + 3 + 5 + 7 + 9 + 11
 * 
 * Tiene que imprimir la suma de los numeros pares e impares
 * 
 * Utilizar CICLOS y CONDICIONALES */


import java.util.Scanner;

public class CicloSumaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner x = new Scanner(System.in);
		
		System.out.println("ingresa el numero a calcular: ");
		num=x.nextInt();
		
		suma(num);

	}
	
	public static void suma(int num) {
		int par=0;
		int impar=0;
		
		for (int i=0; i<=num; i++) {
			if (i%2==0) {
				par+=i;
			}else {
				
				impar+= i;
			}
		}
		
		System.out.println("Suma de todos los numeros pares: " + par);
		System.out.println("Sume de todos los numeros impares: " + impar);
	}

}
