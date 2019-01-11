/*
 Autor:Alfonso Nevado Navarro
 Descripción:Ejercicio del juego: TRES EN RAYAS utilizando matrices.
 Fecha:10/12/18
 Curso:1 DM 18
 */
import java.util.Scanner;
public class ejercicio_matrices_1 {
	
	public static char [][] m ={{' ' , ' ' , ' '},{' ' , ' ' , ' '},{' ' , ' ' , ' '}}; //DECLARACIÓN DE LA MATRIZ
	
	public static void tablero() {	
		
		System.out.println("  --- --- --- ");

		System.out.println(" | " + m[0][0] + " | " + m[0][1] + " | " + m[0][2] + " | ");
		System.out.println(" | " + m[1][0] + " | " + m[1][1] + " | " + m[1][2] + " | ");
		System.out.println(" | " + m[2][0] + " | " + m[2][1] + " | " + m[2][2] + " | ");
		
		System.out.println("  --- --- --- ");
	}
	public static int jugador (int jug) { //METODO PARA EL JUGADOR 1
		boolean flag=false;
		int f=0,c=0,j=0;
		
		if(jug==1)	System.out.println("jugador uno = X");
		else		System.out.println("jugador dos = O");
		
		Scanner teclado= new Scanner (System.in);
		do {
			do{
				
				try {
					System.out.println("Por favor introduce la posición que quieras marcar.");
					System.out.println("Introduce la fila");
					System.out.println("del 0 al 2");
				
					f = teclado.nextInt();
				}
				catch(Exception e){
					System.out.println("Error,vuelve a introducir el numero");
					teclado.next(); //para evitar que metan cualquier cosa.
					f=-1;
				}
			}while(((f<0)||(f>2)));
			
			do{	
				try {
					System.out.println("Por favor introduce la posición que quieras marcar.");
					System.out.println("Introduce la columna");
					System.out.println("del 0 al 2");
				
					c = teclado.nextInt();
				}
				catch(Exception e){
					System.out.println("Error,vuelve a introducir el numero");
					teclado.next(); //para evitar que metan cualquier cosa.
					c=-1;
				}
			}while(((c<0)||(c>2)));	
			
			if(m[f][c]== ' ') {
				if(jug==1) {
					m[f][c]= 'X';j=1;
				}
				else {
					m[f][c]= 'O';
					flag=true;
					j=2;
				}
				
				
			}
			else {
				System.out.println("No se puede sobreescribir en esta posición");
				flag=false;
			}
		}while(flag==false);
		
		tablero();
		
		return jug;	
	}
	
	public static void main(String[] args) {
		
		int ronda=0,jug=1,contador=0,j=0;
		
		System.out.println("--------------------------------------------");
		System.out.println("ESTE ES EL PROGRAMA DEL JUEGO: TRES EN RAYA ");
		System.out.println("--------------------------------------------");
		
		do {
			jug =jugador(jug);
			
			if(jug==1) jug=2;
			else	   jug=1;
			System.out.println("Turno: " +contador);
		}while(jug<=9);
		
		//COMPARACIONES DEL JUEGO
		
		if(j==1) {
			System.out.println("Gana el jugador 1");
		}
		if (j==2) {
			System.out.println("Gana el jugador 2");
		}
		//COMPARACIONES HORIZONTALES
		if(m[0][0]==j) {
			if(m [0][1]==j) {
				if(m [0][2]==j) {
				}
			}
		}
		if(m [1][0]==j) {
			if(m [1][1]==j) {
				if(m [1][2]==j) {
				}
			}
		}
		if(m [2][0]==j) {
			if(m [2][1]==j) {
				if(m [2][2]==j) {
				}
			}
		}
		//COMPARACIONES VERTICALES
		if(m [0][0]==j) {
			if(m [1][0]==j) {
				if(m [2][0]==j) {
				}
			}
		}
		if(m [0][1]==j) {
			if(m [1][1]==j) {
				if(m [2][1]==j) {
				}
			}
		}
		if(m [0][2]==j) {
			if(m [1][2]==j) {
				if(m [2][2]==j) {
				}
			}
		}
		//COMPARACIONES DIAGONAL
		if(m [0][0]==j) {
			if(m [1][1]==j) {
				if(m [2][2]==j) {
				}
			}
		}
		if(m [0][2]==j) {
			if(m [1][1]==j) {
				if(m [2][0]==j) {
				}
			}
		}
	
	}
}