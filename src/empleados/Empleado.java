package empleados;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularPago();

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}