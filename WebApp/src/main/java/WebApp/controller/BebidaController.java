package WebApp.controller;

import com.google.gson.Gson;	

import WebApp.model.domain.Bebida;
import WebApp.model.domain.Cliente;
import WebApp.service.BebidaService;
import spark.Route;

public class BebidaController {
	static BebidaService bebidaService = new BebidaService();
	// recuperar Bebida
	public static Route obterLista = (req, resp) -> {
		String gson = new Gson().toJson(bebidaService.obterLista());
		// return clienteService.obterLista();
		return gson;
	};
	// incluir Bebida
	public static Route incluir = (req, resp) -> {
		Bebida parametro = new Gson().fromJson(req.body(), Bebida.class);
		bebidaService.incluir(parametro);
		return parametro.getNome() + " incluído com sucesso.";
	};

	// excluir Bebida
	public static Route excluir = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		String nome = bebidaService.obter(parametro).getNome();
		bebidaService.excluir(parametro);
		return nome + " excluído com sucesso.";
	};

	// recuperar um Bebida
	public static Route obterPorId = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		String gson = new Gson().toJson(bebidaService.obter(parametro));
		return gson;
	};
	//recuperar bebidas para html
	public static Route obterListaHtml = (req, resp) -> {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<h2>Lista de Bebidas Cadastradas:</h2><br>");
	    for (Bebida bebida  : bebidaService.obterLista()) {
	        sb.append("<p><strong>Id:</strong> " + bebida.getId() + "<br>");
	        sb.append("<strong>Nome:</strong> " + bebida.getNome() + "<br>");
	        sb.append("<strong>Tipo:</strong> " + bebida.getTipo() + "<br>");
	        sb.append("<strong>Preço:</strong> R$" + bebida.getPrecoVenda() + "</p><br>");
	        
	    }
	    sb.append("<ul><li><a href=\"/\">Voltar</a></li></ul>");
	    return sb.toString();
	};

}
