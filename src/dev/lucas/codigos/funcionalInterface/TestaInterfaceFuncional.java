package dev.lucas.codigos.funcionalInterface;

import dev.lucas.funcional.Calculo;

public class TestaInterfaceFuncional {
    public static void main(String[] args) {
//        Calculo soma = (x, y) -> {
//            return x + y;
//        };

        Calculo soma = (x, y) -> x + y;

        Double resultado = soma.executar(10, 10);
        System.out.println(resultado); // 20.0
    }
}
