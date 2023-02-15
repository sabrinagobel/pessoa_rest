package brim.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brim.dto.ConsultaPessoaDTO;
import brim.dto.CriaPessoaDTO;
import brim.dto.PessoaMapper;
import brim.entities.Pessoa;
import brim.services.PessoaService;

@RestController
@RequestMapping("/v1/pessoas")
public class ControllerPessoa {

	private final PessoaService pessoaService;

	public ControllerPessoa(PessoaService pessoaService) {
		this.pessoaService = pessoaService;
	}

	@PostMapping
	public ResponseEntity<ConsultaPessoaDTO> criarPessoa(@RequestBody CriaPessoaDTO dto) {
		Pessoa pessoa = pessoaService.criarPessoa(PessoaMapper.fromDTO(dto));
		return ResponseEntity.ok(PessoaMapper.fromEntity(pessoa));
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaPessoaDTO> editarPessoa(@RequestBody CriaPessoaDTO dto, @PathVariable Long id) {
		try {
			Pessoa editarPessoa = pessoaService.editarPessoa(PessoaMapper.fromDTO(dto), id);
			return ResponseEntity.ok(PessoaMapper.fromEntity(editarPessoa));
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ConsultaPessoaDTO> consultarPessoa(@PathVariable Long id) {
		try {
			Pessoa pessoa = pessoaService.consultarPessoa(id);
			return ResponseEntity.ok(PessoaMapper.fromEntity(pessoa));
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public ResponseEntity<List<ConsultaPessoaDTO>> listarPessoas() {
		return ResponseEntity
				.ok(pessoaService.listarPessoas().stream().map(PessoaMapper::fromEntity).collect(Collectors.toList()));
	}

}
