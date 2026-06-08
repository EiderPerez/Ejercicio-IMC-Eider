package app;

import javax.swing.SwingUtilities;

/**
 * Clase principal de arranque de la aplicación Calculadora IMC.
 * Yo uso este punto de entrada para iniciar la interfaz gráfica
 * en el hilo de despacho de eventos de Swing, tal como lo recomienda Java.
 *
 * @author achermes
 * Completado por: Eider David Pérez Quevedo
 */
public class Principal {

    /**
     * Mi método main: punto de entrada del programa.
     * Yo invoco la VentanaPrincipal de forma segura en el hilo de Swing.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta app).
     */
    public static void main(String[] args) {
        // Yo lanzo la ventana principal dentro del hilo de eventos de Swing
        // para garantizar la seguridad de hilos en la interfaz gráfica
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }

}
