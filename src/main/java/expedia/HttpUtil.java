package expedia;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.javalite.http.Get;
import org.javalite.http.Http;

public class HttpUtil {

	//private String url ="https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	//private HashMap<String,String> params = new HashMap<String,String>();

	public static String doGetRequest(String url,Map<String,String> params){

		//HashMap<String,String> paramValue = getParams();
		for (String key : params.keySet()) {
			if(!"".equals((params.get(key)))){
				url = url.concat("&" + key +"="+ params.get(key)); 
			}
		}
		System.out.println("URL " + url);
		Get get = Http.get(url);
		return get.text();
	}

//	public static void main(String[] args) {
//		HttpUtil test  = new HttpUtil();
//		String s = test.getSearchResult();
//		System.out.println("Testing URL:" + s);
//			
//	}
	
//	public HashMap<String,String> getParams() {		
//		params.put("destinationName", "Amman");
//		params.put("lengthOfStay", "5");		
//		return params;
//	}
//
//	public void setParams(HashMap<String,String> params) {
//		this.params = params;
//	}

}
