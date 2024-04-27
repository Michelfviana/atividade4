package sistema;

public class Funcionario {
    
    protected int id; 
    protected String nome;
    protected double salario;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
}