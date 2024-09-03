import java.util.List;
import java.util.ArrayList;

public class Produto {
    String nome;
    String categoria;
    double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Loja loja = new Loja();
    
        Produto p1 = new Produto("Notebook", "Eletrônicos", 3000.0);
        Produto p2 = new Produto("Smartphone", "Eletrônicos", 1500.0);
        Produto p3 = new Produto("Geladeira", "Eletrodomésticos", 2500.0);
        Produto p4 = new Produto("Notebook", "Eletrônicos", 2800.0);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);

        System.out.println("\nBuscando produtos com nome 'Notebook':");
        for (Produto produto : loja.buscarPorNome("Notebook")) {
            System.out.println(produto);
        }

        System.out.println("\nBuscando produtos na categoria 'Eletrônicos':");
        for (Produto produto : loja.buscarPorCategoria("Eletrônicos")) {
            System.out.println(produto);
        }
    }
}

public class Loja {
    List<Produto> produtos;

    public Loja() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> resultados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                resultados.add(produto);
            }
        }
        return resultados;
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        List<Produto> resultados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                resultados.add(produto);
            }
        }
        return resultados;
    }
}


