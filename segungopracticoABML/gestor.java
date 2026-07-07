package segungopracticoABML;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {

		Libro libro[] = new Libro[10];
		Revista revista[] = new Revista[10];
		ArticuloCientifico articulocientifico[] = new ArticuloCientifico[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("----------Bienvenido al gestor de publicaciones----------");
			System.out.println("Ingrese que opcion quiere realizar ");
			System.out.println("1- Ingresar un Libro: ");
			System.out.println("2- Ingresar una Revista: ");
			System.out.println("3- Ingresar un Articulo Cientifico: ");
			System.out.println("4- Mostrar el listado de publicaciones: ");
			System.out.println("5- Eliminar un Libro: ");
			System.out.println("6- Eliminar una Revista: ");
			System.out.println("7- Eliminar un Articulo Cientifico: ");
			System.out.println("8- Reemplazar los datos de un Libro: ");
			System.out.println("9- Reemplazar los datos de una Revista: ");
			System.out.println("10- Reemplazar los datos de un Articulo Cientifico: ");
			System.out.println("11- Salir");
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
				System.out.println("Ingrese el Identificador del Libro: ");
				int IdLibro = sc.nextInt();
				altaLibro(libro, tituloLibro, autorLibro, generoLibro, isbnLibro, IdLibro);
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
				System.out.println("Ingrese el Identificador del Libro: ");
				int IdRevista = sc.nextInt();
				altaRevista(revista, tituloRevista, autorRevista, periodicidadRevista, temaPrincipalRevista, IdRevista);
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
				System.out.println("Ingrese el Identificador del Libro: ");
				int IdArticuloCientifico = sc.nextInt();
				altaArticulo(articulocientifico, tituloArticuloCientifico, autorArticuloCientifico,
						campoArticuloCientifico, universidadArticuloCientifico, IdArticuloCientifico);
				break;

			case 4:

				listarPublicaciones(libro, revista, articulocientifico);
				break;
			case 5:
				// Eliminar publicacion libro
				int compl = 0;

				for (int i = 0; i < libro.length; i++) {

					if (libro[i] != null) {
						compl = 1;
					}

				}

				if (compl == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < libro.length; i++) {

						if (libro[i] != null) {

							System.out.println("El Titulo del Libro es '" + libro[i].getTitulo() + "', su autor es '"
									+ libro[i].getAutor() + "', su Genero es '" + libro[i].getGenero()
									+ "', su ISBN es '" + libro[i].getIsbn() + "' y su Numero Identificador es '"
									+ libro[i].getId() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDLibro = sc.nextInt();
					sc.nextLine();

					eliminarLibros(libro, selecIDLibro);

				} else {

					System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
				}
				break;
			case 6:
				// Eliminar publicacion revista
				int compr = 0;

				for (int i = 0; i < revista.length; i++) {

					if (revista[i] != null) {
						compr = 1;
					}

				}

				if (compr == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < revista.length; i++) {

						if (revista[i] != null) {

							System.out.println("El Titulo de al Revista es '" + revista[i].getTitulo()
									+ "', su autor es '" + revista[i].getAutor() + "', su Perioridad el '"
									+ revista[i].getPeriodicidad() + "', su Tema Principal es '"
									+ revista[i].getTemaPrincipal() + "' y su Numero Identificador es '"
									+ revista[i].getId());

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDRevista = sc.nextInt();
					sc.nextLine();

					eliminarRevista(revista, selecIDRevista);

				} else {

					System.out.println("Debe haber una Revista registrado (Altar) para poder elimminarlo (Bajar).");
				}

				break;

			case 7:
				// Eliminar publicacion articulo cientifico
				int compac = 0;

				for (int i = 0; i < articulocientifico.length; i++) {

					if (articulocientifico[i] != null) {
						compac = 1;
					}

				}

				if (compac == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < articulocientifico.length; i++) {

						if (articulocientifico[i] != null) {

							System.out.println("El Titulo del Articulo Cientifico es '"
									+ articulocientifico[i].getTitulo() + "', su autor es '"
									+ articulocientifico[i].getAutor() + "', su Campo de Investigacion es '"
									+ articulocientifico[i].getCampoInvestigacion()
									+ "', la Universidad del Aticulo es '" + articulocientifico[i].getUniversidad()
									+ "' y su Numero Identificador es '" + articulocientifico[i].getId());

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDArticuloCientifico = sc.nextInt();
					sc.nextLine();

					eliminarArticulo(articulocientifico, selecIDArticuloCientifico);

				} else {

					System.out.println(
							"Debe haber un Articulo Cientifico registrado (Altar) para poder elimminarlo (Bajar).");
				}

				break;

			case 8:
				// modificar electronia
				String ntl = "";
				String nal = "";
				String ngl = "";
				String nisbnl = "";
				System.out.println("Ingrese el Numero Identificador de la Publicacion: ");
				int nroIdActualLibro = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Titulo de la Publicacion: ");
				System.out.println("2- Autor de la Publicacion: ");
				System.out.println("3- Genero de la Publicacion: ");
				System.out.println("4- ISBN de la Publicacion: ");
				int datoModificadoLibro = sc.nextInt();
				if (datoModificadoLibro == 1) {

					System.out.println("Ingrese nuevo Titulo: ");
					ntl = sc.next();
				} else if (datoModificadoLibro == 2) {
					System.out.println("Ingresa nuevo Autor: ");
					nal = sc.next();

				} else if (datoModificadoLibro == 3) {
					System.out.println("Ingrese nuevo Genero: ");
					ngl = sc.next();

				} else if (datoModificadoLibro == 4) {
					System.out.println("Ingrese nueva ISBN: ");
					nisbnl = sc.next();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarLibro(libro, nroIdActualLibro, datoModificadoLibro, ntl, nal, ngl, nisbnl);
				break;

			case 9:
				// modificar electronia
				String ntr = "";
				String nar = "";
				String npr = "";
				String nter = "";
				System.out.println("Ingrese el Numero Identificador de la Publicacion: ");
				int nroIdActualRevista = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Titulo de la Publicacion: ");
				System.out.println("2- Autor de la Publicacion: ");
				System.out.println("3- Periodicidad de la Publicacion: ");
				System.out.println("4- Tema de la Publicacion: ");
				int datoModificadoRevista = sc.nextInt();
				if (datoModificadoRevista == 1) {

					System.out.println("Ingrese nuevo Titulo: ");
					ntr = sc.next();
				} else if (datoModificadoRevista == 2) {
					System.out.println("Ingresa nuevo Autor: ");
					nar = sc.next();

				} else if (datoModificadoRevista == 3) {
					System.out.println("Ingrese nueva Periodicidad: ");
					npr = sc.next();

				} else if (datoModificadoRevista == 4) {
					System.out.println("Ingrese nuevo Tema: ");
					nter = sc.next();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarRevista(revista, nroIdActualRevista, datoModificadoRevista, ntr, nar, npr, nter);
				break;

			case 10:

				// modificar electronia
				String ntac = "";
				String naac = "";
				String nciac = "";
				String nuac = "";
				System.out.println("Ingrese el Numero Identificador de la Publicacion: ");
				int nroIdActualArticulo = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Titulo de la Publicacion: ");
				System.out.println("2- Autor de la Publicacion: ");
				System.out.println("3- Campo de Investigacion de la Publican: ");
				System.out.println("4- Unuversidad de la Publicacion: ");
				int datoModificadoArticulo = sc.nextInt();
				if (datoModificadoArticulo == 1) {

					System.out.println("Ingrese nuevo Titulo: ");
					ntac = sc.next();
				} else if (datoModificadoArticulo == 2) {
					System.out.println("Ingresa nuevo Autor: ");
					naac = sc.next();

				} else if (datoModificadoArticulo == 3) {
					System.out.println("Ingrese nuevo Campo de Investigacion: ");
					nciac = sc.next();

				} else if (datoModificadoArticulo == 4) {
					System.out.println("Ingrese nueva Univercidad: ");
					nuac = sc.next();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarArticulo(articulocientifico, nroIdActualArticulo, datoModificadoArticulo, ntac, naac, nciac,
						nuac);
				break;
			}

		} while (opcion != 11);

	}

	public static void altaLibro(Libro[] ar, String tl, String al, String gl, String isbnl, int idl) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Libro(tl, al, idl, isbnl, gl, idl);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaRevista(Revista[] ar, String tr, String aur, String pr, String tpr, int idr) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Revista(tr, aur, idr, tpr, pr, idr);
				System.out.println("Guardo");
				break;
			}
		}

	}

	public static void altaArticulo(ArticuloCientifico[] ar, String tac, String aac, String cac, String uac, int idac) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new ArticuloCientifico(tac, aac, idac, uac, cac, idac);
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

	public static void eliminarLibros(Libro[] l, int Idl) {

		int comprobacion = 0;

		for (int i = 0; i < l.length; i++) {

			if (l[i] != null && l[i].getId() == Idl) {

				l[i] = null;
				System.out.println("Producto eliminado");

				break;

			} else {

				comprobacion = 1;
			}

			if (comprobacion == 1) {

				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static void eliminarRevista(Revista[] r, int Idr) {

		int comprobacion = 0;

		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getId() == Idr) {

				r[i] = null;
				System.out.println("Producto eliminado");

				break;

			} else {

				comprobacion = 1;
			}

			if (comprobacion == 1) {

				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static void eliminarArticulo(ArticuloCientifico[] ac, int Idac) {

		int comprobacion = 0;

		for (int i = 0; i < ac.length; i++) {

			if (ac[i] != null && ac[i].getId() == Idac) {

				ac[i] = null;
				System.out.println("Producto eliminado");

				break;

			} else {

				comprobacion = 1;
			}

			if (comprobacion == 1) {

				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static boolean chequearExistenciaLibro(int nroIdLibro, Libro[] l) {

		boolean existe = false;

		for (int i = 0; i < l.length; i++) {

			if (l[i] != null && l[i].getId() == nroIdLibro) {

				existe = true;
				System.out.println("Ya existe un Libro con ese Numero de ID");
				break;

			}

		}
		return existe;

	}


	public static boolean chequearExistenciaRevista(int nroIdRevista, Revista[] r) {

		boolean existe = false;

		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getId() == nroIdRevista) {

				existe = true;
				System.out.println("Ya existe una Revsita con ese Numero de ID");
			}

		}

		return existe;

	}

	public static boolean chequearExistenciaArticulo(int nroIdArticulo, ArticuloCientifico[] ac) {

		boolean existe = false;

		for (int i = 0; i < ac.length; i++) {

			if (ac[i] != null && ac[i].getId() == nroIdArticulo) {

				existe = true;
				System.out.println("Ya existe un Articulo Cientifico con ese Numero de ID");
			}

		}

		return existe;

	}

	public static void modificarLibro(Libro[] l, int nroIdActualLibro, int datoModificadoLibro, String ntl, String nal,
			String ngl, String nisbnl) {

		System.out.println("Vienen: " + nroIdActualLibro);
		for (int i = 0; i < l.length; i++) {

			if (l[i] != null && l[i].getId() == nroIdActualLibro) {

				if (datoModificadoLibro == 1 && !chequearExistenciaLibro(nroIdActualLibro, l)) {

					l[i].setTitulo(ntl);

				} else if (datoModificadoLibro == 2) {

					l[i].setAutor(nal);
				} else if (datoModificadoLibro == 3) {

					l[i].setGenero(ngl);
				} else {

					l[i].setIsbn(nisbnl);

				}

			}

		}

	}

	public static void modificarRevista(Revista[] r, int nroIdActualRevista, int datoModificadoRevista, String ntr, String nar,
			String npr, String nter) {

		System.out.println("Vienen: " + nroIdActualRevista);
		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getId() == nroIdActualRevista) {

				if (datoModificadoRevista == 1 && !chequearExistenciaRevista(nroIdActualRevista, r)) {

					r[i].setTitulo(ntr);

				} else if (datoModificadoRevista == 2) {

					r[i].setAutor(nar);
				} else if (datoModificadoRevista == 3) {

					r[i].setPeriodicidad(npr);
				} else {

					r[i].setTemaPrincipal(nter);

				}

			}

		}

	}

	public static void modificarArticulo(ArticuloCientifico[] ac, int nroIdActualArticulo, int datoModificadoArticulo, String ntac, String naac,
			String nciac, String nuac) {

		System.out.println("Vienen: " + nroIdActualArticulo);
		for (int i = 0; i < ac.length; i++) {

			if (ac[i] != null && ac[i].getId() == nroIdActualArticulo) {

				if (datoModificadoArticulo == 1 && !chequearExistenciaArticulo(nroIdActualArticulo, ac)) {

					ac[i].setTitulo(ntac);

				} else if (datoModificadoArticulo == 2) {

					ac[i].setAutor(naac);
				} else if (datoModificadoArticulo == 3) {

					ac[i].setCampoInvestigacion(nciac);
				} else {

					ac[i].setUniversidad(nuac);

				}

			}

		}

	}

}
