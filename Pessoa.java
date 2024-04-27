public class Pessoa {
  private String nome;
  private String endereco;
  private String telefone;

  // Construtor padrão
  public Pessoa() {
    this.nome = "";
    this.endereco = "";
    this.telefone = "";
  }

  // Construtor com todos os atributos
  public Pessoa(String nome, String endereco, String telefone, String additionalParameter) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  // Construtor com nome e endereço
  public Pessoa(String nome, String endereco) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = "";
  }

  // Construtor com nome e telefone
  public Pessoa(String nome, String telefone, String additionalParameter) {
    this.nome = nome;
    this.endereco = "";
    this.telefone = telefone;
  }
  // Seletores (getters)
  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public String getTelefone() {
    return this.telefone;
  }

  // Modificadores (setters)
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}
