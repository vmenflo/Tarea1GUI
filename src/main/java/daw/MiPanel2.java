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
public class MiPanel2 {
    public static void main(String[] args) {
        JFrame ventanaPrincipal = new JFrame ("Victor Mena Flores");

        
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout

        //Se añade de forma independiente
        //Norte
        MiPanel norte = new MiPanel(Color.blue);
        norte.getEtiqueta().setText("NORTE");
        //Sur
        MiPanel sur = new MiPanel(Color.blue);
        sur.getEtiqueta().setText("SUR");
        //Este
        MiPanel este = new MiPanel(Color.red);
        este.getEtiqueta().setText("ESTE");
        //Oeste
        MiPanel oeste = new MiPanel(Color.red);
        oeste.getEtiqueta().setText("OESTE");
        //Centro
        MiPanel centro = new MiPanel(Color.yellow);
        centro.getEtiqueta().setText("CENTRO");

        //Añadimos las ventanas
        ventanaPrincipal.add(norte, BorderLayout.NORTH);

	// Añadir panel rojo en la posición inferior (SOUTH)
    	ventanaPrincipal.add(sur, BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(centro, BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
    	ventanaPrincipal.add(oeste, BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
    	ventanaPrincipal.add(este, BorderLayout.EAST);
        
        // Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

	// Añadimos un objeto MiPanel al JFrame
	//ventanaPrincipal.add(new MiPanel(Color.cyan));

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Para que no se redimensione
        ventanaPrincipal.setResizable(false);
    }
}
