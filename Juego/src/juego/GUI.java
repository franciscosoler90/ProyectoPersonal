package juego;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GUI {
	
	JSpinner spinnerNumero = new JSpinner();
	JTextArea textAreaResultado = new JTextArea();
	JLabel lblOportunidades = new JLabel();
	JLabel lblPlayerName = new JLabel();
	JLabel lblNivel = new JLabel();
	JOptionPane ventanaDialogo = new JOptionPane();
	

	public void cambiarTextoOportunidades() {
		lblOportunidades.setText(partida.getOportunidades().toString());
	}
	
	public void cambiarTexto(String texto) {
		textAreaResultado.setText(texto);
	}
	
	public void cambiarNombreTexto(String texto) {
		lblPlayerName.setText(texto);
	}
	
	public void reiniciarSpinner() {
		spinnerNumero.setValue(0);
	}
	
	public void setSpinner() {
		spinnerNumero.setValue( partida.getNumeroSeleccionado() );
	}
	
	public void mostrarMensaje(String titulo, String mensaje) {
		JOptionPane.showMessageDialog(frmJuego, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
	public void mostrarNivel(Integer nivel) {
		
		if(nivel == 1 || nivel == 2) {

			lblNivel.setText( nivel.toString() );
		}
		
	}
	
	
	public void guardarPartida() {
		
		BufferedWriter br = null;
		String nombre = partida.getNombre();

		if((nombre!=null) && (nombre.length()>0)) {
			
			try {
				br = new BufferedWriter(new FileWriter("partida.dat"));
				
				String cadena = partida.toString();
				
				br.write(cadena);
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e2) {
				e2.printStackTrace();
			} finally {
				
				try {
					if(br!=null) {
						br.close();
					}
				} catch (IOException e) {
			        System.out.println("Error al cerrar el fichero");
					e.printStackTrace();
				}
				
				
			}
			
		}
	}
	
	public void cargarPartida() {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("partida.dat"));
			
			try {
				
				String cadena = br.readLine();
				
				String cadenaArray[] = cadena.split(",");
				
				if(cadenaArray.length == 6) {

					try {
					
					String nombre = cadenaArray[0];
					Integer nivel = Integer.parseInt(cadenaArray[1]);
					Integer oportunidades = Integer.parseInt(cadenaArray[2]);
					Integer aleatorio = Integer.parseInt(cadenaArray[3]);
					Integer numeroSeleccionado = Integer.parseInt(cadenaArray[4]);
					Boolean finPartida = Boolean.parseBoolean(cadenaArray[5]);
					
					partida.cargarJuego( nombre, nivel, oportunidades, aleatorio, numeroSeleccionado, finPartida );
					
					cambiarNombreTexto( nombre );
					mostrarNivel( nivel );
					cambiarTextoOportunidades();
					cambiarTexto("");
					setSpinner();
					
					} catch (NumberFormatException e) {
						
						System.out.println("Información no válida");
						
					}
					
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
			e.printStackTrace();
		} finally {

			try {
				if(br!=null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
	
	public String recibirTexto(String titulo, String mensaje) {
		
			String cadena = (String)JOptionPane.showInputDialog(frmJuego,mensaje,titulo,JOptionPane.PLAIN_MESSAGE);

			if ((cadena != null) && (cadena.length() > 0)) {
				return cadena;
			}else {
				return null;
			}
	}

	private JFrame frmJuego;
	
	Juego partida = new Juego();



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
		
		String texto = recibirTexto("Nueva partida","Introduce tu nombre");

		if( texto!=null && texto.length() > 0){
			partida.setNombre(texto);
			cambiarNombreTexto(texto);
			mostrarNivel(partida.getNivel());
			
			frmJuego = new JFrame();
			frmJuego.setResizable(false);
			frmJuego.setVisible(true);
			frmJuego.setTitle("Adivina el n\u00FAmero - Fran Soler");
			frmJuego.setBounds(100, 100, 450, 450);
			frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmJuego.getContentPane().setLayout(null);
			
			cambiarTextoOportunidades();
	
			JLabel lblNewLabel = new JLabel("Adivina el n\u00FAmero");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblNewLabel.setBounds(90, 10, 250, 50);
			frmJuego.getContentPane().add(lblNewLabel);
			
			JButton btnNewButton = new JButton("JUGAR");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					if( !partida.getFinPartida() ) {
					
						if(partida.getOportunidades() > 1) {
							
							int numeroSeleccion = (int) spinnerNumero.getValue();
							
							partida.setNumeroSeleccionado(numeroSeleccion);
							partida.restarOportunidades();
									
							cambiarTextoOportunidades();
							
		
							if(numeroSeleccion == partida.getNumeroAleatorio() ) {
								
								partida.subirNivel();
	
								cambiarTexto("");
								cambiarTextoOportunidades();
								mostrarNivel( partida.getNivel() );
								reiniciarSpinner();
								
								System.out.println(partida.getNivel());
								
								if(partida.getFinPartida() ) {
									
									mostrarMensaje("Has ganado","¡Enhorabuena has ganado el juego!");								
									
								}else {
	
									mostrarMensaje("Has ganado","¡Genial!\nSubes de nivel");
	
									
								}
								
							}else if( numeroSeleccion < partida.getNumeroAleatorio() ) {
								
								cambiarTexto("El número " + numeroSeleccion + " es menor al número que estoy pensando");
								
							}else {
								
								cambiarTexto("El número " + numeroSeleccion + " es mayor al número que estoy pensando");
		
							}
						
						}else {
							
							partida.setOportunidades(0);
							mostrarMensaje("Fin de la partida", "Intentalo de nuevo :-)");
							cambiarTextoOportunidades();
							cambiarTexto("");
							
						}
	
					}else {
						
						cambiarTexto("");
						cambiarTextoOportunidades();
						reiniciarSpinner();
						mostrarMensaje("Fin de la partida","Inicia un nuevo juego.");
						
					}
					
				}
			});
			btnNewButton.setBounds(164, 99, 96, 21);
			frmJuego.getContentPane().add(btnNewButton);
			
	
			spinnerNumero.setModel(new SpinnerNumberModel(0, 0, 1000, 1));
			spinnerNumero.setBounds(164, 69, 96, 20);
			frmJuego.getContentPane().add(spinnerNumero);
			
			JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de oportunidades: ");
			lblNewLabel_1.setBounds(10, 140, 168, 21);
			frmJuego.getContentPane().add(lblNewLabel_1);
			
	
			lblOportunidades.setBounds(164, 144, 45, 13);
			frmJuego.getContentPane().add(lblOportunidades);
			
	
			textAreaResultado.setBounds(10, 237, 414, 141);
			frmJuego.getContentPane().add(textAreaResultado);
			
			JLabel lblNewLabel_2 = new JLabel("Jugador:");
			lblNewLabel_2.setBounds(10, 170, 68, 14);
			frmJuego.getContentPane().add(lblNewLabel_2);
			
	
			lblPlayerName.setBounds(82, 170, 96, 14);
			frmJuego.getContentPane().add(lblPlayerName);
			
			JLabel lblNewLabel_3 = new JLabel("Nivel:");
			lblNewLabel_3.setBounds(10, 200, 68, 14);
			frmJuego.getContentPane().add(lblNewLabel_3);
			
	
			lblNivel.setBounds(82, 200, 46, 14);
			frmJuego.getContentPane().add(lblNivel);
			
			JMenuBar menuBar = new JMenuBar();
			frmJuego.setJMenuBar(menuBar);
			
			JMenu mnNewMenu = new JMenu("Inicio");
			menuBar.add(mnNewMenu);
			
			JMenuItem mntmNewMenuItem_3 = new JMenuItem("Guardar partida");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					guardarPartida();
				}
			});
			mnNewMenu.add(mntmNewMenuItem_3);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("Cargar Partida");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cargarPartida();
				}
			});
			mnNewMenu.add(mntmNewMenuItem);
			
			JMenu mnNewMenu_1 = new JMenu("Ayuda");
			menuBar.add(mnNewMenu_1);
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Instrucciones");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
					mostrarMensaje("Intrucciones","Tienes que introducir un número entre 1 y el 100 y adivinarlo. Tienes 5 oportunidades.\n\nPara volver a iniciar una nueva partida dale a Nueva Partida en el menú.");
					
				}
			});
			mnNewMenu_1.add(mntmNewMenuItem_1);
			
			JMenuItem mntmNewMenuItem_2 = new JMenuItem("Acerca de ...");
			mnNewMenu_1.add(mntmNewMenuItem_2);
		}
	}
}