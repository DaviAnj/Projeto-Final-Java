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

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Curso cursoJava = new Curso("Java Básico", "Introdução à programação em Java.");
        Curso cursoPython = new Curso("Python Avançado", "Conceitos avançados de Python.");
        Curso cursoWeb = new Curso("Desenvolvimento Web", "Criação de sites e aplicações web.");

        plataforma.adicionarCurso(cursoJava);
        plataforma.adicionarCurso(cursoPython);
        plataforma.adicionarCurso(cursoWeb);

        plataforma.inscreverAluno("Java Básico", "Alice");
        plataforma.inscreverAluno("Java Básico", "Bob");
        plataforma.inscreverAluno("Python Avançado", "Carlos");
        plataforma.inscreverAluno("Desenvolvimento Web", "Diana");
        plataforma.inscreverAluno("Desenvolvimento Web", "Eduardo");

        System.out.println("\nAlunos inscritos no curso Java Básico:");
        for (String aluno : plataforma.listarAlunosPorCurso("Java Básico")) {
            System.out.println("- " + aluno);
        }

        System.out.println("\nAlunos inscritos no curso Desenvolvimento Web:");
        for (String aluno : plataforma.listarAlunosPorCurso("Desenvolvimento Web")) {
            System.out.println("- " + aluno);
        }

        System.out.println("\nCursos cadastrados na plataforma:");
        for (Curso curso : plataforma.listarCursos()) {
            System.out.println("- " + curso.getNome() + ": " + curso.getDescricao());
        }
    }
}

