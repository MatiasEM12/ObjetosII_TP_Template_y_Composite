package ejercicio_1;

import java.util.List;

public class Gerente extends Empleado{

    private List<MandoMedio> mandosMedio;

    public Gerente(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double SalarioTotal() {
        Double total=0.0;
        this.sumateA(total);

        for( MandoMedio m : mandosMedio){
            total= m.SalarioTotal();
        }
        return total;
    }

}
