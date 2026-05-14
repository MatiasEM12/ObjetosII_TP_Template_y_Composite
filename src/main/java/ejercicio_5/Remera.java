package ejercicio_5;

public abstract class Remera {
    protected Double precioUnitario;

    protected Remera(Double precioUnitario) {
        validarPrecioUnitario(precioUnitario);
        this.precioUnitario = precioUnitario;
    }

    public final Double calcularPrecioDeVenta(Double recargoComercial) {
        validarRecargoComercial(recargoComercial);
        var precioFinal = this.calcularRecargo();
        return precioFinal + (this.precioUnitario * recargoComercial);
    }

    protected abstract Double calcularRecargo();

    private void validarPrecioUnitario(Double precioUnitario) {
        if (precioUnitario == null) throw new IllegalArgumentException("El precio unitario no puede ser nulo");
        if (precioUnitario < 0) throw new IllegalArgumentException("El precio unitario no puede ser negativo");
    }

    private void validarRecargoComercial(Double recargoComercial) {
        if (recargoComercial == null) throw new IllegalArgumentException("El recargo comercial no puede ser nulo");
        if (recargoComercial < 0) throw new IllegalArgumentException("El recargo comercial no puede ser negativo");
    }
}

