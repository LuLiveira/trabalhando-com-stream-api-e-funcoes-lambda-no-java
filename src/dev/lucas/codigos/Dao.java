package dev.lucas.codigos;

import dev.lucas.modelo.Aluno;
import dev.lucas.modelo.Produto;

import java.util.List;

public abstract class Dao {

    public static List<Produto> getProdutos(){
        return List.of(
                new Produto("Iphone 1", 1.0, 1.0),
                new Produto("Iphone 2", 1.0, 1.0),
                new Produto("Iphone 3", 1.0, 1.0),
                new Produto("Iphone 4", 1.0, 1.0),
                new Produto("Iphone 5", 1.0, 1.0),
                new Produto("Iphone 6", 1.0, 1.0)
        );
    }

    public static List<Aluno> getAlunos() {
        return List.of(
                new Aluno(3.8),
                new Aluno(4.8),
                new Aluno(5.8),
                new Aluno(6.8),
                new Aluno(7.8),
                new Aluno(8.8),
                new Aluno(9.8)
        );
    }
}
