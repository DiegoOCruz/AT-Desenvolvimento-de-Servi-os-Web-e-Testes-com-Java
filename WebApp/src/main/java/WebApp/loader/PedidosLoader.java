package WebApp.loader;

import WebApp.model.domain.Pedido;
import WebApp.service.BebidaService;
import WebApp.service.ClienteService;
import WebApp.service.ComestivelService;
import WebApp.service.PedidoService;

public class PedidosLoader {
	public static void loadPedidos() {

		
        // Criando e incluindo o primeiro pedido
        Pedido p1 = new Pedido(1);
        p1.setCliente(ClienteService.obter(1));
        p1.adicionarItem(1, BebidaService.obter(1));
        p1.adicionarItem(2, BebidaService.obter(2));
        p1.adicionarItem(3, ComestivelService.obter(1));
        p1.adicionarItem(4, ComestivelService.obter(2));
        PedidoService.incluir(p1);

        // Criando e incluindo o segundo pedido
        Pedido p2 = new Pedido(2);
        p2.setCliente(ClienteService.obter(2));
        p2.adicionarItem(5, BebidaService.obter(3));
        p2.adicionarItem(6, BebidaService.obter(4));
        p2.adicionarItem(7, ComestivelService.obter(3));
        p2.adicionarItem(8, ComestivelService.obter(4));
        PedidoService.incluir(p2);

        // Criando e incluindo o terceiro pedido
        Pedido p3 = new Pedido(3);
        p3.setCliente(ClienteService.obter(3));
        p3.adicionarItem(9, BebidaService.obter(5));
        p3.adicionarItem(10, BebidaService.obter(6));
        p3.adicionarItem(11, ComestivelService.obter(5));
        p3.adicionarItem(12, ComestivelService.obter(6));
        PedidoService.incluir(p3);

        // Criando e incluindo o quarto pedido
        Pedido p4 = new Pedido(4);
        p4.setCliente(ClienteService.obter(4));
        p4.adicionarItem(13, BebidaService.obter(7));
        p4.adicionarItem(14, BebidaService.obter(8));
        p4.adicionarItem(15, ComestivelService.obter(7));
        p4.adicionarItem(16, ComestivelService.obter(8));
        PedidoService.incluir(p4);

        // Criando e incluindo o quinto pedido
        Pedido p5 = new Pedido(5);
        p5.setCliente(ClienteService.obter(5));
        p5.adicionarItem(17, BebidaService.obter(9));
        p5.adicionarItem(18, BebidaService.obter(10));
        p5.adicionarItem(19, ComestivelService.obter(9));
        p5.adicionarItem(20, ComestivelService.obter(10));
        PedidoService.incluir(p5);

        // Exibindo os pedidos
//        System.out.println(pedidoService.obterLista());

	}
}
