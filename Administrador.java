public class Administrador extends Empregado {
  private double ajudaCusto;

  public Administrador(String nome, String endereco, String telefone, int codSetor, double salarioBase, double imposto, double ajudaCusto){
    super(nome, endereco, telefone, codSetor, salarioBase, imposto);
    this.ajudaCusto = ajudaCusto;
  }

public double getAjudaCusto(){
  return this.ajudaCusto;
}
  
  public double calcularSalario(){
    return super.calcularSalario() + this.ajudaCusto;
    
  }
  
}