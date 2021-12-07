package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField dado1;
	private JTextField dado2;
	private JTextField posicion;
	private JTextField dinero;
	JButton lanzarDados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 540);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Monopoly");
		setResizable(false);
		setLocationRelativeTo(null);
		
		lanzarDados = new JButton("Lanzar dados");
		lanzarDados.setBounds(5, 467, 264, 23);
		contentPane.add(lanzarDados);
		
		JLabel lblNewLabel = new JLabel("Monopoly");
		lblNewLabel.setBounds(5, 5, 264, 14);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		dado1 = new JTextField();
		dado1.setEditable(false);
		dado1.setBounds(123, 30, 146, 33);
		contentPane.add(dado1);
		dado1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dado 1");
		lblNewLabel_1.setBounds(5, 30, 108, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dado 2");
		lblNewLabel_2.setBounds(5, 74, 108, 30);
		contentPane.add(lblNewLabel_2);
		
		dado2 = new JTextField();
		dado2.setEditable(false);
		dado2.setBounds(122, 71, 147, 33);
		contentPane.add(dado2);
		dado2.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Posicion");
		lblNewLabel_2_1.setBounds(5, 118, 108, 30);
		contentPane.add(lblNewLabel_2_1);
		
		posicion = new JTextField();
		posicion.setEditable(false);
		posicion.setColumns(10);
		posicion.setBounds(122, 115, 147, 33);
		contentPane.add(posicion);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dinero");
		lblNewLabel_2_2.setBounds(5, 162, 108, 30);
		contentPane.add(lblNewLabel_2_2);
		
		dinero = new JTextField();
		dinero.setEditable(false);
		dinero.setColumns(10);
		dinero.setBounds(122, 159, 147, 33);
		contentPane.add(dinero);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(lanzarDados==e.getSource()) {
			JOptionPane.showMessageDialog(null, "Hola");
		}
	}
}
