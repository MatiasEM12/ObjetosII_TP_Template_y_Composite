package ejercicio_1;

import java.util.List;

public class Director extends  Empleado{

    private List<Gerente> gerentes;

    public  Director(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double SalarioTotal() {
        Double total=0.0;
        this.sumateA(total);

        for( Gerente g : gerentes){
            total= g.SalarioTotal();
        }
        return total;
    }
}
