import datos.EmpleadoDatabase;
import datos.ReporteGenerador;
import empleados.tipos.Desarrollador;
import empleados.tipos.Gerente;
import empleados.tipos.Practicante;

public class Main {

    public static void main(String[] args) {
        EmpleadoDatabase database = new EmpleadoDatabase();
        ReporteGenerador reporte = new ReporteGenerador();
        SistemaGestion sistema = new SistemaGestion(database, reporte);

        sistema.procesarEmpleado(new Gerente("Ángel", 5000));
        sistema.procesarEmpleado(new Desarrollador("Ronald", 3000));
        sistema.procesarEmpleado(new Practicante("Antonio", 1000));
    }
}