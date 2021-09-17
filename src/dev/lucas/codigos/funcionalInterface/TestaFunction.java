package dev.lucas.codigos.funcionalInterface;

import java.util.function.Function;

public class TestaFunction {

    public static void main(String[] args) {
        Function<Integer, String> testaNumero = numero -> numero % 2 == 0 ? "Par" : "Impar";
        Function<String, String> resultado = valor -> "O resultado é: " + valor;
        Function<String, String> addExclamacao = valor -> valor + "!!";

        String resultadoTesteNum = testaNumero
                .andThen(resultado)
                .andThen(addExclamacao)
                .apply(2);

        System.out.println(resultadoTesteNum); // O resultado é: Par!!

    }
}
