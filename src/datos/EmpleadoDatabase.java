package datos;

import empleados.Empleado;

public class EmpleadoDatabase {

    public void guardarEnBaseDeDatos(Empleado empleado) {
        System.out.println("Guardando empleado " + empleado.getNombre() + "...");
    }
}
