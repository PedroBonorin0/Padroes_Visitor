package visitor;

public interface Visitor {
  String exibirVendedor(Vendedor vendedor);
  String exibirGerente(Gerente gerente);
  String exibirSupervisor(Supervisor Supervisor);
}
