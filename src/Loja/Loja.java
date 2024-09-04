package Loja;

import java.util.ArrayList;
import java.util.List;

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