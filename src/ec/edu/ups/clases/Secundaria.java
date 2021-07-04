/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author surfa
 */

public class Secundaria extends JFrame{
    private Panel panelPrincipal;
    private JButton buttonReinicio;
    private JPanel panelButton;
    private String m[][];
    private String jugador1;
    private String jugador2;
    public Secundaria(){
        super();
        jugador1="X";
        setTitle("JUEGO DE TRES EN RAYA");
        setBounds(0,0,500,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        m();
        tablero();
        ganador();
        setContentPane(panelPrincipal); 
    }
    
    public void m(){
        m=new String[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=" ";
            }
        }
    }
    
    public void tablero(){
        panelButton=new JPanel();
        
        buttonReinicio = new JButton("Reiniciar juego");
        buttonReinicio.setBounds(0, 0, 50, 50);
        panelButton.add(buttonReinicio);
        add(panelButton, BorderLayout.NORTH);
        
        buttonReinicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for(int i=0; i<m.length; i++){
                    for(int j=0; j<m[i].length; j++){
                        m[i][j]=" ";
                    }
                }
            }
        });      
        
        panelPrincipal=new Panel();
        GridLayout tablero=new GridLayout(3,3);
        panelPrincipal.setLayout(tablero);
        for (int i = 0; i < tablero.getRows(); i++) {
            for (int j = 0; j < tablero.getColumns(); j++) {
                JButton seleccion=new JButton();
                seleccion.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent pal) {
                        if (jugador1=="X") {
                            jugador2=jugador1;
                            seleccion.setText(jugador1);
                            jugador1="O";
                        }else if (jugador1=="O") {
                            seleccion.setText(jugador1);
                            jugador2=jugador1;
                            jugador1="X";
                        }
                    }
                });
                panelPrincipal.add(seleccion);
            }
        }
        add(panelPrincipal, BorderLayout.CENTER);
    }
    
    public void ganador(){
        if(m[0][0].equals("X") && m[0][1].equals("X") &&  m[0][2].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[1][0].equals("X")&& m[1][1].equals("X") &&  m[1][2].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[2][0].equals("X")&& m[2][1].equals("X") &&  m[2][2].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[0][0].equals("X")&& m[1][0].equals("X") &&  m[2][0].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[0][1].equals("X")&& m[1][1].equals("X") &&  m[2][1].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[0][2].equals("X")&& m[1][2].equals("X") &&  m[2][2].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");    
        }else if(m[0][0].equals("X")&& m[1][1].equals("X") &&  m[2][2].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[0][2].equals("X")&& m[1][1].equals("X") &&  m[2][0].equals("X")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 1!");
        }else if(m[0][0].equals("O")&& m[0][1].equals("O") &&  m[0][2].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[1][0].equals("O")&& m[1][1].equals("O") &&  m[1][2].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[2][0].equals("O")&& m[2][1].equals("O") &&  m[2][2].equals("O")){ 
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[0][0].equals("O")&& m[1][0].equals("O") &&  m[2][0].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[0][1].equals("O")&& m[1][1].equals("O") &&  m[2][1].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[0][2].equals("O")&& m[1][2].equals("O") &&  m[2][2].equals("O")){ 
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[0][0].equals("O")&& m[1][1].equals("O") &&  m[2][2].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }else if(m[0][2].equals("O")&& m[1][1].equals("O") &&  m[2][0].equals("O")){
            JOptionPane.showMessageDialog(panelPrincipal,"El ganador es el jugador 2!");
        }
    }
}
