/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Esteira {
    //ATRIBUTOS
    private boolean estado;
    //CONSTRUTOR
    public Esteira(){
        estado = true;
    }
    //MÉTODOS
    public void ligar(){
        estado = true;
        JOptionPane.showMessageDialog(null,"Esteira ligada");
    }
    public void desligar(){
     estado = false;
     JOptionPane.showMessageDialog(null,"Esteira desligada");
    }    
}
