package ejercicio_5;

public class RemeraImportada extends Remera {

    public static final double RECARGO = 0.03;
    public static final double IMPUESTO_ADUANERO = 0.05;

    public RemeraImportada(Double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public Double calcularRecargo() {
        return this.precioUnitario + (this.precioUnitario * RECARGO) + (this.precioUnitario * IMPUESTO_ADUANERO);
    }


}
