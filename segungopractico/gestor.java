package segungopractico;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Libro arreglolibro[] = new Libro[10];
		Revista arreglorevista[] = new Revista[10];
		ArticuloCientifico arregloarticulocientifico[] = new ArticuloCientifico[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("----------Bienvenido al gestor de publicaciones----------");
			System.out.println("Ingrese que opcion quiere realizar ");
			System.out.println("1- Ingrese un Libro: ");
			System.out.println("2- Ingrese una Revista: ");
			System.out.println("3- Ingrese un Articulo Cientifico: ");
			System.out.println("4- Mostrar el listado de publicaciones: ");
			System.out.println("5- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// ingresar un libro
				System.out.println("--------Libro--------");
				sc.nextLine();
				System.out.println("Ingrese el Titulo del Libro: ");
				String tituloLibro = sc.nextLine();
				System.out.println("Ingrese el Autor del Libro: ");
				String autorLibro = sc.nextLine();
				System.out.println("Ingrese el Genero del Libro: ");
				String generoLibro = sc.nextLine();
				System.out.println("Ingrese el ISBN del Libro: ");
				String isbnLibro = sc.nextLine();
				altaLibro(arreglolibro, tituloLibro, autorLibro, generoLibro, isbnLibro);
				break;

			case 2:
				// ingresar una revista
				System.out.println("--------Revista--------");
				sc.nextLine();
				System.out.println("Ingrese el Titulo de la Revista: ");
				String tituloRevista = sc.nextLine();
				System.out.println("Ingrese el Autor de la Revista: ");
				String autorRevista = sc.nextLine();
				System.out.println("Ingrese la Periodicidad o Frecuencia de la Revista (Diaria, Semanal, etx): ");
				String periodicidadRevista = sc.nextLine();
				System.out.println("Ingrese el tema princial de la Revista: ");
				String temaPrincipalRevista = sc.nextLine();
				altaRevista(arreglorevista, tituloRevista, autorRevista, periodicidadRevista, temaPrincipalRevista);
				break;

			case 3:
				// ingresar articulo cientifico
				System.out.println("--------Articulo Cientifico--------");
				sc.nextLine();
				System.out.println("Ingrese el Titulo del Articulo Cientifico: ");
				String tituloArticuloCientifico = sc.nextLine();
				System.out.println("Ingrese el Autor del Articulo Cientifico: ");
				String autorArticuloCientifico = sc.nextLine();
				System.out.println("Ingrese el Campo de investigacion del Articulo Cientifico: ");
				String campoArticuloCientifico = sc.nextLine();
				System.out.println(
						"Ingrese la Universidad del Articulo Cientifico(si no es de alguna Universidad coloque 'ninguna': ");
				String universidadArticuloCientifico = sc.nextLine();
				altaArticulo(arregloarticulocientifico, tituloArticuloCientifico, autorArticuloCientifico,
						campoArticuloCientifico, universidadArticuloCientifico);
				break;

			case 4:

				listarPublicaciones(arreglolibro, arreglorevista, arregloarticulocientifico);

			}

		} while (opcion != 5);

	}

	public static void altaLibro(Libro[] ar, String tl, String al, String gl, String isbnl) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Libro(tl, al, gl, isbnl);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaRevista(Revista[] ar, String tr, String aur, String pr, String tpr) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Revista(tr, aur, pr, tpr);
				System.out.println("Guardo");
				break;
			}
		}

	}

	public static void altaArticulo(ArticuloCientifico[] ar, String tac, String aac, String cac, String uac) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new ArticuloCientifico(tac, aac, cac, uac);
				System.out.println("Guardo");
				break;
			}
		}
	}

	public static void listarPublicaciones(Libro l[], Revista r[], ArticuloCientifico ac[]) {

		for (int i = 0; i < l.length; i++) {

			if (l[i] != null) {

				System.out.println("Libro");
				System.out.println(l[i]);

			}

			if (r[i] != null) {

				System.out.println("Revista");
				System.out.println(r[i]);
			}

			if (ac[i] != null) {
				System.out.println("Articulo Cientifico");
				System.out.println(ac[i]);
			}

		}

	}

}
