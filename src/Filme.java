

public class Filme{
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    int somaDasAvaliacoes;
    


    public void exibeFichaTecnica(){
        System.out.println("Titulo=>"+nome);
        System.out.println("Ano de Lancamento=>"+anoDeLancamento);
        System.out.println("Duracao em Minutos=>"+duracaoEmMinutos);
        System.out.println("Incluido no Plano:"+incluidoNoPlano);
        ;
        

    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }
    
}