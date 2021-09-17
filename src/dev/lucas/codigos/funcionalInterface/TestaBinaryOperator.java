package dev.lucas.codigos.funcionalInterface;

import java.util.function.BinaryOperator;

public class TestaBinaryOperator {

    public static void main(String[] args) {
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        Double resultado = media.apply(9.8, 5.7);
        System.out.println(resultado); // 7.75

    }
}
