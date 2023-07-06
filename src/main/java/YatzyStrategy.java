import java.util.List;

public class YatzyStrategy implements SimpleStrategy {
	
	private static final int MAX_SCORE = 50;

	@Override
	public int calculateScore(List<Integer> combination) {
		 
		long count = combination.stream()
					      .distinct()
					      .count();
		
		if(count == 1) return MAX_SCORE;
		return 0;
	}
}
