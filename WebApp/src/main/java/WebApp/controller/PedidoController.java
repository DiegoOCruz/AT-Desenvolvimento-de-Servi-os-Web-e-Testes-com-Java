package WebApp.controller;

import java.util.Map;

import com.google.gson.Gson;

import WebApp.model.domain.Pedido;
import WebApp.model.domain.Produto;
import WebApp.service.PedidoService;
import spark.Route;

public class PedidoController {
	static PedidoService pedidoService = new PedidoService();
	// recuperar Pedido
	public static Route obterLista = (req, resp) -> {
		String gson = new Gson().toJson(pedidoService.obterLista());
		// return clienteService.obterLista();
		return gson;
	};
	// incluir Pedido
	public static Route incluir = (req, resp) -> {
		Pedido parametro = new Gson().fromJson(req.body(), Pedido.class);
		pedidoService.incluir(parametro);
		return parametro.getId() + " incluído com sucesso.";
	};

	// excluir Pedido
	public static Route excluir = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		pedidoService.excluir(parametro);
		return "Pedido n. " + parametro + " excluído com sucesso.";
	};

	// recuperar um Pedido
	public static Route obterPorId = (req, resp) -> {
		Integer parametro = Integer.valueOf(req.params("id"));
		String gson = new Gson().toJson(pedidoService.obter(parametro));
		return gson;
	};

	public static Route obterListaHtml = (req, resp) -> {
		StringBuilder sb = new StringBuilder();
		sb.append("<h2>Lista de Pedidos:</h2><br>");
		for (Pedido pedido : pedidoService.obterLista()) {
			sb.append("<p><strong>ID do Pedido:</strong> " + pedido.getId() + "<br>");
			sb.append("<strong>Cliente:</strong> " + pedido.getCliente().getNome() + "<br>");
			sb.append("<strong>Itens:</strong><br>");

			for (Map.Entry<Integer, Produto> entry : pedido.getItens().entrySet()) {
				Produto item = entry.getValue();
				sb.append("Id: " + item.getId() + " - ");
				sb.append("Item: " + item.getNome() + " - ");
				sb.append("Preço: " + item.getPreco() + "<br>");
			}

			sb.append("<strong>Valor Total:</strong> R$ " + pedido.getValorTotal() + "</p><br>");

		}
		sb.append("<ul><li><a href=\"/\">Voltar</a></li></ul>");
		return sb.toString();
	};

}
