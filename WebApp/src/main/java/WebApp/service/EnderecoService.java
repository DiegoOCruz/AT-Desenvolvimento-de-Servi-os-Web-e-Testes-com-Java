package WebApp.service;

import java.util.Collection;	
import java.util.HashMap;
import java.util.Map;

import WebApp.model.domain.Endereco;

public class EnderecoService {
	private static Map<String, Endereco> enderecos = new HashMap<String, Endereco>(); 
	
	public void incluir(Endereco endereco) {
		enderecos.put(endereco.getCep(), endereco);
	}
	
	public void excluir(String cep) {
		enderecos.remove(cep);
	}
	
	public Collection<Endereco> obterLista(){
		return enderecos.values();
	}
	
	public  Endereco obter(String cep){
		return enderecos.get(cep);
	}
}
