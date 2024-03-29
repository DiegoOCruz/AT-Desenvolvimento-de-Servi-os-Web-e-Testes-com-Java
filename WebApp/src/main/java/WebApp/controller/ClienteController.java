package WebApp.controller;

import com.google.gson.Gson;

import WebApp.model.domain.Cliente;	
import WebApp.service.ClienteService;
import spark.Route;

public class ClienteController{
	static ClienteService clienteService = new ClienteService();
	//recuperar cliente
		public static Route obterLista = (req, resp) -> {
			String gson = new Gson().toJson(clienteService.obterLista());
			//return clienteService.obterLista();
			return gson;
		};
		//incluir cliente
		public static Route incluir = (req, resp) -> {
			Cliente parametro = new Gson().fromJson(req.body(), Cliente.class);
			clienteService.incluir(parametro);
			return parametro.getNome() + " incluído com sucesso.";
		};
		
		//excluir cliente
		public static Route excluir = (req, resp) -> {
			Integer parametro =Integer.valueOf(req.params("id"));
			String nome = clienteService.obter(parametro).getNome();
			clienteService.excluir(parametro);
			return "Cliente " + nome + " excluído com sucesso.";
		};
		
		//recuperar um cliente
		public static Route obterPorId = (req, resp) -> {
			Integer parametro =Integer.valueOf(req.params("id"));
			String gson = new Gson().toJson(clienteService.obter(parametro));
			return gson;
		};
		
		//recuperar cliente para html
		public static Route obterListaHtml = (req, resp) -> {
		    StringBuilder sb = new StringBuilder();
		    sb.append("<h2>Lista de Clientes Cadastrados:</h2><br>");
		    for (Cliente cliente  : clienteService.obterLista()) {
		        sb.append("<p><strong>Id:</strong> " + cliente.getId() + "<br>");
		        sb.append("<strong>Nome:</strong> " + cliente.getNome() + "<br>");
		        sb.append("<strong>Endereço:</strong><br>");
		        sb.append("CEP: " + cliente.getEndereco().getCep() + "<br>");
		        sb.append("Logradouro: " + cliente.getEndereco().getLogradouro() + "<br>");
		        sb.append("Bairro: " + cliente.getEndereco().getBairro() + "<br>");
		        sb.append("Localidade: " + cliente.getEndereco().getLocalidade() + "<br>");
		        sb.append("UF: " + cliente.getEndereco().getUf() + "<br>");
		        sb.append("<strong>Telefone:</strong> " + cliente.getTelefone() + "</p><br>");
		        
		    }
		    sb.append("<ul><li><a href=\"/\">Voltar</a></li></ul>");
		    return sb.toString();
		};

}

	

