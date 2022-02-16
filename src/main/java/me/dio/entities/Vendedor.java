package me.dio.entities;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
  private Double valorBonificacao;

  @Override
  public void calculaBonificacao(Double porcentagemBonificacao) {
    this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
  }

  @Override
  public String toString() {
    return "Vendedor [" +
    "nome='" + nome + '\'' +
    ", documento='" + documento + '\'' +
    ", valorSalario=" + valorSalario +
    ", endereco=" + endereco.getBairro() +
    ", valorBonificacao=" + valorBonificacao + "]";
  }
}
