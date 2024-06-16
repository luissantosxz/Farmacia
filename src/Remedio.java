import java.util.ArrayList;

public class Remedio {
    private static int CONTADOR = 0;
    private String nome;
    private double preco;
    private int estoque;
    private int id;
    private double mg;
    private boolean usoAdulto;
    private boolean usaReceita;

    public Remedio() {
    }

    public Remedio(String nome, double preco, int estoque, double mg, boolean usoAdulto, boolean usaReceita) {
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
        setMg(mg);
        setUsoAdulto(usoAdulto);
        setUsaReceita(usaReceita);
        setId(CONTADOR++);
    }

    public static void listarRemedios(ArrayList<Remedio> remedios){
        for(Remedio p : remedios){
            System.out.println(p.toString());
        }
    }

    public static void adicionarRemedio(ArrayList<Remedio> remedios){
        System.out.println("=============================");
        System.out.println("--- Cadastro de remedio ---");
        System.out.println("Nome do remedio: ");
        String nome = Main.SC.next();
        System.out.println("Preco remedio: ");
        double preco = Main.SC.nextDouble();
        System.out.println("Quantidade remedio: ");
        int qtd = Main.SC.nextInt();
        System.out.println("MG: ");
        double mg = Main.SC.nextDouble();
        System.out.println("Remedio é de uso adulto? TRUE OU FALSE");
        boolean usoAdulto = Boolean.parseBoolean(Main.SC.next());
        System.out.println("Necessario receita para compra? TRUE OU FALSE");
        boolean receita = Boolean.parseBoolean(Main.SC.next());
        Remedio r = new Remedio(nome,preco,qtd,mg, usoAdulto, receita);
        remedios.add(r);
    }

    public static void visualizarRemedio(ArrayList<Remedio> remedios) {
        Remedio encontrado = encontrarRemedioPorId(remedios);
        if(encontrado != null){
            System.out.println("REMEDIO ENCONTRADO");
            System.out.println(encontrado.toString());
        } else {
            System.out.println("Não encontrado!");
        }
    }
    public static Remedio encontrarRemedioPorId(ArrayList<Remedio> remedios) {
        System.out.println("Digite o ID do remedio que vc quer encontrar:");
        int id = Main.SC.nextInt();
        for (Remedio remedio : remedios) {
                if (remedio.getId() == id) {
                    return remedio;
                }
        }
        return null;
    }

    public static Remedio editarRemedio(ArrayList<Remedio> remedios) {
        Remedio remedioAchado = encontrarRemedioPorId(remedios);
                System.out.println("Digite o novo nome do produto");
                remedioAchado.setNome(Main.SC.next());
                System.out.println("Digite o novo Preco do produto");
                remedioAchado.setPreco(Main.SC.nextDouble());
                System.out.println("Digite a nova estoque do produto");
                remedioAchado.setEstoque(Main.SC.nextInt());
                return remedioAchado;
    }

    public static void removerRemedio(ArrayList<Remedio> remedios) {
        Remedio remedioAchado = encontrarRemedioPorId(remedios);
        remedios.remove(remedioAchado);
        System.out.println("PRODUTO FOI REMOVIDO!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public boolean isUsoAdulto() {
        return usoAdulto;
    }

    public void setUsoAdulto(boolean usoAdulto) {
        this.usoAdulto = usoAdulto;
    }

    public boolean isUsaReceita() {
        return usaReceita;
    }

    public void setUsaReceita(boolean usaReceita) {
        this.usaReceita = usaReceita;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "estoque: " + getEstoque() + "\n" +
                "ID: " + getId();
    }

}
