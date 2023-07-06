import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class StraightStrategy implements Strategy {
	
	private static final int MAX_GROUPS = 5;
	private static final int SCORE = 5;
	
	
	@Override
	public int calculateScore(List<Integer> combination, int key) {
		Map<Integer, Integer> map = new TreeMap<>();
		combination.stream()
		           .forEach(dice -> {
		        	   map.computeIfAbsent(dice, s-> 0);
		        	   map.computeIfPresent(dice, (k,v)-> v+1);      	   
		           });
		
		if(map.size() < key) return 0;
		
		for(int index=1; index <= MAX_GROUPS - key + 2  ; index++) {
			
		  boolean perfectMatch = IntStream.range(index, index + key - 1)
		                                  .allMatch(value -> map.keySet().contains(value));
		  if (perfectMatch) return SCORE * (key-1);
		}
		
		return 0;
	}

}
