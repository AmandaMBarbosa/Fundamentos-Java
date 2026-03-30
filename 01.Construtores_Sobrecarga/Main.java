//CLASSE PRINCIPAL
public class Main {
      public static void main(String[] args) {

        //CRIAR PRODUTOS USANDO OS DOIS CONSTRUTORES
        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse", 50);
        Produto p3 = new Produto(); // construtor padrão

        //EXIBIR DADOS DOS PRODUTOS CRIADOS
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();

        //EXIBIR TOTAL DE PRODUTOS CRIADOS
        Produto.exibirQuantidadeTotal();

    }
}
