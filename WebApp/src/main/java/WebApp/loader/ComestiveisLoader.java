package WebApp.loader;

import WebApp.model.domain.Comestivel;
import WebApp.service.ComestivelService;

public class ComestiveisLoader {
	public static void loadComestiveis() {
		ComestivelService comestivelService = new ComestivelService();
		
        // Instanciando 10 comestíveis diferentes
        Comestivel c1 = new Comestivel(1, "Salgado de Frango", "2024-12-31", "Salgado", 3.50f);
        Comestivel c2 = new Comestivel(2, "Coxinha", "2024-11-30", "Salgado", 4.00f);
        Comestivel c3 = new Comestivel(3, "Pastel de Carne", "2024-10-31", "Salgado", 3.25f);
        Comestivel c4 = new Comestivel(4, "Pão de Queijo", "2025-06-30", "Salgado", 2.50f);
        Comestivel c5 = new Comestivel(5, "Torta de Frango", "2025-01-31", "Doce", 5.00f);
        Comestivel c6 = new Comestivel(6, "Barra de Cereal", "2024-09-30", "Doce", 1.50f);
        Comestivel c7 = new Comestivel(7, "Sanduíche Natural", "2024-12-31", "Salgado", 6.00f);
        Comestivel c8 = new Comestivel(8, "Bolinho de Chocolate", "2024-08-31", "Doce", 2.75f);
        Comestivel c9 = new Comestivel(9, "Salada de Frutas", "2025-03-31", "Doce", 4.50f);
        Comestivel c10 = new Comestivel(10, "Muffin de Blueberry", "2024-11-30", "Doce", 3.00f);

        // Adicionando os comestíveis ao serviço
        comestivelService.incluir(c1);
        comestivelService.incluir(c2);
        comestivelService.incluir(c3);
        comestivelService.incluir(c4);
        comestivelService.incluir(c5);
        comestivelService.incluir(c6);
        comestivelService.incluir(c7);
        comestivelService.incluir(c8);
        comestivelService.incluir(c9);
        comestivelService.incluir(c10);


//		System.out.println(comestivelService.obterLista());
//		System.out.println(comestivelService.obter(10));
	}
}
