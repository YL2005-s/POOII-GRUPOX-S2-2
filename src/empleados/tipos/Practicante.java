package empleados.tipos;

import empleados.Empleado;

public class Practicante extends Empleado {

    public Practicante(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularPago() {
        return getSalario() * 0.5;
    }
}
