public class Loja{

  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  
  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = salarioBaseFuncionario;

  }
  
  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.salarioBaseFuncionario = -1;
  }
    
  public String getNome(){
      return nome;
  }
    
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public int getQuantidadeFuncionarios(){
    return quantidadeFuncionarios;
  }
    
  public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public Endereco getEndereco(){
    return endereco;
  }
    
  public void setEndereco(Endereco endereco){
    this.endereco = endereco;
  }

  public Data getDataFundacao(){
    return dataFundacao;
  }
    
  public void setDataFundacao(Data dataFundacao){
    this.dataFundacao = dataFundacao;
  }
    
  public double getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;
  }
    
  public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }
  
  public String toString() {
    return "Nome da Loja: " + nome + 
    "\nQuantidade de Funcionários: " + quantidadeFuncionarios + 
    "\nSalário Base de Funcionário: R$" + salarioBaseFuncionario +
    "\nEndereço: " + endereco +
    "\nData de Fundação: " + dataFundacao ;
  }

  public double gastosComSalario() {
    if (salarioBaseFuncionario == -1) {
      return -1;
    } else {
      return quantidadeFuncionarios * salarioBaseFuncionario;
    }
  }

  public char tamanhoDaLoja() {
    if (quantidadeFuncionarios < 10) {
      return 'P';
    } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
      return 'M';
    } else {
      return 'G';
    }
  }
      
}