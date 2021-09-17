package dev.lucas.codigos.streamApi;

import dev.lucas.codigos.Dao;
import dev.lucas.modelo.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class TestaFilter {

    public static void main(String[] args) {
        List<Produto> produtos = Dao.getProdutos();

        // Lista dos produtos selecionados de acordo com desconto;
        List<Produto> produtosSelecionados = produtos.stream()
                .filter(produto -> produto.getDesconto() >= 12)
                .collect(Collectors.toList());

        // Lista do nome dos produtos selecionados, usando composição com Map.
        List<String> nomeProdutosSelecionados = produtos.stream()
                .filter(produto -> produto.getDesconto() >= 12)
                .map(produto -> "O nome do produto é: " + produto.getNome())
                .collect(Collectors.toList());

    }
}
