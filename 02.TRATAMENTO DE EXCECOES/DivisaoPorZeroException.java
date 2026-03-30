//Classe responsável por personalizar a exceção na classe Divisao
public class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(){
        super("Operação Inválida! Não é possível dividir por zero.");
    }

}
