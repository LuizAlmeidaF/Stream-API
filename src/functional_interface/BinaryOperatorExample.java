package functional_interface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.BinaryOperator;

/*
* Representa uma operação que combina dois argumentos
* do tipo T e retorna um resultado do mesmo tipo T.
* É usada para realizar operações de redução de pares
* de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

    static void main() {
        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros.
        //BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os numeros no stream.
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }
}
