import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@DisplayName(value = "Test Yatzy Game")
@TestMethodOrder(OrderAnnotation.class)
public class YatzyTest {

    @DisplayName("Test Chance Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/chance-data.csv", numLinesToSkip = 1)
    @Order(10)
    public void chanceCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).chance());
    }

    @DisplayName("Test Yatzy Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/yatzy-data.csv", numLinesToSkip = 1) 
    @Order(20)
    public void yatzyCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).yatzy());
    }

    @DisplayName("Test Ones Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/ones-data.csv", numLinesToSkip = 1)  
    @Order(30)
    public void onesCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).ones());
    }

    @DisplayName("Test Twos Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/twos-data.csv", numLinesToSkip = 1) 
    @Order(40)
    public void twosCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).twos());
    }

    @DisplayName("Test Threes Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/threes-data.csv", numLinesToSkip = 1) 
    @Order(50)
    public void threesCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).threes());
    }

    @DisplayName("Test Fours Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/fours-data.csv", numLinesToSkip = 1)
    @Order(60)
    public void foursCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5){
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).fours());
    }

    @DisplayName("Test Fives Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/fives-data.csv", numLinesToSkip = 1) 
    @Order(70)
    public void fivesCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).fives());
    }

    @DisplayName("Test Sixes Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/sixes-data.csv", numLinesToSkip = 1) 
    @Order(80)
    public void sixesCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).sixes());
    }

    @DisplayName("Test One Pair Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/onepair-data.csv", numLinesToSkip = 1)
    @Order(90)
    public void onePairCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).scorePair());
    }

    @DisplayName("Test Two Pair Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/twopair-data.csv", numLinesToSkip = 1) 
    @Order(100)
    public void twoPairCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).twoPair());
    }

    @DisplayName("Test Three Of a Kind Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/threekind-data.csv", numLinesToSkip = 1) 
    @Order(110)
    public void threeOfAkindCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).threeOfAKind());
    }

    @DisplayName("Test Four Of a Kind Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/fourkind-data.csv", numLinesToSkip = 1) 
    @Order(120)
    public void fourOfAKindCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).fourOfAKind());
    }

    @DisplayName("Test Small Straight Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/sm-straight-data.csv", numLinesToSkip = 1) 
    @Order(130)
    public void smallStraightCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).smallStraight());
    }

    @DisplayName("Test Large Straight Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/lg-straight-data.csv", numLinesToSkip = 1) 
    @Order(140)
    public void largeStraightCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).largeStraight());
    }

    @DisplayName("Test Full House Category")
    @ParameterizedTest(name = "Test N°{index} => ExpectedScore= {0}, dices=[{1},{2},{3},{4},{5}]")
    @CsvFileSource(resources = "/fullhouse-data.csv", numLinesToSkip = 1) 
    @Order(150)
    public void fullHouseCategoryTest(int expectedScore, int d1, int d2, int d3, int d4, int d5) {
    	assertEquals(expectedScore, new Yatzy(d1,d2,d3,d4,d5).fullHouse());
    }
    
    @DisplayName("Test Invalid Dices Scores")
    @ParameterizedTest(name = "Test N°{index} => dices=[{0},{1},{2},{3},{4}]")
    @CsvFileSource(resources = "/invalid-data.csv", numLinesToSkip = 1) 
    @Order(160)
    public void invalidDiceScoreTest(int d1, int d2, int d3, int d4, int d5) {
    	assertThrows(IllegalArgumentException.class, ()->{ new Yatzy(d1,d2,d3,d4,d5); });
    }
    
    @DisplayName("Test illegal arguments On Game Strategies")
    @Test
    @Order(170)
    public void illegalArgumentOnStrategyTest() {
    	List<Integer> dicesCombination = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    	assertThrows(IllegalArgumentException.class, ()->{ 
    		                                                Context ctx = new Context(new PairStrategy());
                                                            ctx.getScore(dicesCombination, DicesScore.THREE.value); });
    	
    	assertThrows(IllegalArgumentException.class, ()->{ 
												            Context ctx = new Context(new OfAKindStrategy());
												            ctx.getScore(dicesCombination, DicesScore.TWO.value); });
    	
    	assertThrows(IllegalArgumentException.class, ()->{ 
												            Context ctx = new Context(new StraightStrategy());
												            ctx.getScore(dicesCombination, DicesScore.TWO.value); });
    }
    
    
}
