package expedia;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class SearchService {

	public static String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	
	
	public static void main(String[] args) {
		port(8080);
		staticFiles.location("/public");
		
		post("/search", (request, response) -> {
			Map<String, String> params = new HashMap<>();//will contain all the data
			request.queryParams().forEach(k ->
				{
					String value = request.queryParams(k);
					if (value != null && !value.isEmpty()) {
						params.put(k, value);
					}
				});	
			params.forEach((k, v) -> System.out.println(k + " - " + v));			
			String result = HttpUtil.doGetRequest(url,params);
			return result;
		}); 
	}

}

