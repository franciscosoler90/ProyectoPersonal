package astrologia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frmMiPrimeraGui;
	private JTextField textFieldName;
	
	
	JSpinner spinnerHour = new JSpinner();
	JSpinner spinnerMinute = new JSpinner();
	JSpinner spinnerDay = new JSpinner();
	JSpinner spinnerMonth = new JSpinner();
	JSpinner spinnerYear = new JSpinner();
	
	JLabel lblResult = new JLabel();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmMiPrimeraGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiPrimeraGui = new JFrame();
		frmMiPrimeraGui.setTitle("Mi primera GUI 0.1");
		frmMiPrimeraGui.setResizable(false);
		frmMiPrimeraGui.setBounds(100, 100, 450, 320);
		frmMiPrimeraGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmMiPrimeraGui.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuevo...");
		mnNewMenu.add(mntmNewMenuItem);
		frmMiPrimeraGui.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel);
		
		textFieldName = new JTextField();
		lblNewLabel.setLabelFor(textFieldName);
		textFieldName.setBounds(90, 8, 86, 20);
		frmMiPrimeraGui.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		

		lblResult.setBounds(10, 220, 315, 14);
		frmMiPrimeraGui.getContentPane().add(lblResult);
		
		JLabel lblNewLabel_2 = new JLabel("Hora");
		lblNewLabel_2.setBounds(10, 41, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel_2);
		

		lblNewLabel_2.setLabelFor(spinnerHour);
		spinnerHour.setModel(new SpinnerNumberModel(0, 0, 23, 1));
		spinnerHour.setBounds(90, 38, 70, 20);
		frmMiPrimeraGui.getContentPane().add(spinnerHour);
		
		

		
		
		spinnerMinute.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerMinute.setBounds(90, 68, 70, 20);
		frmMiPrimeraGui.getContentPane().add(spinnerMinute);
		
		JLabel lblNewLabel_3 = new JLabel("Minuto");
		lblNewLabel_3.setLabelFor(lblNewLabel_3);
		lblNewLabel_3.setBounds(10, 71, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("D\u00EDa");
		lblNewLabel_4.setLabelFor(lblNewLabel_4);
		lblNewLabel_4.setBounds(10, 101, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setLabelFor(lblNewLabel_5);
		lblNewLabel_5.setBounds(10, 131, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("A\u00F1o");
		lblNewLabel_6.setLabelFor(lblNewLabel_6);
		lblNewLabel_6.setBounds(10, 161, 46, 14);
		frmMiPrimeraGui.getContentPane().add(lblNewLabel_6);
		

		spinnerDay.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinnerDay.setBounds(90, 98, 70, 20);
		frmMiPrimeraGui.getContentPane().add(spinnerDay);
		

		spinnerMonth.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinnerMonth.setBounds(90, 128, 70, 20);
		frmMiPrimeraGui.getContentPane().add(spinnerMonth);
		

		spinnerYear.setFont(new Font("Tahoma", Font.BOLD, 11));
		spinnerYear.setModel(new SpinnerNumberModel(2022, 1901, 2099, 1));
		spinnerYear.setBounds(90, 158, 70, 20);
		frmMiPrimeraGui.getContentPane().add(spinnerYear);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer day, month, year, hour, minute;
				
				day = (Integer) spinnerDay.getValue();
				month = (Integer) spinnerMonth.getValue();
				year = (Integer) spinnerYear.getValue();
				hour = (Integer) spinnerHour.getValue();
				minute = (Integer) spinnerMinute.getValue();
				
				lblResult.setText( textFieldName.getText() + " - " + day + "/" + month + "/" + year + " - " + hour + ":" + minute );

				
				
			}
		});
		btnNewButton.setBounds(335, 216, 89, 23);
		frmMiPrimeraGui.getContentPane().add(btnNewButton);
	}
}
