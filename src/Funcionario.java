import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private double salario;
    private String senha;
    private String cargo;

    Funcionario() {}

    public Funcionario(String nome, int idade, String genero, String cpf, String cargo, String senha, double salario) {
        super(nome, idade, genero, cpf);
        setCargo(cargo);
        setSenha(senha);
        setSalario(salario);
    }

    public static void listarFuncionarios(ArrayList<Pessoa> pessoas){
        for(Pessoa p: pessoas){
            if(p instanceof Funcionario){
                System.out.println(p.toString());
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionário:" + "\n" +
                "Nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "Gênero: " + getGenero() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Cargo: " + getCargo() + "\n" +
                "Salario R$" + getSalario() + "\n" +
                "ID:" + getId();
    }


}
