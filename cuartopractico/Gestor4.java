package cuartopractico;

import java.util.Scanner;

import tercerpractico.Casa;

public class Gestor4 {

	public static void main(String[] args) {

		Pintura arregloPintura[] = new Pintura[10];
		Escultura arregloEscultura[] = new Escultura[10];
		Fotografia arregloFotografia[] = new Fotografia[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("----------Bienvenido al gestor de Obras de Arte----------");
			System.out.println("Ingrese la opcion que quiera realizar");
			System.out.println("1- Ingresar una Pintura: ");
			System.out.println("2- Ingrese una Escultura: ");
			System.out.println("3- Ingrese una Fotografia");
			System.out.println("4- Mostrar el listado de Obras: ");
			System.out.println("5- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// Ingresar una pintura
				System.out.println("-------Pintura------");
				sc.nextLine();
				System.out.println("Ingrese el Nombre de la Pintura: ");
				String nombrePintura = sc.nextLine();
				System.out.println("Ingrese el Autor de la Pintura: ");
				String autorPintura = sc.nextLine();
				System.out.println("Ingrese el Estilo de la Pintura: ");
				String estiloPintura = sc.nextLine();
				System.out.println("Ingrese el tipo de Pintura (acuarela, acrilico, etc): ");
				String tipoPintura = sc.nextLine();
				altaPintura(arregloPintura, nombrePintura, autorPintura, estiloPintura, tipoPintura);
				break;

			case 2:
				// Ingresar una Escultura
				System.out.println("-------Escultura------");
				sc.nextLine();
				System.out.println("Ingrese el Nombre de la Escultura: ");
				String nombreEscultura = sc.nextLine();
				System.out.println("Ingrese el Autor de la Escultura: ");
				String autorEscultura = sc.nextLine();
				System.out.println("Ingrese el Material de la Pintura: ");
				String materialEscultura = sc.nextLine();
				System.out.println("Ingrese el Peso de la Escultura (En Kilos) : ");
				double pesoEscultura = sc.nextInt();
				altaEscultura(arregloEscultura, nombreEscultura, autorEscultura, materialEscultura, pesoEscultura);
				break;
			case 3:
				// Ingresar una Fotografia
				System.out.println("-------Fotografia------");
				sc.nextLine();
				System.out.println("Ingrese el Nombre de la Fotografia: ");
				String nombreFotografia = sc.nextLine();
				System.out.println("Ingrese el Autor de la Fotografia: ");
				String autorFotografia = sc.nextLine();
				System.out.println("Ingrese la Resolucion de la Fotografia: ");
				String resolucionFotografia = sc.nextLine();
				System.out.println("Ingrese el Lugar donde se tomo la Fografia: ");
				String lugarFotografia = sc.nextLine();
				altaFotografia(arregloFotografia, nombreFotografia, autorFotografia, resolucionFotografia,
						lugarFotografia);
				break;
			case 4:

				listarObras(arregloPintura, arregloEscultura, arregloFotografia);
				break;

			}

		} while (opcion != 5);

	}

	public static void altaPintura(Pintura[] ar, String np, String ap, String ep, String tp) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Pintura(np, ap, ep, tp);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaEscultura(Escultura[] ar, String ne, String ae, String me, double pe) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Escultura(ne, ae, me, pe);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaFotografia(Fotografia[] ar, String nf, String af, String rf, String lf) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Fotografia(nf, af, rf, lf);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void listarObras(Pintura p[], Escultura e[], Fotografia f[]) {

		for (int i = 0; i < p.length; i++) {

			if (p[i] != null) {

				System.out.println("---Pintura---");
				System.out.println(p[i]);
			}

			if (e[i] != null) {

				System.out.println("---Escultura---");
				System.out.println(e[i]);

			}

			if (f[i] != null) {

				System.out.println("---Fotografia---");
				System.out.println(f[i]);

			}

		}

	}
}
