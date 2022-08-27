package com.mycompany.ejercicio11;
import javax.swing.*;
import java.awt.event.*;
public class Ejercicio11 extends JFrame implements ActionListener{

   private JComboBox combo1;
    
    public Ejercicio11(){
        setLayout (null);
        combo1 =new JComboBox();
        combo1.setBounds(10, 10, 150, 20);
        add(combo1);
        
        combo1.addItem("Rojo");
        combo1.addItem("Verde");
        combo1.addItem("Azul");
        combo1.addItem("Amarillo");
        combo1.addItem("Negro");
        combo1.addActionListener(this);
        
    }
   
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==combo1){
            String seleccionado = (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
        
  
    }
    public static void main(String[] args) {
        Ejercicio11 llamar ; 
       llamar = new Ejercicio11();
        llamar.setBounds(0, 0, 400, 200);
        llamar.setVisible(true);
       
    }
}
