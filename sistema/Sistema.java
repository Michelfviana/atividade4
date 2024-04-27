package sistema;

import java.util.ArrayList;
import java.util.List;
import sistema.Sistema;

public class Sistema {
    private List<Funcionario> funcionarios;
    private List <Produto> produtos;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }


    // Funções dos trabalhadores
    public void adicionar_funcionario(Estoquista estoquista) {
        funcionarios.add(estoquista);
    }

    public void adicionar_funcionario(Gerente gerente) {
        funcionarios.add(gerente);
    }

    public void remover_funcionario(int id_funcionario) {
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id_funcionario) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
        }
    }

    public void listar_funcionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome());
        }
    }


    // Funções dos Produtos
    public void adicionar_produto(Produto produto) {
        produtos.add(produto);
    }

    public void remover_produto(int idProduto) {
        Produto produtoParaRemover = null;
        for (Produto produto : produtos) {
            if (produto.getId() == idProduto) {
                produtoParaRemover = produto;
                break;
            }
        }
        if (produtoParaRemover != null) {
            produtos.remove(produtoParaRemover);
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listar_produtos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }

}




