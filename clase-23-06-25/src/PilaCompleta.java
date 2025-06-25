import java.util.Collection;
import java.util.Stack;

public class PilaCompleta<T> extends Stack<T> {

    // Metodo para insertar múltiples elementos en la pila
    public void pushAll(Collection<? extends T> elementos) {
        for (T elem : elementos) {
            this.push(elem);
        }
    }

    // Metodo para extraer todos los elementos de la pila
    public void popAll() {
        while (!this.isEmpty()) {
            System.out.println("Eliminando de la pila: " + this.pop());
        }
    }
}