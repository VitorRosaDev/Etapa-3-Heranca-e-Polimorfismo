public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        super.toString();
        return "\nSeguros para Eletrônicos: " + seguroEletronicos ;
      }
    
}
