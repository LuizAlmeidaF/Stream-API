package functional_interface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um
 * valor booleando (verdadeiro ou falso).
 * É comumente usado para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExemple {
    static void main() {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um predicate que verifica se a palavra tem mais de 5 letras.
        //Predicate<String> maisDeCincoLetras = palavra -> palavra.length() > 5;


        // Usar o Stream para filtrar as palavras com mais de 5 letras e, em seguida
        // Imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter( p -> p.length() > 5)
                .forEach(System.out::println);
        // Imprimindo a lista com os palavras que passam pela condição
    }

}
