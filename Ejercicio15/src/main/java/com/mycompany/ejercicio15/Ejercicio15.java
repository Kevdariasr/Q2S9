package com.mycompany.ejercicio15;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Ejercicio15 extends JFrame implements ChangeListener{
private JCheckBox check1,check2,check3;
    
    public Ejercicio15(){
        setLayout (null);
       
        check1 = new JCheckBox ("Ingles");
        check1.setBounds(10, 10, 150, 30);
        add(check1);
        
        check2 = new JCheckBox ("Frances");
        check2.setBounds(10, 50, 150, 30);
        add(check2);
        
        check3 = new JCheckBox ("Alemán");
        check3.setBounds(10, 90, 150, 30);
        add(check3);
        
    }
    
    public void stateChanged(ChangeEvent e){
        String cad ="";
        
        if (check1.isSelected()==true){
            cad = cad+"Ingles-";
        }
        if (check2.isSelected()==true){
            cad = cad+"Frances-";
        }
        if (check3.isSelected()==true){
            cad = cad+"Alemán-";
        }
        setTitle(cad);
    }
    
    public static void main(String[] args) {
        Ejercicio15 llamar= new Ejercicio15() ; 
        llamar.setBounds(0, 0, 300, 200);
        llamar.setVisible(true);
    }
}
