package miPrimerVentana;

import java.awt.*;
import javax.swing.*;

public class MiPrimerVentana extends JFrame {

	public MiPrimerVentana() {
		
	
		this.setLayout(new FlowLayout ());
		this.setTitle("Ventana de Prueba - Adriano Lares");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		JPanel panel1 = new JPanel();
		
		
		panel1.setLayout(new GridLayout(3,2));
		JLabel etiqueta1 = new JLabel("Bienvenido a mi Programa");
		JLabel etiqueta2 = new JLabel("");
		JLabel etiqueta3 = new JLabel("Nombre:");
		JTextField text1 = new JTextField(); 
		JButton boton1 = new JButton("Aceptar");

		panel1.add(etiqueta1);
		panel1.add(etiqueta2);
		panel1.add(etiqueta3);
		panel1.add(text1);
		panel1.add(boton1);
		
		this.add(panel1);
}

}
