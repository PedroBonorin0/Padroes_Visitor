package visitor;

public class FuncionarioVisitor implements Visitor{
  public String exibir(Funcionario func) {
    return func.aceitar(this);
  }

  @Override
  public String exibirVendedor(Vendedor vendedor) {
    return "Vendedor:" +
            "\n- nome: " + vendedor.getNome() +
            "\n- id: " + vendedor.getId() +
            "\n- loja: " + vendedor.getLoja().getNome();
  }

  @Override
  public String exibirGerente(Gerente gerente) {
    return "Vendedor:" +
            "\n- nome: " + gerente.getNome() +
            "\n- id: " + gerente.getId() +
            "\n- loja: " + gerente.getLoja().getNome() +
            "\n- gerente desde: " + gerente.getAnoGerencia();
  }

  @Override
  public String exibirSupervisor(Supervisor supervisor) {
    return "Vendedor:" +
            "\n- nome: " + supervisor.getNome() +
            "\n- id: " + supervisor.getId() +
            "\n- loja: " + supervisor.getLoja().getNome() +
            "\n- avaliacao dos funcionarios: " + supervisor.getAvaliacao();
  }
}
