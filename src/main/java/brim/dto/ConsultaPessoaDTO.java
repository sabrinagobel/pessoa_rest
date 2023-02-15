package brim.dto;

import java.util.Date;

public class ConsultaPessoaDTO {
	
	private Long id;
	private String nome;
	private Date nascimento;
	
	public ConsultaPessoaDTO() {
	}
	
	public ConsultaPessoaDTO(Long id, String nome, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
