package WebApp.service;

import java.util.Collection;			
import java.util.HashMap;
import java.util.Map;


import WebApp.model.domain.Pedido;


public class PedidoService {
	private static Map<Integer, Pedido> pedidos = new HashMap<Integer, Pedido>(); 
	
	public void incluir(Pedido pedido) {
		pedidos.put(pedido.getId(), pedido);
	}
	
	public void excluir(Integer id) {
		pedidos.remove(id);
	}
	
	public Collection<Pedido> obterLista(){
		return pedidos.values();
	}
	
	public Pedido obter(Integer id){
		return pedidos.get(id);
	}
}
