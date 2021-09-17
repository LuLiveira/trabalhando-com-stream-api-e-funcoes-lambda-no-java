package dev.lucas.codigos.funcionalInterface;

import dev.lucas.funcional.Calculo;

import java.util.Arrays;
import java.util.List;

public class TestaMethodReference {
    public static void main(String[] args) {

        List<String> lista = Arrays.asList("Ana", "Bia", "Maria", "João");

        // forma tradicional (for)
        for (String nome : lista) {
            System.out.println(nome);
        }

        // Lambda
        lista.forEach(nome -> System.out.println(nome));

        // Method Reference
        lista.forEach(System.out::println);

        // Interface Funcional criada no começo do artigo, utilizando Method Reference
        Calculo soma = Double::sum;
        Double resultado = soma.executar(10, 10);
        System.out.println(resultado); // 20.0

    }
}
