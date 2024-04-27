public class Operario extends Empregado{
  private double valorProducao;
  private double comissao;
  
  public Operario(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
      super(nome, endereco, telefone, codSetor, salarioBase, imposto);
    this.valorProducao = valorProducao;
    this.comissao = comissao;
  }
  public double getValorProducao(){
    return this.valorProducao;
  }
  public double getComissao(){
    return this.comissao;
  }
  public double calcularSalario(){
    return super.calcularSalario() + this.comissao;
  }
  
}