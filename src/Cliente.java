import java.util.ArrayList;

public class Cliente extends Pessoa{
    public Cliente(String nome, int idade, String genero, String cpf) {
        super(nome, idade, genero, cpf);
    }
    public Cliente(){};

    public static void adicionarCliente(ArrayList<Pessoa> pessoas){
        System.out.println("=============================");
        System.out.println("--- Cadastro de Clientes ---");
        System.out.println("Nome do cliente:");
        String nome = Main.SC.next();
        System.out.println("Idade do cliente");

        int idade = Main.SC.nextInt();

        String genero;

        do {
            System.out.println("Genero do cliente \n" +
                    "M - Masculino \n" +
                    "F - Feminino \n" +
                    "O - Outros \n");
            genero = Main.SC.next();

            if (!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("o")) {
                System.out.println(" apenas M, F ou O.");
            }
        } while (!genero.equalsIgnoreCase("m") && !genero.equalsIgnoreCase("f") && !genero.equalsIgnoreCase("o"));

        System.out.println("CPF do Cliente (formato: XXX.XXX.XXX-XX):");
        String cpf = Main.SC.next();


        Cliente c = new Cliente(nome,idade,genero,cpf);
        pessoas.add(c);
        System.out.println("=============================");
        System.out.println("--- CLIENTE CADASTRADO COM SUCESSO! ---");
        System.out.println("=============================");
    }

    public static void listarCliente(ArrayList<Pessoa> pessoas){
        for(Pessoa c : pessoas){
            if(c instanceof Cliente){
                System.out.println(c.toString());
            }
        }
    }

    public static void visualizarCliente(ArrayList<Pessoa> pessoas) {
        Cliente encontrado = encontrarClientePorCpf(pessoas);
        if(encontrado != null){
            System.out.println("CLIENTE ENCONTRADO");
            System.out.println(encontrado.toString());
        } else {
            System.out.println("Não encontrado!");
        }
    }

    public static Cliente encontrarClientePorCpf(ArrayList<Pessoa> pessoas) {
        System.out.println("Digite o cpf da pessoa que vc quer encontrar:");
        String cpf = Main.SC.next();
        for (Pessoa cliente : pessoas) {
            if(cliente instanceof Cliente){
                if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                    return (Cliente) cliente;
                }
            }
        }
        return null;
    }
}
