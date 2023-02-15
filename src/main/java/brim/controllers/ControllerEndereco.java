package brim.controllers;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brim.dto.ConsultaEnderecoDTO;
import brim.dto.CriaEnderecoDTO;
import brim.dto.EnderecoMapper;
import brim.entities.Endereco;
import brim.services.EnderecoService;

@RestController
@RequestMapping("/v1/enderecos")
public class ControllerEndereco {

	private final EnderecoService enderecoService;

	public ControllerEndereco(EnderecoService enderecoService) {
		this.enderecoService = enderecoService;
	}

	@PostMapping("{id}")
	public ResponseEntity<ConsultaEnderecoDTO> criarEnderecoPessoa(@RequestBody CriaEnderecoDTO dto,
			@PathVariable Long id) {
		dto.setIdPessoa(id);
		Endereco endereco = enderecoService.criarEndereco(EnderecoMapper.fromDTO(dto));
		return ResponseEntity.ok(EnderecoMapper.fromEntity(endereco));
	}

	@GetMapping("/pessoa/{id}")
	public ResponseEntity<List<ConsultaEnderecoDTO>> consultarEnderecoPessoa(@PathVariable Long id) {
		return ResponseEntity.ok(enderecoService.listarEnderecosPessoa(id).stream().map(EnderecoMapper::fromEntity)
				.collect(Collectors.toList()));
	}

}
