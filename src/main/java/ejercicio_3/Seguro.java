package ejercicio_3;

public abstract class Seguro {
    protected Double monto;

    protected Seguro(Double monto) {
        this.monto = monto;
    }

    public Double sumateA(Double total){
        return total+=this.monto;
    }

}
