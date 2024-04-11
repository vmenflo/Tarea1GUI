/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author victor
 */
public class MiPanel1 {
    public static void main(String[] args) {
        // Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("Victor Mena Flores");

	// Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

	// Añadimos un objeto MiPanel al JFrame
        MiPanel nuevo = new MiPanel(Color.green);
        nuevo.getEtiqueta().setText("Hello There!");
	ventanaPrincipal.add(nuevo);

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);
        
        // La ventana no se puede redimensionar
	ventanaPrincipal.setResizable(false);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       

    }
}
