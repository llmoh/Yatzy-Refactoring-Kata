import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FullHouseStrategy implements SimpleStrategy {

	private static final int EXPECTED_GROUPS_COUNT = 2;
	private static final int EXPECTED_GROUPS_SIZE = 2;
	

	@Override
	public int calculateScore(List<Integer> combination) {
		
		Map<Integer, Integer> map = new TreeMap<>();
		combination.stream()
		           .forEach(dice -> {
		        	   map.computeIfAbsent(dice, s-> 0);
		        	   map.computeIfPresent(dice, (k,v)-> v+1);      	   
		           });
		
		if(map.size() != EXPECTED_GROUPS_COUNT) return 0;
		boolean perfectMatch = map.values()
				                  .stream()
				                  .anyMatch( value -> value == EXPECTED_GROUPS_SIZE || value == EXPECTED_GROUPS_SIZE + 1 );
		
		if (perfectMatch) {
          return combination.stream().mapToInt(Integer::valueOf).sum();  			
		}
			
		return 0;
	}

}
