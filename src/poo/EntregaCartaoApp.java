package poo;

import poo.model.Endereco;

import java.util.ArrayList;

import poo.model.Cliente;

public class EntregaCartaoApp {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		
		endereco.cep = "88058000";
		
		
		Cliente cliente = new Cliente();
		
//		N�O SER� UTILIZADA COM A CRIA��O DO M�TODO SETTERS
		/*
		if (cliente.enderecos == null) { // Se cliente.enderecos for null ele inicia o objeto.
			cliente.enderecos = new ArrayList<Endereco>();
		}
		*/
		//cliente.getEnderecos().add(endereco);
		
		try {
			cliente.adcionaEndereco(endereco);
			System.out.println("Endere�o adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
		}
		
		
	}

}
