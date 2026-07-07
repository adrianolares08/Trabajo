package tercerpracticoABML;

import java.util.Scanner;

public class Gestor3 {

	public static void main(String[] args) {

		Casa casa[] = new Casa[10];
		Departamento apartamento[] = new Departamento[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("----------Bienvenido al gestor de Edificios----------");
			System.out.println("Ingrese que opcion quiere realiza");
			System.out.println("1- Ingresar una Casa: ");
			System.out.println("2- Ingresar un Departamento: ");
			System.out.println("3- Mostrar el listado de Edificios: ");
			System.out.println("4- Eliminar una Casa: ");
			System.out.println("5- Eliminar un Departamento: ");
			System.out.println("6- Modificar una Casa: ");
			System.out.println("7- Modificar un Departamento: ");
			System.out.println("8- Salir");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// Ingresar una Casa
				System.out.println("-------Casa------");
				sc.nextLine();
				System.out.println("Ingrese la Direccion de la Casa: ");
				String direccionCasa = sc.nextLine();
				System.out.println("Ingrese los Metros Cuadrados de la Casa: ");
				double metrosCasa = sc.nextDouble();
				System.out.println("Ingrese la cantidad de pisos de la casa: ");
				int pisosCasa = sc.nextInt();
				System.out.println("Ingrese la cantidad de Dormitorios de la Casa: ");
				int dormitoriosCasa = sc.nextInt();
				System.out.println("Ingrese la ID de la Casa: ");
				int idCasa = sc.nextInt();
				altaCasa(casa, direccionCasa, metrosCasa, pisosCasa, dormitoriosCasa, idCasa);
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
				System.out.println("Ingrese el ID del Departamento");
				int IdDepartamento = sc.nextInt();
				altaDepartamento(apartamento, direccionDepartamento, metrosDepartamento, nroPisoDepartamento,
						nroDepartamento, IdDepartamento);
				break;

			case 3:
				// Listar los Edificios
				listarEdificios(casa, apartamento);
				break;

			case 4:
				// Eliminar casa
				int compc = 0;

				for (int i = 0; i < casa.length; i++) {

					if (casa[i] != null) {
						compc = 1;
					}

				}

				if (compc == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < casa.length; i++) {

						if (casa[i] != null) {

							System.out.println("La Direccion de la Casa es '" + casa[i].getDireccion()
									+ "', sus Metros Cuadrados son '" + casa[i].getMetroscuadrados()
									+ "', su Numero de Pisos es '" + casa[i].getNropisos()
									+ "', su Numero de Dormitorios es '" + casa[i].getNrodormitorios()
									+ "' y su Numero Identificador es '" + casa[i].getId() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDCasa = sc.nextInt();
					sc.nextLine();

					eliminarCasa(casa, selecIDCasa);

				} else {

					System.out.println("Debe haber una Casa registrado (Altar) para poder elimminarla (Bajar).");
				}
				break;

			case 5:
				// Eliminar Departamento
				int compd = 0;

				for (int i = 0; i < casa.length; i++) {

					if (apartamento[i] != null) {
						compd = 1;
					}

				}

				if (compd == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < apartamento.length; i++) {

						if (apartamento[i] != null) {

							System.out.println("La Direccion del Departamento es '" + apartamento[i].getDireccion()
									+ "', sus Metros Cuadrados son '" + apartamento[i].getMetroscuadrados()
									+ "', su Numero de Piso es '" + apartamento[i].getNropiso()
									+ "', su Numero de Departamento es '" + apartamento[i].getNroapartamento()
									+ "' y su Numero Identificador es '" + apartamento[i].getId() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDDepa = sc.nextInt();
					sc.nextLine();

					eliminarDepartamento(apartamento, selecIDDepa);

				} else {

					System.out.println("Debe haber un Departamento registrado (Altar) para poder elimminarla (Bajar).");
				}
				break;

			case 6:
				// modificar Casa
				String ndc = "";
				double nmc = 0;
				int ncp = 0;
				int nnd = 0;
				System.out.println("Ingrese el Numero Identificador: ");
				int nroIdActualCasa = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Direccion del Domicilio: ");
				System.out.println("2- Metros Cuadrados del Domicilio: ");
				System.out.println("3- Numero de pisos: ");
				System.out.println("4- Numero de Dormitorios: ");
				int datoModificadoCasa = sc.nextInt();
				if (datoModificadoCasa == 1) {

					System.out.println("Ingrese nueva Direccion del Domicilo: ");
					sc.nextLine();
					ndc = sc.next();
				} else if (datoModificadoCasa == 2) {
					System.out.println("Ingresa nuevos Metros Cuadrados del Domiciolio: ");
					nmc = sc.nextDouble();

				} else if (datoModificadoCasa == 3) {
					System.out.println("Ingrese nuevo Numero de Pisos: ");
					ncp = sc.nextInt();

				} else if (datoModificadoCasa == 4) {
					System.out.println("Ingrese nuevo Numero de Dormitorios: ");
					nnd = sc.nextInt();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarCasa(casa, nroIdActualCasa, datoModificadoCasa, ndc, nmc, ncp, nnd);

				break;

			case 7:
				// modificar Departamento
				String ndd = "";
				double nmd = 0;
				int nnp = 0;
				int nnde = 0;
				System.out.println("Ingrese el Numero Identificador: ");
				int nroIdActualDepartamento = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Direccion del Domicilio: ");
				System.out.println("2- Metros Cuadrados del Domicilio: ");
				System.out.println("3- Numero de piso: ");
				System.out.println("4- Numero de Departamento: ");
				int datoModificadoDepartamento = sc.nextInt();
				if (datoModificadoDepartamento == 1) {

					System.out.println("Ingrese nueva Direccion del Domicilo: ");
					sc.nextLine();
					ndd = sc.next();
				} else if (datoModificadoDepartamento == 2) {
					System.out.println("Ingresa nuevos Metros Cuadrados del Domiciolio: ");
					nmd = sc.nextDouble();

				} else if (datoModificadoDepartamento == 3) {
					System.out.println("Ingrese nuevo Numero de Pisos: ");
					nnp = sc.nextInt();

				} else if (datoModificadoDepartamento == 4) {
					System.out.println("Ingrese nuevo Numero de Dormitorios: ");
					nnde = sc.nextInt();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarDepa(apartamento, nroIdActualDepartamento, datoModificadoDepartamento, ndd, nmd, nnp, nnde);

				break;
				
			case 8:
				
				System.out.println("Chau");

			}

		} while (opcion != 9);

	}

	public static void altaCasa(Casa[] ar, String dc, double mt, int cp, int doc, int idc) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Casa(dc, mt, cp, doc, idc);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void altaDepartamento(Departamento[] ar, String dd, double md, int npd, int nd, int ida) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Departamento(dd, md, npd, nd, ida);
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

	public static void eliminarCasa(Casa[] c, int Idc) {

		int comprobacion = 0;

		for (int i = 0; i < c.length; i++) {

			if (c[i] != null && c[i].getId() == Idc) {

				c[i] = null;
				System.out.println("Domicilio eliminado");
				
				break;

			} else {

				comprobacion = 1;
			}

			if (comprobacion == 1) {

				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static void eliminarDepartamento(Departamento[] d, int Idd) {

		int comprobacion = 0;

		for (int i = 0; i < d.length; i++) {

			if (d[i] != null && d[i].getId() == Idd) {

				d[i] = null;
				System.out.println("Domicilio eliminado");

				break;

			} else {

				comprobacion = 1;
			}

			if (comprobacion == 1) {

				System.out.println("Algo salió mal, intentelo de nuevo");
			}
		}

	}

	public static boolean chequearExistenciaCasa(int nroIdCasa, Casa[] c) {

		boolean existe = false;

		for (int i = 0; i < c.length; i++) {

			if (c[i] != null && c[i].getId() == nroIdCasa) {

				existe = true;
				System.out.println("Ya existe un Domicilio con este Numero de Identificacion");
			}

		}

		return existe;

	}

	public static boolean chequearExistenciaDepartamento(int nroIdDepartamento, Departamento[] d) {

		boolean existe = false;

		for (int i = 0; i < d.length; i++) {

			if (d[i] != null && d[i].getId() == nroIdDepartamento) {

				existe = true;
				System.out.println("Ya existe un Domicilio con este Numero de Identificacion");
			}

		}

		return existe;

	}

	public static void modificarCasa(Casa c[], int nroIdActualCasa, int datoModificadoCasa, String ndc, double nmc,
			int ncp, int nnd) {

		System.out.println("Vienen: " + nroIdActualCasa);
		for (int i = 0; i < c.length; i++) {

			if (c[i] != null && c[i].getId() == nroIdActualCasa) {

				if (datoModificadoCasa == 1 && !chequearExistenciaCasa(nroIdActualCasa, c)) {

					c[i].setDireccion(ndc);

				} else if (datoModificadoCasa == 2) {

					c[i].setMetroscuadrados(nmc);

				} else if (datoModificadoCasa == 3) {

					c[i].setNropisos(ncp);

				} else {

					c[i].setNrodormitorios(nnd);

				}

			}

		}

	}

	public static void modificarDepa(Departamento d[], int nroIdActualDepartamento, int datoModificadoDepartamento,
			String ndd, double nmd, int nnp, int nnde) {

		System.out.println("Vienen: " + nroIdActualDepartamento);
		for (int i = 0; i < d.length; i++) {

			if (d[i] != null && d[i].getId() == nroIdActualDepartamento) {

				if (datoModificadoDepartamento == 1 && !chequearExistenciaDepartamento(nroIdActualDepartamento, d)) {

					d[i].setDireccion(ndd);

				} else if (datoModificadoDepartamento == 2) {

					d[i].setMetroscuadrados(nmd);

				} else if (datoModificadoDepartamento == 3) {

					d[i].setNropiso(nnp);

				} else {

					d[i].setNroapartamento(nnde);

				}

			}

		}

	}

}
