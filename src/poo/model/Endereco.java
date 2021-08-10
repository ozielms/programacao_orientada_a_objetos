package poo.model;

public class Endereco {
	
	public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}
	
	public String encereco;
	public String numero;
	public String  complemento;
	public String bairro;
	public String cidade;
	public String estado;
	public String cep;
	public TipoEndereco tipo;

}
