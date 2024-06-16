import java.util.ArrayList;

public class Carrinho {
    Cliente c;
    ArrayList<RemedioCarrinho> remediosCarrinho = new ArrayList<>();

    public Carrinho(){

    }

    public Carrinho(Cliente c){
        setC(c);
    }

    public void adicionarRemedioCarrinho(Remedio remedio, int quantidade){
        if(remedio.getEstoque() < quantidade){
            System.out.println("ERRO QUANTIDADE DE COMPRA MAIOR QUE O ESTOQUE");
            return;
        }
        RemedioCarrinho remedioCarrinho = new RemedioCarrinho(remedio, quantidade);
        remediosCarrinho.add(remedioCarrinho);
    }

    public void comprar(){
        for(RemedioCarrinho r: remediosCarrinho){
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Produto: " + r.getNome());
            System.out.println("Quantidade comprada: " + r.getQuantidade());
            System.out.println("Valor total: R$" + (r.getPreco() * r.getQuantidade()));
        }

    }

    public ArrayList<RemedioCarrinho> getRemediosCarrinho() {
        return remediosCarrinho;
    }


    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
}
