
package examen_2;

import javax.swing.JOptionPane;


public class Matriz {
    static String [][] reservas = new String[5][5];
 
    public void MostrarMatrizReservas() {
        String Salida = "Estado de Habitaciones (5 pisos y 5  habitaciones): \n";

        for (int i = 0; i < reservas.length; i++) {
            Salida += "Piso " + i + ": ";
            for (int j = 0; j < reservas[i].length; j++) {
                if (reservas[i][j] == null) {
                    Salida += "[Libre] ";

                } else {
                    Salida += "[Ocupado] ";
                }
            }
            Salida += "\n";

        }
        JOptionPane.showMessageDialog(null, Salida);
    }

    public void HacerReserva() {
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        if (Nombre == null || Nombre == "") {
            return;
        }

        int piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso del 1 a 4"));
        int habitacion = Integer.parseInt(JOptionPane.showInputDialog("Intrese la habitacion del 1 a 4"));

        if (piso >= 0 && piso < 5 && habitacion >= 0 && habitacion < 5) {
            if (reservas[piso][habitacion] == null) {
                reservas[piso][habitacion] = Nombre;
                JOptionPane.showMessageDialog(null, "¡Se ha reservado con exito!");

            } else {
                JOptionPane.showMessageDialog(null, "La habitacion ya esta reservada");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Numero de piso o habitacion invalido");
        }

    }

    public void CancerlarReservacion() {
        int Piso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el piso del 1 a 4"));
        int habitacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de habitacion 1 a 4"));

        if (Piso >= 0 && Piso < 5 && habitacion >= 0 && habitacion < 5) {
            if (reservas[Piso][habitacion] != null) {
                reservas[Piso][habitacion] = null;
                JOptionPane.showMessageDialog(null, "Reserva Cancelada");

            } else {
                JOptionPane.showMessageDialog(null, "La habitacion ya esta libre.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Numero de piso o habitacion invalido");
        }
    }

}
