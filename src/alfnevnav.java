/*
 Autor:Alfonso Nevado Navarro
 Descripción:En este programa,implementare el diagrama de flujos de un juego arcade anteriormente resuelto en clase.El juego consta de tres opciones principales:CONTROLES,NIVEL,SALIR.
 Fecha: 30/12/18
 Curso:1 DM 18
 */
import java.util.Scanner;

public class alfnevnav {

	// Variables globales sobre los controles del jugador 1, las creamos globales
	// para poder acceder a ellas con mas facilidad
	static String[] controlJugador1 = { "a", "b", "c" };

	// Variables globales sobre los controles del jugador 2, las creamos globales
	// para poder acceder a ellas con mas facilidad
	static String[] controlJugador2 = { "d", "e", "f" };

	// Variable global sobre el nivel de la dificultad
	static String Dificul = "facil";

	public static void menu() {// Menu principal del juego podremos cambiar opciones, jugar o salir
		int opc = 0;
		System.out.println("Introduce un numero del 1 al 3");
		Scanner teclado = new Scanner(System.in);

		do {
			try {
				System.out.println("1.Controles");
				System.out.println("2.Jugar");
				System.out.println("3.Salir");

				opc = teclado.nextInt();
				switch (opc) {
				case 1:
					controles();
					return;
				case 2:
					jugar();
					return;
				case 3:
					System.out.println("Gracias por utilizar el programa.");
					System.exit(0);// Con esta linea cierro el programa.
					return;
				}
			} catch (Exception e) {
				System.out.println(" ****ERROR**** introduce un caracter valido");
				teclado.next();
				opc = -1;
			}
		} while ((opc < 1) && (opc > 3));

	}

