package brim.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import brim.entities.Pessoa;
import brim.repositories.PessoaRepository;

@Service
public class PessoaService {

	private final PessoaRepository pessoaRepository;

	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public Pessoa criarPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public Pessoa editarPessoa(Pessoa pessoa, Long id) {
		Pessoa pessoaOriginal = this.consultarPessoa(id);
		pessoa.setId(pessoaOriginal.getId());
		return pessoaRepository.save(pessoa);
	}

	public Pessoa consultarPessoa(Long id) {
		Optional<Pessoa> optional = pessoaRepository.findById(id);
		return optional.orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
	}

	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}

}
