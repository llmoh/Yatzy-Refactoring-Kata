import java.util.ArrayList;
import java.util.List;

public class Yatzy {
	
	private List<Integer> dicesCombination = new ArrayList<>();
    
    public Yatzy(int d1, int d2, int d3, int d4, int d5)
    {
        dicesCombination.add(d1);
        dicesCombination.add(d2);
        dicesCombination.add(d3);
        dicesCombination.add(d4);
        dicesCombination.add(d5);     
    }

    public int chance()
    {
        Context ctx = new Context(new ChanceStrategy());
        return ctx.getScore(dicesCombination);   	
    }

    public int yatzy()
    {
    	Context ctx = new Context(new YatzyStrategy());
        return ctx.getScore(dicesCombination);   
    }

    public int ones() {
    	
        Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.ONE.value);
    }

    public int twos() {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.TWO.value);
    }

    public int threes() {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.THREE.value);
    }

    public int fours()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int fives()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.FIVE.value);
    }

    public int sixes()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.SIX.value);
    }

    public int scorePair()
    {
    	Context ctx = new Context(new PairStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.ONE.value);
    }

    public int twoPair()
    {
    	Context ctx = new Context(new PairStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.TWO.value);
    }

    public int fourOfAKind()
    {
    	Context ctx = new Context(new OfAKindStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int threeOfAKind()
    {
    	Context ctx = new Context(new OfAKindStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.THREE.value);
    }

    public int smallStraight()
    {
    	Context ctx = new Context(new StraightStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int largeStraight()
    {
    	Context ctx = new Context(new StraightStrategy());
        return ctx.getSimpleScore(dicesCombination, DicesScore.FIVE.value);
    }

    public int fullHouse()
    {
        Context ctx = new Context(new FullHouseStrategy());
        return ctx.getScore(dicesCombination);
    }
}


