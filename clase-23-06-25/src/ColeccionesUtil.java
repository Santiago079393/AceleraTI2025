import java.util.Collection;

public class ColeccionesUtil {

    // Metodo estático para agregar elementos antiguos a una colección actual
    public static <T> void addOldElements(Collection<T> destino, Collection<T> antiguos) {
        for (T elemento : antiguos) {
            if (!destino.contains(elemento)) {
                destino.add(elemento);
            }
        }
    }
}
