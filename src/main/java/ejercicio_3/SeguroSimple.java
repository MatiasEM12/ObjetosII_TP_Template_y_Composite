package ejercicio_3;

public class SeguroSimple implements Seguro {
    private Double monto;
    private Double nombre;

    public SeguroSimple(String nombre, Double monto) {
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

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacío");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }
}
