import java.util.List;

public class Context {
	
	private SimpleStrategy simpleStrategy;
	private Strategy strategy;
	
	public Context(SimpleStrategy strategy) {
		super();
		this.simpleStrategy = strategy;
	}
	
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int getScore(List<Integer> dices) {
		return simpleStrategy.calculateScore(dices);	
	}
	
	public int getSimpleScore(List<Integer> dices, int point) {
		return strategy.calculateScore(dices, point);	
	}
	

}
