package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import controller.ThreadCarros;

public class TelaCorrida extends JFrame {

	private JPanel contentPane;
	private JTextField textvencedor;
	private JTextField textperdedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCorrida frame = new TelaCorrida();
					frame.setVisible(true);
					Thread carro1 = new ThreadCarros(100, 30, 1);
					Thread carro2 = new ThreadCarros(100, 30, 2);
					
					carro1.start();
					carro2.start();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCorrida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Carro_1 = new JLabel("Carro 1");
		Carro_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		Carro_1.setBounds(10, 11, 85, 32);
		contentPane.add(Carro_1);
		
		JLabel Carro_2 = new JLabel("Carro 2");
		Carro_2.setForeground(Color.RED);
		Carro_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		Carro_2.setBounds(10, 60, 96, 32);
		contentPane.add(Carro_2);
		
		JLabel lblNewLabel = new JLabel("________________________________________________________________________________________________________________");
		lblNewLabel.setBounds(10, 40, 673, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCorrer = new JButton("CORRER!");
		btnCorrer.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCorrer.setBounds(10, 253, 109, 23);
		contentPane.add(btnCorrer);
		
		textvencedor = new JTextField();
		textvencedor.setBounds(296, 162, 103, 20);
		contentPane.add(textvencedor);
		textvencedor.setColumns(10);
		
		textperdedor = new JTextField();
		textperdedor.setBounds(296, 203, 103, 20);
		contentPane.add(textperdedor);
		textperdedor.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Vencedor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(211, 165, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Perdedor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(211, 206, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		ActionListener vencedor = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
	}
}
