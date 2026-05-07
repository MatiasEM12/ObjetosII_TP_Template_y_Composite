package ejercicio_1;

public abstract class Empleado {
    protected String nombre;
    protected Double salario;

    protected Empleado(String nombre, Double salario) {
        validarNombre(nombre);
        validarSalario(salario);
        this.nombre = nombre;
        this.salario = salario;
    }

    public Double sumateA(Double total){
        return total +=this.salario;
    }

    public abstract Double SalarioTotal();

    private void validarNombre(String nombre) {
        if (nombre == null) throw new NullPointerException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
    }
    private void validarSalario(Double salario) {
        if (salario == null) throw new NullPointerException("El salario no puede ser nulo");
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
    }
}
