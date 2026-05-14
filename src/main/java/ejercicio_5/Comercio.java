package ejercicio_5;

public class Comercio {

    public static final double RECARGO_FINAL_IMPORTADO = 0.25;
    public static final double RECARGO_FINAL_NACIONAL = 0.15;
    private String nombre;


    public Comercio(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;

    }

    public Double calcularPrecioRemeraImportada(Remera remera) {
        validarRemera(remera);
        return remera.calcularPrecioDeVenta(RECARGO_FINAL_IMPORTADO);
    }

    public Double calcularPrecioRemeraNacional(Remera remera) {
        validarRemera(remera);
        return remera.calcularPrecioDeVenta(RECARGO_FINAL_NACIONAL);
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarRemera(Remera remera) {
        if (remera == null) throw new IllegalArgumentException("La remera no puede ser nula");
    }
}
