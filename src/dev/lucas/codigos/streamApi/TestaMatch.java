package dev.lucas.codigos.streamApi;

import dev.lucas.codigos.Dao;
import dev.lucas.modelo.Aluno;

import java.util.List;
import java.util.function.Predicate;

public class TestaMatch {

    public static void main(String[] args) {
        List<Aluno> alunos = Dao.getAlunos(); // Notas:

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // false
        System.out.println(alunos.stream().anyMatch(aprovado)); // true
        System.out.println(alunos.stream().noneMatch(aprovado.negate())); // false

    }
}
