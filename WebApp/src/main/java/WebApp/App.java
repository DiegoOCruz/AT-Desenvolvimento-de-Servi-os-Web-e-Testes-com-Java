package WebApp;

import static spark.Spark.*;

import WebApp.loader.BebidaLoader;
import WebApp.loader.ClienteLoader;
import WebApp.loader.ComestiveisLoader;
import WebApp.loader.EnderecoLoader;
import WebApp.loader.EndpointsLoader;
import WebApp.loader.PedidosLoader;

public class App {
	public static void main(String[] args) {
		
		port(8080);
		EndpointsLoader.loadEndpoints();//Carregar os endpoints
		
		EnderecoLoader.enderecoLoad();//Inserir endereços no service (MAP)
		ClienteLoader.loalClientes();//Inserir clientes no service (MAP)
		BebidaLoader.loalBebidas();//Inserir bebidas no service (MAP)
		ComestiveisLoader.loadComestiveis();//Inserir comestíveis no service (MAP)
		PedidosLoader.loadPedidos();//Inserir pedidos no service (MAP)
	}
}
