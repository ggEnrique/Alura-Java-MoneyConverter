import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarExchange {

    public Exchange exchangeRate(String base_code, String target_code, double amount){
        URI apiUrl = URI.create("https://v6.exchangerate-api.com/v6/c85654ae1b1d49bae159a42b/pair/" + base_code +"/"+ target_code+ "/"+ amount);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(apiUrl).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Exchange.class);
        } catch (Exception e){
            throw new RuntimeException("Error");
        }

    }
}
