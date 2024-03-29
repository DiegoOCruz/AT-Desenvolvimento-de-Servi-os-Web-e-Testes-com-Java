package WebApp.loader;


import WebApp.model.domain.Cliente;
import WebApp.service.ClienteService;
import WebApp.service.EnderecoService;

public class ClienteLoader {
	public static void loalClientes() {
		EnderecoService enderecoService = new EnderecoService();

		
		ClienteService clienteService = new ClienteService();
		Cliente cliente1 = new Cliente(1, "João Silva", enderecoService.obter("16303-290"), "111111111");
		Cliente cliente2 = new Cliente(2, "Maria Santos", enderecoService.obter("16305-516"), "222222222");
		Cliente cliente3 = new Cliente(3, "Pedro Oliveira",enderecoService.obter("16300-025"), "333333333");
		Cliente cliente4 = new Cliente(4, "Ana Souza", enderecoService.obter("16300-045"), "444444444");
		Cliente cliente5 = new Cliente(5, "José Pereira", enderecoService.obter("16300-057"), "555555555");
		
		clienteService.incluir(cliente1);
		clienteService.incluir(cliente2);
		clienteService.incluir(cliente3);
		clienteService.incluir(cliente4);
		clienteService.incluir(cliente5);
		
//		System.out.println(clienteService.obterLista());
//		System.out.println("------------------------");
//		System.out.println(clienteService.obter(3));
	}
}
