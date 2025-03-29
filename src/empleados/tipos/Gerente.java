package empleados.tipos;

import empleados.Empleado;

public class Gerente extends Empleado {

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago() {
        return getSalario() + 100;
    }
}
