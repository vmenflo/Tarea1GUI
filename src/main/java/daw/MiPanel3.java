/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JFrame;

/**
 *
 * @author Víctor
 */
public class MiPanel3 {
    public static void main(String[] args) {
        // Construimos la ventana
    	JFrame frame = new JFrame("Víctor Mena Flores");
	// La ventana no se puede redimensionar
	frame.setResizable(false);
	// Posición de la ventana
    	frame.setLocationRelativeTo(null);
	// Incluimos el panel en la ventana
        Saludo hola = new Saludo();
        
    	frame.add(hola);
        // Ajusta el frame al contenido
        frame.pack();
	// Hacemos visible la ventana
    	frame.setVisible(true);
	//Acción por defecto al pulsar el botón de cierre de la ventana
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
