package WebApp.service;

import java.util.Collection;		
import java.util.HashMap;
import java.util.Map;


import WebApp.model.domain.Comestivel;


public class ComestivelService {
	private static Map<Integer, Comestivel> comestiveis = new HashMap<Integer, Comestivel>(); 
	
	public void incluir(Comestivel comestivel) {
		comestiveis.put(comestivel.getId(), comestivel);
	}
	
	public void excluir(Integer id) {
		comestiveis.remove(id);
	}
	
	public Collection<Comestivel> obterLista(){
		return comestiveis.values();
	}
	
	public Comestivel obter(Integer id){
		return comestiveis.get(id);
	}
}
