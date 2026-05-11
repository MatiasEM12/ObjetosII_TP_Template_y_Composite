package ejercicio_1;

public class Regular implements Empleado {

    private Double salario;
    private String nombre;

    public Regular(String nombre, Double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public Double sumateA(Double total) {
        return total + this.salario;
    }

    @Override
    public Double SalarioTotal() {
        return this.salario;
    }

}
