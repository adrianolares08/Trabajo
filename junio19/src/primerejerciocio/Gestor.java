package primerejerciocio;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {

		Electronica electro1 = new Electronica(null, 1, 0, null, 0);
		Ropa rop2 = new Ropa(null, 2, 0, null, null);
		Alimento ali3 = new Alimento(null, 3, 0, null, 0);
		Electronica arregloElectronica[] = new Electronica[10];
		Ropa arregloRopa[] = new Ropa[10];
		Alimento arregloAlimento[] = new Alimento[10];

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("Bienvenido al Almacen");
			System.out.println("1- Ingrese un producto Electronico ");
			System.out.println("2- Ingrese un producto de Vestir ");
			System.out.println("3- Ingrese un producto Alimenticio ");
			System.out.println("4- Listado de productos");
			System.out.println("5- Salir");
			System.out.println("Ingrese la opcion");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				// ingresar un producto electronico
				
				
				System.out.println("Ingrese nombre del Producto: ");
				String nombreElectro = sc.next();
				System.out.println("Ingrese el precio de producto: ");
				double precioElectro = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdElectro = sc.nextInt();
				System.out.println("Ingrese la Marca del producto: ");
				String marca = sc.next();
				System.out.println("Ingrese la Garantia del producto: ");
				int garantia = sc.nextInt();
				electro1.setMarca(marca);
				electro1.setGarantia(garantia);
				productoElectronico(arregloElectronica, electro1, nombreElectro, precioElectro, nroIdElectro, marca, garantia);
				break;

			case 2:
				// ingresar un producto de vestir
				System.out.println("Ingrese nombre del Producto: ");
				String nombreRop = sc.next();
				System.out.println("Ingrese el precio de producto: ");
				double precioRop = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdRop = sc.nextInt();
				System.out.println("Ingrese el talle del producto: ");
				String talle = sc.next();
				System.out.println("Ingrese el material ddel producto: ");
				String material = sc.next();
				rop2.setTalle(talle);
				rop2.setMaterial(material);
				productoVestimenta(arregloRopa, rop2, nombreRop, precioRop, nroIdRop, talle, material);
				break;

			case 3:
				// ingresar un producto alimenticio
				System.out.println("Ingrese nombre del Producto: ");
				String nombreAli = sc.next();
				System.out.println("Ingrese el precio de producto: ");
				double precioAli = sc.nextDouble();
				System.out.println("Ingrese numero identificador: ");
				int nroIdAli = sc.nextInt();
				System.out.println("Ingrese la Fecha de Vencimiento: ");
				String fechaVenci = sc.next();
				System.out.println("Ingrese las calorias del Alimento: ");
				int calorias = sc.nextInt();
				sc.next();
				ali3.setFechaVenci(fechaVenci);
				ali3.setCalorias(calorias);
				productoAlimento(arregloAlimento, ali3, nombreAli, precioAli, nroIdAli, fechaVenci, calorias);
				break;

			case 4:
				// listar productos
				listarProductos(arregloElectronica, arregloRopa, arregloAlimento);
				break;

			default:
				System.out.println("Error");

			}

		} while (opcion != 5);

	}

	public static void productoElectronico(Producto[] ar, Producto p, String ne, double pe, int nie, String m, int g) {

		if (m.length() > 2) {

			for (int i = 0; i < ar.length; i++) {

				if (ar[i] == null) {

					ar[i] = new Electronica(ne, pe, nie, m, g);
					System.out.println("Guardo");
					break;

				}

			}

		} else {

			System.out.println("Marca de menos de 2 caracteres ");
		}

	}

	public static void productoVestimenta(Producto[] ar, Producto p, String nr, double pe, int nir, String t, String ma) {

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == null) {

				ar[i] = new Ropa(nr, pe, nir, t, ma);
				System.out.println("Guardo");
				break;

			}

		}

	}

	public static void productoAlimento(Producto[] ar, Producto p, String na, double pa, int nia, String v, int c) {

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

}