package brim.dto;

import brim.entities.Endereco;

public class EnderecoMapper {

	public static Endereco fromDTO(CriaEnderecoDTO dto) {
		return new Endereco(dto.getId(), dto.getIdPessoa(), dto.getEnderecoPrincipal(), dto.getLogradouro(), dto.getCep(),
				dto.getNumero(), dto.getCidade());
	}

	public static ConsultaEnderecoDTO fromEntity(Endereco endereco) {
		return new ConsultaEnderecoDTO(endereco.getId(), endereco.getIdPessoa(), endereco.getEnderecoPrincipal(), endereco.getLogradouro(),
				endereco.getCep(), endereco.getNumero(), endereco.getCidade());
	}
}
