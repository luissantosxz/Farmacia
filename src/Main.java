import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Remedio> remedios = new ArrayList<>();
        instanciaFuncionarios(pessoas);
        instanciaRemedios(remedios);

        do{
            menu();
            int opcao = SC.nextInt();
            switch(opcao){
                case 1:
                    Cliente.adicionarCliente(pessoas);
                    break;
                case 2:
                    Cliente.listarCliente(pessoas);
                    break;
                case 3:
                    Funcionario.listarFuncionarios(pessoas);
                    break;
                case 4:
                    Remedio.adicionarRemedio(remedios);
                    break;
                case 5:
                    Remedio.listarRemedios(remedios);
                    break;
                case 6:
                    Cliente.visualizarCliente(pessoas);
                    break;
                case 7:
                    Remedio.visualizarRemedio(remedios);
                    break;
                case 8:
                    Remedio.editarRemedio(remedios);
                    break;
                case 9:
                    Remedio.removerRemedio(remedios);
                    break;
                case 10:
                    Cliente cliente = Cliente.encontrarClientePorCpf(pessoas);
                    Carrinho c = new Carrinho();
                    c.setC(cliente);
                    Remedio remedio = Remedio.encontrarRemedioPorId(remedios);
                    System.out.println("Digite a quantidade de produtos que você ira comprar:");
                    int qtd = Main.SC.nextInt();
                    c.adicionarRemedioCarrinho(remedio,qtd);
                    c.comprar();
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
                    break;
                case 0:
                    System.out.println("SAINDO.....");
                    System.exit(0);
                    break;

            }
        } while(true);
    }

    public static void instanciaFuncionarios(ArrayList<Pessoa> pessoas) {
        pessoas.add(new Funcionario("Lucas", 36, "M", "573.407.780-12", "Farmaceutico", "senha1", 5000.0));
        pessoas.add(new Funcionario("Maria", 26, "F", "912.724.110-60", "Caixa", "senha2", 3000.0));
        pessoas.add(new Funcionario("Lurdes", 29, "F", "187.875.440-83", "Assistente de farmacia", "senha3", 2500.0));
        pessoas.add(new Funcionario("Luana", 31, "F", "562.123.050-72", "Tecnico de farmacia", "senha4", 3500.0));
        pessoas.add(new Funcionario("Pedro", 25, "M", "263.773.090-07", "Assistente Administrativo", "senha5", 2600.0));
    }

    public static void instanciaRemedios(ArrayList<Remedio> remedios) {
        remedios.add(new Remedio("dipirona",5.99, 120, 500.00, true, false));
        remedios.add(new Remedio("paracetamol", 3.50, 100, 750.00, true, false));
        remedios.add(new Remedio("ibuprofeno", 7.80, 200, 600.00, true, false));
        remedios.add(new Remedio("amoxicilina", 15.00, 50, 875.00, true, true));
        remedios.add(new Remedio("cetirizina", 9.50, 75, 10.00, true, false));
        remedios.add(new Remedio("loratadina", 8.00, 90, 10.00, true, false));
        remedios.add(new Remedio("omeprazol", 12.00, 60, 20.00, true, false));
        remedios.add(new Remedio("azitromicina", 18.00, 30, 500.00, true, true));
        remedios.add(new Remedio("prednisona", 6.50, 120, 20.00, true, true));
        remedios.add(new Remedio("fluconazol", 10.00, 40, 150.00, true, true));
        remedios.add(new Remedio("metformina", 13.00, 80, 850.00, true, true));
    }

    public static void menu(){
        System.out.println("=============================");
        System.out.println("||--- ESCOLHA UMA OPÇÃO ---||");
        System.out.println("=============================");
        System.out.println("--- 1 PARA CADASTRAR CLIENTES ");
        System.out.println("--- 2 PARA LISTAR CLIENTES ");
        System.out.println("--- 3 PARA LISTAR FUNCIONARIOS");
        System.out.println("--- 4 PARA CADASTRAR PRODUTOS (REMEDIO) ");
        System.out.println("--- 5 PARA LISTAR PRODUTOS (REMEDIO) ");
        System.out.println("--- 6 PARA VISUALIZAR UM CLIENTE ESPECIFICO");
        System.out.println("--- 7 PARA EDITAR REMEDIO ESPECIFICO");
        System.out.println("--- 8 PARA EXCLUIR REMEDIO ");
        System.out.println("--- 10 PARA VENDA");
        System.out.println("--- 0 PARA SAIR");
        System.out.println("=============================");
    }
}