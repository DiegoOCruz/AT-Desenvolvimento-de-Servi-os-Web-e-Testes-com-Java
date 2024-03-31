package WebApp.loader;

import WebApp.model.domain.Bebida;
import WebApp.service.BebidaService;

public class BebidaLoader {
	public static void loalBebidas() {

		Bebida bebida1 = new Bebida(1, "Refrigerante de Cola", "2024-12-31", "Refrigerante", false, 2.50f);
		Bebida bebida2 = new Bebida(2, "Suco de Laranja", "2024-11-30", "Suco", false, 3.00f);
		Bebida bebida3 = new Bebida(3, "Cerveja Pilsen", "2024-10-31", "Cerveja", true, 2.75f);
		Bebida bebida4 = new Bebida(4, "Vinho Tinto", "2025-06-30", "Vinho", true, 10.50f);
		Bebida bebida5 = new Bebida(5, "Água Mineral", "2025-01-31", "Água", false, 1.00f);
		Bebida bebida6 = new Bebida(6, "Energético", "2024-09-30", "Energético", false, 4.50f);
		Bebida bebida7 = new Bebida(7, "Vodka", "2024-12-31", "Destilado", true, 15.00f);
		Bebida bebida8 = new Bebida(8, "Chá Gelado de Pêssego", "2024-08-31", "Chá", false, 2.75f);
		Bebida bebida9 = new Bebida(9, "Cachaça Artesanal", "2025-03-31", "Cachaça", true, 8.50f);
		Bebida bebida10 = new Bebida(10, "Gin", "2024-11-30", "Destilado", true, 12.00f);

		BebidaService.incluir(bebida1);
		BebidaService.incluir(bebida2);
		BebidaService.incluir(bebida3);
		BebidaService.incluir(bebida4);
		BebidaService.incluir(bebida5);
		BebidaService.incluir(bebida6);
		BebidaService.incluir(bebida7);
		BebidaService.incluir(bebida8);
		BebidaService.incluir(bebida9);
		BebidaService.incluir(bebida10);

//		System.out.println(bebidaService.obterLista());
//		System.out.println(bebidaService.obter(7));
	}
}
