package tercerpractico;

import java.util.Scanner;

public class Gestor3 {

	public static void main(String[] args) {

		Casa arregloCasa[] = new Casa[10];
		Departamento arregloDepartamento[] = new Departamento[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("----------Bienvenido al gestor de Edificios----------");
			System.out.println("Ingrese que opcion quiere realiza");
			System.out.println("1- Ingresar una Casa: ");
			System.out.println("2- Ingresar un Departamento: ");
			System.out.println("3- Mostrar el listado de Edificios: ");
			System.out.println("Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// Ingresar una Casa
				System.out.println("-------Casa------");
				sc.nextLine();
				System.out.println("Ingrse la Direccion de la Casa: ");
				String direccionCasa = sc.nextLine();
				System.out.println("Ingrese los Metros Cuadrados de la Casa: ");
				double metrosCasa = sc.nextDouble();
				System.out.println("Ingrese la cantidad de pisos de la casa: ");
				int pisosCasa = sc.nextInt();
				System.out.println("Ingrese la cantidad de Dormitorios de la Casa: ");
				int dormitoriosCasa = sc.nextInt();
				altaCasa(arregloCasa, direccionCasa, metrosCasa, pisosCasa, dormitoriosCasa);
				break;
				
			case 2:
				// Ingresar un Departamento
				System.out.println("-------Departamento-------");
				sc.nextLine();
				System.out.println("Ingrese la Direccion del Departamento: ");
				String direccionDepartamento = sc.nextLine();
				System.out.println("Ingrese los Metros Cuadrados del Departamento: ");
				double metrosDepartamento = sc.nextDouble();
				System.out.println("Ingrese el Numero de Piso del Departamento: ");
				int nroPisoDepartamento = sc.nextInt();
				System.out.println("Ingrese el Numero del Departamento: ");
				int nroDepartamento = sc.nextInt();
				altaDepartamento(arregloDepartamento, direccionDepartamento, metrosDepartamento, nroPisoDepartamento,
						nroDepartamento);
				break;

			case 3:
				// Listar los Edificios

				listarEdificios(arregloCasa, arregloDepartamento);

			}

		} while (opcion != 4);

	}

	public static void altaCasa(Casa[] ar, String dc, double mt, int pc, int dm) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Casa(dc, mt, pc, dm);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaDepartamento(Departamento[] ar, String dd, double md, int npd, int nd) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Departamento(dd, md, npd, nd);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void listarEdificios(Casa c[], Departamento d[]) {

		for (int i = 0; i < c.length; i++) {

			if (c[i] != null) {

				System.out.println("---Casa---");
				System.out.println(c[i]);
			}

			if (d[i] != null) {

				System.out.println("---Departamento---");
				System.out.println(d[i]);

			}

		}

	}

}
