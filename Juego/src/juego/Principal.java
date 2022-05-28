package juego;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmAdivinaElNmero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAdivinaElNmero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdivinaElNmero = new JFrame();
		frmAdivinaElNmero.setTitle("Adivina el n\u00FAmero - Fran Soler");
		frmAdivinaElNmero.setResizable(false);
		frmAdivinaElNmero.setBounds(100, 100, 450, 300);
		frmAdivinaElNmero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmAdivinaElNmero.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewGame = new JMenuItem("Nueva Partida");
		mntmNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@SuppressWarnings("unused")
				GUI ventana = new GUI();

			}
		});
		mnNewMenu.add(mntmNewGame);
		
		JMenu mnNewMenu_1 = new JMenu("Colores");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Rojo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				JPanel panel = (JPanel) frmAdivinaElNmero.getContentPane();
				
				panel.setBackground(Color.RED);
				
				JOptionPane.showMessageDialog(frmAdivinaElNmero, "Rojo", "Color", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Verde");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				JPanel panel = (JPanel) frmAdivinaElNmero.getContentPane();
				
				panel.setBackground(Color.GREEN);
				
				JOptionPane.showMessageDialog(frmAdivinaElNmero, "Verde", "Color", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Azul");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JPanel panel = (JPanel) frmAdivinaElNmero.getContentPane();
				
				panel.setBackground(Color.BLUE);
				
				JOptionPane.showMessageDialog(frmAdivinaElNmero, "Azul", "Color", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
	}

}
