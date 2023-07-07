import java.util.List;

public class Context {
	
	private SimpleStrategy simpleStrategy;
	private Strategy strategy;
	
	public Context(SimpleStrategy strategy) {
		this.simpleStrategy = strategy;
	}
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int getScore(List<Integer> dices) {
		return simpleStrategy.calculateSimpleScore(dices);	
	}
	
	public int getScore(List<Integer> dices, int point) {
		return strategy.calculateScore(dices, point);	
	}
}
