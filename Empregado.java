public class Empregado extends Pessoa{
  private int codSetor;
  private double salarioBase;
  private double imposto;

  public Empregado(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto) {
    super(nome, endereco, telefone);
    this.codSetor = codSetor;
    this.salarioBase = salarioBase;
    this.imposto = imposto;
  }

  public int getCodSetor(){
    return this.codSetor;
  }
  public double getSalarioBase(){
    return this.salarioBase;
  }
  public double getImposto(){
    return this.imposto;
  }
  public void setCodSetor(int codSetor){
    this.codSetor = codSetor;
  }
  public void setSalarioBase(double salarioBase){
    this.salarioBase = salarioBase;
  }
  public void setImposto(double imposto){
    this.imposto = imposto;
  }
  public double calcularSalario(){
    return this.salarioBase - (this.salarioBase * this.imposto);
  }
  
}