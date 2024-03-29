package WebApp.controller;

import com.google.gson.Gson;

import WebApp.model.domain.Bebida;
import WebApp.model.domain.Comestivel;
import WebApp.service.ComestivelService;
import spark.Route;

public class ComestivelController {
	static ComestivelService comestivelService = new ComestivelService();
	// recuperar Comida
	public static Route obterLista = (req, resp) -> {
		String gson = new Gson().toJson(comestivelService.obterLista());
		// return clienteService.obterLista();
		return gson;
	};
	// incluir Comida
	public static Route incluir = (req, resp) -> {
		Comestivel parametro = new Gson().fromJson(req.body(), Comestivel.class);
		comestivelService.incluir(parametro);
		return parametro.getNome() + " incluído com sucesso.";
	};

	// excluir Comida
	public static Route excluir = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		String nome = comestivelService.obter(parametro).getNome();
		comestivelService.excluir(parametro);
		return  nome + " excluído com sucesso.";
	};

	// recuperar uma Comida
	public static Route obterPorId = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		String gson = new Gson().toJson(comestivelService.obter(parametro));
		return gson;
	};
	
	//recuperar comestíveis para html
	public static Route obterListaHtml = (req, resp) -> {
	    StringBuilder sb = new StringBuilder();
	    sb.append("<h2>Lista de Comestíveis Cadastrados:</h2><br>");
	    for (Comestivel comestivel  : comestivelService.obterLista()) {
	        sb.append("<p><strong>Id:</strong> " + comestivel.getId() + "<br>");
	        sb.append("<strong>Nome:</strong> " + comestivel.getNome() + "<br>");
	        sb.append("<strong>Tipo:</strong> " + comestivel.getTipo() + "<br>");
	        sb.append("<strong>Preço:</strong> R$" + comestivel.getPrecoVenda() + "</p><br>");
	        
	    }
	    sb.append("<ul><li><a href=\"/\">Voltar</a></li></ul>");
	    return sb.toString();
	};

}
