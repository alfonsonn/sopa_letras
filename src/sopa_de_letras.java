/*
 Autor:Alfonso Nevado Navarro
 Descripción:Un programa que realice una sopa de letras.La sopa de letras
 Fecha: 08/01/18
 Curso:1 DM 18
 */
import java.util.Scanner;
public class sopa_de_letras {
	
	/*AQUI ESTOY GENERANDO UNA MATRIZ DE 15X15*/
	public static char[][] Soup = new char [15][15]; 
	
	/*
	 METODO PARA PEDIR LAS PALABRAS,TRANSFORMARLAS Y ALMACENARLAS EN UN VECTOR.
	 ENTRADAS:ninguna SALIDAS:ninguna
	*/
	public static void palabras() {
		String palabra;
		Scanner teclado = new Scanner(System.in);
		do {
				System.out.println("Introduce 10 palabras por favor");
				palabra=teclado.next();
				palabra=palabra.toUpperCase(); ahora el tema de la longuitud
				char vector []=palabra.toCharArray();//vector		
		}while(palabra.length()!=10);	
	}
	/*METODO PARA GENERAR LA SOPA DE LETRAS.
	 * ENTRADAS:ninguna SALIDAS:ninguna
	 */
	public static void crear_sopa () {
		int alto,ancho;
		
		for(alto=0;alto<15;alto++) {
			for(ancho=0;ancho<15;ancho++) {
				Soup[alto][ancho]=(char)(Math.random()*26+ 'A');
				System.out.print(" " + Soup[alto][ancho]);
			}
			System.out.println(); //para que cuando acabe las 15 palabras de la filas y cambie a la siguiente.
		}
		
	}
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("Programa de la sopa de letras");
		System.out.println("-----------------------------");
		palabras();
	}
}
