package Curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    String descricao;
    List<String> alunos;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(String nomeAluno) {
        alunos.add(nomeAluno);
    }
}