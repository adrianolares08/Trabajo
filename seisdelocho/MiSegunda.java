package seisdelocho;

import java.awt.*;
import javax.swing.*;

public class MiSegunda extends JFrame {

	public MiSegunda() {


		this.setLayout(new FlowLayout ());
		this.setTitle("Registrar Usuario");// Establece el titulo de la ventana
		this.setSize(1366, 768);// tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Accion default al cerrar
		this.setLocationRelativeTo(null);// Posicion en la que inicia la ventana
		this.setResizable(true);
		JPanel panel2 = new JPanel();
		
		
		panel2.setLayout(new GridLayout(7,2));
		String[] genero = {"Administrador", "Usuario", "Otros"};
		JLabel etiqueta1 = new JLabel("Nombre");//creo etiqueta
		JTextField text1 = new JTextField(); 
		JLabel etiqueta2 = new JLabel("Apellido");
		JTextField text2 = new JTextField(); 
		JLabel etiqueta3 = new JLabel("Cedula");
		JTextField text3 = new JTextField();
		JLabel etiqueta4 = new JLabel("Edad");
		JTextField text4 = new JTextField();
		JLabel etiqueta5 = new JLabel("Rol");
		JComboBox cbGenero = new JComboBox(genero);
		JButton boton1 = new JButton("Registar");

		
		panel2.add(etiqueta1);
		panel2.add(text1);
		panel2.add(etiqueta2);
		panel2.add(text2);
		panel2.add(etiqueta3);
		panel2.add(text3);
		panel2.add(etiqueta4);
		panel2.add(text4);
		panel2.add(etiqueta5);
		panel2.add(cbGenero);
		panel2.add(boton1);
		
		this.add(panel2);
	}

}
