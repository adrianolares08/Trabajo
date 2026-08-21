package trecedelocho0;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora extends JFrame {

	public Calculadora() {

		this.setLayout(new FlowLayout());
		this.setTitle("Calculadora");
		this.setSize(1366, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		panel1.setLayout(new GridLayout(2, 2));
		JLabel nro1 = new JLabel("Nro 1");
		JTextField text1 = new JTextField();
		JLabel nro2 = new JLabel("Nro 1");
		JTextField text2 = new JTextField();

		panel2.setLayout(new FlowLayout());
		JLabel resultado = new JLabel("Resultado:");

		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton multi = new JButton("*");
		JButton divi = new JButton("/");
		
		panel4.setLayout(new BorderLayout());

		suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double nro1 = Double.parseDouble(text1.getText());
				double nro2 = Double.parseDouble(text2.getText());

				resultado.setText("Resultado " + Suma(nro1, nro2));

			}
		});
		
		resta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double nro1 = Double.parseDouble(text1.getText());
				double nro2 = Double.parseDouble(text2.getText());

				resultado.setText("Resultado " + Resta(nro1, nro2));

			}
		});
		
		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double nro1 = Double.parseDouble(text1.getText());
				double nro2 = Double.parseDouble(text2.getText());

				resultado.setText("Resultado " + Multiplicacion(nro1, nro2));

			}
		});
		
		divi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double nro1 = Double.parseDouble(text1.getText());
				double nro2 = Double.parseDouble(text2.getText());

				resultado.setText("Resultado " + Division(nro1, nro2));

			}
		});
		
		

		panel1.add(nro1);
		panel1.add(text1);
		panel1.add(nro2);
		panel1.add(text2);
		
		panel2.add(resultado);
		
		panel3.add(suma);
		panel3.add(resta);
		panel3.add(multi);
		panel3.add(divi);

		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.CENTER);
		panel4.add(panel3, BorderLayout.SOUTH);
		
		
		this.add(panel4);

	}

	public Double Suma(double nro1, double nro2) {

		double resultado = nro1 + nro2;

		return resultado;
	}

	public Double Resta(double nro1, double nro2) {

		double resultado = nro1 - nro2;

		return resultado;
	}

	public Double Multiplicacion(double nro1, double nro2) {

		double resultado = nro1 * nro2;

		return resultado;
	}

	public Double Division(double nro1, double nro2) {

		double resultado = nro1 / nro2;

		return resultado;
	}

}
