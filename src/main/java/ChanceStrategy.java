import java.util.List;

public class ChanceStrategy implements SimpleStrategy {

	@Override
	public int calculateScore(List<Integer> combination) {
		return combination.stream()
		            .mapToInt(Integer::valueOf)
		            .sum();	
	}

}
