import java.util.List;

public class ChanceStrategy implements SimpleStrategy {

	@Override
	public int calculateSimpleScore(List<Integer> combination) {
		return combination.stream()
		            .mapToInt(Integer::valueOf)
		            .sum();	
	}
}
