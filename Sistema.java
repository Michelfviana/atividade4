import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Funcionario> funcionarios;
    private List <Produto> produtos;

    public Sistema() {
        funcionarios = new ArrayList<>();
        produtos = new ArrayList<>();
    }

    public void adicionar_funcionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
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

    public void adicionar_produto(Produto produto) {
        produtos.add(produto);
    }


    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Adicionar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do funcionário: ");
                    int idFuncionario = scanner.nextInt();
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = scanner.next();
                    sistema.adicionar_funcionario(new Funcionario(idFuncionario, nomeFuncionario));
                    break;
                case 2:
                    System.out.print("Digite o ID do funcionário a ser removido: ");
                    int idRemover = scanner.nextInt();
                    sistema.remover_funcionario(idRemover);
                    break;
                case 3:
                    System.out.println("===== Funcionários =====");
                    sistema.listar_funcionarios();
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idProduto = scanner.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    sistema.adicionar_produto(new Produto(idProduto, nomeProduto, precoProduto));
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}


