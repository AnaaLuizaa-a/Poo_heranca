public class Vendedor extends Empregado{
  //atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). 
  private double valorVendas;
  private double comissao;

  public Vendedor (String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double valorVendas, double comissao){
    super(nome,endereco,telefone,codSetor,salarioBase,imposto);
    this.valorVendas=valorVendas;
    this.comissao=comissao;
  }
  public double getvalorVendas(){
    return this.valorVendas;
  }
  
  public double getcomissao(){
    return this.comissao;
  }
  
  public double calcularSalario(){
    return super.calcularSalario() + this.comissao;
    
  }
}