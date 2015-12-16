package com.algaworks.pedidovenda.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 27/11/2015.
 */
@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {

    private List<Integer> produtosFiltrados;

    public PesquisaProdutosBean() {
        produtosFiltrados = new ArrayList<>();
        for (int i=0; i < 50; i++) {
            produtosFiltrados.add(i);
        }
    }

    public List<Integer> getProdutosFiltrados() {
        return produtosFiltrados;
    }
}