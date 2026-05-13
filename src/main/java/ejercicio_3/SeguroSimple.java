package ejercicio_3;

public class SeguroSimple implements Seguro {
    private Double monto;

    public SeguroSimple(Double monto) {
        validarMonto(monto);
        this.monto = monto;
    }

    @Override
    public Double subtotalSeguros() {
        return this.monto;
    }


    @Override
    public Double subtotalSinDescuento() {
        return this.monto;
    }

    @Override
    public int cantidadSeguros() {
        return 1;
    }

    private void validarMonto(Double monto) {
        if (monto == null) throw new IllegalArgumentException("El monto no puede ser nulo");
        if (monto < 0) throw new IllegalArgumentException("El monto no puede ser negativo");
    }
}
