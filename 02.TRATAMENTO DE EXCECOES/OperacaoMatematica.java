//CÁLCULO DE OPERAÇÕES COM CLASSE ABSTRATA E TRATAMENTO DE EXCEÇÕES

//classe que não pode ser instanciada diretamente - usada como referencia para as classes filhas
public abstract class OperacaoMatematica{
    //public abstract void calcular: método sem implementação, apenas define o que deve ser feito e não como
    //double a, double b: recebe dois valores decimais
    //throws Exception: tratamento de exceções - possibilitar que classes filhas tratem erros
    public abstract void calcular(double a, double b) throws Exception;
}

