package principal;

import javax.swing.*;
import java.awt.event.*;
 
public class Formulario2 extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox check1,check2,check3;
    private JButton boton1;

    public Formulario2() {
        getContentPane().setLayout(null);
        check1=new JCheckBox("Chrome");
        check1.setBounds(10,10,150,30);
        getContentPane().add(check1);
        check2=new JCheckBox("FireFox");
        check2.setBounds(10,50,150,30);      
        getContentPane().add(check2);
        check3=new JCheckBox("Opera");
        check3.setBounds(10,90,150,30);        
        getContentPane().add(check3);               
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,140,100,30);
        boton1.addActionListener(this);
        getContentPane().add(boton1);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad="";
            if (check1.isSelected()) {
                cad=cad+"Chrome-";
            }
            if (check2.isSelected()) {
                cad=cad+"FireFox-";
            }
            if (check3.isSelected()) {
                cad=cad+"Opera-";
            }
            setTitle(cad);          
        }
    }
    public static void main(String[] ar) {
        Formulario2 formulario2=new Formulario2();
        formulario2.setBounds(200,200,350,230);
        formulario2.setVisible(true);
        formulario2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
