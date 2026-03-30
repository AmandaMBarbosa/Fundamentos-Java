//Classe Soma
public class Soma extends OperacaoMatematica{
    /*indica que a classe Soma vai sobrescrever o método calcular() da classe OperacaoMatematica*/
    @Override
    //Método para calcular a soma
    public void calcular(double a, double b){
        System.out.println("Soma:" + (a + b));
    }
}

