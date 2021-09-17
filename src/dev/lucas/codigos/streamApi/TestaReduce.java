package dev.lucas.codigos.streamApi;

import dev.lucas.codigos.Dao;
import dev.lucas.modelo.Produto;

import java.util.List;

public class TestaReduce {

    public static void main(String[] args) {

        List<Produto> produtos = Dao.getProdutos();

        Double somaValorProdutos = produtos.stream()
                .map(produto -> produto.getPreco())
                .reduce(0.0, (subtotal, preco) -> subtotal + preco);

    }
}
