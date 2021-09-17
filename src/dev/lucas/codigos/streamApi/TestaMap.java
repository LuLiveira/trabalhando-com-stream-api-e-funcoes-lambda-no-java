package dev.lucas.codigos.streamApi;

import dev.lucas.codigos.Dao;
import dev.lucas.modelo.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class TestaMap {

    public static void main(String[] args) {
        List<Produto> produtos = Dao.getProdutos();

        List<String> nomeProdutos = produtos
                .stream()
                .map(produto -> produto.getNome())
                .collect(Collectors.toList());

        System.out.println(nomeProdutos); // [Nome P1, Nome P2, Nome P3]


        List<String> marcas = Arrays.asList("Ford", "Fiat", "Renault");

        marcas.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println); // FORD, FIAT, RENAULT

        UnaryOperator<String> maiuscula = name -> name.toUpperCase();
        UnaryOperator<String> primeiraLetra = name -> name.charAt(0) + "";
        UnaryOperator<String> exclamacao = name -> name + "!!!";

        // Composição com Map
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(exclamacao)
                .forEach(System.out::println); // F!!!, F!!!, R!!!

    }
}
