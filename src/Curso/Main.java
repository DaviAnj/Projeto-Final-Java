package Curso;

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

