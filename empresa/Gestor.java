package empresa;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Dueño dueño = new Dueño(0, null);
		Encargado encargado = new Encargado(0, 0);
		Empleado empleado = new Empleado(0, null);

		int menu, menu1, menu2, menu3;

		do {

			System.out.println("----Bienvenido----");
			System.out.println(" Decida quien envia un Mail");
			System.out.println("1- Dueño: ");
			System.out.println("2- Encargado: ");
			System.out.println("3- Empleado: ");
			System.out.println("4- Salir");
			menu = sc.nextInt();

			switch (menu) {

			case 1:

				System.out.println("El dueño solo le puee enviar Mails al Encargado");
				dueño.enviar();

				break;

			case 2:

				

					System.out.println("Encargado le enviara un Mail a");
					System.out.println("1- Dueño ");
					System.out.println("2- Empleado ");
					System.out.println("3- Volver atras");
					menu2 = sc.nextInt();

					switch (menu2) {

					case 1:

						encargado.enviar();
						break;

					case 2:

						encargado.enviare();
						break;

					default:
						System.out.println("Volvio al Gestor");

					}

				

				break;

			case 3:

				System.out.println("El Empleado solo le puede enviar Mails al Encargado");
				empleado.enviar();

				break;

			}

		} while (menu != 4);

	}

}
