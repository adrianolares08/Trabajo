package implEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ImplementacionEvent extends JFrame {
	
	public ImplementacionEvent() {

		this.setLayout(new FlowLayout());
		this.setTitle("Primera Implementación - Event & Listener");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		panel1.setLayout(new GridLayout(2, 2));
		JLabel nom = new JLabel("Nombre: ");
		JTextField text1 = new JTextField();
		JLabel nro = new JLabel("Años: ");
		JTextField text2 = new JTextField();

		panel2.setLayout(new FlowLayout());
		JLabel datos = new JLabel();

		panel3.setLayout(new FlowLayout());
		JButton mostrar = new JButton("Mostrar");
		
		
		panel4.setLayout(new BorderLayout());

		mostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nom = text1.getText();
				String nro = text2.getText();
				
				datos.setText("Su nombre es " + nom + " y su Edad es " + nro);

			}
		});
	
		

		panel1.add(nom);
		panel1.add(text1);
		panel1.add(nro);
		panel1.add(text2);
		
		panel2.add(datos);
		
		panel3.add(mostrar);
		

		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.CENTER);
		panel4.add(panel3, BorderLayout.SOUTH);
		
		
		this.add(panel4);

	}


}
