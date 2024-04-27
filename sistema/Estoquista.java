package sistema;

public class Estoquista extends Funcionario {
    
    private int itensEstocados;

    private Estoquista(){}

    public Estoquista(int id, String nome, Double salario, int itensEstocados){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.itensEstocados = itensEstocados;
    }

    public void adicionarItemEstocado(int quantidade) {
        itensEstocados += quantidade;
    }

    public int getItensEstocados(){
        return itensEstocados;
    }
}
