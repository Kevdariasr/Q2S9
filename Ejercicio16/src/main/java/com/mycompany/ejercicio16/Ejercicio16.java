package com.mycompany.ejercicio16;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Ejercicio16 extends JFrame implements ActionListener, ChangeListener{
private JButton boton1;
private JLabel label1;    
private JCheckBox check1;    
    
public Ejercicio16(){
    setLayout (null);
    
    label1 = new JLabel ("Esta de acuerdo con las normas deñ servicio?");
    label1.setBounds(10, 10, 400, 30);
    add(label1);
    
    check1 = new JCheckBox ("Acepto");
    check1.setBounds(10, 50, 100, 30);
    add(check1);
    check1.addChangeListener(this);
    
    boton1 = new JButton ("Continuar");
    boton1.setBounds(10, 100, 100, 30);
    add(boton1);
    boton1.addActionListener(this);
    boton1.setEnabled(true);
   
}  
    public void stateChanged(ChangeEvent e){
     if (check1.isSelected()==true){
         boton1.setEnabled(true);
     }   else {
         boton1.setEnabled(false);
     }
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton1){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio16 llamar= new Ejercicio16() ; 
        llamar.setBounds(0, 0, 350, 200);
        llamar.setVisible(true);
    }
}
