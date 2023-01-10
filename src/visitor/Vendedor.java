package visitor;

public class Vendedor implements Funcionario{

  private int id;
  private String nome;
  private Loja loja;

  public Vendedor(int id, String nome, Loja loja) {
    this.id = id;
    this.nome = nome;
    this.loja = loja;
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

  @Override
  public String aceitar(Visitor visitor) {
    return visitor.exibirVendedor(this);
  }
}
