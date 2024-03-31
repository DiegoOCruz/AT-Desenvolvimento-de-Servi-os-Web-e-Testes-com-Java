package WebApp.service;

import java.util.Collection;	
import java.util.HashMap;
import java.util.Map;

import WebApp.model.domain.Bebida;


public class BebidaService {
	private static Map<Integer, Bebida> bebidas = new HashMap<Integer, Bebida>(); 
	
	public static void incluir(Bebida bebida) {
		bebidas.put(bebida.getId(), bebida);
	}
	
	public void excluir(int id) {
		bebidas.remove(id);
	}
	
	public Collection<Bebida> obterLista(){
		return bebidas.values();
	}
	
	public static Bebida obter(int id){
		return bebidas.get(id);
	}
}
