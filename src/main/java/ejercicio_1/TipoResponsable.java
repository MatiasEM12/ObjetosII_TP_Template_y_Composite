package ejercicio_1;

public enum TipoResponsable {

    DIRECTOR("Director"),
    GERENTE("Gerente"),
    MANDOMEDIO("Mando Medio"),
    LIDERPROYECTO("Lider de Proyecto");

    private final String descripcion;


    TipoResponsable(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }
}
