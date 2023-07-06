import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class PairStrategy implements Strategy {
	
	private static final int MAX_GROUPS = 5;
	private static final int PAIR = 2;

	@Override
	public int calculateScore(List<Integer> combination, int key) {
		
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
		combination.stream()
		           .forEach(dice -> {
		        	   map.computeIfAbsent(dice, s-> 0);
		        	   map.computeIfPresent(dice, (k,v)-> v+1);      	   
		           });
		
		if(map.size() > MAX_GROUPS - key) return 0;
		
		int countPair = 0;
		int score = 0;
		
		for(Entry e : map.entrySet()) {
		  if((Integer) e.getValue() >= PAIR) {			  
			  countPair ++;
			  score+= (int) e.getKey();
		  }
		  
		  if(countPair >= key) return score * 2;
		}
		
		return 0;
	}

}
