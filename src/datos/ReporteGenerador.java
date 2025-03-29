package datos;

import empleados.Empleado;

public class ReporteGenerador {

    public void generarReporte(Empleado empleado) {
        System.out.println("Generando reporte para " + empleado.getNombre() + "...");
    }
}
