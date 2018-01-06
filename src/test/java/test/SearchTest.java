package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import expedia.HttpUtil;

public class SearchTest {
	
	public static String url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	
	private Map<String,String> params = new HashMap<>();

	@Test
	public void testSearchApi(){
		
		String result = HttpUtil.doGetRequest(url, params);
		System.out.println("Result Without Param: " + result);
	}
	
	@Test
	public void testSearchApiWthParam(){
		
		
		params.put("destinationCity", "Amman");		
		String result = HttpUtil.doGetRequest(url, params);
		System.out.println("Result With Param: " + result);
	}
	
}
