package ejercicio_5;

public class RemeraNacional extends Remera {

    public static final double RECARGO = 0.0015;
    public static final double BONIFICACION = 0.2;

    public RemeraNacional(Double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public Double calcularRecargo() {
        return this.precioUnitario + (this.precioUnitario * RECARGO) + (this.precioUnitario * BONIFICACION);
    }

 
}
