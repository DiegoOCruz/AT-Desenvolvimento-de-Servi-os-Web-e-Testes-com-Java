package WebApp.loader;

import com.google.gson.Gson;	

import WebApp.client.EnderecoClient;
import WebApp.model.domain.Endereco;
import WebApp.service.EnderecoService;

public class EnderecoLoader {
	public static void enderecoLoad() {
		EnderecoService enderecoService = new EnderecoService();
		EnderecoClient enderecoClient = new EnderecoClient();

				
		Endereco endereco1 = new Gson().fromJson(enderecoClient.obterEnderecoPorCep("16303-290"), Endereco.class);
		Endereco endereco2 = new Gson().fromJson(enderecoClient.obterEnderecoPorCep("16305-516"), Endereco.class);
		Endereco endereco3 = new Gson().fromJson(enderecoClient.obterEnderecoPorCep("16300-025"), Endereco.class);
		Endereco endereco4 = new Gson().fromJson(enderecoClient.obterEnderecoPorCep("16300-045"), Endereco.class);
		Endereco endereco5 = new Gson().fromJson(enderecoClient.obterEnderecoPorCep("16300-057"), Endereco.class);

		enderecoService.incluir(endereco1);
		enderecoService.incluir(endereco2);
		enderecoService.incluir(endereco3);
		enderecoService.incluir(endereco4);
		enderecoService.incluir(endereco5);
		
//		System.out.println(enderecoService.obterLista());
//		System.out.println("------------------------");
	}
}
