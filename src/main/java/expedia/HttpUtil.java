package expedia;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.javalite.http.Get;
import org.javalite.http.Http;

public class HttpUtil {


	public static String doGetRequest(String url,Map<String,String> params){

		for (String key : params.keySet()) {
			if(!"".equals((params.get(key)))){
				url = url.concat("&" + key +"="+ params.get(key)); 
			}
		}
		System.out.println("URL " + url);
		Get get = Http.get(url);
		return get.text();
	}



}
