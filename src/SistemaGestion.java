import datos.EmpleadoDatabase;
import datos.ReporteGenerador;
import empleados.Empleado;

public class SistemaGestion {
    private EmpleadoDatabase dataBase;
    private ReporteGenerador generator;

    public SistemaGestion(EmpleadoDatabase repositorio, ReporteGenerador generator) {
        this.dataBase = repositorio;
        this.generator = generator;
    }

    public void procesarEmpleado(Empleado empleado) {
        System.out.println("-------------------------------------");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Pago calculado: " + empleado.calcularPago());
        dataBase.guardarEnBaseDeDatos(empleado);
        generator.generarReporte(empleado);
    }
}
