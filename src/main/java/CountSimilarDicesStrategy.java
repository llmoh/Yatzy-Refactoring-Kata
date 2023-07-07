import java.util.List;

public class CountSimilarDicesStrategy implements Strategy {

	@Override
	public int calculateScore(List<Integer> combination, int key) {
		return combination.stream()
					      .filter(dice -> dice == key)
					      .mapToInt(Integer::valueOf)
					      .sum();
	}

}
