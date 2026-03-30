//CRIAÇÃO DA CLASSE PRODUTO
public class Produto{
    //ATRIBUTOS
    String nomeProduto;
    double precoProduto;
    static int quantidadeTotal = 0;

    //CONSTRUTOR PADRÃO
    public Produto(){
        nomeProduto = "Desconhecido";
        precoProduto = 0.0;
        quantidadeTotal++;
    }

    //CONSTRUTOR COM PARÂMETROS
    public Produto(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;

        //Incrementar novo produto cadastrado a quantidadeTotal
        quantidadeTotal++;
    }

    //METODO EXIBIR DADOS
    public void exibirDados(){
        System.out.println("Nome: " + nomeProduto + " | Preço: R$ " + precoProduto);
    }

    //METODO EXIBIR QUANTIDADE DE PRODUTOS CRIADOS 
    public static void exibirQuantidadeTotal(){
        System.out.println("Quantidade Total:" + quantidadeTotal);
    }
}