	public static void jugar() {// Metodo que utilizamos para crear el videojuego
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Seleccione como quieres jugar: ");
			System.out.println("1. 1 Jugador.");
			System.out.println("2. 2 Jugadores.");
			System.out.println("3. Volver al menu.");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				jugar1jugador();
				break;
			case 2:
				jugar2jugador();
				break;
			case 3:
				menu();
				break;
			default:
				System.out.println("Seleccione una opción valida.");
				break;
			}
		} while (opcion != 3);

	}

	public static void jugar1jugador() {//metodo que contiene un menu interno para saber a que dificultad tiene que empezar le programa
		switch (Dificul) {//dependiendo del contenido de la variable global se jugara de una manera u otra
		case "facil":
			dificultadFacil();
			break;

		case "medio":
			dificultadMedia();
			break;

		case "dificil":
			dificultadDificil();
			break;

		default:

			break;
		}
	}

	public static void dificultadFacil() {//Metodo que se utiliza para iniciar el juego en facil
		Scanner tecladoJugador1 = new Scanner(System.in);
		String nombreJugador1, controlJug1;
		int contadorJugador1 = 0, contadorMaquina = 0, contadorTotal = 0, controlMaquina = 0;
		System.out.println("---MODO DE JUEGO FACIL---");
		System.out.println("     ---1 vs IA---       \n");
		System.out.println("Introduce el nombre del primer jugador: ");
		nombreJugador1 = tecladoJugador1.nextLine();

		do {

			System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
					+ controlJugador1[2] + "\n");
			controlJug1 = tecladoJugador1.nextLine();
			controlMaquina = (int) (Math.random() * 3);

			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 0) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 1) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 2) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 0) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 1) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 2) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 0) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 1) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 2) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}

		} while (contadorTotal != 5);

		System.out.println(nombreJugador1 + " ha obtenido: " + contadorJugador1 + " puntos.");
		System.out.println("La maquina ha obtenido: " + contadorMaquina + " puntos.");

		if (contadorJugador1 > contadorMaquina) {
			System.out.println("EL GANADOR ES: " + nombreJugador1);
		} else {
			if (contadorMaquina > contadorJugador1) {
				System.out.println("EL GANADOR ES: La maquina");

			} else {
				if (contadorJugador1 == contadorMaquina) {
					System.out.println("No hay ningun ganador, habeis quedado empate.");

				}
			}
		}

	}

	public static void dificultadMedia() {//Metodo que se utiliza para iniciar el juego en medio
		Scanner tecladoJugador1 = new Scanner(System.in);
		String nombreJugador1, controlJug1;
		int contadorJugador1 = 0, contadorMaquina = 0, contadorTotal = 0, controlMaquina = 0;
		System.out.println("---MODO DE JUEGO MEDIO---");
		System.out.println("      ---1 vs IA---       \n");
		System.out.println("Introduce el nombre del primer jugador: ");
		nombreJugador1 = tecladoJugador1.nextLine();

		do {//3 tiradas totalmente aleatorias en la que podra ganar perder o empatar cualquiera de los dos

			System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
					+ controlJugador1[2] + "\n");
			controlJug1 = tecladoJugador1.nextLine();
			controlMaquina = (int) (Math.random() * 3);

			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 0) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 1) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 2) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 0) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 1) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 2) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 0) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 1) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 2) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}

		} while (contadorTotal != 3);

		for (int i = 0; i < 2; i++) {// dos de las 5 tiradas que se hacen, se forzara a que el jugador pierda contra la maquina

			System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
					+ controlJugador1[2] + "\n");
			controlJug1 = tecladoJugador1.nextLine();

			if (controlJug1.equals(controlJugador1[0])) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1])) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2])) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
		}

		System.out.println(nombreJugador1 + " ha obtenido: " + contadorJugador1 + " puntos.");
		System.out.println("La maquina ha obtenido: " + contadorMaquina + " puntos.");

		if (contadorJugador1 > contadorMaquina) {
			System.out.println("EL GANADOR ES: " + nombreJugador1);
		} else {
			if (contadorMaquina > contadorJugador1) {
				System.out.println("EL GANADOR ES: La maquina");

			} else {
				if (contadorJugador1 == contadorMaquina) {
					System.out.println("No hay ningun ganador, habeis quedado empate.");

				}
			}
		}
	}

	public static void dificultadDificil() {//Metodo que se utiliza para iniciar el juego en dificil
		Scanner tecladoJugador1 = new Scanner(System.in);
		String nombreJugador1, controlJug1;
		int contadorJugador1 = 0, contadorMaquina = 0, contadorTotal = 0, controlMaquina = 0;
		System.out.println("---MODO DE JUEGO DIFICIL---");
		System.out.println("       ---1 vs IA---       \n");
		System.out.println("Introduce el nombre del primer jugador: ");
		nombreJugador1 = tecladoJugador1.nextLine();

		do {// 1 tirada totalmente aleatoria en la que podra perder,ganar o empatar cualquiera de los dos

			System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
					+ controlJugador1[2] + "\n");
			controlJug1 = tecladoJugador1.nextLine();
			controlMaquina = (int) (Math.random() * 3);

			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 0) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 1) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlMaquina == 2) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: piedra");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 0) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 1) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlMaquina == 2) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: papel");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 0) {
				System.out.println("Gana la maquina.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: piedra");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorMaquina++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 1) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: papel");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlMaquina == 2) {
				System.out.println("Empate.");
				System.out.println(nombreJugador1 + " ha sacado: tijera");
				System.out.println("La maquina ha sacado: tijera");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				contadorTotal++;
			}

		} while (contadorTotal != 1);

		//creamos un random para que el jugador pueda ganar 1 tirada o 2 y dependiendo de lo que salga tendremos que la maquina gane 3 veces o 4
		int posicionAleatoria = (int) (Math.random() * 2);

		if (contadorJugador1 == 1 || posicionAleatoria == 0) {
			for (int i = 0; i < 4; i++) {

				System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
				System.out.println("Tus controles son:");
				System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
						+ controlJugador1[2] + "\n");
				controlJug1 = tecladoJugador1.nextLine();

				if (controlJug1.equals(controlJugador1[0])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: piedra");
					System.out.println("La maquina ha sacado: papel");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
				if (controlJug1.equals(controlJugador1[1])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: papel");
					System.out.println("La maquina ha sacado: tijera");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
				if (controlJug1.equals(controlJugador1[2])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: tijera");
					System.out.println("La maquina ha sacado: piedra");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
			}

		}

		if (contadorJugador1 == 2 || posicionAleatoria == 1) {
			for (int i = 0; i < 3; i++) {

				System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
				System.out.println("Tus controles son:");
				System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
						+ controlJugador1[2] + "\n");
				controlJug1 = tecladoJugador1.nextLine();

				if (controlJug1.equals(controlJugador1[0])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: piedra");
					System.out.println("La maquina ha sacado: papel");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
				if (controlJug1.equals(controlJugador1[1])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: papel");
					System.out.println("La maquina ha sacado: tijera");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
				if (controlJug1.equals(controlJugador1[2])) {
					System.out.println("Gana la maquina.");
					System.out.println(nombreJugador1 + " ha sacado: tijera");
					System.out.println("La maquina ha sacado: piedra");
					System.out.println("-----------------------------------");
					System.out.println("\n");
					contadorMaquina++;
					contadorTotal++;
				}
			}

		}

		System.out.println(nombreJugador1 + " ha obtenido: " + contadorJugador1 + " puntos.");
		System.out.println("La maquina ha obtenido: " + contadorMaquina + " puntos.");

		if (contadorJugador1 > contadorMaquina) {
			System.out.println("EL GANADOR ES: " + nombreJugador1);
		} else {
			if (contadorMaquina > contadorJugador1) {
				System.out.println("EL GANADOR ES: La maquina");

			} else {
				if (contadorJugador1 == contadorMaquina) {
					System.out.println("No hay ningun ganador, habeis quedado empate.");

				}
			}
		}
	}

	public static void jugar2jugador() {//Metodo que inicia el juego para 2 jugadores
		Scanner tecladoJugador1 = new Scanner(System.in);
		Scanner tecladoJugador2 = new Scanner(System.in);

		String nombreJugador1, nombreJugador2;
		String controlJug1, controlJug2;
		int contadorJugador1 = 0, contadorJugador2 = 0, contadorTotal = 0;

		System.out.println("-------------------1 vs 1-----------------\n");
		System.out.println("Introduce el nombre del primer jugador: ");
		nombreJugador1 = tecladoJugador1.nextLine();
		System.out.println("Introduce el nombre del segundo jugador: ");
		nombreJugador2 = tecladoJugador2.nextLine();

		do {

			System.out.println(nombreJugador1 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador1[0] + ", Papel: " + controlJugador1[1] + ", Tijera: "
					+ controlJugador1[2] + "\n");
			controlJug1 = tecladoJugador1.nextLine();

			System.out.println(nombreJugador2 + " Introduce piedra papel o tijera.");
			System.out.println("Tus controles son:");
			System.out.println("Piedra: " + controlJugador2[0] + ", Papel: " + controlJugador2[1] + ", Tijera: "
					+ controlJugador2[2] + "\n");
			controlJug2 = tecladoJugador2.nextLine();
			
			//controla todas las posibles jugadas
			if (controlJug1.equals(controlJugador1[0]) && controlJug2.equals(controlJugador2[0])) {
				System.out.println("Empate.");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlJug2.equals(controlJugador2[1])) {
				System.out.println("Gana " + nombreJugador2 + ".");
				System.out.println("\n");
				contadorJugador2++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[0]) && controlJug2.equals(controlJugador2[2])) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlJug2.equals(controlJugador2[0])) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlJug2.equals(controlJugador2[1])) {
				System.out.println("Empate.");
				System.out.println("\n");
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[1]) && controlJug2.equals(controlJugador2[2])) {
				System.out.println("Gana " + nombreJugador2 + ".");
				System.out.println("\n");
				contadorJugador2++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlJug2.equals(controlJugador2[0])) {
				System.out.println("Gana " + nombreJugador2 + ".");
				System.out.println("\n");
				contadorJugador2++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlJug2.equals(controlJugador2[1])) {
				System.out.println("Gana " + nombreJugador1 + ".");
				System.out.println("\n");
				contadorJugador1++;
				contadorTotal++;
			}
			if (controlJug1.equals(controlJugador1[2]) && controlJug2.equals(controlJugador2[2])) {
				System.out.println("Empate.");
				System.out.println("\n");
				contadorTotal++;
			}

		} while (contadorTotal != 5);//se haze esto hasta que llegue a 5 tiradas

		//muestra los contadores de los dos jugadores
		System.out.println(nombreJugador1 + " ha obtenido: " + contadorJugador1 + " puntos.");
		System.out.println(nombreJugador2 + " ha obtenido: " + contadorJugador2 + " puntos.");

		//controla quien ha ganado o si han empatado dependiendo de los contadores
		if (contadorJugador1 > contadorJugador2) {
			System.out.println("EL GANADOR ES: " + nombreJugador1);
		} else {
			if (contadorJugador2 > contadorJugador1) {
				System.out.println("EL GANADOR ES: " + nombreJugador2);

			} else {
				if (contadorJugador1 == contadorJugador2) {
					System.out.println("No hay ningun ganador, habeis quedado empate.");

				}
			}
		}

	}

	public static void controles() {// submenu que se utiliza para cambiar los controles y la dificultad
		int cambio;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("1.Introduce la dificultad de tu juego ARCADE.");
			System.out.println("2.Cambio de los controles del jugador 1");
			System.out.println("3.Cambio de los controles del jugador 2");
			System.out.println("4.Menu principal.");
			cambio = teclado.nextInt();
			switch (cambio) {
			case 1:
				Dificultad();
				return;
			case 2:
				CambioControlesJ1();
				return;
			case 3:
				CambioControlesJ2();
				return;
			case 4:
				menu();
				return;
			default:
				System.out.println("****ERROR**** \n Introduce una opcion del 1 al 4 ");
				break;
			}
		} while (cambio != 4);
	}

	public static void CambioControlesJ1() {// Cambiamos los controles del jugador 1
		String opcion, seguir;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("CONTROLES DEL JUGADOR 1");
			System.out.println("------------------------");
			System.out.println("Seleccione el control que quieres cambiar (piedra/papel/tijera)");
			opcion = teclado.nextLine();

			if (opcion.equalsIgnoreCase("piedra")) {// equals se utiliza para igualar dos valores String

				System.out.println("¿Que letra quieres utilizar?");
				opcion = teclado.nextLine();
				controlJugador1[0] = opcion;
			} else {
				if (opcion.equalsIgnoreCase("papel")) {
					System.out.println("¿Que letra quieres utilizar?");
					opcion = teclado.nextLine();
					controlJugador1[1] = opcion;
				} else {
					if (opcion.equalsIgnoreCase("tijeras")) {
						System.out.println("¿Que letra quieres utilizar?");
						opcion = teclado.nextLine();
						controlJugador1[2] = opcion;
					}
				}
			}
			System.out.println("¿Quieres seguir modificando tus controles?");
			seguir = teclado.nextLine();

		} while (seguir.equalsIgnoreCase("Si"));

		System.out.println("Tus controles actuales son--> piedra " + controlJugador1[0] + " " + "papel "
				+ controlJugador1[1] + " " + "tijeras " + controlJugador1[2]);
		controles();
	}

	public static void CambioControlesJ2() {// Cambiamos los controles del Jugador 2
		String opcion, seguir;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("CONTROLES DEL JUGADOR 2");
			System.out.println("------------------------");
			System.out.println("Seleccione el control que quieres cambiar (piedra/papel/tijera)");
			opcion = teclado.nextLine();

			if (opcion.equalsIgnoreCase("piedra")) {// equals se utiliza para igualar dos valores String

				System.out.println("¿Que letra quieres utilizar?");
				opcion = teclado.nextLine();
				controlJugador2[0] = opcion;
			} else {
				if (opcion.equalsIgnoreCase("papel")) {
					System.out.println("¿Que letra quieres utilizar?");
					opcion = teclado.nextLine();
					controlJugador2[1] = opcion;
				} else {
					if (opcion.equalsIgnoreCase("tijeras")) {
						System.out.println("¿Que letra quieres utilizar?");
						opcion = teclado.nextLine();
						controlJugador2[2] = opcion;
					}
				}
			}
			System.out.println("¿Quieres seguir modificando tus controles?");
			seguir = teclado.nextLine();

		} while (seguir.equalsIgnoreCase("Si"));

		System.out.println("Tus controles actuales son--> piedra " + controlJugador2[0] + " " + "papel "
				+ controlJugador2[1] + " " + "tijeras " + controlJugador2[2]);
		controles();

	}

	public static void Dificultad() {// En dicho metodo cambiaremos la dificultad del juego
		// En esta variable vamos a cambiar la variable global para el juego

		int dificultad = 0;
		System.out.println("1.Facil");
		System.out.println("2.Medio");
		System.out.println("3.Dificil");
		Scanner teclado = new Scanner(System.in);
		dificultad = teclado.nextInt();

		switch (dificultad) {
		case 1:
			System.out.println("Has elegido la opción de facil");
			Dificul = "facil";
			controles();
			return;
		case 2:
			System.out.println("Has elegido la opción de medio");
			Dificul = "medio";
			controles();
			return;
		case 3:
			System.out.println("Has elegido la opción dificil");
			Dificul = "dificil";
			controles();
			return;
		}
	}

	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("Bienvenido al programa del juego arcade.");
		System.out.println("----------------------------------------");
		menu();

	}
}

