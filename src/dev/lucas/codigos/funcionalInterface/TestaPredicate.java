package dev.lucas.codigos.funcionalInterface;

import dev.lucas.modelo.Produto;

import java.util.function.Predicate;

public class TestaPredicate {

    public static void main(String[] args) {
        Predicate<Produto> corteDesconto = prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 5021.0;

        Produto produto = new Produto("Iphone 12", 5579.00, 0.10);

        System.out.println(corteDesconto.test(produto)); // true

        Predicate<Integer> numeroPar = num -> num % 2 == 0;
        Predicate<Integer> numeroTresDigitos = num -> num >= 100 && num <= 999;

        // Foram usadas as funções "and", "or" e "negate", que fazem parte da interface Predicate.
        boolean teste1 = numeroPar.and(numeroTresDigitos).negate().test(123);
        boolean teste2 = numeroPar.or(numeroTresDigitos).test(123);

        System.out.println(teste1); // true
        System.out.println(teste2); // true
    }
}
