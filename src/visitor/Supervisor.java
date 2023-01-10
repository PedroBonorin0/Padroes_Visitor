package visitor;

public class Supervisor implements Funcionario{

  private int id;
  private String nome;
  private Loja loja;
  private int avaliacao;

  public Supervisor(int id, String nome, Loja loja, int avaliacao) {
    this.id = id;
    this.nome = nome;
    this.loja = loja;
    this.avaliacao = avaliacao;
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

  public int getAvaliacao() {
    return avaliacao;
  }

  @Override
  public String aceitar(Visitor visitor) {
    return visitor.exibirSupervisor(this);
  }
}
