import java.util.HashMap;

public class SafeHashMap<K, V> extends HashMap<K, V> {

    @Override
    public V put(K key, V value) {
        if (value == null) {
            throw new IllegalArgumentException("No se permiten valores nulos");
        }
        return super.put(key, value);
    }


}