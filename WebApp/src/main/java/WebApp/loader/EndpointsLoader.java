package WebApp.loader;

import static spark.Spark.delete;
import static spark.Spark.get;
import static spark.Spark.post;

import WebApp.App;
import WebApp.controller.BebidaController;
import WebApp.controller.ClienteController;
import WebApp.controller.ComestivelController;
import WebApp.controller.EnderecoController;
import WebApp.controller.PedidoController;

public class EndpointsLoader {
	public static void loadEndpoints() {
		//tela index
		get("/", (req, res) ->{return App.class.getResourceAsStream("/index.html");}); 
		
		//tela doc api
		get("/api", (req, res) ->{return App.class.getResourceAsStream("/DocumentacaoAPI.html");}); 
		
		//Cliente
		get("/cliente/obterLista", ClienteController.obterLista);
		post("/cliente/incluir", ClienteController.incluir);
		delete("/cliente/:id/excluir", ClienteController.excluir);
		get("/cliente/:id/obterLista", ClienteController.obterPorId);
		get("/cliente/obterListaHtml", ClienteController.obterListaHtml);
		//--
		post("/cliente/incluir/:cep", ClienteController.incluirComCep);
		
		//Bebida
		get("/bebidas/obterLista", BebidaController.obterLista);
		post("/bebidas/incluir", BebidaController.incluir);
		delete("/bebidas/:id/excluir", BebidaController.excluir);
		get("/bebidas/:id/obterLista", BebidaController.obterPorId);
		get("/bebidas/obterListaHtml", BebidaController.obterListaHtml);
		
		//Comestíveis
		get("/comestiveis/obterLista", ComestivelController.obterLista);
		post("/comestiveis/incluir", ComestivelController.incluir);
		delete("/comestiveis/:id/excluir", ComestivelController.excluir);
		get("/comestiveis/:id/obterLista", ComestivelController.obterPorId);
		get("/comestiveis/obterListaHtml", ComestivelController.obterListaHtml);
		
		//Enderecos
		get("/enderecos/obterLista", EnderecoController.obterLista);
		post("/enderecos/incluir", EnderecoController.incluir);
		delete("/enderecos/:cep/excluir", EnderecoController.excluir);
		get("/enderecos/:cep/obterLista", EnderecoController.obterPorId);
		get("/enderecos/obterListaHtml", EnderecoController.obterListaHtml);
		
		//Pedidos
		get("/pedidos/obterLista", PedidoController.obterLista);
		post("/pedidos/incluir", PedidoController.incluir);
		delete("/pedidos/:id/excluir", PedidoController.excluir);
		get("/pedidos/:id/obterLista", PedidoController.obterPorId);
		get("/pedidos/obterListaHtml", PedidoController.obterListaHtml);
	}
}
