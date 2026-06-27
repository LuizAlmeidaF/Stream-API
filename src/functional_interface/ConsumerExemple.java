package functional_interface;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
//import java.util.function.Predicate;

public class ConsumerExemple {
    static void main() {
        //Criando a lista de numeros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        //Usando o consumer com expressao lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usar o consumer para imprimir os numeros pares no stream
        numeros.stream()
                .filter( n ->  n % 2 == 0)
                .forEach(System.out::println);

    }
}
