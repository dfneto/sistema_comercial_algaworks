package com.algaworks.pedidovenda.controller;

/**
 * Created by david on 11/12/2015.
 */
public class CalculadoraPreco {

    public double calcularPreco (int quantidade, double precoUnitario){
        return  quantidade * precoUnitario;
    }
}
