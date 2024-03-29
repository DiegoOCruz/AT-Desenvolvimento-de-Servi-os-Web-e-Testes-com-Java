package WebApp.loader;

import WebApp.model.domain.Pedido;
import WebApp.service.BebidaService;
import WebApp.service.ClienteService;
import WebApp.service.ComestivelService;
import WebApp.service.PedidoService;

public class PedidosLoader {
	public static void loadPedidos() {
		PedidoService pedidoService = new PedidoService();
		ClienteService clienteService = new ClienteService();
		BebidaService bebidaService = new BebidaService();
		ComestivelService comestivelService = new ComestivelService();
		
        // Criando e incluindo o primeiro pedido
        Pedido p1 = new Pedido(1);
        p1.setCliente(clienteService.obter(1));
        p1.adicionarItem(1, bebidaService.obter(1));
        p1.adicionarItem(2, bebidaService.obter(2));
        p1.adicionarItem(3, comestivelService.obter(1));
        p1.adicionarItem(4, comestivelService.obter(2));
        pedidoService.incluir(p1);

        // Criando e incluindo o segundo pedido
        Pedido p2 = new Pedido(2);
        p2.setCliente(clienteService.obter(2));
        p2.adicionarItem(5, bebidaService.obter(3));
        p2.adicionarItem(6, bebidaService.obter(4));
        p2.adicionarItem(7, comestivelService.obter(3));
        p2.adicionarItem(8, comestivelService.obter(4));
        pedidoService.incluir(p2);

        // Criando e incluindo o terceiro pedido
        Pedido p3 = new Pedido(3);
        p3.setCliente(clienteService.obter(3));
        p3.adicionarItem(9, bebidaService.obter(5));
        p3.adicionarItem(10, bebidaService.obter(6));
        p3.adicionarItem(11, comestivelService.obter(5));
        p3.adicionarItem(12, comestivelService.obter(6));
        pedidoService.incluir(p3);

        // Criando e incluindo o quarto pedido
        Pedido p4 = new Pedido(4);
        p4.setCliente(clienteService.obter(4));
        p4.adicionarItem(13, bebidaService.obter(7));
        p4.adicionarItem(14, bebidaService.obter(8));
        p4.adicionarItem(15, comestivelService.obter(7));
        p4.adicionarItem(16, comestivelService.obter(8));
        pedidoService.incluir(p4);

        // Criando e incluindo o quinto pedido
        Pedido p5 = new Pedido(5);
        p5.setCliente(clienteService.obter(5));
        p5.adicionarItem(17, bebidaService.obter(9));
        p5.adicionarItem(18, bebidaService.obter(10));
        p5.adicionarItem(19, comestivelService.obter(9));
        p5.adicionarItem(20, comestivelService.obter(10));
        pedidoService.incluir(p5);

        // Exibindo os pedidos
//        System.out.println(pedidoService.obterLista());

	}
}
