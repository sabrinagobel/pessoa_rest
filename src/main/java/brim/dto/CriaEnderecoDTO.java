package brim.dto;

public class CriaEnderecoDTO {
	
	private Long id;
	private Long idPessoa;
	private Boolean enderecoPrincipal;
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Boolean getEnderecoPrincipal() {
		return enderecoPrincipal;
	}
	public void setEnderecoPrincipal(Boolean enderecoPrincipal) {
		this.enderecoPrincipal = enderecoPrincipal;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logadouro) {
		this.logradouro = logadouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
