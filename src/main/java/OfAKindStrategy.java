import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OfAKindStrategy implements Strategy {
	
	private static final int MAX_GROUPS = 5;
	
	@Override
	public int calculateScore(List<Integer> combination, int key) {
		
		if(key != MAX_GROUPS-2 && key != MAX_GROUPS-1) {
			String exceptionMessage = String.format("'key' argument cannot have different values than %s or %s.", MAX_GROUPS-2, MAX_GROUPS-1);
			throw new IllegalArgumentException(exceptionMessage);
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		combination.stream()
		           .forEach(dice -> {
		        	   map.computeIfAbsent(dice, s-> 0);
		        	   map.computeIfPresent(dice, (k,v)-> v+1);      	   
		           });
		
		if(map.size() > MAX_GROUPS - key + 1) return 0;
		
		for(Entry e : map.entrySet()) {
		  if((Integer) e.getValue() >= key) {			  
			  return (Integer) e.getKey() * key;
		  }
		}
		
		return 0;
	}

}
