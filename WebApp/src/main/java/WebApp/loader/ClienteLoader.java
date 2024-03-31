package WebApp.loader;


import WebApp.model.domain.Cliente;
import WebApp.service.ClienteService;
import WebApp.service.EnderecoService;

public class ClienteLoader {
	public static void loalClientes() {
		
		Cliente cliente1 = new Cliente(1, "João Silva", EnderecoService.obter("16303-290"), "111111111");
		Cliente cliente2 = new Cliente(2, "Maria Santos", EnderecoService.obter("16305-516"), "222222222");
		Cliente cliente3 = new Cliente(3, "Pedro Oliveira",EnderecoService.obter("16300-025"), "333333333");
		Cliente cliente4 = new Cliente(4, "Ana Souza", EnderecoService.obter("16300-045"), "444444444");
		Cliente cliente5 = new Cliente(5, "José Pereira", EnderecoService.obter("16300-057"), "555555555");
		
		ClienteService.incluir(cliente1);
		ClienteService.incluir(cliente2);
		ClienteService.incluir(cliente3);
		ClienteService.incluir(cliente4);
		ClienteService.incluir(cliente5);
		
//		System.out.println(clienteService.obterLista());
//		System.out.println("------------------------");
//		System.out.println(clienteService.obter(3));
	}
}
