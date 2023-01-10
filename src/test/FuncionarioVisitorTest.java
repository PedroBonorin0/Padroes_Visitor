package test;

import org.junit.jupiter.api.Test;
import visitor.*;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioVisitorTest {

  @Test
  void deveExibirVendedor() {
    Vendedor vendedor = new Vendedor(1, "Pedro", new Loja("Shopping Teresópolis"));

    FuncionarioVisitor visitor = new FuncionarioVisitor();
    String texto = """
            Vendedor:
            - nome: Pedro
            - id: 1
            - loja: Shopping Teresópolis""";
    assertEquals(texto, visitor.exibir(vendedor));
  }

  @Test
  void deveExibirGerente() {
    Gerente gerente = new Gerente(2, "Pedro", new Loja("Shopping Teresópolis"), "2015");

    FuncionarioVisitor visitor = new FuncionarioVisitor();
    String texto = """
            Vendedor:
            - nome: Pedro
            - id: 2
            - loja: Shopping Teresópolis
            - gerente desde: 2015""";
    assertEquals(texto, visitor.exibir(gerente));
  }

  @Test
  void deveExibirSupervisor() {
    Supervisor supervisor = new Supervisor(3, "Pedro", new Loja("Shopping Teresópolis"), 8);

    FuncionarioVisitor visitor = new FuncionarioVisitor();
    String texto = """
            Vendedor:
            - nome: Pedro
            - id: 3
            - loja: Shopping Teresópolis
            - avaliacao dos funcionarios: 8""";
    assertEquals(texto, visitor.exibir(supervisor));
  }
}