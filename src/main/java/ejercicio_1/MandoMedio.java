package ejercicio_1;

import java.util.List;

public class MandoMedio extends Empleado{

    List<LiderProyecto> lideresProyecto;

    public  MandoMedio(String nombre, Double salario) {
        super(nombre, salario);
    }

    @Override
    public Double SalarioTotal() {
        Double total=0.0;
        this.sumateA(total);

        for( LiderProyecto l : lideresProyecto){
            total= l.SalarioTotal();
        }
        return total;
    }
}
