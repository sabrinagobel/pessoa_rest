package brim.services;

import java.util.List;

import org.springframework.stereotype.Service;

import brim.entities.Endereco;
import brim.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	private final EnderecoRepository enderecoRepository;
	
	public EnderecoService(EnderecoRepository enderecoRepository) {
		this.enderecoRepository = enderecoRepository;
	}
	
	public Endereco criarEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> listarEnderecosPessoa(Long id) {
		List<Endereco> lista = enderecoRepository.findByIdPessoa(id);
		return lista;
	}

}
