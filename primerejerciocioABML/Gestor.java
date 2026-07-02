package primerejerciocioABML;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Electronica electronica[] = new Electronica[10];
		Ropa ropa[] = new Ropa[10];
		Alimento alimento[] = new Alimento[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("Bienvenido al Almacen");
			System.out.println("1- Ingrese un producto Electronico ");
			System.out.println("2- Ingrese un producto de Vestir ");
			System.out.println("3- Ingrese un producto Alimenticio ");
			System.out.println("4- Listado de productos");
			System.out.println("5- Eliminar un Producto Electronico");
			System.out.println("6- Eliminar un Producto de Vestir");
			System.out.println("7- Eliminar un Producto Alimenticio");
			System.out.println("8- Reemplazar Datos de Producto Electonico");
			System.out.println("9- Reemplazar Datos de Producto de Vestir");
			System.out.println("10- Reemplazar Datos de Producto Alimenticio");
			System.out.println("11 Salir");
			System.out.println("Ingrese la opcion");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// ingresar un producto electronico

				System.out.println("----Electronico----");
				sc.nextLine();
				System.out.println("Ingrese nombre del Producto: ");
				String nombreElectro = sc.nextLine();
				System.out.println("Ingrese el precio de producto: ");
				double precioElectro = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdElectro = sc.nextInt();
				System.out.println("Ingrese la Marca del producto: ");
				String marca = sc.nextLine();
				sc.nextLine();
				System.out.println("Ingrese la Garantia del producto: ");
				int garantia = sc.nextInt();
				productoElectronico(electronica, nombreElectro, precioElectro, nroIdElectro, marca, garantia);
				break;

			case 2:
				// ingresar un producto de vestir
				System.out.println("----Ropa----");
				sc.nextLine();
				System.out.println("Ingrese nombre del Producto: ");
				String nombreRopa = sc.nextLine();
				System.out.println("Ingrese el precio de producto: ");
				double precioRopa = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdRopa = sc.nextInt();
				System.out.println("Ingrese el talle del producto: ");
				String talle = sc.next();
				System.out.println("Ingrese el material ddel producto: ");
				String material = sc.nextLine();
				productoVestimenta(ropa, nombreRopa, precioRopa, nroIdRopa, talle, material);
				break;

			case 3:
				// ingresar un producto alimenticio
				System.out.println("----Alimento----");
				sc.nextLine();
				System.out.println("Ingrese nombre del Producto: ");
				String nombreAli = sc.nextLine();
				System.out.println("Ingrese el precio de producto: ");
				double precioAli = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdAli = sc.nextInt();
				System.out.println("Ingrese la Fecha de Vencimiento: ");
				String fechaVenci = sc.nextLine();
				System.out.println("Ingrese las calorias del Alimento: ");
				int calorias = sc.nextInt();
				sc.nextLine();

				productoAlimento(alimento, nombreAli, precioAli, nroIdAli, fechaVenci, calorias);
				break;

			case 4:
				// listar productos
				listarProductos(electronica, ropa, alimento);
				break;

			case 5:
				// Eliminar producto electronico
				int compe = 0;

				for (int i = 0; i < electronica.length; i++) {

					if (electronica[i] != null) {
						compe = 1;
					}

				}

				if (compe == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < electronica.length; i++) {

						if (electronica[i] != null) {

							System.out.println("El Nombre del producto electronico es '" + electronica[i].getNombre()
									+ "', tiene un Precio de '" + electronica[i].getPrecio()
									+ "' pesos, su Numero Identificador es '" + electronica[i].getNroID()
									+ "', su marca es '" + electronica[i].getMarca() + "' y su Garantia es '"
									+ electronica[i].getGarantia() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDElectro = sc.nextInt();
					sc.nextLine();

					eliminarElectronica(electronica, selecIDElectro);

				} else {

					System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
				}

				break;

			case 6:
				// Eliminar producto ropa
				int compr = 0;

				for (int i = 0; i < ropa.length; i++) {

					if (ropa[i] != null) {
						compr = 1;
					}

				}

				if (compr == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < ropa.length; i++) {

						if (ropa[i] != null) {

							System.out.println("El Nombre del producto de Vestir es '" + ropa[i].getNombre()
									+ "', tiene un Precio de '" + ropa[i].getPrecio()
									+ "' pesos, su Numero Identificador es '" + ropa[i].getNroID() + "', su Talle es '"
									+ ropa[i].getTalle() + "' y su Material es '" + ropa[i].getMaterial() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDRopa = sc.nextInt();
					sc.nextLine();

					eliminarElectronica(electronica, selecIDRopa);

				} else {

					System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
				}
				break;
			case 7:
				// Eliminar producto alimento
				int compa = 0;

				for (int i = 0; i < alimento.length; i++) {

					if (alimento[i] != null) {
						compa = 1;
					}

				}

				if (compa == 1) {

					System.out.println("Elegir de la lista: \n");
					for (int i = 0; i < alimento.length; i++) {

						if (alimento[i] != null) {

							System.out.println("El Nombre del producto de Vestir es '" + alimento[i].getNombre()
									+ "', tiene un Precio de '" + alimento[i].getPrecio()
									+ "' pesos, su Numero Identificador es '" + alimento[i].getNroID()
									+ "', su Fecha de Vencimiento es '" + alimento[i].getFechaVenci()
									+ "' y sus calorias son '" + alimento[i].getCalorias() + "'");

						}
					}

					System.out.println("Introduzca el ID del producto a eliminar");
					int selecIDRopa = sc.nextInt();
					sc.nextLine();

					eliminarElectronica(electronica, selecIDRopa);

				} else {

					System.out.println("Debe haber un libro registrado (Altar) para poder elimminarlo (Bajar).");
				}

				break;

			case 8:
				// modificar electronia
				String nne = "";
				double npe = 0;
				String nme = "";
				int nge = 0;
				System.out.println("Ingrese el Numero Identificador: ");
				int nroIdActualElectro = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Nombre del Producto: ");
				System.out.println("2- Precio del Producto: ");
				System.out.println("3- Marca del producto: ");
				System.out.println("4- Garantia del Producto: ");
				int datoModificadoElectro = sc.nextInt();
				if (datoModificadoElectro == 1) {

					System.out.println("Ingrese nuevo Nombre: ");
					nne = sc.nextLine();
				} else if (datoModificadoElectro == 2) {
					System.out.println("Ingresa nuevo Precio: ");
					npe = sc.nextDouble();

				} else if (datoModificadoElectro == 3) {
					System.out.println("Ingrese nueva Marca: ");
					nme = sc.nextLine();

				} else if (datoModificadoElectro == 4) {
					System.out.println("Ingrese nueva Garantia: ");
					nge = sc.nextInt();

				} else {
					System.out.println("Opcion incorrecta");
				}

				modificarElectronico(electronica, nroIdActualElectro, datoModificadoElectro, nne, npe, nme, nge);
				break;

			case 9:
				// modificar ropa
				String nnr = "";
				double npr = 0;
				String ntr = "";
				String nmr = "";
				System.out.println("Ingrese el Numero Identificador: ");
				int nroIdActualRopa = sc.nextInt();
				System.out.println("Ingrese el Dato que quiere Modificar: ");
				System.out.println("1- Nombre del Producto: ");
				System.out.println("2- Precio del Producto: ");
				System.out.println("3- Talle del Producto: ");
				System.out.println("4- Material del Producto: ");
				int datoModificadoVestimenta = sc.nextInt();
				if (datoModificadoVestimenta == 1) {

					System.out.println("Ingresa nuevo Nombre: ");
					nnr = sc.nextLine();
				} else if (datoModificadoVestimenta == 2) {

					System.out.println("Ingresa nuevo Precio: ");
					npr = sc.nextDouble();
				} else if (datoModificadoVestimenta == 3) {

					System.out.println("Ingresa nuevo Talle: ");
					ntr = sc.nextLine();
				} else if (datoModificadoVestimenta == 4) {

					System.out.println("Ingrese nuevo Material: ");
					nmr = sc.nextLine();
				} else {
					System.out.println("Opcion Incorrecta");
				}
				modificarVestimenta(ropa, nroIdActualRopa, datoModificadoVestimenta, nnr, npr, ntr, nmr);
				break;

			case 10:
				// modificar Alimento
				String nna = "";
				double npa = 0;
				String nfva = "";
				int nca = 0;
				System.out.println("Ingrese el Numero Identificador: ");
				int nroIdActualAli = sc.nextInt();
				System.err.println("Ingrese el dato a modificar: ");
				System.err.println("1- Nombre del Producto: ");
				System.err.println("2- Precio del Producto: ");
				System.err.println("3- Fecha de Vencimiento del Producto: ");
				System.err.println("4- Calorias del Producto: ");
				int datoModificadoAli = sc.nextInt();
				if (datoModificadoAli == 1) {

					System.out.println("Ingrese nuevo Nombre: ");
					nna = sc.nextLine();
				} else if (datoModificadoAli == 2) {

					System.out.println("Ingrese nuevo Precio: ");
					npa = sc.nextDouble();
				} else if (datoModificadoAli == 3) {

					System.out.println("Ingrese nueva Fecha de Vencimiento: ");
					nfva = sc.nextLine();
				} else if (datoModificadoAli == 4) {

					System.out.println("Ingrese nuevas Calorias: ");
					nca = sc.nextInt();
				} else {
					System.out.println("Opcion Incorrecta");
				}
				modificarAlimento(alimento, nroIdActualAli, datoModificadoAli, nna, npa, nfva, nca);
				break;

			default:
				System.out.println("Error");

			}

		} while (opcion != 11);

	}

	public static void productoElectronico(Electronica[] ar, String ne, double pe, int nie, String m, int g) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Electronica(ne, pe, nie, m, g);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void productoVestimenta(Ropa[] ar, String nr, double pe, int nir, String t, String ma) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Ropa(nr, pe, nir, t, ma);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void productoAlimento(Alimento[] ar, String na, double pa, int nia, String v, int c) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Alimento(na, pa, nia, v, c);
				System.out.println("GUardo");
				break;
			}

		}

	}

	public static void listarProductos(Electronica e[], Ropa r[], Alimento a[]) {

		for (int i = 0; i < e.length; i++) {

			if (e[i] != null) {

				System.out.println("Electronica");
				System.out.println(e[i]);

			}
			if (r[i] != null) {

				System.out.println("Ropa");
				System.out.println(r[i]);
			}
			if (a[i] != null)
				System.out.println("Alimento");
			System.out.println(a[i]);
		}

	}

	public static void eliminarElectronica(Electronica[] e, int Ide) {

		int comprobacion = 0;

		for (int i = 0; i < e.length; i++) {

			if (e[i] != null && e[i].getNroID() == Ide) {

				e[i] = null;
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

	public static void eliminarRopa(Ropa[] r, int Idr) {

		int comprobacion = 0;

		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getNroID() == Idr) {

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

	public static void eliminarAlimento(Alimento[] a, int Ida) {

		int comprobacion = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null && a[i].getNroID() == Ida) {

				a[i] = null;
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

	public static boolean chequearExistenciaElectro(int nroIdElectro, Electronica[] e) {

		boolean existe = false;

		for (int i = 0; i < e.length; i++) {

			if (e[i] != null && e[i].getNroID() == nroIdElectro) {

				existe = true;
				System.out.println("Ya existe un Producto con este Numero de Identificacion");

			}

		}
		return existe;

	}

	public static boolean chequearExistenciaRopa(int nroIdRop, Ropa[] r) {

		boolean existe = false;

		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getNroID() == nroIdRop) {

				existe = true;
				System.out.println("Ya existe un Producto con este Numero de Identificacion");
			}

		}

		return existe;

	}

	public static boolean chequearExistenciaAlimento(int nroIdAli, Alimento[] a) {

		boolean existe = false;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != null && a[i].getNroID() == nroIdAli) {

				existe = true;
				System.out.println("Ya esxiste un Producto con este Numero de Identificacion");
			}

		}

		return existe;

	}

	public static void modificarElectronico(Electronica e[], int nroIdActualElectro, int datoModificadoElectro,
			String nne, double npe, String nme, int nge) {

		System.out.println("Vienen: " + nroIdActualElectro);
		for (int i = 0; i < e.length; i++) {

			if (e[i] != null && e[i].getNroID() == nroIdActualElectro) {

				if (datoModificadoElectro == 1 && !chequearExistenciaElectro(nroIdActualElectro, e)) {

					e[i].setNombre(nne);

				} else if (datoModificadoElectro == 2) {

					e[i].setPrecio(npe);

				} else if (datoModificadoElectro == 3) {

					e[i].setMarca(nme);

				} else {

					e[i].setGarantia(nge);

				}

			}

		}

	}

	public static void modificarVestimenta(Ropa r[], int nroIdActualRopa, int datoModificadoVestimenta, String nnr,
			double npr, String ntr, String nmr) {

		System.out.println("Viene " + nroIdActualRopa);
		for (int i = 0; i < r.length; i++) {

			if (r[i] != null && r[i].getNroID() == nroIdActualRopa) {

				if (datoModificadoVestimenta == 1 && !chequearExistenciaRopa(nroIdActualRopa, r)) {

					r[i].setNombre(nnr);

				} else if (datoModificadoVestimenta == 2) {

					r[i].setPrecio(npr);

				} else if (datoModificadoVestimenta == 3) {

					r[i].setTalle(ntr);

				} else {

					r[i].setMaterial(nmr);

				}

			}

		}

	}

	public static void modificarAlimento(Alimento a[], int nroIdActualAli, int datoModificadoAli, String nna,
			double npa, String nfva, int nca) {

		System.out.println("viene: " + nroIdActualAli);
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null && a[i].getNroID() == nroIdActualAli) {

				if (datoModificadoAli == 1 && !chequearExistenciaAlimento(nroIdActualAli, a)) {

					a[i].setNombre(nna);

				} else if (datoModificadoAli == 2) {

					a[i].setPrecio(npa);

				} else if (datoModificadoAli == 3) {

					a[i].setFechaVenci(nfva);

				} else if (datoModificadoAli == 4) {

					a[i].setCalorias(nca);

				}
			}
		}

	}

}
