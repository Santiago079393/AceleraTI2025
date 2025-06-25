import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {

/*
//pila
    public static void main(String[] args) {
        PilaCompleta<Integer> pila = new PilaCompleta<>();
        //llamado a la clase pushAll
        pila.pushAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Contenido de la pila: " + pila);
        //llamado a clase popAll
        pila.popAll();
    }
*/

    /*
    //hashmap
    public static void main(String[] args) {
        SafeHashMap<String, String> mapa = new SafeHashMap<>();

        mapa.put("clave1", "valor1"); // Funciona
        mapa.put("clave2", "valor2"); // Funciona

        // Esto lanzará una excepción
        // mapa.put("clave3", null);
    }

     */


    public static void main(String[] args) {
        List<String> actual = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> antiguos = new ArrayList<>(Arrays.asList("B", "C", "D", "E"));

        ColeccionesUtil.addOldElements(actual, antiguos);

        System.out.println("Resultado: " + actual); // [A, B, C, D, E]
    }


}