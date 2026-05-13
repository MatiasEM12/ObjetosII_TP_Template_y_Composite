package ejercicio_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private String nombre;
    private List<ItemTrabajo> items;

    public Proyecto(String nombre, ItemTrabajo item) {

        validarItem(item);
        validarNombre(nombre);
        this.nombre = nombre;
        this.items = new ArrayList<>();
        items.add(item);
    }

    public Duration duracionProyecto() {
        Duration total = Duration.ZERO;

        for (ItemTrabajo t : items) {
            total = total.plus(t.calcularTiempo());
        }

        return total;
    }

    private void validarNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        if (nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (nombre.length() > 50) throw new IllegalArgumentException("El nombre no puede tener mas de 50 caracteres");
        if (nombre.length() < 3) throw new IllegalArgumentException("El nombre no puede tener menos de 3 caracteres");
    }

    private void validarItem(ItemTrabajo item) {
        if (item == null) throw new IllegalArgumentException("El item no puede ser nulo");
    }
}
