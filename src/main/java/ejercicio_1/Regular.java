package ejercicio_1;

public class Regular extends Empleado {


    public Regular(String nombre, Double salario) {
        super(nombre, salario);
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


}
