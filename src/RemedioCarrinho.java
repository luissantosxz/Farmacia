public class RemedioCarrinho extends Remedio{
    private int quantidade;

    public RemedioCarrinho(Remedio remedio, int quantidade){
        super(remedio.getNome(), remedio.getPreco(), remedio.getEstoque(), remedio.getMg(), remedio.isUsoAdulto(), remedio.isUsaReceita());
        setQuantidade(quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
