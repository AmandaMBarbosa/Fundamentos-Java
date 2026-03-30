//Classe principal - executar programa
public class Main {
    public static void main(String[] args) {
        //instanciar soma
        OperacaoMatematica soma = new Soma();
        //instanciar divisão
        OperacaoMatematica divisao = new Divisao();
        //tratamento de exceções
        try{
            soma.calcular(8, 2);
            divisao.calcular(10, 2);
            divisao.calcular(10, 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Programa finalizado com sucesso!");
        }
        
    }
}
