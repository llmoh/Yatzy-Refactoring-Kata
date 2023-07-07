import java.util.List;

public class YatzyStrategy implements SimpleStrategy {
	
	private static final int MAX_SCORE = 50;
	private static final int EXPECTED_GROUP_COUNT = 1;

	@Override
	public int calculateSimpleScore(List<Integer> combination) {
		 
		long count = combination.stream()
					      .distinct()
					      .count();
		
		if(count == EXPECTED_GROUP_COUNT) return MAX_SCORE;
		return 0;
	}
}
