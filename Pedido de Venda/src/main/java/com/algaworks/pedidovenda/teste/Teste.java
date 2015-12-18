package com.algaworks.pedidovenda.teste;

import com.algaworks.pedidovenda.model.Cliente;
import com.algaworks.pedidovenda.model.Endereco;
import com.algaworks.pedidovenda.model.TipoPessoa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by david on 15/12/2015.
 */
public class Teste {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoPU");
        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();

        Cliente cliente = new Cliente();
        cliente.setNome("Paulo Nunes");
        cliente.setEmail("joao@couves.com");
        cliente.setDocumentoReceitaFederal("123.123.123-12");
        cliente.setTipoPessoa(TipoPessoa.FISICA);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua A");
        endereco.setNumero("123");
        endereco.setCidade("Belem");
        endereco.setUf("PA");
        endereco.setCep("66035-090");
        endereco.setCliente(cliente);

        cliente.getEnderecos().add(endereco);

        manager.persist(cliente);

        transaction.commit();
    }
}
