package com.algaworks.pedidovenda.controller;


import javax.inject.Inject;
import javax.inject.Named;


@Named("meuBean")
public class PrecoProdutoBean {

    //Sem CDI
    /*
    private CalculadoraPreco calculadora;

    public double getPreco() {
        calculadora = new CalculadoraPreco();
        return calculadora.calcularPreco(12, 44.5);
    }
    */

    //Com CDI
    @Inject
    private CalculadoraPreco calculadora;

    public double getPreco() {
        return calculadora.calcularPreco(12, 44.5);
    }
}
