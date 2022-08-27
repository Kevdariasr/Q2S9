package com.mycompany.ejercicio10;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio10 extends JFrame implements ActionListener{

    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton boton1;
    
    public Ejercicio10 (){
        setLayout (null);
        textarea1 = new JTextArea();
        
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10,10,300,200);
        add(scrollpane1);
        
        boton1 = new JButton ("Verificar");
        boton1.setBounds(10, 260, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==boton1){
            String texto = textarea1.getText();
            if (texto.indexOf("Costa Rica")==-1){
                setTitle("No contiene el texto \"Costa Rica\"");
                
            }else{
                setTitle("Si contiene el texto \"Costa Rica\"");
            }
        }
      
    }
    
    public static void main(String[] args) {
        Ejercicio10 llamar= new Ejercicio10() ; 
        llamar.setBounds(0, 0, 400, 380);
        llamar.setVisible(true);

    }
}
