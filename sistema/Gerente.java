package sistema;

public class Gerente extends Funcionario {

    private String setor;

    private Gerente(){}

    public Gerente(int id, String nome, Double salario, String setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getBonificacao() {
        return salario * 0.1;
    }

}
