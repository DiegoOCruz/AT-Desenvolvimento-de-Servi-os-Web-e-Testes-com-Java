package WebApp.service;

import java.util.Collection;			
import java.util.HashMap;
import java.util.Map;


import WebApp.model.domain.Cliente;


public class ClienteService {
	
	private static Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>(); 
	public void incluir(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	public void excluir(Integer id) {
		clientes.remove(id);
	}
	
	public Collection<Cliente> obterLista(){
		return clientes.values();
	}
	
	public Cliente obter(Integer id){
		return clientes.get(id);
	}
}
