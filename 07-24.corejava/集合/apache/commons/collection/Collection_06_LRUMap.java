package apache.commons.collection;



import org.apache.commons.collections.map.LRUMap;


public class Collection_06_LRUMap {

	public static void main(String[] args) {
	
		LRUMap cache = new LRUMap(5);

		// Populate the cache with 5 stock prices
		cache.put(" MSFT ", new Float(0.03));
		cache.put(" TSC ", new Float(0.001));
		cache.put(" LU ", new Float(23.30));
		cache.put(" CSCO ", new Float(242.20));
		cache.put(" P ", new Float(10.23));
		// Now use some of the entries in the cache
//		Float cscoPrice = (Float) cache.get(" CSCO ");
//		Float msPrice = (Float) cache.get(" MSFT ");
//		Float tscPrice = (Float) cache.get(" TSC ");
//		Float luPrice = (Float) cache.get(" LU ");
//		Float pPrice = (Float) cache.get(" P ");
//		Float msPrice2 = (Float) cache.get(" MSFT ");

		// Add another price to the Map, this should kick out the LRU item.
		cache.put(" AA ", new Float(203.20));
		
		
		
		System.out.println(cache);
	}
}
