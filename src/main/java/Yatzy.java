import java.util.ArrayList;
import java.util.List;

public class Yatzy {
	
	private List<Integer> dicesCombination = new ArrayList<>();
	private static final int MAX_SCORE = 6;
	private static final int MIN_SCORE = 1;
    
    public Yatzy(int d1, int d2, int d3, int d4, int d5)
    {
    	if( !validateDiceScore(d1) || !validateDiceScore(d2) ||!validateDiceScore(d3) 
    			                   ||!validateDiceScore(d4) || !validateDiceScore(d5)) {
    		String exceptionMessage = String.format("Dices score can only have values between %s and %s", MIN_SCORE, MAX_SCORE);
    		throw new IllegalArgumentException(exceptionMessage);
    	}
    	
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
        return ctx.getScore(dicesCombination, DicesScore.ONE.value);
    }

    public int twos() {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getScore(dicesCombination, DicesScore.TWO.value);
    }

    public int threes() {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getScore(dicesCombination, DicesScore.THREE.value);
    }

    public int fours()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int fives()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getScore(dicesCombination, DicesScore.FIVE.value);
    }

    public int sixes()
    {
    	Context ctx = new Context(new CountSimilarDicesStrategy());
        return ctx.getScore(dicesCombination, DicesScore.SIX.value);
    }

    public int scorePair()
    {
    	Context ctx = new Context(new PairStrategy());
        return ctx.getScore(dicesCombination, DicesScore.ONE.value);
    }

    public int twoPair()
    {
    	Context ctx = new Context(new PairStrategy());
        return ctx.getScore(dicesCombination, DicesScore.TWO.value);
    }

    public int fourOfAKind()
    {
    	Context ctx = new Context(new OfAKindStrategy());
        return ctx.getScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int threeOfAKind()
    {
    	Context ctx = new Context(new OfAKindStrategy());
        return ctx.getScore(dicesCombination, DicesScore.THREE.value);
    }

    public int smallStraight()
    {
    	Context ctx = new Context(new StraightStrategy());
        return ctx.getScore(dicesCombination, DicesScore.FOUR.value);
    }

    public int largeStraight()
    {
    	Context ctx = new Context(new StraightStrategy());
        return ctx.getScore(dicesCombination, DicesScore.FIVE.value);
    }

    public int fullHouse()
    {
        Context ctx = new Context(new FullHouseStrategy());
        return ctx.getScore(dicesCombination);
    }
    
    private boolean validateDiceScore(int diceScore) {	
		return diceScore >= MIN_SCORE && diceScore <= MAX_SCORE ? true : false;
	}
}



