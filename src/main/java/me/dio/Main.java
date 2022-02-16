package me.dio;

import me.dio.entities.Endereco;
import me.dio.entities.Gerente;
import me.dio.entities.OperadorCaixa;
import me.dio.entities.Vendedor;

public class Main {
    
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua funcionário", "Complemento rua endereço", "bairro funcionário");

        String rua = endereco.getRua();
        System.out.println(rua);

        endereco.setRua("Rua do funcionário fulano");

        String rua1 = endereco.getRua();

        System.out.println(rua1);
        System.out.println(endereco);
        System.out.println("----------");

        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-01");
        vendedor.setEndereco(endereco);
        vendedor.setValorSalario(1000d);
        vendedor.calculaBonificacao(5d);

        System.out.println(vendedor);
        System.out.println("----------");

        OperadorCaixa operadorCaixa = new OperadorCaixa("Camila Caixa", "987.654.321-09", 500d, endereco);

        System.out.println(operadorCaixa);
        System.out.println("----------");

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.789.123-87");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(100);
        gerente.setValorHora(50d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
    }
    
}
