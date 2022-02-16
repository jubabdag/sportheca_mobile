package me.dio.entities;

public class OperadorCaixa extends FuncionarioCLT {

  public OperadorCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
    super(nome, documento, valorSalario, endereco);
  }

  @Override
  public String toString() {
    return "OperadorCaixa [" +
      "nome='" + nome + '\'' +
      ", documento='" + documento + '\'' +
      ", valorSalario=" + valorSalario +
      ", endereco=" + endereco.getRua() + "]";
  }
  
  
}
