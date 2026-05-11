package ejercicio_5;

public abstract class Remera {
    protected Double precioUnitario;

    protected Remera(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final Double calcularPrecioDeVenta(Double recargoComercial) {
        var precioFinal = this.calcularRecargo();
        return precioFinal + (precioFinal * recargoComercial);
    }

    protected abstract Double calcularRecargo();
}

