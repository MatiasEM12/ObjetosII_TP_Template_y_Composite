package ejercicio_1;

public class Regular implements Empleado {

    private Double salario;
    private String nombre;

    public Regular(String nombre, Double salario) {
        validarSalario(salario);
        validarNombre(nombre);
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public Double sumateA(Double total) {
        validarTotal(total);
        return total + this.salario;
    }

    @Override
    public Double SalarioTotal() {
        return this.salario;
    }

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

    private void validarTotal(Double total) {
        if (total == null) throw new IllegalArgumentException("El total no puede ser nulo");
        if (total < 0) throw new IllegalArgumentException("El total no puede ser negativo");
    }
}
