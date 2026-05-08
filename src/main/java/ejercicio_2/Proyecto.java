package ejercicio_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private String nombre;
    private List<ItemTrabajo> items;

    public Proyecto(String nombre, ItemTrabajo item) {
        this.nombre = nombre;
        this.items=new ArrayList<>();
        items.add(item);
    }

    public Duration duracionProyecto() {
        Duration total = Duration.ZERO;

        for(ItemTrabajo t : items) {
            total = total.plus(t.calcularTiempo());
        }

        return total;
    }
}
