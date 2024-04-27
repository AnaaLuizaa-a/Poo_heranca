//crie um programa para testar as classes fornecedor e empregado

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o nome do fornecedor: ");
    String nomeFornecedor = scanner.nextLine();
    System.out.println("Digite o endereço do fornecedor: ");
    String enderecoFornecedor = scanner.nextLine();
    System.out.println("Digite o telefone do fornecedor: ");
    String telefoneFornecedor = scanner.nextLine();
    System.out.println("Digite o valor do crédito do fornecedor: ");
    double valorCredito = scanner.nextDouble();
    System.out.println("Digite o valor da dívida do fornecedor: ");
    double valorDivida = scanner.nextDouble();
    Fornecedor fornecedor = new Fornecedor(nomeFornecedor, enderecoFornecedor, telefoneFornecedor, valorCredito,
        valorDivida);
    System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());

    
    System.out.println("Digite o nome do empregado: ");
    String nomeEmpregado = scanner.next();
    System.out.println("Digite o endereço do empregado: ");
    String enderecoEmpregado = scanner.next();
    System.out.println("Digite o telefone do empregado: ");
    String telefoneEmpregado = scanner.next();
    System.out.println("Digite o código do setor do empregado: ");
    int codSetor = scanner.nextInt();
    System.out.println("Digite o salário base do empregado: ");
    double salarioBase = scanner.nextDouble();
    System.out.println("Digite o imposto do empregado: ");
    double imposto = scanner.nextDouble();
    Empregado empregado = new Empregado(nomeEmpregado, enderecoEmpregado, telefoneEmpregado, codSetor, salarioBase, imposto);
    System.out.print("Salário líquido do empregado: "+ empregado.calcularSalario());

    //entrada dos dados do administrador
    System.out.println("\nDigite o nome do administrador: ");
    String nomeAdministrador = scanner.next();

    System.out.println("Digite o endereço do administrador: ");
    String enderecoAdministrador = scanner.next();

    System.out.println("Digite o telefone do administrador: ");
    String telefoneAdministrador = scanner.next();

    System.out.println("Digite o código do setor do administrador: ");
    int codSetorAdministrador = scanner.nextInt();

    System.out.println("Digite o salário base do administrador: ");
    double salarioBaseAdministrador = scanner.nextDouble();

    System.out.println("Digite o imposto do administrador: ");
    double impostoAdministrador = scanner.nextDouble();

    System.out.println("Digite a ajuda de custo do administrador: ");
    double ajudaCustoAdministrador = scanner.nextDouble();

    Administrador administrador = new Administrador(nomeAdministrador, enderecoAdministrador, telefoneAdministrador, codSetorAdministrador, salarioBaseAdministrador, impostoAdministrador, ajudaCustoAdministrador);

    //entrada de dados do operario
    System.out.println("Digite o nome do operário: ");
    String nomeOperario = scanner.next();
    System.out.println("Digite o endereço do operario: ");
    String enderecoOperario = scanner.next();
    System.out.println("Digite o telefone do operario: ");
    String telefoneOperario = scanner.next();
    System.out.println("Digite o código do setor do operario: ");
    int codSetorOperario = scanner.nextInt();
    System.out.println("Digite o salário base do operario: ");
    double salarioBaseOperario = scanner.nextDouble();
    System.out.println("Digite o imposto do operario: ");
    double impostoOperario = scanner.nextDouble();
    System.out.println("Digite o valor da produção do operario: ");
    double valorProducaoOperario = scanner.nextDouble();
    System.out.println("Digite a comissão do operario: ");
    double comissaoOperario = scanner.nextDouble();
    Operario operario = new Operario(nomeOperario, enderecoOperario, telefoneOperario, codSetorOperario, salarioBaseOperario, impostoOperario, valorProducaoOperario, comissaoOperario);

    //imprimir dados
    System.out.print("\n============================");
    System.out.println("\nNome do fornecedor: " + fornecedor.getNome());
    System.out.println("Endereço do fornecedor: " + fornecedor.getEndereco());
    System.out.println("Telefone do fornecedor: " + fornecedor.getTelefone());
    System.out.println("Valor do crédito do fornecedor: " + fornecedor.getvalorCredito());
    System.out.println("Valor da dívida do fornecedor: " + fornecedor.getvalorDivida());
    System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());

    System.out.print("\n============================");
    System.out.println("\nNome do empregado: " + empregado.getNome());
    System.out.println("Endereço do empregado: " + empregado.getEndereco());
    System.out.println("Telefone do empregado: " + empregado.getTelefone());
    System.out.println("Código do setor do empregado: " + empregado.getCodSetor());
    System.out.println("Salário base do empregado: " + empregado.getSalarioBase());
    System.out.println("Imposto do empregado: " + empregado.getImposto());
    System.out.println("Salário líquido do empregado: " + empregado.calcularSalario());
    
System.out.print("\n============================");
    System.out.println("\nNome do administrador: " + administrador.getNome());
    System.out.println("Endereço do administrador: " + administrador.getEndereco());
    System.out.println("Telefone do administrador: " + administrador.getTelefone());
    System.out.println("Código do setor do administrador: " + administrador.getCodSetor());
    System.out.println("Salário base do administrador: " + administrador.getSalarioBase());
    System.out.println("Imposto do administrador: " + administrador.getImposto());
    System.out.println("Ajuda de custo do administrador: " + administrador.getAjudaCusto());
    System.out.println("Salário líquido do administrador: " + administrador.calcularSalario());

    System.out.print("\n============================");
    System.out.println("\nNome do operário: " + operario.getNome());
    System.out.println("Endereço do operário: " + operario.getEndereco());
    System.out.println("Telefone do operário: " + operario.getTelefone());
    System.out.println("Código do setor do operário: " + operario.getCodSetor());
    System.out.println("Salário base do operário: " + operario.getSalarioBase());
    System.out.println("Imposto do operário: " + operario.getImposto());
    System.out.println("Valor da produção do operário: " + operario.getValorProducao());
    System.out.println("Comissão do operário: " + operario.getComissao());
    System.out.println("Salário líquido do operário: " + operario.calcularSalario());
  }

}