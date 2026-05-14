package ejercicio_1;

public abstract class Empleado {

    protected Double salario;
    protected String nombre;


    protected Empleado(String nombre, Double salario) {
        validarNombre(nombre);
        validarSalario(salario);
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract Double sumateA(Double total);

    public abstract Double SalarioTotal();

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarSalario(Double salario) {
        if (salario == null) throw new IllegalArgumentException("El salario no puede ser nulo");
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
    }

    protected void validarTotal(Double total) {
        if (total == null) throw new IllegalArgumentException("El total no puede ser nulo");
        if (total < 0) throw new IllegalArgumentException("El total no puede ser negativo");
    }
}
