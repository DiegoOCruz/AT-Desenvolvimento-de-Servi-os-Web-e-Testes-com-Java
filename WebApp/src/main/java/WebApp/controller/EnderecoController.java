package WebApp.controller;	


import com.google.gson.Gson;

import WebApp.model.domain.Comestivel;
import WebApp.model.domain.Endereco;
import WebApp.service.EnderecoService;
import spark.Route;

public class EnderecoController {
	static EnderecoService enderecoService = new EnderecoService();
	//recuperar Enderecos
		public static Route obterLista = (req, resp) -> {
			String gson = new Gson().toJson(enderecoService.obterLista());
			return gson;
		};
		//incluir Enderecos
		public static Route incluir = (req, resp) -> {
			Endereco parametro = new Gson().fromJson(req.body(), Endereco.class);
			enderecoService.incluir(parametro);
			return "Endereço " + parametro.getLocalidade() + " incluído com sucesso.";
		};
		
		//excluir Enderecos
		public static Route excluir = (req, resp) -> {
			String parametro =req.params("cep");
			String localidade = enderecoService.obter(parametro).getLocalidade();
			enderecoService.excluir(parametro);
			return "Endereço " + localidade + " excluído com sucesso.";
		};
		
		//recuperar um Endereco
		public static Route obterPorId = (req, resp) -> {
			String parametro = req.params("cep");
			String gson = new Gson().toJson(enderecoService.obter(parametro));
			return gson;
		};
		
		//recuperar endereços para html
		public static Route obterListaHtml = (req, resp) -> {
		    StringBuilder sb = new StringBuilder();
		    sb.append("<h2>Lista de Endereços Cadastrados:</h2><br>");
		    for (Endereco endereco  : enderecoService.obterLista()) {
		        sb.append("<p><strong>CEP:</strong> " + endereco.getCep() + "<br>");
		        sb.append("<strong>Logradouro: </strong>" + endereco.getLogradouro() + "<br>");
		        sb.append("<strong>Bairro: </strong>" + endereco.getBairro() + "<br>");
		        sb.append("<strong>Localidade: </strong>" + endereco.getLocalidade() + "<br>");
		        sb.append("<strong>UF: </strong>" + endereco.getUf() + "<br>");
		        
		    }
		    sb.append("<ul><li><a href=\"/\">Voltar</a></li></ul>");
		    return sb.toString();
		};
	
}

