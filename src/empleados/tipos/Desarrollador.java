package empleados.tipos;

import empleados.Empleado;

public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago() {
        return getSalario();
    }
}
