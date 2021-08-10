package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
//		PRIMEIRO MODO
		
//		Dados cliente
		public int codigo;
		public String nome;
		public String cpf;

/*		
//		Endereço Residencial
		public String encereco1;
		public String numero1;
		public String  complemento1;
		public String bairro1;
		public String cidade1;
		public String estado1;
		public String cep1;
		
//		Endereço Comercial
		public String encereco2;
		public String numero2;
		public String  complemento2;
		public String bairro2;
		public String cidade2;
		public String estado2;
		public String cep2;
		
//		Endereço de Entrega
		public String encereco3;
		public String numero3;
		public String  complemento3;
		public String bairro3;
		public String cidade3;
		public String estado3;
		public String cep3;
*/
/*		
//		SEGUNDO MODO
		
		public Endereco endereco;
		public Endereco enderecoEntrega;
		public Endereco enderecoTrabalho;
*/
		
//		TERCEIRO MODO
		private List<Endereco> enderecos;
		/*
		public void setEnderecos(List<Endereco> enderecos) {
			this.enderecos = enderecos;
		}
		*/
		
		public void adcionaEndereco(Endereco endereco) { //Método para add endereço
			if (endereco == null) {
				throw new NullPointerException("Endereco nao pode ser nulo");
			}
			
			if (endereco.cep == null) {
				throw new NullPointerException("Cep nao pode ser null");
			}
			
			getEnderecos().add(endereco);
		}
		
		public List<Endereco> getEnderecos() {
			if (enderecos == null) {
				enderecos = new ArrayList<Endereco>();
			}
			return enderecos;
		}
	}
