
package vista;
//import java.awt.Component;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
public class Aplicacion { 
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Ventana con Botones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear una etiqueta para mostrar la posición del mouse
        JLabel etiquetaPosicion = new JLabel("El grupo esta conformado por: ");
        JLabel integranteUno = new JLabel("SANI SATAN OMAR ALEXANDER------- ");
        JLabel integranteDos = new JLabel("ELIAN AURELIO JARAMILLO MUÑOZ------  ");
        JLabel integranteTres = new JLabel("QUIMBIULCO ARIAS HECTOR PATRICIO------ "); 
        JLabel titulo = new JLabel("Cree que los integrantes del grupo se merecen un 10 al examen?");
        panel.add(etiquetaPosicion);
        panel.add(integranteUno);
        panel.add(integranteDos);
        panel.add(integranteTres);
        panel.add(titulo);

        // Agregar un MouseMotionListener para obtener la posición del mouse
        ventana.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                //etiquetaPosicion.setText("Posición del mouse: X = " + x + ", Y = " + y);
            }
        });

        // Crear botones "Sí" y "No"
        JButton botonSi = new JButton("Por supuesto que SÍ");
        JButton botonNo = new JButton("No :c");

        // Agregar ActionListener para los botones
        botonSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Su accion ah sido registrada");
                JOptionPane.showMessageDialog(ventana, "Gracias Ing esperamos que la pase muy bien");
            }
        });

        botonNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Vuelva a intentarlo");
            }
        });

        // Agregar MouseListener para el botón "No"
        botonNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Mover la ventana aleatoriamente
                moverVentanaAleatoriamente(ventana);
            }
        });

        // Agregar los botones al panel
        panel.add(botonSi);
        panel.add(botonNo);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Configurar el tamaño y mostrar la ventana
        ventana.setSize(500, 300);
        ventana.setVisible(true);

        // Obtener la posición del botón "No"
        Point posicionBotonNo = botonNo.getLocationOnScreen();
        System.out.println("Posición del botón 'No': X = " + posicionBotonNo.x + ", Y = " + posicionBotonNo.y);

        // Mostrar el mensaje en la ventana
        JOptionPane.showMessageDialog(ventana,
                "Escoja una opción sin precion alguna, sabiendo que los estudiantes no durmieron en toda la noche y se esforzaron bastante");
    }

    private static void moverVentanaAleatoriamente(JFrame ventana) {
        Random random = new Random();
        int x = random.nextInt(800); // Rango de coordenadas x
        int y = random.nextInt(600); // Rango de coordenadas y
        ventana.setLocation(x, y);
    }
}
