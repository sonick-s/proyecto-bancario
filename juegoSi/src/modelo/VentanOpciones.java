
package modelo;

import java.awt.Component;
import javax.swing.JOptionPane;

public class VentanOpciones {

        // Componente padre (puede ser null)
        Object parentComponent = null;

        // Mensaje a mostrar
        String mensaje = "¿Desea continuar?";

        // Título del diálogo
        String titulo = "Confirmación";

        // Opciones del diálogo
        int opciones = JOptionPane.YES_NO_OPTION;

        // Tipo de mensaje (INFORMATION_MESSAGE, QUESTION_MESSAGE, etc.)
        int tipoMensaje = JOptionPane.QUESTION_MESSAGE;

        // Mostrar el diálogo de confirmación
        int resultado = JOptionPane.showOptionDialog((Component) parentComponent, mensaje, titulo, opciones, tipoMensaje, null, null, null);

}