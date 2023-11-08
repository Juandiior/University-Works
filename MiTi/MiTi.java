import javax.swing.*;
import java.awt.Color;
import java.util.Scanner;

public class CrearVentana {
    public static void main(String[] args) {
        JFrame window = new JFrame("MiTi"); // Crear una instancia de JFrame
        JLabel title = new JLabel("Hola Shavales", null, 0);
        JButton button = new JButton("Aceptar", null);
        
        window.add(title);
        window.add(button);
        window.setSize(500, 300); // Establecer el tamaño de la window
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establecer la acción de cierre
        window.setVisible(true); // Hacer visible la window

        button.setBounds(200, 100,100,40);
        title.setBounds(300,100,100,100);
        title.setForeground(Color.red);
    }
}