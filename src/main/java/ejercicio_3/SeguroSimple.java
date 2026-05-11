package ejercicio_3;

public class SeguroSimple implements Seguro {
    private Double monto;

    public SeguroSimple(Double monto) {
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

}
