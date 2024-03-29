package WebApp.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EnderecoClient {
	public static String obterEnderecoPorCep(String cep) {
        try {
            // URL do serviço remoto
            URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Ler a resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Fechar a conexão
            connection.disconnect();

            // Retornar a resposta
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter endereço";
        }
    }
}
