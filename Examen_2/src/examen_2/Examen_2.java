
package examen_2;

import javax.swing.JOptionPane;

public class Examen_2 {

    public static void main(String[] args) {
        Matriz Matriz1 = new Matriz();

        int Opcion;
        do {
            // en esta parte hacemos un mini menu utilizando do e if 
            Opcion = mostrarOpcion();
            if (Opcion == 1) {
                Matriz1.MostrarMatrizReservas();

            } else if (Opcion == 2) {
                Matriz1.HacerReserva();
            } else if (Opcion == 3) {
                Matriz1.CancerlarReservacion();
            // en esta parte seleccionamos el constructor segun la opcion que ponga 
            } else if (Opcion == 0) {
                JOptionPane.showMessageDialog(null, "Hasta luego");

            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (Opcion != 0);
    }

    public static int mostrarOpcion() {
        String Entrada = JOptionPane.showInputDialog(
                "--- Hotel la quinta --- \n"
                + "1. ver estado de habitaciones " + "\n"
                + "2. va hacer una reserva " + "\n"
                + "3. Cancelar una Reservscion " + "\n"
                + "0. Salir " + "\n"
                + "Seleccione una opcion"
        );
        if (Entrada == null || Entrada == "") {
            return -1;
        }
        int valor = Integer.parseInt(Entrada);
        return valor;

    }

        
        
    
}
