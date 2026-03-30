//Classe Divisão
public class Divisao extends OperacaoMatematica{
    /*indica que a classe Divisao vai sobrescrever o método calcular() da classe OperacaoMatematica*/
    @Override
    /*Método para verificar a entrada de b como diferente de zero, se sim, calcular a divisão*/
    public void calcular(double a, double b)throws DivisaoPorZeroException{
        if (b == 0){
            throw new DivisaoPorZeroException();
        }else{
            System.out.println("Divisão:" + (a/b));
        }
    }
} 

