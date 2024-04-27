
import java.util.Scanner;
import sistema.Sistema;
import sistema.Estoquista;
import sistema.Gerente;
import sistema.Produto;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Adicionar Estoquista");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Remover Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("5. Adicionar Produto");
            System.out.println("6. Remover Produto");
            System.out.println("7. Listar Produtos");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do estoquista: ");
                    int idEstoquista = scanner.nextInt();
                    System.out.print("Digite o nome do estoquista: ");
                    String nomeEstoquista = scanner.next();
                    System.out.print("Digite o salário do estoquista: ");
                    double salarioEstoquista = scanner.nextDouble();
                    System.out.print("Digite a quantidade de itens estocados: ");
                    int itensEstocados = scanner.nextInt();
                    sistema.adicionar_funcionario(new Estoquista(idEstoquista, nomeEstoquista, salarioEstoquista, itensEstocados));
                    break;
                case 2:
                    System.out.print("Digite o ID do gerente: ");
                    int idGerente = scanner.nextInt();
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = scanner.next();
                    System.out.print("Digite o salário do gerente: ");
                    double salarioGerente = scanner.nextDouble();
                    System.out.print("Digite o setor do gerente: ");
                    String setorGerente = scanner.next();
                    sistema.adicionar_funcionario(new Gerente(idGerente, nomeGerente, salarioGerente, setorGerente));
                    break;
                case 3:
                    System.out.print("Digite o ID do funcionário a ser removido: ");
                    int idRemover = scanner.nextInt();
                    sistema.remover_funcionario(idRemover);
                    break;
                case 4:
                    System.out.println("===== Funcionários =====");
                    sistema.listar_funcionarios();
                    break;
                case 5:
                    System.out.print("Digite o Id do produto: ");
                    int idProduto = scanner.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    sistema.adicionar_produto(new Produto(idProduto, nomeProduto, precoProduto));
                    System.out.println("Produto adicionado.");
                    break;
                case 6:
                    System.out.print("Digite o ID do produto a ser removido: ");
                    int idRemoverr = scanner.nextInt();
                    sistema.remover_produto(idRemoverr);
                    break;
                case 7:
                    sistema.listar_produtos();
                    break;
                case 8:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente!.");
            }
        } while (opcao != 8);

        scanner.close();
    }
}
