package functional_interface;

/*
* Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
* É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemple {
    static void main() {
        // Criando uma lista com numeros inteiros.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("A lista é: \n" + numeros);

        // Usando Function com expressão lambda para dobrar os valores.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        /* Usando a função para dobrar todos os numeros
        em um Stream e armazena-los em outra lista
         */
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimir a lista com os numeros dobrados
         numerosDobrados.forEach(System.out::println);

        }
    }
