package brim.dto;

public class ConsultaEnderecoDTO {
	
	private Long id;
	private Long idPessoa;
	private Boolean enderecoPrincipal;
	private String logadouro;
	private String cep;
	private String numero;
	private String cidade;
	
	public ConsultaEnderecoDTO() {
	}

	public ConsultaEnderecoDTO(Long id, Long idPessoa, Boolean enderecoPrincipal, String logadouro, String cep,
			String numero, String cidade) {
		super();
		this.id = id;
		this.idPessoa = idPessoa;
		this.enderecoPrincipal = enderecoPrincipal;
		this.logadouro = logadouro;
		this.cep = cep;
		this.numero = numero;
		this.cidade = cidade;
	}

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

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
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
