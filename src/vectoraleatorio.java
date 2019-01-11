/*Autor:Alfonso Nevado Navarro
 * Descripción:Ejercicio que busque los valores entre [a y b].
 * 	Mostrando valor y posición 
 * 	MAX =20
 * 	VECTOR DEL 1 al 100
 * Fecha:11/12/18
 */
import java.util.Scanner;
public class vectoraleatorio {
	
	final static int  max = 20; 				//final por que va a ser esta variable igual en todo momento del programa.
	
	public static void main(String[] args) {
		
		int a=0,b=0,random=0,j,auxiliar;
		boolean flag=false;
		
		int [] aleatorio =new int [max];		//DECLARACIÓN DEL VECTOR y CREACIÓN.
		
		Scanner teclado = new Scanner (System.in);
		
		do { 				//para que repita el bucle hasta que introduce el usuario un numero valido en el rango
			try {
				System.out.println("Introduce el primer valor");
				a=teclado.nextInt();
			}
			catch(Exception e) {
				System.out.println("ERROR,vuelve a introducir el valor a");
				teclado.next();
				a=-1;
			}
		
		}while((a<0)||(a>100));
		
		
		do{ 				//para que repita el bucle hasta que introduce el usuario un numero valido en el rango
			try {
				System.out.println("Introduce el segundo valor");
				b=teclado.nextInt();
			}
			catch(Exception e) {
				System.out.println("ERROR,vuelve a introducir el valor b");
				teclado.next();
				b=-1;
			}
		}while((b<0)||(b>100));
		
		for(int i=0;i<max;i++) { 
			aleatorio[i]=(int)(Math.random()*(100-1)+1);
		}
		System.out.print("Vector descolocado: ");
		for(int c =0 ; c<max ; c++){ //Para ver mi vector descolocado
			System.out.print(aleatorio[c]+" ");
		}
		
			System.out.println("");
			
		for (int i=0;i<max;i++) { 		//el numero aleatorio con su poscion,si esta entre a y b se imprima y si no que siga.
			if ((a<aleatorio[i]) && (aleatorio[i]<b)) {
				System.out.println("");
				System.out.println(" Posicion "+i+" Valor "+aleatorio[i]);	
			}
		}
		do {
			flag=false;
				for(j=0;j<(max-1);j++) {
					
					if(aleatorio[j]>aleatorio[j+1]) {
						
						flag=true;
						auxiliar=(aleatorio[j+1]);
						aleatorio[j+1]=aleatorio[j];
						aleatorio[j]=auxiliar;
					}
				}
		}while(flag==true);
		
			System.out.println("");
		
		
		System.out.print("Vector colocado: "); //Visualizar el vector ya colocado.
		
		for(int c =0 ; c<max ; c++){
			System.out.print(aleatorio[c]+" ");
		}
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("Introduce un numero para buscarlo en el vector:");
		System.out.println("");
		a=teclado.nextInt();
		
		flag = false; 
		for(int i=0;i<max;i++) {
			if(a==aleatorio[i]) {
				System.out.println("El valor: "+a+" se encuentra en la posición " +(i+1));	
			    flag = true;
			}
		}
		if(flag == false)
			System.out.println("Valor no encontrado en nuestro vector.");
		
		System.out.println("-------------------------------------------");
		System.out.println("Busqueda de un valores mediante BUSQUEDA BINARIA ");
		System.out.println("-------------------------------------------");
		System.out.println("");
		System.out.println("Introduce un valor del vector.");
		b=teclado.nextInt();
		
		for(int i=0;i<max;i++) {
			if(b==aleatorio[i]);
				b=b/2;
				if (b<i) {
					flag=true;
					
				}
				else {
					
				}
				
		}
	}
}