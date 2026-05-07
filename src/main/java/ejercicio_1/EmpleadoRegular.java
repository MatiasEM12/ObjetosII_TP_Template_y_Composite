package ejercicio_1;

public class EmpleadoRegular extends Empleado{

    public EmpleadoRegular(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double SalarioTotal() {
        Double sumate=0.0;
        return this.sumateA(sumate);
    }
}
