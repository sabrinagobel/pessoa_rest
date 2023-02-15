package brim.dto;

import brim.entities.Pessoa;

public class PessoaMapper {

	public static Pessoa fromDTO(CriaPessoaDTO dto) {
		return new Pessoa(null, dto.getNome(), dto.getNascimento());
	}
	
	public static ConsultaPessoaDTO fromEntity(Pessoa pessoa) {
		return new ConsultaPessoaDTO(pessoa.getId(), pessoa.getNome(), pessoa.getNascimento());
	}
	
}
