package com.mycompany.ejercicio17;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Ejercicio17 extends JFrame implements ChangeListener {
private JRadioButton radio1,radio2,radio3;
private ButtonGroup bg;

 public Ejercicio17(){  
 setLayout (null);
 bg = new ButtonGroup();
 
    radio1 = new JRadioButton ("640*480");
    radio1.setBounds(10, 20, 100, 30);
    add(radio1);
    radio1.addChangeListener(this);
    bg.add(radio1);
    
    radio2 = new JRadioButton ("800*600");
    radio2.setBounds(10, 70, 100, 30);
    add(radio2);
    radio2.addChangeListener(this);
    bg.add(radio2);
    
    radio3 = new JRadioButton ("1024*768");
    radio3.setBounds(10, 120, 100, 30);
    add(radio3);
    radio3.addChangeListener(this);
    bg.add(radio3);
     
 } 
 public void stateChanged(ChangeEvent e){
    if (radio1.isSelected()){
        setSize(640,480);
    }  
    if (radio2.isSelected()){
        setSize(800,600);
    } 
    if (radio3.isSelected()){
        setSize(1024,768);
    } 
}
    public static void main(String[] args) {
        Ejercicio17 llamar= new Ejercicio17() ; 
        llamar.setBounds(0, 0, 350, 230);
        llamar.setVisible(true);
    }
}
