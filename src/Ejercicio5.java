/*
 Autor:Alfonso Nevado Navarro
 Descripción:Ejercicio de conjetura de COLLATZ
 Fecha:10/12/18
 Curso:1 DM 18
 */
import java.util.Scanner;
public class Ejercicio5 {
	
	/*METODO: longCICLO
	 entradas i
	 contador es la salida 
	*/
	public static int longCiclo (int i) {
		int contador=1;
		int n=i;
		
		do {
			if (n%2==0){
				n=(n/2); //SI EL RESTO ES 0 LO DIVIDO POR DOS
				contador++;
			}
			else{
				n=(n*3)+1; //SI EL RESTO ES IMPAR LE MULTIPLICO * TRES Y LE SUMO UNO
				contador++;
			}
		}while(n>1);	
		
		return contador;
	}
	
	/*MAIN
	 Hago el bucle para pedir el numero n1 y el n2.Despues en mi bucle for llamo al metodo para comprobar si es par o impar 
	 y lo sacaré por pantalla.
	 */
	public static void main(String[] args) {
		long n1=0,n2=0;
		
		int contadorM=0;
		
		System.out.println("---------------------");
		System.out.println("Conjetura de Collatz");
		System.out.println("---------------------");
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			try{
				System.out.println("Introduce el primer numero: ");
				n1 = teclado.nextLong();
			}
			catch(Exception e) {
				System.out.println("Error,vuelve a introducir el numero");
				teclado.next(); //para evitar que metan cualquier cosa.
				n1=-1;
			}
			
		}while((n1 < 0)&&(n1 > Math.pow(2,60)));
			
		do {
			try {
				System.out.println("Introduce el segundo numero: ");
				n2 = teclado.nextLong();
			}
			catch(Exception e) {
				System.out.println("Error,vuelve a introducir el numero");
				teclado.next(); //para evitar que metan cualquier cosa.
				n2=-1;
			}
			
		}while((n2 < 0)&&(n2 > Math.pow(2,60)));
		
		for( int i=(int)n1 ; i<=n2 ; i++ ){
			if (longCiclo(i)>contadorM) {
				
				contadorM=longCiclo(i);
			}
		}
		System.out.println("La mayor sucesion de numeros tiene: " + contadorM + " numeros.");
	}
}
