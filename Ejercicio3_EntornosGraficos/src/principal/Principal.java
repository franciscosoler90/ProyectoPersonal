package principal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Principal {

	public static void main(String[] args) {
		
		MiInterfazGrafica("Mi primera GUI");
		
		//Confirmacion();



	}
	
	public static void MiInterfazGrafica(String titulo) {
		
		JFrame ventana = new JFrame(titulo);
		
		ventana.setLocation(660,340);
		ventana.setSize(480,270);
		//ventana.pack();
		ventana.setVisible(true);
		ventana.setResizable(false);

		// Cierra el programa al cerrar la ventana
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
        // Creando MenuBar y agregando componentes   
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("Inicio");       
        JMenu m2 = new JMenu("Ayuda");       
        JMenu m3 = new JMenu("Fran");   
        mb.add(m1);       
        mb.add(m2);      
        mb.add(m3);
        JMenuItem m11 = new JMenuItem("Abrir");       
        JMenuItem m22 = new JMenuItem("Guardar como");       
        m1.add(m11);       
        m1.add(m22);
		
        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
        JLabel label = new JLabel("Introducir texto");       
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        JButton send = new JButton("Enviar");       
        JButton reset = new JButton("Restablecer");       
        panel.add(label); // Componentes agregados usando Flow Layout     
        panel.add(label); // Componentes agregados usando Flow Layout      
        panel.add(tf);       
        panel.add(send);       
        panel.add(reset);        

        // Área de texto en el centro    
        JTextArea ta = new JTextArea();        

        // Agregar componentes al marco.      
        ventana.getContentPane().add(BorderLayout.SOUTH, panel);       
        ventana.getContentPane().add(BorderLayout.NORTH, mb);       
        ventana.getContentPane().add(BorderLayout.CENTER, ta);       
        ventana.setVisible(true);  

		
        send.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
        	  String textoField = tf.getText();
        	  
        	  if(textoField.length() > 0) {
        		  System.out.println("Texto: " + textoField );
        	  }
          }
        });
        
        
        reset.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
        	  refresh(tf);
          }
        });
        

	}
	
	
    public static void refresh(JTextField textField) {
   	 textField.setText("");
   	}
   
	
	public static void Confirmacion() {
		
		int op = JOptionPane.showConfirmDialog(null,
				 "¿Seguro que desea continuar?",
				 "Ventana de confirmación", JOptionPane.YES_NO_OPTION);

				 if(op == JOptionPane.YES_OPTION){
					 System.out.println("Acción confirmada");
					 System.exit(0);
				 }else{
					 System.out.println("Acción cancelada");
				 }

	}
	
	
	public void initComponents() {
		
		//contenedor = (JPanel) this.contentPane();
		//contenedor.setBackgroundColor(Color.green);

	}
	
	
	public void VentanaJPanel() {
		
	}
	


}