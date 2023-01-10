package visitor;

public class Gerente implements Funcionario{

  private int id;
  private String nome;
  private Loja loja;
  private String anoGerencia;

  public Gerente(int id, String nome, Loja loja, String anoGerencia) {
    this.id = id;
    this.nome = nome;
    this.loja = loja;
    this.anoGerencia = anoGerencia;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Loja getLoja() {
    return loja;
  }

  public String getAnoGerencia() {
    return anoGerencia;
  }

  @Override
  public String aceitar(Visitor visitor) {
    return visitor.exibirGerente(this);
  }
}
