
package animales;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Dinosaurio dinosaurio = new Dinosaurio("Belen");
		Perro perro = new Perro("Yamila");
		int opcion;
		do {

			System.out.println("-------Bienvenido-------");
			System.out.println("Seleccione la opcion que decea realizar: ");
			System.out.println("1- Darle de comer al perro");
			System.out.println("2- Darle de comer al dinosaurio");
			System.out.println("3- Dormir al perro");
			System.out.println("4- Dormir al dinosaurio");
			System.out.println("5- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// darle de comer al perro
				perro.comer();
				break;

			case 2:
				// darle de comer al dinosario
				dinosaurio.comer();
				break;

			case 3:
				// dormir al perro
				perro.dormir();
				break;

			case 4:
				// dormir al dinosaurio
				dinosaurio.dormir();
				break;

			}

		} while (opcion != 5);

	}

}
