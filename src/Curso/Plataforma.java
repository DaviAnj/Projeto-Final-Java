package Curso;

import java.util.ArrayList;
import java.util.List;


public class Plataforma {
    List<Curso> cursos;

    public Plataforma() {
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso '" + curso.getNome() + "' adicionado com sucesso.");
    }

    public void inscreverAluno(String nomeCurso, String nomeAluno) {
        Curso curso = encontrarCursoPorNome(nomeCurso);
        if (curso != null) {
            curso.adicionarAluno(nomeAluno);
            System.out.println("Aluno '" + nomeAluno + "' inscrito no curso '" + nomeCurso + "'.");
        } else {
            System.out.println("Curso '" + nomeCurso + "' não encontrado.");
        }
    }

    public List<String> listarAlunosPorCurso(String nomeCurso) {
        Curso curso = encontrarCursoPorNome(nomeCurso);
        if (curso != null) {
            return curso.getAlunos();
        } else {
            System.out.println("Curso '" + nomeCurso + "' não encontrado.");
            return new ArrayList<>();
        }
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso encontrarCursoPorNome(String nomeCurso) {
        for (Curso curso : cursos) {
            if (curso.getNome().equalsIgnoreCase(nomeCurso)) {
                return curso;
            }
        }
        return null;
    }
}